package X;

import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UL5 extends AbstractC65781Prl implements InterfaceC88472Yns<ConstraintProperty, C76800UCe> {
    public static final UL5 LJLIL = new UL5();

    public UL5() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ConstraintProperty constraintProperty) {
        ConstraintProperty constraintProperty2 = constraintProperty;
        o.LJIIIZ(constraintProperty2, "constraintProperty");
        if (TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.shouldOptimize()) {
            constraintProperty2.removeConstraints(3);
            constraintProperty2.removeConstraints(4);
            constraintProperty2.connect(3, R.id.j3c, 3, 0);
            constraintProperty2.connect(4, R.id.j3c, 4, 0);
        }
        return C76800UCe.LIZ;
    }
}
