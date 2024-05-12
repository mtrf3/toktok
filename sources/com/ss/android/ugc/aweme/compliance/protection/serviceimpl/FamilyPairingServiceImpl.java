package com.ss.android.ugc.aweme.compliance.protection.serviceimpl;

import X.ActivityC45651qj;
import X.C158056If;
import X.C2NU;
import X.C2YJ;
import X.C47261Igj;
import X.C57411Mg3;
import X.C5S1;
import X.C84763XOl;
import X.C86302Xty;
import X.C86305Xu1;
import X.DialogC254019y1;
import X.EF7;
import X.EnumC62934Omw;
import X.HG3;
import X.J9P;
import X.RBX;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.compliance.protection.common.model.FamilyPairingBean;
import com.ss.android.ugc.aweme.compliance.protection.common.model.GuardianRestrictionBean;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class FamilyPairingServiceImpl implements IFamilyPairingService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final EnumC62934Omw LIZ() {
        FamilyPiaringManager.LIZ.getClass();
        return FamilyPiaringManager.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final String LIZIZ() {
        FamilyPiaringManager.LIZ.getClass();
        try {
            String schema = C2YJ.LIZIZ.LIZ.getFeConfigCollection().getGuardianChild().getSchema();
            o.LJIIIIZZ(schema, "{\n            SettingsRe…ianChild.schema\n        }");
            return schema;
        } catch (C158056If unused) {
            return "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Fguardian_child_t%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1";
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final boolean LIZJ() {
        GuardianRestrictionBean guardianRestrictionBean;
        Integer num;
        FamilyPiaringManager.LIZ.getClass();
        FamilyPairingBean familyPairingBean = FamilyPiaringManager.LIZJ;
        if (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null || (num = guardianRestrictionBean.searchRestriction) == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final boolean LIZLLL() {
        FamilyPiaringManager.LIZ.getClass();
        return FamilyPiaringManager.LJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final void LJ(ActivityC45651qj activityC45651qj) {
        String str;
        boolean z = false;
        if (!((RBX) HG3.LJIILL()).isLogin() && SettingServiceImpl.LIZ().isShowFamilyPairingForNotLoginUser()) {
            if (activityC45651qj == null) {
                return;
            }
            try {
                z = C2NU.LIZ.LIZIZ();
            } catch (Exception unused) {
            }
            if (!z) {
                C5S1 c5s1 = new C5S1(activityC45651qj);
                c5s1.LIZLLL(activityC45651qj.getString(R.string.g5t));
                c5s1.LJ();
                return;
            } else {
                FamilyPiaringManager.LIZ.getClass();
                try {
                    str = C2YJ.LIZIZ.LIZ.getFeConfigCollection().getGuardianEntrance().getSchema();
                    o.LJIIIIZZ(str, "{\n            SettingsRe…Entrance.schema\n        }");
                } catch (C158056If unused2) {
                    str = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Fmain%2Fguardian_entrance%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1";
                }
                SmartRouter.buildRoute(activityC45651qj, str).open();
                return;
            }
        }
        if (activityC45651qj == null) {
            return;
        }
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused3) {
        }
        if (!z) {
            C5S1 c5s12 = new C5S1(activityC45651qj);
            c5s12.LIZLLL(activityC45651qj.getString(R.string.g5t));
            c5s12.LJ();
        } else {
            C86305Xu1.LJII(C47261Igj.LJJIJIL("tns_familypairing", "fe_tns_filter_keywords", "fe_tns_content_levels", "fe_tns_reminder"));
            DialogC254019y1 dialogC254019y1 = new DialogC254019y1(activityC45651qj);
            C86305Xu1.LIZIZ(dialogC254019y1);
            C86305Xu1.LJIIIZ(new C86302Xty(dialogC254019y1, activityC45651qj));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final boolean LJI(String str) {
        FamilyPiaringManager.LIZ.getClass();
        if (TextUtils.isEmpty(str) || str == null || !s.LJJJLZIJ(str, "/falcon/rn/guardian_child", true) || ((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        J9P.LIZIZ(C84763XOl.LJIIIIZZ(), "qr_code_detail", "auto", null, null);
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZJ(R.string.hwm);
        c5s1.LJ();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final void LJFF(Activity activity, String str) {
        if (activity == null) {
            return;
        }
        if (C2NU.LIZ.LIZIZ()) {
            C86305Xu1.LJII(C47261Igj.LJJIJIL("fe_tns_screen_time_homepage", "fe_tns_screen_time_management", "fe_tns_reminder"));
            DialogC254019y1 dialogC254019y1 = new DialogC254019y1(activity);
            C86305Xu1.LIZIZ(dialogC254019y1);
            C86305Xu1.LJIIIZ(new C57411Mg3(dialogC254019y1, activity, str));
            return;
        }
        C5S1 c5s1 = new C5S1(activity);
        c5s1.LIZLLL(activity.getString(R.string.g5t));
        c5s1.LJ();
    }
}
