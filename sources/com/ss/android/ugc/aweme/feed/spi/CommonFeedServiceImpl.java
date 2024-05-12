package com.ss.android.ugc.aweme.feed.spi;

import X.AKT;
import X.C06540Nm;
import X.C10K;
import X.C188727au;
import X.C2043280e;
import X.C210018Mb;
import X.C220858ld;
import X.C25739A8h;
import X.C26241ARp;
import X.C2KS;
import X.C2S6;
import X.C2U8;
import X.C2ZO;
import X.C35843E4x;
import X.C39687Fhr;
import X.C46368IHs;
import X.C47261Igj;
import X.C52452KiG;
import X.C52939Kq7;
import X.C54838Lfe;
import X.C54840Lfg;
import X.C54935LhD;
import X.C54969Lhl;
import X.C55045Liz;
import X.C57188McS;
import X.C58096Mr6;
import X.C61075Ny3;
import X.C68382mI;
import X.C76800UCe;
import X.EAL;
import X.FJG;
import X.FMX;
import X.FW5;
import X.HG3;
import X.HSG;
import X.InterfaceC88472Yns;
import X.M89;
import X.SVF;
import X.WM7;
import Y.ACallableS36S1100000_9;
import Y.ARunnableS6S0210000_6;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IPopupRecordService;
import com.ss.android.ugc.feed.platform.popupclean.NewUserPopupCleanAssem;
import com.ss.android.ugc.feed.platform.popupclean.PopupRuleData$OnlineControl;
import com.ss.android.ugc.feed.platform.popupclean.PopupRuleData$Popup;
import com.ss.android.ugc.feed.platform.popupclean.PopupRuleData$PopupGroup;
import com.ss.android.ugc.feed.platform.popupclean.PopupRuleData$PopupRule;
import com.ss.android.ugc.feed.platform.popupclean.PopupRuleData$VVControl;
import com.ss.android.ugc.feed.platform.popupclean.v2.nuj.dialogclean.NewUserPopupCleanRule;
import defpackage.i0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CommonFeedServiceImpl implements FeedCommonService {
    public static FeedCommonService LJJIJLIJ() {
        Object LIZ = C58096Mr6.LIZ(FeedCommonService.class, false);
        if (LIZ != null) {
            return (FeedCommonService) LIZ;
        }
        if (C58096Mr6.L0 == null) {
            synchronized (FeedCommonService.class) {
                if (C58096Mr6.L0 == null) {
                    C58096Mr6.L0 = new CommonFeedServiceImpl();
                }
            }
        }
        return C58096Mr6.L0;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final C61075Ny3 LIZ() {
        return new C61075Ny3();
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LIZLLL() {
        C54969Lhl.LJ++;
        C54969Lhl.LIZ.storeLong(C54969Lhl.LIZ("nu_vv_count"), C54969Lhl.LJ() + 1);
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJ() {
        Iterator LJ = C06540Nm.LJ((HashMap) C2KS.LJ.getValue(), "instanceMap.values");
        while (LJ.hasNext()) {
            C2KS it = (C2KS) LJ.next();
            o.LJIIIIZZ(it, "it");
            Aweme aweme = it.LIZJ;
            if (aweme != null) {
                C2U8.LIZ(new C55045Liz(aweme, it.LIZ));
            }
            it.LIZJ = null;
            it.LIZ();
            it.LIZIZ.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIIIIZZ() {
        Keva keva = C54935LhD.LIZJ;
        keva.storeInt(C54935LhD.LIZ("new_user_dialog_clean_cold_start_count"), keva.getInt(C54935LhD.LIZ("new_user_dialog_clean_cold_start_count"), 0) + 1);
        long j = keva.getLong(C54935LhD.LIZ("new_user_dialog_clean_first_launch_time"), 0L);
        if (j == 0) {
            keva.storeLong(C54935LhD.LIZ("new_user_dialog_clean_first_launch_time"), System.currentTimeMillis());
        } else if (TimeUnit.DAYS.toMillis(1L) + j < System.currentTimeMillis()) {
            keva.storeInt(C54935LhD.LIZ("new_user_cold_start_after_first_launch"), keva.getInt(C54935LhD.LIZ("new_user_cold_start_after_first_launch"), 0) + 1);
        }
        C54969Lhl.LJII();
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIIJ() {
        ARunnableS6S0210000_6 aRunnableS6S0210000_6 = FW5.LJIIJJI;
        if (aRunnableS6S0210000_6 != null) {
            aRunnableS6S0210000_6.run();
            FW5.LJIIJJI = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJIIJJI() {
        return C54935LhD.LJ("cla_popup_task");
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final HSG LJIJJ() {
        return new HSG();
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final C25739A8h LJIL() {
        return new C25739A8h();
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJJ() {
        C2U8.LIZ(new C68382mI());
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJJI() {
        C54969Lhl.LJFF++;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJJIIJ() {
        C54969Lhl.LIZ.storeFloat(C54969Lhl.LIZ("nu_last_session_stay_time"), C54969Lhl.LIZJ());
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJJIIZI() {
        FJG.LIZ.getClass();
        return FJG.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final NewUserPopupCleanAssem LJJIJIIJIL() {
        return new NewUserPopupCleanAssem();
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJIIL() {
        return PopupManager.LJ() instanceof C26241ARp;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIILL() {
        C54969Lhl.LJI();
        C54969Lhl.LIZJ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJIJI() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZ("feed_banner_use_deeplink", true);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJJIJ() {
        int LIZ = C35843E4x.LIZ();
        ((IPopupRecordService) ServiceManager.get().getService(IPopupRecordService.class)).LIZIZ();
        EAL.Companion.getClass();
        for (EAL eal : EAL.values()) {
            if (eal.getValue() == LIZ) {
                if (eal == EAL.CONTROL) {
                    return false;
                }
                return true;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJI(Aweme aweme) {
        FeedItemList feedItemList = new FeedItemList();
        feedItemList.items = C47261Igj.LJJIJ(aweme);
        C46368IHs.LIZ(feedItemList);
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIIIZ(List list) {
        if (list == null) {
            return;
        }
        C10K.LIZIZ(new ACallableS36S1100000_9(list, "homepage_follow", 5), FMX.LIZIZ(), null);
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIILIIL(boolean z) {
        C2043280e.LIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final int LJIILLIIL(String str) {
        Integer num = (Integer) ((HashMap) NewUserPopupCleanRule.LIZLLL.getValue()).get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIJ(String secUid) {
        o.LJIIIZ(secUid, "secUid");
        Keva keva = C54935LhD.LIZJ;
        String string = keva.getString("new_user_dialog_clean_first_login_sec", "");
        HG3.LJIIL();
        if (HG3.LJLJL.LJFF().isLogin() && !TextUtils.isEmpty(secUid) && (string.equals(secUid) || TextUtils.isEmpty(string))) {
            int i = keva.getInt("new_user_dialog_clean_cold_start_count", 0);
            long j = keva.getLong("new_user_dialog_clean_first_launch_time", System.currentTimeMillis());
            int i2 = keva.getInt("new_user_cold_start_after_first_launch", 0);
            keva.storeInt(C54935LhD.LIZ("new_user_dialog_clean_cold_start_count"), i);
            keva.storeLong(C54935LhD.LIZ("new_user_dialog_clean_first_launch_time"), j);
            keva.storeInt(C54935LhD.LIZ("new_user_cold_start_after_first_launch"), i2);
        }
        if (TextUtils.isEmpty(keva.getString("new_user_dialog_clean_first_login_sec", ""))) {
            keva.storeString("new_user_dialog_clean_first_login_sec", secUid);
        }
        Keva keva2 = C54969Lhl.LIZ;
        String string2 = keva2.getString("nu_popup_clean_first_login_sec", "");
        HG3.LJIIL();
        if (HG3.LJLJL.LJFF().isLogin()) {
            if (!TextUtils.isEmpty(secUid) && (string2.equals(secUid) || TextUtils.isEmpty(string2))) {
                int i3 = keva2.getInt("nu_dialog_clean_cold_start_count", 0);
                int i4 = keva2.getInt("nu_active_day", 0);
                String string3 = keva2.getString("nu_last_active_day", "");
                long j2 = keva2.getLong("nu_vv_count", 0L);
                float f = keva2.getFloat("nu_last_session_stay_time", 0.0f);
                int i5 = keva2.getInt("nu_popup_time_window_status", 0);
                int i6 = keva2.getInt("nu_popup_vv_window_status", 0);
                keva2.storeInt(i0.LJFF("nu_dialog_clean_cold_start_count", secUid), i3);
                keva2.storeInt(i0.LJFF("nu_active_day", secUid), i4);
                keva2.storeString(i0.LJFF("nu_last_active_day", secUid), string3);
                keva2.storeLong(i0.LJFF("nu_vv_count", secUid), j2);
                keva2.storeFloat(i0.LJFF("nu_last_session_stay_time", secUid), f);
                keva2.storeInt(i0.LJFF("nu_popup_time_window_status", secUid), i5);
                keva2.storeInt(i0.LJFF("nu_popup_vv_window_status", secUid), i6);
            }
            if (!string2.equals(secUid) && !TextUtils.isEmpty(string2)) {
                C54969Lhl.LJII();
            }
        }
        C54969Lhl.LIZJ = System.currentTimeMillis();
        C54969Lhl.LIZLLL = System.currentTimeMillis();
        C54969Lhl.LJFF = 0;
        C54969Lhl.LJ = 0L;
        if (TextUtils.isEmpty(keva2.getString("nu_popup_clean_first_login_sec", ""))) {
            keva2.storeString("nu_popup_clean_first_login_sec", secUid);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final long LJIJJLI(AwemeHostApplication context) {
        o.LJIIIZ(context, "context");
        return C39687Fhr.LJ(context);
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJJIFFI(Aweme aweme) {
        boolean z;
        boolean z2;
        if (C54840Lfg.LJJZ(aweme) && C54840Lfg.LJJZZI(aweme) && !C54838Lfe.LJJI(aweme)) {
            C52452KiG.LIZ.getClass();
            if (C52452KiG.LIZ(aweme) && !C220858ld.LJIIIIZZ(aweme)) {
                z = true;
                if (C54840Lfg.LJJZ(aweme) && aweme.getVideoControl() != null && aweme.getVideoControl().showProgressBar == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z && !z2) {
                    return false;
                }
                return true;
            }
        }
        z = false;
        if (C54840Lfg.LJJZ(aweme)) {
        }
        z2 = false;
        if (z) {
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJJII(String id) {
        o.LJIIIZ(id, "id");
        if (C54935LhD.LIZIZ(id) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJJIII(Aweme aweme) {
        if (aweme != null) {
            return C210018Mb.LIZIZ(aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJJIIZ(String secUid) {
        o.LJIIIZ(secUid, "secUid");
        Keva keva = C54935LhD.LIZJ;
        String string = keva.getString("new_user_dialog_clean_first_login_sec", "");
        if (!TextUtils.isEmpty(secUid) && string.equals(secUid)) {
            int LIZJ = i0.LIZJ("new_user_dialog_clean_cold_start_count", secUid, keva, 0);
            long j = keva.getLong(i0.LJFF("new_user_dialog_clean_first_launch_time", secUid), System.currentTimeMillis());
            int LIZJ2 = i0.LIZJ("new_user_cold_start_after_first_launch", secUid, keva, 0);
            keva.storeInt("new_user_dialog_clean_cold_start_count", LIZJ);
            keva.storeLong("new_user_dialog_clean_first_launch_time", j);
            keva.storeInt("new_user_cold_start_after_first_launch", LIZJ2);
        }
        Keva keva2 = C54969Lhl.LIZ;
        keva2.storeFloat(C54969Lhl.LIZ("nu_last_session_stay_time"), C54969Lhl.LIZJ());
        C54969Lhl.LIZJ = System.currentTimeMillis();
        C54969Lhl.LJ = 0L;
        String string2 = keva2.getString("nu_popup_clean_first_login_sec", "");
        if (!TextUtils.isEmpty(secUid) && o.LJ(secUid, string2)) {
            int i = keva2.getInt(i0.LJFF("nu_dialog_clean_cold_start_count", secUid), 0);
            int i2 = keva2.getInt(i0.LJFF("nu_active_day", secUid), 0);
            String string3 = keva2.getString(i0.LJFF("nu_last_active_day", secUid), "");
            long j2 = keva2.getLong(i0.LJFF("nu_vv_count", secUid), 0L);
            float f = keva2.getFloat(i0.LJFF("nu_last_session_stay_time", secUid), 0.0f);
            int i3 = keva2.getInt(i0.LJFF("nu_popup_time_window_status", secUid), 0);
            int i4 = keva2.getInt(i0.LJFF("nu_popup_vv_window_status", secUid), 0);
            keva2.storeInt("nu_dialog_clean_cold_start_count", i);
            keva2.storeInt("nu_active_day", i2);
            keva2.storeString("nu_last_active_day", string3);
            keva2.storeLong("nu_vv_count", j2);
            keva2.storeFloat("nu_last_session_stay_time", f);
            keva2.storeInt("nu_popup_time_window_status", i3);
            keva2.storeInt("nu_popup_vv_window_status", i4);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJJIJIIJI(Object obj) {
        return obj instanceof FeedItemList;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJJIJIL(String id) {
        o.LJIIIZ(id, "id");
        return C54935LhD.LJ(id);
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LIZIZ(Fragment fragment, InterfaceC88472Yns<? super AKT, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(fragment, "fragment");
        AKT hv0 = ((BottomToastVM) ViewModelProviders.of(fragment).get(BottomToastVM.class)).hv0();
        if (hv0 == null) {
            return;
        }
        interfaceC88472Yns.invoke(hv0);
        hv0.LJII();
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LIZJ(String str, String str2) {
        PopupRuleData$PopupGroup LIZ;
        HashMap hashMap;
        PopupRuleData$VVControl vvControl;
        Integer maxCountInVVInterval;
        PopupRuleData$OnlineControl onlineControl;
        Integer maxCountInTimeInterval;
        Integer maxCountInEachSession;
        String str3;
        PopupRuleData$Popup popupRuleData$Popup;
        boolean z = false;
        if (LJJIJ()) {
            NewUserPopupCleanRule.RuleGroup LIZ2 = NewUserPopupCleanRule.LIZ(str2);
            if (LIZ2 != null && ((HashMap) NewUserPopupCleanRule.LIZLLL.getValue()).containsKey(str2)) {
                Integer maxCountInSession = LIZ2.getMaxCountInSession();
                if (maxCountInSession != null) {
                    maxCountInSession.intValue();
                    C54969Lhl.LJIIIIZZ(2, C54969Lhl.LJI + 1);
                }
                Integer maxCountInTimeInterval2 = LIZ2.getMaxCountInTimeInterval();
                if (maxCountInTimeInterval2 != null) {
                    int intValue = maxCountInTimeInterval2.intValue();
                    Float timeInterval = LIZ2.getTimeInterval();
                    if (timeInterval != null) {
                        timeInterval.floatValue();
                        int LIZLLL = C54969Lhl.LIZLLL() + 1;
                        if (LIZLLL == intValue) {
                            C54969Lhl.LIZ.storeFloat(C54969Lhl.LIZ("nu_last_popup_staytime"), C54969Lhl.LIZJ());
                        }
                        C54969Lhl.LJIIIIZZ(3, LIZLLL);
                    }
                }
                Integer maxCountInVVInterval2 = LIZ2.getMaxCountInVVInterval();
                if (maxCountInVVInterval2 != null) {
                    int intValue2 = maxCountInVVInterval2.intValue();
                    Integer vvInterval = LIZ2.getVvInterval();
                    if (vvInterval != null) {
                        vvInterval.intValue();
                        int LJFF = C54969Lhl.LJFF();
                        long LJ = C54969Lhl.LJ();
                        int i = LJFF + 1;
                        if (i == intValue2) {
                            C54969Lhl.LIZ.storeLong(C54969Lhl.LIZ("nu_last_popup_vv_count"), LJ);
                        }
                        C54969Lhl.LJIIIIZZ(4, i);
                    }
                }
            }
        } else {
            FJG.LIZ.getClass();
            if (FJG.LIZ() && (LIZ = C2ZO.LIZ(str2)) != null && (hashMap = (HashMap) C2ZO.LIZIZ.getValue()) != null && hashMap.containsKey(str2)) {
                PopupRuleData$PopupRule showLimit = LIZ.getShowLimit();
                if (showLimit != null && (maxCountInEachSession = showLimit.getMaxCountInEachSession()) != null) {
                    maxCountInEachSession.intValue();
                    C54969Lhl.LJIIIIZZ(2, C54969Lhl.LJI + 1);
                }
                PopupRuleData$PopupRule showLimit2 = LIZ.getShowLimit();
                if (showLimit2 != null && (onlineControl = showLimit2.getOnlineControl()) != null && (maxCountInTimeInterval = onlineControl.getMaxCountInTimeInterval()) != null) {
                    int intValue3 = maxCountInTimeInterval.intValue();
                    Integer requiredTimeInterval = LIZ.getShowLimit().getOnlineControl().getRequiredTimeInterval();
                    if (requiredTimeInterval != null) {
                        requiredTimeInterval.intValue();
                        int LIZLLL2 = C54969Lhl.LIZLLL() + 1;
                        if (LIZLLL2 == intValue3) {
                            C54969Lhl.LIZ.storeFloat(C54969Lhl.LIZ("nu_last_popup_staytime"), C54969Lhl.LIZJ());
                        }
                        C54969Lhl.LJIIIIZZ(3, LIZLLL2);
                    }
                }
                PopupRuleData$PopupRule showLimit3 = LIZ.getShowLimit();
                if (showLimit3 != null && (vvControl = showLimit3.getVvControl()) != null && (maxCountInVVInterval = vvControl.getMaxCountInVVInterval()) != null) {
                    int intValue4 = maxCountInVVInterval.intValue();
                    Integer requiredVVInterval = LIZ.getShowLimit().getVvControl().getRequiredVVInterval();
                    if (requiredVVInterval != null) {
                        requiredVVInterval.intValue();
                        int LJFF2 = C54969Lhl.LJFF();
                        long LJ2 = C54969Lhl.LJ();
                        int i2 = LJFF2 + 1;
                        if (i2 == intValue4) {
                            C54969Lhl.LIZ.storeLong(C54969Lhl.LIZ("nu_last_popup_vv_count"), LJ2);
                        }
                        C54969Lhl.LJIIIIZZ(4, i2);
                    }
                }
            }
        }
        HashMap hashMap2 = (HashMap) C2ZO.LIZIZ.getValue();
        if (hashMap2 != null) {
            z = hashMap2.containsKey(str2);
        }
        FJG.LIZ.getClass();
        if (FJG.LIZ() && C35843E4x.LIZ() == 0 && (popupRuleData$Popup = (PopupRuleData$Popup) ((HashMap) C2ZO.LIZJ.getValue()).get(str2)) != null) {
            str3 = popupRuleData$Popup.getContainerId();
        } else {
            str3 = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, str);
        if (TextUtils.isEmpty(str3)) {
            c188727au.LJI("popup_code", str2);
            c188727au.LJI("content_popup_id", "");
        } else {
            c188727au.LJI("popup_code", str3);
            c188727au.LJI("content_popup_id", str2);
        }
        if (z) {
            c188727au.LJI("action_type", "fcp_registered");
        } else {
            c188727au.LJI("action_type", "fcp_unregistered");
        }
        c188727au.LJ(C54969Lhl.LJ, "launch_vv");
        c188727au.LJ(System.currentTimeMillis() - C54969Lhl.LIZLLL, "launch_time_ms");
        c188727au.LIZLLL(C54969Lhl.LJFF, "launch_popup_cnt");
        FMX.LJIIL("show_core_fdmt_popup_status", c188727au.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc A[ADDED_TO_REGION] */
    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl.LJFF(java.lang.String, java.lang.String):boolean");
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJII(String str, boolean z) {
        C188727au c188727au = new C188727au();
        c188727au.LJFF(Boolean.valueOf(z), "intercept");
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("dialog_name", str);
        FMX.LJIIL("newuser_intercept_dialog", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final int LJIIZILJ(Context context, Aweme aweme) {
        boolean z;
        boolean z2;
        if (context == null) {
            return 0;
        }
        M89 LIZ = C2S6.LIZ(context);
        boolean isFromEffectDiscover = LIZ.isFromEffectDiscover();
        boolean isHideMusicText = LIZ.isHideMusicText();
        if (aweme != null) {
            z = aweme.isPaidContent;
        } else {
            z = false;
        }
        boolean z3 = !z;
        boolean LJJIII = CommentServiceImpl.LJJL().LJJIII(LIZ, aweme, Boolean.valueOf(LIZ.isMyProfile()), Integer.valueOf(LIZ.getPageType()), LIZ.getEventType());
        if (C57188McS.LIZ() && C52939Kq7.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!isHideMusicText && (isFromEffectDiscover || C57188McS.LIZJ(aweme, context, null) || !z3 || z2 || LJJIII)) {
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113 A[ADDED_TO_REGION] */
    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIIJZLJL(java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl.LJJIIJZLJL(java.lang.String, java.lang.String):boolean");
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIILJJIL(String enterFrom, String str, String str2, String popupId) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(popupId, "popupId");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("group_id", str);
        c188727au.LJIIIZ("author_id", str2);
        c188727au.LJIIIZ("popup_code", popupId);
        FMX.LJIIL("show_core_fdmt_popup", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJJIJL(int i, int i2, String str, String str2) {
        if (i == 1 && i2 == 1) {
            SVF.LJIIIZ(str, str2);
            return;
        }
        if (i == 1) {
            if (i2 != 2) {
                return;
            }
            SVF.LJIIIIZZ(str, str2);
            return;
        }
        if (i == 2) {
            if (i2 == 1) {
                SVF.LJIIJJI(str, str2);
                return;
            }
        } else if (i != 2) {
            return;
        }
        if (i2 != 2) {
            return;
        }
        SVF.LJIIJ(str, str2);
    }
}
