package com.ss.android.ugc.aweme.setting.services;

import X.AAZ;
import X.AD7;
import X.C16880lQ;
import X.C25788AAe;
import X.C25798AAo;
import X.C25881ADt;
import X.C2YJ;
import X.C31136CJw;
import X.C35068DpY;
import X.C37292EkK;
import X.C38281F0r;
import X.C39061g6;
import X.C39380Fcu;
import X.C39392Fd6;
import X.C39399FdD;
import X.C39405FdJ;
import X.C39571Ffz;
import X.C39931Fln;
import X.C43286Gyo;
import X.C47261Igj;
import X.C52609Kkn;
import X.C58096Mr6;
import X.C61200O0e;
import X.C66765QIf;
import X.C66795QJj;
import X.C66821QKj;
import X.C67629QgT;
import X.C67942QlW;
import X.C79516VIq;
import X.C82619Wbf;
import X.C85886XnG;
import X.C85888XnI;
import X.C85895XnP;
import X.C85896XnQ;
import X.C85990Xow;
import X.C85999Xp5;
import X.C87093YGb;
import X.C8BR;
import X.C8BS;
import X.C9TP;
import X.EF7;
import X.EUJ;
import X.FH4;
import X.G36;
import X.HG3;
import X.InterfaceC85887XnH;
import X.InterfaceC85901XnV;
import X.InterfaceC85903XnX;
import X.LFH;
import X.QJX;
import X.QJY;
import X.QJZ;
import X.RBX;
import X.SQ1;
import X.SRY;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.BatchUpdatePushSwitchesResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class SettingServiceImpl extends BaseSettingServiceImpl {
    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getAppLanguage() {
        C43286Gyo.LIZ.getClass();
        String LIZ = C87093YGb.LIZ();
        o.LJIIIIZZ(LIZ, "get().appLanguage");
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getAppLogRegion() {
        C43286Gyo.LIZ.getClass();
        return C39392Fd6.LIZIZ("key_current_region", C39399FdD.LIZ(C85999Xp5.LIZJ(EF7.LIZIZ(), null, null)));
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Locale getCountryLocale() {
        C87093YGb c87093YGb = C43286Gyo.LIZ;
        c87093YGb.getClass();
        EF7.LIZIZ();
        return new Locale(c87093YGb.LIZIZ().getLanguage(), C85990Xow.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final List<G36> getI18nItems() {
        C87093YGb c87093YGb = C43286Gyo.LIZ;
        c87093YGb.getClass();
        return new ArrayList(((LinkedHashMap) c87093YGb.LIZ).values());
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Map<String, G36> getLocaleMap() {
        Map<String, G36> map = C43286Gyo.LIZ.LIZ;
        o.LJIIIIZZ(map, "get().localeMap");
        return map;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getSysLanguage() {
        C43286Gyo.LIZ.getClass();
        String LIZJ = C87093YGb.LIZJ(Locale.getDefault());
        o.LJIIIIZZ(LIZJ, "get().sysLanguage");
        return LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isIndonesiaByMcc() {
        Object obj;
        C43286Gyo.LIZ.getClass();
        C67942QlW c67942QlW = C82619Wbf.LIZ;
        synchronized (c67942QlW) {
            obj = c67942QlW.LJLIL;
            if (obj == null) {
                obj = "";
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(EF7.LIZIZ(), "phone");
                    if (telephonyManager != null) {
                        C39405FdJ.LJFF.getClass();
                        obj = C39571Ffz.LIZJ(telephonyManager);
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                c67942QlW.LJLIL = obj;
            }
        }
        String str = (String) obj;
        if (!TextUtils.isEmpty(str) && str.startsWith("510")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isKorean() {
        C87093YGb c87093YGb = C43286Gyo.LIZ;
        c87093YGb.getClass();
        EF7.LIZIZ();
        return TextUtils.equals(C39399FdD.LIZ(c87093YGb.LIZIZ().getLocale()), "KR");
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isShowFamilyPairingForNotLoginUser() {
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("show_family_pairing_for_not_login_user", false);
            return z;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return z;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean needShowProfileGuideView() {
        long j;
        if (C67629QgT.LIZ().getBoolean("has_show_disk_manager_guide", false)) {
            return false;
        }
        long LIZ = C37292EkK.LIZ();
        try {
            Long showStorageTipSize = C2YJ.LIZIZ.LIZ.getShowStorageTipSize();
            o.LJIIIIZZ(showStorageTipSize, "{\n                Settin…rageTipSize\n            }");
            j = showStorageTipSize.longValue();
        } catch (Exception unused) {
            j = 300000000;
        }
        if (LIZ < j) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final List<EUJ> providePushSettingCallbackList() {
        return C47261Igj.LJJIJIIJI(new C25798AAo(), SQ1.LIZ, C25788AAe.LJLIL, SRY.LJLIL);
    }

    public static ISettingService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ISettingService.class, false);
        if (LIZ != null) {
            return (ISettingService) LIZ;
        }
        if (C58096Mr6.A6 == null) {
            synchronized (ISettingService.class) {
                if (C58096Mr6.A6 == null) {
                    C58096Mr6.A6 = new SettingServiceImpl();
                }
            }
        }
        return C58096Mr6.A6;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean forcedPrivateSettingForLikedVideo() {
        if (((Number) C52609Kkn.LIZ.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final C8BR<C8BS<BaseResponse>, InterfaceC85903XnX> getPrivateSettingChangePresenter() {
        return new C85896XnQ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final C8BR<C8BS<PushSettings>, InterfaceC85901XnV> getPushSettingFetchPresenter() {
        return new C85895XnP();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void installCommonParams() {
        String accountRegion;
        if (FH4.LJLIL) {
            return;
        }
        synchronized (this) {
            if (FH4.LJLIL) {
                return;
            }
            C39931Fln c39931Fln = new C39931Fln(this);
            if (DeviceRegisterManager.getSwitchToBdtracker()) {
                C66821QKj c66821QKj = new C66821QKj(c39931Fln);
                C66765QIf c66765QIf = C66795QJj.LIZIZ;
                if (c66765QIf.LIZIZ()) {
                    QJX qjx = c66765QIf.LJ;
                    if (qjx.LIZ == null) {
                        qjx.LIZ = c66821QKj;
                    }
                }
            } else if (QJZ.LJIIJ == null) {
                QJZ.LJIIJ = c39931Fln;
            }
            QJY.LIZJ("mcc_mnc", C39380Fcu.LIZIZ());
            QJY.LIZJ("app_type", "normal");
            QJY.LIZJ("timezone_name", TimeZone.getDefault().getID());
            QJY.LIZJ("current_region", SharePrefCache.inst().getUserCurrentRegion().LIZ());
            QJY.LIZJ("residence", SharePrefCache.inst().getUserResidence().LIZ());
            QJY.LIZJ("carrier_region_v2", (String) C31136CJw.LIZ.LIZ());
            QJY.LIZJ("sys_region", C85990Xow.LJFF());
            QJY.LIZJ("language", getSysLanguage());
            QJY.LIZJ("is_pad", String.valueOf(LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL()));
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            if (curUser != null && (accountRegion = curUser.getAccountRegion()) != null && accountRegion.length() != 0) {
                QJY.LIZJ("account_region", accountRegion);
            }
            FH4.LJLIL = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean shouldUseFasterPaging() {
        if (!((Boolean) C35068DpY.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return Keva.getRepo("accessibility_setting").getBoolean("faster_paging_duration", true);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final boolean enableBACALogic() {
        return C9TP.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isFirstShowBAOrCARedDot() {
        return AD7.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean needShowRedDotOnMyProfileMore() {
        User curUser;
        if (!AD7.LJIIIIZZ() || !AD7.LIZ() || !AD7.LJIIIZ() || (!AD7.LJII() && ((curUser = ((RBX) HG3.LJIILL()).getCurUser()) == null || curUser.getAccountType() != 2))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean shouldShowBusinessAccount() {
        return I18nSettingNewVersionFragment.shouldShowBusinessAccount();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r2 == 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (X.AD7.LJII() != false) goto L15;
     */
    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldShowCreatorToolsDot() {
        /*
            r3 = this;
            boolean r0 = X.AD9.LIZ()
            r1 = 1
            if (r0 != 0) goto L6a
            boolean r0 = X.AD7.LJIIIIZZ()
            if (r0 == 0) goto L46
            boolean r0 = X.C9TP.LIZ()
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            int r2 = r0.getAccountType()
            boolean r0 = X.AD7.LJIIIIZZ()
            if (r0 == 0) goto L46
            boolean r0 = X.AD7.LJIIIZ()
            if (r0 == 0) goto L46
            r0 = 2
            if (r2 == r0) goto L32
            if (r2 != r1) goto L46
        L32:
            boolean r0 = X.AD7.LIZ()
            if (r0 != 0) goto L6a
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            boolean r0 = r0.proAccountTcmRedDot
            if (r0 != 0) goto L6a
        L46:
            boolean r0 = X.AD7.LJIIJ()
            if (r0 != 0) goto L6a
            boolean r0 = X.C25728A7w.LIZJ()
            if (r0 != 0) goto L6a
            boolean r0 = X.AD7.LJI()
            if (r0 != 0) goto L6a
            boolean r0 = X.AD7.LJFF()
            if (r0 != 0) goto L6a
            boolean r0 = X.AD7.LIZLLL()
            if (r0 != 0) goto L6a
            boolean r0 = X.AD7.LIZIZ()
            if (r0 == 0) goto L6b
        L6a:
            return r1
        L6b:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            int r0 = r0.getProAccountUpdateNotificationStatus()
            if (r0 != r1) goto L82
            boolean r0 = X.AD7.LIZJ()
            if (r0 == 0) goto L82
            goto L6a
        L82:
            r1 = 0
            goto L6a
        L84:
            boolean r0 = X.AD7.LJIIIIZZ()
            if (r0 == 0) goto L46
            boolean r0 = X.AD7.LJIIIZ()
            if (r0 == 0) goto L46
            boolean r0 = X.AD7.LJII()
            if (r0 == 0) goto L46
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.services.SettingServiceImpl.shouldShowCreatorToolsDot():boolean");
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final G36 getCurrentI18nItem(Context context) {
        o.LJIIIZ(context, "context");
        G36 LIZIZ = C43286Gyo.LIZ.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "get().getCurrentI18nItem(context)");
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final List<String> getInteractionPushSettingItemsString(String trigger) {
        o.LJIIIZ(trigger, "trigger");
        ArrayList arrayList = new ArrayList();
        int hashCode = trigger.hashCode();
        if (hashCode != -1268958287) {
            if (hashCode != -431564597) {
                if (hashCode != 925887911 || !trigger.equals("in_app_share")) {
                    return arrayList;
                }
                ArrayList LJII = C47261Igj.LJII("digg_push", "comment_push", "follow_push", "mention_push", "profile_viewer_push", "friend_upvote_push");
                LJII.addAll(C47261Igj.LJII("im_push", "im_push_preview_v2"));
                return LJII;
            }
            if (!trigger.equals("enter_homepage_friends")) {
                return arrayList;
            }
            ArrayList LJII2 = C47261Igj.LJII("recommend_video_push", "follow_new_video_push", "general_upvote_push");
            if (Build.VERSION.SDK_INT >= 26) {
                LJII2.add("acq_video_push");
            }
            LJII2.addAll(C47261Igj.LJII("digg_push", "comment_push", "follow_push", "mention_push", "profile_viewer_push", "friend_upvote_push"));
            return LJII2;
        }
        if (!trigger.equals("follow")) {
            return arrayList;
        }
        ArrayList LJII3 = C47261Igj.LJII("recommend_video_push", "follow_new_video_push", "general_upvote_push");
        if (Build.VERSION.SDK_INT < 26) {
            return LJII3;
        }
        LJII3.add("acq_video_push");
        return LJII3;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getLanguage(Locale locale) {
        C43286Gyo.LIZ.getClass();
        return C87093YGb.LIZJ(locale);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Locale getLocale(String language) {
        o.LJIIIZ(language, "language");
        G36 g36 = (G36) ((LinkedHashMap) C43286Gyo.LIZ.LIZ).get(language);
        if (g36 != null) {
            return g36.getLocale();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getTheme(int i) {
        Object obj = ((SparseArray) C79516VIq.LIZ.getValue()).get(i, "light");
        o.LJIIIIZZ(obj, "containerWithThemeMap.ge…ntainerHash, Theme.LIGHT)");
        return (String) obj;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean isArabicLang(Context context) {
        o.LJIIIZ(context, "context");
        C85990Xow.LIZ.getClass();
        return C85990Xow.LJI(context);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final void openTermsPage(Activity activity) {
        o.LJIIIZ(activity, "activity");
        AAZ.LJI(activity);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String buildFeedbackUrl(String url, Map<String, String> params) {
        String str;
        int i;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(params, "params");
        C85888XnI.LIZ.getClass();
        HashMap hashMap = new HashMap();
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(url), "url");
        if (queryParameter == null) {
            queryParameter = "";
        }
        int LJJLIIIJJIZ = s.LJJLIIIJJIZ(queryParameter, '?', 0, false, 6);
        if (LJJLIIIJJIZ > 0 && queryParameter.length() > (i = LJJLIIIJJIZ + 1)) {
            String substring = queryParameter.substring(i);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() != 0) {
                Iterator it = s.LJLJJL(substring, new String[]{"&"}, 0, 6).iterator();
                while (it.hasNext()) {
                    List LJLJJL = s.LJLJJL((String) it.next(), new String[]{"="}, 0, 6);
                    if (LJLJJL.size() == 2) {
                        hashMap.put(ListProtector.get(LJLJJL, 0), ListProtector.get(LJLJJL, 1));
                    }
                }
            }
        }
        hashMap.putAll(params);
        int LJJLIIIJJIZ2 = s.LJJLIIIJJIZ(queryParameter, '?', 0, false, 6);
        if (LJJLIIIJJIZ2 > 0) {
            str = queryParameter.substring(0, LJJLIIIJJIZ2);
            o.LJIIIIZZ(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = queryParameter;
        }
        C38281F0r c38281F0r = new C38281F0r(str);
        for (Map.Entry entry : hashMap.entrySet()) {
            c38281F0r.LIZLLL((String) entry.getKey(), (String) entry.getValue());
        }
        String LJ = c38281F0r.LJ();
        o.LJIIIIZZ(LJ, "urlBuilder.build()");
        String encode = URLEncoder.encode(queryParameter);
        o.LJIIIIZZ(encode, "encode(originalUrl)");
        String encode2 = URLEncoder.encode(LJ);
        o.LJIIIIZZ(encode2, "encode(finalUrl)");
        return ujb.o.LJJJJZ(url, encode, encode2, true);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void requestTurnOnAdAuthorization(Context context, InterfaceC85887XnH callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        C25881ADt.LIZ(context, true, new C85886XnG(callback), false);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final BaseResponse setPushPrivateSettingItem(String str, int i) {
        BaseResponse LJIIJJI = PushSettingsApiManager.LJIIJJI(i, str);
        o.LJIIIIZZ(LJIIJJI, "setPushSettingItem(field, v)");
        return LJIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void setTheme(int i, String theme) {
        o.LJIIIZ(theme, "theme");
        ((SparseArray) C79516VIq.LIZ.getValue()).append(i, theme);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl
    public final BatchUpdatePushSwitchesResp batchSetPushSettingItems(String str, int i, boolean z) {
        BatchUpdatePushSwitchesResp LIZ = PushSettingsApiManager.LIZ(str, i, z);
        o.LJIIIIZZ(LIZ, "batchSetPushSettingItems(fields, v, closeOthers)");
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean startFeedbackRecordActivity(Activity activity, String enterFrom, Integer num) {
        String str;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        C85888XnI.LIZ.getClass();
        try {
            str = C2YJ.LIZIZ.LIZ.getFeedbackConf().getFeRecord();
            o.LJIIIIZZ(str, "{\n            SettingsRe…ckConf.feRecord\n        }");
        } catch (Exception unused) {
            str = "";
        }
        C39061g6 c39061g6 = new C39061g6(str);
        c39061g6.LIZIZ("enter_from", enterFrom);
        if (num != null) {
            C61200O0e.LIZLLL().LJIIIIZZ(num.intValue(), activity, c39061g6.LIZJ());
            return true;
        }
        C61200O0e.LIZLLL().LJII(c39061g6.LIZJ());
        return true;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.BaseSettingServiceImpl, com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void switchLocale(String locale, String language, Context activity) {
        o.LJIIIZ(locale, "locale");
        o.LJIIIZ(language, "language");
        o.LJIIIZ(activity, "activity");
        C43286Gyo.LIZ.LJ(locale, language, activity, null);
    }
}
