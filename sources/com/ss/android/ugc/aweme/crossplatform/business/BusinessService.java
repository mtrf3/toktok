package com.ss.android.ugc.aweme.crossplatform.business;

import X.C59314NPq;
import X.C59484NWe;
import X.InterfaceC59488NWi;
import android.content.Context;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class BusinessService {
    public final C59484NWe LIZ;
    public final HashMap<Class, Business> LIZIZ = new HashMap<>();

    /* loaded from: classes11.dex */
    public static abstract class Business {
        public final InterfaceC59488NWi LIZ;
        public final C59314NPq LIZIZ;
        public final Context LIZJ;

        public Business(C59484NWe c59484NWe) {
            InterfaceC59488NWi interfaceC59488NWi = c59484NWe.LIZ;
            this.LIZ = interfaceC59488NWi;
            this.LIZIZ = interfaceC59488NWi.getCrossPlatformParams();
            this.LIZJ = interfaceC59488NWi.getContext();
        }
    }

    public BusinessService(C59484NWe c59484NWe) {
        this.LIZ = c59484NWe;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends com.ss.android.ugc.aweme.crossplatform.business.BusinessService.Business> T LIZ(java.lang.Class<T> r7) {
        /*
            r6 = this;
            java.util.HashMap<java.lang.Class, com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business> r0 = r6.LIZIZ
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L11
            java.util.HashMap<java.lang.Class, com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business> r0 = r6.LIZIZ
            java.lang.Object r0 = r0.get(r7)
            com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business r0 = (com.ss.android.ugc.aweme.crossplatform.business.BusinessService.Business) r0
            return r0
        L11:
            int r0 = r7.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L69
            r5 = 0
            r4 = 1
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L53 java.lang.NoSuchMethodException -> L59 java.lang.Exception -> L5f
            java.lang.Class<X.NWe> r0 = X.C59484NWe.class
            r3 = 0
            r1[r3] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L53 java.lang.NoSuchMethodException -> L59 java.lang.Exception -> L5f
            java.lang.reflect.Constructor r2 = r7.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L53 java.lang.NoSuchMethodException -> L59 java.lang.Exception -> L5f
            r2.setAccessible(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L53 java.lang.NoSuchMethodException -> L59 java.lang.Exception -> L5f
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L53 java.lang.NoSuchMethodException -> L59 java.lang.Exception -> L5f
            X.NWe r0 = r6.LIZ     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L53 java.lang.NoSuchMethodException -> L59 java.lang.Exception -> L5f
            r1[r3] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L53 java.lang.NoSuchMethodException -> L59 java.lang.Exception -> L5f
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L53 java.lang.NoSuchMethodException -> L59 java.lang.Exception -> L5f
            com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business r1 = (com.ss.android.ugc.aweme.crossplatform.business.BusinessService.Business) r1     // Catch: java.lang.reflect.InvocationTargetException -> L47 java.lang.InstantiationException -> L4d java.lang.IllegalAccessException -> L53 java.lang.NoSuchMethodException -> L59 java.lang.Exception -> L5f
            java.util.HashMap<java.lang.Class, com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business> r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L3d java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            r0.put(r7, r1)     // Catch: java.lang.Exception -> L3d java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            goto L64
        L3d:
            r0 = move-exception
            goto L61
        L3f:
            r0 = move-exception
            goto L49
        L41:
            r0 = move-exception
            goto L4f
        L43:
            r0 = move-exception
            goto L55
        L45:
            r0 = move-exception
            goto L5b
        L47:
            r0 = move-exception
            r1 = r5
        L49:
            X.C16880lQ.LLLLIIL(r0)
            goto L64
        L4d:
            r0 = move-exception
            r1 = r5
        L4f:
            X.C16880lQ.LLLLIIL(r0)
            goto L64
        L53:
            r0 = move-exception
            r1 = r5
        L55:
            X.C16880lQ.LLLLIIL(r0)
            goto L64
        L59:
            r0 = move-exception
            r1 = r5
        L5b:
            X.C16880lQ.LLLLIIL(r0)
            goto L64
        L5f:
            r0 = move-exception
            r1 = r5
        L61:
            X.C16880lQ.LLLLIIL(r0)
        L64:
            if (r1 != 0) goto L67
        L66:
            return r5
        L67:
            r5 = r1
            goto L66
        L69:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "can't use abstract class!"
            r1.append(r0)
            java.lang.String r0 = X.C16880lQ.LJLLJ(r7)
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.business.BusinessService.LIZ(java.lang.Class):com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business");
    }
}
