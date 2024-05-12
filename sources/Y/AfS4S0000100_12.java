package Y;

import X.AFJ;
import X.InterfaceC64592gB;

/* loaded from: classes13.dex */
public class AfS4S0000100_12 implements InterfaceC64592gB {
    public final int $t;
    public long j0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS4S0000100_12(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final void accept$0(AfS4S0000100_12 afS4S0000100_12, Object obj) {
        AFJ.LIZ(2, -1, afS4S0000100_12.j0, "kids_api_feed");
    }

    public static final void accept$1(AfS4S0000100_12 afS4S0000100_12, Object obj) {
        AFJ.LIZ(1, -1, afS4S0000100_12.j0, "kids_api_feed");
    }
}
