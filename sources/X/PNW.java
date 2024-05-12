package X;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class PNW implements InterfaceC84250X4s {
    public final File LIZ;
    public final boolean LIZIZ;

    @Override // X.InterfaceC84250X4s
    public final int LIZ() {
        return 1;
    }

    @Override // X.InterfaceC84250X4s
    public final String LIZIZ() {
        return "";
    }

    @Override // X.InterfaceC84250X4s
    public final File LIZJ() {
        return this.LIZ.getParentFile();
    }

    @Override // X.InterfaceC84250X4s
    public final long LJ() {
        return this.LIZ.lastModified();
    }

    @Override // X.InterfaceC84250X4s
    public final FileInputStream LJFF() {
        if (this.LIZ.isFile()) {
            return new FileInputStream(this.LIZ);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.getAbsolutePath());
        LIZ.append(" Fail to obtain InputStream, file type error");
        throw new IOException(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC84250X4s
    public final FileOutputStream LJI() {
        return new FileOutputStream(this.LIZ);
    }

    @Override // X.InterfaceC84250X4s
    public final String LJIIIIZZ() {
        return this.LIZ.getAbsolutePath();
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJIIJ() {
        return this.LIZ.exists();
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJIIJJI() {
        return this.LIZ.canWrite();
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJIIL() {
        if (!this.LIZIZ) {
            return true;
        }
        return C16880lQ.LLLZZIL(this.LIZ);
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
    public final File LIZLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJII(C84238X4g c84238X4g) {
        return this.LIZ.renameTo(c84238X4g.LIZLLL());
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJIIIZ(long j) {
        return this.LIZ.setLastModified(j);
    }

    public PNW(String str, String str2, boolean z) {
        this.LIZIZ = true;
        if (!TextUtils.isEmpty(str2)) {
            this.LIZ = new File(str, str2);
        } else {
            this.LIZ = new File(str);
        }
        if (z) {
            this.LIZIZ = C84246X4o.LIZIZ(str);
        }
    }
}
