package X;

import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.Project;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;

/* renamed from: X.aeQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94278aeQ implements InterfaceC93942aZ0 {
    @Override // X.InterfaceC93942aZ0
    public final void LIZ() {
        Canvas canvasPtr;
        C94034aaU.LIZ("CKE-editor", "modelchange::onInputRTChanged invoke");
        Project project = CKEffectEditorContext.LIZIZ;
        if (project != null && (canvasPtr = project.getCanvasPtr()) != null) {
            canvasPtr.onInputRTChanged();
        }
    }
}
