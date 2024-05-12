package X;

import Y.AObserverS80S0100000_12;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.sticker.VideoStickerViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.util.VideoPrivacySettingsDurationViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SPB extends AbstractC72031SOt<VideoStickerViewModel> {
    public final C62822Ol8 LJLLJ;

    @Override // X.AbstractC72031SOt
    public final int LLIIII() {
        return R.string.tly;
    }

    @Override // X.AbstractC72031SOt
    public final int LLIIIILZ() {
        return R.string.tla;
    }

    @Override // X.AbstractC72031SOt
    public final boolean LLFZ() {
        if (!C79146V4k.LJJJJI(this.LJLL.nv0()) && !C79146V4k.LJJJJJ(this.LJLL.nv0()) && !C79146V4k.LJJII(3, this.LJLL.nv0())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC72031SOt
    public final boolean LLIFFJFJJ() {
        if (!C54838Lfe.LJJI(this.LJLL.nv0()) && !Z89.LIZIZ.LIZIZ(this.LJLL.nv0())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC72031SOt
    public final void LLIIIL(int i) {
        String str;
        String aid = this.LJLL.nv0().getAid();
        o.LJIIIIZZ(aid, "viewModel.aweme.aid");
        long gv0 = ((VideoPrivacySettingsDurationViewModel) this.LJLLJ.getValue()).gv0();
        C188727au c188727au = new C188727au();
        if (i == 1) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJIIIZ("to_status", str);
        c188727au.LJIIIZ("enter_from", "privacy_settings");
        c188727au.LJ(gv0, "duration");
        c188727au.LIZLLL(C71945SLl.LIZLLL() ? 1 : 0, "is_private");
        c188727au.LJIIIZ("group_id", aid);
        FMX.LJIIL("disable_video_stickers", c188727au.LIZ);
        super.LLIIIL(i);
    }

    @Override // X.AbstractC72031SOt
    public final boolean LLIIIZ(int i) {
        if (C79146V4k.LJJJJJ(this.LJLL.nv0())) {
            LLIIJI(R.string.tlx);
            return true;
        }
        if (super.LLIIIZ(i)) {
            return true;
        }
        if (C79146V4k.LJJII(3, this.LJLL.nv0())) {
            String errorHintWhenDisableDuetOrStitch = AVExternalServiceImpl.LIZ().publishService().getErrorHintWhenDisableDuetOrStitch(3);
            o.LJIIIIZZ(errorHintWhenDisableDuetOrStitch, "get().getService(IExtern…vice.ITEM_CREATE_STICKER)");
            this.LJLLILLLL.LIZIZ(errorHintWhenDisableDuetOrStitch);
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SPB(PrivacySettingsRestrictionItem privacySettingsRestrictionItem, VideoStickerViewModel videoStickerViewModel, Fragment fragment, String str) {
        super(privacySettingsRestrictionItem, videoStickerViewModel, fragment);
        o.LJIIIZ(fragment, "fragment");
        this.LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(fragment, 1045));
        SL3 sl3 = new SL3();
        LLII(sl3, 1, 2);
        AbstractC71913SKf.LIZJ(sl3, R.string.tlf);
        LJLLLLLL(sl3.LIZ());
        videoStickerViewModel.LJLJI.observe(fragment, new AObserverS80S0100000_12(this, 61));
        videoStickerViewModel.LJLJJI.observe(fragment, new AObserverS80S0100000_12(this, 62));
    }
}
