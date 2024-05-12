package X;

import Y.AObserverS80S0100000_12;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.stitch.VideoStitchViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.util.VideoPrivacySettingsDurationViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SPD extends AbstractC72031SOt<VideoStitchViewModel> {
    public final String LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;

    @Override // X.AbstractC72031SOt
    public final int LLIIII() {
        return R.string.tnl;
    }

    @Override // X.AbstractC72031SOt
    public final int LLIIIILZ() {
        return R.string.h1c;
    }

    @Override // X.AbstractC72031SOt
    public final boolean LLFZ() {
        if (!C79146V4k.LJJJJI(this.LJLL.nv0()) && !C79146V4k.LJJJJJ(this.LJLL.nv0()) && ((Number) this.LJLLLL.getValue()).intValue() != 1 && !C79146V4k.LJJII(2, this.LJLL.nv0()) && !C220858ld.LJ(this.LJLL.nv0())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC72031SOt
    public final boolean LLIFFJFJJ() {
        if (!C54838Lfe.LJJI(this.LJLL.nv0()) && ((Number) this.LJLLLL.getValue()).intValue() != 2 && !Z89.LIZIZ.LIZIZ(this.LJLL.nv0())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC72031SOt
    public final void LLIIIL(int i) {
        String str;
        String aid = this.LJLL.nv0().getAid();
        o.LJIIIIZZ(aid, "viewModel.aweme.aid");
        String str2 = this.LJLLJ;
        long gv0 = ((VideoPrivacySettingsDurationViewModel) this.LJLLL.getValue()).gv0();
        C188727au LIZLLL = KNV.LIZLLL(str2, "enterFrom");
        if (i == 0) {
            str = "on";
        } else {
            str = "off";
        }
        LIZLLL.LJIIIZ("to_status", str);
        LIZLLL.LIZLLL(C71945SLl.LIZLLL() ? 1 : 0, "is_private");
        LIZLLL.LJIIIZ("group_id", aid);
        LIZLLL.LJIIIZ("enter_from", str2);
        LIZLLL.LJ(gv0, "duration");
        FMX.LJIIL("disable_video_stitch", LIZLLL.LIZ);
        super.LLIIIL(i);
    }

    @Override // X.AbstractC72031SOt
    public final boolean LLIIIZ(int i) {
        if (C79146V4k.LJJJJJ(this.LJLL.nv0())) {
            LLIIJI(R.string.p6d);
            return true;
        }
        if (C220858ld.LJ(this.LJLL.nv0())) {
            LLIIJI(R.string.rpp);
            return true;
        }
        if (((Number) this.LJLLLL.getValue()).intValue() == 1) {
            LLIIIL(i);
            return true;
        }
        if (super.LLIIIZ(i)) {
            return true;
        }
        if (C79146V4k.LJJII(2, this.LJLL.nv0())) {
            String errorHintWhenDisableDuetOrStitch = AVExternalServiceImpl.LIZ().publishService().getErrorHintWhenDisableDuetOrStitch(2);
            o.LJIIIIZZ(errorHintWhenDisableDuetOrStitch, "get().getService(IExtern…blishService.ITEM_STITCH)");
            this.LJLLILLLL.LIZIZ(errorHintWhenDisableDuetOrStitch);
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SPD(PrivacySettingsRestrictionItem privacySettingsRestrictionItem, VideoStitchViewModel videoStitchViewModel, Fragment fragment, String str) {
        super(privacySettingsRestrictionItem, videoStitchViewModel, fragment);
        o.LJIIIZ(fragment, "fragment");
        this.LJLLJ = str;
        this.LJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(fragment, 1064));
        this.LJLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(videoStitchViewModel, 1065));
        SL3 sl3 = new SL3();
        LLII(sl3, 0, 1);
        AbstractC71913SKf.LIZJ(sl3, R.string.bmb);
        LJLLLLLL(sl3.LIZ());
        videoStitchViewModel.LJLJI.observe(fragment, new AObserverS80S0100000_12(this, 68));
        videoStitchViewModel.LJLJJI.observe(fragment, new AObserverS80S0100000_12(this, 69));
    }
}
