/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflection;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;

/**
 *
 * @author k00194902
 */
public class Reflection
{

	public static void main(String[] args)
	{

		boolean data = true;
		try
		{
			File f = new File("Assets.files/Objects2.dat");
			if (!f.exists())
			{
				System.out.println("Can not find file!!");
			} else
			{
				FileInputStream FIS = new FileInputStream(f);
				ObjectInputStream OIS = new ObjectInputStream(FIS);

				while (data)
				{
					try
					{
						Object object = (Object) OIS.readObject();

						
						
						System.out.println(getClassFields(object.getClass()));
					} catch (EOFException end)
					{
						data = false;
					}
				}
			}
		} catch (Exception e)
		{
			
		}
	}

	public String getClassDetails(Class class_)
	{
		String text = "";
		return text;

	}

	public static String getClassFields(Class class_)
	{
		String text = "";
		for (Field field : class_.getDeclaredFields())
		{
			text += field.getType().getSimpleName()+ " " + field.getName() + ";" + System.lineSeparator();
		}
		return text;
	}

	public String getObjectFieldValue(Object object)
	{
		String text = "";
		return text;

	}
}
