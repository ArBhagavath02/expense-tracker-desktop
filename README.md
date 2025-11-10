# Personal Expense Tracker Desktop App

A simple, secure, and visually appealing desktop software for managing personal finances. Track income/expenses, categorize transactions, view analytics, and generate reports.

## Features (v1.0)
- Add, edit, delete income/expense transactions
- Categorize transactions (e.g., Food, Travel, Bills)
- View monthly/category-wise summaries
- Pie and bar chart visualization
- Export reports to PDF/Excel
- Secure password protection for single user

## Technologies
- Java (Swing or JavaFX)
- SQLite (local database)
- JFreeChart / JavaFX Charts (visualization)
- Apache POI (Excel export)
- iTextPDF (PDF generation)

## Project Structure
- `src/` - Main Java code
- `database/` - Database schema/sql
- `docs/` - Architecture/UI sketches, ER diagram
- `.gitignore` - Ignore platform and IDE files

## Getting Started
1. Install Java (JDK 11+)
2. Clone this repo
3. Run database/SCHEMA.sql to initialize DB
4. Build and run src/Main.java

## Timeline
| Phase                | Duration | Description                          |
|----------------------|----------|--------------------------------------|
| Requirement Analysis | 2 days   | Gather/finalize requirements         |
| Design               | 3 days   | UI, database, overall architecture   |
| Development          | 10 days  | Coding and integration               |
| Testing              | 3 days   | Functional & performance testing     |
| Documentation        | 2 days   | Guide and packaging                  |
