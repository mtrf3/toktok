package X;

/* renamed from: X.2WN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WN {
    public static volatile C2WN LIZ;

    public static C2WN LIZ() {
        if (LIZ == null) {
            synchronized (C2WN.class) {
                if (LIZ == null) {
                    LIZ = new C2WN();
                }
            }
        }
        return LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r4 != 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.widget.ImageView r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Boolean r8) {
        /*
            r0 = 2131376092(0x7f0a37dc, float:1.837235E38)
            java.lang.Object r0 = r3.getTag(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto Lc
        Lb:
            return
        Lc:
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            goto Lb
        L13:
            X.7au r3 = new X.7au
            r3.<init>()
            java.lang.String r0 = "enter_from"
            r3.LJIIIZ(r0, r5)
            java.lang.String r0 = "group_id"
            r3.LJIIIZ(r0, r6)
            java.lang.String r0 = "author_id"
            r3.LJIIIZ(r0, r7)
            java.lang.String r0 = "show_content"
            java.lang.String r2 = ""
            r3.LJIIIZ(r0, r2)
            r1 = 2
            if (r4 != r1) goto L42
            boolean r1 = r8.booleanValue()
            java.lang.String r0 = "is_pop_up"
            r3.LIZLLL(r1, r0)
        L3a:
            java.lang.String r2 = "share_highlight_click"
        L3c:
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.LIZ
            X.FMX.LJIIL(r2, r0)
            return
        L42:
            if (r4 == 0) goto L4d
            r0 = 1
            if (r4 == r0) goto L4a
            if (r4 == r1) goto L3a
            goto L3c
        L4a:
            java.lang.String r2 = "comment_highlight_click"
            goto L3c
        L4d:
            java.lang.String r2 = "like_highlight_click"
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2WN.LIZIZ(android.widget.ImageView, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void");
    }
}
