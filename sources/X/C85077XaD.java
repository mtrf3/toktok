package X;

import android.content.Context;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailsViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.XaD, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85077XaD implements JJ4 {
    public final /* synthetic */ FullEpisodeDetailsViewModel LIZ;
    public final /* synthetic */ Aweme LIZIZ;
    public final /* synthetic */ Context LIZJ;

    public C85077XaD(Context context, FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel, Aweme aweme) {
        this.LIZ = fullEpisodeDetailsViewModel;
        this.LIZIZ = aweme;
        this.LIZJ = context;
    }

    @Override // X.JJ4
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.JJ4
    public final void LIZ() {
        this.LIZ.handleFavorite(this.LIZIZ, this.LIZJ);
    }
}
