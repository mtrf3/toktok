package X;

/* renamed from: X.BxN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30457BxN {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r4.get(3) == r2.get(3)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r4.get(6) == r2.get(6)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ() {
        /*
            java.lang.String r1 = X.C30443Bx9.LIZ()
            X.J0d<java.lang.Integer> r0 = X.InterfaceC30442Bx8.LLIZLLLIL
            java.lang.String r0 = r0.toString()
            int r0 = r1.compareTo(r0)
            r7 = 1
            if (r0 <= 0) goto L12
            return r7
        L12:
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            java.lang.String r0 = "currentDate"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            X.J0d<java.lang.Long> r3 = X.InterfaceC30442Bx8.LLILZ
            java.lang.Object r0 = r3.LIZJ()
            java.lang.Long r0 = (java.lang.Long) r0
            r5 = 0
            if (r0 != 0) goto L4a
        L27:
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            java.lang.Object r1 = r3.LIZJ()
            java.lang.String r0 = "MULTI_CO_HOST_SHOW_FEEDBACK.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Number r1 = (java.lang.Number) r1
            long r0 = r1.longValue()
            r2.setTimeInMillis(r0)
            r0 = 6
            int r1 = r4.get(r0)
            int r0 = r2.get(r0)
            if (r1 != r0) goto L52
        L48:
            r7 = 0
        L49:
            return r7
        L4a:
            long r1 = r0.longValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L27
        L52:
            X.J0d<java.lang.Long> r3 = X.InterfaceC30442Bx8.LLILZIL
            java.lang.Object r0 = r3.LIZJ()
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto L7e
        L5c:
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            java.lang.Object r1 = r3.LIZJ()
            java.lang.String r0 = "MULTI_CO_HOST_SUBMIT_FEEDBACK.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Number r1 = (java.lang.Number) r1
            long r0 = r1.longValue()
            r2.setTimeInMillis(r0)
            r0 = 3
            int r1 = r4.get(r0)
            int r0 = r2.get(r0)
            if (r1 != r0) goto L86
            goto L48
        L7e:
            long r1 = r0.longValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L5c
        L86:
            long r3 = java.lang.System.currentTimeMillis()
            X.J0d<java.lang.Long> r0 = X.InterfaceC30442Bx8.LLIZ
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "MULTI_CO_HOST_ADMIT_FEEDBACK_TIMESTAMP.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L49
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30457BxN.LIZ():boolean");
    }
}
