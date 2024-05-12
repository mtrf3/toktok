package X;

/* renamed from: X.Ifx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47213Ifx implements InterfaceC47101Ie9 {
    public final /* synthetic */ C47198Ifi LJLIL;

    @Override // X.InterfaceC47101Ie9
    public final /* synthetic */ void G1() {
    }

    @Override // X.InterfaceC47101Ie9
    public final /* synthetic */ void N2() {
    }

    @Override // X.InterfaceC47101Ie9
    public final /* synthetic */ void S1() {
    }

    @Override // X.InterfaceC47101Ie9
    public final /* synthetic */ void j1() {
    }

    public C47213Ifx(C47198Ifi c47198Ifi) {
        this.LJLIL = c47198Ifi;
    }

    @Override // X.InterfaceC47101Ie9
    public final void p3(long j, long j2, String str) {
        C47198Ifi c47198Ifi = this.LJLIL;
        if (!c47198Ifi.LJI) {
            C1JX.LJIIIIZZ("onDownloadProgress: not enable preload，return. key:", str);
            return;
        }
        if (!c47198Ifi.LIZ.LIZIZ(str)) {
            return;
        }
        C47198Ifi c47198Ifi2 = this.LJLIL;
        c47198Ifi2.LIZIZ.LIZIZ(c47198Ifi2, new IVY(str, j, j2));
        this.LJLIL.LJII = str;
        C1JX.LJIIIIZZ("trigger preload, key:", str);
        this.LJLIL.LJIIL(j, j2);
    }
}
