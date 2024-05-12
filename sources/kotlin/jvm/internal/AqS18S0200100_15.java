package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C35908E7k;
import X.C76800UCe;
import X.C85258Xd8;
import X.C85299Xdn;
import X.C86660Xzk;
import X.EnumC86777Y3x;
import X.FMX;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.content.Context;
import com.ss.android.ugc.aweme.service.CaptionServiceImpl;
import java.util.LinkedHashMap;

/* loaded from: classes16.dex */
public class AqS18S0200100_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS18S0200100_15 aqS18S0200100_15, Object it) {
        String str;
        o.LJIIIZ(it, "it");
        long currentTimeMillis = System.currentTimeMillis() - aqS18S0200100_15.j2;
        C85258Xd8 c85258Xd8 = (C85258Xd8) aqS18S0200100_15.l0;
        String str2 = null;
        if (c85258Xd8 != null) {
            str = c85258Xd8.LIZ;
            str2 = c85258Xd8.LIZIZ;
        } else {
            str = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        linkedHashMap.put("show_duration", String.valueOf(currentTimeMillis));
        linkedHashMap.put("show_index", String.valueOf(C35908E7k.LIZIZ().getInt("guided_location_permission_show_count", 0) - 1));
        FMX.LJIIL("guided_location_permission_result", linkedHashMap);
        C85299Xdn.LIZIZ();
        ((InterfaceC65784Pro) aqS18S0200100_15.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS18S0200100_15 aqS18S0200100_15, Object it) {
        o.LJIIIZ(it, "it");
        CaptionServiceImpl.LJIILIIL().LJII((Context) aqS18S0200100_15.l0, "bottom_sheet", EnumC86777Y3x.SHARE_PANEL, ((C86660Xzk) aqS18S0200100_15.l1).LJLILLLLZI, true, Long.valueOf(aqS18S0200100_15.j2));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AqS18S0200100_15) (LINE:67108867) kotlin.jvm.internal.AqS18S0200100_15.j2 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AqS18S0200100_15) (LINE:67108869) kotlin.jvm.internal.AqS18S0200100_15.l0 java.lang.Object, block:B:1:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.AqS18S0200100_15, X.Prl] */
    public AqS18S0200100_15(long j, long j2, C85258Xd8 c85258Xd8, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        long j3;
        Object obj;
        r2.$t = interfaceC65784Pro;
        r2.j2 = j3;
        r2.l0 = obj;
        r2.l1 = c85258Xd8;
        ?? abstractC65781Prl = new AbstractC65781Prl(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS18S0200100_15(Context context, C86660Xzk c86660Xzk, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c86660Xzk;
        this.j2 = j;
    }
}
