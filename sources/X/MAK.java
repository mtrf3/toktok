package X;

/* loaded from: classes10.dex */
public final class MAK {
    public static volatile boolean LIZ;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r7) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            boolean r0 = X.MAK.LIZ
            if (r0 == 0) goto La
            return
        La:
            r2 = 1
            X.MAK.LIZ = r2
            com.ss.android.ugc.aweme.IAccountUserService r1 = X.HG3.LJIILL()
            X.MAL r0 = X.MAL.LJLIL
            X.RBX r1 = (X.RBX) r1
            r1.addUserChangeListener(r0)
            X.T06 r1 = X.C84763XOl.LJI()
            X.MAM<T> r0 = X.MAM.LJLIL
            r1.LJJJJZI(r0)
            java.lang.String r0 = "init"
            X.MCI.LJ(r0)
            boolean r6 = LIZ(r7, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto Lab
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r7.getSystemService(r0)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            r0 = 4
            java.util.List r0 = r1.getShortcuts(r0)
            java.util.List r1 = X.C0MR.LIZ(r7, r0)
        L41:
            java.lang.String r0 = "getShortcuts(context, FLAG_MATCH_PINNED)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = r1.isEmpty()
            java.lang.String r3 = "now_shortcut"
            if (r0 == 0) goto L91
        L4e:
            r5 = 0
        L4f:
            X.MAN r0 = X.MAN.LIZIZ
            boolean r0 = r0.LJFF(r5)
            r4 = 5
            if (r0 != 0) goto L89
            if (r5 == 0) goto L75
            X.7au r3 = new X.7au
            r3.<init>()
            java.lang.String r1 = "widget_kind"
            java.lang.String r0 = "now"
            r3.LJIIIZ(r1, r0)
            java.lang.String r0 = "widget_size"
            r3.LIZLLL(r4, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "widget_added"
            X.FMX.LJIIL(r0, r1)
        L72:
            X.MAJ.LIZ(r4)
        L75:
            if (r6 != 0) goto L79
            if (r5 == 0) goto L87
        L79:
            java.lang.String r0 = "has_widget"
            X.7au r0 = X.C78920UyC.LIZJ(r2, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZ
            java.lang.String r0 = "launch_widget_info"
            X.FMX.LJIIL(r0, r1)
            return
        L87:
            r2 = 0
            goto L79
        L89:
            if (r5 != 0) goto L72
            java.lang.String r0 = "deleted"
            X.C56374MAo.LJ(r0, r3)
            goto L75
        L91:
            java.util.Iterator r1 = r1.iterator()
        L95:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r1.next()
            X.0MR r0 = (X.C0MR) r0
            java.lang.String r0 = r0.LIZIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 == 0) goto L95
            r5 = 1
            goto L4f
        Lab:
            r0 = 25
            if (r1 < r0) goto Lc9
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r7.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r0 = r0.getPinnedShortcuts()
            r1.addAll(r0)
            java.util.List r1 = X.C0MR.LIZ(r7, r1)
            goto L41
        Lc9:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MAK.LIZIZ(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.content.Context r9, boolean r10) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            android.appwidget.AppWidgetManager r2 = android.appwidget.AppWidgetManager.getInstance(r9)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<com.ss.android.ugc.aweme.core.SmallAppWidgetProvider> r0 = com.ss.android.ugc.aweme.core.SmallAppWidgetProvider.class
            r1.<init>(r9, r0)
            int[] r8 = r2.getAppWidgetIds(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<X.MCG> r0 = X.MCG.class
            r1.<init>(r9, r0)
            int[] r7 = r2.getAppWidgetIds(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<X.MCN> r0 = X.MCN.class
            r1.<init>(r9, r0)
            int[] r6 = r2.getAppWidgetIds(r1)
            java.lang.String r0 = "smallWidgetIds"
            kotlin.jvm.internal.o.LJIIIIZZ(r8, r0)
            int r0 = r8.length
            r5 = 0
            r4 = 1
            if (r0 != 0) goto L70
            r0 = 1
        L35:
            r0 = r0 ^ 1
            java.lang.String r3 = "largeWidgetIds"
            java.lang.String r2 = "mediumWidgetIds"
            if (r0 != 0) goto L6e
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r2)
            int r0 = r7.length
            if (r0 != 0) goto L6e
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r3)
            int r0 = r6.length
            if (r0 != 0) goto L6e
            r1 = 0
        L4a:
            X.MAN r0 = X.MAN.LIZIZ
            r0.LJII(r1)
            if (r10 == 0) goto L60
            int r0 = r8.length
            if (r0 != 0) goto L6a
        L54:
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r2)
            int r0 = r7.length
            if (r0 != 0) goto L66
        L5a:
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r3)
            int r0 = r6.length
            if (r0 != 0) goto L61
        L60:
            return r1
        L61:
            r0 = 2
            X.MAJ.LIZ(r0)
            goto L60
        L66:
            X.MAJ.LIZ(r4)
            goto L5a
        L6a:
            X.MAJ.LIZ(r5)
            goto L54
        L6e:
            r1 = 1
            goto L4a
        L70:
            r0 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MAK.LIZ(android.content.Context, boolean):boolean");
    }
}
