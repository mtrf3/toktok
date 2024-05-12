package X;

import Y.AObserverS75S0200000_12;
import Y.AObserverS80S0100000_12;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.autocaption.AutoCaptionViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.BaseVisibilityViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.util.VideoPrivacySettingsDurationViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SPE extends AbstractC72031SOt<AutoCaptionViewModel> {
    public final C62822Ol8 LJLLJ;
    public final boolean LJLLL;
    public final boolean LJLLLL;
    public final boolean LJLLLLLL;
    public boolean LJLZ;
    public final boolean LJZ;

    @Override // X.AbstractC72031SOt
    public final boolean LLFZ() {
        if (!C79146V4k.LJJJJI(this.LJLL.nv0()) && LLIIJLIL() == null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC72031SOt
    public final boolean LLIFFJFJJ() {
        if (C54838Lfe.LJJI(this.LJLL.nv0()) || C79146V4k.LJJJJJ(this.LJLL.nv0()) || Z89.LIZIZ.LIZIZ(this.LJLL.nv0())) {
            return false;
        }
        if (LLIIJLIL() == GT2.CREATOR_ALLOW_AUTOCAPTIONS_OLD && C53379KxD.LIZ()) {
            return false;
        }
        Aweme nv0 = this.LJLL.nv0();
        if (nv0.getInteractStickerStructs() != null && nv0.getInteractStickerStructs().size() > 0) {
            for (InteractStickerStruct interactStickerStruct : nv0.getInteractStickerStructs()) {
                if (interactStickerStruct.getCaptionStruct() != null && !C79004UzY.LJJIFFI(interactStickerStruct.getCaptionStruct().getAutoCaptions())) {
                    return false;
                }
            }
        }
        if (!CrossLanguageUserExperiment.LIZJ().LIZIZ() || GAE.LIZ()) {
            return false;
        }
        return true;
    }

    public final GT2 LLIIJLIL() {
        if (this.LJLLL) {
            if (this.LJZ) {
                return GT2.CREATOR_ALLOW_AUTOCAPTIONS_OLD;
            }
            if (this.LJLZ) {
                return GT2.CREATOR_ALLOW_AUTOCAPTIONS_PUBLIC;
            }
            if (!this.LJLLLL) {
                return null;
            }
            return GT2.CREATOR_ALLOW_AUTOCAPTIONS_PGC;
        }
        if (this.LJZ) {
            return GT2.CREATOR_ALLOW_AUTOCAPTIONS_OLD;
        }
        if (this.LJLZ) {
            return GT2.CREATOR_ALLOW_AUTOCAPTIONS_PUBLIC;
        }
        if (!this.LJLLLLLL) {
            return null;
        }
        return GT2.CREATOR_ALLOW_AUTOCAPTIONS_ORIGINAL;
    }

    @Override // X.AbstractC72031SOt
    public final void LLIIIL(int i) {
        String str;
        String aid = this.LJLL.nv0().getAid();
        o.LJIIIIZZ(aid, "viewModel.aweme.aid");
        long gv0 = ((VideoPrivacySettingsDurationViewModel) this.LJLLJ.getValue()).gv0();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "setting");
        if (i == 1) {
            str = "off";
        } else {
            str = "on";
        }
        c188727au.LJIIIZ("to_status", str);
        c188727au.LIZLLL(C71945SLl.LIZLLL() ? 1 : 0, "is_private");
        c188727au.LJIIIZ("group_id", aid);
        c188727au.LJ(gv0, "duration");
        FMX.LJIIL("change_transl_auth_status", c188727au.LIZ);
        super.LLIIIL(i);
    }

    @Override // X.AbstractC72031SOt
    public final boolean LLIIIZ(int i) {
        Integer resourceString;
        GT2 LLIIJLIL = LLIIJLIL();
        if (LLIIJLIL != null && (resourceString = LLIIJLIL.getResourceString()) != null) {
            LLIIJI(resourceString.intValue());
            return true;
        }
        return super.LLIIIZ(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SPE(AutoCaptionViewModel autoCaptionViewModel, BaseVisibilityViewModel baseVisibilityViewModel, Fragment fragment) {
        super(null, autoCaptionViewModel, fragment);
        boolean z;
        boolean z2;
        boolean z3;
        CaptionModel captionModel;
        CaptionModel captionModel2;
        CaptionModel captionModel3;
        Music music;
        o.LJIIIZ(fragment, "fragment");
        this.LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(fragment, 2));
        this.LJLLL = C40975G6h.LIZ();
        Video video = autoCaptionViewModel.nv0().getVideo();
        boolean z4 = false;
        if (video != null && (captionModel3 = video.getCaptionModel()) != null && captionModel3.getHasOriginalAudio() == 0 && (music = autoCaptionViewModel.nv0().getMusic()) != null && music.isPgc()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLLL = z;
        Video video2 = autoCaptionViewModel.nv0().getVideo();
        if (video2 != null && (captionModel2 = video2.getCaptionModel()) != null && captionModel2.getHasOriginalAudio() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLLLLLL = z2;
        Integer value = baseVisibilityViewModel.LJLJI.getValue();
        if (value == null || value.intValue() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJLZ = z3;
        Video video3 = autoCaptionViewModel.nv0().getVideo();
        if (video3 != null && (captionModel = video3.getCaptionModel()) != null && captionModel.getEnableAutoCaption() == 0) {
            z4 = true;
        }
        this.LJZ = z4;
        SL3 sl3 = new SL3();
        LLII(sl3, 1, -1);
        AbstractC71913SKf.LIZJ(sl3, R.string.eb5);
        LJLLLLLL(sl3.LIZ());
        autoCaptionViewModel.LJLJI.observe(fragment, new AObserverS80S0100000_12(this, 1));
        autoCaptionViewModel.LJLJJI.observe(fragment, new AObserverS80S0100000_12(this, 2));
        baseVisibilityViewModel.LJLJI.observe(fragment, new AObserverS75S0200000_12(autoCaptionViewModel, this, 0));
    }
}
