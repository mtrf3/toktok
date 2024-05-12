package X;

import android.content.Context;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailsViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Xa7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85071Xa7 implements JJ4 {
    public final /* synthetic */ FullEpisodeDetailsViewModel LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ Aweme LIZJ;

    public C85071Xa7(Context context, FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel, Aweme aweme) {
        this.LIZ = fullEpisodeDetailsViewModel;
        this.LIZIZ = context;
        this.LIZJ = aweme;
    }

    @Override // X.JJ4
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.JJ4
    public final void LIZ() {
        if (o.LJ(this.LIZ._isLiked.getValue(), Boolean.TRUE)) {
            this.LIZ.handleUnlike(this.LIZIZ, this.LIZJ);
        } else {
            this.LIZ.handleLike(this.LIZIZ, this.LIZJ);
        }
    }
}
