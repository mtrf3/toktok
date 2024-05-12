package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.5DF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DF {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(NLEModel nLEModel) {
        boolean LJIIIIZZ = C52B.LJIIIIZZ(nLEModel);
        if (e1.LIZ(31744, "studio_editor_pro_add_magic_after_effect", true, false) || e1.LIZ(31744, "studio_editor_pro_add_magic_after_text", true, false) || LJIIIIZZ) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(String str, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        EditModelProvider.Companion.getClass();
        AnonymousClass585 magicItemController$tools_camera_edit_release = C126784yI.LIZ().getMagicItemController$tools_camera_edit_release();
        if (magicItemController$tools_camera_edit_release == null) {
            return false;
        }
        boolean z7 = magicItemController$tools_camera_edit_release.LJLJL.getBoolean("editor_pro_magic_guide_init", false);
        C5DC editProGuidanceController = C126784yI.LIZ().getEditProGuidanceController();
        boolean z8 = false;
        for (C5DG c5dg : C47261Igj.LJJIJIIJI(C5DG.TRIM_VIDEO, C5DG.SELECT_SLOT, C5DG.TRIM_TEXT_SLOT, C5DG.PINCH_TEXT_SLOT)) {
            if (editProGuidanceController != null && editProGuidanceController.LJI(c5dg)) {
                z8 = true;
            }
        }
        boolean z9 = !z8;
        boolean z10 = C132565Ie.LJJIII.getBoolean("REPO_KEY_SELECT_SLOT", false);
        if (C00F.LIZ(31744, 0, "studio_editor_pro_optimize_enter_experience", true) == 1 && z10) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (C00F.LIZ(31744, 0, "studio_editor_pro_optimize_enter_experience", true) == 2 && C135125Sa.LIZ().getBoolean("func_bar_transition_anim_show", false)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (C00F.LIZ(31744, 0, "studio_editor_pro_optimize_enter_experience", true) == 1 || C00F.LIZ(31744, 0, "studio_editor_pro_optimize_enter_experience", true) == 2) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z3 || z4 || z5) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z || o.LJ(str, "ep_anchor") || z7 || !z9 || z2 || !z6) {
            return false;
        }
        return true;
    }
}
