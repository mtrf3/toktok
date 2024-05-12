package com.bytedance.common.utility;

import X.C16880lQ;
import X.X1D;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class BitmapUtils {
    public static Bitmap decodeBitmap(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
                    try {
                        fileInputStream.close();
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    return decodeStream;
                } catch (Exception e2) {
                    e = e2;
                    C16880lQ.LLLLIIL(e);
                    try {
                        fileInputStream.close();
                    } catch (Exception e3) {
                        C16880lQ.LLLLIIL(e3);
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                try {
                    fileInputStream2.close();
                } catch (Exception e4) {
                    C16880lQ.LLLLIIL(e4);
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2.close();
            throw th;
        }
    }

    public static Bitmap getBitmapFromSD(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            return decodeBitmap(file);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static int readPictureDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    if (attributeInt != 8) {
                        return 0;
                    }
                    return 270;
                }
                return 90;
            }
            return 180;
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        if (r3 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void rotateImage(java.lang.String r8) {
        /*
            android.media.ExifInterface r2 = new android.media.ExifInterface     // Catch: java.io.IOException -> L13
            r2.<init>(r8)     // Catch: java.io.IOException -> L13
            java.lang.String r1 = "Orientation"
            r0 = 1
            int r1 = r2.getAttributeInt(r1, r0)     // Catch: java.io.IOException -> L13
            r0 = 3
            if (r1 == r0) goto L10
            goto L18
        L10:
            r0 = 180(0xb4, float:2.52E-43)
            goto L25
        L13:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L1f
        L18:
            r0 = 6
            if (r1 == r0) goto L20
            r0 = 8
            if (r1 == r0) goto L23
        L1f:
            return
        L20:
            r0 = 90
            goto L25
        L23:
            r0 = 270(0x10e, float:3.78E-43)
        L25:
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r8)
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            float r0 = (float) r0
            r6.postRotate(r0)
            r2 = 0
            int r4 = r1.getWidth()
            int r5 = r1.getHeight()
            r7 = 1
            r3 = r2
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)
            r1.recycle()
            r3 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L6a java.lang.Throwable -> L81
            r2.<init>(r8)     // Catch: java.io.IOException -> L5e java.io.FileNotFoundException -> L6a java.lang.Throwable -> L81
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.io.IOException -> L58 java.io.FileNotFoundException -> L5b java.lang.Throwable -> L7e
            r0 = 50
            r4.compress(r1, r0, r2)     // Catch: java.io.IOException -> L58 java.io.FileNotFoundException -> L5b java.lang.Throwable -> L7e
            r2.flush()     // Catch: java.io.IOException -> L58 java.io.FileNotFoundException -> L5b java.lang.Throwable -> L7e
            r2.close()     // Catch: java.io.IOException -> L76
            goto L7a
        L58:
            r0 = move-exception
            r3 = r2
            goto L5f
        L5b:
            r0 = move-exception
            r3 = r2
            goto L6b
        L5e:
            r0 = move-exception
        L5f:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L7a
            r3.close()     // Catch: java.io.IOException -> L68
            goto L7a
        L68:
            r0 = move-exception
            goto L77
        L6a:
            r0 = move-exception
        L6b:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L7a
            r3.close()     // Catch: java.io.IOException -> L74
            goto L7a
        L74:
            r0 = move-exception
            goto L77
        L76:
            r0 = move-exception
        L77:
            X.C16880lQ.LLLLIIL(r0)
        L7a:
            r4.recycle()
            goto L1f
        L7e:
            r1 = move-exception
            r3 = r2
            goto L84
        L81:
            r1 = move-exception
            if (r3 == 0) goto L8c
        L84:
            r3.close()     // Catch: java.io.IOException -> L88
            goto L8c
        L88:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L8c:
            r4.recycle()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.rotateImage(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r4 == 1) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap compressBitmap(android.graphics.Bitmap r7, long r8) {
        /*
            if (r7 != 0) goto L4
            r0 = 0
            return r0
        L4:
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb
            return r7
        Lb:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            int r1 = r7.getRowBytes()
            int r0 = r7.getHeight()
            int r0 = r0 * r1
            long r2 = (long) r0
            long r2 = r2 / r8
            double r0 = (double) r2
            long r0 = java.lang.Math.round(r0)
            double r3 = (double) r0
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            r6 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L33
            r1 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L33
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.RGB_565
        L2d:
            r4 = 1
        L2e:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r5 != r0) goto L3e
            return r7
        L33:
            double r0 = java.lang.Math.sqrt(r3)
            int r4 = (int) r0
            if (r4 != 0) goto L3b
            goto L2d
        L3b:
            if (r4 != r6) goto L3e
            goto L2e
        L3e:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r0 = 100
            r7.compress(r1, r0, r2)
            byte[] r3 = r2.toByteArray()
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r2.inSampleSize = r4
            r2.inPurgeable = r6
            r2.inPreferredConfig = r5
            int r1 = r3.length
            r0 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r3, r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.compressBitmap(android.graphics.Bitmap, long):android.graphics.Bitmap");
    }

    public static Bitmap decodeBitmap(File file, int i) {
        return decodeBitmap(file, i, false);
    }

    public static Bitmap getBitmapFromSD(String str, int i) {
        return getBitmapFromSD(str, i, false);
    }

    public static Bitmap loadBitmap(int i, String str) {
        return loadBitmap(i, str, false);
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap decodeBitmap(File file, int i, boolean z) {
        BitmapFactory.Options options;
        Bitmap.Config config;
        int i2;
        Bitmap bitmap = null;
        try {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            FileInputStream fileInputStream = new FileInputStream(file);
            BitmapFactory.decodeStream(fileInputStream, null, options);
            fileInputStream.close();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            C16880lQ.LLLZZIL(file);
            return null;
        }
        int i3 = 1;
        while (true) {
            int i4 = options.outWidth;
            if (i4 < i * 2 || (i2 = options.outHeight) < 4000) {
                break;
            }
            options.outWidth = i4 / 2;
            options.outHeight = i2 / 2;
            i3 *= 2;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = i3;
        options2.inPurgeable = true;
        if (z) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        options2.inPreferredConfig = config;
        FileInputStream fileInputStream2 = new FileInputStream(file);
        bitmap = BitmapFactory.decodeStream(fileInputStream2, null, options2);
        fileInputStream2.close();
        if (bitmap == null) {
            C16880lQ.LLLZZIL(file);
        }
        return bitmap;
    }

    public static Bitmap getBitmapFromSD(String str, int i, boolean z) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            file.setLastModified(System.currentTimeMillis());
        } catch (Exception unused) {
        }
        try {
            return decodeBitmap(file, i, z);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static Bitmap loadBitmap(int i, String str, boolean z) {
        Bitmap.CompressFormat compressFormat;
        Bitmap.Config config;
        Bitmap bitmapFromSD = getBitmapFromSD(str, i, z);
        if (bitmapFromSD == null) {
            return null;
        }
        int width = bitmapFromSD.getWidth();
        int height = bitmapFromSD.getHeight();
        if (width > i + 150 || (width > i && height > 4000)) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapFromSD, i, (int) (((i * 1.0f) * height) / width), true);
            bitmapFromSD.recycle();
            if (createScaledBitmap == null) {
                return null;
            }
            bitmapFromSD = createScaledBitmap;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (z) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        bitmapFromSD.compress(compressFormat, 80, byteArrayOutputStream);
        bitmapFromSD.recycle();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        if (z) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        options.inPreferredConfig = config;
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    public static Bitmap resizeBitmap(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > i || height > i2) {
            if (width > height && width > i) {
                i2 = (int) (height * (i / width));
            } else {
                i = (int) (width * (i2 / height));
            }
            return Bitmap.createScaledBitmap(bitmap, i, i2, true);
        }
        return bitmap;
    }

    public static boolean saveBitmapToSD(Bitmap bitmap, String str, String str2) {
        FileOutputStream fileOutputStream;
        if (!"mounted".equals(C16880lQ.LLLLLLLZIL())) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(file);
        LIZ.append("/");
        LIZ.append(str2);
        File file2 = new File(X1D.LIZIZ(LIZ));
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return false;
            }
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            try {
                fileOutputStream.close();
                return true;
            } catch (Exception e3) {
                C16880lQ.LLLLIIL(e3);
                return true;
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            C16880lQ.LLLLIIL(e);
            try {
                fileOutputStream2.close();
            } catch (Exception e5) {
                C16880lQ.LLLLIIL(e5);
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                fileOutputStream2.close();
            } catch (Exception e6) {
                C16880lQ.LLLLIIL(e6);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
    
        if (0 != 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean saveImageData(byte[] r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = 0
            r2 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r0 != 0) goto L1a
            boolean r0 = r1.mkdirs()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r0 != 0) goto L1a
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r0 != 0) goto L1a
            return r3
        L1a:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r1.write(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L34
            r1.flush()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L34
            r1.close()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L34
            r0 = 1
            return r0
        L2f:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Exception -> L37
            goto L37
        L34:
            r2 = r1
            goto L3a
        L36:
            r0 = move-exception
        L37:
            throw r0
        L38:
            if (r2 == 0) goto L3d
        L3a:
            r2.close()     // Catch: java.lang.Exception -> L3d
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.saveImageData(byte[], java.lang.String, java.lang.String):boolean");
    }

    public static Bitmap decodeBitmap(byte[] bArr, int i, int i2) {
        if (bArr != null && i >= 1 && i2 >= 1) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i3 = options.outWidth;
                int i4 = options.outHeight;
                int i5 = 1;
                while (true) {
                    if (i3 / 2 >= i || i4 / 2 >= i2) {
                        i3 /= 2;
                        i4 /= 2;
                        i5 *= 2;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i5;
                        options2.inPurgeable = true;
                        options2.inPreferredConfig = Bitmap.Config.RGB_565;
                        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2) {
        return getBitmapFromSD(str, i, i2, -1, null);
    }

    public static Bitmap decodeBitmap(File file, int i, int i2, Bitmap.Config config) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (file != null && i > 0 && i2 > 0) {
            try {
                if (!file.isFile()) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                fileInputStream = new FileInputStream(file);
                try {
                    BitmapFactory.decodeStream(fileInputStream, null, options);
                    fileInputStream.close();
                    int i3 = options.outWidth;
                    int i4 = options.outHeight;
                    int i5 = 1;
                    while (true) {
                        if (i3 / 2 < i && i4 / 2 < i2) {
                            break;
                        }
                        i3 /= 2;
                        i4 /= 2;
                        i5 *= 2;
                    }
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = i5;
                    options2.inPurgeable = true;
                    if (config != null) {
                        options2.inPreferredConfig = config;
                    } else {
                        options2.inPreferredConfig = Bitmap.Config.RGB_565;
                    }
                    FileInputStream fileInputStream3 = new FileInputStream(file);
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream3, null, options2);
                        fileInputStream3.close();
                        return decodeStream;
                    } catch (Exception unused) {
                        fileInputStream = fileInputStream3;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream3;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused4) {
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                }
            } catch (Exception unused5) {
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2, int i3) {
        return getBitmapFromSD(str, i, i2, i3, null);
    }

    public static Bitmap decodeBitmap(Context context, int i, int i2, int i3) {
        if (context != null && i != 0 && i2 > 0 && i3 > 0) {
            Resources resources = context.getResources();
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(resources, i, options);
                int i4 = options.outWidth;
                int i5 = options.outHeight;
                int i6 = 1;
                while (true) {
                    if (i4 / 2 >= i2 || i5 / 2 >= i3) {
                        i4 /= 2;
                        i5 /= 2;
                        i6 *= 2;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i6;
                        options2.inPurgeable = true;
                        options2.inPreferredConfig = Bitmap.Config.RGB_565;
                        return BitmapFactory.decodeResource(resources, i, options2);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2, Bitmap.Config config) {
        return getBitmapFromSD(str, i, i2, -1, config);
    }

    public static Bitmap decodeBitmap(ContentResolver contentResolver, Uri uri, int i, int i2) {
        InputStream openInputStream;
        byte[] bArr = null;
        if (contentResolver == null || uri == null || i < 1 || i2 < 1) {
            return null;
        }
        try {
            openInputStream = contentResolver.openInputStream(uri);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (openInputStream == null) {
            return null;
        }
        byte[] bArr2 = new byte[FileUtils.BUFFER_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = openInputStream.read(bArr2);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr2, 0, read);
        }
        bArr = byteArrayOutputStream.toByteArray();
        return decodeBitmap(bArr, i, i2);
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2, int i3, Bitmap.Config config) {
        try {
            File file = new File(str);
            if (!file.isFile()) {
                return null;
            }
            if (i3 > 0 && file.length() > i3) {
                C16880lQ.LLLZZIL(file);
                return null;
            }
            try {
                file.setLastModified(System.currentTimeMillis());
            } catch (Exception unused) {
            }
            return decodeBitmap(file, i, i2, config);
        } catch (Exception unused2) {
            return null;
        }
    }
}
