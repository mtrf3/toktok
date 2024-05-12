package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8U0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8U0 extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarSocialPublishAssem, C1IZ, C76800UCe> {
    public static final C8U0 LJLIL = new C8U0();

    public C8U0() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarSocialPublishAssem feedAvatarSocialPublishAssem, C1IZ c1iz) {
        FeedAvatarSocialPublishAssem selectSubscribe = feedAvatarSocialPublishAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C53324KwK.LIZ() || c1iz != null) {
            selectSubscribe.F0((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe));
        }
        return C76800UCe.LIZ;
    }
}
