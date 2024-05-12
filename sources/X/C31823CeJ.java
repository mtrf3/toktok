package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CeJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31823CeJ extends AbstractC31822CeI {
    public Bitmap LJIIIZ;
    public final boolean LJIIJ;
    public final Bitmap.CompressFormat LJIIJJI;
    public final int LJIIL;
    public final String LJIILIIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BitmapFile: fileName=");
        LIZ.append(this.LIZ);
        LIZ.append(" fileDir=");
        LIZ.append(C78983UzD.LJJIIJ(this));
        LIZ.append(" imageUrl=");
        LIZ.append(this.LJIILIIL);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC31822CeI
    public final void LIZ(String ioType, JSONObject category, JSONObject metric, JSONObject extra) {
        o.LJIIIZ(ioType, "ioType");
        o.LJIIIZ(category, "category");
        o.LJIIIZ(metric, "metric");
        o.LJIIIZ(extra, "extra");
        super.LIZ(ioType, category, metric, extra);
        if (o.LJ(ioType, "write")) {
            extra.putOpt("image_url", this.LJIILIIL);
        }
        category.putOpt("util_type", "bitmap");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C31823CeJ(java.lang.String r11, X.EnumC31874Cf8 r12, android.graphics.Bitmap r13, boolean r14, android.graphics.Bitmap.CompressFormat r15, int r16) {
        /*
            r10 = this;
            r2 = r16
            r7 = r15
            r0 = r2 & 4
            r1 = 0
            java.lang.String r9 = ""
            if (r0 == 0) goto L2f
            r3 = r9
        Lb:
            r0 = r2 & 8
            if (r0 == 0) goto L2d
            r4 = r9
        L10:
            r0 = r2 & 64
            if (r0 == 0) goto L16
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG
        L16:
            r0 = r2 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2b
            r8 = 100
        L1c:
            r0 = r2 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L29
        L20:
            r6 = r14
            r0 = r10
            r1 = r11
            r2 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L29:
            r9 = r1
            goto L20
        L2b:
            r8 = 0
            goto L1c
        L2d:
            r4 = r1
            goto L10
        L2f:
            r3 = r1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31823CeJ.<init>(java.lang.String, X.Cf8, android.graphics.Bitmap, boolean, android.graphics.Bitmap$CompressFormat, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31823CeJ(String fileName, EnumC31874Cf8 fileDirectory, String subFileDirectory, String mimeType, Bitmap bitmap, boolean z, Bitmap.CompressFormat compressFormat, int i, String imageUrl) {
        super(fileName, fileDirectory, subFileDirectory, mimeType);
        o.LJIIIZ(fileName, "fileName");
        o.LJIIIZ(fileDirectory, "fileDirectory");
        o.LJIIIZ(subFileDirectory, "subFileDirectory");
        o.LJIIIZ(mimeType, "mimeType");
        o.LJIIIZ(compressFormat, "compressFormat");
        o.LJIIIZ(imageUrl, "imageUrl");
        this.LJIIIZ = bitmap;
        this.LJIIJ = z;
        this.LJIIJJI = compressFormat;
        this.LJIIL = i;
        this.LJIILIIL = imageUrl;
    }
}
