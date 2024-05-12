package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68762mu {
    public long LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public long LJFF;
    public long LJI;
    public XKQ LJII;
    public long LIZ = -1;
    public final List<InterfaceC88473Ynt<Integer, Integer, Long, C76800UCe>> LJ = new ArrayList();

    public final void LIZ() {
        ((ArrayList) this.LJ).clear();
        XKQ xkq = this.LJII;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJII = null;
        this.LIZJ = 0;
    }

    public static void LIZJ(C68762mu c68762mu) {
        XKQ xkq = c68762mu.LJII;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        c68762mu.LJII = null;
        try {
            c68762mu.LIZ = c68762mu.LJI - c68762mu.LIZIZ;
            c68762mu.LJII = XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZJ), null, null, new C68752mt(c68762mu, 1000L, null), 3);
        } catch (Exception unused) {
        }
    }

    public final void LIZIZ(C68772mv c68772mv) {
        XKQ xkq = this.LJII;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJII = null;
        try {
            long j = c68772mv.LIZ;
            long j2 = c68772mv.LIZIZ;
            long j3 = c68772mv.LIZJ;
            if (j3 <= 0) {
                j3 = SystemClock.elapsedRealtime();
            }
            long j4 = c68772mv.LIZLLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setCountDownTime startTime = ");
            LIZ.append(j);
            LIZ.append(" , endTime = ");
            LIZ.append(j2);
            LIZ.append(" , createTime = ");
            LIZ.append(j3);
            LIZ.append(" , serverTime = ");
            LIZ.append(j4);
            int i = 4;
            C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
            this.LJFF = (j - j4) + j3;
            this.LJI = (j2 - j4) + j3;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.LIZIZ = elapsedRealtime;
            long j5 = this.LJI;
            this.LIZ = j5 - elapsedRealtime;
            if (this.LJFF <= elapsedRealtime && elapsedRealtime < j5) {
                i = 2;
            } else if (elapsedRealtime >= j5) {
                i = 3;
            }
            this.LIZJ = i;
            this.LIZLLL = i;
        } catch (Exception unused) {
        }
    }
}
