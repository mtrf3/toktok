package X;

import com.bytedance.android.livesdk.livesetting.watchlive.EnableCacheLastSelectDefinitionSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UKR extends AbstractC65781Prl implements InterfaceC88472Yns<ConstraintProperty, C76800UCe> {
    public static final UKR LJLIL = new UKR();

    public UKR() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ConstraintProperty constraintProperty) {
        ConstraintProperty it = constraintProperty;
        o.LJIIIZ(it, "it");
        it.removeConstraints(6);
        it.removeConstraints(7);
        if (EnableCacheLastSelectDefinitionSetting.INSTANCE.isEnableAutoTips()) {
            int LIZ = C15380j0.LIZ(451.0f);
            if (C15380j0.LJIIL() / C15380j0.LIZ(375.0f) < 1.0f) {
                LIZ = (int) ((C15380j0.LJIIL() / C15380j0.LIZ(375.0f)) * LIZ);
            }
            it.constrainWidth(LIZ);
            it.connect(6, 0, 6, 0);
            it.connect(7, 0, 7, 0);
            it.connect(4, 0, 4, C15380j0.LIZ(48.0f));
            it.apply();
        } else {
            it.constrainHeight(-2);
            it.constrainWidth(0);
            it.connect(6, 0, 6, 0);
            it.connect(7, 0, 7, 0);
            it.connect(4, 0, 4, C15380j0.LIZ(16.0f));
            it.apply();
        }
        return C76800UCe.LIZ;
    }
}
