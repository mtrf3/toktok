package com.ss.ttlivestreamer.livestreamv2.utils;

import X.C16880lQ;
import X.V0N;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes8.dex */
public class ImageLoadUtils {
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
        } catch (OutOfMemoryError unused) {
            DebugLogUtils.isEnableDebugLog();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r4 == null) goto L53;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0054 -> B:18:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getRotation(android.content.ContentResolver r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "content"
            boolean r0 = r6.startsWith(r0)
            r3 = 0
            r4 = 0
            if (r0 != 0) goto L10
            android.media.ExifInterface r4 = new android.media.ExifInterface     // Catch: java.io.IOException -> L73
            r4.<init>(r6)     // Catch: java.io.IOException -> L73
            goto L59
        L10:
            if (r5 != 0) goto L16
            com.ss.ttlivestreamer.core.utils.DebugLogUtils.isEnableDebugLog()
            return r3
        L16:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r5.openFileDescriptor(r1, r0)     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L4b
            if (r2 != 0) goto L23
            return r3
        L23:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            r0 = 24
            if (r1 < r0) goto L33
            android.media.ExifInterface r1 = new android.media.ExifInterface     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            r1.<init>(r0)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            r4 = r1
        L33:
            r2.close()     // Catch: java.io.IOException -> L53
            goto L57
        L37:
            r0 = move-exception
            goto L3b
        L39:
            r0 = move-exception
            r2 = r4
        L3b:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L3f
            goto L4d
        L3f:
            r1 = move-exception
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.io.IOException -> L46
            goto L4c
        L46:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L4c
        L4b:
            r1 = move-exception
        L4c:
            throw r1
        L4d:
            if (r2 == 0) goto L77
            r2.close()     // Catch: java.io.IOException -> L53
            goto L77
        L53:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L57:
            if (r4 == 0) goto L77
        L59:
            java.lang.String r0 = "Orientation"
            int r1 = r4.getAttributeInt(r0, r3)
            r0 = 3
            if (r1 == r0) goto L70
            r0 = 6
            if (r1 == r0) goto L6d
            r0 = 8
            if (r1 == r0) goto L6a
            return r3
        L6a:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L6d:
            r0 = 90
            return r0
        L70:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
        L73:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L77:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.utils.ImageLoadUtils.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    public static int calculateInSampleSize(ContentResolver contentResolver, String str, int i, int i2) {
        int max;
        if (i == -1 || i2 == -1) {
            return 1;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (!str.startsWith("content")) {
            BitmapFactory.decodeFile(str, options);
        } else {
            Uri parse = UriProtector.parse(str);
            ParcelFileDescriptor parcelFileDescriptor = null;
            try {
                try {
                    try {
                        try {
                        } catch (Throwable th) {
                            if (0 != 0) {
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
                } catch (OutOfMemoryError unused) {
                    DebugLogUtils.isEnableDebugLog();
                    if (0 != 0) {
                        parcelFileDescriptor.close();
                    }
                }
            } catch (FileNotFoundException e3) {
                C16880lQ.LLLLIIL(e3);
                if (0 != 0) {
                    parcelFileDescriptor.close();
                }
            }
            if (contentResolver == null) {
                DebugLogUtils.isEnableDebugLog();
                return 1;
            }
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
            if (openFileDescriptor == null) {
                return 1;
            }
            BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor(), new Rect(-1, -1, -1, -1), options);
            openFileDescriptor.close();
        }
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i2 <= i) {
            i2 = i;
            i = i2;
        }
        if (i3 > i4) {
            i4 = i3;
            i3 = i4;
        }
        if (i3 > i || i4 > i2) {
            float f = i4 / i2;
            float f2 = i3 / i;
            if (isSampleSizeRound) {
                max = Math.round(Math.max(f2, f));
                while (Math.max(i4, i3) / max > maxSide) {
                    max *= 2;
                }
            } else {
                max = (int) Math.max(f2, f);
            }
        } else {
            max = 0;
        }
        return Math.max(1, max);
    }

    public static Bitmap loadBitmapCompat(Context context, String str, int i, int i2) {
        return loadBitmapCompat(context.getContentResolver(), str, i, i2, ImageRotation.INVALID, true);
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

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i, int i2, ImageRotation imageRotation, boolean z) {
        return loadBitmapCompat(contentResolver, str, i, i2, ImageRotation.INVALID, z, false);
    }

    public static Bitmap loadBitmap(String str, int i, int i2, ImageRotation imageRotation, boolean z, boolean z2, boolean z3) {
        ExifInterface exifInterface;
        int i3;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i > 0 && i2 > 0) {
            options.inSampleSize = calculateInSampleSize(null, str, i, i2);
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile == null) {
                DebugLogUtils.isEnableDebugLog();
                return null;
            }
            if (z2) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, i, i2, true);
                if (!createScaledBitmap.sameAs(decodeFile) && !decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createScaledBitmap;
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
                int[] calAutoScale = calAutoScale(i, i2, decodeFile.getWidth(), decodeFile.getHeight(), i3);
                i = calAutoScale[0];
                i2 = calAutoScale[1];
            }
            if (z2) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeFile, i, i2, true);
                if (!createScaledBitmap2.sameAs(decodeFile) && !decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createScaledBitmap2;
            }
            if (i3 != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate(i3);
                Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                if (!decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createBitmap;
            }
            if (z) {
                return makeDimensionEven(decodeFile);
            }
            return decodeFile;
        } catch (OutOfMemoryError unused) {
            DebugLogUtils.isEnableDebugLog();
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00cc: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:117440716), block:B:64:0x00cc */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap loadBitmapCompat(android.content.ContentResolver r12, java.lang.String r13, int r14, int r15, com.ss.ttlivestreamer.livestreamv2.utils.ImageLoadUtils.ImageRotation r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.utils.ImageLoadUtils.loadBitmapCompat(android.content.ContentResolver, java.lang.String, int, int, com.ss.ttlivestreamer.livestreamv2.utils.ImageLoadUtils$ImageRotation, boolean, boolean):android.graphics.Bitmap");
    }
}
