package Y;

import X.C243529h6;
import X.InterfaceC64592gB;

/* loaded from: classes5.dex */
public class AfS20S1000000_4 implements InterfaceC64592gB {
    public final int $t;
    public String s0;

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

    public AfS20S1000000_4(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final void accept$0(AfS20S1000000_4 afS20S1000000_4, Object obj) {
        new C243529h6(afS20S1000000_4.s0, "", true, "contact").LIZLLL(null);
    }

    public static final void accept$1(AfS20S1000000_4 afS20S1000000_4, Object obj) {
        new C243529h6(afS20S1000000_4.s0, "", false, "contact").LIZLLL(null);
    }
}
