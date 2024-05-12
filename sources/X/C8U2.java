package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8U2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8U2 extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarSocialPublishAssem, C56252Ir, C76800UCe> {
    public static final C8U2 LJLIL = new C8U2();

    public C8U2() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarSocialPublishAssem feedAvatarSocialPublishAssem, C56252Ir c56252Ir) {
        FeedAvatarSocialPublishAssem selectSubscribe = feedAvatarSocialPublishAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C53324KwK.LIZ() || c56252Ir != null) {
            selectSubscribe.F0((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe));
        }
        return C76800UCe.LIZ;
    }
}
