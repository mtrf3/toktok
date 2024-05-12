package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C34710Djm;
import X.C35214Dru;
import X.C35335Dtr;
import X.C35820E4a;
import X.C37179EiV;
import X.C66851QLn;
import X.EE1;
import X.EFK;
import X.ETD;
import X.ETE;
import X.EUU;
import X.EUV;
import X.EUX;
import X.EV7;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCD;
import X.FKM;
import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Base64;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.sysoptimizer.ClearCacheOpt;
import com.bytedance.sysoptimizer.java.ReflectionUtils;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.legoImp.task.anr.AnrDispatchBoost;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes7.dex */
public class ColdBootInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ColdBootInitTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    public static void LJ() {
        try {
            long LIZJ = EV7.LIZJ();
            if (134217728 >= LIZJ) {
                EUX.LIZ.getValue().getClass();
                if (LIZJ > 67108864) {
                    if (((Boolean) C34710Djm.LJIILL.getValue()).booleanValue()) {
                        EV7.LIZ("above 64MB");
                    }
                } else if (((Boolean) C34710Djm.LJIILLIIL.getValue()).booleanValue()) {
                    EV7.LIZ("below 64MB");
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    public static void LIZLLL(Context context) {
        if (KevaImpl.getRepo("anr_dispatch_boost", 1).getBoolean("boost_enable", false) && FCD.LJI(context)) {
            AnrDispatchBoost.LIZIZ = false;
            if (AnrDispatchBoost.LIZ) {
                return;
            }
            AnrDispatchBoost.LIZ = true;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Field declaredField = cls.getDeclaredField("mH");
                declaredField.setAccessible(true);
                ReflectionUtils.removeFinal(declaredField);
                Field declaredField2 = cls.getDeclaredField("sCurrentActivityThread");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(null);
                if (obj == null) {
                    return;
                }
                Handler handler = (Handler) declaredField.get(obj);
                ReflectionUtils.changeField2Target(obj, declaredField, handler, new AnrDispatchBoost.DelegateInternalHandler(handler));
            } catch (Throwable unused) {
            }
        }
    }

    public static void LJII(Context context) {
        if (!FCD.LJI(context) || ((Number) C35335Dtr.LIZ.getValue()).intValue() <= 0 || ETE.LIZ) {
            return;
        }
        ETE.LIZ = true;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Field declaredField = cls.getDeclaredField("mH");
            declaredField.setAccessible(true);
            ReflectionUtils.removeFinal(declaredField);
            Field declaredField2 = cls.getDeclaredField("sCurrentActivityThread");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(null);
            if (obj == null) {
                return;
            }
            Handler handler = (Handler) declaredField.get(obj);
            ReflectionUtils.changeField2Target(obj, declaredField, handler, new ETD(handler));
        } catch (Throwable unused) {
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        try {
            LJ();
            LJII(context);
            LIZLLL(context);
            if (C35214Dru.LJI) {
                C37179EiV.LJFF.post(new ARunnableS42S0100000_6(context, 35));
            } else {
                ClearCacheOpt.fix(context);
            }
            C16880lQ.LLJJJIL("quick");
            C16880lQ.LLJJJIL("napi");
            EUU.LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("async_audio_opt_ab_enabled", false);
            C66851QLn.LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("audio_focus_opt_ab", false);
            AwemeHostApplication LIZ = FKM.LIZ();
            if (!EUV.LIZ && Build.VERSION.SDK_INT == 23 && C35820E4a.LIZIZ(LIZ, "tt_new_string_opt", false)) {
                try {
                    new String(Base64.decode("SGk=".getBytes("UTF-8"), 2));
                } catch (Exception unused) {
                }
                EUV.LIZ = true;
            }
        } catch (Throwable unused2) {
        }
    }
}
