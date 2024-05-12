package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WZf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82495WZf {
    public boolean LIZ;
    public boolean LIZIZ;
    public InterfaceC88472Yns<? super byte[], C76800UCe> LIZJ = C82504WZo.LJLIL;
    public final List<byte[]> LIZLLL = new ArrayList();
    public C5T7 LJ;
    public final C82466WYc LJFF;
    public final /* synthetic */ C82497WZh LJI;

    public final void LIZ() {
        C5T7 c5t7;
        if (!this.LIZ && (c5t7 = this.LJ) != null && !c5t7.LIZ && c5t7.LIZIZ) {
            return;
        }
        ((ArrayList) this.LIZLLL).clear();
        this.LIZ = false;
        this.LIZIZ = false;
        this.LIZJ = C82507WZr.LJLIL;
        C5T7 c5t72 = this.LJ;
        if (c5t72 != null) {
            c5t72.LIZJ(C171196nj.LIZIZ);
        }
        C5T7 c5t73 = this.LJ;
        if (c5t73 != null) {
            c5t73.LIZJ.setRecorderListener(null);
        }
        C5T7 c5t74 = this.LJ;
        if (c5t74 != null && !c5t74.LIZIZ) {
            c5t74.LIZIZ = true;
            c5t74.LIZJ.destory();
        }
    }

    public C82495WZf(C82497WZh c82497WZh) {
        this.LJI = c82497WZh;
        this.LJFF = new C82466WYc(this, c82497WZh);
    }
}
