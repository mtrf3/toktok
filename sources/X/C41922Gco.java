package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gco, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41922Gco extends AbstractC41925Gcr {
    public final C42362Gju LJIIIIZZ;

    @Override // X.AbstractC41925Gcr
    public final String LJFF() {
        return "mv";
    }

    @Override // X.AbstractC41925Gcr
    public final void LJIIJ() {
        if (this.LJIIIIZZ.LJLIL.isEmpty()) {
            LIZJ("");
        } else {
            super.LJIIJ();
        }
    }

    public C41922Gco(C42362Gju param) {
        o.LJIIIZ(param, "param");
        this.LJIIIIZZ = param;
    }

    @Override // X.AbstractC41925Gcr
    public final Object LIZ(InterfaceC67352kd interfaceC67352kd) {
        long currentTimeMillis = System.currentTimeMillis();
        List<String> LJIIZILJ = C86793Y4n.LJIIZILJ(AbstractC41925Gcr.LJ(), ORZ.LLJILJILJ(this.LJIIIIZZ.LJLIL));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (String str : LJIIZILJ) {
            int i2 = i + 1;
            if (C44687HgJ.LIZIZ(str)) {
                try {
                    Bitmap LIZLLL = C44694HgQ.LIZLLL(str, null);
                    if (LIZLLL != null) {
                        float f = this.LIZ;
                        String absolutePath = LJIIIZ(i, C86793Y4n.LJJIJIL(LIZLLL, f, f)).getAbsolutePath();
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
        AbstractC41925Gcr.LJI(System.currentTimeMillis() - currentTimeMillis, -1L);
        return AbstractC41925Gcr.LJIIIIZZ(LIZLLL(), arrayList);
    }
}
