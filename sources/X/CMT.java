package X;

import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.AqS155S0100000_5;

/* loaded from: classes6.dex */
public final class CMT extends ElementSpecImpl {
    public final LayeredElementContext LJLIL;
    public final C5H3<ValueAnimator> LJLILLLLZI;
    public boolean LJLJI;

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void onDispose() {
        super.onDispose();
        if (this.LJLILLLLZI.isInitialized() && this.LJLILLLLZI.getValue().isRunning()) {
            this.LJLILLLLZI.getValue().cancel();
            ConstraintProperty constraintPropertyById = this.LJLIL.getConstraintPropertyById(getId());
            if (constraintPropertyById != null) {
                constraintPropertyById.alpha(1.0f);
            }
        }
        this.LJLJI = false;
    }

    public CMT(LayeredElementContext layeredElementContext) {
        super(C77068UMm.LIZIZ);
        this.LJLIL = layeredElementContext;
        this.LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 338));
    }
}
