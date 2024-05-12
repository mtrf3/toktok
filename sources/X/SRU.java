package X;

import com.ss.android.ugc.aweme.compose.MentionFavoriteComposeFragment;
import kotlin.jvm.internal.AqS162S0100000_12;

/* loaded from: classes13.dex */
public final /* synthetic */ class SRU extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public SRU(MentionFavoriteComposeFragment mentionFavoriteComposeFragment) {
        super(0, mentionFavoriteComposeFragment, MentionFavoriteComposeFragment.class, "setupAutoRetry", "setupAutoRetry()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        MentionFavoriteComposeFragment mentionFavoriteComposeFragment = (MentionFavoriteComposeFragment) this.receiver;
        if (mentionFavoriteComposeFragment.LJLLL == null) {
            mentionFavoriteComposeFragment.LJLLL = new T3D(new AqS162S0100000_12(mentionFavoriteComposeFragment, 1235), new AqS162S0100000_12(mentionFavoriteComposeFragment, 1236), false);
        }
        T3D t3d = mentionFavoriteComposeFragment.LJLLL;
        if (t3d != null) {
            t3d.LIZ();
        }
        return C76800UCe.LIZ;
    }
}
