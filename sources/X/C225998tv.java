package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.ffpbutton.FollowButtonFFPAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8tv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225998tv extends AbstractC65781Prl implements InterfaceC88471Ynr<FollowButtonFFPAssem, FollowStatusEvent, C76800UCe> {
    public static final C225998tv LJLIL = new C225998tv();

    public C225998tv() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FollowButtonFFPAssem followButtonFFPAssem, FollowStatusEvent followStatusEvent) {
        FollowStatus followStatus;
        FollowButtonFFPAssem selectSubscribe = followButtonFFPAssem;
        FollowStatusEvent followStatusEvent2 = followStatusEvent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (followStatusEvent2 != null && (followStatus = followStatusEvent2.status) != null) {
            boolean z = false;
            AssemViewModel assemViewModel = (AssemViewModel) selectSubscribe.LLFZ.LIZ(selectSubscribe, FollowButtonFFPAssem.LLII[0]);
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            o.LJIIIIZZ(aweme, "item.aweme");
            assemViewModel.getClass();
            if (o.LJ(followStatus.userId, aweme.getAuthorUid())) {
                User author = aweme.getAuthor();
                if (author != null) {
                    author.setFollowStatus(followStatus.followStatus);
                }
                if (followStatus.followStatus != 0) {
                    z = true;
                }
                assemViewModel.setState(new AqS8S0010000_3(z, 28));
            }
        }
        return C76800UCe.LIZ;
    }
}
