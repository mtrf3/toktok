package X;

import Y.AObserverS80S0100000_12;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ad.comment.AdCommentService;
import com.ss.android.ugc.aweme.ad.comment.IAdCommentService;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.comment.VideoCommentViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.util.VideoPrivacySettingsDurationViewModel;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SP9 extends AbstractC72031SOt<VideoCommentViewModel> {
    public String LJLLJ;
    public final C62822Ol8 LJLLL;

    @Override // X.AbstractC72031SOt
    public final boolean LLIFFJFJJ() {
        Story story;
        if (!C54838Lfe.LJJI(this.LJLL.nv0()) || (!C2304092m.LIZ() && ((story = this.LJLL.nv0().getStory()) == null || !StoryKt.isStoryV2(story)))) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC72031SOt
    public final int LLIIII() {
        C62623Ohv c62623Ohv = C62623Ohv.LIZIZ;
        if (c62623Ohv.LJIILJJIL() || c62623Ohv.LIZJ(this.LJLL.nv0())) {
            return R.string.cae;
        }
        return R.string.tng;
    }

    @Override // X.AbstractC72031SOt
    public final void LLIIIL(int i) {
        String str;
        String str2;
        if (C63081OpJ.LJJLIIIJLJLI(this.LJLL.nv0())) {
            LLIIJI(R.string.b96);
        }
        String aid = this.LJLL.nv0().getAid();
        o.LJIIIIZZ(aid, "viewModel.aweme.aid");
        if (C54838Lfe.LJJI(this.LJLL.nv0())) {
            str = "story";
        } else {
            str = "post";
        }
        long gv0 = ((VideoPrivacySettingsDurationViewModel) this.LJLLL.getValue()).gv0();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "privacy_settings");
        c188727au.LJIIIZ("group_id", aid);
        c188727au.LJIIIZ("story_type", str);
        c188727au.LIZLLL(C71945SLl.LIZLLL() ? 1 : 0, "is_private");
        if (i == 0) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c188727au.LJIIIZ("to_status", str2);
        c188727au.LJ(gv0, "duration");
        FMX.LJIIL("disable_video_comment", c188727au.LIZ);
        super.LLIIIL(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SP9(PrivacySettingsRestrictionItem privacySettingsRestrictionItem, VideoCommentViewModel videoCommentViewModel, Fragment fragment) {
        super(privacySettingsRestrictionItem, videoCommentViewModel, fragment);
        int i;
        IAdCommentService iAdCommentService;
        o.LJIIIZ(fragment, "fragment");
        this.LJLLJ = "";
        this.LJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(fragment, 30));
        SL3 sl3 = new SL3();
        LLII(sl3, 0, 3);
        C62623Ohv c62623Ohv = C62623Ohv.LIZIZ;
        if (c62623Ohv.LJIILJJIL() || c62623Ohv.LIZJ(this.LJLL.nv0())) {
            i = R.string.cab;
        } else {
            i = R.string.blw;
        }
        AbstractC71913SKf.LIZJ(sl3, i);
        sl3.LJI = new AqS162S0100000_12(this, 29);
        LJLLLLLL(sl3.LIZ());
        Object LIZ = C58096Mr6.LIZ(IAdCommentService.class, false);
        if (LIZ != null) {
            iAdCommentService = (IAdCommentService) LIZ;
        } else {
            if (C58096Mr6.LJLLJ == null) {
                synchronized (IAdCommentService.class) {
                    if (C58096Mr6.LJLLJ == null) {
                        C58096Mr6.LJLLJ = new AdCommentService();
                    }
                }
            }
            iAdCommentService = C58096Mr6.LJLLJ;
        }
        String aid = this.LJLL.nv0().getAid();
        iAdCommentService.LIZ(aid == null ? "" : aid, new SPA(this));
        videoCommentViewModel.LJLJI.observe(fragment, new AObserverS80S0100000_12(this, 11));
        videoCommentViewModel.LJLJJI.observe(fragment, new AObserverS80S0100000_12(this, 12));
    }
}
