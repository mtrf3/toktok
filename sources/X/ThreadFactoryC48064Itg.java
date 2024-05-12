package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.Itg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ThreadFactoryC48064Itg implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        C48065Ith c48065Ith = new C48065Ith(runnable);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("video-preload-");
        LIZ.append(c48065Ith.getId());
        c48065Ith.setName(X1D.LIZIZ(LIZ));
        c48065Ith.setDaemon(true);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("new preload thead: ");
        LIZ2.append(c48065Ith.getName());
        C48841JEv.LJIILIIL("TAG_PROXY_Preloader", X1D.LIZIZ(LIZ2), null);
        return c48065Ith;
    }
}
