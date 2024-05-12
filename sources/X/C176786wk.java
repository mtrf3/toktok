package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import kotlin.jvm.internal.o;

/* renamed from: X.6wk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176786wk {
    public static final HandlerC176806wm LIZ = new Handler() { // from class: X.6wm
        {
            C16880lQ.LLJJJJ();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message msg) {
            Long l;
            C176796wl c176796wl;
            long j;
            InterfaceC174196sZ interfaceC174196sZ;
            int i;
            o.LJIIIZ(msg, "msg");
            super.handleMessage(msg);
            if (msg.what == 0) {
                Bundle data = msg.getData();
                if (data != null) {
                    l = Long.valueOf(data.getLong("key_finish_ts"));
                } else {
                    l = null;
                }
                if (C178446zQ.LIZ) {
                    if (C36531EVj.LJFF) {
                        C35810E3q.LJIIL();
                    }
                    C35810E3q.LJIILJJIL();
                }
                if (l == null || (c176796wl = C176786wk.LIZIZ) == null) {
                    return;
                }
                c176796wl.LJII = l.longValue();
                C176796wl c176796wl2 = C176786wk.LIZIZ;
                o.LJI(c176796wl2);
                if (c176796wl2.LIZIZ() < 0) {
                    return;
                }
                C176796wl c176796wl3 = C176786wk.LIZIZ;
                o.LJI(c176796wl3);
                if (c176796wl3.LIZ() < 0) {
                    return;
                }
                C176796wl c176796wl4 = C176786wk.LIZIZ;
                o.LJI(c176796wl4);
                if (c176796wl4.LIZLLL() < 0) {
                    return;
                }
                C176796wl c176796wl5 = C176786wk.LIZIZ;
                if (c176796wl5 != null && (interfaceC174196sZ = c176796wl5.LJIIIIZZ) != null) {
                    long LIZJ = c176796wl5.LIZJ();
                    C176796wl c176796wl6 = C176786wk.LIZIZ;
                    if (c176796wl6 != null) {
                        i = c176796wl6.LIZLLL;
                    } else {
                        i = 0;
                    }
                    interfaceC174196sZ.C9(i, LIZJ, true);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("CommentPageLoadTimer: finishRecord(): duration = ");
                C176796wl c176796wl7 = C176786wk.LIZIZ;
                if (c176796wl7 != null) {
                    j = c176796wl7.LIZJ();
                } else {
                    j = -1;
                }
                LIZ2.append(j);
                C176186vm.LIZ(X1D.LIZIZ(LIZ2));
                C176786wk.LIZLLL();
                C176786wk.LIZIZ = null;
            }
        }
    };
    public static C176796wl LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:21:0x0048, B:23:0x004e, B:24:0x0054, B:26:0x005d, B:27:0x0063, B:29:0x006c, B:32:0x0076, B:34:0x007f, B:35:0x0083, B:37:0x008c, B:38:0x0094, B:40:0x009d, B:41:0x00a5, B:43:0x00ae, B:44:0x00b6), top: B:20:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:21:0x0048, B:23:0x004e, B:24:0x0054, B:26:0x005d, B:27:0x0063, B:29:0x006c, B:32:0x0076, B:34:0x007f, B:35:0x0083, B:37:0x008c, B:38:0x0094, B:40:0x009d, B:41:0x00a5, B:43:0x00ae, B:44:0x00b6), top: B:20:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:21:0x0048, B:23:0x004e, B:24:0x0054, B:26:0x005d, B:27:0x0063, B:29:0x006c, B:32:0x0076, B:34:0x007f, B:35:0x0083, B:37:0x008c, B:38:0x0094, B:40:0x009d, B:41:0x00a5, B:43:0x00ae, B:44:0x00b6), top: B:20:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:21:0x0048, B:23:0x004e, B:24:0x0054, B:26:0x005d, B:27:0x0063, B:29:0x006c, B:32:0x0076, B:34:0x007f, B:35:0x0083, B:37:0x008c, B:38:0x0094, B:40:0x009d, B:41:0x00a5, B:43:0x00ae, B:44:0x00b6), top: B:20:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176786wk.LIZLLL():void");
    }

    public static final void LIZIZ(int i) {
        InterfaceC174196sZ interfaceC174196sZ;
        C176796wl c176796wl = LIZIZ;
        if (c176796wl == null) {
            return;
        }
        c176796wl.LJI = System.currentTimeMillis();
        C176796wl c176796wl2 = LIZIZ;
        if (c176796wl2 != null) {
            c176796wl2.LIZLLL = i;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CommentPageLoadTimer: onDataLoadSuccess(), commentCount = ");
        LIZ2.append(i);
        C176186vm.LIZ(X1D.LIZIZ(LIZ2));
        if (i == 0) {
            C176796wl c176796wl3 = LIZIZ;
            if (c176796wl3 != null && (interfaceC174196sZ = c176796wl3.LJIIIIZZ) != null) {
                interfaceC174196sZ.C9(i, c176796wl3.LIZJ(), true);
            }
            LIZLLL();
            LIZIZ = null;
        }
    }

    public static final void LIZ(boolean z, String str, C176816wn c176816wn) {
        C186577Tx.LIZIZ.LIZ = System.currentTimeMillis();
        C54502LaE.LIZ("comment");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CommentPageLoadTimer: beginRecord(): isFirstShow = ");
        LIZ2.append(z);
        LIZ2.append(", eventType=");
        LIZ2.append(str);
        C176186vm.LIZ(X1D.LIZIZ(LIZ2));
        LIZ.removeCallbacksAndMessages(null);
        LIZIZ = new C176796wl(z, str, System.currentTimeMillis(), c176816wn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(int r7, java.lang.String r8, boolean r9) {
        /*
            java.lang.String r0 = "enterFrom"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.6wl r3 = X.C176786wk.LIZIZ
            r2 = 0
            if (r3 == 0) goto L98
            boolean r1 = r3.LJIIIZ
            r0 = 1
            if (r1 != r0) goto L98
            r3.LJIIIZ = r2
            java.lang.String r4 = "page_load_time"
            boolean r0 = X.FMX.LIZJ(r4)
            java.lang.String r5 = "enter_from"
            if (r0 == 0) goto L7b
            X.7au r6 = new X.7au
            r6.<init>()
            java.lang.String r1 = "page_type"
            java.lang.String r0 = "comment"
            r6.LJIIIZ(r1, r0)
            java.lang.String r0 = "result"
            r6.LIZLLL(r7, r0)
            r6.LJIIIZ(r5, r8)
            if (r9 != 0) goto La2
            X.6wl r0 = X.C176786wk.LIZIZ
            if (r0 == 0) goto Lae
            long r2 = r0.LIZJ()
        L39:
            java.lang.String r0 = "duration"
            r6.LJ(r2, r0)
            X.6wl r0 = X.C176786wk.LIZIZ
            if (r0 == 0) goto L9f
            long r0 = r0.LIZ()
        L46:
            java.lang.String r2 = "duration_before_network"
            r6.LJ(r0, r2)
            if (r9 != 0) goto L9c
            X.6wl r0 = X.C176786wk.LIZIZ
            if (r0 == 0) goto L9c
            long r0 = r0.LIZIZ()
        L55:
            java.lang.String r2 = "duration_network"
            r6.LJ(r0, r2)
            if (r9 != 0) goto L99
            X.6wl r0 = X.C176786wk.LIZIZ
            if (r0 == 0) goto L99
            long r0 = r0.LIZLLL()
        L64:
            java.lang.String r2 = "duration_after_network"
            r6.LJ(r0, r2)
            boolean r0 = X.C176096vd.LIZIZ()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_poor_network"
            r6.LJFF(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.LIZ
            X.FMX.LJIIL(r4, r0)
        L7b:
            X.6wl r0 = X.C176786wk.LIZIZ
            if (r0 == 0) goto L89
            long r3 = r0.LIZLLL()
            r1 = 100
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L98
        L89:
            X.7au r0 = new X.7au
            r0.<init>()
            r0.LJIIIZ(r5, r8)
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LIZ
            java.lang.String r0 = "key_net_preload"
            X.FMX.LJIIL(r0, r1)
        L98:
            return
        L99:
            r0 = -1
            goto L64
        L9c:
            r0 = -1
            goto L55
        L9f:
            r0 = -1
            goto L46
        La2:
            X.6wl r0 = X.C176786wk.LIZIZ
            if (r0 == 0) goto Lae
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0.LJ
            long r2 = r2 - r0
            goto L39
        Lae:
            r2 = -1
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176786wk.LIZJ(int, java.lang.String, boolean):void");
    }
}
