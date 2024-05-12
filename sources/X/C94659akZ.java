package X;

import com.bytedance.ies.effectcreator.swig.Project;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;

/* renamed from: X.akZ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94659akZ extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94659akZ(boolean z) {
        super(0);
        this.LJLIL = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Project project = CKEffectEditorContext.LIZIZ;
        if (project != null) {
            project.setUseSensorOrientationForAlgorithm(this.LJLIL);
        }
        return C76800UCe.LIZ;
    }
}
