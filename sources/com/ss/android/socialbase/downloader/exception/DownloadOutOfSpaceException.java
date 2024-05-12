package com.ss.android.socialbase.downloader.exception;

/* loaded from: classes16.dex */
public class DownloadOutOfSpaceException extends BaseException {
    public final long avaliableSpaceBytes;
    public final long requiredSpaceBytes;

    public long getAvaliableSpaceBytes() {
        return this.avaliableSpaceBytes;
    }

    public long getRequiredSpaceBytes() {
        return this.requiredSpaceBytes;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DownloadOutOfSpaceException(long r9, long r11) {
        /*
            r8 = this;
            java.util.Locale r7 = java.util.Locale.US
            r0 = 2
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r6[r1] = r0
            X.X4H r2 = X.X4H.LJFF
            java.lang.String r1 = "report_space_grain_size"
            r0 = 50
            int r0 = r2.LJIIIIZZ(r1, r0)
            r4 = 1048576(0x100000, double:5.180654E-318)
            if (r0 <= 0) goto L39
            long r2 = r9 / r4
            long r0 = (long) r0
            long r2 = r2 / r0
            long r2 = r2 * r0
        L21:
            long r2 = r2 * r4
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r0 = 1
            r6[r0] = r1
            java.lang.String r0 = "space is not enough required space is : %d but available space is :%d"
            java.lang.String r1 = X.C16880lQ.LLLZI(r7, r0, r6)
            r0 = 1006(0x3ee, float:1.41E-42)
            r8.<init>(r0, r1)
            r8.avaliableSpaceBytes = r9
            r8.requiredSpaceBytes = r11
            return
        L39:
            if (r0 >= 0) goto L3e
            r2 = 0
            goto L21
        L3e:
            long r2 = r9 / r4
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException.<init>(long, long):void");
    }
}
