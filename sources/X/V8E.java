package X;

import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes14.dex */
public final class V8E extends BitmapDrawable {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V8E(android.content.Context r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            android.content.res.Resources r3 = r5.getResources()
            java.lang.String r0 = "ctx.resources"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            java.lang.String r2 = "bitmap"
            android.content.res.Resources r0 = r5.getResources()
            java.io.InputStream r1 = r0.openRawResource(r6)
            java.lang.String r0 = "ctx.resources.openRawResource(rawRes)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)
            r0 = 2130971833(0x7f040cb9, float:1.7552416E38)
            java.lang.Integer r0 = X.C79045V0n.LJ(r0, r5)
            if (r0 != 0) goto L33
        L2a:
            java.lang.String r0 = "{\n                bitmap\n            }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L2f:
            r4.<init>(r3, r1)
            return
        L33:
            int r0 = r0.intValue()
            if (r0 == 0) goto L3a
            goto L2a
        L3a:
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r2)     // Catch: android.renderscript.RSRuntimeException -> L42
            android.graphics.Bitmap r1 = X.C80928VpU.LIZ(r5, r1)     // Catch: android.renderscript.RSRuntimeException -> L42
            goto L2f
        L42:
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r2)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V8E.<init>(android.content.Context, int):void");
    }
}
