package Y;

import X.InterfaceC64592gB;
import X.KKL;
import X.KKR;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public class AfS22S1100000_8 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
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

    public static final void accept$0(AfS22S1100000_8 afS22S1100000_8, Object obj) {
        ((ConcurrentHashMap) afS22S1100000_8.l1).put(afS22S1100000_8.s0, Boolean.FALSE);
    }

    public static final void accept$1(AfS22S1100000_8 afS22S1100000_8, Object obj) {
        ((KKL) afS22S1100000_8.l1).LIZJ(afS22S1100000_8.s0, KKR.FAILURE);
    }

    public AfS22S1100000_8(String str, Object obj, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
