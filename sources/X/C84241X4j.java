package X;

import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: X.X4j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84241X4j implements X5F {
    public final Object LIZ = new Object();
    public final List<HttpHeader> LIZIZ;
    public final String LIZJ;
    public X5F LIZLLL;
    public boolean LJ;
    public long LJFF;
    public InputStream LJI;

    public final boolean LJ() {
        try {
            X5F x5f = this.LIZLLL;
            if (x5f == null) {
                return false;
            }
            int LIZ = x5f.LIZ();
            return LIZ >= 200 && LIZ < 300;
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.X5J
    public final int LIZ() {
        X5F x5f = this.LIZLLL;
        if (x5f != null) {
            return x5f.LIZ();
        }
        return 0;
    }

    @Override // X.X5F
    public final InputStream LIZJ() {
        InputStream inputStream = this.LJI;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final void LIZLLL() {
        X5F x5f;
        if (this.LIZLLL != null) {
            return;
        }
        synchronized (this.LIZ) {
            try {
                this.LJ = true;
                InterfaceC84217X3l LJIIIZ = C84212X3g.LJIIIZ();
                if (LJIIIZ != null) {
                    x5f = ((C48249Iwf) LJIIIZ).LIZ(this.LIZJ, this.LIZIZ);
                } else {
                    x5f = null;
                }
                this.LIZLLL = x5f;
                if (x5f != null) {
                    this.LJFF = System.currentTimeMillis();
                    this.LJI = this.LIZLLL.LIZJ();
                }
            } finally {
                this.LJ = false;
                this.LIZ.notifyAll();
            }
        }
    }

    public final void LJFF() {
        synchronized (this.LIZ) {
            if (this.LJ && this.LIZLLL == null) {
                this.LIZ.wait();
            }
        }
    }

    @Override // X.X5J
    public final void cancel() {
        X5F x5f = this.LIZLLL;
        if (x5f != null) {
            x5f.cancel();
        }
    }

    @Override // X.X5F
    public final void end() {
        X5F x5f = this.LIZLLL;
        if (x5f != null) {
            x5f.end();
        }
    }

    @Override // X.X5J
    public final String LIZIZ(String str) {
        X5F x5f = this.LIZLLL;
        if (x5f != null) {
            return x5f.LIZIZ(str);
        }
        return null;
    }

    public C84241X4j(int i, String str, List list) {
        this.LIZJ = str;
        this.LIZIZ = list;
    }
}
