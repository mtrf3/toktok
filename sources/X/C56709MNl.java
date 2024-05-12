package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.MNl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56709MNl {
    public final String LIZ;
    public final String LIZIZ;
    public volatile FollowerPreCacheManager.FollowNoticeData LIZJ;
    public final CopyOnWriteArrayList<User> LIZLLL;

    public final synchronized FollowerPreCacheManager.FollowNoticeData LIZIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(FollowPageData followPageData) {
        User user;
        FollowNotice followNotice;
        User user2;
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        Object LJLLLL;
        MusNotice notice = followPageData.getNotice();
        if (notice != null && (generalTemplateNotice = notice.templateNotice) != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (LJLLLL = ORZ.LJLLLL(list)) != null) {
            this.LIZLLL.add(LJLLLL);
            return;
        }
        MusNotice notice2 = followPageData.getNotice();
        if (notice2 != null && (followNotice = notice2.followNotice) != null && (user2 = followNotice.getUser()) != null) {
            this.LIZLLL.add(user2);
            return;
        }
        FollowRequestData followRequest = followPageData.getFollowRequest();
        if (followRequest == null || (user = followRequest.getUser()) == null) {
            return;
        }
        this.LIZLLL.add(user);
    }

    public C56709MNl(String str, String language) {
        o.LJIIIZ(language, "language");
        this.LIZ = str;
        this.LIZIZ = language;
        this.LIZLLL = new CopyOnWriteArrayList<>();
    }
}
