package X;

/* renamed from: X.Eqi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37688Eqi {
    public static int LJII;
    public static int LJIIIIZZ;
    public volatile boolean LIZ;
    public final C37683Eqd LIZIZ = new C37683Eqd(this);
    public HandlerC37689Eqj LIZJ;
    public HandlerC37686Eqg LIZLLL;
    public HandlerC37687Eqh LJ;
    public Boolean LJFF;
    public int LJI;

    static {
        C16880lQ.LJLLJ(C37688Eqi.class);
        FAJ.LJI();
        LJIIIIZZ = 40;
    }

    public static boolean LIZ() {
        if (((Boolean) C35274Dss.LJI.getValue()).booleanValue() || FAJ.LJI()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[Catch: Exception -> 0x004a, TryCatch #1 {Exception -> 0x004a, blocks: (B:17:0x003b, B:19:0x0041), top: B:16:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.os.Handler r5, X.InterfaceC37690Eqk r6) {
        /*
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r4 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L24
            r0 = 23
            if (r1 < r0) goto L17
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()     // Catch: java.lang.Throwable -> L24
            android.os.MessageQueue r1 = r0.getQueue()     // Catch: java.lang.Throwable -> L24
            goto L25
        L17:
            android.os.Looper r1 = X.C16880lQ.LLJJJJ()     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "mQueue"
            java.lang.Object r1 = X.C36508EUm.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L24
            android.os.MessageQueue r1 = (android.os.MessageQueue) r1     // Catch: java.lang.Throwable -> L24
            goto L25
        L24:
            r1 = r4
        L25:
            java.lang.reflect.Field r0 = X.C36595EXv.LJFF     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L4e
            android.os.Message r2 = (android.os.Message) r2     // Catch: java.lang.Throwable -> L4e
        L2d:
            if (r2 == 0) goto L4e
            java.lang.reflect.Field r0 = X.C36595EXv.LIZJ     // Catch: java.lang.Exception -> L3a
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto L3a
            android.os.Message r1 = (android.os.Message) r1     // Catch: java.lang.Exception -> L3a
            goto L3b
        L3a:
            r1 = r4
        L3b:
            android.os.Handler r0 = r2.getTarget()     // Catch: java.lang.Exception -> L4a
            if (r0 != r5) goto L48
            android.os.Message r0 = android.os.Message.obtain(r2)     // Catch: java.lang.Exception -> L4a
            r3.offer(r0)     // Catch: java.lang.Exception -> L4a
        L48:
            r2 = r1
            goto L2d
        L4a:
            r0 = move-exception
            android.util.Log.getStackTraceString(r0)
        L4e:
            java.util.Iterator r2 = r3.iterator()
        L52:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r2.next()
            android.os.Message r0 = (android.os.Message) r0
            int r1 = r0.what
            java.lang.Object r0 = r0.obj
            r5.removeMessages(r1, r0)
            goto L52
        L66:
            r6.start()
        L69:
            java.lang.Object r2 = r3.poll()
            android.os.Message r2 = (android.os.Message) r2
            if (r2 == 0) goto L79
            long r0 = r2.getWhen()
            r6.LIZ(r2, r0)
            goto L69
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37688Eqi.LIZIZ(android.os.Handler, X.Eqk):void");
    }
}
