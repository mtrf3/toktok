package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UKS extends AbstractC65781Prl implements InterfaceC88472Yns<ConstraintProperty, C76800UCe> {
    public static final UKS LJLIL = new UKS();

    public UKS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ConstraintProperty constraintProperty) {
        ConstraintProperty it = constraintProperty;
        o.LJIIIZ(it, "it");
        it.constrainHeight(C15380j0.LIZ(22.0f));
        it.apply();
        return C76800UCe.LIZ;
    }
}
