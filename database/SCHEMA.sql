-- SQLite schema for v1.0
CREATE TABLE IF NOT EXISTS transaction (
    trans_id INTEGER PRIMARY KEY AUTOINCREMENT,
    type TEXT NOT NULL, -- 'Income' or 'Expense'
    category TEXT NOT NULL,
    amount REAL NOT NULL,
    description TEXT,
    date TEXT NOT NULL -- ISO date string
);