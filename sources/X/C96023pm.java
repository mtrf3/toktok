package X;

import android.util.Pair;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96023pm {
    public final InterfaceC65784Pro<C63291Osh> LIZ;
    public final InterfaceC65784Pro<int[]> LIZIZ;
    public final InterfaceC88471Ynr<Integer, Boolean, Pair<Integer, Integer>> LIZJ;
    public final InterfaceC65784Pro<Long> LIZLLL;

    public final java.util.Map<String, Object> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int[] invoke = this.LIZIZ.invoke();
        String LIZIZ = LIZIZ(invoke, new AqS167S0100000_1(this, 440));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{ ");
        LIZ.append(LIZIZ);
        LIZ.append(" }");
        linkedHashMap.put("user_chain_cursor", X1D.LIZIZ(LIZ));
        String LIZIZ2 = LIZIZ(invoke, new AqS167S0100000_1(this, 437));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("{ ");
        LIZ2.append(LIZIZ2);
        LIZ2.append(" }");
        linkedHashMap.put("last_init_by_user", X1D.LIZIZ(LIZ2));
        String LIZIZ3 = LIZIZ(invoke, new AqS167S0100000_1(this, 439));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("{ ");
        LIZ3.append(LIZIZ3);
        LIZ3.append(" }");
        linkedHashMap.put("last_get_msg_by_user", X1D.LIZIZ(LIZ3));
        String LIZIZ4 = LIZIZ(invoke, new AqS167S0100000_1(this, 438));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("{ ");
        LIZ4.append(LIZIZ4);
        LIZ4.append(" }");
        linkedHashMap.put("last_new_msg_notify", X1D.LIZIZ(LIZ4));
        InterfaceC88471Ynr<Integer, Boolean, Pair<Integer, Integer>> interfaceC88471Ynr = this.LIZJ;
        Boolean bool = Boolean.FALSE;
        Pair<Integer, Integer> invoke2 = interfaceC88471Ynr.invoke(0, bool);
        Pair<Integer, Integer> invoke3 = this.LIZJ.invoke(1, bool);
        long longValue = this.LIZLLL.invoke().longValue();
        Integer privateConvCount = (Integer) invoke2.first;
        Object obj = invoke2.second;
        Integer groupConvCount = (Integer) invoke3.first;
        Object obj2 = invoke3.second;
        o.LJIIIIZZ(privateConvCount, "privateConvCount");
        o.LJIIIIZZ(groupConvCount, "groupConvCount");
        StringBuilder LIZJ = V10.LIZJ("{ total_count:", longValue, ", stranger_count:");
        LIZJ.append((longValue - privateConvCount.intValue()) - groupConvCount.intValue());
        LIZJ.append(", private_count:");
        LIZJ.append(privateConvCount);
        LIZJ.append(", local_private_count:");
        LIZJ.append(obj);
        LIZJ.append(", group_count:");
        LIZJ.append(groupConvCount);
        LIZJ.append(", local_group_count:");
        LIZJ.append(obj2);
        LIZJ.append(" }");
        linkedHashMap.put("conversation_in_db", X1D.LIZIZ(LIZJ));
        return linkedHashMap;
    }

    public C96023pm(int i) {
        C96063pq spUtils = C96063pq.LJLIL;
        C96043po getInboxes = C96043po.LJLIL;
        C96013pl getNonStrangerConvSize = C96013pl.LJLIL;
        C96033pn getAllConvCount = C96033pn.LJLIL;
        o.LJIIIZ(spUtils, "spUtils");
        o.LJIIIZ(getInboxes, "getInboxes");
        o.LJIIIZ(getNonStrangerConvSize, "getNonStrangerConvSize");
        o.LJIIIZ(getAllConvCount, "getAllConvCount");
        this.LIZ = spUtils;
        this.LIZIZ = getInboxes;
        this.LIZJ = getNonStrangerConvSize;
        this.LIZLLL = getAllConvCount;
    }

    public static String LIZIZ(int[] iArr, InterfaceC88472Yns interfaceC88472Yns) {
        return ORY.LJJJJL(iArr, ", ", new AqS167S0100000_1(interfaceC88472Yns, (InterfaceC88472Yns<? super FrameLayout, C76800UCe>) 436), 30);
    }
}
