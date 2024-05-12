package X;

import android.content.Context;
import android.view.Surface;
import com.ss.ttm.player.TTPlayer;
import com.ss.ttm.player.TTPlayerClient;
import com.ss.ttm.player.u;
import java.util.Locale;

/* renamed from: X.IzV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48425IzV extends QZV {
    public static String LJ;
    public static String LJFF;
    public static boolean LJI;
    public final long LIZ = System.currentTimeMillis();
    public TTPlayer LIZIZ;
    public TTPlayerClient LIZJ;
    public final Context LIZLLL;

    static {
        C16880lQ.LJLLJ(C48425IzV.class);
        LJ = null;
        LJFF = null;
        LJI = false;
    }

    public C48425IzV(Context context) {
        this.LIZLLL = context;
    }

    public final void LJJ(long j) {
        this.LIZIZ.LJJIIJ(j);
    }

    public final void LJJI(Surface surface) {
        this.LIZIZ.LJJIJ(surface);
    }

    public final int LJIJJ(int i, int i2) {
        return this.LIZIZ.LIZLLL(i, i2);
    }

    public final void LJIJJLI(int i, int i2, String str) {
        TTPlayerClient tTPlayerClient = this.LIZJ;
        tTPlayerClient.getClass();
        if (i == 2) {
            if (i2 == 1) {
                tTPlayerClient.LLD = str;
                return;
            } else {
                if (i2 != 0) {
                    return;
                }
                tTPlayerClient.LL = str;
                return;
            }
        }
        if (i == 0) {
            tTPlayerClient.LJZ = i2;
        }
        if (str == null) {
            return;
        }
        if (tTPlayerClient.LJLJLJ.size() > 40) {
            tTPlayerClient.LJLJLJ.removeFirst();
        }
        tTPlayerClient.LJLJLJ.addLast(C16880lQ.LLLZI(Locale.US, "%s&&time:%d", new Object[]{str, Long.valueOf(System.currentTimeMillis())}));
    }

    public static final synchronized C48425IzV LJIJI(TTPlayerClient tTPlayerClient, Context context, int i, int i2) {
        C48425IzV c48425IzV;
        RuntimeException runtimeException;
        synchronized (C48425IzV.class) {
            if (LJ == null) {
                if (context != null && u.LIZ == null) {
                    u.LIZ = C16880lQ.LLIIJLIL(C16880lQ.LLLLL(context)).getAbsolutePath();
                }
                String str = u.LIZ;
                if (str == null) {
                    if (context != null) {
                        try {
                            str = C16880lQ.LLIIJLIL(C16880lQ.LLLLL(context)).getAbsolutePath();
                            u.LIZ = str;
                        } catch (Exception unused) {
                        }
                    }
                    str = null;
                }
                LJ = str;
                try {
                    if (TTPlayer.LJI == null) {
                        TTPlayer.LJI = LJ;
                    }
                } catch (UnsatisfiedLinkError e) {
                    LJFF = e.getMessage();
                }
            }
            if (LJFF == null) {
                if (!LJI) {
                    TTPlayer._setGlobalIntForKey(1015, u.LIZIZ(31, 0));
                    TTPlayer._setGlobalIntForKey(1016, u.LIZIZ(32, 0));
                }
                LJI = true;
                c48425IzV = new C48425IzV(context);
                c48425IzV.LIZJ = tTPlayerClient;
                try {
                    TTPlayer tTPlayer = new TTPlayer(i, i2, c48425IzV.LIZ, context);
                    c48425IzV.LIZIZ = tTPlayer;
                    tTPlayer.LIZIZ = c48425IzV;
                } finally {
                }
            } else {
                throw new UnsatisfiedLinkError(LJFF);
            }
        }
        return c48425IzV;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r8 != 3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(int r7, int r8, int r9, java.lang.String r10) {
        /*
            r6 = this;
            com.ss.ttm.player.TTPlayerClient r5 = r6.LIZJ
            r4 = 3
            if (r8 == r4) goto L1f
            r5.getClass()
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "onPlayerNotify send message start .thread id:"
            r2.append(r0)
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            long r0 = r0.getId()
            r2.append(r0)
            X.X1D.LIZIZ(r2)
        L1f:
            java.lang.Object r3 = r5.LJLLJ
            monitor-enter(r3)
            android.os.Handler r0 = r5.LLFII     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L3f
            java.lang.StringBuilder r2 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "onPlayerNotify send message play is null:thread id"
            r2.append(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()     // Catch: java.lang.Throwable -> L89
            long r0 = r0.getId()     // Catch: java.lang.Throwable -> L89
            r2.append(r0)     // Catch: java.lang.Throwable -> L89
            X.X1D.LIZIZ(r2)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L89
            goto L88
        L3f:
            r0 = 40
            if (r8 != r0) goto L4a
            if (r10 == 0) goto L4c
            r5.LJJJJL(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L89
            goto L88
        L4a:
            if (r8 == r4) goto L63
        L4c:
            java.lang.StringBuilder r2 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "onPlayerNotify send message prev.thread id:"
            r2.append(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()     // Catch: java.lang.Throwable -> L89
            long r0 = r0.getId()     // Catch: java.lang.Throwable -> L89
            r2.append(r0)     // Catch: java.lang.Throwable -> L89
            X.X1D.LIZIZ(r2)     // Catch: java.lang.Throwable -> L89
        L63:
            android.os.Handler r0 = r5.LLFII     // Catch: java.lang.Throwable -> L89
            android.os.Message r0 = r0.obtainMessage(r8, r9, r7)     // Catch: java.lang.Throwable -> L89
            r0.obj = r10     // Catch: java.lang.Throwable -> L89
            r0.sendToTarget()     // Catch: java.lang.Throwable -> L89
            if (r8 == r4) goto L87
            java.lang.StringBuilder r2 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "onPlayerNotify send message after.thread id:"
            r2.append(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()     // Catch: java.lang.Throwable -> L89
            long r0 = r0.getId()     // Catch: java.lang.Throwable -> L89
            r2.append(r0)     // Catch: java.lang.Throwable -> L89
            X.X1D.LIZIZ(r2)     // Catch: java.lang.Throwable -> L89
        L87:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L89
        L88:
            return
        L89:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L89
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48425IzV.LJIL(int, int, int, java.lang.String):void");
    }
}
