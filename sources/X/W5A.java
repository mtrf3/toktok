package X;

import android.graphics.Rect;
import java.io.Closeable;

/* loaded from: classes15.dex */
public abstract class W5A implements Closeable, InterfaceC81599W0t, InterfaceC81386Vws {
    public boolean isHitDiskCache;
    public boolean isHitMemoryCache;
    public boolean isRequestInternet;
    public boolean isThumbCache;
    public C81828W9o mImageFormat;

    public W5A cloneOrNull() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public Rect getRegionToDecode() {
        return null;
    }

    public int getSampleSize() {
        return -1;
    }

    public abstract int getSizeInBytes();

    public Rect getSmartCrop() {
        return null;
    }

    public String getSourceUri() {
        return null;
    }

    @Override // X.InterfaceC81386Vws
    public void hitMemoryCache() {
        this.isHitMemoryCache = true;
        this.isHitDiskCache = false;
        this.isRequestInternet = false;
    }

    public abstract boolean isClosed();

    public boolean isStateful() {
        return false;
    }

    public void setSourceUri(String str) {
    }

    public C81828W9o getImageFormat() {
        C81828W9o c81828W9o = this.mImageFormat;
        if (c81828W9o == null) {
            return C81828W9o.LIZIZ;
        }
        return c81828W9o;
    }

    public void finalize() {
        if (isClosed()) {
            return;
        }
        String LJLLJ = C16880lQ.LJLLJ(getClass());
        Integer valueOf = Integer.valueOf(System.identityHashCode(this));
        if (W58.LIZ.LJIIIIZZ(3)) {
            W58.LIZ.d("CloseableImage", C16880lQ.LLLZI(null, "finalize: %s %x still open.", new Object[]{LJLLJ, valueOf}));
        }
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public InterfaceC45733HxB getQualityInfo() {
        return W8A.LIZLLL;
    }

    public void copyImageFromTrace(W8X w8x) {
        this.isRequestInternet = w8x.LJLLLL;
        this.isHitDiskCache = w8x.LJLLLLLL;
        this.isHitMemoryCache = w8x.LJLZ;
    }
}
