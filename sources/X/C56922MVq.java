package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager;
import com.ss.android.ugc.aweme.notification.utils.FollowSortDataCache;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MVq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56922MVq extends C56927MVv {
    @Override // X.C56927MVv
    public final void LIZIZ() {
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        User user;
        MusNotice musNotice = this.LIZ;
        if (musNotice != null && (generalTemplateNotice = musNotice.templateNotice) != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (user = (User) ORZ.LJLLLL(list)) != null && C3U6.LIZ && user.getFollowStatus() == 2) {
            InterfaceC57106Mb8 imSayHiService = IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService();
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "it.uid");
            if (imSayHiService.LJII(uid)) {
                InterfaceC57106Mb8 imSayHiService2 = IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService();
                String uid2 = user.getUid();
                o.LJIIIIZZ(uid2, "it.uid");
                imSayHiService2.LJ(user.getFollowerStatus(), uid2, true);
            }
        }
    }

    @Override // X.C56927MVv
    public final void LIZLLL() {
        MusNotice musNotice;
        FollowNotice followNotice;
        User user;
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        User user2;
        MusNotice musNotice2 = this.LIZ;
        if (musNotice2 != null && (generalTemplateNotice = musNotice2.templateNotice) != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (user2 = (User) ORZ.LJLLLL(list)) != null && user2.getFollowStatus() == 0 && user2.getFollowerStatus() == 1) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("to_user_id", user2.getUid());
            String accurateRecType = user2.getAccurateRecType();
            if (accurateRecType == null) {
                accurateRecType = "";
            }
            c188727au.LJIIIZ("rec_type", accurateRecType);
            c188727au.LJIIIZ("enter_from", "notification_page");
            c188727au.LJIIIZ("previous_page", "message");
            FMX.LJIIL("show_follow_back_button", c188727au.LIZ);
        }
        if (!FollowerPreCacheManager.LIZLLL && C53551Kzz.LIZ() && ((RBX) HG3.LJIILL()).getCurUser().historyMaxFollowerCount < C56717MNt.LIZ().getMaxFansDivide()) {
            MusNotice musNotice3 = this.LIZ;
            if ((musNotice3 != null && (followNotice = musNotice3.followNotice) != null && (user = followNotice.getUser()) != null && user.getFollowStatus() == 2) || (musNotice = this.LIZ) == null) {
                return;
            }
            String str = musNotice.nid;
            o.LJIIIIZZ(str, "it.nid");
            FollowSortDataCache.LIZ(str);
        }
    }

    public C56922MVq(MusNotice musNotice) {
        super(musNotice);
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        User user;
        MW1 mw1 = this.LIZIZ;
        mw1.LIZ.LJLJI = true;
        mw1.LJI = false;
        mw1.LJIIIIZZ = true;
        if (musNotice != null && (generalTemplateNotice = musNotice.templateNotice) != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (user = (User) ORZ.LJLLLL(list)) != null && AXU.LIZLLL(user)) {
            this.LIZIZ.LIZ.LJLJJI = true;
        }
    }

    @Override // X.C56927MVv
    public final void LIZJ(EnumC56820MRs event, Context context) {
        int i;
        o.LJIIIZ(event, "event");
        if (event == EnumC56820MRs.Click) {
            MusNotice musNotice = this.LIZ;
            if (musNotice != null) {
                i = musNotice.clientOrder;
            } else {
                i = -1;
            }
            MVR.LIZJ(context, i);
        }
    }
}
