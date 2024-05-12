package X;

import com.bytedance.keva.Keva;
import java.util.Calendar;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class E6M<V> implements Callable {
    public static final E6M<V> LJLIL = new E6M<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Keva keva = E63.LIZ;
        int i = keva.getInt("active_days", 1);
        if (i < 15) {
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i2 = calendar.get(5);
            int i3 = calendar.get(2);
            int i4 = calendar.get(1);
            long j = keva.getLong("last_active_date", 0L);
            if (j == 0) {
                keva.storeLong("last_active_date", currentTimeMillis);
                keva.storeLong("active_days", 1L);
            } else {
                calendar.setTimeInMillis(j);
                int i5 = calendar.get(5);
                int i6 = calendar.get(2);
                int i7 = calendar.get(1);
                if (i5 != i2 || i6 != i3 || i7 != i4) {
                    keva.storeLong("last_active_date", currentTimeMillis);
                    keva.storeInt("active_days", i + 1);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
