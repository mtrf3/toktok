package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.FSs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ThreadFactoryC39010FSs implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setPriority(10);
        return newThread;
    }
}
