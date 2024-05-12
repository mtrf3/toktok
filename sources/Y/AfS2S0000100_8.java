package Y;

import X.AFJ;
import X.InterfaceC64592gB;

/* loaded from: classes9.dex */
public class AfS2S0000100_8 implements InterfaceC64592gB {
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

    public AfS2S0000100_8(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final void accept$0(AfS2S0000100_8 afS2S0000100_8, Object obj) {
        AFJ.LIZ(-1, 0, afS2S0000100_8.j0, "kids_api_check_in");
    }

    public static final void accept$1(AfS2S0000100_8 afS2S0000100_8, Object obj) {
        AFJ.LIZ(-1, -1, afS2S0000100_8.j0, "kids_api_check_in");
    }
}
