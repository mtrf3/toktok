package X;

import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.LvI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55808LvI extends AbstractC65781Prl implements InterfaceC88471Ynr<EcVideoGuideAssem, FollowStatusEvent, C76800UCe> {
    public static final C55808LvI LJLIL = new C55808LvI();

    public C55808LvI() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EcVideoGuideAssem ecVideoGuideAssem, FollowStatusEvent followStatusEvent) {
        FollowStatus followStatus;
        EcVideoGuideAssem selectSubscribe = ecVideoGuideAssem;
        FollowStatusEvent followStatusEvent2 = followStatusEvent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (followStatusEvent2 != null && (followStatus = followStatusEvent2.status) != null && ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().productRecallType != 4 && o.LJ(followStatus.userId, ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAuthorUid()) && followStatus.followStatus == 1) {
            C38891fp.LJJIIJ(new OSZ(2, 5), selectSubscribe.LLIIL);
        }
        return C76800UCe.LIZ;
    }
}
