package X;

import Y.ARunnableS39S0100000_3;
import com.ss.android.ugc.aweme.feed.assem.story.QuickDMEntranceAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.8mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221578mn extends AbstractC65781Prl implements InterfaceC88471Ynr<QuickDMEntranceAssem, FollowStatusEvent, C76800UCe> {
    public static final C221578mn LJLIL = new C221578mn();

    public C221578mn() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(QuickDMEntranceAssem quickDMEntranceAssem, FollowStatusEvent followStatusEvent) {
        FollowStatus followStatus;
        String str;
        Aweme aweme;
        QuickDMEntranceAssem selectSubscribe = quickDMEntranceAssem;
        FollowStatusEvent followStatusEvent2 = followStatusEvent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        String str2 = null;
        if (followStatusEvent2 != null) {
            followStatus = followStatusEvent2.status;
        } else {
            followStatus = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        if (followStatus != null) {
            str2 = followStatus.userId;
        }
        if (o.LJ(str, str2) && followStatus != null) {
            int i = followStatus.followerStatus;
            if (i != 0) {
                if (i == 2) {
                    selectSubscribe.getContainerView().post(new ARunnableS39S0100000_3(selectSubscribe, 161));
                }
            } else {
                selectSubscribe.getContainerView().post(new ARunnableS39S0100000_3(selectSubscribe, 162));
            }
        }
        return C76800UCe.LIZ;
    }
}
