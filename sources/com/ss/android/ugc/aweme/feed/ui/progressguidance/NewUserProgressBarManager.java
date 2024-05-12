package com.ss.android.ugc.aweme.feed.ui.progressguidance;

import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C2NI;
import X.C2NK;
import X.C2NZ;
import X.C58096Mr6;
import X.C62822Ol8;
import X.FMX;
import X.HG3;
import X.RBX;
import X.X1D;
import Y.ARunnableS8S0000000_1;
import android.os.Handler;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.INewUserProgressBarService;
import defpackage.m0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NewUserProgressBarManager implements INewUserProgressBarService {
    public static String LIZ;
    public static String LIZIZ;
    public static C2NZ LIZJ;
    public static BaseListFragmentPanel LIZLLL;
    public static boolean LJI;
    public static int LJIIIIZZ;
    public static final Set<String> LJ = new LinkedHashSet();
    public static final Handler LJFF = new Handler(C16880lQ.LLJJJJ());
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C2NI.LJLIL);
    public static final ARunnableS8S0000000_1 LJIIJ = new ARunnableS8S0000000_1(2);
    public static int LJII = C2NK.LIZIZ().getInt("vv_count", 0);

    public static INewUserProgressBarService LIZJ() {
        Object LIZ2 = C58096Mr6.LIZ(INewUserProgressBarService.class, false);
        if (LIZ2 != null) {
            return (INewUserProgressBarService) LIZ2;
        }
        if (C58096Mr6.P0 == null) {
            synchronized (INewUserProgressBarService.class) {
                if (C58096Mr6.P0 == null) {
                    C58096Mr6.P0 = new NewUserProgressBarManager();
                }
            }
        }
        return C58096Mr6.P0;
    }

    public static final void LIZLLL() {
        if (!C2NK.LIZIZ().getBoolean("is_in_treatment_group", false) || C2NK.LIZLLL() || m0.LIZLLL("new_user_", ((RBX) HG3.LJIILL()).getCurSecUserId(), C2NK.LIZIZ(), false) || C2NK.LIZIZ().contains("did_log_in_existing_account")) {
            return;
        }
        C2NK.LIZIZ().storeBoolean("did_log_in_existing_account", true);
        C188727au c188727au = new C188727au();
        String str = LIZIZ;
        if (str != null) {
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LIZLLL(C2NK.LIZ(), "progress_pct");
            c188727au.LJIIIZ("group_id", LIZ);
            c188727au.LJIIIZ("method", "login");
            FMX.LJIIL("turnoff_nuf_progress_bar_result", c188727au.LIZ);
            return;
        }
        o.LJIJI("enterFrom");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.INewUserProgressBarService
    public final int LIZ() {
        if (C2NK.LIZIZ().getBoolean("did_log_in_existing_account", false)) {
            return 60;
        }
        return LJII;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.INewUserProgressBarService
    public final void LIZIZ(String secUid) {
        o.LJIIIZ(secUid, "secUid");
        Keva LIZIZ2 = C2NK.LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("new_user_");
        LIZ2.append(secUid);
        LIZIZ2.storeBoolean(X1D.LIZIZ(LIZ2), true);
        if (!C2NK.LIZIZ().contains("did_signup_new_account")) {
            C2NK.LIZIZ().storeBoolean("did_signup_new_account", true);
        }
    }
}
