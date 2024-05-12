package au3;

import X.C04590Fz;
import X.C47061t0;
import X.V1B;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public class IDdS55S0100000 extends V1B {
    public final int $t;
    public Object l0;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, exc, str);
                return;
            case 1:
                LJIILL$1(this, exc, str);
                return;
            case 2:
                LJIILL$2(this, exc, str);
                return;
            default:
                super.LJIILL(exc, str);
                return;
        }
    }

    public IDdS55S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILL$0(IDdS55S0100000 iDdS55S0100000, Exception exc, String str) {
        ((C04590Fz) iDdS55S0100000.l0).LIZJ.setImageResource(R.drawable.d6p);
    }

    public static final void LJIILL$1(IDdS55S0100000 iDdS55S0100000, Exception exc, String str) {
        ((C04590Fz) iDdS55S0100000.l0).LIZLLL.setImageResource(R.drawable.d6p);
    }

    public static final void LJIILL$2(IDdS55S0100000 iDdS55S0100000, Exception exc, String str) {
        C47061t0 c47061t0 = (C47061t0) iDdS55S0100000.l0;
        if (c47061t0 != null) {
            c47061t0.setImageResource(R.drawable.cul);
        }
    }
}
