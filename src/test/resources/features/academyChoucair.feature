#//DAJ.

  @stories
  Feature: Utest.com
    I want to register as a user in UTest.com, the largest community of testers in the world

  @Scenario1
  Scenario: Register on the website

    Given Diego wants to create a user on Utest.com

    When He logs in Join Today to register as user
      | strName         | strLastName         | strEmail             | strCity | strZip | strPassword   | strPassword2  |
      | Diego Jaramillo | Jaramillo Jaramillo | diegoajj@gmail.com   | Mede    | 050011 | 1037647480.Dj | 1037647480.Dj |

    Then He registers as a new Utest.com user
      | strWelcome              |
      | Welcome to the world's largest community of freelance software testers! |
