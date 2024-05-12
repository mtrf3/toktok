package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JOG extends F9E {
    public final Aweme LJLIL;
    public final ImageUrlModel LJLILLLLZI;
    public final CharSequence LJLJI;
    public final C49255JUt LJLJJI;
    public final JOK LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, Boolean.valueOf(this.LJLJJLL), Boolean.valueOf(this.LJLJL)};
    }

    public JOG(Aweme aweme, ImageUrlModel imageUrlModel, CharSequence charSequence, C49255JUt c49255JUt, JOK playerIconState, boolean z, boolean z2) {
        o.LJIIIZ(playerIconState, "playerIconState");
        this.LJLIL = aweme;
        this.LJLILLLLZI = imageUrlModel;
        this.LJLJI = charSequence;
        this.LJLJJI = c49255JUt;
        this.LJLJJL = playerIconState;
        this.LJLJJLL = z;
        this.LJLJL = z2;
    }

    public static JOG L(JOG jog, Aweme aweme, C49255JUt c49255JUt, JOK jok, boolean z, boolean z2, int i) {
        ImageUrlModel coverUrl;
        boolean z3 = z2;
        boolean z4 = z;
        JOK playerIconState = jok;
        Aweme aweme2 = aweme;
        C49255JUt metrics = c49255JUt;
        if ((i & 1) != 0) {
            aweme2 = jog.LJLIL;
        }
        CharSequence videoCaption = null;
        if ((i & 2) != 0) {
            coverUrl = jog.LJLILLLLZI;
        } else {
            coverUrl = null;
        }
        if ((i & 4) != 0) {
            videoCaption = jog.LJLJI;
        }
        if ((i & 8) != 0) {
            metrics = jog.LJLJJI;
        }
        if ((i & 16) != 0) {
            playerIconState = jog.LJLJJL;
        }
        if ((i & 32) != 0) {
            z4 = jog.LJLJJLL;
        }
        if ((i & 64) != 0) {
            z3 = jog.LJLJL;
        }
        o.LJIIIZ(aweme2, "aweme");
        o.LJIIIZ(coverUrl, "coverUrl");
        o.LJIIIZ(videoCaption, "videoCaption");
        o.LJIIIZ(metrics, "metrics");
        o.LJIIIZ(playerIconState, "playerIconState");
        return new JOG(aweme2, coverUrl, videoCaption, metrics, playerIconState, z4, z3);
    }
}
