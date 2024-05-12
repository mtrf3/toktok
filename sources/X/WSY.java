package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WSY extends C79146V4k {
    public final AVETParameter LJFF;

    @Override // X.C79146V4k
    public final void LJIIZILJ() {
        GXR.LIZ("click_beautify_entrance", LJJLIIIJLLLLLLLZ(this.LJFF).LIZ);
    }

    public WSY(AVETParameter aVETParameter) {
        this.LJFF = aVETParameter;
    }

    public static C145995oB LJJLIIIJLLLLLLLZ(AVETParameter aVETParameter) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", aVETParameter.getCreationId());
        c145995oB.LJI("shoot_way", aVETParameter.getShootWay());
        c145995oB.LJI("content_source", aVETParameter.getContentSource());
        c145995oB.LJI("content_type", aVETParameter.getContentType());
        c145995oB.LJI("enter_from", "video_shoot_page");
        return c145995oB;
    }

    @Override // X.C79146V4k, X.InterfaceC83246Wlm
    public final void LIZJ(String selectedCategoryName) {
        o.LJIIIZ(selectedCategoryName, "selectedCategoryName");
        GXR.LIZ("reset_beautify_all", LJJLIIIJLLLLLLLZ(this.LJFF).LIZ);
    }

    @Override // X.C79146V4k, X.InterfaceC83246Wlm
    public final void LIZLLL(ComposerBeauty composerBeauty) {
        int defaultProgress;
        if (composerBeauty != null) {
            if (composerBeauty.getProgressValue() != 0) {
                defaultProgress = composerBeauty.getProgressValue();
            } else {
                defaultProgress = composerBeauty.getDefaultProgress();
            }
            C145995oB LJJLIIJ = LJJLIIJ(composerBeauty, this.LJFF);
            LJJLIIJ.LJI("beautify_value", String.valueOf(defaultProgress));
            GXR.LIZ("select_beautify", LJJLIIJ.LIZ);
        }
    }

    @Override // X.C79146V4k, X.InterfaceC83246Wlm
    public final void LJFF(BeautyCategory beautyCategory) {
        C145995oB LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ(this.LJFF);
        LJJLIIIJLLLLLLLZ.LJI("beautify_category_id", beautyCategory.getCategoryResponse().getId());
        LJJLIIIJLLLLLLLZ.LJI("beautify_category_name", beautyCategory.getCategoryResponse().getName());
        GXR.LIZ("click_beautify_category", LJJLIIIJLLLLLLLZ.LIZ);
    }

    @Override // X.C79146V4k, X.InterfaceC83246Wlm
    public final void LJII(boolean z) {
        String str;
        C145995oB LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ(this.LJFF);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        LJJLIIIJLLLLLLLZ.LJI("final_status", str);
        GXR.LIZ("click_beauty_switch", LJJLIIIJLLLLLLLZ.LIZ);
    }

    @Override // X.C79146V4k, X.InterfaceC83246Wlm
    public final void LJIIIIZZ(String str) {
        C145995oB LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ(this.LJFF);
        LJJLIIIJLLLLLLLZ.LJI("to_status", str);
        GXR.LIZ("beautify_status_switch", LJJLIIIJLLLLLLLZ.LIZ);
    }

    @Override // X.C79146V4k, X.InterfaceC83246Wlm
    public final void LJIIIZ(ComposerBeauty composerBeauty) {
        C145995oB LJJLIIJ = LJJLIIJ(composerBeauty, this.LJFF);
        LJJLIIJ.LJI("beautify_value", String.valueOf(composerBeauty.getProgressValue()));
        GXR.LIZ("reset_beautify", LJJLIIJ.LIZ);
    }

    public static C145995oB LJJLIIJ(ComposerBeauty composerBeauty, AVETParameter aVETParameter) {
        C145995oB LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ(aVETParameter);
        if (C1DH.LJIJ(composerBeauty)) {
            LJJLIIIJLLLLLLLZ.LJI("beautify_name_parent", composerBeauty.getParentName());
            LJJLIIIJLLLLLLLZ.LJI("beautify_id_parent", composerBeauty.getParentId());
            LJJLIIIJLLLLLLLZ.LJI("beautify_name_child", composerBeauty.getEffect().getName());
            LJJLIIIJLLLLLLLZ.LIZLLL("beautify_id_child", composerBeauty.getEffect().getEffectId());
        } else {
            LJJLIIIJLLLLLLLZ.LJI("beautify_name_parent", composerBeauty.getEffect().getName());
            LJJLIIIJLLLLLLLZ.LIZLLL("beautify_id_parent", composerBeauty.getEffect().getEffectId());
        }
        return LJJLIIIJLLLLLLLZ;
    }

    @Override // X.C79146V4k, X.InterfaceC83246Wlm
    public final void LJ(ComposerBeauty composerBeauty, String selectedCategoryName) {
        o.LJIIIZ(selectedCategoryName, "selectedCategoryName");
        if (composerBeauty != null) {
            GXR.LIZ("click_beautify_tab", LJJLIIJ(composerBeauty, this.LJFF).LIZ);
        }
    }

    @Override // X.C79146V4k, X.InterfaceC83246Wlm
    public final void LJIIJJI(String str, String selectedCategoryName) {
        o.LJIIIZ(selectedCategoryName, "selectedCategoryName");
        C145995oB LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ(this.LJFF);
        LJJLIIIJLLLLLLLZ.LJI("event_type", str);
        GXR.LIZ("reset_beautify_popup", LJJLIIIJLLLLLLLZ.LIZ);
    }
}
