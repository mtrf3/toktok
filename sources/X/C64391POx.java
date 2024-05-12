package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.POx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64391POx {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final SimpleDateFormat LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64391POx)) {
            return false;
        }
        C64391POx c64391POx = (C64391POx) obj;
        return o.LJ(this.LIZ, c64391POx.LIZ) && this.LIZIZ == c64391POx.LIZIZ && o.LJ(this.LIZJ, c64391POx.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Monitor step: ");
        LIZ.append(this.LIZ);
        LIZ.append(" \nTimes : ");
        LIZ.append(this.LIZLLL.format(new Date(this.LIZIZ)));
        LIZ.append(" \nExtra Info: ");
        return JBR.LJFF(LIZ, this.LIZJ, " \n", LIZ);
    }

    public C64391POx(String str, long j, String info) {
        o.LJIIIZ(info, "info");
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = info;
        this.LIZLLL = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    }
}
