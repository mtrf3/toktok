package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import kotlin.jvm.internal.o;

/* renamed from: X.ULy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77054ULy extends AbstractC65781Prl implements InterfaceC88472Yns<ConstraintProperty, C76800UCe> {
    public static final C77054ULy LJLIL = new C77054ULy();

    public C77054ULy() {
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