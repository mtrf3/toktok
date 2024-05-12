package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.Fvw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40560Fvw {
    public static <ResultT> C40561Fvx LIZ(ResultT resultt) {
        C40561Fvx c40561Fvx = new C40561Fvx();
        synchronized (c40561Fvx.LIZ) {
            if (!c40561Fvx.LIZJ) {
                c40561Fvx.LIZJ = true;
                c40561Fvx.LIZLLL = resultt;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        c40561Fvx.LIZIZ.LIZ(c40561Fvx);
        return c40561Fvx;
    }

    public static <ResultT> ResultT LIZIZ(C40561Fvx c40561Fvx) {
        boolean z;
        if (c40561Fvx != null) {
            synchronized (c40561Fvx.LIZ) {
                z = c40561Fvx.LIZJ;
            }
            if (z) {
                if (c40561Fvx.LJI()) {
                    return (ResultT) c40561Fvx.LJFF();
                }
                throw new ExecutionException(c40561Fvx.LJ());
            }
            C40562Fvy c40562Fvy = new C40562Fvy();
            Executor executor = C38410F5q.LIZIZ;
            c40561Fvx.LIZJ(executor, c40562Fvy);
            c40561Fvx.LIZIZ(executor, c40562Fvy);
            c40562Fvy.LJLIL.await();
            if (c40561Fvx.LJI()) {
                return (ResultT) c40561Fvx.LJFF();
            }
            throw new ExecutionException(c40561Fvx.LJ());
        }
        throw new NullPointerException("Task must not be null");
    }
}
