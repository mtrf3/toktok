package com.ss.android.ugc.aweme.utils;

import X.C0RN;
import X.C35337Dtt;
import X.C36509EUn;
import X.C63081OpJ;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FKM;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes7.dex */
public class WebViewPreInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "WebViewPreInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EE1
    public final EFK type() {
        if (((Boolean) C35337Dtt.LIZ.getValue()).booleanValue()) {
            return EFK.BOOT_FINISH;
        }
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        Method method;
        try {
            SystemClock.elapsedRealtime();
            Class<?> cls = Class.forName("android.webkit.WebViewFactory");
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                if (TextUtils.equals(method.getName(), "getProvider")) {
                    break;
                } else {
                    i++;
                }
            }
            method.setAccessible(true);
            C36509EUn.LIZ(cls, method, new Object[0]);
        } catch (Throwable unused) {
        }
        try {
            C63081OpJ.LIZLLL(FKM.LIZ());
        } catch (Throwable unused2) {
        }
    }
}
