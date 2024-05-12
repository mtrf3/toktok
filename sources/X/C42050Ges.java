package X;

import android.view.ViewPropertyAnimator;

/* renamed from: X.Ges, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42050Ges implements InterfaceC43357Gzx {
    public final /* synthetic */ C42041Gej LIZ;
    public final /* synthetic */ C43356Gzw LIZIZ;
    public final /* synthetic */ ViewPropertyAnimator LIZJ;
    public final /* synthetic */ ViewPropertyAnimator LIZLLL;
    public final /* synthetic */ ViewPropertyAnimator LJ;

    public C42050Ges(C42041Gej c42041Gej, C43356Gzw c43356Gzw, ViewPropertyAnimator viewPropertyAnimator, ViewPropertyAnimator viewPropertyAnimator2, ViewPropertyAnimator viewPropertyAnimator3) {
        this.LIZ = c42041Gej;
        this.LIZIZ = c43356Gzw;
        this.LIZJ = viewPropertyAnimator;
        this.LIZLLL = viewPropertyAnimator2;
        this.LJ = viewPropertyAnimator3;
    }

    @Override // X.InterfaceC43357Gzx
    public final void onCancel() {
        this.LIZ.LJLLLL.LJ(this.LIZIZ);
        this.LIZJ.cancel();
        this.LIZLLL.cancel();
        this.LJ.cancel();
    }
}
