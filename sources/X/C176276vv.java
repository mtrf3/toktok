package X;

import java.util.List;

/* renamed from: X.6vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176276vv {
    public static final List<String> LIZ = C47261Igj.LJJIJ("list_item_id");

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "1") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r4, java.util.Map r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            if (r4 == 0) goto L64
            java.util.Map r2 = r4.getSearchExtraParams()
            r0 = 0
            if (r2 == 0) goto L61
            java.lang.String r1 = "is_search_video"
            java.lang.Object r1 = r2.get(r1)
        L14:
            java.lang.String r2 = "1"
            boolean r1 = kotlin.jvm.internal.o.LJ(r1, r2)
            if (r1 != 0) goto L2e
            java.util.Map r1 = r4.getSearchExtraParams()
            if (r1 == 0) goto L28
            java.lang.String r0 = "is_search_video_inner"
            java.lang.Object r0 = r1.get(r0)
        L28:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 == 0) goto L64
        L2e:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L3b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getKey()
            java.util.List<java.lang.String> r0 = X.C176276vv.LIZ
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L3b
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r4.put(r1, r0)
            goto L3b
        L61:
            r1 = r0
            goto L14
        L63:
            return r4
        L64:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176276vv.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.util.Map):java.util.Map");
    }
}
