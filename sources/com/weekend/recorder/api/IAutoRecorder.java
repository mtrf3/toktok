package com.weekend.recorder.api;

import X.InterfaceC39580Fg8;
import X.InterfaceC59857NeP;
import android.app.Application;
import android.content.Context;

/* loaded from: classes11.dex */
public interface IAutoRecorder {
    boolean getWeekEndRecorderSwitch(Context context);

    void init(String str, String str2, Application application, InterfaceC59857NeP interfaceC59857NeP, InterfaceC39580Fg8 interfaceC39580Fg8);

    void setUserEmailPrefix(String str);

    void switchEnable(Context context, boolean z);
}
