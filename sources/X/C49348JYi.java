package X;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.JYi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49348JYi {
    public final InterfaceC88474Ynu<Integer, Integer, Integer, Boolean, Boolean> LIZ;
    public final ExecutorService LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C49348JYi(InterfaceC88474Ynu<? super Integer, ? super Integer, ? super Integer, ? super Boolean, Boolean> rejectAddTask, ExecutorService executor, String str) {
        o.LJIIIZ(rejectAddTask, "rejectAddTask");
        o.LJIIIZ(executor, "executor");
        this.LIZ = rejectAddTask;
        this.LIZIZ = executor;
    }
}
