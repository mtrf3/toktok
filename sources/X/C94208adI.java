package X;

import com.bytedance.ies.effectcreator.swig.Feature;
import com.ugc.effectcreator.canvas.CanvasFragment;
import com.ugc.effectcreator.canvas.CanvasImpl;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;

/* renamed from: X.adI, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94208adI implements InterfaceC93473aRR {
    public final /* synthetic */ CanvasFragment LIZ;
    public final /* synthetic */ Feature LIZIZ;

    @Override // X.InterfaceC93473aRR
    public final void onCancel() {
    }

    @Override // X.InterfaceC93473aRR
    public final void LIZ() {
        this.LIZ.onEventObjectAction("delete_complete");
        C93890aYA c93890aYA = CKEffectEditorContext.LJFF;
        if (c93890aYA != null) {
            c93890aYA.LIZIZ(C93825aX7.LIZ(this.LIZIZ));
        }
        this.LIZ.getClass();
        CKEffectEditorContext.LJIILJJIL(null);
        CanvasImpl LIZIZ = C93991aZn.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.operateFeature(C93825aX7.LIZ(this.LIZIZ), EnumC93483aRb.DELETE);
        }
    }

    public C94208adI(CanvasFragment canvasFragment, Feature feature) {
        this.LIZ = canvasFragment;
        this.LIZIZ = feature;
    }
}
