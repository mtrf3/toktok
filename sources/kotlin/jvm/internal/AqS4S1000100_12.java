package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.InterfaceC65784Pro;
import X.SZ4;
import X.SZ5;

/* loaded from: classes13.dex */
public class AqS4S1000100_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$0();
            default:
                return null;
        }
    }

    public final SZ5 invoke$0() {
        o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL());
        return new SZ5(this.s0, this.j1);
    }

    public static final Object invoke$0(AqS4S1000100_12 aqS4S1000100_12) {
        return new SZ4(aqS4S1000100_12.s0, aqS4S1000100_12.j1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S1000100_12(String str, long j, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
