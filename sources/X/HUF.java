package X;

/* loaded from: classes8.dex */
public final class HUF extends HUI {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // X.AbstractC37594EpC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r10, X.C37356ElM r11, X.EnumC37844EtE r12) {
        /*
            r9 = this;
            r7 = r10
            X.HUH r7 = (X.HUH) r7
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            X.HTa r8 = new X.HTa
            r8.<init>(r11)
            java.lang.Number r0 = r7.getToolbarType()
            r3 = 0
            if (r0 == 0) goto La2
            int r0 = r0.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L1c:
            r6 = 0
            r4 = 2
            r5 = 1
            if (r1 != 0) goto L6e
        L21:
            X.OQg r5 = X.C61878OQg.INSTANCE
        L23:
            java.lang.Number r1 = r7.getType()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.o.LJII(r1, r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            if (r0 == 0) goto L6b
            if (r0 == r4) goto L68
            X.HB9 r6 = X.HB9.PHOTO_AND_VIDEO
        L38:
            r4 = r9
            X.Ezz r0 = r4.LJLIL
            if (r0 == 0) goto L67
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L67
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L67
            java.lang.Number r0 = r7.getBase64DataCompress()
            if (r0 == 0) goto L57
            float r0 = r0.floatValue()
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
        L57:
            r8.LJLJI = r3
            com.ss.android.ugc.aweme.services.IExternalService r1 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
            X.HUG r3 = new X.HUG
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r0 = ""
            r1.asyncService(r2, r0, r3)
        L67:
            return
        L68:
            X.HB9 r6 = X.HB9.VIDEO
            goto L38
        L6b:
            X.HB9 r6 = X.HB9.PHOTO
            goto L38
        L6e:
            int r0 = r1.intValue()
            if (r0 != 0) goto L83
            X.HUJ[] r1 = new X.HUJ[r4]
            X.HUJ r0 = X.HUJ.REVERSE
            r1[r6] = r0
            X.HUJ r0 = X.HUJ.FLASH
            r1[r5] = r0
            java.util.List r5 = X.C47261Igj.LJJIJIIJI(r1)
            goto L23
        L83:
            int r0 = r1.intValue()
            if (r0 != r5) goto L21
            r0 = 4
            X.HUJ[] r2 = new X.HUJ[r0]
            X.HUJ r0 = X.HUJ.REVERSE
            r2[r6] = r0
            X.HUJ r0 = X.HUJ.FILTER
            r2[r5] = r0
            X.HUJ r0 = X.HUJ.M_BEAUTY
            r2[r4] = r0
            r1 = 3
            X.HUJ r0 = X.HUJ.FLASH
            r2[r1] = r0
            java.util.List r5 = X.C47261Igj.LJJIJIIJI(r2)
            goto L23
        La2:
            r1 = r3
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HUF.LJI(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, X.ElM, X.EtE):void");
    }
}
