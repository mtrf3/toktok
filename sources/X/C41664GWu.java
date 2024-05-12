package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GWu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41664GWu implements InterfaceC41657GWn {
    public final /* synthetic */ InterfaceC41667GWx LIZ;
    public final /* synthetic */ InterfaceC88471Ynr<Integer, C165436eR, C76800UCe> LIZIZ;
    public final /* synthetic */ AwemeDraft LIZJ;

    @Override // X.InterfaceC41657GWn
    public final void LIZ(C41656GWm c41656GWm) {
        VideoPublishEditModel videoPublishEditModel;
        EditorProModel editorProModel;
        C78847Ux1.LJJIJ(c41656GWm.LIZ, ((C41665GWv) this.LIZ).LIZ);
        if (C19N.LJ("prevent_enter_editor_pro_draft", false) && (videoPublishEditModel = c41656GWm.LIZIZ) != null && (editorProModel = videoPublishEditModel.getEditorProModel()) != null && editorProModel.isAdvancedEditDraft()) {
            InterfaceC88471Ynr<Integer, C165436eR, C76800UCe> interfaceC88471Ynr = this.LIZIZ;
            AwemeDraft awemeDraft = this.LIZJ;
            String string = ((C41665GWv) this.LIZ).LIZ.getString(R.string.dhm);
            o.LJIIIIZZ(string, "proxy.context.getString(…dnt_edit_try_again_later)");
            interfaceC88471Ynr.invoke(2, new C165436eR(-6, awemeDraft, c41656GWm, string, true));
            return;
        }
        this.LIZIZ.invoke(2, C5DB.LIZ(this.LIZJ, 0, null, c41656GWm, true, 2));
    }

    @Override // X.InterfaceC41657GWn
    public final void LIZIZ(C41656GWm c41656GWm) {
        C78847Ux1.LJJIJ(c41656GWm.LIZ, ((C41665GWv) this.LIZ).LIZ);
        this.LIZIZ.invoke(2, C5DB.LIZ(this.LIZJ, -1, null, null, false, 14));
    }

    public C41664GWu(AwemeDraft awemeDraft, C41665GWv c41665GWv, C41651GWh c41651GWh) {
        this.LIZ = c41665GWv;
        this.LIZIZ = c41651GWh;
        this.LIZJ = awemeDraft;
    }
}
