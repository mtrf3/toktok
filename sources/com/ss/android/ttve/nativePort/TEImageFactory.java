package com.ss.android.ttve.nativePort;

import X.C16880lQ;
import X.C45879HzX;
import X.C45880HzY;
import X.C65429Pm5;
import X.P4Q;
import X.X1D;
import Y.ARunnableS10S1200000_11;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEFileUtils;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class TEImageFactory {
    public static RandomAccessFile raf;

    public static boolean isDeviceOptOpen() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_enable_schdule_device_capability_opt");
        if (value == null || value.getValue() == null || !(value.getValue() instanceof Integer) || ((Integer) value.getValue()).intValue() < 7) {
            return false;
        }
        return true;
    }

    /* loaded from: classes12.dex */
    public static class ImageInfo {
        public Bitmap bitmap;
        public String colorSpace;
        public int height;
        public String mimeType;
        public int rotation;
        public int width;

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public String getColorSpace() {
            return this.colorSpace;
        }

        public int getHeight() {
            return this.height;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public int getRotation() {
            return this.rotation;
        }

        public int getWidth() {
            return this.width;
        }
    }

    public static void recycleBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public static Bitmap copyByDraw(Bitmap.Config config, Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, String str) {
        return decodeFile(contentResolver, str, null, 0, 0, -1, null);
    }

    public static String getImageColorSpace(ContentResolver contentResolver, String str) {
        String str2 = "Unknown";
        if (Build.VERSION.SDK_INT < 26) {
            return "Unknown";
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap decodeFileCompat = decodeFileCompat(contentResolver, str, options);
        ColorSpace colorSpace = options.outColorSpace;
        if (colorSpace != null) {
            str2 = colorSpace.getName();
        }
        if (isDeviceOptOpen()) {
            recycleBitmap(decodeFileCompat);
        }
        return str2;
    }

    public static ImageInfo getImageInfo(ContentResolver contentResolver, String str) {
        String str2;
        ColorSpace colorSpace;
        long currentTimeMillis = System.currentTimeMillis();
        if (C65429Pm5.LJFF("ve_enable_cache_file_info_opt", false)) {
            C45879HzX c45879HzX = C45880HzY.LIZ;
            if (c45879HzX.LIZ.containsKey(str)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getImageInfo cache cost = ");
                LIZ.append(System.currentTimeMillis() - currentTimeMillis);
                LIZ.append(", filePath = ");
                LIZ.append(str);
                P4Q.LIZ("TEImageFactory", X1D.LIZIZ(LIZ));
                return c45879HzX.LIZ.get(str);
            }
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap decodeFileCompat = decodeFileCompat(contentResolver, str, options);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.width = options.outWidth;
        imageInfo.height = options.outHeight;
        imageInfo.mimeType = options.outMimeType;
        if (Build.VERSION.SDK_INT < 26 || (colorSpace = options.outColorSpace) == null) {
            imageInfo.colorSpace = "Unknown";
        } else {
            imageInfo.colorSpace = colorSpace.getName();
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0 && lastIndexOf + 1 < str.length()) {
            str2 = str.substring(str.lastIndexOf(46) + 1);
        } else {
            str2 = null;
        }
        if (imageInfo.mimeType != null && str2 != null && (str2.equals("mpg") || str2.equals("mpeg"))) {
            imageInfo.mimeType = null;
        }
        if (isDeviceOptOpen()) {
            recycleBitmap(decodeFileCompat);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getImageInfo cost = ");
        LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
        LIZ2.append(", filePath = ");
        LIZ2.append(str);
        P4Q.LIZ("TEImageFactory", X1D.LIZIZ(LIZ2));
        C45880HzY.LIZ.LIZ.put(str, imageInfo);
        return imageInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r6 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r2 == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getRotation(android.content.ContentResolver r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TEImageFactory.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    public static Bitmap decodeFileCompat(ContentResolver contentResolver, String str, BitmapFactory.Options options) {
        return decodeFileCompat(contentResolver, str, options, null);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0082 -> B:30:0x0093). Please report as a decompilation issue!!! */
    public static Bitmap decodeFileCompatBeforeQ(String str, BitmapFactory.Options options, Rect rect) {
        boolean z;
        RandomAccessFile randomAccessFile;
        int i;
        if (Build.MANUFACTURER.toLowerCase().contains("meizu") && ((i = Build.VERSION.SDK_INT) == 24 || i == 25)) {
            z = true;
        } else {
            z = false;
        }
        Bitmap bitmap = null;
        if (z) {
            try {
                try {
                    try {
                        randomAccessFile = new RandomAccessFile(str, "r");
                    } catch (Throwable th) {
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException e) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("mz raf close error ");
                                LIZ.append(e);
                                P4Q.LIZJ("TEImageFactory", X1D.LIZIZ(LIZ));
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                    randomAccessFile = null;
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = null;
                }
            } catch (IOException e3) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("mz raf close error ");
                LIZ2.append(e3);
                P4Q.LIZJ("TEImageFactory", X1D.LIZIZ(LIZ2));
            }
            try {
                Bitmap decodeImage = decodeImage(rect, null, randomAccessFile.getFD(), str, options);
                try {
                    randomAccessFile.close();
                } catch (IOException e4) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("mz raf close error ");
                    LIZ3.append(e4);
                    P4Q.LIZJ("TEImageFactory", X1D.LIZIZ(LIZ3));
                }
                return decodeImage;
            } catch (FileNotFoundException e5) {
                e = e5;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("mz decodeFileDescriptor error ");
                LIZ4.append(e);
                P4Q.LIZJ("TEImageFactory", X1D.LIZIZ(LIZ4));
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                return bitmap;
            } catch (Throwable th3) {
                th = th3;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("mz decodeFileDescriptor error ");
                LIZ5.append(th);
                P4Q.LIZJ("TEImageFactory", X1D.LIZIZ(LIZ5));
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                return bitmap;
            }
        }
        return decodeImage(rect, null, null, str, options);
    }

    public static Bitmap decodeFileCompat(ContentResolver contentResolver, String str, BitmapFactory.Options options, Rect rect) {
        if (!VEFileUtils.isAndroidUriPath(str)) {
            return decodeFileCompatBeforeQ(str, options, rect);
        }
        return decodeFileCompatAfterQ(contentResolver, str, options, rect);
    }

    public static Bitmap decodeFileCompatAfterQ(ContentResolver contentResolver, String str, BitmapFactory.Options options, Rect rect) {
        ParcelFileDescriptor parcelFileDescriptor;
        if (contentResolver == null) {
            P4Q.LIZJ("TEImageFactory", "contentResolver should not be null after Android Q");
            return null;
        }
        try {
            parcelFileDescriptor = contentResolver.openFileDescriptor(Uri.parse(str), "r");
            if (parcelFileDescriptor == null) {
                return null;
            }
            try {
                Bitmap decodeImage = decodeImage(rect, null, parcelFileDescriptor.getFileDescriptor(), str, options);
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
                return decodeImage;
            } catch (Throwable th) {
                th = th;
                try {
                    P4Q.LIZLLL("TEImageFactory", "decodeFileCompatAfterQ exception!", th);
                    return null;
                } finally {
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e2) {
                            C16880lQ.LLLLIIL(e2);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            parcelFileDescriptor = null;
        }
    }

    public static Bitmap decodeImage(Rect rect, Rect rect2, FileDescriptor fileDescriptor, String str, BitmapFactory.Options options) {
        Bitmap bitmap;
        Bitmap decodeRegion;
        if (rect == null) {
            try {
                if (fileDescriptor != null) {
                    bitmap = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect2, options);
                } else {
                    Bitmap[] bitmapArr = new Bitmap[1];
                    TEUtils.nativeTryExecute(new ARunnableS10S1200000_11(options, str, bitmapArr, 1));
                    bitmap = bitmapArr[0];
                }
                return bitmap;
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("BitmapRegionDecoder filePath mode error ");
                LIZ.append(th);
                P4Q.LIZJ("TEImageFactory", X1D.LIZIZ(LIZ));
            }
        } else {
            try {
                if (fileDescriptor != null) {
                    decodeRegion = BitmapRegionDecoder.newInstance(fileDescriptor, false).decodeRegion(rect, options);
                } else {
                    decodeRegion = BitmapRegionDecoder.newInstance(str, false).decodeRegion(rect, options);
                }
                return decodeRegion;
            } catch (Throwable th2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("BitmapRegionDecoder filePath mode error ");
                LIZ2.append(th2);
                P4Q.LIZJ("TEImageFactory", X1D.LIZIZ(LIZ2));
            }
        }
        return null;
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, String str, BitmapFactory.Options options, int i, int i2, int i3) {
        return decodeFile(contentResolver, str, options, i, i2, i3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int writeFrame2file(byte[] bArr, int i, int i2, int i3, int i4, String str) {
        FileOutputStream fileOutputStream;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(wrap);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("writeFrameData2JPGFile path ");
        LIZ.append(str);
        P4Q.LJFF("TEImageFactory", X1D.LIZIZ(LIZ));
        File file = new File(str);
        if (file.exists()) {
            C16880lQ.LLLZZIL(file);
        }
        FileOutputStream fileOutputStream2 = null;
        r5 = null;
        r5 = null;
        FileOutputStream fileOutputStream3 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        try {
            try {
                try {
                    file.createNewFile();
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (i3 == 1) {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, i4, fileOutputStream);
            } else if (i3 != 0) {
                if (i3 == 2) {
                    Boolean value = VEConfigCenter.getInstance().getValue("ve_enable_android_webp_encode_opt", false);
                    if (Build.VERSION.SDK_INT >= 30 && value.booleanValue()) {
                        createBitmap.compress(Bitmap.CompressFormat.WEBP_LOSSY, i4, fileOutputStream);
                        fileOutputStream3 = value;
                    } else {
                        createBitmap.compress(Bitmap.CompressFormat.WEBP, i4, fileOutputStream);
                        fileOutputStream3 = value;
                    }
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("writeFrameData2JPGFile error type = ");
                    LIZ2.append(i3);
                    P4Q.LJFF("TEImageFactory", X1D.LIZIZ(LIZ2));
                }
            } else {
                createBitmap.compress(Bitmap.CompressFormat.PNG, i4, fileOutputStream);
            }
            fileOutputStream.flush();
            createBitmap.recycle();
            fileOutputStream.close();
            fileOutputStream2 = fileOutputStream3;
        } catch (Exception e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            C16880lQ.LLLLIIL(e);
            createBitmap.recycle();
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
                fileOutputStream2 = fileOutputStream2;
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            createBitmap.recycle();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    C16880lQ.LLLLIIL(e4);
                }
            }
            throw th;
        }
        return 0;
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, String str, BitmapFactory.Options options, int i, int i2, int i3, Rect rect) {
        int calBestSampleSize2;
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (i3 != 1) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
            }
        }
        if (i > 0 && i2 > 0) {
            options.inJustDecodeBounds = true;
            Bitmap decodeFileCompat = decodeFileCompat(contentResolver, str, options);
            if (C65429Pm5.LJFF("ve_enable_img_downsample_calculate_opt", false) || C65429Pm5.LJFF("ve_enable_image_decode_sharpness_opt", false)) {
                calBestSampleSize2 = TEJpegUtils.calBestSampleSize2(options.outWidth, options.outHeight, i, i2);
            } else {
                calBestSampleSize2 = TEJpegUtils.calBestSampleSize(options.outWidth, options.outHeight, i, i2);
            }
            if (calBestSampleSize2 > 0) {
                options.inSampleSize = calBestSampleSize2;
            }
            options.inJustDecodeBounds = false;
            if (isDeviceOptOpen()) {
                recycleBitmap(decodeFileCompat);
            }
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeFileCompat2 = decodeFileCompat(contentResolver, str, options, rect);
        if (decodeFileCompat2 == null) {
            return null;
        }
        Bitmap.Config config = decodeFileCompat2.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Bitmap copyByDraw = copyByDraw(config2, decodeFileCompat2);
            recycleBitmap(decodeFileCompat2);
            decodeFileCompat2 = copyByDraw;
        }
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.width = decodeFileCompat2.getWidth();
        imageInfo.height = decodeFileCompat2.getHeight();
        imageInfo.bitmap = decodeFileCompat2;
        imageInfo.mimeType = "bitmap";
        imageInfo.rotation = getRotation(contentResolver, str);
        return imageInfo;
    }
}
