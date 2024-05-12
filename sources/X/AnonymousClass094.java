package X;

/* renamed from: X.094, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass094 {
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0062, code lost:
    
        if (0 == 0) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AnonymousClass091 LIZ(android.content.Context r7, X.AnonymousClass095 r8, androidx.fragment.app.Fragment r9, boolean r10) {
        /*
            int r3 = r9.getNextTransition()
            int r5 = r9.getNextAnim()
            r6 = 0
            r9.setNextAnim(r6)
            int r0 = r9.mContainerId
            android.view.View r2 = r8.LIZ(r0)
            r4 = 0
            if (r2 == 0) goto L21
            r1 = 2131380750(0x7f0a4a0e, float:1.8381798E38)
            java.lang.Object r0 = r2.getTag(r1)
            if (r0 == 0) goto L21
            r2.setTag(r1, r4)
        L21:
            android.view.ViewGroup r0 = r9.mContainer
            if (r0 == 0) goto L2c
            android.animation.LayoutTransition r0 = r0.getLayoutTransition()
            if (r0 == 0) goto L2c
            return r4
        L2c:
            android.view.animation.Animation r1 = r9.onCreateAnimation(r3, r10, r5)
            if (r1 == 0) goto L38
            X.091 r0 = new X.091
            r0.<init>(r1)
            return r0
        L38:
            android.animation.Animator r1 = r9.onCreateAnimator(r3, r10, r5)
            if (r1 == 0) goto L44
            X.091 r0 = new X.091
            r0.<init>(r1)
            return r0
        L44:
            if (r5 == 0) goto L83
            android.content.res.Resources r0 = r7.getResources()
            java.lang.String r1 = r0.getResourceTypeName(r5)
            java.lang.String r0 = "anim"
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L67
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r7, r5)     // Catch: java.lang.RuntimeException -> L62 android.content.res.Resources.NotFoundException -> L65
            if (r1 == 0) goto L83
            X.091 r0 = new X.091     // Catch: java.lang.RuntimeException -> L62 android.content.res.Resources.NotFoundException -> L65
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L62 android.content.res.Resources.NotFoundException -> L65
            return r0
        L62:
            if (r6 != 0) goto L83
            goto L67
        L65:
            r0 = move-exception
            throw r0
        L67:
            android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r7, r5)     // Catch: java.lang.RuntimeException -> L73
            if (r1 == 0) goto L83
            X.091 r0 = new X.091     // Catch: java.lang.RuntimeException -> L73
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L73
            return r0
        L73:
            r0 = move-exception
            if (r2 != 0) goto L82
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r7, r5)
            if (r1 == 0) goto L83
            X.091 r0 = new X.091
            r0.<init>(r1)
            return r0
        L82:
            throw r0
        L83:
            if (r3 != 0) goto L86
            return r4
        L86:
            r0 = 4097(0x1001, float:5.741E-42)
            if (r3 == r0) goto L9d
            r0 = 4099(0x1003, float:5.744E-42)
            if (r3 == r0) goto L93
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r3 == r0) goto La7
            return r4
        L93:
            if (r10 == 0) goto L99
            r0 = 2130772087(0x7f010077, float:1.7147283E38)
            goto Lac
        L99:
            r0 = 2130772088(0x7f010078, float:1.7147285E38)
            goto Lac
        L9d:
            if (r10 == 0) goto La3
            r0 = 2130772090(0x7f01007a, float:1.7147289E38)
            goto Lac
        La3:
            r0 = 2130772091(0x7f01007b, float:1.714729E38)
            goto Lac
        La7:
            if (r10 == 0) goto Lb6
            r0 = 2130772085(0x7f010075, float:1.7147278E38)
        Lac:
            X.091 r1 = new X.091
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r7, r0)
            r1.<init>(r0)
            return r1
        Lb6:
            r0 = 2130772086(0x7f010076, float:1.714728E38)
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass094.LIZ(android.content.Context, X.095, androidx.fragment.app.Fragment, boolean):X.091");
    }
}
