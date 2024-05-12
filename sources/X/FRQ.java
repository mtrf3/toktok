package X;

import com.ss.android.ugc.aweme.feed.cache.ForegroundFeedCacheTask;

/* loaded from: classes7.dex */
public final class FRQ<TTaskResult, TContinuationResult> implements C10I {
    public static final FRQ<TTaskResult, TContinuationResult> LIZ = new FRQ<>();

    @Override // X.C10I
    public final Object then(C10K<Void> c10k) {
        InterfaceC46732IVs LIZ2 = C47242IgQ.LIZ();
        if (LIZ2 != null) {
            LIZ2.LJIILIIL();
        }
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZIZ(new ForegroundFeedCacheTask(EFK.IDLE), true);
        LIZJ.LIZJ();
        return null;
    }
}
