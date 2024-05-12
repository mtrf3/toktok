package X;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* renamed from: X.W9r, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81831W9r extends W5A {
    public C81836W9w LJLIL;
    public final C81810W8w LJLILLLLZI;

    public final synchronized C81836W9w LIZ() {
        return this.LJLIL;
    }

    @Override // X.W5A
    public final W5A cloneOrNull() {
        C81831W9r c81831W9r;
        WA7 wa7;
        synchronized (this) {
            c81831W9r = null;
            if (!isClosed()) {
                wa7 = this.LJLIL.LIZ;
            } else {
                wa7 = null;
            }
        }
        if (wa7 == null) {
            return null;
        }
        WA7 cloneOrNull = wa7.cloneOrNull();
        if (cloneOrNull != null) {
            C81810W8w c81810W8w = this.LJLILLLLZI;
            C81828W9o imageFormat = getImageFormat();
            C81836W9w LIZ = LIZ();
            int i = LIZ.LIZIZ;
            C81392Vwy<Bitmap> LIZJ = LIZ.LIZJ();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    arrayList.add(LIZ.LIZIZ(i2));
                } finally {
                    C81392Vwy.LJ(LIZJ);
                    C81392Vwy.LJFF(arrayList);
                }
            }
            WA9 wa9 = new WA9(cloneOrNull);
            wa9.LIZIZ = C81392Vwy.LIZJ(LIZJ);
            wa9.LIZLLL = i;
            wa9.LIZJ = C81392Vwy.LIZLLL(arrayList);
            c81831W9r = new C81831W9r(wa9.LIZ(), c81810W8w, imageFormat);
        }
        return c81831W9r;
    }

    @Override // X.W5A, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            C81836W9w c81836W9w = this.LJLIL;
            if (c81836W9w == null) {
                return;
            }
            this.LJLIL = null;
            c81836W9w.LIZ();
        }
    }

    @Override // X.InterfaceC81599W0t
    public final synchronized int getHeight() {
        int height;
        if (!isClosed()) {
            height = this.LJLIL.LIZ.getHeight();
        } else {
            height = 0;
        }
        return height;
    }

    @Override // X.InterfaceC81599W0t
    public final synchronized int getImageCount() {
        return this.LJLIL.LIZ.getFrameCount();
    }

    @Override // X.W5A
    public final synchronized int getSizeInBytes() {
        int sizeInBytes;
        if (!isClosed()) {
            sizeInBytes = this.LJLIL.LIZ.getSizeInBytes();
        } else {
            sizeInBytes = 0;
        }
        return sizeInBytes;
    }

    @Override // X.InterfaceC81599W0t
    public final synchronized int getWidth() {
        int width;
        if (!isClosed()) {
            width = this.LJLIL.LIZ.getWidth();
        } else {
            width = 0;
        }
        return width;
    }

    @Override // X.W5A
    public final synchronized boolean isClosed() {
        boolean z;
        if (this.LJLIL != null) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @Override // X.W5A
    public final boolean isStateful() {
        return true;
    }

    @Override // X.W5A
    public final String getSourceUri() {
        C81836W9w c81836W9w = this.LJLIL;
        if (c81836W9w != null) {
            return c81836W9w.LJ;
        }
        return null;
    }

    @Override // X.W5A
    public final void setSourceUri(String str) {
        C81836W9w c81836W9w = this.LJLIL;
        if (c81836W9w != null) {
            if (c81836W9w.LIZ.getImageFormat() == C81796W8i.LJIIIZ || c81836W9w.LIZ.getImageFormat() == C81796W8i.LIZJ) {
                c81836W9w.LJ = str;
            }
        }
    }

    public C81831W9r(C81836W9w c81836W9w, C81810W8w c81810W8w, C81828W9o c81828W9o) {
        this.LJLIL = c81836W9w;
        this.LJLILLLLZI = c81810W8w;
        this.mImageFormat = c81828W9o;
    }
}
