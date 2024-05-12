package X;

import android.content.Context;
import android.os.Message;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.api.NoticeCountFetchManager$coldStartCombineRequest$1;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.request_combine.model.NoticeCountCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class END extends EI3 {
    public BaseCombineMode LIZ;

    @Override // X.EI4
    public final String LIZ() {
        if (HG3.LJIILL().isLogin()) {
            return "/aweme/v1/notice/count/";
        }
        return null;
    }

    @Override // X.EI4
    public final BaseCombineMode LIZJ() {
        return this.LIZ;
    }

    @Override // X.EI4
    public final java.util.Map<String, String> LIZIZ(Context context) {
        boolean LIZLLL;
        boolean booleanValue;
        HashMap LIZJ = C03660Ck.LIZJ("source", "1");
        LIZJ.put("ab_settings", C35363DuJ.LIZ());
        LiveOuterService.LJJJLL().LJIIJJI();
        if (C55661Lsv.LJFF()) {
            if (ENH.LIZ()) {
                booleanValue = true;
            } else {
                Object LIZJ2 = C0F0.LIZIZ().LIZJ(Boolean.TRUE, "following_inbox_bubble_enable");
                o.LJIIIIZZ(LIZJ2, "get()\n                .g…box_bubble_enable\", true)");
                booleanValue = ((Boolean) LIZJ2).booleanValue();
            }
            if (booleanValue) {
                LIZJ.put("need_hv_follow_count", "true");
            }
        }
        if (ENE.LIZ == null) {
            synchronized (ENE.class) {
                if (ENE.LIZ == null) {
                    ENE.LIZ = new ENE();
                }
            }
        }
        int i = 0;
        if (ENE.LIZ != null) {
            int LIZ = C00F.LIZ(31744, 0, "second_tab_last_status", true);
            if (LIZ == 0) {
                LIZLLL = true;
            } else if (LIZ == 1) {
                LIZLLL = false;
            } else {
                Object LIZ2 = AXW.LIZ(EF7.LIZIZ(), InterfaceC26386AXe.class);
                o.LJIIIIZZ(LIZ2, "getSP(AppContextManager.…bPreferences::class.java)");
                LIZLLL = ((InterfaceC26386AXe) LIZ2).LIZLLL();
            }
            if (LIZLLL) {
                i = 1;
            }
        }
        LIZJ.put("second_tab_type", String.valueOf(i ^ 1));
        LIZJ.put("follow_tab_position", String.valueOf(1));
        if (C55888Lwa.LIZIZ.LJJJJIZL()) {
            LIZJ.put("need_latest_notice_time", "true");
        }
        return LIZJ;
    }

    @Override // X.EI4
    public final void LIZLLL(EHL transaction) {
        o.LJIIIZ(transaction, "transaction");
        transaction.LIZLLL(new NoticeCountFetchManager$coldStartCombineRequest$1());
    }

    @Override // X.EI3
    public final void LJFF(SettingCombineModel settingCombineModel) {
        NoticeCountCombineModel noticeCountCombineModel;
        SettingCombineDataModel data;
        NoticeList noticeList = null;
        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
            noticeCountCombineModel = data.getNoticeCountModel();
        } else {
            noticeCountCombineModel = null;
        }
        boolean z = false;
        boolean z2 = true;
        if (noticeCountCombineModel != null && noticeCountCombineModel.httpCode == 200) {
            z2 = C79004UzY.LJJIFFI(noticeCountCombineModel.getNoticeList().getItems());
            Message obtain = Message.obtain();
            obtain.obj = noticeCountCombineModel.getNoticeList();
            obtain.what = 0;
            if (ENR.LIZ()) {
                C54362LVe.LJIIIZ().LJI(obtain);
            } else {
                C54362LVe.LJIIL().LJII(obtain);
            }
            C55888Lwa c55888Lwa = C55888Lwa.LIZIZ;
            Object obj = obtain.obj;
            if (obj instanceof NoticeList) {
                noticeList = (NoticeList) obj;
            }
            c55888Lwa.LJJJIL(noticeList);
            z = true;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("error_type", "combine_yellow_dot");
        c188727au.LJFF(Boolean.valueOf(z), "is_success");
        c188727au.LJFF(Boolean.valueOf(z2), "is_empty");
        FMX.LJIIL("homepage_follow_monitor", c188727au.LIZ);
    }

    @Override // X.EI3
    public final boolean LJI(SettingCombineModel settingCombineModel) {
        NoticeCountCombineModel noticeCountCombineModel;
        NoticeList noticeList;
        SettingCombineDataModel data;
        if (settingCombineModel != null && (data = settingCombineModel.getData()) != null) {
            noticeCountCombineModel = data.getNoticeCountModel();
        } else {
            noticeCountCombineModel = null;
        }
        if (noticeCountCombineModel == null || (noticeList = noticeCountCombineModel.getNoticeList()) == null || noticeList.status_code != 0) {
            return false;
        }
        this.LIZ = noticeCountCombineModel;
        if (noticeCountCombineModel != null && noticeCountCombineModel.httpCode == 200) {
            return true;
        }
        return false;
    }
}
