package X;

import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final class J33 {
    public final String LIZ;
    public final J3K LIZIZ;
    public final J39 LIZJ;
    public final J3N LIZLLL;
    public final J3F LJ;
    public final InterfaceC40509Fv7 LJFF;
    public ExecutorService LJI;

    public J33(J37 j37) {
        String str = j37.LIZ;
        if (str != null) {
            J3K j3k = j37.LIZIZ;
            if (j3k != null) {
                J39 j39 = j37.LIZJ;
                if (j39 != null) {
                    this.LIZ = str;
                    this.LIZIZ = j3k;
                    this.LIZJ = j39;
                    this.LIZLLL = j37.LIZLLL;
                    this.LJFF = j37.LJFF;
                    this.LJI = null;
                    this.LJ = j37.LJ;
                    return;
                }
                throw new RuntimeException("must implement IConfigParser");
            }
            throw new RuntimeException("must implement IFileDownloader");
        }
        throw new RuntimeException("must specified cache path");
    }
}
