package com.facebook.imagepipeline.nativecode;

import X.C16880lQ;
import X.C81392Vwy;
import X.C81713W5d;
import X.C81803W8p;
import X.InterfaceC81378Vwk;
import X.J74;
import X.J7I;
import X.W6I;
import X.W8X;
import X.W95;
import X.W9V;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.util.Locale;

/* loaded from: classes15.dex */
public abstract class DalvikPurgeableDecoder implements W95 {
    public static final byte[] EOI;
    public final C81803W8p mUnpooledBitmapsCounter;

    public static native void nativePinBitmap(Bitmap bitmap);

    public abstract Bitmap decodeByteArrayAsPurgeable(C81392Vwy<InterfaceC81378Vwk> c81392Vwy, BitmapFactory.Options options);

    public abstract Bitmap decodeJPEGByteArrayAsPurgeable(C81392Vwy<InterfaceC81378Vwk> c81392Vwy, int i, BitmapFactory.Options options);

    static {
        C81713W5d.LIZ("imagepipeline");
        EOI = new byte[]{-1, -39};
    }

    public DalvikPurgeableDecoder() {
        if (W9V.LIZJ == null) {
            synchronized (W9V.class) {
                if (W9V.LIZJ == null) {
                    W9V.LIZJ = new C81803W8p(W9V.LIZIZ, W9V.LIZ);
                }
            }
        }
        this.mUnpooledBitmapsCounter = W9V.LIZJ;
    }

    public C81392Vwy<Bitmap> pinBitmap(Bitmap bitmap) {
        bitmap.getClass();
        try {
            nativePinBitmap(bitmap);
            C81803W8p c81803W8p = this.mUnpooledBitmapsCounter;
            synchronized (c81803W8p) {
                int LIZJ = W6I.LIZJ(bitmap);
                int i = c81803W8p.LIZ;
                if (i < c81803W8p.LIZJ) {
                    long j = c81803W8p.LIZIZ + LIZJ;
                    if (j <= c81803W8p.LIZLLL) {
                        c81803W8p.LIZ = i + 1;
                        c81803W8p.LIZIZ = j;
                        return C81392Vwy.LJIILIIL(bitmap, this.mUnpooledBitmapsCounter.LJ);
                    }
                }
                int LIZJ2 = W6I.LIZJ(bitmap);
                bitmap.recycle();
                throw new J74(C16880lQ.LLLZI(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[]{Integer.valueOf(LIZJ2), Integer.valueOf(this.mUnpooledBitmapsCounter.LIZIZ()), Long.valueOf(this.mUnpooledBitmapsCounter.LJ()), Integer.valueOf(this.mUnpooledBitmapsCounter.LIZJ()), Integer.valueOf(this.mUnpooledBitmapsCounter.LIZLLL())}));
            }
        } catch (Exception e) {
            bitmap.recycle();
            J7I.LJIIL(e);
            throw null;
        }
    }

    public static boolean endsWithEOI(C81392Vwy<InterfaceC81378Vwk> c81392Vwy, int i) {
        InterfaceC81378Vwk LJI = c81392Vwy.LJI();
        if (i >= 2 && LJI.read(i - 2) == -1 && LJI.read(i - 1) == -39) {
            return true;
        }
        return false;
    }

    public static BitmapFactory.Options getBitmapFactoryOptions(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        return options;
    }

    public C81392Vwy<Bitmap> decodeFromEncodedImage(W8X w8x, Bitmap.Config config, Rect rect) {
        return decodeFromEncodedImageWithColorSpace(w8x, config, rect, false);
    }

    @Override // X.W95
    public C81392Vwy<Bitmap> decodeFromEncodedImageWithColorSpace(W8X w8x, Bitmap.Config config, Rect rect, boolean z) {
        BitmapFactory.Options bitmapFactoryOptions = getBitmapFactoryOptions(w8x.LJLJLJ, config);
        C81392Vwy<InterfaceC81378Vwk> LIZLLL = w8x.LIZLLL();
        LIZLLL.getClass();
        try {
            return pinBitmap(decodeByteArrayAsPurgeable(LIZLLL, bitmapFactoryOptions));
        } finally {
            C81392Vwy.LJ(LIZLLL);
        }
    }

    public C81392Vwy<Bitmap> decodeJPEGFromEncodedImage(W8X w8x, Bitmap.Config config, Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(w8x, config, rect, i, false);
    }

    @Override // X.W95
    public C81392Vwy<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(W8X w8x, Bitmap.Config config, Rect rect, int i, boolean z) {
        BitmapFactory.Options bitmapFactoryOptions = getBitmapFactoryOptions(w8x.LJLJLJ, config);
        C81392Vwy<InterfaceC81378Vwk> LIZLLL = w8x.LIZLLL();
        LIZLLL.getClass();
        try {
            return pinBitmap(decodeJPEGByteArrayAsPurgeable(LIZLLL, i, bitmapFactoryOptions));
        } finally {
            C81392Vwy.LJ(LIZLLL);
        }
    }
}
