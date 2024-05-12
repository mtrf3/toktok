package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.XUw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84930XUw implements InterfaceC84926XUs {
    public final /* synthetic */ C84942XVi LIZ;

    public C84930XUw(C84942XVi c84942XVi) {
        this.LIZ = c84942XVi;
    }

    @Override // X.InterfaceC84926XUs
    public final void LIZIZ(C84767XOp c84767XOp) {
        if (c84767XOp.LIZJ.intValue() == -108) {
            this.LIZ.LIZ = true;
        }
        C84942XVi c84942XVi = this.LIZ;
        c84942XVi.LJJIJL = c84767XOp.LIZ;
        c84942XVi.LJJJJLI.onSuccess(c84767XOp.LJ);
    }

    @Override // X.InterfaceC84926XUs
    public final void LIZLLL(Effect effect) {
        this.LIZ.LJJJJLI.LIZ.LJJIL = effect;
    }

    @Override // X.InterfaceC84926XUs
    public final void LJ(C84767XOp c84767XOp) {
        this.LIZ.LJJJJLI.onFail(c84767XOp.LJ, c84767XOp.LJI);
    }

    @Override // X.InterfaceC84926XUs
    public final void onStart(Effect effect) {
        C84942XVi c84942XVi = this.LIZ;
        c84942XVi.LIZ = false;
        c84942XVi.LJJJJZI = false;
        c84942XVi.LJJJJLI.onStart(effect);
    }

    @Override // X.InterfaceC84926XUs
    public final void LIZ(Effect effect, String str) {
        this.LIZ.LJJJJLI.LIZ(effect, str);
    }

    @Override // X.InterfaceC84926XUs
    public final void LIZJ(int i, Effect effect, Long l) {
        this.LIZ.LJJJJLI.onProgress(effect, i, l.longValue());
    }
}
