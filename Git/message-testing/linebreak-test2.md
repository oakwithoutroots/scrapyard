Testing line breaks in Git Commits.
This test uses the following method in the console:

git commit -m "commit test
>
>commit test"

Result: Failed. Commit was one line, ">" is not a linebreak.
