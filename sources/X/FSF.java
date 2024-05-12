package X;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public interface FSF extends ExecutorService {
    <T> C76L<T> submit(Callable<T> callable);
}
