package com.ss.android.ugc.aweme.app;

import X.C0RN;
import X.C35478DwA;
import X.C35666DzC;
import X.C36093EEn;
import X.C38805FKv;
import X.C40328FsC;
import X.C76800UCe;
import X.C88024Yge;
import X.DPI;
import X.DS1;
import X.E3H;
import X.EE1;
import X.EFK;
import X.EHL;
import X.EI0;
import X.EI5;
import X.EU2;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FJ4;
import X.FJU;
import X.FMR;
import X.FX1;
import X.InterfaceC39329Fc5;
import X.InterfaceC40105Fob;
import X.InterfaceC65784Pro;
import X.QQQ;
import Y.AObjectS56S0101000_13;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.requesttask.idle.FetchCommerceSettingRequest;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AwemeAppData extends FJU implements InterfaceC39329Fc5, InterfaceC40105Fob {
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    @Override // X.InterfaceC39329Fc5
    public final void LIZ() {
    }

    /* loaded from: classes7.dex */
    public class RedPointTask implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "AwemeAppData$RedPointTask";
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
            FX1.LIZIZ.LIZLLL();
        }
    }

    public static void LIZJ(AwemeAppData awemeAppData) {
        awemeAppData.getClass();
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZIZ(new RedPointTask(), true);
        LIZJ.LIZJ();
    }

    @Override // X.InterfaceC40105Fob
    public final void onActivityPaused(Activity activity) {
        QQQ.LIZJ(activity).onPause();
        o.LJIIIZ(activity, "activity");
        if (!FMR.LIZ.LIZIZ.get()) {
            return;
        }
        AppLog.onPause(activity);
    }

    @Override // X.InterfaceC40105Fob
    public final void onActivityResumed(Activity activity) {
        boolean booleanValue;
        boolean z = false;
        if (activity instanceof MainActivity) {
            if (DPI.LIZ()) {
                if (C35478DwA.LIZIZ() && DS1.LIZ()) {
                    booleanValue = true;
                } else {
                    booleanValue = false;
                }
            } else {
                booleanValue = ((Boolean) C88024Yge.LIZLLL.getValue()).booleanValue();
            }
            AObjectS56S0101000_13 aObjectS56S0101000_13 = new AObjectS56S0101000_13(1, this, 3);
            C38805FKv.LIZIZ(C38805FKv.LIZ, new C35666DzC("redpointtask_add_async", booleanValue, E3H.ASYNC, 0), null, new AqS156S0100000_6(aObjectS56S0101000_13, (InterfaceC65784Pro<C76800UCe>) 138), 2);
        }
        o.LJIIIZ(activity, "activity");
        if (!FJ4.LIZ) {
            FJ4.LIZIZ = new WeakReference<>(activity);
        } else if (FMR.LIZ.LIZIZ.get()) {
            AppLog.onResume(activity);
        }
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = activity instanceof MainActivity;
        Intent intent = activity.getIntent();
        try {
            this.LIZLLL = intent.getBooleanExtra("from_notification", false);
            Uri data = intent.getData();
            if (intent.getBooleanExtra("ads_app_activity_by_wap_click", false) || (data != null && UriProtector.getQueryParameter(data, "gd_label") != null && UriProtector.getQueryParameter(data, "gd_label").startsWith("click_wap"))) {
                z = true;
            }
            this.LJ = z;
        } catch (Exception unused) {
        }
        if (!EU2.LIZ() && !EI5.LIZ.LIZIZ()) {
            C36093EEn.LIZ.getClass();
            EHL ehl = new EHL();
            ehl.LIZIZ(new FetchCommerceSettingRequest(), true);
            ehl.LIZJ();
        }
    }
}
