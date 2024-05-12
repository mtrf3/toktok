package X;

import java.util.concurrent.Executor;

/* renamed from: X.PNd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64345PNd implements W87 {
    public final Executor LIZIZ;
    public final Executor LIZJ;
    public final Executor LIZ = C16880lQ.LLLLZI(2, new ThreadFactoryC64344PNc("FrescoIoBoundExecutor"));
    public final Executor LIZLLL = C16880lQ.LLLLZI(1, new ThreadFactoryC64344PNc("FrescoLightWeightBackgroundExecutor"));

    @Override // X.W87
    public final Executor LIZ() {
        return this.LIZJ;
    }

    @Override // X.W87
    public final Executor LIZIZ() {
        return this.LIZ;
    }

    @Override // X.W87
    public final Executor LIZJ() {
        return this.LIZ;
    }

    @Override // X.W87
    public final Executor LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.W87
    public final Executor LJ() {
        return this.LIZIZ;
    }

    public C64345PNd(int i) {
        this.LIZIZ = C16880lQ.LLLLZI(i, new ThreadFactoryC64344PNc("FrescoDecodeExecutor"));
        this.LIZJ = C16880lQ.LLLLZI(i, new ThreadFactoryC64344PNc("FrescoBackgroundExecutor"));
    }
}
