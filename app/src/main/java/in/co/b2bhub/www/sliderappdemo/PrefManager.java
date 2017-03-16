package in.co.b2bhub.www.sliderappdemo;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by B2B Android on 2/7/2017.
 */

public class PrefManager
{
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;

    int Private_Mode=0;
    private static final String PREF_NAME="KARAN Welcomes you!";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    public PrefManager(Context context)
    {
        this.context = context;
        pref = context.getSharedPreferences(PREF_NAME, Private_Mode);
        editor = pref.edit();
    }
    public void setFirstTimeLaunch(boolean isFirstTime)
    {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }
    public boolean isFirstTimeLaunch()
    {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

}
