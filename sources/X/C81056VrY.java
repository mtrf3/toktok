package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;

/* renamed from: X.VrY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81056VrY extends AbstractC81054VrW {
    public final int LIZ;
    public final int LIZIZ;

    public C81056VrY(int i, int i2) {
        this.LIZ = LiveCoverMinSizeSetting.DEFAULT;
        this.LIZIZ = LiveCoverMinSizeSetting.DEFAULT;
        this.LIZ = i;
        this.LIZIZ = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC81054VrW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C81053VrV LIZ(android.content.Context r9, com.zhihu.matisse.internal.entity.Item r10) {
        /*
            r8 = this;
            android.net.Uri r1 = r10.uri
            java.lang.String r0 = "head_upload_filter_settings"
            r7 = 0
            boolean r0 = X.C19N.LJ(r0, r7)
            if (r0 == 0) goto L1e
            boolean r0 = X.C268613q.LJIIJJI(r9, r1)
            if (r0 != 0) goto L1e
            X.VrV r1 = new X.VrV
            r0 = 2131834685(0x7f11373d, float:1.9302487E38)
            java.lang.String r0 = r9.getString(r0)
            r1.<init>(r0, r7)
            return r1
        L1e:
            int r6 = r8.LIZ
            int r5 = r8.LIZIZ
            r4 = 0
            if (r6 <= 0) goto L27
            if (r5 > 0) goto L28
        L27:
            return r4
        L28:
            android.content.ContentResolver r0 = r9.getContentResolver()     // Catch: java.io.FileNotFoundException -> L4a java.lang.Throwable -> L6d
            java.io.InputStream r3 = r0.openInputStream(r1)     // Catch: java.io.FileNotFoundException -> L4a java.lang.Throwable -> L6d
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.io.FileNotFoundException -> L48 java.lang.Throwable -> L64
            r2.<init>()     // Catch: java.io.FileNotFoundException -> L48 java.lang.Throwable -> L64
            r1 = 1
            r2.inJustDecodeBounds = r1     // Catch: java.io.FileNotFoundException -> L48 java.lang.Throwable -> L64
            android.graphics.BitmapFactory.decodeStream(r3, r4, r2)     // Catch: java.io.FileNotFoundException -> L48 java.lang.Throwable -> L64
            int r0 = r2.outWidth     // Catch: java.io.FileNotFoundException -> L48 java.lang.Throwable -> L64
            if (r6 > r0) goto L45
            int r0 = r2.outHeight     // Catch: java.io.FileNotFoundException -> L48 java.lang.Throwable -> L64
            if (r5 <= r0) goto L44
            goto L45
        L44:
            r1 = 0
        L45:
            if (r3 == 0) goto L55
            goto L52
        L48:
            r0 = move-exception
            goto L4c
        L4a:
            r0 = move-exception
            r3 = r4
        L4c:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L27
            r1 = 0
        L52:
            r3.close()     // Catch: java.io.IOException -> L55
        L55:
            if (r1 == 0) goto L27
            X.VrV r1 = new X.VrV
            r0 = 2131834714(0x7f11375a, float:1.9302546E38)
            java.lang.String r0 = r9.getString(r0)
            r1.<init>(r0, r7)
            return r1
        L64:
            r0 = move-exception
            goto L67
        L66:
            r0 = move-exception
        L67:
            if (r3 == 0) goto L6e
            r3.close()     // Catch: java.io.IOException -> L6e
            goto L6e
        L6d:
            r0 = move-exception
        L6e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81056VrY.LIZ(android.content.Context, com.zhihu.matisse.internal.entity.Item):X.VrV");
    }
}
