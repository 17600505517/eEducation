package io.agora.education;

import android.app.Application;

import io.agora.base.LogManager;
import io.agora.base.PreferenceManager;
import io.agora.base.ToastManager;

public class EduApplication extends Application {

    public static Application context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = this;

        PreferenceManager.init(this);
        ToastManager.init(this);
        LogManager.setTagPre("education_");
    }

}
