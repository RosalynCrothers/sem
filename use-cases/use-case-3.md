# USE CASE: 3 produce a report on the salary of employees in my department

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *department manager* I want *produce a report on the salary of employees in my department* so that *I can support financial reporting for my department.*

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the department.  Database contains current employee salary data.

### Success End Condition

A report is available for HR to provide to finance.

### Failed End Condition

No report is produced.

### Primary Actor

department manager.

### Trigger

A request for finance information is sent to HR.

## MAIN SUCCESS SCENARIO

1. Finance request salary information.
2. department manager extracts current salary information of all employees.
3. Department manager provides report to finance.

## EXTENSIONS

3. **Role does not exist**:
    1. Department manager informs finance no role exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
