package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import d5b.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.PHi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64194PHi extends PGA {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public C64200PHo LIZIZ;
    public final InterfaceC46627IRr LIZJ;
    public HashMap<String, C64197PHl> LIZLLL;
    public HashMap<String, C64197PHl> LJ;
    public HashMap<String, C64197PHl> LJFF;

    public C64194PHi(InterfaceC46627IRr interfaceC46627IRr) {
        this.LIZJ = interfaceC46627IRr;
    }

    public final void LJIIIZ(C64200PHo c64200PHo) {
        if (!this.LIZ.compareAndSet(false, true)) {
            return;
        }
        this.LIZLLL = new HashMap<>();
        this.LJ = new HashMap<>();
        this.LJFF = new HashMap<>();
        this.LIZIZ = c64200PHo;
    }

    public final void LJIIJ(C46626IRq c46626IRq) {
        if (!this.LIZ.get()) {
            return;
        }
        synchronized (C64194PHi.class) {
            LJI(EnumC64201PHp.FRONT, c46626IRq);
            LJI(EnumC64201PHp.BACK, c46626IRq);
            LJI(EnumC64201PHp.MIX, c46626IRq);
        }
    }

    public final void LJI(EnumC64201PHp enumC64201PHp, C46626IRq c46626IRq) {
        Iterator<Map.Entry<String, C64197PHl>> it;
        long currentTimeMillis = System.currentTimeMillis();
        int i = C64203PHr.LIZ[enumC64201PHp.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                } else {
                    it = this.LJ.entrySet().iterator();
                }
            } else {
                it = this.LJFF.entrySet().iterator();
            }
        } else {
            it = this.LIZLLL.entrySet().iterator();
        }
        if (it == null) {
            return;
        }
        while (it.hasNext()) {
            C64197PHl value = it.next().getValue();
            if (currentTimeMillis - value.LJI > this.LIZIZ.LJ * 1000) {
                it.remove();
                double d = value.LIZIZ;
                double d2 = value.LJII;
                double d3 = d / d2;
                double d4 = value.LIZJ;
                double d5 = value.LIZLLL / d2;
                double d6 = value.LJ;
                if (C78248UnM.LJIIJ()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("cpu cache item: ");
                    LIZ.append(value);
                    C64028PAy.LIZ("APM-CPU", X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("assemble cpu data, type: ");
                    LIZ2.append(enumC64201PHp);
                    LIZ2.append(" rate: ");
                    LIZ2.append(d3);
                    LIZ2.append(" maxRate: ");
                    LIZ2.append(d4);
                    LIZ2.append(" speed: ");
                    LIZ2.append(d5);
                    LIZ2.append(" maxSpeed: ");
                    LIZ2.append(d6);
                    C64028PAy.LIZ("APM-CPU", X1D.LIZIZ(LIZ2));
                }
                C64189PHd c64189PHd = new C64189PHd(enumC64201PHp, value.LJFF, d3, d4, d5, d6, c46626IRq);
                c64189PHd.LJIIIIZZ = c.LIZJ(C78248UnM.LJLJJI);
                try {
                    c64189PHd.LJIIJ = ((C46625IRp) this.LIZJ).LIZLLL.LIZ();
                } catch (Throwable unused) {
                }
                PC2.LIZ(c64189PHd);
            }
        }
    }

    public final C64197PHl LJII(EnumC64201PHp enumC64201PHp, String str) {
        int i = C64203PHr.LIZ[enumC64201PHp.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return this.LJ.get(str);
            }
            return this.LJFF.get(str);
        }
        return this.LIZLLL.get(str);
    }

    public final void LJFF(EnumC64201PHp enumC64201PHp, String str, C64197PHl c64197PHl) {
        int i = C64203PHr.LIZ[enumC64201PHp.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.LJ.put(str, c64197PHl);
                return;
            }
            this.LJFF.put(str, c64197PHl);
            return;
        }
        this.LIZLLL.put(str, c64197PHl);
    }

    public static C64197PHl LJIIIIZZ(EnumC64201PHp enumC64201PHp, C64197PHl c64197PHl, double d, double d2) {
        if (c64197PHl == null) {
            c64197PHl = new C64197PHl(enumC64201PHp, System.currentTimeMillis());
            c64197PHl.LJFF = PGQ.LIZ().LJ();
        }
        if (d >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || d2 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            c64197PHl.LJII++;
        }
        if (d2 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            c64197PHl.LIZLLL += d2;
        }
        if (d >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            c64197PHl.LIZIZ += d;
        }
        if (c64197PHl.LIZJ < d) {
            c64197PHl.LIZJ = d;
        }
        if (c64197PHl.LJ < d2) {
            c64197PHl.LJ = d2;
        }
        return c64197PHl;
    }
}
