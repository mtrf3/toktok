package X;

import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.EESize;
import com.bytedance.ies.effectcreator.swig.Project;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;

/* renamed from: X.akW, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94656akW extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94656akW(int i, int i2) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Canvas canvasPtr;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("modelchange::changeCanvasSize ");
        LIZ.append(this.LJLIL);
        LIZ.append(' ');
        LIZ.append(this.LJLILLLLZI);
        C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
        Project project = CKEffectEditorContext.LIZIZ;
        if (project != null && (canvasPtr = project.getCanvasPtr()) != null) {
            EESize eESize = new EESize();
            eESize.setWidth(this.LJLIL);
            eESize.setHeight(this.LJLILLLLZI);
            canvasPtr.setCanvasSize(eESize);
        }
        return C76800UCe.LIZ;
    }
}
