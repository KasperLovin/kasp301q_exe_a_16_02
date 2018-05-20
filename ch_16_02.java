import java.util.NoSuchElementException;

public class ch_16_02
{
    /*Write a method called max that returns the maximum value in a list of integers. If the list is empty, it should throw a
    NoSuchElementException.*/

    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        max(list);
        System.out.println(max(list));
    }

    public static int max(LinkedIntList liste)
    {
       if(liste.isEmpty())
       {
       throw new NoSuchElementException();
       }
       int container = 0;
        for (int i = 0; i < liste.size() ; i++)
        {
            if (liste.get(i)>container)
            {
                container = liste.get(i);
            }
        }
        return container;
    }
}
