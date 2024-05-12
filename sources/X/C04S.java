package X;

import android.view.ViewGroup;

/* renamed from: X.04S, reason: invalid class name */
/* loaded from: classes.dex */
public final class C04S {
    public static final ViewGroup.LayoutParams LIZ = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r4 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC24790yB LIZ(X.C04D r7, X.AbstractC24810yD r8, X.C40431iJ r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C04I.LIZ
            r5 = 0
            r3 = 1
            boolean r0 = r0.compareAndSet(r5, r3)
            r2 = 0
            if (r0 == 0) goto L4a
            r1 = -1
            r0 = 6
            X.XK4 r6 = X.C78934UyQ.LIZJ(r1, r2, r0)
            X.Ol8 r0 = X.C29Y.LJLLI
            java.lang.Object r0 = r0.getValue()
            X.MBA r0 = (X.MBA) r0
            X.2gm r4 = X.C48841JEv.LIZ(r0)
            X.29V r1 = new X.29V
            r1.<init>(r6, r2)
            r0 = 3
            X.XKX.LIZLLL(r4, r2, r2, r1, r0)
            kotlin.jvm.internal.IDqS416S0100000 r4 = new kotlin.jvm.internal.IDqS416S0100000
            r0 = 4
            r4.<init>(r6, r0)
            java.lang.Object r1 = X.C0OF.LIZJ
            monitor-enter(r1)
            java.util.List<X.Yns<java.lang.Object, X.UCe>> r0 = X.C0OF.LJII     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L41
            r0.add(r4)     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L44:
            monitor-exit(r1)
            X.1uo r0 = X.C48181uo.LJLIL
            X.C0OF.LJ(r0)
        L4a:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L94
            android.view.View r4 = r7.getChildAt(r5)
            boolean r0 = r4 instanceof X.C45211q1
            if (r0 == 0) goto L5c
            X.1q1 r4 = (X.C45211q1) r4
            if (r4 != 0) goto L72
        L5c:
            X.1q1 r4 = new X.1q1
            android.content.Context r1 = r7.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r4.<init>(r1)
            r4.getView()
            android.view.ViewGroup$LayoutParams r0 = X.C04S.LIZ
            r7.addView(r4, r0)
        L72:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto Laa
            java.util.Map r0 = X.C04O.LIZ(r4)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Laa
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r0)
            r0 = 2131368862(0x7f0a1b9e, float:1.8357686E38)
            r4.setTag(r0, r1)
            goto L98
        L94:
            r7.removeAllViews()
            goto L5c
        L98:
            java.lang.String r0 = "androidx.compose.ui.platform.g1"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Laa
            java.lang.String r0 = "isDebugInspectorInfoEnabled"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Exception -> Laa
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> Laa
            r0.setBoolean(r2, r3)     // Catch: java.lang.Exception -> Laa
        Laa:
            X.1iN r1 = new X.1iN
            X.1Dc r0 = r4.getRoot()
            r1.<init>(r0)
            X.1o3 r3 = X.C24330xR.LIZ(r1, r8)
            r4.getView()
            r2 = 2131380997(0x7f0a4b05, float:1.8382299E38)
            java.lang.Object r1 = r4.getTag(r2)
            boolean r0 = r1 instanceof androidx.compose.ui.platform.WrappedComposition
            if (r0 == 0) goto Lc9
            androidx.compose.ui.platform.WrappedComposition r1 = (androidx.compose.ui.platform.WrappedComposition) r1
            if (r1 != 0) goto Ld4
        Lc9:
            androidx.compose.ui.platform.WrappedComposition r1 = new androidx.compose.ui.platform.WrappedComposition
            r1.<init>(r4, r3)
            r4.getView()
            r4.setTag(r2, r1)
        Ld4:
            r1.LJIILJJIL(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04S.LIZ(X.04D, X.0yD, X.1iJ):X.0yB");
    }
}
