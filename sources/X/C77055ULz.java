package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveAlphaGroupAnimOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import kotlin.jvm.internal.o;

/* renamed from: X.ULz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77055ULz extends AbstractC65781Prl implements InterfaceC88472Yns<ConstraintProperty, C76800UCe> {
    public static final C77055ULz LJLIL = new C77055ULz();

    public C77055ULz() {
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
