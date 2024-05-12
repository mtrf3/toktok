package com.ss.android.ugc.aweme.nows.service;

import X.AbstractC73672Svk;
import X.C16880lQ;
import X.C47261Igj;
import X.C7X6;
import X.InterfaceC48038ItG;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.models.NowMultiUserPostResponse;
import com.ss.android.ugc.aweme.models.NowPersonInviteShareInfoResponse;
import com.ss.android.ugc.aweme.models.UserPublishInfo;
import com.ss.android.ugc.aweme.now.UserNowPost;
import com.ss.android.ugc.aweme.service.IProfileNowsService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ProfileNowsServiceImpl implements IProfileNowsService {
    public ShareInfo LIZ;

    @Override // com.ss.android.ugc.aweme.service.IProfileNowsService
    public final ShareInfo getPersonInviteShareInfo() {
        if (this.LIZ == null) {
            try {
                NowPersonInviteShareInfoResponse nowPersonInviteShareInfoResponse = C7X6.LIZJ().getPersonInviteShareInfo().execute().LIZIZ;
                o.LJIIIIZZ(nowPersonInviteShareInfoResponse, "api.getPersonInviteShareInfo().execute().body()");
                this.LIZ = nowPersonInviteShareInfoResponse.shareInfo;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IProfileNowsService
    public final AbstractC73672Svk<Aweme> LIZ(String uid) {
        o.LJIIIZ(uid, "uid");
        return C7X6.LIZJ().getMultiUserNowPostObservable(C47261Igj.LJJIJ(uid).toString()).LJJIJL(new InterfaceC48038ItG() { // from class: X.7kZ
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                Aweme aweme;
                UserNowPost userNowPost;
                List<Aweme> nowPosts;
                Aweme aweme2;
                NowMultiUserPostResponse res = (NowMultiUserPostResponse) obj;
                o.LJIIIZ(res, "res");
                List<Aweme> userNowPosts = res.getUserNowPosts();
                if (userNowPosts != null) {
                    aweme = (Aweme) ORZ.LJLLLL(userNowPosts);
                } else {
                    aweme = null;
                }
                UserPublishInfo userPublishInfo = res.getUserPublishInfo();
                if (userPublishInfo != null) {
                    C78596Usy.LJJIFFI().LIZLLL.LJLIL.LIZ(userPublishInfo);
                }
                if (aweme == null || (userNowPost = aweme.userNowPost) == null || (nowPosts = userNowPost.getNowPosts()) == null || (aweme2 = (Aweme) ORZ.LJLLLL(nowPosts)) == null) {
                    return new Aweme();
                }
                aweme2.userNowPost = aweme.userNowPost;
                aweme2.setLogPbBean(res.getLogPbBean());
                return aweme2;
            }
        });
    }
}
