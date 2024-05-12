package Y;

import X.AbstractC174686tM;
import X.C1I1;
import X.C200537tx;
import X.C223998qh;
import X.C36922EeM;
import X.C51029K0z;
import X.C76800UCe;
import X.C76W;
import X.C78996UzQ;
import X.C7G8;
import X.C7G9;
import X.C7X6;
import X.C8IM;
import X.C8YN;
import X.FMX;
import X.InterfaceC65784Pro;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.experiment.CommentSampleRateSetting;
import com.ss.android.ugc.aweme.feed.assem.contentclassificationmask.ContentClassificationMaskAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.nows.feed.ui.NowExposeMobAssem;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent;
import com.ss.android.ugc.feed.platform.panel.player.PlayerComponentTemp;
import com.ss.android.ugc.feed.platform.panel.player.PlayerPanelComponent;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ACallableS106S0100000_3 implements Callable {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ Object call$10(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        return ((InterfaceC65784Pro) aCallableS106S0100000_3.l0).invoke();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return call$16(this);
            case 17:
                return call$17(this);
            case 18:
                return call$18(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        String str;
        Object obj;
        Object obj2;
        Object[] objArr = (Object[]) aCallableS106S0100000_3.l0;
        String str2 = "";
        if (objArr.length <= 1 || (obj2 = objArr[1]) == null) {
            str = "";
        } else {
            str = (String) obj2;
        }
        if (objArr.length > 2 && (obj = objArr[2]) != null) {
            str2 = (String) obj;
        }
        return DetailApi.LIZLLL(0, (String) objArr[0], str, str2, 0, 0, null);
    }

    public static final Object call$1(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        C200537tx c200537tx = (C200537tx) aCallableS106S0100000_3.l0;
        c200537tx.LJFF.storeInt(C200537tx.LIZ("continuous_not_like_count"), c200537tx.LJFF.getInt(C200537tx.LIZ("continuous_not_like_count"), 0) + 1);
        int i = ((C200537tx) aCallableS106S0100000_3.l0).LJFF.getInt(C200537tx.LIZ("continuous_not_like_count"), 0);
        C200537tx c200537tx2 = (C200537tx) aCallableS106S0100000_3.l0;
        if (i >= c200537tx2.LJ) {
            c200537tx2.LJFF.storeInt(C200537tx.LIZ("continuous_not_like_count"), 0);
            C200537tx c200537tx3 = (C200537tx) aCallableS106S0100000_3.l0;
            c200537tx3.LJFF.storeLong(C200537tx.LIZ("not_show_guide_until"), System.currentTimeMillis());
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$11(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        boolean z;
        String aid;
        try {
            aid = ((Aweme) aCallableS106S0100000_3.l0).getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
        } catch (Exception e) {
            if (C36922EeM.LIZ) {
                C36922EeM.LJFF(e);
            }
        }
        if (C7X6.LJ(aid, "1").status_code == 0) {
            z = true;
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public static final Object call$12(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        boolean z;
        String aid;
        try {
            aid = ((Aweme) aCallableS106S0100000_3.l0).getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
        } catch (Exception e) {
            if (C36922EeM.LIZ) {
                C36922EeM.LJFF(e);
            }
        }
        if (C7X6.LJ(aid, CardStruct.IStatusCode.DEFAULT).status_code == 0) {
            z = true;
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public static final Object call$13(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        AbstractC174686tM abstractC174686tM = (AbstractC174686tM) aCallableS106S0100000_3.l0;
        if (abstractC174686tM.LIZ() && CommentSampleRateSetting.LIZ(0.15f, "comment_pref_monitor")) {
            FMX.LJIILJJIL(abstractC174686tM.LIZ, abstractC174686tM.LIZJ());
        }
        abstractC174686tM.LIZIZ();
        return C76800UCe.LIZ;
    }

    public static final Object call$14(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - ((PlayerComponentTemp) aCallableS106S0100000_3.l0).LJLLILLLL;
        MobClick LIZLLL = C1I1.LIZLLL("video_request_leave", "perf_monitor");
        C76W c76w = new C76W();
        c76w.LIZ("duration", String.valueOf(elapsedRealtime));
        LIZLLL.setJsonObject(c76w.LIZIZ());
        FMX.onEvent(LIZLLL);
        return null;
    }

    public static final Object call$15(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        return Boolean.valueOf(((CellAdaptionComponent) aCallableS106S0100000_3.l0).k4(false));
    }

    public static final Object call$16(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        ((VideoItemParams) C51029K0z.LJIILLIIL((ContentClassificationMaskAssem) aCallableS106S0100000_3.l0)).setAweme(DetailFeedServiceImpl.LJIIJ().LIZ(((VideoItemParams) C51029K0z.LJIILLIIL((ContentClassificationMaskAssem) aCallableS106S0100000_3.l0)).getAweme().getAid(), ""));
        return null;
    }

    public static final Object call$17(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        ((CommentListFragment) aCallableS106S0100000_3.l0).so();
        return null;
    }

    public static final Object call$18(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        NowExposeMobAssem nowExposeMobAssem = (NowExposeMobAssem) aCallableS106S0100000_3.l0;
        C8YN.LJIJI((AssemViewModel) nowExposeMobAssem.LJZL.LIZ(nowExposeMobAssem, NowExposeMobAssem.LLI[0]), new AqS169S0100000_3(nowExposeMobAssem, 973));
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        C200537tx c200537tx = (C200537tx) aCallableS106S0100000_3.l0;
        c200537tx.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (c200537tx.LIZJ > 0) {
            if ((c200537tx.LIZJ * 86400000) + c200537tx.LJFF.getLong(C200537tx.LIZ("not_show_guide_until"), 0L) > currentTimeMillis) {
                c200537tx.LIZIZ(false);
                return Boolean.valueOf(z);
            }
        }
        if (c200537tx.LIZLLL >= 0 && c200537tx.LIZIZ >= 0) {
            if ((c200537tx.LIZIZ * 86400000) + c200537tx.LJFF.getLong(C200537tx.LIZ("limit_day_time"), 0L) < currentTimeMillis) {
                c200537tx.LJFF.storeInt(C200537tx.LIZ("day_period_count"), 0);
                c200537tx.LJFF.storeLong(C200537tx.LIZ("limit_day_time"), System.currentTimeMillis());
            }
            if (c200537tx.LJFF.getInt(C200537tx.LIZ("day_period_count"), 0) < c200537tx.LIZLLL) {
                c200537tx.LJFF.storeInt(C200537tx.LIZ("day_period_count"), c200537tx.LJFF.getInt(C200537tx.LIZ("day_period_count"), 0) + 1);
            } else {
                c200537tx.LIZIZ(true);
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }

    public static final Object call$3(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        ((C200537tx) aCallableS106S0100000_3.l0).LJFF.storeInt(C200537tx.LIZ("continuous_not_like_count"), 0);
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        C7G8 c7g8 = (C7G8) aCallableS106S0100000_3.l0;
        if (c7g8.LJLJL) {
            C7G9 c7g9 = c7g8.LJLJJLL;
            if (c7g9 != null) {
                c7g9.LJJI();
            }
            C7G9 c7g92 = ((C7G8) aCallableS106S0100000_3.l0).LJLJJLL;
            if (c7g92 != null) {
                c7g92.LJIILLIIL();
            }
            ((C7G8) aCallableS106S0100000_3.l0).LJLJL = false;
        }
        int childCount = ((C7G8) aCallableS106S0100000_3.l0).getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C7G8) aCallableS106S0100000_3.l0).getChildAt(i) instanceof C8IM) {
                C7G8 c7g82 = (C7G8) aCallableS106S0100000_3.l0;
                try {
                    if (C78996UzQ.LJJIIJZLJL(c7g82.getChildAt(i))) {
                        C78996UzQ.LJI();
                    }
                } catch (Throwable unused) {
                }
                c7g82.removeViewAt(i);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$5(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        Iterator<Aweme> it = ((FeedItemList) aCallableS106S0100000_3.l0).getItems().iterator();
        while (it.hasNext()) {
            Iterator<InteractStickerStruct> it2 = it.next().getInteractStickerStructs().iterator();
            while (it2.hasNext()) {
                C223998qh.LIZIZ(it2.next());
            }
        }
        return null;
    }

    public static final Object call$6(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        AppLogNewUtils.onEventV3("deeplink_first_frame", (JSONObject) aCallableS106S0100000_3.l0);
        return null;
    }

    public static final Object call$7(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - ((PlayerPanelComponent) aCallableS106S0100000_3.l0).LJLLL;
        MobClick LIZLLL = C1I1.LIZLLL("video_request_leave", "perf_monitor");
        C76W c76w = new C76W();
        c76w.LIZ("duration", String.valueOf(elapsedRealtime));
        LIZLLL.setJsonObject(c76w.LIZIZ());
        FMX.onEvent(LIZLLL);
        return null;
    }

    public static final Object call$8(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        AppLogNewUtils.onEventV3("traffic_perf_every_ten_minutes", (JSONObject) aCallableS106S0100000_3.l0);
        return null;
    }

    public static final Object call$9(ACallableS106S0100000_3 aCallableS106S0100000_3) {
        AppLogNewUtils.onEventV3("traffic_perf_in_first_ten_minutes", (JSONObject) aCallableS106S0100000_3.l0);
        return null;
    }

    public ACallableS106S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
