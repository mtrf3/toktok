package X;

import com.ss.android.ugc.aweme.compose.MentionFavoriteComposeFragment;

/* loaded from: classes13.dex */
public final /* synthetic */ class SRT extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public SRT(MentionFavoriteComposeFragment mentionFavoriteComposeFragment) {
        super(0, mentionFavoriteComposeFragment, MentionFavoriteComposeFragment.class, "manualRetry", "manualRetry()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        MentionFavoriteComposeFragment mentionFavoriteComposeFragment = (MentionFavoriteComposeFragment) this.receiver;
        mentionFavoriteComposeFragment.vl().iv0(false);
        mentionFavoriteComposeFragment.vl().manualListRefresh();
        return C76800UCe.LIZ;
    }
}
