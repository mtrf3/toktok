package X;

import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.Project;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;

/* renamed from: X.akY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94658akY extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94658akY(String str) {
        super(0);
        this.LJLIL = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Canvas canvasPtr;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("modelchange::scaleFactor ");
        LIZ.append(this.LJLIL);
        LIZ.append(' ');
        C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
        Project project = CKEffectEditorContext.LIZIZ;
        if (project != null && (canvasPtr = project.getCanvasPtr()) != null) {
            canvasPtr.setScaleFactor(this.LJLIL);
        }
        return C76800UCe.LIZ;
    }
}
