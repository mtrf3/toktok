package X;

import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;

/* renamed from: X.NsK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60720NsK implements InterfaceC60871Nul {
    public final SparkPageSchemaParam LIZ;
    public final InterfaceC60844NuK LIZIZ;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    @Override // X.InterfaceC60871Nul
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke() {
        /*
            r6 = this;
            com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam r0 = r6.LIZ
            r2 = 0
            if (r0 == 0) goto Lb
            java.lang.String r1 = r0.getNavBtnType()
            if (r1 != 0) goto L36
        Lb:
            X.Ni4 r5 = X.EnumC60084Ni4.TYPE_NONE
        Ld:
            com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam r0 = r6.LIZ
            java.lang.String r4 = "setNavBtnType"
            java.lang.String r3 = "time_consuming_optimization"
            if (r0 == 0) goto L2b
            boolean r1 = r0.getOptTitle()
            r0 = 1
            if (r1 != r0) goto L2b
            X.Ni4 r0 = X.EnumC60084Ni4.TYPE_NONE
            if (r5 == r0) goto L2a
            X.NuK r0 = r6.LIZIZ
            if (r0 == 0) goto L27
            r0.LJIIZILJ(r5)
        L27:
            X.C37682Eqc.LIZIZ(r2, r3, r4)
        L2a:
            return
        L2b:
            X.NuK r0 = r6.LIZIZ
            if (r0 == 0) goto L32
            r0.LJIIZILJ(r5)
        L32:
            X.C37682Eqc.LIZIZ(r2, r3, r4)
            goto L2a
        L36:
            int r0 = r1.hashCode()
            switch(r0) {
                case -934521548: goto L3e;
                case 3357525: goto L49;
                case 109400031: goto L54;
                case 949444906: goto L5f;
                default: goto L3d;
            }
        L3d:
            goto Lb
        L3e:
            java.lang.String r0 = "report"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            X.Ni4 r5 = X.EnumC60084Ni4.TYPE_REPORT
            goto Ld
        L49:
            java.lang.String r0 = "more"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            X.Ni4 r5 = X.EnumC60084Ni4.TYPE_MORE
            goto Ld
        L54:
            java.lang.String r0 = "share"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            X.Ni4 r5 = X.EnumC60084Ni4.TYPE_SHARE
            goto Ld
        L5f:
            java.lang.String r0 = "collect"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            X.Ni4 r5 = X.EnumC60084Ni4.TYPE_COLLECT
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60720NsK.invoke():void");
    }

    public C60720NsK(SparkPageSchemaParam sparkPageSchemaParam, InterfaceC60844NuK interfaceC60844NuK) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = interfaceC60844NuK;
    }
}
