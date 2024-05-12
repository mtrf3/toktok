package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.AV1;
import X.C10K;
import X.C16880lQ;
import X.C1GE;
import X.C221108m2;
import X.C278517l;
import X.C58271Mtv;
import X.C58727N3b;
import X.C58728N3c;
import X.C61878OQg;
import X.C62822Ol8;
import X.C62913Omb;
import X.C62914Omc;
import X.C63053Oor;
import X.C76800UCe;
import X.CallableC62940On2;
import X.CallableC62941On3;
import X.CallableC67126QWc;
import X.EF7;
import X.InterfaceC58286MuA;
import X.ORY;
import X.PY1;
import X.PY4;
import X.PYN;
import Y.ARunnableS10S1000000_4;
import Y.AgS113S0200000_10;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig;
import com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsSettingsServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public final class ChildModeServiceImpl implements IChildModeService {
    public Boolean LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C58271Mtv.LJLIL);

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final HeaderParamConfig LJIIJJI() {
        return C58727N3b.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIILL() {
        Context LIZIZ = EF7.LIZIZ();
        C63053Oor LIZ = C63053Oor.LIZIZ.LIZ(LIZIZ);
        TokenCert.Companion companion = TokenCert.Companion;
        LIZ.LIZ(companion.with("bpea-firebase_androidsdk_1997"), true);
        AppsFlyerLib.getInstance().stop(false, LIZIZ);
        TokenCert cert = companion.with("bpea-appsflyer_androidsdk_1962");
        o.LJIIIZ(cert, "cert");
        C1GE.LJIJJ(cert, "AppsFlyer", "start", new AqS161S0100000_11(LIZIZ, 83));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIJ() {
        Context LIZIZ = EF7.LIZIZ();
        C63053Oor.LIZIZ.LIZ(LIZIZ).LIZ(TokenCert.Companion.with("bpea-firebase_androidsdk_1996"), false);
        AppsFlyerLib.getInstance().stop(true, LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final InterfaceC58286MuA LIZ() {
        return (InterfaceC58286MuA) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final InterfaceC58286MuA LIZIZ() {
        return new PYN();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final boolean LIZJ() {
        C62914Omc c62914Omc = C62913Omb.LIZIZ;
        Boolean bool = c62914Omc.LJFF;
        if (bool == null && (bool = Boolean.valueOf(c62914Omc.LIZIZ.getBoolean("have_updated_and_checked", false))) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final boolean LJI() {
        if (this.LIZ == null) {
            this.LIZ = C278517l.LIZ("compliance_setting", "update_and_check_new_kids_mode", false);
        }
        Boolean bool = this.LIZ;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final InterfaceC58286MuA LJII() {
        return new PY1();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIIJ() {
        boolean z;
        C62914Omc c62914Omc = C62913Omb.LIZIZ;
        Boolean bool = Boolean.TRUE;
        c62914Omc.LJFF = bool;
        Keva keva = c62914Omc.LIZIZ;
        if (bool != null) {
            z = true;
        } else {
            z = false;
        }
        keva.storeBoolean("have_updated_and_checked", z);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final InterfaceC58286MuA LJIJI() {
        return new PY4();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final List<String> LJFF() {
        List<String> LJII = KidsSettingsServiceImpl.LJIIJJI().LJII();
        if (LJII == null) {
            return C61878OQg.INSTANCE;
        }
        return LJII;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final Set<String> LIZLLL() {
        return C62913Omb.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final C76800UCe LJ(String str) {
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS10S1000000_4(str, 1), 2000L);
        return C76800UCe.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIIIIZZ(C58728N3c c58728N3c) {
        C58727N3b.LIZJ(c58728N3c);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIIL(Context context) {
        C10K.LIZJ(CallableC62940On2.LJLIL).LJ(new AgS113S0200000_10(this, context, 0), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIILIIL(Context context) {
        if (context == null) {
            return;
        }
        C62914Omc c62914Omc = C62913Omb.LIZIZ;
        Boolean bool = c62914Omc.LIZLLL;
        boolean z = false;
        if ((bool == null && (bool = Boolean.valueOf(c62914Omc.LIZIZ.getBoolean("update_and_check_new_kids_mode", false))) == null) || !bool.booleanValue()) {
            Boolean bool2 = Boolean.TRUE;
            c62914Omc.LIZLLL = bool2;
            Keva keva = c62914Omc.LIZIZ;
            if (bool2 != null) {
                z = true;
            }
            keva.storeBoolean("update_and_check_new_kids_mode", z);
            if (AV1.LJIIJJI()) {
                a.LJI().LJIILJJIL(context);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIILJJIL(Context context) {
        o.LJIIIZ(context, "context");
        C10K.LIZJ(CallableC62941On3.LJLIL).LJ(new AgS113S0200000_10(this, context, 1), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIIZILJ(Context context) {
        o.LJIIIZ(context, "context");
        String packageName = context.getPackageName();
        o.LJIIIIZZ(packageName, "context.packageName");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            C16880lQ.LIZJ(context, launchIntentForPackage);
            Activity[] activityStack = ActivityStack.getActivityStack();
            o.LJIIIIZZ(activityStack, "getActivityStack()");
            for (Activity activity : ORY.LJJIJL(activityStack)) {
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            }
            Runtime.getRuntime().exit(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final boolean LJIIIZ(HeaderParamConfig headerParamConfig, String str) {
        return C58727N3b.LIZIZ(headerParamConfig, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
    public final void LJIILLIIL(Runnable runnable, boolean z) {
        C10K.LIZJ(new CallableC67126QWc(runnable, z));
    }
}
