package X;

import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Nvx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60945Nvx implements InterfaceC60871Nul {
    public final SparkPopupSchemaParam LIZ;
    public final C131825Fi LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        if (r7.equals("right") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
    
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (X.C60963NwF.LIZ(r0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        r4 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (X.C60963NwF.LIZ(r0) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        if (r7.equals("left") != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002c  */
    @Override // X.InterfaceC60871Nul
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke() {
        /*
            r8 = this;
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r8.LIZ
            int r0 = r0.getRadius()
            float r4 = (float) r0
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r8.LIZ
            int r0 = r0.getRadius()
            float r3 = (float) r0
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r8.LIZ
            int r0 = r0.getRadius()
            float r5 = (float) r0
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r8.LIZ
            int r0 = r0.getRadius()
            float r2 = (float) r0
            java.lang.String r7 = r8.LIZLLL
            int r0 = r7.hashCode()
            r1 = 0
            java.lang.String r6 = "view.context"
            switch(r0) {
                case 100571: goto L6e;
                case 3317767: goto L9f;
                case 108511772: goto L65;
                case 109757538: goto L86;
                default: goto L28;
            }
        L28:
            boolean r0 = r8.LIZJ
            if (r0 == 0) goto L56
            r5 = 0
        L2d:
            r1 = r5
            r2 = 0
        L2f:
            X.5Fi r6 = r8.LIZIZ
            r6.getClass()
            r0 = 8
            float[] r5 = new float[r0]
            r0 = 0
            r5[r0] = r4
            r0 = 1
            r5[r0] = r4
            r0 = 2
            r5[r0] = r3
            r0 = 3
            r5[r0] = r3
            r0 = 4
            r5[r0] = r2
            r0 = 5
            r5[r0] = r2
            r0 = 6
            r5[r0] = r1
            r0 = 7
            r5[r0] = r1
            r6.LJLJJI = r5
            r6.invalidate()
            return
        L56:
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r8.LIZ
            int r0 = r0.getRadius()
            float r1 = (float) r0
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r8.LIZ
            int r0 = r0.getRadius()
            float r2 = (float) r0
            goto L2f
        L65:
            java.lang.String r0 = "right"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L28
            goto L9d
        L6e:
            java.lang.String r0 = "end"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L28
            X.5Fi r0 = r8.LIZIZ
            android.content.Context r0 = r0.getContext()
            kotlin.jvm.internal.o.LJFF(r0, r6)
            boolean r0 = X.C60963NwF.LIZ(r0)
            if (r0 == 0) goto L9d
            goto La7
        L86:
            java.lang.String r0 = "start"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L28
            X.5Fi r0 = r8.LIZIZ
            android.content.Context r0 = r0.getContext()
            kotlin.jvm.internal.o.LJFF(r0, r6)
            boolean r0 = X.C60963NwF.LIZ(r0)
            if (r0 == 0) goto La7
        L9d:
            r3 = 0
            goto L2d
        L9f:
            java.lang.String r0 = "left"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L28
        La7:
            r4 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60945Nvx.invoke():void");
    }

    public C60945Nvx(SparkPopupSchemaParam params, C131825Fi view, boolean z, String gravity) {
        o.LJIIJ(params, "params");
        o.LJIIJ(view, "view");
        o.LJIIJ(gravity, "gravity");
        this.LIZ = params;
        this.LIZIZ = view;
        this.LIZJ = z;
        this.LIZLLL = gravity;
    }
}
