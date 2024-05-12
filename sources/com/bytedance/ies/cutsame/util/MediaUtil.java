package com.bytedance.ies.cutsame.util;

import X.AnonymousClass636;
import X.C145725nk;
import X.C152255yH;
import X.C152275yJ;
import X.C16880lQ;
import X.C78842Uww;
import X.ORB;
import X.ORY;
import X.XC5;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.vesdk.VEUtils;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MediaUtil {
    public static final MediaUtil LIZ = new MediaUtil();
    public static final LruCache<String, C145725nk> LIZIZ = new LruCache<>(100);
    public static final byte[] LIZJ;
    public static final byte[] LIZLLL;
    public static final byte[] LJ;
    public static final byte[][] LJFF;

    static {
        new LruCache(100);
        LIZJ = new byte[]{82, 73, 70, 70};
        LIZLLL = new byte[]{87, 69, 66, 80};
        LJ = new byte[]{104, 101, 105, 99};
        LJFF = new byte[][]{new byte[]{-1, -40}, new byte[]{-119, 80, 78, 71, XC5.LJFF, 10, 26, 10}, new byte[]{71, 73, 70, 56, 55, 97}, new byte[]{71, 73, 70, 56, 57, 97}, new byte[]{66, 77}};
    }

    public static boolean LIZIZ(Context context, String path) {
        byte[] bArr;
        o.LJIIIZ(path, "path");
        C152275yJ.LIZ.getClass();
        if (!C152275yJ.LJFF(context, path)) {
            return false;
        }
        try {
            bArr = new byte[12];
            if (C152275yJ.LJI(path)) {
                Uri parse = UriProtector.parse(path);
                o.LJIIIIZZ(parse, "parse(path)");
                C152275yJ.LIZLLL(context, parse, new C152255yH(bArr));
            } else {
                FileInputStream fileInputStream = new FileInputStream(path);
                try {
                    fileInputStream.read(bArr);
                    AnonymousClass636.LJFF(fileInputStream, null);
                } finally {
                }
            }
        } catch (Exception unused) {
        }
        if (Arrays.equals(LIZJ, ORY.LJJLIIIJJI(bArr, C78842Uww.LJJ(0, 4))) && Arrays.equals(LIZLLL, ORY.LJJLIIIJJI(bArr, C78842Uww.LJJ(8, 12)))) {
            return true;
        }
        byte[][] bArr2 = LJFF;
        int length = bArr2.length;
        int i = 0;
        while (i < length) {
            byte[] bArr3 = bArr2[i];
            i++;
            if (Arrays.equals(bArr3, ORY.LJJLIIIJJI(bArr, C78842Uww.LJJ(0, bArr3.length)))) {
                return true;
            }
        }
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        String upperCase = path.toUpperCase(locale);
        o.LJIIIIZZ(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        if (!ujb.o.LJJJJ(upperCase, ".HEIC", false) && !Arrays.equals(LJ, ORY.LJJLIIIJJI(bArr, C78842Uww.LJJ(8, 12)))) {
            ORY.LJJJJJL(bArr, " ", ORB.LJLIL);
            return false;
        }
        return true;
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized C145725nk LIZ(Context context, String str) {
        C145725nk c145725nk;
        int parseInt;
        int parseInt2;
        int parseInt3;
        int parseInt4;
        int parseInt5;
        int parseInt6;
        String path = str;
        o.LJIIIZ(path, "path");
        c145725nk = LIZIZ.get(path);
        if (c145725nk == null) {
            int i = 0;
            if (LIZIZ(context, path)) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                C152275yJ.LIZ.getClass();
                C152275yJ.LIZIZ(context, options, path);
                if (!TextUtils.isEmpty(path) && C152275yJ.LJFF(context, path)) {
                    ExifInterface LIZJ2 = C152275yJ.LIZJ(context, path);
                    if (LIZJ2 != null) {
                        int attributeInt = LIZJ2.getAttributeInt("Orientation", -1);
                        if (attributeInt != 3) {
                            if (attributeInt != 6) {
                                if (attributeInt == 8) {
                                    i = 270;
                                }
                            } else {
                                i = 90;
                            }
                        } else {
                            i = 180;
                        }
                    }
                    Size size = new Size(options.outWidth, options.outHeight);
                    path = path;
                    c145725nk = new C145725nk(size.width, size.height, i, 60000, 0, 0, 480, path, "image");
                }
                i = 0;
                Size size2 = new Size(options.outWidth, options.outHeight);
                path = path;
                c145725nk = new C145725nk(size2.width, size2.height, i, 60000, 0, 0, 480, path, "image");
            } else {
                VEUtils.VEVideoFileInfo videoFileInfo = com.ss.android.vesdk.VEUtils.getVideoFileInfo(path);
                if (videoFileInfo != null && videoFileInfo.width > 0 && videoFileInfo.height > 0 && videoFileInfo.maxDuration > 0) {
                    int i2 = videoFileInfo.width;
                    int i3 = videoFileInfo.height;
                    int i4 = videoFileInfo.rotation;
                    int i5 = videoFileInfo.maxDuration;
                    int i6 = videoFileInfo.bitrate;
                    int i7 = videoFileInfo.fps;
                    int i8 = videoFileInfo.codec;
                    int i9 = videoFileInfo.duration;
                    String videoEncodeTypeByID = com.ss.android.vesdk.VEUtils.getVideoEncodeTypeByID(i8);
                    o.LJIIIIZZ(videoEncodeTypeByID, "getVideoEncodeTypeByID(veInfo.codec)");
                    c145725nk = new C145725nk(i2, i3, i4, i5, i6, i7, i8, i9, path, videoEncodeTypeByID);
                } else {
                    C152275yJ.LIZ.getClass();
                    MediaMetadataRetriever LJ2 = C152275yJ.LJ(context, path);
                    try {
                        try {
                            String extractMetadata = LJ2.extractMetadata(18);
                            if (extractMetadata == null) {
                                parseInt = 0;
                            } else {
                                parseInt = Integer.parseInt(extractMetadata);
                            }
                            String extractMetadata2 = LJ2.extractMetadata(19);
                            if (extractMetadata2 == null) {
                                parseInt2 = 0;
                            } else {
                                parseInt2 = Integer.parseInt(extractMetadata2);
                            }
                            String extractMetadata3 = LJ2.extractMetadata(24);
                            if (extractMetadata3 == null) {
                                parseInt3 = 0;
                            } else {
                                parseInt3 = Integer.parseInt(extractMetadata3);
                            }
                            String extractMetadata4 = LJ2.extractMetadata(9);
                            if (extractMetadata4 == null) {
                                parseInt4 = 0;
                            } else {
                                parseInt4 = Integer.parseInt(extractMetadata4);
                            }
                            String extractMetadata5 = LJ2.extractMetadata(20);
                            if (extractMetadata5 == null) {
                                parseInt5 = 0;
                            } else {
                                parseInt5 = Integer.parseInt(extractMetadata5);
                            }
                            String extractMetadata6 = LJ2.extractMetadata(25);
                            if (extractMetadata6 == null) {
                                parseInt6 = 0;
                            } else {
                                parseInt6 = Integer.parseInt(extractMetadata6);
                            }
                            String extractMetadata7 = LJ2.extractMetadata(12);
                            if (extractMetadata7 == null) {
                                extractMetadata7 = "unknown";
                            }
                            path = path;
                            c145725nk = new C145725nk(parseInt, parseInt2, parseInt3, parseInt4, parseInt5, parseInt6, 384, path, extractMetadata7);
                        } catch (Exception unused) {
                            path = path;
                            c145725nk = new C145725nk(0, 0, 0, 0, 0, 0, 992, path, null);
                        }
                        try {
                            LJ2.release();
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    } catch (Throwable th) {
                        try {
                            LJ2.release();
                        } catch (Exception e2) {
                            C16880lQ.LLLLIIL(e2);
                        }
                        throw th;
                    }
                }
            }
            LIZIZ.put(path, c145725nk);
        }
        return c145725nk;
    }

    public final Size getVideoSize(Context context, String videoPath) {
        o.LJIIIZ(videoPath, "videoPath");
        C145725nk LIZ2 = LIZ(context, videoPath);
        int i = LIZ2.LJLILLLLZI;
        int i2 = LIZ2.LJLJI;
        int i3 = LIZ2.LJLJJI;
        if (i3 == 90 || i3 == 270) {
            i2 = i;
            i = i2;
        }
        return new Size(i, i2);
    }
}
