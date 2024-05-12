package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;

/* renamed from: X.UKq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77020UKq extends C77023UKt {
    public C77020UKq() {
        super(R.id.jz4);
        addSceneObserver(new C77021UKr(this));
        ElementSpecImplKt.onAttach(this, new AqS179S0100000_13(this, 618));
        bindGroup(C77019UKp.LIZLLL);
    }

    public static void LIZ(ConstraintProperty constraintProperty, boolean z) {
        if (z) {
            constraintProperty.margin(6, C15380j0.LIZ(32.0f));
            constraintProperty.apply();
        } else {
            constraintProperty.margin(6, C15380j0.LIZ(16.0f));
            constraintProperty.apply();
        }
    }
}
