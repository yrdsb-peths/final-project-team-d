public class Medal extends Actor
{  
    public void medalUpdate(int num)// A method that updates the image based on number parameters
    {
        if(num == 1) // 1 changes to bronze medal
        {
            setImage("images/medalE.png");
        }
        if(num == 2) // 2 changes to silver medal
        {
            setImage("images/medalM.png");
        }
        if(num == 3) // 3 changes to gold medal
        {
            setImage("images/medalH.png");
        }
    }
}
