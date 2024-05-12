package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.util.LruCache;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.5yC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152205yC {
    public static final C152205yC LIZ = new C152205yC();
    public static final LruCache<String, C145715nj> LIZIZ = new LruCache<>(100);
    public static final LruCache<String, C130855Bp> LIZJ = new LruCache<>(100);

    public static C124854vB LIZ(String strInVideo) {
        o.LJIIIZ(strInVideo, "strInVideo");
        int[] iArr = new int[16];
        int nativeGetAudioFileInfo = TEVideoUtils.nativeGetAudioFileInfo(strInVideo, iArr);
        if (nativeGetAudioFileInfo == 0) {
            C124854vB c124854vB = new C124854vB();
            c124854vB.LIZ = iArr[3];
            return c124854vB;
        }
        Q7K.LJ("getAudioFileInfo error with code=", nativeGetAudioFileInfo, "MediaUtil");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "filepath"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r4 = 0
            if (r0 == 0) goto L12
            return r4
        L12:
            r3 = 0
            int r0 = r6.length()     // Catch: java.lang.Exception -> L59
            if (r0 != 0) goto L1f
        L19:
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch: java.lang.Exception -> L59
            r0.<init>(r6)     // Catch: java.lang.Exception -> L59
            goto L58
        L1f:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "content"
            if (r0 == 0) goto L30
            java.lang.String r0 = r0.getScheme()     // Catch: java.lang.Exception -> L19
        L2b:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> L19
            goto L32
        L30:
            r0 = r3
            goto L2b
        L32:
            if (r0 == 0) goto L19
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L59
            r0 = 24
            if (r1 < r0) goto L19
            android.content.ContentResolver r2 = r5.getContentResolver()     // Catch: java.lang.Exception -> L59
            if (r2 == 0) goto L19
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)     // Catch: java.lang.Exception -> L59
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r0 = r2.openFileDescriptor(r1, r0)     // Catch: java.lang.Exception -> L59
            if (r0 == 0) goto L19
            java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch: java.lang.Exception -> L59
            if (r0 == 0) goto L19
            android.media.ExifInterface r2 = new android.media.ExifInterface     // Catch: java.lang.Exception -> L59
            r2.<init>(r0)     // Catch: java.lang.Exception -> L59
            goto L5a
        L58:
            r3 = r0
        L59:
            r2 = r3
        L5a:
            r1 = -1
            if (r2 == 0) goto L6d
            java.lang.String r0 = "Orientation"
            int r1 = r2.getAttributeInt(r0, r1)
            r0 = 3
            if (r1 == r0) goto L74
            r0 = 6
            if (r1 == r0) goto L71
            r0 = 8
            if (r1 == r0) goto L6e
        L6d:
            return r4
        L6e:
            r4 = 270(0x10e, float:3.78E-43)
            goto L6d
        L71:
            r4 = 90
            goto L6d
        L74:
            r4 = 180(0xb4, float:2.52E-43)
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152205yC.LIZIZ(android.content.Context, java.lang.String):int");
    }

    public final synchronized C145715nj LIZJ(Context context, String path) {
        C145715nj c145715nj;
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        int i5;
        o.LJIIIZ(path, "path");
        o.LJIIIZ(context, "context");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(path);
        LIZ2.append(new File(path).lastModified());
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        c145715nj = LIZIZ.get(LIZIZ2);
        if (c145715nj == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (LIZLLL(context, options, path)) {
                c145715nj = new C145715nj(path, options.outWidth, options.outHeight, LIZIZ(context, path), ((Number) C5BA.LIZ(EnumC127484zQ.PICTURE_TRACK_TIME, 4000L)).longValue(), 0, 0, "image", 480);
            } else {
                VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(path);
                if (videoFileInfo != null && videoFileInfo.width > 0 && videoFileInfo.height > 0 && videoFileInfo.maxDuration > 0) {
                    int i6 = videoFileInfo.width;
                    int i7 = videoFileInfo.height;
                    int i8 = videoFileInfo.rotation;
                    long j2 = videoFileInfo.maxDuration;
                    int i9 = videoFileInfo.bitrate;
                    int i10 = videoFileInfo.fps;
                    int i11 = videoFileInfo.codec;
                    int i12 = videoFileInfo.duration;
                    String videoEncodeTypeByID = VEUtils.getVideoEncodeTypeByID(i11);
                    o.LJIIIIZZ(videoEncodeTypeByID, "getVideoEncodeTypeByID(veInfo.codec)");
                    c145715nj = new C145715nj(path, i6, i7, i8, j2, i9, i10, i11, i12, videoEncodeTypeByID);
                } else {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        try {
                            mediaMetadataRetriever.setDataSource(path);
                            String LIZIZ3 = HOT.LIZIZ(mediaMetadataRetriever);
                            if (LIZIZ3 != null) {
                                i = Integer.parseInt(LIZIZ3);
                            } else {
                                i = 0;
                            }
                            String LIZ3 = HOT.LIZ(mediaMetadataRetriever);
                            if (LIZ3 != null) {
                                i2 = Integer.parseInt(LIZ3);
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
                                j = Long.parseLong(extractMetadata2);
                            } else {
                                j = 0;
                            }
                            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(20);
                            if (extractMetadata3 != null) {
                                i4 = Integer.parseInt(extractMetadata3);
                            } else {
                                i4 = 0;
                            }
                            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(25);
                            if (extractMetadata4 != null) {
                                i5 = Integer.parseInt(extractMetadata4);
                            } else {
                                i5 = 0;
                            }
                            String extractMetadata5 = mediaMetadataRetriever.extractMetadata(12);
                            if (extractMetadata5 == null) {
                                extractMetadata5 = "unknown";
                            }
                            c145715nj = new C145715nj(path, i, i2, i3, j, i4, i5, extractMetadata5, 384);
                        } catch (Exception unused) {
                            c145715nj = new C145715nj(path, 0, 0, 0, 0L, 0, 0, null, 992);
                        }
                        mediaMetadataRetriever.release();
                    } catch (Throwable th) {
                        mediaMetadataRetriever.release();
                        throw th;
                    }
                }
            }
            LIZIZ.put(LIZIZ2, c145715nj);
        }
        return c145715nj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (0 != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(android.content.Context r5, android.graphics.BitmapFactory.Options r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "path"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.System.currentTimeMillis()
            android.net.Uri r4 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)
            java.lang.String r1 = r4.getScheme()
            java.lang.String r0 = "content"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L22
        L1d:
            r3 = 0
            r2 = 0
            if (r6 != 0) goto L31
            goto L2c
        L22:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            android.net.Uri r4 = android.net.Uri.fromFile(r0)
            goto L1d
        L2c:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L51
            r6.<init>()     // Catch: java.lang.Throwable -> L51
        L31:
            r0 = 1
            r6.inJustDecodeBounds = r0     // Catch: java.lang.Throwable -> L51
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r1 = r1.openFileDescriptor(r4, r0)     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L41
            return r2
        L41:
            java.io.FileDescriptor r0 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> L54
            android.graphics.BitmapFactory.decodeFileDescriptor(r0, r3, r6)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r6.outMimeType     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L4d
            r2 = 1
        L4d:
            r1.close()
            return r2
        L51:
            if (r3 == 0) goto L58
            goto L55
        L54:
            r3 = r1
        L55:
            r3.close()
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C152205yC.LIZLLL(android.content.Context, android.graphics.BitmapFactory$Options, java.lang.String):boolean");
    }
}
