package com.ss.android.ugc.awemepushlib.manager;

import X.C221018lt;
import X.C38995FSd;
import X.C40322Fs6;
import X.C58096Mr6;
import X.C61099NyR;
import X.C61100NyS;
import X.C76800UCe;
import X.C86780Y4a;
import X.C86784Y4e;
import X.DJA;
import X.InterfaceC65784Pro;
import X.LVY;
import X.X1D;
import X.Y4Z;
import Y.ARunnableS14S0210000_15;
import Y.ARunnableS34S0200000_15;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.ss.android.ugc.awemepushapi.mob.PushPermissionStatusEvent;
import com.ss.android.ugc.awemepushlib.experiments.PushPermissionPopupGuideExp;
import com.ss.android.ugc.awemepushlib.experiments.PushPermissionPopupTimingExp;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PushPermissionPopupManager implements IPushPermissionApi {
    public C86784Y4e LIZ;
    public ARunnableS14S0210000_15 LIZIZ;

    public static IPushPermissionApi LJII() {
        Object LIZ = C58096Mr6.LIZ(IPushPermissionApi.class, false);
        if (LIZ != null) {
            return (IPushPermissionApi) LIZ;
        }
        if (C58096Mr6.f87p8 == null) {
            synchronized (IPushPermissionApi.class) {
                if (C58096Mr6.f87p8 == null) {
                    C58096Mr6.f87p8 = new PushPermissionPopupManager();
                }
            }
        }
        return C58096Mr6.f87p8;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final int LJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getPushPermissionPopupTimingExpGroup(showTimes: ");
        LIZ.append(DJA.LIZ().getInt("nu_push_permission_popup_show_count", 0));
        LIZ.append(", group: ");
        PushPermissionPopupTimingExp pushPermissionPopupTimingExp = PushPermissionPopupTimingExp.INSTANCE;
        LIZ.append(pushPermissionPopupTimingExp.getGroup());
        LIZ.append(')');
        C221018lt.LIZ("PushPermissionPopup", X1D.LIZIZ(LIZ));
        return pushPermissionPopupTimingExp.getGroup();
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final void LIZIZ(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        DJA.LIZ().storeInt("system_push_permission_popup_show_count", DJA.LIZ().getInt("system_push_permission_popup_show_count", 0) + 1);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final void LIZJ(Activity activity) {
        C221018lt.LIZ("PushPermissionPopup", "tryShowCombinedPushPermissionPopup()");
        LJIIIIZZ(activity, true, null);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final int LIZLLL(Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getPushPermissionPopupTiming(showTimes: ");
        LIZ.append(DJA.LIZ().getInt("nu_push_permission_popup_show_count", 0));
        LIZ.append(", group: ");
        PushPermissionPopupTimingExp pushPermissionPopupTimingExp = PushPermissionPopupTimingExp.INSTANCE;
        LIZ.append(pushPermissionPopupTimingExp.getGroup());
        LIZ.append(')');
        C221018lt.LIZ("PushPermissionPopup", X1D.LIZIZ(LIZ));
        if (Build.VERSION.SDK_INT < 33 || C40322Fs6.LIZJ(context) || DJA.LIZ().getInt("nu_push_permission_popup_show_count", 0) > 0) {
            return pushPermissionPopupTimingExp.getDEFAULT();
        }
        return pushPermissionPopupTimingExp.getGroup();
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final boolean LJFF(Context context) {
        if (LIZLLL(context) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final int LJI(Context context) {
        return DJA.LIZ().getInt("system_push_permission_popup_show_count", 0);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final void LIZ(Activity act, LVY lvy) {
        C221018lt.LIZ("PushPermissionPopup", "checkAndTryShowPermissionPopupWithCallback()");
        if (act == null) {
            act = ActivityStack.getValidTopActivity();
        }
        o.LJIIIIZZ(act, "act");
        if (LIZLLL(act) > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("needShowPushPermissionPopup() - Timing ");
            LIZ.append(LIZLLL(act));
            C221018lt.LIZ("PushPermissionPopup", X1D.LIZIZ(LIZ));
            LJIIIIZZ(act, false, new AqS162S0200000_15(this, lvy, 1));
            return;
        }
        lvy.LIZ();
    }

    public final void LJIIIZ(Activity activity, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GuideExp.withGuideAndMask(");
        LIZ.append(PushPermissionPopupGuideExp.INSTANCE.withGuideAndMask());
        LIZ.append(')');
        C221018lt.LIZ("PushPermissionPopup", X1D.LIZIZ(LIZ));
        C38995FSd.LIZLLL().execute(new ARunnableS34S0200000_15(this, activity, 26));
        if (z) {
            return;
        }
        activity.runOnUiThread(new ARunnableS34S0200000_15(this, activity, 27));
    }

    public final void LJIIIIZZ(Activity activity, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Activity activity2;
        if (activity == null) {
            activity2 = ActivityStack.getValidTopActivity();
        } else {
            activity2 = activity;
        }
        PushPermissionStatusEvent pushPermissionStatusEvent = new PushPermissionStatusEvent();
        long currentTimeMillis = System.currentTimeMillis();
        if (activity2 != null) {
            C61099NyR LIZIZ = C61099NyR.LIZIZ.LIZIZ(activity2, TokenCert.Companion.with("bpea-push_permission_nuj_request"));
            C86780Y4a c86780Y4a = new C86780Y4a(pushPermissionStatusEvent, z, activity, this);
            C61100NyS c61100NyS = LIZIZ.LIZ;
            c61100NyS.LIZ(c86780Y4a);
            c61100NyS.LIZIZ("android.permission.POST_NOTIFICATIONS");
            c61100NyS.LIZJ(new Y4Z(this, pushPermissionStatusEvent, currentTimeMillis, activity2, interfaceC65784Pro));
        }
    }
}
