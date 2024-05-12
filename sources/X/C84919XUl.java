package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.XUl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84919XUl implements InterfaceC84926XUs {
    public InterfaceC84926XUs LIZ;
    public Effect LIZIZ;
    public boolean LIZJ;
    public C84767XOp LIZLLL;
    public boolean LJ;
    public C84767XOp LJFF;
    public boolean LJI;
    public int LJII;
    public Effect LJIIIIZZ;
    public Long LJIIIZ = 0L;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public Effect LJIILIIL;
    public boolean LJIILJJIL;
    public Effect LJIILL;

    public C84919XUl(InterfaceC84926XUs interfaceC84926XUs) {
        this.LIZ = interfaceC84926XUs;
    }

    @Override // X.InterfaceC84926XUs
    public final void LIZIZ(C84767XOp result) {
        o.LJIIIZ(result, "result");
        this.LIZLLL = result;
        this.LJ = true;
        InterfaceC84926XUs interfaceC84926XUs = this.LIZ;
        if (interfaceC84926XUs != null) {
            interfaceC84926XUs.LIZIZ(result);
        }
    }

    @Override // X.InterfaceC84926XUs
    public final void LIZLLL(Effect effect) {
        this.LJIILJJIL = true;
        this.LJIILL = effect;
        InterfaceC84926XUs interfaceC84926XUs = this.LIZ;
        if (interfaceC84926XUs != null) {
            interfaceC84926XUs.LIZLLL(effect);
        }
    }

    @Override // X.InterfaceC84926XUs
    public final void LJ(C84767XOp result) {
        o.LJIIIZ(result, "result");
        this.LJFF = result;
        this.LJI = true;
        InterfaceC84926XUs interfaceC84926XUs = this.LIZ;
        if (interfaceC84926XUs != null) {
            interfaceC84926XUs.LJ(result);
        }
    }

    public final void LJFF(InterfaceC84926XUs interfaceC84926XUs) {
        if (this.LJIILJJIL && interfaceC84926XUs != null) {
            interfaceC84926XUs.LIZLLL(this.LJIILL);
        }
        if (this.LJIIJJI && interfaceC84926XUs != null) {
            interfaceC84926XUs.LIZ(this.LJIILIIL, this.LJIIL);
        }
        if (this.LIZJ && interfaceC84926XUs != null) {
            interfaceC84926XUs.onStart(this.LIZIZ);
        }
        if (this.LJIIJ && interfaceC84926XUs != null) {
            interfaceC84926XUs.LIZJ(this.LJII, this.LJIIIIZZ, this.LJIIIZ);
        }
        if (this.LJI && interfaceC84926XUs != null) {
            C84767XOp c84767XOp = this.LJFF;
            o.LJI(c84767XOp);
            interfaceC84926XUs.LJ(c84767XOp);
        }
        if (this.LJ && interfaceC84926XUs != null) {
            C84767XOp c84767XOp2 = this.LIZLLL;
            o.LJI(c84767XOp2);
            interfaceC84926XUs.LIZIZ(c84767XOp2);
        }
        this.LIZ = interfaceC84926XUs;
    }

    @Override // X.InterfaceC84926XUs
    public final void onStart(Effect effect) {
        this.LIZIZ = effect;
        this.LIZJ = true;
        InterfaceC84926XUs interfaceC84926XUs = this.LIZ;
        if (interfaceC84926XUs != null) {
            interfaceC84926XUs.onStart(effect);
        }
    }

    @Override // X.InterfaceC84926XUs
    public final void LIZ(Effect effect, String str) {
        this.LJIIJJI = true;
        this.LJIIL = str;
        this.LJIILIIL = effect;
        InterfaceC84926XUs interfaceC84926XUs = this.LIZ;
        if (interfaceC84926XUs != null) {
            interfaceC84926XUs.LIZ(effect, str);
        }
    }

    @Override // X.InterfaceC84926XUs
    public final void LIZJ(int i, Effect effect, Long l) {
        this.LJII = i;
        this.LJIIIIZZ = effect;
        this.LJIIIZ = l;
        this.LJIIJ = true;
        InterfaceC84926XUs interfaceC84926XUs = this.LIZ;
        if (interfaceC84926XUs != null) {
            interfaceC84926XUs.LIZJ(i, effect, l);
        }
    }
}
