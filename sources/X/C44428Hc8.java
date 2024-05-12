package X;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Hc8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44428Hc8 {
    public final AbstractC44430HcA LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public static C44428Hc8 LIZ() {
        C44428Hc8 c44428Hc8 = new C44428Hc8();
        c44428Hc8.LIZLLL();
        return c44428Hc8;
    }

    public final void LIZJ() {
        this.LIZJ = 0L;
        this.LIZIZ = false;
    }

    public final void LIZLLL() {
        C76917UGr.LJIIL("This stopwatch is already running.", !this.LIZIZ);
        this.LIZIZ = true;
        this.LIZLLL = this.LIZ.LIZ();
    }

    public final void LJ() {
        long LIZ = this.LIZ.LIZ();
        C76917UGr.LJIIL("This stopwatch is already stopped.", this.LIZIZ);
        this.LIZIZ = false;
        this.LIZJ = (LIZ - this.LIZLLL) + this.LIZJ;
    }

    public final String toString() {
        long j;
        String str;
        if (this.LIZIZ) {
            j = (this.LIZ.LIZ() - this.LIZLLL) + this.LIZJ;
        } else {
            j = this.LIZJ;
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(j, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(j, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(j, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(j, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(j, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        double convert = j / timeUnit2.convert(1L, timeUnit);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLLZI(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(convert)}));
        LIZ.append(" ");
        switch (C44429Hc9.LIZ[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public C44428Hc8() {
        this.LIZ = AbstractC44430HcA.LIZ;
    }

    public C44428Hc8(H6A h6a) {
        C76917UGr.LJII(h6a, "ticker");
        this.LIZ = h6a;
    }

    public final long LIZIZ(TimeUnit timeUnit) {
        long j;
        if (this.LIZIZ) {
            j = (this.LIZ.LIZ() - this.LIZLLL) + this.LIZJ;
        } else {
            j = this.LIZJ;
        }
        return timeUnit.convert(j, TimeUnit.NANOSECONDS);
    }
}
