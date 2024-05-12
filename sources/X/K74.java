package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public enum K74 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);

    public final TimeUnit LJLIL;

    public static K74 valueOf(String str) {
        return (K74) V0N.LJJJ(K74.class, str);
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.LJLIL;
    }

    K74(TimeUnit timeUnit) {
        this.LJLIL = timeUnit;
    }
}
