package Y;

import X.C62873Olx;
import X.C84768XOq;
import X.C84915XUh;
import X.C84916XUi;
import X.C84919XUl;
import X.InterfaceC64592gB;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AfS1S0112000_15 implements InterfaceC64592gB {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public boolean z1;

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

    public AfS1S0112000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS1S0112000_15 afS1S0112000_15, Object obj) {
        int i;
        C84919XUl c84919XUl;
        C62873Olx c62873Olx;
        C84768XOq progressResult = (C84768XOq) obj;
        o.LJIIIZ(progressResult, "progressResult");
        int i2 = progressResult.LIZ;
        int i3 = progressResult.LIZIZ;
        Effect effect = progressResult.LIZJ;
        long j = progressResult.LIZLLL;
        ExceptionResult exceptionResult = progressResult.LJ;
        if (i3 == -102) {
            if (i2 == -101 && (c62873Olx = ((C84916XUi) afS1S0112000_15.l0).LJIIIIZZ) != null) {
                c62873Olx.LIZLLL = System.currentTimeMillis();
            }
            if (!afS1S0112000_15.z1) {
                afS1S0112000_15.z1 = true;
                C84919XUl c84919XUl2 = ((C84916XUi) afS1S0112000_15.l0).LJII;
                if (c84919XUl2 != null) {
                    c84919XUl2.onStart(effect);
                    return;
                }
                return;
            }
            return;
        }
        if (-106 == i2) {
            if (i3 == 100) {
                C62873Olx c62873Olx2 = ((C84916XUi) afS1S0112000_15.l0).LJIIIIZZ;
                if (c62873Olx2 == null) {
                    return;
                }
                c62873Olx2.LIZ(0, null);
                return;
            }
            C62873Olx c62873Olx3 = ((C84916XUi) afS1S0112000_15.l0).LJIIIIZZ;
            if (c62873Olx3 == null) {
                return;
            }
            c62873Olx3.LIZ(1, exceptionResult);
            return;
        }
        if (i3 == -104 && (c84919XUl = ((C84916XUi) afS1S0112000_15.l0).LJII) != null) {
            c84919XUl.LIZLLL(effect);
        }
        if (-100 == i2) {
            afS1S0112000_15.i2 = i3;
        } else if (-101 == i2) {
            afS1S0112000_15.i3 = i3;
        }
        C84916XUi c84916XUi = (C84916XUi) afS1S0112000_15.l0;
        C84919XUl c84919XUl3 = c84916XUi.LJII;
        if (c84919XUl3 == null) {
            return;
        }
        if (TextUtils.isEmpty(c84916XUi.LIZIZ)) {
            i = afS1S0112000_15.i2;
        } else {
            i = (afS1S0112000_15.i2 + afS1S0112000_15.i3) / 2;
        }
        c84919XUl3.LIZJ(i, effect, Long.valueOf(j));
    }

    public static final void accept$1(AfS1S0112000_15 afS1S0112000_15, Object obj) {
        int i;
        C62873Olx c62873Olx;
        C84768XOq progressResult = (C84768XOq) obj;
        o.LJIIIZ(progressResult, "progressResult");
        int i2 = progressResult.LIZ;
        int i3 = progressResult.LIZIZ;
        Effect effect = progressResult.LIZJ;
        long j = progressResult.LIZLLL;
        ExceptionResult exceptionResult = progressResult.LJ;
        if (i3 == -102) {
            if (i2 == -101 && (c62873Olx = ((C84915XUh) afS1S0112000_15.l0).LJIIIZ) != null) {
                c62873Olx.LIZLLL = System.currentTimeMillis();
            }
            if (!afS1S0112000_15.z1) {
                afS1S0112000_15.z1 = true;
                C84919XUl c84919XUl = ((C84915XUh) afS1S0112000_15.l0).LJII;
                if (c84919XUl != null) {
                    c84919XUl.onStart(effect);
                    return;
                }
                return;
            }
            return;
        }
        if (-106 == i2) {
            if (i3 == 100) {
                C62873Olx c62873Olx2 = ((C84915XUh) afS1S0112000_15.l0).LJIIIZ;
                if (c62873Olx2 == null) {
                    return;
                }
                c62873Olx2.LIZ(0, null);
                return;
            }
            C62873Olx c62873Olx3 = ((C84915XUh) afS1S0112000_15.l0).LJIIIZ;
            if (c62873Olx3 == null) {
                return;
            }
            c62873Olx3.LIZ(1, exceptionResult);
            return;
        }
        if (i3 == -104) {
            C84919XUl c84919XUl2 = ((C84915XUh) afS1S0112000_15.l0).LJII;
            if (c84919XUl2 == null) {
                return;
            }
            c84919XUl2.LIZLLL(effect);
            return;
        }
        if (-100 == i2) {
            afS1S0112000_15.i2 = i3;
        } else if (-101 == i2) {
            afS1S0112000_15.i3 = i3;
        }
        C84915XUh c84915XUh = (C84915XUh) afS1S0112000_15.l0;
        C84919XUl c84919XUl3 = c84915XUh.LJII;
        if (c84919XUl3 == null) {
            return;
        }
        if (c84915XUh.LIZJ == null || c84915XUh.LJIIIIZZ) {
            i = afS1S0112000_15.i3;
        } else {
            i = (afS1S0112000_15.i2 + afS1S0112000_15.i3) / 2;
        }
        c84919XUl3.LIZJ(i, effect, Long.valueOf(j));
    }
}
