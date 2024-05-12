package X;

import com.bytedance.android.livesdk.livesetting.watchlive.EnableCacheLastSelectDefinitionSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UKQ extends AbstractC65781Prl implements InterfaceC88472Yns<ConstraintProperty, C76800UCe> {
    public static final UKQ LJLIL = new UKQ();

    public UKQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ConstraintProperty constraintProperty) {
        ConstraintProperty it = constraintProperty;
        o.LJIIIZ(it, "it");
        if (EnableCacheLastSelectDefinitionSetting.INSTANCE.isEnableAutoTips()) {
            int LIZ = C15380j0.LIZ(351.0f);
            if (C15380j0.LJIIL() / C15380j0.LIZ(375.0f) < 1.0f) {
                LIZ = (int) ((C15380j0.LJIIL() / C15380j0.LIZ(375.0f)) * LIZ);
            }
            it.constrainWidth(LIZ);
            it.connect(4, 0, 4, C15380j0.LIZ(70.0f));
            it.apply();
        } else {
            it.constrainHeight(-2);
            it.constrainWidth(0);
            it.connect(4, R.id.apg, 3, 0);
            it.apply();
        }
        return C76800UCe.LIZ;
    }
}
