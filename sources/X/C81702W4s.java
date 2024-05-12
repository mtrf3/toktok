package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.W4s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81702W4s {
    public static C81700W4q LIZ(Throwable th) {
        C81700W4q c81700W4q = new C81700W4q();
        c81700W4q.LJIIJ(th);
        return c81700W4q;
    }

    public static <T> T LIZIZ(W4W<T> w4w) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C81704W4u c81704W4u = new C81704W4u();
        C81704W4u c81704W4u2 = new C81704W4u();
        w4w.LJ(new C81703W4t(c81704W4u, countDownLatch, c81704W4u2), new ExecutorC42306Gj0());
        countDownLatch.await();
        T t = c81704W4u2.LIZ;
        if (t == null) {
            return c81704W4u.LIZ;
        }
        throw ((Throwable) t);
    }
}
