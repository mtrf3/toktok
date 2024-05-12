package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UK3 extends AbstractC65781Prl implements InterfaceC88472Yns<ConstraintProperty, C76800UCe> {
    public static final UK3 LJLIL = new UK3();

    public UK3() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ConstraintProperty constraintProperty) {
        ConstraintProperty constraintProperty2 = constraintProperty;
        o.LJIIIZ(constraintProperty2, "constraintProperty");
        constraintProperty2.constrainMaxWidth(C15380j0.LIZ(150.0f));
        constraintProperty2.apply();
        return C76800UCe.LIZ;
    }
}
