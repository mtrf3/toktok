package X;

/* renamed from: X.Fsb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40353Fsb extends AbstractC40354Fsc {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (r1 != null) goto L21;
     */
    @Override // X.AbstractC37594EpC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r7, X.C37356ElM r8, X.EnumC37844EtE r9) {
        /*
            r6 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.LJIIJ(r9, r0)
            X.Ezz r1 = r6.LJLIL
            r2 = 0
            if (r1 == 0) goto Lb8
            java.lang.Class<X.Nsz> r0 = X.InterfaceC60761Nsz.class
            java.lang.Object r0 = r1.LJ(r0)
            X.Nsz r0 = (X.InterfaceC60761Nsz) r0
            if (r0 == 0) goto Lb8
            X.Nsb r5 = r0.getHybridContext()
        L18:
            boolean r0 = r5 instanceof com.bytedance.hybrid.spark.SparkContext
            if (r0 != 0) goto L1d
            r5 = r2
        L1d:
            r3 = 0
            if (r5 == 0) goto Laa
            X.Ezz r0 = r6.LJLIL
            if (r0 == 0) goto L9c
            android.app.Activity r4 = r0.LIZLLL()
            if (r4 == 0) goto L9c
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 != 0) goto L9a
            r1 = r2
        L2f:
            X.1qj r1 = (X.ActivityC45651qj) r1
            if (r1 == 0) goto L8c
        L33:
            java.lang.Class<com.bytedance.hybrid.spark.page.SparkPopup> r0 = com.bytedance.hybrid.spark.page.SparkPopup.class
            java.lang.Object r4 = r5.LIZIZ(r0)
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            if (r4 == 0) goto L7e
            boolean r0 = r4.isAdded()
            if (r0 != 0) goto L65
            androidx.fragment.app.FragmentManager r3 = r1.getSupportFragmentManager()
            java.lang.String r0 = "activity.supportFragmentManager"
            kotlin.jvm.internal.o.LJFF(r3, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "SparkPopup#"
            r1.append(r0)
            java.lang.String r0 = r5.containerId
            int r0 = r0.hashCode()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r4.show(r3, r0)
        L65:
            java.lang.Class<X.Fse> r0 = X.InterfaceC40356Fse.class
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r0 = X.ED5.LIZJ(r0, r2)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r0 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r0
            java.lang.String r1 = ""
            r8.onSuccess(r0, r1)
            java.lang.Class<X.Fse> r0 = X.InterfaceC40356Fse.class
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r0 = X.ED5.LIZJ(r0, r2)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r0 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r0
            r8.onSuccess(r0, r1)
        L7d:
            return
        L7e:
            java.lang.Class<X.Fse> r0 = X.InterfaceC40356Fse.class
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.ED5.LIZJ(r0, r2)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r1 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r1
            java.lang.String r0 = "spark popup is null"
            r8.onFailure(r3, r0, r1)
            goto L7d
        L8c:
            android.app.Activity r1 = X.V1B.LJZ(r4)
            boolean r0 = r1 instanceof X.ActivityC45651qj
            if (r0 != 0) goto L95
            r1 = r2
        L95:
            X.1qj r1 = (X.ActivityC45651qj) r1
            if (r1 == 0) goto L9c
            goto L33
        L9a:
            r1 = r4
            goto L2f
        L9c:
            java.lang.Class<X.Fse> r0 = X.InterfaceC40356Fse.class
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.ED5.LIZJ(r0, r2)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r1 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r1
            java.lang.String r0 = "context is null or not a FragmentActivity."
            r8.onFailure(r3, r0, r1)
            goto L7d
        Laa:
            java.lang.Class<X.Fse> r0 = X.InterfaceC40356Fse.class
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.ED5.LIZJ(r0, r2)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r1 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r1
            java.lang.String r0 = "spark context is null or not Spark Context."
            r8.onFailure(r3, r0, r1)
            goto L7d
        Lb8:
            r5 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40353Fsb.LJI(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, X.ElM, X.EtE):void");
    }
}
