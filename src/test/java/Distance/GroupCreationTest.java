package Distance;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {

        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        returnToGroupPage();
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            selectGroup();
        }
    }

}