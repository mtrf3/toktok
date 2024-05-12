package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: X.X4g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84238X4g implements InterfaceC84250X4s {
    public final InterfaceC84250X4s LIZ;

    @Override // X.InterfaceC84250X4s
    public final int LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.InterfaceC84250X4s
    public final String LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC84250X4s
    public final File LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // X.InterfaceC84250X4s
    public final File LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.InterfaceC84250X4s
    public final long LJ() {
        return this.LIZ.LJ();
    }

    @Override // X.InterfaceC84250X4s
    public final FileInputStream LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // X.InterfaceC84250X4s
    public final FileOutputStream LJI() {
        return this.LIZ.LJI();
    }

    @Override // X.InterfaceC84250X4s
    public final String LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // X.InterfaceC84250X4s
    public final String getPath() {
        return this.LIZ.getPath();
    }

    @Override // X.InterfaceC84250X4s
    public final boolean isDirectory() {
        return this.LIZ.isDirectory();
    }

    @Override // X.InterfaceC84250X4s
    public final long length() {
        return this.LIZ.length();
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJII(C84238X4g c84238X4g) {
        return this.LIZ.LJII(c84238X4g);
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJIIIZ(long j) {
        return this.LIZ.LJIIIZ(j);
    }

    public C84238X4g(String str, String str2, boolean z, boolean z2) {
        int LJ = C84236X4e.LJ(str);
        if (LJ == 1) {
            this.LIZ = new PNW(str, str2, z);
            return;
        }
        try {
            android.net.Uri parse = UriProtector.parse(str);
            C84236X4e.LIZ(parse, LJ);
            this.LIZ = new C84237X4f(parse, LJ, z2);
        } catch (Throwable th) {
            this.LIZ = new PNX(th.toString());
        }
    }
}
