package X;

import Y.AObserverS70S0100000_2;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS59S0110000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.55Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C55Y {
    public View LIZ;
    public final ActivityC45651qj LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public AqS168S0100000_2 LJ;
    public AqS168S0100000_2 LJFF;
    public boolean LJI;
    public final C55X LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;

    public final C142405iO LIZIZ() {
        return (C142405iO) this.LJIIIIZZ.getValue();
    }

    public final C142405iO LIZJ() {
        return (C142405iO) this.LJIIIZ.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.55X] */
    public C55Y(EditorProScene scene) {
        o.LJIIIZ(scene, "scene");
        this.LIZIZ = SceneExtensionsKt.LIZLLL(scene);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C1291455a.LJLIL);
        this.LIZJ = LIZIZ;
        this.LIZLLL = C221108m2.LIZIZ(C55Z.LJLIL);
        this.LJII = new InterfaceC142415iP() { // from class: X.55X
            @Override // X.InterfaceC142415iP
            public final void LIZJ() {
                C79057V0z.LJJJJL((EditorProContext) C55Y.this.LIZJ.getValue(), "is_bottom_popup_menu_showing", Boolean.FALSE);
                View view = C55Y.this.LIZ;
                if (view != null) {
                    view.setAlpha(1.0f);
                }
                if (C55Y.this.LIZIZ().LIZJ()) {
                    C55Y.this.LIZIZ().LIZ();
                }
                if (C55Y.this.LIZJ().LIZJ()) {
                    C55Y.this.LIZJ().LIZ();
                }
            }

            @Override // X.InterfaceC142415iP
            public final void onCancel() {
                C55Y c55y = C55Y.this;
                if (!c55y.LJI) {
                    View view = c55y.LIZ;
                    if (view != null) {
                        view.setAlpha(1.0f);
                    }
                } else {
                    c55y.LJI = false;
                }
                C79057V0z.LJJJJL((EditorProContext) C55Y.this.LIZJ.getValue(), "is_bottom_popup_menu_showing", Boolean.FALSE);
                C131935Ft.LIZIZ("ActionMenuController", "onCancel");
            }

            @Override // X.InterfaceC142415iP
            public final void onShow() {
                C79057V0z.LJJJJL((EditorProContext) C55Y.this.LIZJ.getValue(), "is_bottom_popup_menu_showing", Boolean.TRUE);
                C131935Ft.LIZIZ("ActionMenuController", "onShow");
            }
        };
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 832));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 833));
        MutableLiveData LJII = C79057V0z.LJII((EditorProContext) LIZIZ.getValue(), "event_music_added");
        if (LJII != null) {
            LJII.observe(scene, new AObserverS70S0100000_2(this, 268));
        }
    }

    public final ArrayList<C136305Wo> LIZ(boolean z) {
        int i;
        int i2;
        C136305Wo[] c136305WoArr = new C136305Wo[2];
        if (z) {
            i = R.raw.icon_arrow_double_direction_fill;
            i2 = R.string.fmz;
        } else {
            i = R.raw.icon_sound_plus;
            i2 = R.string.fmx;
        }
        c136305WoArr[0] = new C136305Wo(i, i2, R.attr.dj, new AqS59S0110000_2(z, this, 5), true, false, null, 816);
        int i3 = 1;
        c136305WoArr[1] = new C136305Wo(R.raw.icon_music_note_star, R.string.fmh, R.attr.dj, new AqS152S0100000_2(this, 828), true, false, null, 816);
        ArrayList<C136305Wo> LJII = C47261Igj.LJII(c136305WoArr);
        if (C52M.LIZ(C79057V0z.LJJI((EditorProContext) this.LIZJ.getValue()))) {
            C136305Wo c136305Wo = new C136305Wo(R.raw.icon_microphone_fill, R.string.trv, R.attr.dj, new AqS152S0100000_2(this, 827), false, false, null, 944);
            new Object() { // from class: X.55b
            }.getClass();
            FFL.LJIIIZ().getClass();
            if (FFL.LJ(31744, "studio_editor_pro_sound_panel_order_only_android", true, false)) {
                i3 = LJII.size();
            }
            ListProtector.add(LJII, i3, c136305Wo);
        }
        return LJII;
    }

    public final ArrayList<C136305Wo> LIZLLL(boolean z) {
        VideoPublishEditModel videoPublishEditModel;
        int i = R.attr.dj;
        OSZ osz = null;
        ArrayList<C136305Wo> LJII = C47261Igj.LJII(new C136305Wo(R.raw.icon_text_plus, R.string.fn3, R.attr.dj, new AqS152S0100000_2(this, 831), true, false, null, 816));
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) this.LIZLLL.getValue();
        if (videoPublishEditModel2 != null && C44384HbQ.LJJIJL(videoPublishEditModel2) && (videoPublishEditModel = (VideoPublishEditModel) this.LIZLLL.getValue()) != null && C44384HbQ.LLJILJILJ(videoPublishEditModel)) {
            AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 829);
            i = R.attr.dj;
            osz = null;
            LJII.add(new C136305Wo(R.raw.icon_closed_caption_fill, R.string.bwy, i, aqS152S0100000_2, z, false, null, 816));
        }
        if (C55S.LIZ()) {
            LJII.add(new C136305Wo(R.raw.icon_text_template_fill, R.string.s6p, i, new AqS152S0100000_2(this, 830), C55S.LIZ(), true, osz, 560));
        }
        return LJII;
    }
}
