package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarLiveAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.8lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220888lg extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarLiveAssem, C55008LiO, C76800UCe> {
    public static final C220888lg LJLIL = new C220888lg();

    public C220888lg() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarLiveAssem feedAvatarLiveAssem, C55008LiO c55008LiO) {
        Aweme aweme;
        User author;
        FeedAvatarLiveAssem selectSubscribe = feedAvatarLiveAssem;
        C55008LiO c55008LiO2 = c55008LiO;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (author = aweme.getAuthor()) != null && c55008LiO2 != null && c55008LiO2.LJLIL == 3 && C63081OpJ.LLIIIILZ(aweme) && !C63081OpJ.LLIIIL(aweme)) {
            C53887LCx c53887LCx = selectSubscribe.LLF;
            if (c53887LCx != null) {
                c53887LCx.LIZIZ(author, FeedAvatarLiveAssem.class, selectSubscribe.LLI, aweme);
            } else {
                o.LJIJI("avatarBorderViewController");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
