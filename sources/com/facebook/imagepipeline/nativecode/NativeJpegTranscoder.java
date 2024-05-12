package com.facebook.imagepipeline.nativecode;

import X.C32151Nz;
import X.C65767PrX;
import X.C79234V7u;
import X.C79238V7y;
import X.C81713W5d;
import X.C81796W8i;
import X.C81828W9o;
import X.V84;
import X.V85;
import X.V8V;
import X.W8X;
import X.W98;
import X.WFR;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes14.dex */
public class NativeJpegTranscoder implements W98 {
    public int mMaxBitmapSize;
    public boolean mResizingEnabled;
    public boolean mUseDownsamplingRatio;

    public static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    public static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @Override // X.W98
    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    static {
        C81713W5d.LIZ("imagepipeline");
    }

    @Override // X.W98
    public boolean canTranscode(C81828W9o c81828W9o) {
        if (c81828W9o == C81796W8i.LIZ) {
            return true;
        }
        return false;
    }

    public NativeJpegTranscoder(boolean z, int i, boolean z2) {
        this.mResizingEnabled = z;
        this.mMaxBitmapSize = i;
        this.mUseDownsamplingRatio = z2;
    }

    @Override // X.W98
    public boolean canResize(W8X w8x, V85 v85, C79238V7y c79238V7y) {
        if (v85 == null) {
            v85 = V85.LIZJ;
        }
        if (V84.LIZJ(v85, c79238V7y, w8x, this.mResizingEnabled) < 8) {
            return true;
        }
        return false;
    }

    public static void transcodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (i2 >= 1) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32151Nz.LJI(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C32151Nz.LJI(z3);
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C32151Nz.LJI(z4);
        if (i >= 0 && i <= 270 && i % 90 == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        C32151Nz.LJI(z5);
        if (i2 != 8 || i != 0) {
            z6 = true;
        }
        C32151Nz.LJFF("no transformation requested", z6);
        inputStream.getClass();
        outputStream.getClass();
        nativeTranscodeJpeg(inputStream, outputStream, i, i2, i3);
    }

    public static void transcodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (i2 >= 1) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32151Nz.LJI(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C32151Nz.LJI(z3);
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C32151Nz.LJI(z4);
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z5 = true;
                break;
            default:
                z5 = false;
                break;
        }
        C32151Nz.LJI(z5);
        if (i2 != 8 || i != 1) {
            z6 = true;
        }
        C32151Nz.LJFF("no transformation requested", z6);
        inputStream.getClass();
        outputStream.getClass();
        nativeTranscodeJpegWithExifOrientation(inputStream, outputStream, i, i2, i3);
    }

    @Override // X.W98
    public V8V transcode(W8X w8x, OutputStream outputStream, V85 v85, C79238V7y c79238V7y, C81828W9o c81828W9o, Integer num) {
        if (num == null) {
            num = 85;
        }
        if (v85 == null) {
            v85 = V85.LIZJ;
        }
        int LJII = C79234V7u.LJII(v85, c79238V7y, w8x, this.mMaxBitmapSize);
        try {
            int LIZJ = V84.LIZJ(v85, c79238V7y, w8x, this.mResizingEnabled);
            int i = 1;
            int max = Math.max(1, 8 / LJII);
            if (this.mUseDownsamplingRatio) {
                LIZJ = max;
            }
            InputStream LJFF = w8x.LJFF();
            C65767PrX<Integer> c65767PrX = V84.LIZ;
            w8x.LJIILIIL();
            if (c65767PrX.contains(Integer.valueOf(w8x.LJLJJL))) {
                transcodeJpegWithExifOrientation(LJFF, outputStream, V84.LIZ(v85, w8x), LIZJ, num.intValue());
            } else {
                transcodeJpeg(LJFF, outputStream, V84.LIZIZ(v85, w8x), LIZJ, num.intValue());
            }
            WFR.LIZIZ(LJFF);
            if (LJII != 1) {
                i = 0;
            }
            return new V8V(i);
        } catch (Throwable th) {
            WFR.LIZIZ(null);
            throw th;
        }
    }
}
