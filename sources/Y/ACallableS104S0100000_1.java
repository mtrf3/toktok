package Y;

import X.C0MA;
import X.C109544Rq;
import X.C2TU;
import X.C2ZZ;
import X.C34B;
import X.C36922EeM;
import X.C3E5;
import X.C62822Ol8;
import X.C63089OpR;
import X.C76800UCe;
import X.C775532p;
import X.C78983UzD;
import X.C80763Ey;
import X.C81143Gk;
import X.C81243Gu;
import X.EnumC62082c8;
import X.EnumC96113pv;
import X.FMX;
import X.InterfaceC65784Pro;
import X.X1D;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.api.FeedActionApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.api.DislikeReasonApi;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ACallableS104S0100000_1 implements Callable {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ Object call$15(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        return ((InterfaceC65784Pro) aCallableS104S0100000_1.l0).invoke();
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
            case 19:
                return call$19(this);
            case 20:
                return call$20(this);
            case 21:
                return call$21(this);
            case 22:
                return call$22(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        ((InterfaceC65784Pro) aCallableS104S0100000_1.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        C78983UzD.LJIJ((Throwable) aCallableS104S0100000_1.l0, "EcomPageMonitor: fail to replace ErrorHandler");
        return C76800UCe.LIZ;
    }

    public static final Object call$10(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        List list = (List) aCallableS104S0100000_1.l0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C109544Rq) obj).getMsgType() == 40) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    public static final Object call$11(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        Iterator it = ((List) aCallableS104S0100000_1.l0).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$12(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        String str = (String) ((Object[]) aCallableS104S0100000_1.l0)[0];
        FeedActionApi.LIZ(str);
        return str;
    }

    public static final Object call$13(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        String str = (String) ((Object[]) aCallableS104S0100000_1.l0)[0];
        FeedActionApi.LIZIZ(str);
        return str;
    }

    public static final Object call$14(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        ((InterfaceC65784Pro) aCallableS104S0100000_1.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$16(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        ((Runnable) aCallableS104S0100000_1.l0).run();
        return Boolean.TRUE;
    }

    public static final Object call$17(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        ((Runnable) aCallableS104S0100000_1.l0).run();
        return Boolean.TRUE;
    }

    public static final Object call$18(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        ((InterfaceC65784Pro) aCallableS104S0100000_1.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$19(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        Integer num;
        C81143Gk c81143Gk = C81143Gk.LIZ;
        List<C63089OpR> list = (List) aCallableS104S0100000_1.l0;
        c81143Gk.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("transfer ImMemberList origin list size : ");
        C81243Gu c81243Gu = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ));
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C63089OpR c63089OpR : list) {
                String secUid = c63089OpR.getSecUid();
                if (secUid == null || secUid.length() == 0) {
                    secUid = C3E5.LIZJ(String.valueOf(c63089OpR.getUid()));
                }
                C81243Gu c81243Gu2 = new C81243Gu(String.valueOf(c63089OpR.getUid()), secUid);
                c81243Gu2.setMember(c63089OpR);
                if (c63089OpR.getRole() == EnumC96113pv.OWNER.getValue()) {
                    ListProtector.add(arrayList, 0, c81243Gu2);
                } else {
                    arrayList.add(c81243Gu2);
                }
                if (o.LJ(c81243Gu2.getUid(), C80763Ey.LIZ(false))) {
                    c81243Gu = c81243Gu2;
                }
            }
            if (c81243Gu != null) {
                arrayList.remove(c81243Gu);
                ListProtector.add(arrayList, 0, c81243Gu);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("transfer ImMemberList result list size : ");
        LIZ2.append(arrayList.size());
        C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ2));
        return arrayList;
    }

    public static final Object call$2(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        C78983UzD.LJIJ((Throwable) aCallableS104S0100000_1.l0, "EcomPageMonitor: fail to restore ErrorHandler");
        return C76800UCe.LIZ;
    }

    public static final Object call$20(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        C36922EeM.LIZLLL(4, "aweme/v1/user", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), (ProfileUser) aCallableS104S0100000_1.l0));
        return null;
    }

    public static final Object call$21(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        Aweme aweme = (Aweme) aCallableS104S0100000_1.l0;
        if (aweme != null) {
            aweme.getCardInsertInfo();
        }
        if (C2ZZ.LIZLLL().isEmpty()) {
            return Boolean.valueOf(((CopyOnWriteArrayList) C2ZZ.LJI.getValue()).add((Aweme) aCallableS104S0100000_1.l0));
        }
        C62822Ol8 c62822Ol8 = C2ZZ.LJI;
        if (!((CopyOnWriteArrayList) c62822Ol8.getValue()).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) c62822Ol8.getValue()).iterator();
            while (it.hasNext()) {
                C2ZZ.LIZ((Aweme) it.next());
            }
            ((CopyOnWriteArrayList) C2ZZ.LJI.getValue()).clear();
        }
        C2ZZ.LIZ((Aweme) aCallableS104S0100000_1.l0);
        return C76800UCe.LIZ;
    }

    public static final Object call$22(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        FMX.LJIIL("enter_homepage_message", (HashMap) aCallableS104S0100000_1.l0);
        return null;
    }

    public static final Object call$3(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        ((InterfaceC65784Pro) aCallableS104S0100000_1.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        C36922EeM.LIZLLL(4, "aweme/v1/user", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), (UserResponse) aCallableS104S0100000_1.l0));
        return null;
    }

    public static final Object call$5(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        for (Aweme aweme : (List) aCallableS104S0100000_1.l0) {
            if (aweme != null && aweme.isAd()) {
                C2TU.LIZ(aweme, "feedApi");
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        String str;
        for (Aweme aweme : (List) aCallableS104S0100000_1.l0) {
            if (aweme != null) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                String str2 = null;
                if (awemeRawAd != null) {
                    str = awemeRawAd.getLynxRawData();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        str2 = awemeRawAd2.getLynxRawData();
                    }
                    str2 = new JSONObject(str2).optString("star_sec_uid");
                }
                if (!TextUtils.isEmpty(str2)) {
                    ((C0MA) C775532p.LIZ.getValue()).put(str2, 0);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$7(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        int d;
        try {
            FMX.LJIIL("prf_zero_video_view", (Map) aCallableS104S0100000_1.l0);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("reportForLastBoot:##prf_zero_video_view, params:##");
            LIZ.append((Map) aCallableS104S0100000_1.l0);
            d = Log.d("ZeroVideoViewLogger", X1D.LIZIZ(LIZ));
        } catch (Throwable th) {
            d = Log.d("ZeroVideoViewLogger", "reportForLastBoot", th);
        }
        return Integer.valueOf(d);
    }

    public static final Object call$8(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        for (MediaModel mediaModel : (List) aCallableS104S0100000_1.l0) {
            if (mediaModel.type == 4) {
                return VEUtils.getVideoFileInfo(mediaModel.fileLocalUriPath);
            }
        }
        return null;
    }

    public static final Object call$9(ACallableS104S0100000_1 aCallableS104S0100000_1) {
        Object obj = ((Object[]) aCallableS104S0100000_1.l0)[0];
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        Object obj2 = ((Object[]) aCallableS104S0100000_1.l0)[1];
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        DislikeReasonApi.LIZ(str, (Aweme) obj, String.valueOf(EnumC62082c8.CommitDislikeItemReasonOnly.ordinal()));
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS104S0100000_1(InterfaceC65784Pro function, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        switch (interfaceC65784Pro) {
            case null:
            case 3:
            case 14:
            case 18:
                this.l0 = function;
                return;
            default:
                o.LJIIIZ(function, "function");
                this.l0 = function;
                return;
        }
    }

    public ACallableS104S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
