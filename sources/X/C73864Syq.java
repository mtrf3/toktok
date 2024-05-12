package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Syq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73864Syq {
    public static final C73863Syp LIZ = new C73863Syp();

    public static RuntimeException LIZIZ(Throwable th) {
        if (!(th instanceof Error)) {
            if (th instanceof RuntimeException) {
                return (RuntimeException) th;
            }
            return new RuntimeException(th);
        }
        throw th;
    }

    public static String LIZ(long j, TimeUnit timeUnit) {
        StringBuilder LIZJ = V10.LIZJ("The source did not signal an event for ", j, " ");
        LIZJ.append(timeUnit.toString().toLowerCase());
        LIZJ.append(" and has been terminated.");
        return X1D.LIZIZ(LIZJ);
    }
}
