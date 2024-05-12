package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* loaded from: classes15.dex */
public class W5C extends W5B {
    public volatile Bitmap mBitmap;
    public C81392Vwy<Bitmap> mBitmapReference;
    public final int mExifOrientation;
    public final InterfaceC45733HxB mQualityInfo;
    public final Rect mRegionToDecode;
    public final int mRotationAngle;
    public final int mSampleSize;
    public final Rect mSmartCrop;

    private synchronized C81392Vwy<Bitmap> detachBitmapReference() {
        C81392Vwy<Bitmap> c81392Vwy;
        c81392Vwy = this.mBitmapReference;
        this.mBitmapReference = null;
        this.mBitmap = null;
        return c81392Vwy;
    }

    public synchronized C81392Vwy<Bitmap> cloneUnderlyingBitmapReference() {
        return C81392Vwy.LIZJ(this.mBitmapReference);
    }

    public synchronized C81392Vwy<Bitmap> convertToBitmapReference() {
        C32151Nz.LJIIIIZZ(this.mBitmapReference, "Cannot convert a closed static bitmap");
        return detachBitmapReference();
    }

    @Override // X.InterfaceC81599W0t
    public int getImageCount() {
        return 1;
    }

    @Override // X.W5A
    public synchronized boolean isClosed() {
        boolean z;
        if (this.mBitmapReference != null) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @Override // X.InterfaceC81599W0t
    public int getHeight() {
        int i;
        if (this.mRotationAngle % 180 != 0 || (i = this.mExifOrientation) == 5 || i == 7) {
            return getBitmapWidth(this.mBitmap);
        }
        return getBitmapHeight(this.mBitmap);
    }

    @Override // X.W5A
    public int getSizeInBytes() {
        return W6I.LIZJ(this.mBitmap);
    }

    @Override // X.InterfaceC81599W0t
    public int getWidth() {
        int i;
        if (this.mRotationAngle % 180 != 0 || (i = this.mExifOrientation) == 5 || i == 7) {
            return getBitmapHeight(this.mBitmap);
        }
        return getBitmapWidth(this.mBitmap);
    }

    @Override // X.W5A, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C81392Vwy<Bitmap> detachBitmapReference = detachBitmapReference();
        if (detachBitmapReference != null) {
            detachBitmapReference.close();
        }
    }

    @Override // X.W5A
    public InterfaceC45733HxB getQualityInfo() {
        return this.mQualityInfo;
    }

    @Override // X.W5A
    public Rect getRegionToDecode() {
        return this.mRegionToDecode;
    }

    @Override // X.W5A
    public int getSampleSize() {
        return this.mSampleSize;
    }

    @Override // X.W5A
    public Rect getSmartCrop() {
        return this.mSmartCrop;
    }

    @Override // X.W5B
    public Bitmap getUnderlyingBitmap() {
        return this.mBitmap;
    }

    public static int getBitmapHeight(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public static int getBitmapWidth(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public W5C(C81392Vwy<Bitmap> c81392Vwy, InterfaceC45733HxB interfaceC45733HxB, int i) {
        this(c81392Vwy, interfaceC45733HxB, i, 0);
    }

    public W5C(C81392Vwy<Bitmap> c81392Vwy, InterfaceC45733HxB interfaceC45733HxB, int i, C81828W9o c81828W9o) {
        this(c81392Vwy, interfaceC45733HxB, i, 0, (Rect) null, (Rect) null, -1, c81828W9o);
    }

    public W5C(C81392Vwy<Bitmap> c81392Vwy, InterfaceC45733HxB interfaceC45733HxB, int i, int i2) {
        this(c81392Vwy, interfaceC45733HxB, i, i2, null, null, -1);
    }

    public W5C(Bitmap bitmap, VWQ<Bitmap> vwq, InterfaceC45733HxB interfaceC45733HxB, int i) {
        this(bitmap, vwq, interfaceC45733HxB, i, 0);
    }

    public W5C(Bitmap bitmap, VWQ<Bitmap> vwq, InterfaceC45733HxB interfaceC45733HxB, int i, int i2) {
        this(bitmap, vwq, interfaceC45733HxB, i, i2, (Rect) null, (Rect) null, -1);
    }

    public W5C(C81392Vwy<Bitmap> c81392Vwy, InterfaceC45733HxB interfaceC45733HxB, int i, int i2, Rect rect, Rect rect2, int i3) {
        C81392Vwy<Bitmap> LIZIZ = c81392Vwy.LIZIZ();
        LIZIZ.getClass();
        this.mBitmapReference = LIZIZ;
        this.mBitmap = LIZIZ.LJI();
        this.mQualityInfo = interfaceC45733HxB;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
        this.mRegionToDecode = rect;
        this.mSmartCrop = rect2;
        this.mSampleSize = i3;
    }

    public W5C(C81392Vwy<Bitmap> c81392Vwy, InterfaceC45733HxB interfaceC45733HxB, int i, int i2, Rect rect, Rect rect2, int i3, C81828W9o c81828W9o) {
        C81392Vwy<Bitmap> LIZIZ = c81392Vwy.LIZIZ();
        LIZIZ.getClass();
        this.mBitmapReference = LIZIZ;
        this.mBitmap = LIZIZ.LJI();
        this.mQualityInfo = interfaceC45733HxB;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
        this.mRegionToDecode = rect;
        this.mSmartCrop = rect2;
        this.mSampleSize = i3;
        this.mImageFormat = c81828W9o;
    }

    public W5C(Bitmap bitmap, VWQ<Bitmap> vwq, InterfaceC45733HxB interfaceC45733HxB, int i, int i2, Rect rect, Rect rect2, int i3) {
        bitmap.getClass();
        this.mBitmap = bitmap;
        Bitmap bitmap2 = this.mBitmap;
        vwq.getClass();
        this.mBitmapReference = C81392Vwy.LJIILIIL(bitmap2, vwq);
        this.mQualityInfo = interfaceC45733HxB;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
        this.mRegionToDecode = rect;
        this.mSmartCrop = rect2;
        this.mSampleSize = i3;
    }

    public W5C(Bitmap bitmap, VWQ<Bitmap> vwq, InterfaceC45733HxB interfaceC45733HxB, int i, int i2, Rect rect, Rect rect2, int i3, C81828W9o c81828W9o) {
        bitmap.getClass();
        this.mBitmap = bitmap;
        Bitmap bitmap2 = this.mBitmap;
        vwq.getClass();
        this.mBitmapReference = C81392Vwy.LJIILIIL(bitmap2, vwq);
        this.mQualityInfo = interfaceC45733HxB;
        this.mRotationAngle = i;
        this.mExifOrientation = i2;
        this.mRegionToDecode = rect;
        this.mSmartCrop = rect2;
        this.mSampleSize = i3;
        this.mImageFormat = c81828W9o;
    }
}
