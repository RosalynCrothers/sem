# USE CASE: 5 produce a report on the salary of employees in a department
## CHARACTERISTIC INFORMATION

### Goal in Context

As a *HR advisor* I want *produce a report on the salary of employees in a department* so that *I can support financial reporting of the organisation.*

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

HR Advisor.

### Trigger

A request for finance information is sent to HR.

## MAIN SUCCESS SCENARIO

1. Finance request salary information for a given department.
2. HR advisor extracts current salary information of all employees of the given department.
3. HR advisor provides report to finance.
## EXTENSIONS

3. **Role does not exist**:
    1. HR advisor informs finance no role exists.
## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0