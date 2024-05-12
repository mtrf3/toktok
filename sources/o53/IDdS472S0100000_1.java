package o53;

import X.C10K;
import X.C4AJ;
import X.C4PO;
import X.C4PP;
import X.W4V;
import X.W5O;
import Y.ACallableS79S0200000_1;
import android.graphics.drawable.Animatable;
import java.util.Map;

/* loaded from: classes2.dex */
public class IDdS472S0100000_1 extends W4V {
    public final int $t;
    public Object l0;

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        switch (this.$t) {
            case 1:
                LJ$0(this, str, th);
                return;
            default:
                super.LJ(str, th);
                return;
        }
    }

    @Override // X.W4V
    public final void LJIIIZ(String str, Object obj, Animatable animatable, W5O w5o, Map map) {
        switch (this.$t) {
            case 0:
                LJIIIZ$0(this, str, obj, animatable, w5o, map);
                return;
            default:
                super.LJIIIZ(str, obj, animatable, w5o, map);
                return;
        }
    }

    public IDdS472S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJ$0(IDdS472S0100000_1 iDdS472S0100000_1, String str, Throwable th) {
        ((C4AJ) iDdS472S0100000_1.l0).p0(false);
    }

    public static final void LJIIIZ$0(IDdS472S0100000_1 iDdS472S0100000_1, String str, Object obj, Animatable animatable, W5O w5o, Map map) {
        C4PO c4po = (C4PO) iDdS472S0100000_1.l0;
        C4PP c4pp = C4PP.SHOW;
        c4po.getClass();
        C10K.LIZJ(new ACallableS79S0200000_1(c4pp, c4po, 3));
    }
}
