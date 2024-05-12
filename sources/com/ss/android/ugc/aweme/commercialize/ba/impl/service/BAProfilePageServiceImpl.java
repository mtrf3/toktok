package com.ss.android.ugc.aweme.commercialize.ba.impl.service;

import X.ARI;
import X.AbstractC60800Ntc;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C237559Tz;
import X.C242899g5;
import X.C242989gE;
import X.C26045AKb;
import X.C26227ARb;
import X.C31461Li;
import X.C3AW;
import X.C40342FsQ;
import X.C40343FsR;
import X.C42193GhB;
import X.C58096Mr6;
import X.EnumC242959gB;
import X.HG3;
import X.InterfaceC65784Pro;
import X.NGY;
import X.OSZ;
import X.RBX;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.LeadsGenModel;
import com.ss.android.ugc.aweme.commercialize.ba.impl.ui.BusinessPageFragment;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class BAProfilePageServiceImpl implements IBAProfilePageService {
    public static IBAProfilePageService LJIIJJI() {
        Object LIZ = C58096Mr6.LIZ(IBAProfilePageService.class, false);
        if (LIZ != null) {
            return (IBAProfilePageService) LIZ;
        }
        if (C58096Mr6.LLLJ == null) {
            synchronized (IBAProfilePageService.class) {
                if (C58096Mr6.LLLJ == null) {
                    C58096Mr6.LLLJ = new BAProfilePageServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLJ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final void LJII() {
        AdHybridContainerManager.LIZLLL().LIZ(EnumC242959gB.SWITCH_TO_PROFILE, null, new NGY((String) null, (String) null, (String) null, (Integer) null, (Integer) null, 63));
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final void LIZLLL(ActivityC45651qj activityC45651qj) {
        String str;
        User curUser;
        if (activityC45651qj == null || !LJIIJ(activityC45651qj, "app")) {
            return;
        }
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null && (curUser = ((RBX) LJIILL).getCurUser()) != null && curUser.getAccountType() == 3) {
            new C237559Tz().LJI("ttelite_BA_download_click_edit", new OSZ<>("enter_from", "ba_profile"));
        }
        String str2 = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_baca_fe%2Fdownload_app_link%3Fhide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dbaca_fe%26bundle%3Dindex.js%26module_name%3Dpage_download_app_link%26hide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))";
        try {
            SettingsManager.LIZLLL().getClass();
            str = SettingsManager.LJI("download_app_link_schema", "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_baca_fe%2Fdownload_app_link%3Fhide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dbaca_fe%26bundle%3Dindex.js%26module_name%3Dpage_download_app_link%26hide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            o.LJI(str);
            str2 = str;
        }
        String appLanguage = SettingServiceImpl.LIZ().getAppLanguage();
        if (appLanguage == null) {
            appLanguage = "";
        }
        SmartRouter.buildRoute(activityC45651qj, ujb.o.LJJJJZ(str2, "((locale))", appLanguage, false)).open();
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final boolean LJFF(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null || !LJIIJ(activityC45651qj, "email")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final void LJIIIZ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return;
        }
        if (!LJIIJ(activityC45651qj, "address")) {
            new C237559Tz().LJIILLIIL(CardStruct.IStatusCode.DEFAULT);
            return;
        }
        String LIZJ = C31461Li.LIZJ("ba_contact_address_schema", "", "getInstance().getStringV…ddressSchema::class.java)");
        if (LIZJ.length() > 0) {
            new C237559Tz().LJIILLIIL("1");
            SmartRouter.buildRoute(activityC45651qj, LIZJ).open();
        }
    }

    public static boolean LJIIJ(ActivityC45651qj activityC45651qj, String str) {
        BizAccountInfo bizAccountInfo;
        List<String> addedContactAndLinkList;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser == null || (bizAccountInfo = curUser.getBizAccountInfo()) == null || (addedContactAndLinkList = bizAccountInfo.getAddedContactAndLinkList()) == null || addedContactAndLinkList.size() < 3) {
            return true;
        }
        if (addedContactAndLinkList.size() == 3 && addedContactAndLinkList.contains(str)) {
            return true;
        }
        if (addedContactAndLinkList.size() > 3 && addedContactAndLinkList.contains(str)) {
            C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
            c26045AKb.LJIIIIZZ(R.string.c2l);
            c26045AKb.LJIIJ();
            new C237559Tz().LJII("ttelite_ba_contact_ba_editprofile_adding_4_tools_warning", new String[0]);
            return true;
        }
        C26045AKb c26045AKb2 = new C26045AKb(activityC45651qj);
        c26045AKb2.LJIIIIZZ(R.string.c2l);
        c26045AKb2.LJIIJ();
        new C237559Tz().LJII("ttelite_ba_contact_ba_editprofile_adding_4_tools_warning", new String[0]);
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final void LIZ(Context context, String str) {
        String LJJJJZ;
        if (context == null || C242899g5.LIZ().length() == 0) {
            return;
        }
        switch (str.hashCode()) {
            case 3237038:
                if (!str.equals("info")) {
                    return;
                }
                LJJJJZ = ujb.o.LJJJJZ(ujb.o.LJJJJZ(C242899g5.LIZ(), "((page_action_type))", "1", false), "((enter_from))", "profile", false);
                break;
            case 1224335515:
                if (!str.equals("website")) {
                    return;
                }
                SettingsManager.LIZLLL().getClass();
                String LJI = SettingsManager.LJI("ba_profile_schema_popup", "");
                o.LJIIIIZZ(LJI, "getInstance().getStringV…eLimitSchema::class.java)");
                SmartRouter.buildRoute(context, ujb.o.LJJJJZ(ujb.o.LJJJJZ(LJI, "((page_action_type))", "3", false), "((enter_from))", "website", false)).open();
                return;
            case 1575275090:
                if (!str.equals("leads_from")) {
                    return;
                }
                LJJJJZ = C31461Li.LIZJ("get_leads_schema_settings", "aweme://lynxview/?channel=tiktok_ba_lynx_next&bundle=pages%2Fba%2Ftemplate.js&group=tiktok_ba_lynx_next&pageModule=lead-gen&webview_clear_color=1&dynamic=3&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&hide_status_bar=0&enable_canvas=1&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Fba_lynx_next%2Ftiktok_ba_lynx_next%2Fpages%2Fba%2Ftemplate.js&enter_from=business_suite&createModel=3", "getInstance().getStringV…hemaSettings::class.java)");
                if (TextUtils.isEmpty(LJJJJZ)) {
                    LJJJJZ = "aweme://lynxview/?channel=tiktok_ba_lynx_next&bundle=pages%2Fba%2Ftemplate.js&group=tiktok_ba_lynx_next&pageModule=lead-gen&webview_clear_color=1&dynamic=3&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&hide_status_bar=0&enable_canvas=1&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Fba_lynx_next%2Ftiktok_ba_lynx_next%2Fpages%2Fba%2Ftemplate.js&enter_from=business_suite&createModel=3";
                    break;
                }
                break;
            case 1671764162:
                if (!str.equals("display")) {
                    return;
                }
                LJJJJZ = ujb.o.LJJJJZ(ujb.o.LJJJJZ(C242899g5.LIZ(), "((page_action_type))", "2", false), "((enter_from))", "profile", false);
                break;
            default:
                return;
        }
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext LIZIZ = C42193GhB.LIZIZ(LJJJJZ);
        LIZIZ.LJIL(new AbstractC60800Ntc() { // from class: X.9g4
            @Override // X.AbstractC60673NrZ
            public final void onDestroy() {
                C2U8.LIZ(new C9VE());
            }
        });
        c40342FsQ.getClass();
        C40342FsQ.LIZ(context, LIZIZ).LIZIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final BusinessPageFragment LJ(InterfaceC65784Pro getPlatformSelfInfo, boolean z) {
        o.LJIIIZ(getPlatformSelfInfo, "getPlatformSelfInfo");
        BusinessPageFragment businessPageFragment = new BusinessPageFragment();
        businessPageFragment.LJLLLLLL = z;
        businessPageFragment.LJLZ = getPlatformSelfInfo;
        return businessPageFragment;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final void LIZIZ(ActivityC45651qj activityC45651qj, String str, BizAccountInfo bizAccountInfo) {
        if (activityC45651qj == null) {
            return;
        }
        if (!LJIIJ(activityC45651qj, "call")) {
            new C237559Tz().LJIJJ(CardStruct.IStatusCode.DEFAULT);
            return;
        }
        if (bizAccountInfo.enableEditPhone()) {
            String LIZJ = C31461Li.LIZJ("profile_phone_edit_schema", "aweme://webview/?use_spark=1&container_color_auto_dark=1&hide_nav_bar=1&use_forest=1&disable_ttnet_proxy=0&status_bar_color=00000000&trans_status_bar=1&url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-tx%2F8%2Fgecko%2Fresource%2Ftiktok_ba_pia%2Fprofile-phone-edit.html%3F__pia_manifest__%3D%257B%2522page_name%2522%253A%2522profile-phone-edit%2522%252C%2522public_path%2522%253A%2522https%253A%252F%252Flf19-gecko-source.tiktokcdn.com%252Fobj%252Fbyte-gurd-source-tx%252F8%252Fgecko%252Fresource%252Ftiktok_ba_pia%252F%2522%252C%2522worker%2522%253Atrue%252C%2522nsr%2522%253Atrue%257D%26enter_from%3D((enter_from))", "getInstance().getStringV…hemaSettings::class.java)");
            if (!TextUtils.isEmpty(str)) {
                LIZJ = UriProtector.parse(LIZJ).buildUpon().appendQueryParameter("phone", str).toString();
                o.LJIIIIZZ(LIZJ, "parse(schema).buildUpon(…              .toString()");
            }
            SmartRouter.buildRoute(activityC45651qj, LIZJ).open();
            new C237559Tz().LJIJJ("1");
            return;
        }
        ARI ari = new ARI(activityC45651qj);
        ari.LJI(R.string.j8, null);
        C242989gE c242989gE = new C242989gE(activityC45651qj);
        String string = activityC45651qj.getString(R.string.j9);
        o.LJIIIIZZ(string, "activity.getString(R.str…e_profile_error_register)");
        c242989gE.LIZLLL(string);
        c242989gE.LIZJ();
        c242989gE.LJ(new AqS170S0100000_4(activityC45651qj, 1561));
        C26227ARb LIZ = C3AW.LIZ(activityC45651qj);
        LIZ.LIZ(R.string.j_);
        LIZ.LJIIL = ari;
        LIZ.LJIIJJI = c242989gE;
        LIZ.LJII = false;
        LIZ.LJI().LIZLLL();
        new C237559Tz().LJIJJ(CardStruct.IStatusCode.DEFAULT);
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    public final void LIZJ(Context context, LeadsGenModel leadsGenModel, User user, Aweme aweme) {
        String schema;
        String str;
        List<String> urlList;
        o.LJIIIZ(leadsGenModel, "leadsGenModel");
        if (user == null || (schema = leadsGenModel.getSchema()) == null || context == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String businessData = leadsGenModel.getBusinessData();
        if (businessData != null) {
            jSONObject.put("ixBusinessData", businessData);
        }
        Uri.Builder buildUpon = UriProtector.parse(schema).buildUpon();
        C237559Tz c237559Tz = new C237559Tz();
        c237559Tz.LIZJ = 0;
        c237559Tz.LJIIIZ(aweme);
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("enter_from", (String) c237559Tz.LIZLLL("enter_from"));
        UrlModel avatarLarger = user.getAvatarLarger();
        if (avatarLarger != null && (urlList = avatarLarger.getUrlList()) != null) {
            str = (String) ListProtector.get(urlList, 0);
        } else {
            str = null;
        }
        String builder = appendQueryParameter.appendQueryParameter("avatar", str).appendQueryParameter("name", user.getNickname()).appendQueryParameter("title", leadsGenModel.getActionName()).appendQueryParameter("ba_uid", user.getUid()).appendQueryParameter("is_ad", String.valueOf(new C237559Tz().LIZLLL("is_ad"))).toString();
        o.LJIIIIZZ(builder, "parse(schema).buildUpon(…)\n            .toString()");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext LIZIZ = C42193GhB.LIZIZ(builder);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "initialData.toString()");
        LIZIZ.LJJIIJ("initialData", jSONObject2);
        c40342FsQ.getClass();
        C40342FsQ.LIZ(context, LIZIZ).LIZIZ();
        new C237559Tz().LJJIFFI(user, aweme, 0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x013f, code lost:
    
        if (r7 == null) goto L19;
     */
    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(android.content.Context r23, com.ss.android.ugc.aweme.feed.model.Aweme r24, com.ss.android.ugc.aweme.profile.model.User r25, com.ss.android.ugc.aweme.commerce.CouponInfo r26) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl.LJIIIIZZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.commerce.CouponInfo):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0149, code lost:
    
        if (r5 != null) goto L37;
     */
    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(int r10, android.content.Context r11, com.ss.android.ugc.aweme.feed.model.Aweme r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl.LJI(int, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
