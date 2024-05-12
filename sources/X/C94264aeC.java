package X;

import com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;

/* renamed from: X.aeC, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94264aeC implements InterfaceC93473aRR {
    public final /* synthetic */ BehaviourPreviewFragment LIZ;
    public final /* synthetic */ AbstractC94370afu LIZIZ;

    @Override // X.InterfaceC93473aRR
    public final void onCancel() {
    }

    @Override // X.InterfaceC93473aRR
    public final void LIZ() {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("interaction_command_action", C51029K0z.LJJIIZI(new OSZ("action_type", "delete_command_complete")));
        }
        this.LIZ.Jl().iv0(this.LIZIZ);
    }

    public C94264aeC(BehaviourPreviewFragment behaviourPreviewFragment, AbstractC94370afu abstractC94370afu) {
        this.LIZ = behaviourPreviewFragment;
        this.LIZIZ = abstractC94370afu;
    }
}
