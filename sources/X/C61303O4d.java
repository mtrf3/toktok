package X;

import java.lang.ref.SoftReference;
import kotlin.jvm.internal.AqS160S0100000_10;

/* renamed from: X.O4d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61303O4d extends AbstractC32664Crs<C81392Vwy<W5A>> {
    public final /* synthetic */ C61302O4c LIZ;
    public final /* synthetic */ android.net.Uri LIZIZ;
    public final /* synthetic */ C61295O3v LIZJ;
    public final /* synthetic */ InterfaceC65784Pro LIZLLL;

    @Override // X.AbstractC32664Crs, X.IHD
    public final void LIZJ(AbstractC48384Iyq abstractC48384Iyq) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preload image canceled, src = ");
        LIZ.append(this.LIZ.LJLJJL);
        LIZ.append(", redirectTo: ");
        LIZ.append(this.LIZIZ);
        C39930Flm.LJ("PreLoader", X1D.LIZIZ(LIZ), 4);
        this.LIZLLL.invoke();
    }

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preload image failed, src = ");
        LIZ.append(this.LIZ.LJLJJL);
        LIZ.append(", redirectTo: ");
        LIZ.append(this.LIZIZ);
        C39930Flm.LJ("PreLoader", X1D.LIZIZ(LIZ), 4);
        this.LIZLLL.invoke();
    }

    @Override // X.AbstractC32664Crs
    public final void LJFF(W4W<C81392Vwy<W5A>> w4w) {
        if (w4w != null && w4w.LIZIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("preload image succeed, src = ");
            LIZ.append(this.LIZ.LJLJJL);
            LIZ.append(", redirectTo: ");
            LIZ.append(this.LIZIZ);
            C39930Flm.LJI("PreLoader", X1D.LIZIZ(LIZ), false, 4);
            C81392Vwy<W5A> result = w4w.getResult();
            if (result != null && (result.LJI() instanceof W5B)) {
                this.LIZJ.LJLLL = new SoftReference<>(result);
            }
        }
        this.LIZLLL.invoke();
    }

    public C61303O4d(C61302O4c c61302O4c, android.net.Uri uri, C61295O3v c61295O3v, AqS160S0100000_10 aqS160S0100000_10) {
        this.LIZ = c61302O4c;
        this.LIZIZ = uri;
        this.LIZJ = c61295O3v;
        this.LIZLLL = aqS160S0100000_10;
    }
}
