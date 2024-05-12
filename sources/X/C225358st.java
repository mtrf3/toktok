package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8st, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225358st extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarDefaultAssem, C55008LiO, C76800UCe> {
    public static final C225358st LJLIL = new C225358st();

    public C225358st() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarDefaultAssem feedAvatarDefaultAssem, C55008LiO c55008LiO) {
        Aweme aweme;
        FeedAvatarDefaultAssem selectSubscribe = feedAvatarDefaultAssem;
        C55008LiO c55008LiO2 = c55008LiO;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && c55008LiO2 != null && c55008LiO2.LJLIL == 3 && C63081OpJ.LLIIIILZ(aweme) && !C63081OpJ.LLIIIL(aweme)) {
            selectSubscribe.Z3().mv0();
        }
        return C76800UCe.LIZ;
    }
}
