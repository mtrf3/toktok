package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.JbW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ThreadFactoryC49486JbW implements ThreadFactory {
    public final /* synthetic */ C49485JbV LJLIL;

    public ThreadFactoryC49486JbW(C49485JbV c49485JbV) {
        this.LJLIL = c49485JbV;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PowerList-");
        LIZ.append(this.LJLIL.LJLJJI.incrementAndGet());
        return new C49487JbX(runnable, X1D.LIZIZ(LIZ));
    }
}
