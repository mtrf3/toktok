package X;

/* renamed from: X.Ifw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47212Ifw implements InterfaceC47101Ie9 {
    public final /* synthetic */ C47197Ifh LJLIL;

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

    public C47212Ifw(C47197Ifh c47197Ifh) {
        this.LJLIL = c47197Ifh;
    }

    @Override // X.InterfaceC47101Ie9
    public final void p3(long j, long j2, String str) {
        if (!this.LJLIL.LJII) {
            C1JX.LJIIIIZZ("onDownloadProgress: not enable preload，return. key:", str);
            return;
        }
        C16880lQ.LLLZ("onDownloadProgress：key: %s, totalBytes:%s, downloadedBytes:%s", new Object[]{str, Long.valueOf(j), Long.valueOf(j2)});
        C47199Ifj c47199Ifj = this.LJLIL.LJFF;
        if (c47199Ifj != null && !c47199Ifj.LIZLLL(str)) {
            return;
        }
        C47231IgF c47231IgF = this.LJLIL.LJIILIIL;
        if (c47231IgF != null && j == j2) {
            C47204Ifo c47204Ifo = c47231IgF.LIZ.LJ;
            c47204Ifo.LJFF.getClass();
            c47204Ifo.LJIILIIL(3, true);
        }
        this.LJLIL.LJIIL = str;
        C1JX.LJIIIIZZ("trigger preload, key:", str);
        this.LJLIL.LJIIL(j, j2);
    }
}
