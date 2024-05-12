package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class EF0 {
    public static final EF0 LIZ = new EF0();
    public static List<? extends EEY> LIZIZ = C61878OQg.INSTANCE;
    public static volatile int LIZJ;
    public static volatile boolean LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LIZ(android.content.Context r8, java.util.List r9) {
        /*
            r7 = this;
            boolean r0 = X.FCD.LJI(r8)
            if (r0 != 0) goto L9
            X.OQg r0 = X.C61878OQg.INSTANCE
            return r0
        L9:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r6 = r9.iterator()
        L14:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r4 = r6.next()
            r2 = r4
            X.EEY r2 = (X.EEY) r2
            X.EEx r1 = r2.triggerType()
            X.EEx r0 = X.EnumC36103EEx.TASK_MAIN
            r3 = 0
            if (r1 == r0) goto L32
            X.EEx r1 = r2.triggerType()
            X.EEx r0 = X.EnumC36103EEx.SERVICE_MAIN
            if (r1 != r0) goto L48
        L32:
            java.lang.String r2 = r2.key()
            java.util.Set<java.lang.String> r1 = X.C34592Dhs.LIZ     // Catch: java.lang.Exception -> L44
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L3f
            goto L44
        L3f:
            boolean r0 = r1.contains(r2)     // Catch: java.lang.Exception -> L44
            goto L45
        L44:
            r0 = 0
        L45:
            if (r0 == 0) goto L48
            r3 = 1
        L48:
            if (r3 == 0) goto L14
            r5.add(r4)
            goto L14
        L4e:
            X.EF0.LIZIZ = r5
            java.util.concurrent.ExecutorService r2 = X.C38995FSd.LJFF()
            Y.ARunnableS25S0200000_6 r1 = new Y.ARunnableS25S0200000_6
            r0 = 36
            r1.<init>(r8, r7, r0)
            r2.execute(r1)
            java.util.List<? extends X.EEY> r0 = X.EF0.LIZIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EF0.LIZ(android.content.Context, java.util.List):java.util.List");
    }
}
