package X;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* loaded from: classes7.dex */
public abstract class FWI {
    public final int LIZ;

    public FWI() {
        this(5);
    }

    public abstract C36821Ecj<Long> LIZIZ();

    public FWI(int i) {
        this.LIZ = i;
    }

    public final boolean LIZ(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(11);
        if (i >= 0 && i < this.LIZ) {
            calendar.add(5, -1);
        }
        calendar.set(11, this.LIZ);
        calendar.set(12, 0);
        calendar.set(13, 0);
        long timeInMillis = calendar.getTimeInMillis();
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(calendar.getTime());
        if (LIZIZ().LIZ().longValue() >= timeInMillis) {
            return false;
        }
        return true;
    }

    public final void LIZJ(long j) {
        LIZIZ().LIZLLL(Long.valueOf(j));
    }
}
