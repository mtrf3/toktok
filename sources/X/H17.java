package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H17 implements InterfaceC36329ENp {
    public final /* synthetic */ H16 LIZ;
    public final /* synthetic */ H15 LIZIZ;
    public final /* synthetic */ H1B LIZJ;

    @Override // X.InterfaceC36329ENp
    public final Object LIZ(InterfaceC67352kd<? super String> interfaceC67352kd) {
        List<String> LJIIZILJ = C86793Y4n.LJIIZILJ(this.LIZ.LIZJ.LIZ, ORZ.LLJILJILJ(((C42362Gju) this.LIZ.LIZ).LJLIL));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (String str : LJIIZILJ) {
            int i2 = i + 1;
            if (C44687HgJ.LIZIZ(str)) {
                try {
                    Bitmap LIZLLL = C44694HgQ.LIZLLL(str, null);
                    if (LIZLLL != null) {
                        H16 h16 = this.LIZ;
                        H1B h1b = this.LIZJ;
                        H15 h15 = this.LIZIZ;
                        Bitmap LJJIJIL = C86793Y4n.LJJIJIL(LIZLLL, h16.LIZJ.LIZIZ.getFirst().intValue(), h16.LIZJ.LIZIZ.getSecond().intValue());
                        InterfaceC88472Yns<Bitmap, Bitmap> interfaceC88472Yns = h16.LIZLLL.LIZIZ;
                        if (interfaceC88472Yns != null) {
                            LJJIJIL = interfaceC88472Yns.invoke(LIZLLL);
                        }
                        String valueOf = String.valueOf(i);
                        String LJ = h15.LJ();
                        h1b.getClass();
                        String absolutePath = H1B.LIZIZ(LJJIJIL, valueOf, LJ, null).getAbsolutePath();
                        o.LJIIIIZZ(absolutePath, "file.absolutePath");
                        arrayList.add(absolutePath);
                    }
                } catch (Exception e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("resizePicturesForAI fail err: ");
                    LIZ.append(e);
                    H78.LIZ(X1D.LIZIZ(LIZ));
                }
            }
            i = i2;
        }
        return C38978FRm.LIZ(this.LIZIZ.LJ(), arrayList);
    }

    public H17(H1B h1b, H16 h16, H15 h15) {
        this.LIZ = h16;
        this.LIZIZ = h15;
        this.LIZJ = h1b;
    }
}
