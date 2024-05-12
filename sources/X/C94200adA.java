package X;

import com.bytedance.effectcreatormobile.behaviour.BehaviourImpl;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import java.util.List;

/* renamed from: X.adA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94200adA implements InterfaceC93473aRR {
    public final /* synthetic */ C93669aUb LIZ;
    public final /* synthetic */ List LIZIZ;

    @Override // X.InterfaceC93473aRR
    public final void LIZ() {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("interaction_hideobject_checkpop_click", C51029K0z.LJJIIZI(new OSZ("click_button", "Yes")));
        }
        C93991aZn.LIZ().addInvisibleGroup(this.LIZIZ);
        BehaviourImpl LIZIZ = C94048aai.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.notifyCommandListChanged();
        }
    }

    @Override // X.InterfaceC93473aRR
    public final void onCancel() {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("interaction_hideobject_checkpop_click", C51029K0z.LJJIIZI(new OSZ("click_button", "Not now")));
        }
        this.LIZ.LIZ.addNotShowAnymore();
    }

    public C94200adA(C93669aUb c93669aUb, List list) {
        this.LIZ = c93669aUb;
        this.LIZIZ = list;
    }
}
