package X;

import java.io.File;

/* renamed from: X.X9s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84380X9s {
    public final C84379X9r LIZ;
    public final boolean[] LIZIZ;
    public boolean LIZJ;
    public final /* synthetic */ C84378X9q LIZLLL;

    public final File LIZ() {
        File file;
        synchronized (this.LIZLLL) {
            C84379X9r c84379X9r = this.LIZ;
            if (c84379X9r.LJFF == this) {
                if (!c84379X9r.LJ) {
                    this.LIZIZ[0] = true;
                }
                file = c84379X9r.LIZLLL[0];
                if (!this.LIZLLL.LJLIL.exists()) {
                    this.LIZLLL.LJLIL.mkdirs();
                }
            } else {
                throw new IllegalStateException();
            }
        }
        return file;
    }

    public C84380X9s(C84378X9q c84378X9q, C84379X9r c84379X9r) {
        boolean[] zArr;
        this.LIZLLL = c84378X9q;
        this.LIZ = c84379X9r;
        if (c84379X9r.LJ) {
            zArr = null;
        } else {
            zArr = new boolean[c84378X9q.LJLJL];
        }
        this.LIZIZ = zArr;
    }
}
