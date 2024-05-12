package X;

/* renamed from: X.7X1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7X1 {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        if (r2.getLineCount() <= 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        r9.setWidth(X.C79081V1x.LJII(java.lang.Math.min(130, java.lang.Math.max(X.C79081V1x.LJJIIZI(java.lang.Float.valueOf(r2.getLineWidth(0))), X.C79081V1x.LJJIIZI(java.lang.Float.valueOf(r2.getLineWidth(1)))) + 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r3 == 10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r2 = r9.getText();
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "view.text");
        r2 = X.C1A7.LJJIIJ(r9, r2, r5, X.O6R.LJJIIZ(X.C32151Nz.LJIIZILJ(102)), java.lang.Float.valueOf(X.C32151Nz.LJIIZILJ(java.lang.Integer.valueOf(r3))));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float LIZ(com.bytedance.tux.input.TuxTextView r9) {
        /*
            android.text.TextPaint r5 = new android.text.TextPaint
            r5.<init>()
            r3 = 14
        L7:
            r8 = 10
            r0 = 9
            r7 = 102(0x66, float:1.43E-43)
            java.lang.String r6 = "view.text"
            r4 = 1
            if (r0 >= r3) goto L98
            java.lang.CharSequence r2 = r9.getText()
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r1 = X.O6R.LJJIIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            android.text.StaticLayout r0 = X.C1A7.LJJIIJ(r9, r2, r5, r1, r0)
            int r0 = r0.getLineCount()
            if (r0 != r4) goto L94
            if (r3 != r8) goto L92
        L3d:
            java.lang.CharSequence r2 = r9.getText()
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r1 = X.O6R.LJJIIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            android.text.StaticLayout r2 = X.C1A7.LJJIIJ(r9, r2, r5, r1, r0)
            int r0 = r2.getLineCount()
            if (r0 <= r4) goto L92
            r0 = 0
            float r0 = r2.getLineWidth(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r1 = X.C79081V1x.LJJIIZI(r0)
            float r0 = r2.getLineWidth(r4)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r0 = X.C79081V1x.LJJIIZI(r0)
            int r0 = java.lang.Math.max(r1, r0)
            int r1 = r0 + 32
            r0 = 130(0x82, float:1.82E-43)
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = X.C79081V1x.LJII(r0)
            r9.setWidth(r0)
        L92:
            float r0 = (float) r3
            return r0
        L94:
            int r3 = r3 + (-1)
            goto L7
        L98:
            r3 = 10
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7X1.LIZ(com.bytedance.tux.input.TuxTextView):float");
    }
}
