package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1805776v;
import X.C1805976x;
import X.C196157mt;
import X.C212208Um;
import X.C43I;
import X.C73U;
import X.C76800UCe;
import X.C77H;
import X.C8HZ;
import X.InterfaceC88472Yns;
import android.os.SystemClock;
import com.ss.android.ugc.now.interaction.assem.LikeItem;
import com.ss.android.ugc.now.interaction.assem.ViewerItem;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS15S0000100_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S0000100_3(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AqS15S0000100_3 aqS15S0000100_3, Object obj) {
        C73U setState = (C73U) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C73U.LIZ(setState, null, null, new C43I(Long.valueOf(aqS15S0000100_3.j0)), null, false, 119);
    }

    public static final Object invoke$1(AqS15S0000100_3 aqS15S0000100_3, Object obj) {
        C1805976x setState = (C1805976x) obj;
        o.LJIIIZ(setState, "$this$setState");
        C43I c43i = new C43I(Long.valueOf(aqS15S0000100_3.j0));
        C8HZ<LikeItem> listState = setState.LJLIL;
        o.LJIIIZ(listState, "listState");
        return new C1805976x(c43i, listState);
    }

    public static final Object invoke$2(AqS15S0000100_3 aqS15S0000100_3, Object obj) {
        C1805776v setState = (C1805776v) obj;
        o.LJIIIZ(setState, "$this$setState");
        C43I c43i = new C43I(Long.valueOf(aqS15S0000100_3.j0));
        C8HZ<ViewerItem> listState = setState.LJLIL;
        o.LJIIIZ(listState, "listState");
        return new C1805776v(c43i, listState);
    }

    public static final Object invoke$3(AqS15S0000100_3 aqS15S0000100_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", "add_yours_detail_page");
        sendEventTrackingAsync.put("duration", aqS15S0000100_3.j0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS15S0000100_3 aqS15S0000100_3, Object obj) {
        C77H setState = (C77H) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C77H.LIZ(setState, null, null, false, false, null, new C43I(Long.valueOf(aqS15S0000100_3.j0)), 0, null, 223);
    }

    public static final Object invoke$5(AqS15S0000100_3 aqS15S0000100_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", "now_explore_page");
        sendEventTrackingAsync.put("duration", aqS15S0000100_3.j0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS15S0000100_3 aqS15S0000100_3, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("duration", SystemClock.elapsedRealtime() - aqS15S0000100_3.j0);
        sendEventTrackingAsync.put("enter_from", C196157mt.LJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS15S0000100_3 aqS15S0000100_3, Object obj) {
        C212208Um setState = (C212208Um) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C212208Um.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(Long.valueOf(aqS15S0000100_3.j0)), null, null, null, null, null, null, null, null, 16744447);
    }
}
