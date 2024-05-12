package X;

import com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.PreviewViewModel;

/* renamed from: X.ahT, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94467ahT extends C94254ae2 {
    public final /* synthetic */ BehaviourPreviewFragment LIZ;
    public final /* synthetic */ AbstractC94370afu LIZIZ;

    public C94467ahT(BehaviourPreviewFragment behaviourPreviewFragment, AbstractC94370afu abstractC94370afu) {
        this.LIZ = behaviourPreviewFragment;
        this.LIZIZ = abstractC94370afu;
    }

    @Override // X.InterfaceC93791aWZ
    public final boolean LLZIL(boolean z, boolean z2, boolean z3) {
        if (!z2 || !this.LIZ.Jl().LJLJI || z3) {
            return false;
        }
        PreviewViewModel Jl = this.LIZ.Jl();
        if (Jl.LJLJI) {
            Jl.LJLJI = false;
            Jl.jv0(null);
        }
        this.LIZ.Ll(this.LIZIZ);
        return true;
    }
}
