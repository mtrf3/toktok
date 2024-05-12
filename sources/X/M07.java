package X;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class M07 {
    public static /* synthetic */ JSONObject LIZIZ(EnumC56032Lyu enumC56032Lyu, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        return LIZ(enumC56032Lyu, str, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: all -> 0x0046, CancellationException -> 0x004d, TryCatch #2 {CancellationException -> 0x004d, all -> 0x0046, blocks: (B:3:0x000a, B:5:0x0016, B:10:0x0022, B:12:0x0029, B:17:0x0035, B:19:0x003c, B:26:0x0047), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x0046, CancellationException -> 0x004d, TryCatch #2 {CancellationException -> 0x004d, all -> 0x0046, blocks: (B:3:0x000a, B:5:0x0016, B:10:0x0022, B:12:0x0029, B:17:0x0035, B:19:0x003c, B:26:0x0047), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0046, CancellationException -> 0x004d, TryCatch #2 {CancellationException -> 0x004d, all -> 0x0046, blocks: (B:3:0x000a, B:5:0x0016, B:10:0x0022, B:12:0x0029, B:17:0x0035, B:19:0x003c, B:26:0x0047), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LIZ(X.EnumC56032Lyu r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "sourceType"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r1 = "source"
            java.lang.String r0 = r3.getValue()     // Catch: java.lang.Throwable -> L46 java.util.concurrent.CancellationException -> L4d
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L46 java.util.concurrent.CancellationException -> L4d
            r1 = 1
            if (r4 == 0) goto L1f
            boolean r0 = ujb.o.LJJJJJL(r4)     // Catch: java.lang.Throwable -> L46 java.util.concurrent.CancellationException -> L4d
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            if (r0 != 0) goto L27
            java.lang.String r0 = "previous_page"
            r2.put(r0, r4)     // Catch: java.lang.Throwable -> L46 java.util.concurrent.CancellationException -> L4d
        L27:
            if (r5 == 0) goto L32
            boolean r0 = ujb.o.LJJJJJL(r5)     // Catch: java.lang.Throwable -> L46 java.util.concurrent.CancellationException -> L4d
            if (r0 == 0) goto L30
            goto L32
        L30:
            r0 = 0
            goto L33
        L32:
            r0 = 1
        L33:
            if (r0 != 0) goto L3a
            java.lang.String r0 = "extra_route_schema"
            r2.put(r0, r5)     // Catch: java.lang.Throwable -> L46 java.util.concurrent.CancellationException -> L4d
        L3a:
            if (r6 == 0) goto L44
            boolean r0 = ujb.o.LJJJJJL(r6)     // Catch: java.lang.Throwable -> L46 java.util.concurrent.CancellationException -> L4d
            if (r0 == 0) goto L43
            goto L44
        L43:
            r1 = 0
        L44:
            if (r1 == 0) goto L47
        L46:
            return r2
        L47:
            java.lang.String r0 = "enter_method"
            r2.put(r0, r6)     // Catch: java.lang.Throwable -> L46 java.util.concurrent.CancellationException -> L4d
            goto L46
        L4d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M07.LIZ(X.Lyu, java.lang.String, java.lang.String, java.lang.String):org.json.JSONObject");
    }
}
