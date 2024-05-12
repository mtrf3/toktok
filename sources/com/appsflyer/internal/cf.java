package com.appsflyer.internal;

import android.content.Context;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class cf extends cl {
    public cf(String str, Runnable runnable) {
        super(str, runnable);
    }

    public final void valueOf(Context context, ax<Map<String, Object>> axVar) {
        ai.valueOf();
        if (ai.AFInAppEventParameterName(ai.values(context), "appsFlyerCount", false) > 0 || !axVar.AFInAppEventParameterName()) {
            return;
        }
        new PthreadThread(axVar.valueOf, "r/internal/cf").start();
        AFInAppEventType();
    }
}
