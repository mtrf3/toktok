package Y;

import X.AFJ;
import X.InterfaceC64592gB;

/* loaded from: classes16.dex */
public class AfS6S0000100_15 implements InterfaceC64592gB {
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
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS6S0000100_15(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final void accept$0(AfS6S0000100_15 afS6S0000100_15, Object obj) {
        AFJ.LIZ(2, -1, afS6S0000100_15.j0, "kids_api_detail");
    }

    public static final void accept$1(AfS6S0000100_15 afS6S0000100_15, Object obj) {
        AFJ.LIZ(1, -1, afS6S0000100_15.j0, "kids_api_detail");
    }

    public static final void accept$2(AfS6S0000100_15 afS6S0000100_15, Object obj) {
        AFJ.LIZ(3, -1, afS6S0000100_15.j0, "kids_api_detail");
    }

    public static final void accept$3(AfS6S0000100_15 afS6S0000100_15, Object obj) {
        AFJ.LIZ(2, -1, afS6S0000100_15.j0, "kids_api_detail");
    }
}
