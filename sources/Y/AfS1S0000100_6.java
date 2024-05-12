package Y;

import X.AFJ;
import X.InterfaceC64592gB;

/* loaded from: classes7.dex */
public class AfS1S0000100_6 implements InterfaceC64592gB {
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
            default:
                return;
        }
    }

    public AfS1S0000100_6(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final void accept$0(AfS1S0000100_6 afS1S0000100_6, Object obj) {
        AFJ.LIZ(2, -1, afS1S0000100_6.j0, "kids_api_like");
    }

    public static final void accept$1(AfS1S0000100_6 afS1S0000100_6, Object obj) {
        AFJ.LIZ(2, -1, afS1S0000100_6.j0, "kids_api_like");
    }

    public static final void accept$2(AfS1S0000100_6 afS1S0000100_6, Object obj) {
        AFJ.LIZ(1, -1, afS1S0000100_6.j0, "kids_api_like");
    }
}
