package X;

import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.2NJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2NJ {
    public static final java.util.Set<String> LIZ;
    public static final java.util.Set<Long> LIZIZ;

    static {
        java.util.Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        o.LJIIIIZZ(synchronizedSet, "synchronizedSet(mutableSetOf())");
        LIZ = synchronizedSet;
        java.util.Set<Long> synchronizedSet2 = Collections.synchronizedSet(new LinkedHashSet());
        o.LJIIIIZZ(synchronizedSet2, "synchronizedSet(mutableSetOf())");
        LIZIZ = synchronizedSet2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r4) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            java.util.Iterator r4 = r4.iterator()
        L7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            if (r3 != 0) goto L16
            goto L7
        L16:
            java.lang.String r0 = r3.getAid()
            if (r0 == 0) goto L7
            java.util.Set<java.lang.String> r2 = X.C2NJ.LIZ
            java.lang.String r1 = r3.getAid()
            java.lang.String r0 = "aweme.aid"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.add(r1)
            boolean r0 = r3.isAd()
            if (r0 != 0) goto L31
            goto L7
        L31:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r3.getAwemeRawAd()     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            java.lang.Long r0 = r0.getCreativeId()     // Catch: java.lang.Exception -> L7
            if (r0 == 0) goto L7
            long r2 = r0.longValue()     // Catch: java.lang.Exception -> L7
            java.util.Set<java.lang.Long> r1 = X.C2NJ.LIZIZ     // Catch: java.lang.Exception -> L7
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L7
            r1.add(r0)     // Catch: java.lang.Exception -> L7
            goto L7
        L4b:
            java.util.Set<java.lang.Long> r0 = X.C2NJ.LIZIZ
            X.C2PA.LIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2NJ.LIZ(java.util.List):void");
    }
}
