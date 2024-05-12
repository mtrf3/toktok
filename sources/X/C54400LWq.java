package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.List;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LWq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54400LWq implements InterfaceC43927HLv {
    public final /* synthetic */ SocialFriendsFeedFragment LIZ;

    @Override // X.InterfaceC43927HLv
    public final void LIZ(float f) {
    }

    @Override // X.InterfaceC43927HLv
    public final void LIZLLL(int i) {
    }

    @Override // X.InterfaceC43927HLv
    public final void onStart() {
        this.LIZ.Pl();
    }

    public C54400LWq(SocialFriendsFeedFragment socialFriendsFeedFragment) {
        this.LIZ = socialFriendsFeedFragment;
    }

    @Override // X.InterfaceC43927HLv
    public final void LIZIZ(EnumC221928nM result) {
        o.LJIIIZ(result, "result");
    }

    @Override // X.InterfaceC43927HLv
    public final void LJFF(String scheduleId) {
        o.LJIIIZ(scheduleId, "scheduleId");
    }

    @Override // X.InterfaceC43927HLv
    public final void LIZJ(String scheduleId, C221958nP data) {
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(data, "data");
    }

    @Override // X.InterfaceC43927HLv
    public final void LJ(String scheduleId, C221958nP data) {
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(data, "data");
    }

    @Override // X.InterfaceC43927HLv
    public final void LJI(String scheduleId, C189737cX schedule) {
        BaseShortVideoContext baseShortVideoContext;
        String str;
        PublishModel publishModel;
        Aweme aweme;
        Aweme aweme2;
        List<Aweme> Q8;
        VideoPublishEditModel videoPublishEditModel;
        PublishModel publishModel2;
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(schedule, "schedule");
        if (C2304092m.LIZ()) {
            return;
        }
        SimplePublishModel simplePublishModel = schedule.LJLIL;
        String str2 = null;
        if (simplePublishModel != null && (publishModel2 = simplePublishModel.getPublishModel()) != null) {
            baseShortVideoContext = publishModel2.editModel;
        } else {
            baseShortVideoContext = null;
        }
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (str = videoPublishEditModel.shootEnterMethod) == null) {
            str = "";
        }
        if (o.LJ(str, "inbox_top_cell") || o.LJ(str, "click_head_plus") || o.LJ(str, "click_profile_photo")) {
            return;
        }
        if (simplePublishModel != null) {
            publishModel = simplePublishModel.getPublishModel();
        } else {
            publishModel = null;
        }
        if (C54838Lfe.LJJIIZ(publishModel)) {
            return;
        }
        C221958nP c221958nP = schedule.LJLILLLLZI;
        if (c221958nP.LIZIZ != EnumC221928nM.SUCCESS || (aweme = c221958nP.LIZLLL) == null) {
            return;
        }
        AwemeService.LIZ().R1(aweme);
        InterfaceC55062LjG adapter = this.LIZ.LJLLI.getAdapter();
        if (adapter != null && (Q8 = adapter.Q8()) != null) {
            aweme2 = (Aweme) ORZ.LJLLLL(Q8);
        } else {
            aweme2 = null;
        }
        if (C54838Lfe.LJJ(aweme2)) {
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            if (AV1.LJIJI(str2)) {
                return;
            }
        }
        C54408LWy Ml = this.LIZ.Ml();
        if (Ml != null) {
            Ml.LJJIIZI(new AqS140S0200000_9(this.LIZ, aweme, 58));
        }
        Aweme LJI = C55723Ltv.LIZIZ.LJIL().LJI();
        if (C80S.LJFF(LJI)) {
            return;
        }
        this.LIZ.Nl().LIZ(LJI);
    }
}
