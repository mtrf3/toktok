package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8U1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8U1 extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarSocialPublishAssem, C55008LiO, C76800UCe> {
    public static final C8U1 LJLIL = new C8U1();

    public C8U1() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarSocialPublishAssem feedAvatarSocialPublishAssem, C55008LiO c55008LiO) {
        FeedAvatarSocialPublishAssem selectSubscribe = feedAvatarSocialPublishAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C53324KwK.LIZ() || c55008LiO != null) {
            selectSubscribe.F0((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe));
        }
        return C76800UCe.LIZ;
    }
}
