package com.ss.android.ugc.aweme.services.publish;

/* loaded from: classes8.dex */
public final class AVPublishExtensionUtils {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r3 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T findModel(java.util.List<? extends X.C15070iV<java.lang.Class<?>, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension<?>>> r5, java.lang.Class<T> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            r4 = 0
            r3 = 0
            r2 = r4
        L11:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r1 = r5.next()
            r0 = r1
            X.0iV r0 = (X.C15070iV) r0
            F r0 = r0.LIZ
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r6)
            if (r0 == 0) goto L11
            if (r3 == 0) goto L3b
        L2b:
            r2 = r4
        L2c:
            X.0iV r2 = (X.C15070iV) r2
            if (r2 == 0) goto L3a
            S r0 = r2.LIZIZ
            com.ss.android.ugc.aweme.services.publish.IAVPublishExtension r0 = (com.ss.android.ugc.aweme.services.publish.IAVPublishExtension) r0
            if (r0 == 0) goto L3a
            java.lang.Object r4 = r0.provideExtensionData()
        L3a:
            return r4
        L3b:
            r3 = 1
            r2 = r1
            goto L11
        L3e:
            if (r3 != 0) goto L2c
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils.findModel(java.util.List, java.lang.Class):java.lang.Object");
    }
}
