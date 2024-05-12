package com.ss.android.ugc.aweme.commercialize.ba.impl.ui;

import X.C247839o3;
import X.C31461Li;
import X.C63081OpJ;
import X.C9X3;
import X.HG3;
import X.KL2;
import X.RBX;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.profile.model.BATab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BusinessSuiteActivityArgs implements IRouteAction {
    public static final Keva LIZ = Keva.getRepo("BusinessAccountActivity");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.bytedance.router.SmartRoute] */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Boolean bool;
        String str2;
        ?? r14;
        int i;
        List<String> list;
        int i2;
        int i3;
        BATab bATab;
        Boolean showBATab;
        if (context == null) {
            return Boolean.FALSE;
        }
        if (bundle != null) {
            bool = Boolean.valueOf(bundle.getBoolean("new_order", true));
        } else {
            bool = null;
        }
        if (bundle != null) {
            str2 = bundle.getString("enter_from", "personal_homepage");
        } else {
            str2 = null;
        }
        String LIZJ = C31461Li.LIZJ("business_suite_page_schema", "aweme://lynxview/?channel=tiktok_ba_lynx_next&bundle=pages%2Fba%2Ftemplate.js&group=tiktok_ba_lynx_next&pageModule=navigation&webview_clear_color=1&dynamic=3&hide_nav_bar=1&use_spark=1&trans_status_bar=1&hide_status_bar=0&enable_canvas=1&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Fba_lynx_next%2Ftiktok_ba_lynx_next%2Fpages%2Fba%2Ftemplate.js", "getInstance().getStringV…hemaSettings::class.java)");
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        User curUser2 = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser2 == null || curUser2.getCommerceUserInfo() == null) {
            r14 = 0;
        } else {
            r14 = curUser2.getCommerceUserInfo().hasPromote;
        }
        int accountType = curUser.getAccountType();
        if (r14 != 0 && curUser.getCommerceUserInfo() != null) {
            i = curUser.getCommerceUserInfo().getPromotePayType();
        } else {
            i = 0;
        }
        C247839o3 c247839o3 = C9X3.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ba_branded_content_tip_showed");
        LIZ2.append(curUser.getUid());
        int i4 = 1 ^ (c247839o3.LIZ(Boolean.FALSE, X1D.LIZIZ(LIZ2)).booleanValue() ? 1 : 0);
        Gson LIZ3 = GsonHolder.LIZLLL().LIZ();
        BizAccountInfo bizAccountInfo = curUser.getBizAccountInfo();
        if (bizAccountInfo != null) {
            list = bizAccountInfo.getPermissionList();
        } else {
            list = null;
        }
        String json = GsonProtectorUtils.toJson(LIZ3, list);
        int LJJJJLI = C63081OpJ.LJJJJLI(context);
        if (LJJJJLI > 0) {
            i2 = KL2.LJIILL(context, LJJJJLI);
        } else {
            i2 = 44;
        }
        ?? buildRoute = SmartRouter.buildRoute(context, LIZJ);
        Boolean bool2 = Boolean.TRUE;
        buildRoute.withParam("new_order", o.LJ(bool, bool2) ? 1 : 0);
        buildRoute.withParam("enter_from", str2);
        buildRoute.withParam("permission_list", json);
        buildRoute.withParam("video_counts", TcmServiceImpl.LJIJI().LJIIJJI());
        buildRoute.withParam("has_promote", r14);
        buildRoute.withParam("promote_version", i);
        buildRoute.withParam("user_account_type", accountType);
        buildRoute.withParam("status_bar_height", i2);
        Keva keva = LIZ;
        buildRoute.withParam("shown_lead_red_dot", keva.getBoolean("isGetLeadsBadgeShown", false) ? 1 : 0);
        buildRoute.withParam("shown_branded_content_bubble", i4);
        TabSetting tabSetting = curUser.getTabSetting();
        if (tabSetting != null && (bATab = tabSetting.baTab) != null && (showBATab = bATab.getShowBATab()) != null) {
            i3 = showBATab.booleanValue();
        } else {
            i3 = 0;
        }
        buildRoute.withParam("has_biz_page_entrance", i3);
        buildRoute.open();
        if (!keva.getBoolean("isGetLeadsBadgeShown", false)) {
            keva.storeBoolean("isGetLeadsBadgeShown", true);
        }
        if (i4 != 0) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("ba_branded_content_tip_showed");
            LIZ4.append(curUser.getUid());
            c247839o3.LIZLLL(bool2, X1D.LIZIZ(LIZ4));
        }
        return bool2;
    }
}
