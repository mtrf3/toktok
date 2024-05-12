package X;

import java.io.File;

/* loaded from: classes16.dex */
public final class XA7 {
    public static XA7 LJFF;
    public final File LIZIZ;
    public C84378X9q LJ;
    public final XA8 LIZLLL = new XA8();
    public final int LIZJ = 524288000;
    public final XA6 LIZ = new XA6();

    public final synchronized C84378X9q LIZ() {
        if (this.LJ == null) {
            this.LJ = C84378X9q.LJFF(this.LIZIZ, this.LIZJ);
        }
        return this.LJ;
    }

    public XA7(File file) {
        this.LIZIZ = file;
    }
}
