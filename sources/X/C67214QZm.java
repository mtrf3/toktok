package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.QZm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67214QZm implements InterfaceC31063CHb {
    public final /* synthetic */ C67213QZl LIZ;

    public C67214QZm(C67213QZl c67213QZl) {
        this.LIZ = c67213QZl;
    }

    @Override // X.InterfaceC31063CHb
    public final void LIZ(long j, String str) {
        if (o.LJ(this.LIZ.LIZ, str) && this.LIZ.LIZJ) {
            C67215QZn c67215QZn = (C67215QZn) this.LIZ.LIZLLL.getValue();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c67215QZn.getClass();
            long j2 = elapsedRealtime / 1000;
            int i = ((int) j) / ((int) (c67215QZn.LIZ * 100));
            int i2 = c67215QZn.LIZIZ;
            if (i > i2) {
                i = i2;
            }
            long j3 = c67215QZn.LJ;
            if (j3 == j2) {
                c67215QZn.LIZJ[c67215QZn.LIZLLL].getClass();
                C67216QZo c67216QZo = c67215QZn.LIZJ[c67215QZn.LIZLLL];
                int i3 = c67216QZo.LIZIZ;
                int i4 = c67215QZn.LIZIZ;
                if (i > i4) {
                    i = i4;
                }
                c67216QZo.LIZIZ = i3 + i;
                c67215QZn.LIZJ[c67215QZn.LIZLLL].LIZ = j2;
                if (c67215QZn.LIZJ[c67215QZn.LIZLLL].LIZIZ < 2) {
                    c67215QZn.LIZJ[c67215QZn.LIZLLL].LIZJ = 40.0f;
                } else {
                    c67215QZn.LIZJ[c67215QZn.LIZLLL].LIZJ = c67215QZn.LIZIZ - r6.LIZIZ;
                }
            } else if (j2 > j3) {
                c67215QZn.LIZLLL = (c67215QZn.LIZLLL + 1) % 60;
                c67215QZn.LIZJ[c67215QZn.LIZLLL].LIZIZ = i;
                c67215QZn.LIZJ[c67215QZn.LIZLLL].getClass();
                c67215QZn.LIZJ[c67215QZn.LIZLLL].LIZ = j2;
                c67215QZn.LIZJ[c67215QZn.LIZLLL].LIZJ = c67215QZn.LIZIZ / (i + 1);
            }
            c67215QZn.LJ = j2;
        }
    }
}
