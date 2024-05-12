package X;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* renamed from: X.WQk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82266WQk implements InterfaceC82272WQq {
    public InterfaceC82277WQv LIZ;
    public final InterfaceC82278WQw LIZIZ;

    public C82266WQk(C82261WQf c82261WQf) {
        this.LIZIZ = c82261WQf;
    }

    @Override // X.InterfaceC82272WQq
    public final boolean LIZ(int i) {
        if (LJII(i)) {
            return true;
        }
        String LIZIZ = LIZIZ(i);
        File file = new File(LIZIZ);
        File file2 = new File(LIZLLL(i), LJFF(i));
        try {
            try {
                C44687HgJ.LJFF(LIZIZ, false);
                C44687HgJ.LJIIL(file);
                C38978FRm.LIZLLL(file2, file);
                InterfaceC82277WQv interfaceC82277WQv = this.LIZ;
                if (interfaceC82277WQv != null) {
                    interfaceC82277WQv.LIZ(file2);
                }
                return true;
            } catch (IOException e) {
                InterfaceC82277WQv interfaceC82277WQv2 = this.LIZ;
                if (interfaceC82277WQv2 != null) {
                    interfaceC82277WQv2.LIZIZ(i, file2, e);
                }
                C16880lQ.LLLZZIL(file2);
                return false;
            }
        } finally {
            C16880lQ.LLLZZIL(file2);
        }
    }

    @Override // X.InterfaceC82278WQw
    public final String LIZIZ(int i) {
        return this.LIZIZ.LIZIZ(i);
    }

    @Override // X.InterfaceC82272WQq
    public boolean LIZJ(C79155V4t filterMeta) {
        o.LJIIIZ(filterMeta, "filterMeta");
        return LJII(filterMeta.LIZ);
    }

    @Override // X.InterfaceC82278WQw
    public final String LIZLLL(int i) {
        return this.LIZIZ.LIZLLL(i);
    }

    @Override // X.InterfaceC82272WQq
    public final C82273WQr LJ(int i) {
        String LIZIZ = LIZIZ(i);
        return new C82273WQr(C77412UZs.LJIILIIL(LIZIZ), LIZIZ);
    }

    @Override // X.InterfaceC82278WQw
    public final String LJFF(int i) {
        return this.LIZIZ.LJFF(i);
    }

    @Override // X.InterfaceC82272WQq
    public final void LJI(InterfaceC82277WQv interfaceC82277WQv) {
        this.LIZ = interfaceC82277WQv;
    }

    public boolean LJII(int i) {
        File[] listFiles;
        File file = new File(LIZIZ(i));
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return false;
        }
        boolean z = false;
        for (File child : listFiles) {
            o.LJIIIIZZ(child, "child");
            if (child.isDirectory()) {
                String name = child.getName();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(child.getAbsolutePath());
                String str = File.separator;
                if (!new File(C025908h.LIZIZ(LIZ, str, name, ".png", LIZ)).exists()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(child.getAbsolutePath());
                    LIZ2.append(str);
                    LIZ2.append(name);
                    LIZ2.append(".jpg");
                    if (!new File(X1D.LIZIZ(LIZ2)).exists()) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(child.getAbsolutePath());
                        LIZ3.append(str);
                        LIZ3.append(name);
                        LIZ3.append(".JPG");
                        if (!new File(X1D.LIZIZ(LIZ3)).exists()) {
                        }
                    }
                }
                z = true;
            }
        }
        return z;
    }
}
