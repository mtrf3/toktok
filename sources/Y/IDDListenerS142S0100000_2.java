package Y;

import X.ASQ;
import X.AST;
import X.C134625Qc;
import X.C145995oB;
import X.C5Z7;
import X.C5Z8;
import X.C5Z9;
import X.C84661XKn;
import X.FMX;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel;
import com.ss.android.ugc.gamora.editor.sticker.nature.EditSelectNatureSpeciesDialogFragment;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDDListenerS142S0100000_2 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            case 2:
                onDismiss$2(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDDListenerS142S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS142S0100000_2 iDDListenerS142S0100000_2, DialogInterface dialogInterface) {
        EditCapCutViewModel capCutViewModel = ((EditorProScene) iDDListenerS142S0100000_2.l0).getCapCutViewModel();
        C84661XKn c84661XKn = capCutViewModel.LJLJLLL;
        if (c84661XKn != null) {
            c84661XKn.LIZIZ(null);
        }
        capCutViewModel.LJLJLLL = null;
        VideoPublishEditModel videoPublishEditModel = capCutViewModel.LJLLI;
        if (videoPublishEditModel != null) {
            String creationId = videoPublishEditModel.getCreationId();
            o.LJIIIIZZ(creationId, "it.creationId");
            C134625Qc.LIZ(creationId, "cancel", capCutViewModel.Jv0());
        }
        capCutViewModel.Mv0(true, false);
        capCutViewModel.LJLLI = null;
        capCutViewModel.LJLL = null;
    }

    public static final void onDismiss$1(IDDListenerS142S0100000_2 iDDListenerS142S0100000_2, DialogInterface it) {
        String str;
        o.LJIIIIZZ(it, "it");
        AST LJIIIIZZ = ASQ.LJIIIIZZ(it);
        if (LJIIIIZZ instanceof C5Z8) {
            str = "click_ok";
        } else if (LJIIIIZZ instanceof C5Z9) {
            str = "click_x";
        } else {
            str = "other";
        }
        Map LIZ = C5Z7.LIZ((VideoPublishEditModel) iDDListenerS142S0100000_2.l0);
        ((HashMap) LIZ).put("close_method", str);
        FMX.LJIIL("posted_draft_guide_sheet_dismiss", LIZ);
    }

    public static final void onDismiss$2(IDDListenerS142S0100000_2 iDDListenerS142S0100000_2, DialogInterface dialogInterface) {
        if (((EditSelectNatureSpeciesDialogFragment) iDDListenerS142S0100000_2.l0).vl().getVisibility() == 0) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LIZJ(1, "no_species");
            FMX.LJIIL("close_nature_sticker", c145995oB.LIZ);
        } else {
            C145995oB c145995oB2 = new C145995oB();
            c145995oB2.LIZJ(0, "no_species");
            FMX.LJIIL("close_nature_sticker", c145995oB2.LIZ);
        }
    }
}
