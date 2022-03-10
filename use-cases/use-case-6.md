# USE CASE: 6 view an employee's details

## CHARACTERISTIC INFORMATION

### Goal in Context

As an *HR advisor* I want *view an employee's details* so that *the employee's promotion request can be supported.*

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the role.  Database contains current employee salary data.

### Success End Condition

A report is available for HR to provide to finance.

### Failed End Condition

No report is produced.

### Primary Actor

HR Advisor.

### Trigger

A request for finance information is sent to HR.

## MAIN SUCCESS SCENARIO

1. HR request employee information.
2. HR advisor extracts current information of employees.
3. HR advisor recieves a report choosing whether or not to promote employee.

## EXTENSIONS

3. **Role does not exist**:
    1. HR advisor informs finance no role exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0