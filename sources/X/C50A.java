package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.SpeedNormalFragment;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.components.base.api.IVideoCropService;
import com.ss.ugc.android.editor.core.EditorProContext;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.50A, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C50A extends AbstractC1282851s {
    public final NavigationScene LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;

    public final CutViewModel LJFF() {
        return (CutViewModel) this.LJIIIZ.getValue();
    }

    public final EditorProContext LJI() {
        return (EditorProContext) this.LJFF.getValue();
    }

    public final VideoPublishEditModel LJII() {
        return (VideoPublishEditModel) this.LJIIJ.getValue();
    }

    public final void LJIIIZ() {
        VideoPublishEditModel LJII = LJII();
        if (LJII != null) {
            EditorProContext editorContext = LJI();
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(LJII, editorContext);
            LJFF.LJI("track_type", C5QW.LJIIJ(editorContext));
            FMX.LJIIL("cut_speed_panel_show", LJFF.LIZ);
        }
        LJ(new SpeedNormalFragment());
    }

    public final void LJIIJ() {
        VideoPublishEditModel LJII = LJII();
        if (LJII != null) {
            EditorProContext editorContext = LJI();
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(LJII, editorContext);
            LJFF.LJI("track_type", C5QW.LJIIJ(editorContext));
            FMX.LJIIL("cut_volume_panel_show", LJFF.LIZ);
        }
        LJ(C1280350t.LIZ("video"));
    }

    public final void LJIIIIZZ(InterfaceC88472Yns<? super C50J, C76800UCe> interfaceC88472Yns) {
        NavigationScene navigationScene;
        IVideoCropService iVideoCropService;
        NLETrackSlot selectedTrackSlot = LJI().getSelectedTrackSlot();
        if (selectedTrackSlot != null && (navigationScene = this.LJ) != null && (iVideoCropService = (IVideoCropService) this.LJII.getValue()) != null) {
            iVideoCropService.startCrop(navigationScene, this.LIZ, selectedTrackSlot, new AqS168S0100000_2(interfaceC88472Yns, 521));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50A(ActivityC45651qj activity, NavigationScene navigationScene) {
        super(activity);
        o.LJIIIZ(activity, "activity");
        this.LJ = navigationScene;
        this.LJFF = C221108m2.LIZIZ(C123554t5.LJLIL);
        this.LJI = C221108m2.LIZIZ(C50C.LJLIL);
        this.LJII = C221108m2.LIZIZ(C50G.LJLIL);
        this.LJIIIIZZ = C221108m2.LIZIZ(C50E.LJLIL);
        this.LJIIIZ = C221108m2.LIZIZ(C127474zP.LJLIL);
        this.LJIIJ = C221108m2.LIZIZ(C126804yK.LJLIL);
        this.LJIIJJI = C221108m2.LIZIZ(C50D.LJLIL);
    }
}
