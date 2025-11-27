# gh-deployment-workflow
# 🚀 GitHub Actions CI/CD Project — Deploy Static Website to GitHub Pages 
https://roadmap.sh/projects/github-actions-deployment-workflow

This project demonstrates how to use **GitHub Actions** to automatically deploy a static website to **GitHub Pages** whenever the `index.html` file is updated.

---

# 📌 **Project Overview**

The goal of this project is to understand:

- Continuous Integration (CI)
- Continuous Deployment (CD)
- GitHub Actions workflow automation
- GitHub Pages hosting
- Using file-based triggers for deployments

We implement a workflow that deploys a website **only when `index.html` changes** on the `main` branch.

---

# 📁 **Project Structure**

```
gh-deployment-workflow/
│
├── index.html
├── README.md
└── .github/
    └── workflows/
        └── deploy.yml
```

---

# 🛠️ **Step 1: Create the Repository**

Create a new GitHub repository named:

```
gh-deployment-workflow
```

---

# 🌐 **Step 2: Add index.html**

Create a simple static site:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>GitHub Actions Deployment</title>
</head>
<body>
    <h1>Hello, GitHub Actions!</h1>
</body>
</html>
```

---

# 📝 **Step 3: Add the GitHub Actions Workflow**

Create the directory:

```
.github/workflows/deploy.yml
```

Add the following workflow:

```yaml
name: Deploy to GitHub Pages

on:
  push:
    branches:
      - main
    paths:
      - "index.html"   # Run ONLY when index.html changes

permissions:
  contents: read
  pages: write
  id-token: write

jobs:
  deploy:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout repository
        uses: actions/checkout@v4

      - name: Setup GitHub Pages
        uses: actions/configure-pages@v5

      - name: Upload artifact
        uses: actions/upload-pages-artifact@v3
        with:
          path: ./

      - name: Deploy to GitHub Pages
        uses: actions/deploy-pages@v4
```

---

# 🌍 **Step 4: Enable GitHub Pages**

1. Go to **Settings → Pages**
2. Under "Source", choose:
   ```
   GitHub Actions
   ```
3. Save

Your website will be deployed to:

```
https://<your-username>.github.io/gh-deployment-workflow/
```

---

# 🧪 **Testing the CI/CD Workflow**

After the setup, verify everything works correctly.

---

## ✅ **Test 1: Deployment Trigger Works**

1. Edit `index.html`  
2. Change text, for example:

```html
<h1>Hello, GitHub Actions! (Updated)</h1>
```

3. Commit to `main`

### Expected Result:
- GitHub Action runs automatically  
- Website updates with your new message  

---

## ❌ **Test 2: Deployment Should NOT Trigger**

1. Edit `README.md`  
2. Commit the change

### Expected Result:
- GitHub Action **should NOT run**
- No deployment triggered

This confirms your `paths:` filter is working.

---

## 🌐 **Test 3: Website Loads Correctly**

Visit:

```
https://<your-username>.github.io/gh-deployment-workflow/
```

Check that:

- It loads successfully  
- Displays the latest updated HTML  

If not updated, perform a hard refresh:

**Windows:** `Ctrl + Shift + R`  
**Mac:** `Cmd + Shift + R`

---

# ⭐ Stretch Goal (Optional)

Enhance this project by using a static site generator:

- Hugo  
- Jekyll  
- Astro  
- Eleventy  
- React Static  
- Next.js (Static Export)

This helps you build:

- Portfolio websites  
- Blogs  
- Personal documentation  

And deploy them via the same GitHub Actions pipeline.

---

# 🎯 **What You Learned**

By completing this project, you now understand:

✅ GitHub Actions basics  
✅ CI/CD automation  
✅ GitHub Pages deployments  
✅ Workflow triggers (`paths`, branches, jobs)  
✅ Debugging and testing CI/CD pipelines  

---

# 🎉 Final Result

You now have a **fully automated deployment pipeline** for a static website using GitHub Actions — just like real-world CI/CD systems.

If you want, I can also prepare:

- A video script for explaining the project  
- A workflow diagram  
- A more advanced version using Jekyll or Hugo  
- An advanced CI matrix pipeline  

Just tell me!
