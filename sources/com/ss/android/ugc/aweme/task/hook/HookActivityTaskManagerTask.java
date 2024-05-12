package com.ss.android.ugc.aweme.task.hook;

import X.C0RN;
import X.C36708Eau;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFL;
import X.X1D;
import android.content.Context;
import android.os.Build;
import com.ss.android.agilelogger.ALog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* loaded from: classes7.dex */
public class HookActivityTaskManagerTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "HookActivityTaskManagerTask";
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

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (Build.VERSION.SDK_INT <= 29) {
            return;
        }
        FFL.LJIIIZ().getClass();
        float LJIIIIZZ = FFL.LJIIIIZZ(31744, "background_activity_recycled_rate_ab", 0.0f);
        if (LJIIIIZZ <= 0.0f) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HookActivityTaskManager is disabled by ABtest value. releaseActivityRatio:");
            LIZ.append(LJIIIIZZ);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("HookATMTask", X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(" Replace IActivityTaskManager start releaseActivityRatio:");
        LIZ2.append(LJIIIIZZ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("HookATMTask", X1D.LIZIZ(LIZ2));
        try {
            Class<?> cls = Class.forName("android.app.ActivityTaskManager");
            Class<?> cls2 = Class.forName("android.util.Singleton");
            Field declaredField = cls.getDeclaredField("IActivityTaskManagerSingleton");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Method declaredMethod = cls2.getDeclaredMethod("get", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(obj, new Object[0]);
            if (invoke == null) {
                return;
            }
            Class<?> cls3 = Class.forName("android.app.IActivityTaskManager");
            Object newProxyInstance = Proxy.newProxyInstance(invoke.getClass().getClassLoader(), new Class[]{cls3}, new C36708Eau(invoke, LJIIIIZZ));
            Field declaredField2 = cls2.getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, newProxyInstance);
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" Replace IActivityTaskManager failed, ex:  ");
            LIZ3.append(e.getMessage());
            ALog.e("HookATMTask", X1D.LIZIZ(LIZ3), e);
        }
    }
}
