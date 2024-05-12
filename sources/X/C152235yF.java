package X;

import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.5yF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152235yF {
    public static final byte[] LIZIZ;
    public static final byte[] LIZJ;
    public static final byte[] LIZLLL;
    public static final byte[][] LJ;
    public static final C152235yF LJFF = new C152235yF();
    public static final LruCache<String, C145745nm> LIZ = new LruCache<>(100);

    static {
        new LruCache(100);
        LIZIZ = new byte[]{82, 73, 70, 70};
        LIZJ = new byte[]{87, 69, 66, 80};
        LIZLLL = new byte[]{104, 101, 105, 99};
        byte b = (byte) 71;
        LJ = new byte[][]{new byte[]{(byte) 255, (byte) 216}, new byte[]{(byte) 137, 80, 78, 71, XC5.LJFF, 10, 26, 10}, new byte[]{b, 73, 70, 56, 55, 97}, new byte[]{b, 73, 70, 56, 57, 97}, new byte[]{(byte) 66, 77}};
    }

    public static C152245yG LIZ(String str) {
        int[] iArr = new int[16];
        if (TEVideoUtils.nativeGetFileInfo(str, iArr) != null) {
            C152245yG c152245yG = new C152245yG();
            c152245yG.LIZ = iArr[0];
            c152245yG.LIZIZ = iArr[1];
            c152245yG.LIZJ = iArr[2];
            c152245yG.LIZLLL = iArr[3];
            return c152245yG;
        }
        return null;
    }

    public static boolean LIZJ(String str) {
        byte[] bArr;
        if (!C1B6.LIZIZ(str)) {
            return false;
        }
        try {
            bArr = new byte[12];
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                fileInputStream.read(bArr);
                AnonymousClass636.LJFF(fileInputStream, null);
            } finally {
            }
        } catch (Exception unused) {
        }
        if (Arrays.equals(LIZIZ, ORY.LJJLIIIJJI(bArr, C78842Uww.LJJ(0, 4))) && Arrays.equals(LIZJ, ORY.LJJLIIIJJI(bArr, C78842Uww.LJJ(8, 12)))) {
            return true;
        }
        for (byte[] bArr2 : LJ) {
            if (Arrays.equals(bArr2, ORY.LJJLIIIJJI(bArr, C78842Uww.LJJ(0, bArr2.length)))) {
                return true;
            }
        }
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "Locale.getDefault()");
        String upperCase = str.toUpperCase(locale);
        o.LJIIIIZZ(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        if (!ujb.o.LJJJJ(upperCase, ".HEIC", false) && !Arrays.equals(LIZLLL, ORY.LJJLIIIJJI(bArr, C78842Uww.LJJ(8, 12)))) {
            ORY.LJJJJJL(bArr, " ", ORC.LJLIL);
            return false;
        }
        return true;
    }

    public final OSZ<Integer, Integer> LIZIZ(String str) {
        C145745nm c145745nm;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        synchronized (this) {
            String str2 = str;
            c145745nm = LIZ.get(str2);
            if (c145745nm == null) {
                int i7 = 0;
                if (LIZJ(str2)) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str2, options);
                    if (!TextUtils.isEmpty(str2) && new File(str2).exists()) {
                        try {
                            ExifInterface exifInterface = new ExifInterface(str2);
                            if (exifInterface != null) {
                                int attributeInt = exifInterface.getAttributeInt("Orientation", -1);
                                if (attributeInt != 3) {
                                    if (attributeInt != 6) {
                                        if (attributeInt == 8) {
                                            i7 = 270;
                                        }
                                    } else {
                                        i7 = 90;
                                    }
                                } else {
                                    i7 = 180;
                                }
                            }
                        } catch (IOException unused) {
                        }
                        str2 = str2;
                        c145745nm = new C145745nm(options.outWidth, options.outHeight, i7, LivePlayerResourceReleaseSetting.ENABLE, 0, 0, 480, str2, "image");
                    }
                    i7 = 0;
                    str2 = str2;
                    c145745nm = new C145745nm(options.outWidth, options.outHeight, i7, LivePlayerResourceReleaseSetting.ENABLE, 0, 0, 480, str2, "image");
                } else {
                    VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str2);
                    if (videoFileInfo != null && videoFileInfo.width > 0 && videoFileInfo.height > 0 && videoFileInfo.maxDuration > 0) {
                        int i8 = videoFileInfo.width;
                        int i9 = videoFileInfo.height;
                        int i10 = videoFileInfo.rotation;
                        int i11 = videoFileInfo.maxDuration;
                        int i12 = videoFileInfo.bitrate;
                        int i13 = videoFileInfo.fps;
                        int i14 = videoFileInfo.codec;
                        int i15 = videoFileInfo.duration;
                        String videoEncodeTypeByID = VEUtils.getVideoEncodeTypeByID(i14);
                        o.LJIIIIZZ(videoEncodeTypeByID, "VEUtils.getVideoEncodeTypeByID(veInfo.codec)");
                        c145745nm = new C145745nm(i8, i9, i10, i11, i12, i13, i14, i15, str2, videoEncodeTypeByID);
                    } else {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            try {
                                mediaMetadataRetriever.setDataSource(str2);
                                String LIZIZ2 = HOT.LIZIZ(mediaMetadataRetriever);
                                if (LIZIZ2 != null) {
                                    i = Integer.parseInt(LIZIZ2);
                                } else {
                                    i = 0;
                                }
                                String LIZ2 = HOT.LIZ(mediaMetadataRetriever);
                                if (LIZ2 != null) {
                                    i2 = Integer.parseInt(LIZ2);
                                } else {
                                    i2 = 0;
                                }
                                String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                                if (extractMetadata != null) {
                                    i3 = Integer.parseInt(extractMetadata);
                                } else {
                                    i3 = 0;
                                }
                                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(9);
                                if (extractMetadata2 != null) {
                                    i4 = Integer.parseInt(extractMetadata2);
                                } else {
                                    i4 = 0;
                                }
                                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(20);
                                if (extractMetadata3 != null) {
                                    i5 = Integer.parseInt(extractMetadata3);
                                } else {
                                    i5 = 0;
                                }
                                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(25);
                                if (extractMetadata4 != null) {
                                    i6 = Integer.parseInt(extractMetadata4);
                                } else {
                                    i6 = 0;
                                }
                                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(12);
                                if (extractMetadata5 == null) {
                                    extractMetadata5 = "unknown";
                                }
                                str2 = str2;
                                c145745nm = new C145745nm(i, i2, i3, i4, i5, i6, 384, str2, extractMetadata5);
                            } catch (Exception unused2) {
                                str2 = str2;
                                c145745nm = new C145745nm(0, 0, 0, 0, 0, 0, 992, str2, null);
                            }
                            mediaMetadataRetriever.release();
                        } catch (Throwable th) {
                            mediaMetadataRetriever.release();
                            throw th;
                        }
                    }
                }
                LIZ.put(str2, c145745nm);
            }
        }
        int i16 = c145745nm.LJLILLLLZI;
        int i17 = c145745nm.LJLJI;
        int i18 = c145745nm.LJLJJI;
        if (i18 == 90 || i18 == 270) {
            i17 = i16;
            i16 = i17;
        }
        return new OSZ<>(Integer.valueOf(i16), Integer.valueOf(i17));
    }
}
