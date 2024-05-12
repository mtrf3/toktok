package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76662U6w;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public class AqS21S0200100_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS21S0200100_13 aqS21S0200100_13) {
        C76662U6w c76662U6w = (C76662U6w) aqS21S0200100_13.l0;
        List list = (List) aqS21S0200100_13.l1;
        long j = aqS21S0200100_13.j2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Long userId = ((LinkUser) obj).getUserId();
            if (userId != null && userId.longValue() == j) {
                arrayList.add(obj);
            }
        }
        c76662U6w.LIZIZ(arrayList, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS21S0200100_13 aqS21S0200100_13) {
        C76662U6w c76662U6w = (C76662U6w) aqS21S0200100_13.l0;
        List list = (List) aqS21S0200100_13.l1;
        long j = aqS21S0200100_13.j2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Long userId = ((LinkUser) obj).getUserId();
            if (userId != null && userId.longValue() == j) {
                arrayList.add(obj);
            }
        }
        c76662U6w.LIZIZ(arrayList, true);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0000: IPUT (r7 I:int), (r2 I:kotlin.jvm.internal.AqS21S0200100_13) (LINE:67108864) kotlin.jvm.internal.AqS21S0200100_13.$t int, block:B:1:0x0000 */
    public AqS21S0200100_13(C76662U6w c76662U6w, C76662U6w c76662U6w2, List<LinkUser> list, long j) {
        super(0);
        int i;
        this.$t = i;
        this.l0 = c76662U6w;
        this.l1 = c76662U6w2;
        this.j2 = list;
    }
}
