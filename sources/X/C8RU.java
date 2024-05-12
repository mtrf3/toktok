package X;

import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.friendstab.BackToFYPGuideAssem;
import com.ss.android.ugc.aweme.feed.assem.friendstab.GoToFriendsGuideAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8RU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8RU extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedVideoAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C8RU LJLIL = new C8RU();

    public C8RU() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedVideoAssem feedVideoAssem, C43I<? extends Integer> c43i) {
        FeedVideoAssem selectSubscribe = feedVideoAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            if (o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid(), C54029LIj.LIZIZ.LJ()) && C30581Hy.LJIJI(selectSubscribe.LL.eventType)) {
                C8VR.LIZJ(selectSubscribe, C65352Pkq.LIZ(BackToFYPGuideAssem.class));
            }
            if (C30581Hy.LJIL(selectSubscribe.LL.eventType) && C226068u2.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme(), EnumC61832bj.MASK_VIEW)) {
                C8VR.LIZJ(selectSubscribe, C65352Pkq.LIZ(GoToFriendsGuideAssem.class));
            }
        }
        return C76800UCe.LIZ;
    }
}
