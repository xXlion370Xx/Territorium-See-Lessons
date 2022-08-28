Feature: Consult lessons feature
  As a any person, an student could forget his credentials platform

  Scenario: See lessons
    Given The student is on the page territorium
    When The student enter his credential
      | Type document | Number document | password                |
      | TI            | 1031803334      | Dscr2005daniel51835436* |
    Then The student can to see his lessons