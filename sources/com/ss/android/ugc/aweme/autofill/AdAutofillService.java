package com.ss.android.ugc.aweme.autofill;

import X.C38995FSd;
import X.C53201KuL;
import X.C58096Mr6;
import X.C6D8;
import X.C78886Uxe;
import X.E2C;
import X.FMX;
import X.N8Q;
import X.NAW;
import X.RunnableC59084NGu;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class AdAutofillService implements IAdAutofillService {
    public static IAdAutofillService LJIIIIZZ() {
        Object LIZ = C58096Mr6.LIZ(IAdAutofillService.class, false);
        if (LIZ != null) {
            return (IAdAutofillService) LIZ;
        }
        if (C58096Mr6.LLJ == null) {
            synchronized (IAdAutofillService.class) {
                if (C58096Mr6.LLJ == null) {
                    C58096Mr6.LLJ = new AdAutofillService();
                }
            }
        }
        return C58096Mr6.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final boolean LIZ() {
        IUserService createIUserServicebyMonsterPlugin;
        User currentUser;
        if (!C53201KuL.LIZ() || (createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false)) == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null || currentUser.getUid() == null || C6D8.LIZLLL()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final JSONObject LIZIZ() {
        if (NAW.LJI() == null) {
            return new JSONObject();
        }
        String LJI = NAW.LJI();
        if (LJI == null) {
            LJI = "";
        }
        return new JSONObject(LJI);
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LJ() {
        C38995FSd.LIZIZ().submit(RunnableC59084NGu.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final boolean LJFF() {
        boolean z;
        String str = AdAutofillConfigSettings.LIZ().learnMoreLink;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final boolean LJI() {
        if (NAW.LJIIIIZZ() == null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LIZJ(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        NAW.LJIIJJI(i18nSettingManageMyAccountActivity, true, null, null, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LIZLLL(Context context) {
        User currentUser;
        String uid;
        o.LJIIIZ(context, "context");
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null || (uid = currentUser.getUid()) == null || C6D8.LIZLLL() || o.LJ(NAW.LIZ.get(uid), Boolean.TRUE)) {
            return;
        }
        C78886Uxe.LJIILJJIL().LIZIZ("/passport/identity/get_fields/", E2C.LIZJ("fields", "[3]"), new N8Q(uid));
    }

    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillService
    public final void LJII(Context context) {
        o.LJIIIZ(context, "context");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://webview");
        buildRoute.withParam(UriProtector.parse(AdAutofillConfigSettings.LIZ().learnMoreLink));
        buildRoute.open();
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "user_information_page");
        FMX.LJIIL("userinfo_click_learn_more", hashMap);
    }
}
