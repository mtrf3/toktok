package Y;

import X.C113554cx;
import X.C30E;
import X.C34B;
import X.C3Q9;
import X.C42307Gj1;
import X.C4PO;
import X.C4PP;
import X.C4WC;
import X.C68322mC;
import X.C75782yE;
import X.C75792yF;
import X.C76082yi;
import X.C76800UCe;
import X.C80763Ey;
import X.FMX;
import X.HG3;
import X.InterfaceC57312Mt;
import X.ORZ;
import X.OSZ;
import X.RBX;
import X.X1D;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.SessionListReadStatusViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ACallableS79S0200000_1 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$0(ACallableS79S0200000_1 aCallableS79S0200000_1) {
        return Boolean.valueOf(C42307Gj1.LJ((Bitmap) aCallableS79S0200000_1.l0, new File((String) ((C68322mC) aCallableS79S0200000_1.l1).element), 60, Bitmap.CompressFormat.PNG));
    }

    public static final Object call$1(ACallableS79S0200000_1 aCallableS79S0200000_1) {
        return BaseListFragmentPanel.lambda$updateAwesomeInfo$16((Aweme) aCallableS79S0200000_1.l0, (InterfaceC57312Mt) aCallableS79S0200000_1.l1);
    }

    public static final Object call$2(ACallableS79S0200000_1 aCallableS79S0200000_1) {
        if (!((List) aCallableS79S0200000_1.l0).isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("syncSessionReadStatusFromNet: ");
            LIZ.append(((List) aCallableS79S0200000_1.l0).size());
            C34B.LIZIZ("MessageStatus-SessionListReadStatusViewModel", X1D.LIZIZ(LIZ));
            SessionListReadStatusViewModel sessionListReadStatusViewModel = (SessionListReadStatusViewModel) aCallableS79S0200000_1.l1;
            List list = (List) aCallableS79S0200000_1.l0;
            if (sessionListReadStatusViewModel.LJLJJI) {
                return null;
            }
            sessionListReadStatusViewModel.LJLJJI = true;
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C4WC.LIZIZ.LJIIJ(new IDcS364S0100000_1(sessionListReadStatusViewModel, 22), list);
            return null;
        }
        return null;
    }

    public static final Object call$3(ACallableS79S0200000_1 aCallableS79S0200000_1) {
        String str;
        String str2;
        if (((C4PP) aCallableS79S0200000_1.l0) == C4PP.CLICK) {
            str = "now_posted_top_click";
        } else {
            str = "now_posted_top_show";
        }
        String aid = ((C4PO) aCallableS79S0200000_1.l1).LLI.getAid();
        if (aid == null) {
            aid = "";
        }
        NowPostInfo nowPostInfo = ((C4PO) aCallableS79S0200000_1.l1).LLI.nowPostInfo;
        if (nowPostInfo != null) {
            str2 = nowPostInfo.getNowMediaType();
        } else {
            str2 = null;
        }
        FMX.LJIILL(str, new OSZ(aid, "item_id"), new OSZ(str2, "now_type"));
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS79S0200000_1 aCallableS79S0200000_1) {
        Map<Long, Long> map;
        Long value;
        ArrayList arrayList = new ArrayList();
        User LIZJ = C80763Ey.LIZJ();
        if (LIZJ != null && LIZJ.getUid() != null) {
            C30E c30e = (C30E) aCallableS79S0200000_1.l0;
            List list = (List) aCallableS79S0200000_1.l1;
            if (c30e != null && (map = c30e.LIZ) != null) {
                for (Map.Entry<Long, Long> entry : map.entrySet()) {
                    if (list.contains(entry.getKey()) && (value = entry.getValue()) != null && value.longValue() > 0) {
                        Long key = entry.getKey();
                        o.LJIIIIZZ(key, "entry.key");
                        arrayList.add(key);
                    }
                }
            }
        }
        return ORZ.LLJI(arrayList);
    }

    public static final Object call$5(ACallableS79S0200000_1 aCallableS79S0200000_1) {
        double d;
        Map LJJLIL = C113554cx.LJJLIL(C76082yi.LIZJ());
        List list = (List) aCallableS79S0200000_1.l0;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LJJLIL.remove(it.next());
            }
        }
        List<String> list2 = (List) aCallableS79S0200000_1.l1;
        if (list2 != null && !list2.isEmpty()) {
            for (String str : list2) {
                Double d2 = (Double) ((LinkedHashMap) LJJLIL).get(str);
                if (d2 != null) {
                    d = d2.doubleValue();
                } else {
                    d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                }
                double d3 = d + 1.0d;
                if (d3 < 3.0d) {
                    LJJLIL.put(str, Double.valueOf(d3));
                } else {
                    LJJLIL.remove(str);
                    C76082yi.LIZ(str);
                }
            }
        }
        Keva.getRepo("upvote_publish_cache").storeString(i0.LJFF("upvote_publish_failed_3_times_", ((RBX) HG3.LJIILL()).getCurUserId()), C75792yF.LIZJ(LJJLIL));
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS79S0200000_1 aCallableS79S0200000_1) {
        return ((ChatViewModel) aCallableS79S0200000_1.l0).LJLIL.LIZ(((Long) aCallableS79S0200000_1.l1).longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS79S0200000_1(Object obj, Bitmap bitmap, C68322mC<String> c68322mC) {
        this.$t = c68322mC;
        this.l0 = obj;
        this.l1 = bitmap;
    }
}
