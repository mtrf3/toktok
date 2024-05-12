package X;

import java.util.List;

/* renamed from: X.Hw0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45660Hw0 implements InterfaceC45690HwU {
    public final /* synthetic */ C45657Hvx LIZ;

    public C45660Hw0(C45657Hvx c45657Hvx) {
        this.LIZ = c45657Hvx;
    }

    @Override // X.InterfaceC45690HwU
    public final void LIZ(boolean z, List list) {
        int size;
        StringBuilder LJI = JBR.LJI("onMediaLoaded,success:", z, ",size:");
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        LJI.append(size);
        C45657Hvx.LLJILJIL(X1D.LIZIZ(LJI));
        C45657Hvx c45657Hvx = this.LIZ;
        if (!c45657Hvx.LJLIL) {
            return;
        }
        C73849Syb<C31484CXg> c73849Syb = c45657Hvx.LJLILLLLZI;
        C31484CXg LJJZZIII = c73849Syb.LJJZZIII();
        LJJZZIII.getClass();
        C31484CXg c31484CXg = new C31484CXg();
        c31484CXg.LIZ = false;
        c31484CXg.LIZIZ = LJJZZIII.LIZIZ;
        c73849Syb.onNext(c31484CXg);
        if (z) {
            this.LIZ.LLJILJILJ();
        }
    }
}
