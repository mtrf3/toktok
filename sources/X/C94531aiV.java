package X;

import android.view.View;
import com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.IDqS31S0300000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aiV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94531aiV extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C94530aiU LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94531aiV(int i, View view, C94530aiU c94530aiU) {
        super(0);
        this.LJLIL = c94530aiU;
        this.LJLILLLLZI = view;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (this.LJLILLLLZI.getVisibility() == 0) {
            C94530aiU c94530aiU = this.LJLIL;
            BehaviourPreviewFragment behaviourPreviewFragment = c94530aiU.LJLIL;
            View view = this.LJLILLLLZI;
            AbstractC94370afu abstractC94370afu = c94530aiU.LJLILLLLZI;
            int i = this.LJLJI;
            behaviourPreviewFragment.getClass();
            C93790aWY c93790aWY = C93792aWa.LJII;
            ActivityC45651qj requireActivity = behaviourPreviewFragment.requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C94467ahT c94467ahT = new C94467ahT(behaviourPreviewFragment, abstractC94370afu);
            C93792aWa c93792aWa = behaviourPreviewFragment.LJLJL;
            if (c93792aWa != null) {
                C93790aWY.LIZ(c93790aWY, requireActivity, 1, view, c94467ahT, c93792aWa, false, 32);
                C93747aVr.LIZIZ(view, behaviourPreviewFragment.LJLJJI, new IDqS31S0300000_42(behaviourPreviewFragment, abstractC94370afu, (AbstractC94372afw) ListProtector.get(abstractC94370afu.LJI(), i), 3));
            } else {
                o.LJIJI("touchHelper");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
