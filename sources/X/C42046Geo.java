package X;

import android.view.ViewPropertyAnimator;

/* renamed from: X.Geo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42046Geo implements InterfaceC43357Gzx {
    public final /* synthetic */ C42041Gej LIZ;
    public final /* synthetic */ C43356Gzw LIZIZ;
    public final /* synthetic */ ViewPropertyAnimator LIZJ;

    public C42046Geo(C42041Gej c42041Gej, C43356Gzw c43356Gzw, ViewPropertyAnimator viewPropertyAnimator) {
        this.LIZ = c42041Gej;
        this.LIZIZ = c43356Gzw;
        this.LIZJ = viewPropertyAnimator;
    }

    @Override // X.InterfaceC43357Gzx
    public final void onCancel() {
        this.LIZ.LJLLLL.LJ(this.LIZIZ);
        this.LIZJ.cancel();
    }
}
