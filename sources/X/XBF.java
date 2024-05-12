package X;

import com.ss.ugc.effectplatform.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBF implements InterfaceC84414XBa<C84430XBq> {
    public final /* synthetic */ XBD LIZ;

    public XBF(XBD xbd) {
        this.LIZ = xbd;
    }

    @Override // X.InterfaceC84414XBa
    public final void LIZ(XBW<C84430XBq> syncTask) {
        o.LJIIJ(syncTask, "syncTask");
        this.LIZ.LIZJ(syncTask);
    }

    @Override // X.InterfaceC84414XBa
    public final void LIZLLL(XBW<C84430XBq> syncTask) {
        o.LJIIJ(syncTask, "syncTask");
        this.LIZ.LJIIIIZZ(syncTask);
    }

    @Override // X.InterfaceC84414XBa
    public final void LJFF(XBW<C84430XBq> syncTask) {
        o.LJIIJ(syncTask, "syncTask");
        this.LIZ.LJ(syncTask);
    }

    @Override // X.InterfaceC84414XBa
    public final void LJI(XBW<C84430XBq> syncTask) {
        o.LJIIJ(syncTask, "syncTask");
        this.LIZ.LJFF(syncTask);
    }

    @Override // X.InterfaceC84414XBa
    public final void LIZIZ(XBW<C84430XBq> syncTask, C84430XBq c84430XBq) {
        int i;
        int i2;
        String str;
        int i3;
        Effect effect;
        C0FT c0ft;
        Integer num;
        C0FT c0ft2;
        Integer num2;
        C84430XBq c84430XBq2 = c84430XBq;
        o.LJIIJ(syncTask, "syncTask");
        XAR xar = this.LIZ.LJFF;
        int i4 = 0;
        if (xar != null && (c0ft2 = xar.LJIIIIZZ) != null && (num2 = (Integer) c0ft2.LIZ) != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        c84430XBq2.LIZIZ = i;
        XAR xar2 = this.LIZ.LJFF;
        if (xar2 != null && (c0ft = xar2.LJIIIZ) != null && (num = (Integer) c0ft.LIZ) != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        c84430XBq2.LIZ = i2;
        C30941Ji c30941Ji = XBD.LJIIL;
        c30941Ji.LIZIZ();
        try {
            C40601ia<String, C84433XBt> c40601ia = XBD.LJIILIIL;
            C84415XBb c84415XBb = this.LIZ.LJII;
            if (c84415XBb != null && (effect = c84415XBb.LJLIL) != null) {
                str = effect.getEffect_id();
            } else {
                str = null;
            }
            C84433XBt c84433XBt = c40601ia.get(str);
            if (c84433XBt != null) {
                i3 = c84433XBt.LIZIZ;
            } else {
                i3 = 1;
            }
            c84430XBq2.LIZJ = i3;
            if (c84433XBt != null) {
                i4 = c84433XBt.LIZ;
            }
            c84430XBq2.LIZLLL = i4;
            c30941Ji.LIZLLL();
            this.LIZ.LJII(syncTask, c84430XBq2);
        } catch (Throwable th) {
            c30941Ji.LIZLLL();
            throw th;
        }
    }

    @Override // X.InterfaceC84414XBa
    public final void LJ(XBW<C84430XBq> syncTask, C84418XBe c84418XBe) {
        o.LJIIJ(syncTask, "syncTask");
        this.LIZ.LIZLLL(syncTask, c84418XBe);
    }

    @Override // X.InterfaceC84414XBa
    public final void LIZJ(XBW<C84430XBq> syncTask, int i, long j) {
        o.LJIIJ(syncTask, "syncTask");
        this.LIZ.LJI(syncTask, i, j);
    }
}
