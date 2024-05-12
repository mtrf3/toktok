package X;

import java.util.concurrent.Executor;

/* renamed from: X.VKv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79573VKv extends C79570VKs {
    public C79573VKv(Executor executor) {
        super("FixSizeSerialExecutor", executor, new C48282IxC());
    }

    @Override // X.C79570VKs, java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
