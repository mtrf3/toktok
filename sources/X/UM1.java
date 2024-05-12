package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveAlphaGroupAnimOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UM1 extends AbstractC65781Prl implements InterfaceC88472Yns<ConstraintProperty, C76800UCe> {
    public static final UM1 LJLIL = new UM1();

    public UM1() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ConstraintProperty constraintProperty) {
        ConstraintProperty it = constraintProperty;
        o.LJIIIZ(it, "it");
        if (LiveAlphaGroupAnimOptSetting.INSTANCE.getValue()) {
            it.disableNonOverlapping();
        }
        return C76800UCe.LIZ;
    }
}
