package X;

import android.app.Activity;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.AutobackupService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAutobackupService;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import com.ss.android.ugc.aweme.services.ClearCacheService;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Fb1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39263Fb1 {
    public static final C5H3<C39263Fb1> LJFF = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C39267Fb5.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C39266Fb4.LJLIL);
    public static final String LJII = "tpc_consent";
    public static final Keva LJIIIIZZ;
    public static List<? extends InterfaceC39262Fb0> LJIIIZ;
    public static final IAccountService LJIIJ;
    public static final IAutobackupService LJIIJJI;
    public String LIZ;
    public InterfaceC39268Fb6 LIZIZ;
    public long LIZJ;
    public C40433Ftt LIZLLL;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 174));

    public final void LIZ() {
        M78 stateWrapper;
        LIZIZ(true);
        ClearCacheService.createIClearCacheServicebyMonsterPlugin(false).retryAddClearCacheShortcut();
        InterfaceC39268Fb6 interfaceC39268Fb6 = this.LIZIZ;
        if (interfaceC39268Fb6 != null) {
            interfaceC39268Fb6.LLJZIJLIL();
        }
        C40433Ftt c40433Ftt = this.LIZLLL;
        if (c40433Ftt != null && (stateWrapper = c40433Ftt.getStateWrapper()) != null) {
            stateWrapper.LIZ();
        }
        this.LIZLLL = null;
        C39257Fav.LJFF();
        ISecApi LIZ = SecApiImpl.LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(ISecApi::class.java)");
        LIZ.updateCollectMode(null);
        int i = C39260Fay.LIZ[C39257Fav.LIZLLL().ordinal()];
        if (i != 1) {
            if (i != 2) {
                LJ("row_dnu_consent_box", "v1");
                return;
            } else {
                LJ("eu_dnu_consent_box", "v1");
                return;
            }
        }
        LJ("kr_dnu_consent_box", "v1803");
    }

    static {
        Keva repo = Keva.getRepo("tpc_consent");
        LJIIIIZZ = repo;
        if (!repo.contains("is_consent_accepted")) {
            repo.storeBoolean("is_consent_accepted", false);
        }
        LJIIIZ = C61878OQg.INSTANCE;
        LJIIJ = AccountService.LJIJ();
        LJIIJJI = AutobackupService.LIZJ();
    }

    public final void LIZJ() {
        int i;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LIZ);
        if (C39257Fav.LIZLLL() == EnumC39259Fax.KR) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "is_region_kr");
        c188727au.LJIIIZ("consent_region", LJIIJ.LJIILL());
        C36222EJm.LIZ(c188727au);
        java.util.Map<String, String> mobShowConsentBox$lambda$2 = c188727au.LIZ;
        o.LJIIIIZZ(mobShowConsentBox$lambda$2, "mobShowConsentBox$lambda$2");
        V2B.LJIJ(mobShowConsentBox$lambda$2);
        C36222EJm.LIZIZ(G2H.SHOW_CONSENT_BOX, mobShowConsentBox$lambda$2);
    }

    public final void LIZIZ(boolean z) {
        String str;
        int i;
        long j;
        C188727au LJ = C169696lJ.LJ(System.currentTimeMillis() - this.LIZJ, "stay_time");
        if (z) {
            str = "confirm";
        } else {
            str = "background";
        }
        LJ.LJIIIZ("result", str);
        if (C39257Fav.LIZLLL() == EnumC39259Fax.KR) {
            i = 1;
        } else {
            i = 0;
        }
        LJ.LIZLLL(i, "is_region_kr");
        LJ.LJIIIZ("consent_region", LJIIJ.LJIILL());
        LJ.LJIIIZ("enter_from", this.LIZ);
        Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
        if (LIZIZ != null) {
            LJ.LIZLLL(LIZIZ.intValue(), "is_ab_backend_resp_received");
        }
        LJ.LIZLLL(E6T.LJIIIIZZ ? 1 : 0, "is_hybrid_ab_api_rev");
        C36222EJm.LIZ(LJ);
        G2H g2h = G2H.CONFIRM_CONSENT_BOX;
        java.util.Map<String, String> logConfirmConsent$lambda$4 = LJ.LIZ;
        o.LJIIIIZZ(logConfirmConsent$lambda$4, "logConfirmConsent$lambda$4");
        V2B.LJIJ(logConfirmConsent$lambda$4);
        C36222EJm.LIZIZ(g2h, logConfirmConsent$lambda$4);
        if (z) {
            j = 0;
        } else {
            j = -1;
        }
        this.LIZJ = j;
    }

    public static void LJ(String str, String str2) {
        C8GK.LIZ(a.LJIIL(), str, str2, "pop", null, 2, 0, Boolean.TRUE, null, 384);
    }

    public final void LIZLLL(Activity activity, String str, boolean z) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = str;
        if (PNSDeviceConsentServiceImpl.LJI().LIZIZ()) {
            if (C47261Igj.LJJIJIIJI("deeplink", "homepage_hot", "shortcut").contains(str)) {
                return;
            }
            PNSDeviceConsentServiceImpl.LJI().LIZLLL(true);
            return;
        }
        if (!(activity instanceof ActivityC45651qj) || activity == null) {
            return;
        }
        InterfaceC39268Fb6 interfaceC39268Fb6 = this.LIZIZ;
        if (interfaceC39268Fb6 != null) {
            interfaceC39268Fb6.LLJJL();
        }
        LJIIIIZZ.storeBoolean("consent_once_shown", true);
        LIZJ();
        FFL LJIIIZ2 = FFL.LJIIIZ();
        String[] strArr = C39265Fb3.LIZ;
        LJIIIZ2.getClass();
        FFL.LJIIZILJ(1, strArr, "hybrid_test_experiment_string_array", false);
        PipServiceImpl.LJJII().LJIILJJIL();
        if (C39257Fav.LIZLLL() != EnumC39259Fax.KR) {
            if (z) {
                PopupManager.LJIIL(new C40432Fts((ActivityC45651qj) activity, new AqS172S0100000_6(this, 155)));
                return;
            } else {
                C16880lQ.LIZ(C39271Fb9.LIZIZ((ActivityC45651qj) activity, new AqS172S0100000_6(this, 152)));
                return;
            }
        }
        if (z) {
            C40433Ftt c40433Ftt = new C40433Ftt((ActivityC45651qj) activity, new AqS172S0100000_6(this, 153));
            PopupManager.LJIIL(c40433Ftt);
            this.LIZLLL = c40433Ftt;
            return;
        }
        C39271Fb9.LIZ((ActivityC45651qj) activity, new AqS172S0100000_6(this, 154));
    }
}
