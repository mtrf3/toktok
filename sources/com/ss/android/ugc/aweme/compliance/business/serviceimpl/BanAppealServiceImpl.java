package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.ASL;
import X.ActivityC45651qj;
import X.C188727au;
import X.C1DG;
import X.C2060386t;
import X.C25568A1s;
import X.C48692J9c;
import X.C52541Kjh;
import X.C53284Kvg;
import X.C54928Lh6;
import X.C54929Lh7;
import X.C54930Lh8;
import X.C54931Lh9;
import X.C54936LhE;
import X.C58096Mr6;
import X.C62913Omb;
import X.C62914Omc;
import X.C73969T1h;
import X.FMX;
import X.HG3;
import X.InterfaceC55058LjC;
import X.KUN;
import X.RBX;
import X.T16;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.compliance.api.model.BanInfo;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService;
import com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;
import com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.GradientPunishWarning;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.api.AppealApi;
import com.ss.android.ugc.aweme.compliance.business.banappeal.warninginfo.AgsWarningInfoFragment;
import com.ss.android.ugc.aweme.compliance.business.banappeal.warninginfo.AgsWarningInfoSet;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.e1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class BanAppealServiceImpl implements IBanAppealService {
    public static IBanAppealService LJIIL() {
        Object LIZ = C58096Mr6.LIZ(IBanAppealService.class, false);
        if (LIZ != null) {
            return (IBanAppealService) LIZ;
        }
        if (C58096Mr6.LLLZLZ == null) {
            synchronized (IBanAppealService.class) {
                if (C58096Mr6.LLLZLZ == null) {
                    C58096Mr6.LLLZLZ = new BanAppealServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLZLZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void LIZ() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        FMX.LJIIL("violation_bubble_show", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void LJFF() {
        if (e1.LIZ(31744, "enable_account_status", true, false)) {
            AppealApi.LIZ.getClass();
            C54931Lh9.LIZIZ.syncAccountBannedDetails().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C54928Lh6.LJLIL, C25568A1s.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void LJIIJ() {
        C62914Omc c62914Omc = C62913Omb.LIZIZ;
        ArrayList arrayList = new ArrayList();
        c62914Omc.LIZJ = arrayList;
        c62914Omc.LIZIZ.storeString("account_banned_detail", GsonProtectorUtils.toJson(new Gson(), arrayList));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final boolean LIZJ() {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        GradientPunishWarning LIZ = C54929Lh7.LIZ();
        if (LIZ == null || LIZ.getWarnType() == 0) {
            KUN kun = C54929Lh7.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("has_click_warning_bubble_");
            LIZ2.append(curUserId);
            kun.LJI(X1D.LIZIZ(LIZ2), false);
            return false;
        }
        if (LIZ.getWarnType() < 2 || C2060386t.LIZ(LIZ.getBubbleText()) || C2060386t.LIZ(LIZ.getDetailUrl())) {
            return false;
        }
        String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId2, "userService().curUserId");
        KUN kun2 = C54929Lh7.LIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("has_click_warning_bubble_");
        LIZ3.append(curUserId2);
        if (kun2.LIZJ(X1D.LIZIZ(LIZ3), false)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final boolean LIZLLL() {
        return C53284Kvg.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final AgsWarningInfo LJI() {
        AgsWarningInfoSet LIZ = C52541Kjh.LIZ();
        if (LIZ != null) {
            return LIZ.itemPostWarningInfo;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final String LJIIIZ() {
        String bubbleText;
        GradientPunishWarning LIZ = C54929Lh7.LIZ();
        if (LIZ == null || (bubbleText = LIZ.getBubbleText()) == null) {
            return "";
        }
        return bubbleText;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final boolean LJIIJJI() {
        return C53284Kvg.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void LIZIZ(ActivityC45651qj context) {
        o.LJIIIZ(context, "context");
        C54929Lh7.LIZIZ(context, "float_warning");
        String curUid = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUid, "curUid");
        KUN kun = C54929Lh7.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("has_click_warning_bubble_");
        LIZ.append(curUid);
        kun.LJI(X1D.LIZIZ(LIZ), true);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "bubble");
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        FMX.LJIIL("enter_violation_record", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final boolean LJ(int i) {
        Integer banPlatform;
        if (e1.LIZ(31744, "enable_account_status", true, false)) {
            C62914Omc c62914Omc = C62913Omb.LIZIZ;
            List<BanInfo> list = c62914Omc.LIZJ;
            if (list == null) {
                try {
                    list = (List) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), c62914Omc.LIZIZ.getString("account_banned_detail", ""), new TypeToken<List<? extends BanInfo>>() { // from class: X.2UN
                    }.getType());
                    if (list != null) {
                    }
                } catch (NullPointerException unused) {
                }
            }
            if (!list.isEmpty()) {
                for (BanInfo banInfo : list) {
                    Integer banType = banInfo.getBanType();
                    if (banType != null && banType.intValue() == i && (banPlatform = banInfo.getBanPlatform()) != null && banPlatform.intValue() == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void LJII(ActivityC45651qj activityC45651qj) {
        String str;
        if (activityC45651qj instanceof InterfaceC55058LjC) {
            str = ((InterfaceC55058LjC) activityC45651qj).getEnterFrom();
        } else {
            str = "homepage_hot";
        }
        if (((RBX) HG3.LJIILL()).isLogin()) {
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "get().curUserId");
            GradientPunishWarning LIZ = C54929Lh7.LIZ();
            if (LIZ == null || LIZ.getWarnType() == 0) {
                KUN kun = C54929Lh7.LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("has_click_warning_dialog_");
                LIZ2.append(curUserId);
                kun.LJI(X1D.LIZIZ(LIZ2), false);
                return;
            }
            if (LIZ.getWarnType() < 3 || C2060386t.LIZ(LIZ.getDialogMessage()) || C2060386t.LIZ(LIZ.getDialogButton()) || C2060386t.LIZ(LIZ.getDetailUrl())) {
                return;
            }
            String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId2, "get().curUserId");
            KUN kun2 = C54929Lh7.LIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("has_click_warning_dialog_");
            LIZ3.append(curUserId2);
            if (kun2.LIZJ(X1D.LIZIZ(LIZ3), false)) {
                return;
            }
            IComplianceDependService LIZ4 = C54936LhE.LIZ();
            if (LIZ4 != null && LIZ4.LIZ()) {
                return;
            }
            PipServiceImpl.LJJII().LJIILJJIL();
            o.LJI(str);
            PopupManager.LJIIL(new C54930Lh8(activityC45651qj, str));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void LJIIIIZZ(ActivityC45651qj activityC45651qj) {
        AgsWarningInfo agsWarningInfo;
        AgsWarningInfoSet LIZ = C52541Kjh.LIZ();
        if (LIZ != null && (agsWarningInfo = LIZ.itemPostWarningInfo) != null && C53284Kvg.LIZ()) {
            AgsWarningInfoFragment agsWarningInfoFragment = new AgsWarningInfoFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("warningInfo", agsWarningInfo);
            agsWarningInfoFragment.setArguments(bundle);
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(agsWarningInfo.getWarningLevel(), "warning_level");
            FMX.LJIIL("tns_profile_page_ags_warning_window_show", c188727au.LIZ);
            TuxSheet tuxSheet = new ASL().LIZ;
            tuxSheet.LJLLILLLL = agsWarningInfoFragment;
            tuxSheet.LLD = false;
            tuxSheet.LL = false;
            tuxSheet.LJLJI = false;
            C1DG.LJII(activityC45651qj, "activity.supportFragmentManager", tuxSheet, "AgsItemPostWarningSheet");
            C48692J9c.LIZIZ(agsWarningInfo.getWarningLevel());
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    public final void jumpToAgsStatusPage(Context context, String enterFrom) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        C54929Lh7.LIZIZ(context, enterFrom);
    }
}
