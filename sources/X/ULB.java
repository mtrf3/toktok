package X;

import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULB extends LayerSpecImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ULB(LayeredElementContext layeredElementContext) {
        super(layeredElementContext);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        UKC.LIZ(this, R.id.c3x);
        UKC.LIZ(this, R.id.fvx);
        MultiElementSpecImplKt.groupableElement(this, R.id.epp, ULC.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.dqm, ULD.LJLIL);
        MultiElementSpecImplKt.element(this, R.id.fxl);
        MultiElementSpecImplKt.element(this, R.id.kq3);
    }
}
