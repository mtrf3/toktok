package com.ss.android.ttve.nativePort;

/* loaded from: classes3.dex */
public class TEUriTestUtils {
    public static native int checkVideo(String str);

    public static native int decodeImageFile(String str);

    public static native int getColorGamut(String str);

    public static native int getImageInfo(String str);

    public static native boolean isFileExistCompat(String str);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r3 == null) goto L60;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004f: IF  (r2 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:59:? (LINE:33554511), block:B:51:0x004f */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0063 -> B:19:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getRotation(android.content.ContentResolver r5, java.lang.String r6) {
        /*
            boolean r0 = com.ss.android.vesdk.VEFileUtils.isAndroidUriPath(r6)
            r4 = -1
            r3 = 0
            if (r0 != 0) goto Le
            android.media.ExifInterface r3 = new android.media.ExifInterface     // Catch: java.io.IOException -> L83
            r3.<init>(r6)     // Catch: java.io.IOException -> L83
            goto L68
        Le:
            if (r5 != 0) goto L18
            java.lang.String r1 = "TEUriTestUtils"
            java.lang.String r0 = "contentResolver should not be null after Android Q"
            X.P4Q.LIZJ(r1, r0)
            return r4
        L18:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r5.openFileDescriptor(r1, r0)     // Catch: java.io.IOException -> L3d java.io.FileNotFoundException -> L48 java.lang.Throwable -> L5a
            if (r2 != 0) goto L25
            return r4
        L25:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.io.IOException -> L39 java.io.FileNotFoundException -> L3b java.lang.Throwable -> L4e
            r0 = 24
            if (r1 < r0) goto L35
            android.media.ExifInterface r1 = new android.media.ExifInterface     // Catch: java.io.IOException -> L39 java.io.FileNotFoundException -> L3b java.lang.Throwable -> L4e
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch: java.io.IOException -> L39 java.io.FileNotFoundException -> L3b java.lang.Throwable -> L4e
            r1.<init>(r0)     // Catch: java.io.IOException -> L39 java.io.FileNotFoundException -> L3b java.lang.Throwable -> L4e
            r3 = r1
        L35:
            r2.close()     // Catch: java.io.IOException -> L62
            goto L66
        L39:
            r0 = move-exception
            goto L3f
        L3b:
            r0 = move-exception
            goto L4a
        L3d:
            r0 = move-exception
            r2 = r3
        L3f:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L87
            r2.close()     // Catch: java.io.IOException -> L62
            goto L87
        L48:
            r0 = move-exception
            r2 = r3
        L4a:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L4e
            goto L5c
        L4e:
            r1 = move-exception
            if (r2 == 0) goto L5b
            r2.close()     // Catch: java.io.IOException -> L55
            goto L5b
        L55:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L5b
        L5a:
            r1 = move-exception
        L5b:
            throw r1
        L5c:
            if (r2 == 0) goto L87
            r2.close()     // Catch: java.io.IOException -> L62
            goto L87
        L62:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L66:
            if (r3 == 0) goto L87
        L68:
            java.lang.String r0 = "Orientation"
            r2 = 0
            int r1 = r3.getAttributeInt(r0, r2)
            r0 = 3
            if (r1 == r0) goto L80
            r0 = 6
            if (r1 == r0) goto L7d
            r0 = 8
            if (r1 == r0) goto L7a
            return r2
        L7a:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L7d:
            r0 = 90
            return r0
        L80:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
        L83:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L87:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TEUriTestUtils.getRotation(android.content.ContentResolver, java.lang.String):int");
    }
}
