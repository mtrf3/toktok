package X;

import com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;

/* renamed from: X.aee, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94292aee implements InterfaceC93473aRR {
    public final /* synthetic */ EffectLayerEditorFragment LIZ;
    public final /* synthetic */ AbstractC94471ahX LIZIZ;
    public final /* synthetic */ C94291aed LIZJ;

    @Override // X.InterfaceC93473aRR
    public final void onCancel() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC93473aRR
    public final void LIZ() {
        C93890aYA c93890aYA = CKEffectEditorContext.LJFF;
        if (c93890aYA != null && c93890aYA.LIZIZ(this.LIZIZ.LJFF().LJLIL)) {
            this.LIZ.onEventObjectAction("delete_complete");
            Long l = (Long) CKEffectEditorContext.LJIIIIZZ.getValue();
            long j = this.LIZIZ.LJFF().LJLIL;
            if (l != null && l.longValue() == j) {
                CKEffectEditorContext.LJIILJJIL(null);
            }
            ILayer iLayer = (ILayer) C93971aZT.LIZ().LIZ(ILayer.class);
            if (iLayer != null) {
                iLayer.updateLayerEvent(this.LIZIZ.LJFF().LJLIL, this.LIZJ.LIZ);
            }
        }
    }

    public C94292aee(EffectLayerEditorFragment effectLayerEditorFragment, AbstractC94471ahX abstractC94471ahX, C94291aed c94291aed) {
        this.LIZ = effectLayerEditorFragment;
        this.LIZIZ = abstractC94471ahX;
        this.LIZJ = c94291aed;
    }
}
