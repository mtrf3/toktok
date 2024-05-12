package Y;

import X.C26231ARf;
import X.C54982Lhy;
import X.C55902Lwo;
import X.HG3;
import X.InterfaceC65784Pro;
import X.R47;
import X.RBX;
import X.X1D;
import android.content.Context;
import com.bytedance.keva.Keva;

/* loaded from: classes10.dex */
public class IDeS355S0100000_9 implements R47 {
    public final int $t;
    public Object l0;

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                return;
            case 1:
                onResult$1(this, i, i2, obj);
                return;
            case 2:
                onResult$2(this, i, i2, obj);
                return;
            case 3:
                onResult$3(this, i, i2, obj);
                return;
            case 4:
                onResult$4(this, i, i2, obj);
                return;
            case 5:
                onResult$5(this, i, i2, obj);
                return;
            default:
                return;
        }
    }

    public IDeS355S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(IDeS355S0100000_9 iDeS355S0100000_9, int i, int i2, Object obj) {
        Integer num = ((C54982Lhy) iDeS355S0100000_9.l0).LJFF.strategy;
        if (num == null || 2 != num.intValue()) {
            C26231ARf c26231ARf = ((C54982Lhy) iDeS355S0100000_9.l0).LJ;
            if (c26231ARf != null) {
                c26231ARf.LIZIZ(null);
                return;
            }
            return;
        }
        if (i2 != 1) {
            return;
        }
        C54982Lhy c54982Lhy = (C54982Lhy) iDeS355S0100000_9.l0;
        Keva keva = c54982Lhy.LJII;
        String str = c54982Lhy.LIZ.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
        keva.storeBoolean(X1D.LIZIZ(LIZ), true);
        C26231ARf c26231ARf2 = ((C54982Lhy) iDeS355S0100000_9.l0).LJ;
        if (c26231ARf2 == null) {
            return;
        }
        c26231ARf2.LIZIZ(null);
    }

    public static final void onResult$1(IDeS355S0100000_9 iDeS355S0100000_9, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            ((InterfaceC65784Pro) iDeS355S0100000_9.l0).invoke();
        }
    }

    public static final void onResult$2(IDeS355S0100000_9 iDeS355S0100000_9, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            ((InterfaceC65784Pro) iDeS355S0100000_9.l0).invoke();
        }
    }

    public static final void onResult$3(IDeS355S0100000_9 iDeS355S0100000_9, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            ((InterfaceC65784Pro) iDeS355S0100000_9.l0).invoke();
        }
    }

    public static final void onResult$4(IDeS355S0100000_9 iDeS355S0100000_9, int i, int i2, Object obj) {
        if (i == 1) {
            if (i2 == 1) {
                C55902Lwo.LJIIJ((Context) iDeS355S0100000_9.l0);
            } else {
                C55902Lwo.LJI = false;
            }
        }
    }

    public static final void onResult$5(IDeS355S0100000_9 iDeS355S0100000_9, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            ((InterfaceC65784Pro) iDeS355S0100000_9.l0).invoke();
        }
    }
}
