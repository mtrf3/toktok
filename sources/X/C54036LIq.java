package X;

import Y.AObserverS71S0100000_3;
import Y.AObserverS77S0100000_9;
import android.os.Bundle;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.LinkedHashMap;
import yq4.a;

/* renamed from: X.LIq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54036LIq implements InterfaceC54049LJd {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C54037LIr.LJLIL);

    @Override // X.InterfaceC54049LJd
    public final boolean LIZ() {
        if (LJA.LIZIZ.get() && !C54047LJb.LIZIZ.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54049LJd
    public final void LIZJ() {
        LJA.LIZIZ.set(false);
    }

    @Override // X.InterfaceC54049LJd
    public final boolean LIZLLL() {
        return LIZ();
    }

    @Override // X.InterfaceC54049LJd
    public final void LJ(ActivityC45651qj activityC45651qj) {
        int i;
        LIH lih = LIH.LJLIL;
        LIH.LJLILLLLZI = activityC45651qj;
        C116694i1.LIZ(activityC45651qj).hv0(lih);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("initialize ");
        ActivityC45651qj LIZ3 = LIH.LIZ();
        if (LIZ3 != null) {
            i = LIZ3.hashCode();
        } else {
            i = 0;
        }
        LIZ2.append(i);
        X1D.LIZIZ(LIZ2);
        ActivityC45651qj LIZ4 = LIH.LIZ();
        if (LIZ4 != null) {
            LIH.LJLJI.observe(LIZ4, new AObserverS77S0100000_9(LIZ4, 89));
            LIH.LJLJJI.observe(LIZ4, new AObserverS71S0100000_3(LIZ4, 67));
        }
    }

    @Override // X.InterfaceC54049LJd
    public final boolean LJFF(PoiData poiData, int i) {
        String manualRegionName;
        PrivacyUserSettingsV2 privacyUserSettings;
        PrivacyUserSettingsV2 privacyUserSettings2;
        Integer M;
        if (poiData == null || i != 0 || C00F.LIZ(31744, 0, "tt_publish_landing_to_friends_reverse", true) != 0) {
            return false;
        }
        RoamingLocationInfo LIZIZ = LJA.LIZIZ();
        if (!NearbyTabConfig.LIZIZ().userPublishLandingNearby || LIZIZ == null || (manualRegionName = LIZIZ.getManualRegionName()) == null || !C78685UuP.LJJJZ(manualRegionName) || manualRegionName.length() > C53209KuT.LIZ() || C76800UCe.LIZ == null || (privacyUserSettings = a.LJIILIIL().getPrivacyUserSettings()) == null || C62848OlY.LIZLLL(privacyUserSettings) || !LQA.LIZIZ.LJJ().LJLIL || (privacyUserSettings2 = a.LJIILIIL().getPrivacyUserSettings()) == null || (M = privacyUserSettings2.M("post_to_nearby")) == null || M.intValue() != 1 || !PoiServiceImpl.LIZIZ().LJJ(poiData) || !LJA.LIZ(poiData, LIZIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC54049LJd
    public final void LIZIZ(ActivityC45651qj activityC45651qj, String str, PoiData poiData) {
        String str2;
        LQA lqa = LQA.LIZIZ;
        lqa.LJI();
        Bundle bundle = new Bundle();
        bundle.putString("fromStart", "MainPage");
        bundle.putString("enter_method", "publish_landing");
        if (lqa.LJI()) {
            if (lqa.LIZJ()) {
                AbstractC53895LDf rv0 = com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).rv0("Nearby");
                if (rv0 != null) {
                    str2 = rv0.LJIIL();
                } else {
                    str2 = null;
                }
                LQ8.LIZ(String.valueOf(str2), "publish_landing");
            }
        } else {
            LJA.LJ(str, new LinkedHashMap(), activityC45651qj);
        }
        LJ6.LIZLLL(poiData);
        LTU.LIZ(Boolean.TRUE, true);
        com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).Cv0(bundle, "Nearby");
        LJA.LIZIZ.set(true);
    }

    @Override // X.InterfaceC54049LJd
    public final void LJI(ActivityC45651qj activityC45651qj, String str, PoiData poiData) {
        LJA.LJ(str, new LinkedHashMap(), activityC45651qj);
        LJ6.LIZLLL(poiData);
        LTU.LIZ(Boolean.TRUE, true);
        LJA.LIZIZ.set(true);
    }
}
