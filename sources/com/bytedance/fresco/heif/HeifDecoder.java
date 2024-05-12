package com.bytedance.fresco.heif;

import X.C06830Op;
import X.C81392Vwy;
import X.C81792W8e;
import X.C81810W8w;
import X.C81828W9o;
import X.InterfaceC45733HxB;
import X.InterfaceC81825W9l;
import X.InterfaceC81842WAc;
import X.VWQ;
import X.W58;
import X.W5A;
import X.W5C;
import X.W84;
import X.W8X;
import X.W95;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Pair;

/* loaded from: classes15.dex */
public class HeifDecoder {
    public static final C81828W9o HEIF_FORMAT = new C81828W9o("HEIF_FORMAT");
    public static final C81828W9o HEIF_FORMAT_ANIMATED = new C81828W9o("HEIF_FORMAT_ANIMATED");
    public static boolean DEBUG = false;
    public static InterfaceC81825W9l sBitmapFactory = new HeifBitmapFactoryImpl();
    public static boolean sHeifWppEnable = true;

    /* loaded from: classes15.dex */
    public static class HeifFormatDecoder implements InterfaceC81842WAc {
        public boolean mDecodeHeicUseSystemApiFirst;
        public W95 mPlatformDecoder;
        public W84 mPooledByteBufferFactory;

        public boolean isDecodeHeicUseSystemApiFirst() {
            return this.mDecodeHeicUseSystemApiFirst;
        }

        public HeifFormatDecoder(W84 w84) {
            this.mPooledByteBufferFactory = w84;
        }

        public void setDecodeHeicUseSystemApiFirst(boolean z) {
            this.mDecodeHeicUseSystemApiFirst = z;
        }

        public HeifFormatDecoder(boolean z) {
            this.mDecodeHeicUseSystemApiFirst = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00c7 A[Catch: all -> 0x00ec, TryCatch #6 {all -> 0x00ec, blocks: (B:7:0x001a, B:9:0x001e, B:11:0x0029, B:15:0x0056, B:29:0x008b, B:46:0x0094, B:47:0x0097, B:18:0x00c1, B:20:0x00c7, B:21:0x00ca, B:48:0x0098, B:50:0x00a9, B:52:0x00af, B:39:0x0077, B:36:0x0082), top: B:6:0x001a, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private X.W5A decodeUseLibHeifFirst(X.W8X r18, int r19, X.InterfaceC45733HxB r20, X.C81810W8w r21) {
            /*
                Method dump skipped, instructions count: 273
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.fresco.heif.HeifDecoder.HeifFormatDecoder.decodeUseLibHeifFirst(X.W8X, int, X.HxB, X.W8w):X.W5A");
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00d8 A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:7:0x001a, B:9:0x001e, B:11:0x0029, B:37:0x0061, B:40:0x0085, B:19:0x00d2, B:21:0x00d8, B:22:0x00db, B:47:0x0082, B:59:0x009c, B:60:0x009f, B:16:0x00a0, B:18:0x00c1, B:32:0x00ba, B:27:0x00a6, B:49:0x006d, B:45:0x0079), top: B:6:0x001a, inners: #3, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private X.W5A decodeUseSystemApiFirst(X.W8X r17, int r18, X.InterfaceC45733HxB r19, X.C81810W8w r20) {
            /*
                Method dump skipped, instructions count: 290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.fresco.heif.HeifDecoder.HeifFormatDecoder.decodeUseSystemApiFirst(X.W8X, int, X.HxB, X.W8w):X.W5A");
        }

        @Override // X.InterfaceC81842WAc
        public W5A decode(W8X w8x, int i, InterfaceC45733HxB interfaceC45733HxB, C81810W8w c81810W8w) {
            if (!this.mDecodeHeicUseSystemApiFirst) {
                return decodeUseLibHeifFirst(w8x, i, interfaceC45733HxB, c81810W8w);
            }
            return decodeUseSystemApiFirst(w8x, i, interfaceC45733HxB, c81810W8w);
        }
    }

    public static BitmapFactory.Options getDecodeOptionsForStream(W8X w8x, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = w8x.LJLJLJ;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(w8x.LJFF(), null, options);
        if (options.outWidth != -1 && options.outHeight != -1) {
            options.inJustDecodeBounds = false;
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inMutable = true;
            return options;
        }
        throw new IllegalArgumentException(C81792W8e.LIZIZ(w8x));
    }

    public static BitmapFactory.Options getDecodeOptionsHasDecodeBound(W8X w8x, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = w8x.LJLJLJ;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(w8x.LJFF(), null, options);
        if (options.outWidth != -1 && options.outHeight != -1) {
            options.inJustDecodeBounds = false;
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inMutable = true;
            return options;
        }
        throw new IllegalArgumentException(C81792W8e.LIZIZ(w8x));
    }

    public static BitmapFactory.Options getDecodeOptionsNoDecodeBound(W8X w8x, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = w8x.LJLJLJ;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    public static Rect getRegionToDecode(W8X w8x, C81810W8w c81810W8w) {
        Rect rect = w8x.LJLLJ;
        if (rect != null) {
            if (c81810W8w.LJIIJJI) {
                return rect;
            }
            return c81810W8w.LJIIL;
        }
        return c81810W8w.LJIIL;
    }

    public static Bitmap trimBitmap(Bitmap bitmap, W8X w8x) {
        w8x.LJIILIIL();
        int i = w8x.LJLJJLL;
        w8x.LJIILIIL();
        int i2 = w8x.LJLJL;
        int byteCount = bitmap.getByteCount();
        if (byteCount > 104857600) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append("x");
            LIZ.append(i2);
            StringBuilder LIZ2 = C06830Op.LIZ("Too large(", byteCount, ")bytes bitmap.  dimension: ", X1D.LIZIZ(LIZ), " sampleSize: ");
            LIZ2.append(w8x.LJLJLJ);
            LIZ2.append(" Config: ");
            LIZ2.append(bitmap.getConfig());
            String LIZIZ = X1D.LIZIZ(LIZ2);
            if (W58.LIZ.LJIIIIZZ(5)) {
                W58.LIZ.w("XGFrescoLog", LIZIZ);
            }
            Pair<Integer, Integer> calcDstWidthHeight = calcDstWidthHeight(i, i2, byteCount);
            return Bitmap.createScaledBitmap(bitmap, ((Integer) calcDstWidthHeight.first).intValue(), ((Integer) calcDstWidthHeight.second).intValue(), false);
        }
        return bitmap;
    }

    /* loaded from: classes15.dex */
    public static class HeifBitmap extends W5C {
        public HeifBitmap(C81392Vwy<Bitmap> c81392Vwy, InterfaceC45733HxB interfaceC45733HxB, int i) {
            super(c81392Vwy, interfaceC45733HxB, i);
        }

        public HeifBitmap(Bitmap bitmap, VWQ<Bitmap> vwq, InterfaceC45733HxB interfaceC45733HxB, int i, int i2, Rect rect, Rect rect2, int i3, C81828W9o c81828W9o) {
            super(bitmap, vwq, interfaceC45733HxB, i, i2, rect, rect2, i3, c81828W9o);
        }
    }

    public static Pair<Integer, Integer> calcDstWidthHeight(int i, int i2, int i3) {
        float f = i * i2 * (4194304.0f / i3);
        float f2 = i / i2;
        return new Pair<>(Integer.valueOf((int) Math.sqrt(f * f2)), Integer.valueOf((int) Math.sqrt(f / f2)));
    }
}
