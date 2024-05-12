package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.FSt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ThreadFactoryC39011FSt implements ThreadFactory {
    public final ThreadFactory LJLIL = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.LJLIL.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
