package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OiT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62657OiT {
    public static final C5H3 LIZ;
    public static final C5H3 LIZIZ;
    public static final C5H3 LIZJ;
    public static final C5H3 LIZLLL;

    static {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        LIZ = C221108m2.LIZ(enumC221088m0, C62661OiX.LJLIL);
        LIZIZ = C221108m2.LIZ(enumC221088m0, C62658OiU.LJLIL);
        LIZJ = C221108m2.LIZ(enumC221088m0, C62660OiW.LJLIL);
        LIZLLL = C221108m2.LIZ(enumC221088m0, C62659OiV.LJLIL);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(2:2|3)|(17:7|(1:66)(1:11)|12|(2:15|13)|16|17|(4:20|(1:22)(0)|23|18)|64|65|23|24|(6:28|(1:60)(1:32)|33|(3:36|(2:38|(1:49)(1:46))(3:55|56|57)|34)|58|59)|62|33|(1:34)|58|59)|68|12|(1:13)|16|17|(1:18)|64|65|23|24|(8:26|28|(1:30)|60|33|(1:34)|58|59)|62|33|(1:34)|58|59) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[LOOP:0: B:13:0x004b->B:15:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.app.Activity r9) {
        /*
            android.view.Window r0 = r9.getWindow()
            android.view.View r3 = r0.getDecorView()
            java.lang.String r0 = "activity.window.decorView"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            android.os.IBinder r7 = r3.getWindowToken()
            r9 = 0
            X.5H3 r0 = X.C62657OiT.LIZIZ     // Catch: java.lang.Exception -> L37
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L37
            if (r1 == 0) goto L37
            X.5H3 r0 = X.C62657OiT.LIZJ     // Catch: java.lang.Exception -> L37
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L37
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L37
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Exception -> L37
            boolean r0 = r1 instanceof java.util.ArrayList     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L31
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Exception -> L37
            if (r1 == 0) goto L31
            goto L3c
        L31:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L37
            r1.<init>()     // Catch: java.lang.Exception -> L37
            goto L3c
        L37:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L3c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L4b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L4b
        L59:
            java.util.List r0 = X.ORZ.LLJI(r2)
            java.util.Iterator r1 = r0.iterator()
            r8 = 0
            r6 = 0
        L63:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r1.next()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 == 0) goto L74
            goto L78
        L74:
            int r6 = r6 + 1
            goto L63
        L77:
            r6 = -1
        L78:
            X.5H3 r0 = X.C62657OiT.LIZIZ     // Catch: java.lang.Exception -> L9d
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L9d
            if (r1 == 0) goto L9d
            X.5H3 r0 = X.C62657OiT.LIZLLL     // Catch: java.lang.Exception -> L9d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L9d
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L9d
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Exception -> L9d
            boolean r0 = r1 instanceof java.util.ArrayList     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L97
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Exception -> L9d
            if (r1 == 0) goto L97
            goto La2
        L97:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L9d
            r1.<init>()     // Catch: java.lang.Exception -> L9d
            goto La2
        L9d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        La2:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r6)
            android.view.WindowManager$LayoutParams r0 = (android.view.WindowManager.LayoutParams) r0
            android.os.IBinder r5 = r0.token
            java.util.Iterator r4 = r1.iterator()
            r3 = 0
        Laf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Ld9
            java.lang.Object r0 = r4.next()
            int r2 = r3 + 1
            if (r3 < 0) goto Ld5
            android.view.WindowManager$LayoutParams r0 = (android.view.WindowManager.LayoutParams) r0
            android.os.IBinder r1 = r0.token
            if (r3 == r6) goto Ld3
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r7)
            if (r0 != 0) goto Ld1
            if (r1 == 0) goto Ld1
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r5)
            if (r0 == 0) goto Ld3
        Ld1:
            r0 = 1
            return r0
        Ld3:
            r3 = r2
            goto Laf
        Ld5:
            X.C47261Igj.LJJJJJ()
            throw r9
        Ld9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62657OiT.LIZ(android.app.Activity):boolean");
    }

    public static void LIZIZ(String msg) {
        o.LJIIIZ(msg, "msg");
        C36922EeM.LIZLLL(4, "ScreenShot", msg);
    }
}
