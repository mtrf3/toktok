package X;

import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;

/* renamed from: X.Go8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42624Go8<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ InterfaceC73573Su9<SuggestMusicList> LIZ;
    public final /* synthetic */ long LIZIZ;

    public C42624Go8(C73433Srt c73433Srt, long j) {
        this.LIZ = c73433Srt;
        this.LIZIZ = j;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        if (!c10k.LJIILJJIL() && c10k.LJIILIIL()) {
            if (c10k.LJIIJJI() != null) {
                this.LIZ.onNext(c10k.LJIIJJI());
                C42622Go6.LJIIL(this.LIZIZ, true);
            } else {
                this.LIZ.onError(new IllegalStateException("Result is null"));
                C42622Go6.LJIIL(this.LIZIZ, false);
            }
        } else {
            this.LIZ.onError(new IllegalStateException("Result is null"));
            C42622Go6.LJIIL(this.LIZIZ, false);
        }
        return C76800UCe.LIZ;
    }
}
