package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C35044DpA;
import X.C40006Fn0;
import X.C40007Fn1;
import X.C40008Fn2;
import X.C40009Fn3;
import X.C70657RoD;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.List;

/* loaded from: classes7.dex */
public class RegisterLifecycle implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "RegisterLifecycle";
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
        return EFK.MAIN;
    }

    public static String LIZLLL(Activity activity) {
        Fragment LJIILIIL = C70657RoD.LJIILIIL(activity);
        if (LJIILIIL != null) {
            return LJIILIIL.toString();
        }
        return activity.toString();
    }

    @Override // X.EEY
    public final void run(Context context) {
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(new C40006Fn0());
        application.registerActivityLifecycleCallbacks(C40007Fn1.LIZIZ.LIZJ());
        if (!C35044DpA.LIZ()) {
            application.registerActivityLifecycleCallbacks(new C40009Fn3());
        }
        application.registerActivityLifecycleCallbacks(new C40008Fn2(this));
    }
}
