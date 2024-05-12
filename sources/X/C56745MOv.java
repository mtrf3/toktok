package X;

import Y.IDhS102S0100000_9;
import Y.IDuS320S0100000_9;
import Y.IDuS79S0200000_9;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequest;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.RecommendAvatars;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MOv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56745MOv implements InterfaceC56756MPg<MPR, List<? extends MusNotice>> {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C56793MQr.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C56790MQo.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C56797MQv.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C56796MQu.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C56791MQp.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C56792MQq.LJLIL);
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C56755MPf.LJLIL);
    public final C62822Ol8 LJII = C221108m2.LIZIZ(MQS.LJLIL);

    public final synchronized void LIZJ() {
        LJI().clear();
        LJI().addAll(LIZLLL());
        LJI().addAll((List) this.LIZJ.getValue());
        LJI().addAll((List) this.LIZLLL.getValue());
    }

    @Override // X.InterfaceC56756MPg
    /* renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public final synchronized List<MusNotice> LIZIZ() {
        return ORZ.LLJI(LJI());
    }

    @Override // X.InterfaceC56756MPg
    public final boolean hasMore() {
        return false;
    }

    public final List<C56646MLa> LIZLLL() {
        return (List) this.LIZIZ.getValue();
    }

    public final List<C56767MPr> LJ() {
        return (List) this.LJ.getValue();
    }

    public final List<NoticeItems> LJFF() {
        return (List) this.LJFF.getValue();
    }

    public final List<MusNotice> LJI() {
        return (List) this.LIZ.getValue();
    }

    public final synchronized void LJIIIIZZ(NoticeCombineResponse noticeCombineResponse) {
        List<NoticeItems> shopNotice;
        FollowRequest followRequest;
        NoticeCombineDatas data = noticeCombineResponse.getData();
        if (data == null) {
            return;
        }
        LIZLLL().clear();
        ((List) this.LIZLLL.getValue()).clear();
        LJ().clear();
        LJFF().clear();
        C78963Uyt.LJJIL(data);
        if (!INB.LIZIZ() && (followRequest = data.getFollowRequest()) != null && followRequest.getFollowRequestCount() > 0) {
            LIZLLL().add(new C56646MLa(followRequest.getFollowRequestCount(), C61878OQg.INSTANCE));
        }
        if (!C46604IQu.LJ()) {
            RecommendAvatars recommendAvatars = data.getRecommendAvatars();
            if (recommendAvatars != null) {
                C77413UZt.LJIIZILJ();
                List<UrlModel> list = recommendAvatars.avatarList;
                if (list != null && !list.isEmpty()) {
                    ((List) this.LIZLLL.getValue()).add(new C56749MOz(recommendAvatars.avatarList, recommendAvatars.enable, recommendAvatars.LJLIL));
                }
            }
            List<CombineLiveNotice> liveNotices = data.getLiveNotices();
            if (liveNotices != null) {
                Iterator<CombineLiveNotice> it = liveNotices.iterator();
                while (it.hasNext()) {
                    LJ().add(C78963Uyt.LJ(it.next()));
                }
            }
        }
        if (!C54316LTk.LIZ && (shopNotice = data.getShopNotice()) != null) {
            LJFF().addAll(shopNotice);
        }
        List<NoticeItems> reportNotice = data.getReportNotice();
        if (reportNotice != null) {
            LJFF().addAll(reportNotice);
        }
    }

    @Override // X.InterfaceC56756MPg
    /* renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public final C73390SrC LIZ(MPR mpr) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (mpr != null) {
            z = mpr.LIZ;
        } else {
            z = true;
        }
        C76L LIZIZ = MusNotificationApiManager.LIZIZ(((Number) this.LJII.getValue()).intValue(), z);
        C73320Sq4.LIZ(LIZIZ, "future is null");
        arrayList.add(new C73561Stx(LIZIZ).LJJL(T16.LIZ()).LJJIJL(new IDhS102S0100000_9(this, 20)).LJJJJ(C77123UOp.LJLJJLL));
        if (!C1DH.LJIJJLI() && e1.LIZ(31744, "inbox_has_top_msg", true, false)) {
            TutorialVideoViewModel tutorialVideoViewModel = (TutorialVideoViewModel) this.LJI.getValue();
            tutorialVideoViewModel.getClass();
            arrayList.add(AbstractC73672Svk.LJIIJ(new IDuS320S0100000_9(tutorialVideoViewModel, 7)).LJJL(T16.LIZ()).LJJIJL(new IDhS102S0100000_9(this, 21)).LJJJJ(C1XY.LJLIL));
        }
        return AbstractC73672Svk.LJIIJ(new IDuS79S0200000_9(arrayList, this, 4));
    }

    public final C56769MPt LJII(Object obj, Throwable th) {
        return new C56769MPt(this, obj, th);
    }
}
