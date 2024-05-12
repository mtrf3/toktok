package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS56S0400000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class N07 extends AbstractC58625Mzd implements N9G {
    public abstract C58600MzE LJJII(InterfaceC58626Mze interfaceC58626Mze, C58620MzY c58620MzY);

    public abstract CommonAdData LJJIII(M95 m95);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N07(Object... contexts) {
        super(Arrays.copyOf(contexts, contexts.length));
        o.LJIIIZ(contexts, "contexts");
    }

    @Override // X.N9G
    public final void LJIILIIL(C58653N0f event) {
        o.LJIIIZ(event, "event");
        LJJIIZ(event, null);
    }

    @Override // X.N9G
    public final void LJ(C58653N0f event, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(event, "event");
        LJJIIZ(event, interfaceC88472Yns);
    }

    @Override // X.N9G
    public final void LJI(C58653N0f event, CommonAdData commonAdData) {
        o.LJIIIZ(event, "event");
        LJJIIJ(event, commonAdData, null);
    }

    public final void LJJIIZ(C58653N0f c58653N0f, InterfaceC88472Yns interfaceC88472Yns) {
        L71[] l71Arr = new L71[2];
        l71Arr[0] = this;
        C58620MzY c58620MzY = new C58620MzY(new Object[0]);
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this);
        }
        l71Arr[1] = c58620MzY;
        LJJIIJ(c58653N0f, LJJIII(new M95(l71Arr)), interfaceC88472Yns);
    }

    @Override // X.N9G
    public final void LJIIIZ(C58653N0f event, CommonAdData commonAdData, InterfaceC88472Yns extraInjection) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(extraInjection, "extraInjection");
        LJJIIJ(event, commonAdData, extraInjection);
    }

    public final void LJJIIJ(C58653N0f c58653N0f, CommonAdData commonAdData, InterfaceC88472Yns interfaceC88472Yns) {
        String valueOf;
        N0B LIZ;
        java.util.Map<String, Object> LJIL = LJIL(c58653N0f, new AqS56S0400000_10(this, c58653N0f, commonAdData, interfaceC88472Yns, 3));
        if (C19N.LJ("enable_rich_log_helper", false)) {
            String tag = c58653N0f.LJI.getFirst();
            String label = c58653N0f.LJI.getSecond();
            o.LJIIIZ(tag, "tag");
            o.LJIIIZ(label, "label");
            if (commonAdData == null) {
                LIZ = new N0B("", "", "", null, null);
            } else {
                Long creativeId = commonAdData.getCreativeId();
                if (creativeId == null) {
                    LIZ = new N0B("", "", "", null, null);
                } else {
                    creativeId.longValue();
                    if (commonAdData.getGroupId() == null) {
                        valueOf = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        valueOf = String.valueOf(commonAdData.getGroupId());
                    }
                    LIZ = MXV.LIZ(tag, label, String.valueOf(commonAdData.getCreativeId()), commonAdData.getLogExtra(), valueOf);
                    LIZ.LIZIZ(Integer.valueOf(commonAdData.getChargeType()), "charge_type");
                    LIZ.LIZIZ(Integer.valueOf(commonAdData.getSystemOrigin()), "system_origin");
                    synchronized (C55509LqT.class) {
                        List<N08> list = C55509LqT.LIZJ;
                        if (!((ArrayList) list).isEmpty()) {
                            Iterator it = ((ArrayList) list).iterator();
                            while (it.hasNext()) {
                                try {
                                    ((N08) it.next()).LIZ();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                }
            }
            LIZ.LIZLLL(LJIL);
            LIZ.LJ();
            return;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL(c58653N0f.LJI.getFirst(), c58653N0f.LJI.getSecond(), commonAdData);
        LIZLLL.LIZLLL(LJIL);
        LIZLLL.LJI();
    }

    public static void LJJIIZI(C58620MzY c58620MzY, InterfaceC58626Mze interfaceC58626Mze, CommonAdData commonAdData, C58600MzE c58600MzE) {
        c58620MzY.LJIJJLI(InterfaceC58626Mze.class, interfaceC58626Mze);
        c58620MzY.LIZ().putAll(c58600MzE.LIZ);
        c58620MzY.LJIIJ(commonAdData);
        c58620MzY.LJIJJLI(CommonAdData.class, commonAdData);
    }

    @Override // X.N9G
    public final void LIZJ(C58653N0f event, String creativeId, String str, String str2, InterfaceC88472Yns extraInjection) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(creativeId, "creativeId");
        o.LJIIIZ(extraInjection, "extraInjection");
        LJJIIJZLJL(event, creativeId, str, str2, extraInjection);
    }

    public final void LJJIIJZLJL(C58653N0f c58653N0f, String creativeId, String str, String str2, InterfaceC88472Yns interfaceC88472Yns) {
        N05 n05 = new N05(this, c58653N0f, creativeId, str, str2, interfaceC88472Yns);
        String tag = c58653N0f.LJI.getFirst();
        String label = c58653N0f.LJI.getSecond();
        java.util.Map<String, Object> LJIL = LJIL(c58653N0f, n05);
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(label, "label");
        o.LJIIIZ(creativeId, "creativeId");
        if (C19N.LJ("enable_rich_log_helper", false)) {
            N0B LIZ = MXV.LIZ(tag, label, creativeId, str, str2);
            LIZ.LIZLLL(LJIL);
            LIZ.LJ();
        } else {
            C58655N0h LJ = C58704N2e.LJ(tag, label, creativeId, str, str2);
            LJ.LIZLLL(LJIL);
            LJ.LJI();
        }
    }
}
