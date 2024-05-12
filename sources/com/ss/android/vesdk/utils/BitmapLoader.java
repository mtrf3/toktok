package com.ss.android.vesdk.utils;

import X.C16880lQ;
import X.P4Q;
import X.V0N;
import X.V2B;
import X.X1D;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ttve.nativePort.TEImageFactory;
import com.ss.android.vesdk.VEFileUtils;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes8.dex */
public class BitmapLoader {
    public static boolean isSampleSizeRound = false;
    public static int maxSide = 4096;

    public static int UpAlignPo2(int i, int i2) {
        return ((i + i2) - 1) & (~(i2 - 1));
    }

    /* loaded from: classes8.dex */
    public enum ImageRotation {
        INVALID(-1),
        ROTATION_0(0),
        ROTATION_90(90),
        ROTATION_180(180),
        ROTATION_270(270);

        public int value;

        public int getRotation() {
            return this.value;
        }

        public static ImageRotation valueOf(String str) {
            return (ImageRotation) V0N.LJJJ(ImageRotation.class, str);
        }

        ImageRotation(int i) {
            this.value = i;
        }
    }

    public static Bitmap makeDimensionEven(Bitmap bitmap) {
        boolean z;
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            boolean z2 = true;
            if ((bitmap.getWidth() & 1) == 1) {
                width = bitmap.getWidth() - 1;
                z = true;
            } else {
                z = false;
            }
            if ((bitmap.getHeight() & 1) == 1) {
                height = bitmap.getHeight() - 1;
            } else {
                z2 = z;
            }
            if (!z2) {
                return bitmap;
            }
            if (width <= 0 || height <= 0) {
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height);
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e) {
            e.getMessage();
            V2B.LJII("makeDimensionEven");
            return null;
        }
    }

    public static Point getPictureSize(ContentResolver contentResolver, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ParcelFileDescriptor parcelFileDescriptor = null;
        if (!VEFileUtils.isAndroidUriPath(str)) {
            TEImageFactory.decodeImage(null, null, null, str, options);
        } else {
            Uri parse = UriProtector.parse(str);
            try {
                try {
                    try {
                    } catch (Throwable th) {
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            } catch (FileNotFoundException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
            }
            if (contentResolver == null) {
                P4Q.LIZJ("BitmapLoader", "contentResolver should not be null after Android Q");
                return null;
            }
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                TEImageFactory.decodeImage(null, null, openFileDescriptor.getFileDescriptor(), str, options);
                openFileDescriptor.close();
            } catch (FileNotFoundException e4) {
                e = e4;
                parcelFileDescriptor = openFileDescriptor;
                C16880lQ.LLLLIIL(e);
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                return new Point(options.outWidth, options.outHeight);
            } catch (Throwable th3) {
                th = th3;
                parcelFileDescriptor = openFileDescriptor;
                P4Q.LIZJ("BitmapLoader", th.getMessage());
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                return new Point(options.outWidth, options.outHeight);
            }
        }
        return new Point(options.outWidth, options.outHeight);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r4 == null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getRotation(android.content.ContentResolver r5, java.lang.String r6) {
        /*
            boolean r0 = com.ss.android.vesdk.VEFileUtils.isAndroidUriPath(r6)
            r3 = 0
            r4 = 0
            if (r0 != 0) goto Le
            android.media.ExifInterface r4 = new android.media.ExifInterface     // Catch: java.io.IOException -> L79
            r4.<init>(r6)     // Catch: java.io.IOException -> L79
            goto L5f
        Le:
            if (r5 != 0) goto L18
            java.lang.String r1 = "BitmapLoader"
            java.lang.String r0 = "contentResolver should not be null after Android Q"
            X.P4Q.LIZJ(r1, r0)
            return r3
        L18:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r5.openFileDescriptor(r1, r0)     // Catch: java.io.FileNotFoundException -> L41 java.lang.Throwable -> L7d
            if (r2 != 0) goto L25
            return r3
        L25:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L39 java.io.FileNotFoundException -> L3f
            r0 = 24
            if (r1 < r0) goto L35
            android.media.ExifInterface r1 = new android.media.ExifInterface     // Catch: java.lang.Throwable -> L39 java.io.FileNotFoundException -> L3f
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch: java.lang.Throwable -> L39 java.io.FileNotFoundException -> L3f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L39 java.io.FileNotFoundException -> L3f
            r4 = r1
        L35:
            r2.close()     // Catch: java.io.IOException -> L59
            goto L5d
        L39:
            if (r2 == 0) goto L7d
            r2.close()     // Catch: java.io.IOException -> L59
            goto L7d
        L3f:
            r0 = move-exception
            goto L43
        L41:
            r0 = move-exception
            r2 = r4
        L43:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L47
            goto L53
        L47:
            r1 = move-exception
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L52:
            throw r1
        L53:
            if (r2 == 0) goto L7d
            r2.close()     // Catch: java.io.IOException -> L59
            goto L7d
        L59:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L5d:
            if (r4 == 0) goto L7d
        L5f:
            java.lang.String r0 = "Orientation"
            int r1 = r4.getAttributeInt(r0, r3)
            r0 = 3
            if (r1 == r0) goto L76
            r0 = 6
            if (r1 == r0) goto L73
            r0 = 8
            if (r1 == r0) goto L70
            return r3
        L70:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L73:
            r0 = 90
            return r0
        L76:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
        L79:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L7d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    public static Bitmap loadBitmap(String str, int i, int i2) {
        return loadBitmap(str, i, i2, ImageRotation.INVALID, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0081, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int calculateInSampleSize(android.content.ContentResolver r6, java.lang.String r7, int r8, int r9) {
        /*
            r4 = 1
            r0 = -1
            if (r8 == r0) goto L6
            if (r9 != r0) goto L7
        L6:
            return r4
        L7:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r5.inJustDecodeBounds = r4
            boolean r0 = com.ss.android.vesdk.VEFileUtils.isAndroidUriPath(r7)
            r3 = 0
            if (r0 != 0) goto L49
            com.ss.android.ttve.nativePort.TEImageFactory.decodeImage(r3, r3, r3, r7, r5)
        L18:
            int r6 = r5.outHeight
            int r3 = r5.outWidth
            if (r9 <= r8) goto L45
        L1e:
            if (r6 <= r3) goto L23
            r0 = r3
            r3 = r6
            r6 = r0
        L23:
            if (r6 > r8) goto L27
            if (r3 <= r9) goto L92
        L27:
            float r2 = (float) r3
            float r0 = (float) r9
            float r2 = r2 / r0
            float r1 = (float) r6
            float r0 = (float) r8
            float r1 = r1 / r0
            boolean r0 = com.ss.android.vesdk.utils.BitmapLoader.isSampleSizeRound
            if (r0 == 0) goto L8c
            float r0 = java.lang.Math.max(r1, r2)
            int r2 = java.lang.Math.round(r0)
        L39:
            int r1 = java.lang.Math.max(r3, r6)
            int r1 = r1 / r2
            int r0 = com.ss.android.vesdk.utils.BitmapLoader.maxSide
            if (r1 <= r0) goto L93
            int r2 = r2 * 2
            goto L39
        L45:
            r0 = r9
            r9 = r8
            r8 = r0
            goto L1e
        L49:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)
            if (r6 != 0) goto L57
            java.lang.String r1 = "BitmapLoader"
            java.lang.String r0 = "contentResolver should not be null after Android Q"
            X.P4Q.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L71 java.io.FileNotFoundException -> L7d
            goto L98
        L57:
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r6.openFileDescriptor(r1, r0)     // Catch: java.lang.Throwable -> L71 java.io.FileNotFoundException -> L7d
            if (r2 != 0) goto L60
            goto L99
        L60:
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch: java.lang.Throwable -> L6b java.io.FileNotFoundException -> L6e
            com.ss.android.ttve.nativePort.TEImageFactory.decodeImage(r3, r3, r0, r7, r5)     // Catch: java.lang.Throwable -> L6b java.io.FileNotFoundException -> L6e
            r2.close()     // Catch: java.io.IOException -> L87
            goto L18
        L6b:
            r1 = move-exception
            r3 = r2
            goto L72
        L6e:
            r0 = move-exception
            r3 = r2
            goto L7e
        L71:
            r1 = move-exception
        L72:
            java.lang.String r0 = "loadBitmap"
            r1.getMessage()     // Catch: java.lang.Throwable -> L9a
            X.V2B.LJII(r0)     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L18
            goto L83
        L7d:
            r0 = move-exception
        L7e:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L18
        L83:
            r3.close()     // Catch: java.io.IOException -> L87
            goto L18
        L87:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L18
        L8c:
            float r0 = java.lang.Math.max(r1, r2)
            int r2 = (int) r0
            goto L93
        L92:
            r2 = 0
        L93:
            int r0 = java.lang.Math.max(r4, r2)
            return r0
        L98:
            return r4
        L99:
            return r4
        L9a:
            r1 = move-exception
            if (r3 == 0) goto La5
            r3.close()     // Catch: java.io.IOException -> La1
            goto La5
        La1:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        La5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.calculateInSampleSize(android.content.ContentResolver, java.lang.String, int, int):int");
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i, int i2) {
        return loadBitmapCompat(contentResolver, str, i, i2, ImageRotation.INVALID, true);
    }

    public static int[] calAutoScale(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int[] iArr = new int[2];
        if (i > 0 || i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (i5 == 90 || i5 == 270) {
            i4 = i3;
            i3 = i4;
        }
        if (z) {
            if (i <= 0) {
                i = (i2 * i3) / i4;
            }
            if (i2 <= 0) {
                i2 = (i4 * i) / i3;
            }
            i3 = UpAlignPo2(i, 2);
            i4 = UpAlignPo2(i2, 2);
        }
        if (i5 == 90 || i5 == 270) {
            int i6 = i4;
            i4 = i3;
            i3 = i6;
        }
        iArr[0] = i3;
        iArr[1] = i4;
        return iArr;
    }

    public static Bitmap loadBitmap(String str, int i, int i2, ImageRotation imageRotation, boolean z) {
        return loadBitmap(str, i, i2, ImageRotation.INVALID, true, false);
    }

    public static Bitmap loadBitmap(String str, int i, int i2, ImageRotation imageRotation, boolean z, boolean z2) {
        return loadBitmap(str, i, i2, ImageRotation.INVALID, z, z2, false);
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i, int i2, ImageRotation imageRotation, boolean z) {
        return loadBitmapCompat(contentResolver, str, i, i2, ImageRotation.INVALID, true, false);
    }

    public static Bitmap loadBitmap(String str, int i, int i2, ImageRotation imageRotation, boolean z, boolean z2, boolean z3) {
        ExifInterface exifInterface;
        int i3;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i > 0 && i2 > 0) {
            options.inSampleSize = calculateInSampleSize(null, str, i, i2);
        }
        try {
            Bitmap decodeImage = TEImageFactory.decodeImage(null, null, null, str, options);
            if (decodeImage == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("BitmapFactory.decodeFile failed, imgPath");
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
                V2B.LJII("loadBitmap");
                return null;
            }
            if (imageRotation == ImageRotation.INVALID) {
                try {
                    exifInterface = new ExifInterface(str);
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                    exifInterface = null;
                }
                if (exifInterface != null) {
                    int attributeInt = exifInterface.getAttributeInt("Orientation", 0);
                    if (attributeInt != 3) {
                        if (attributeInt != 6) {
                            if (attributeInt == 8) {
                                i3 = 270;
                            }
                        } else {
                            i3 = 90;
                        }
                    } else {
                        i3 = 180;
                    }
                }
                i3 = 0;
            } else {
                i3 = imageRotation.getRotation();
            }
            if (z3) {
                int[] calAutoScale = calAutoScale(i, i2, decodeImage.getWidth(), decodeImage.getHeight(), i3);
                i = calAutoScale[0];
                i2 = calAutoScale[1];
            }
            if (z2) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeImage, i, i2, true);
                if (!createScaledBitmap.sameAs(decodeImage) && !decodeImage.isRecycled()) {
                    decodeImage.recycle();
                }
                decodeImage = createScaledBitmap;
            }
            if (i3 != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate(i3);
                Bitmap createBitmap = Bitmap.createBitmap(decodeImage, 0, 0, decodeImage.getWidth(), decodeImage.getHeight(), matrix, true);
                if (!decodeImage.isRecycled()) {
                    decodeImage.recycle();
                }
                decodeImage = createBitmap;
            }
            if (z) {
                return makeDimensionEven(decodeImage);
            }
            return decodeImage;
        } catch (Exception e2) {
            e2.getMessage();
            V2B.LJII("loadBitmap");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap loadBitmapCompat(android.content.ContentResolver r12, java.lang.String r13, int r14, int r15, com.ss.android.vesdk.utils.BitmapLoader.ImageRotation r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.utils.BitmapLoader.loadBitmapCompat(android.content.ContentResolver, java.lang.String, int, int, com.ss.android.vesdk.utils.BitmapLoader$ImageRotation, boolean, boolean):android.graphics.Bitmap");
    }
}
