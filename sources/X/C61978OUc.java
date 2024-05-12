package X;

import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OUc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61978OUc extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoRelationBtnAssem, FollowStatusEvent, C76800UCe> {
    public static final C61978OUc LJLIL = new C61978OUc();

    public C61978OUc() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoRelationBtnAssem videoRelationBtnAssem, FollowStatusEvent followStatusEvent) {
        Aweme aweme;
        String str;
        VideoRelationBtnAssem selectSubscribe = videoRelationBtnAssem;
        FollowStatusEvent followStatusEvent2 = followStatusEvent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        VideoRelationBtnVM u4 = selectSubscribe.u4();
        u4.getClass();
        if (followStatusEvent2 != null) {
            FollowStatus followStatus = followStatusEvent2.status;
            VideoItemParams gv0 = u4.gv0();
            if (gv0 != null && (aweme = gv0.getAweme()) != null) {
                User author = aweme.getAuthor();
                if (author != null) {
                    str = author.getUid();
                } else {
                    str = null;
                }
                if (o.LJ(str, followStatus.userId)) {
                    User author2 = aweme.getAuthor();
                    if (author2 != null) {
                        author2.setFollowStatus(followStatus.followStatus);
                    }
                    u4.withState(new AqS114S0300000_10(u4, followStatus, aweme, 0));
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
