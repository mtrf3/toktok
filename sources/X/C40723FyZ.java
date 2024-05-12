package X;

import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.FyZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40723FyZ extends AbstractC65781Prl implements InterfaceC88472Yns<BaseActivityViewModel, C76800UCe> {
    public static final C40723FyZ LJLIL = new C40723FyZ();

    public C40723FyZ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BaseActivityViewModel baseActivityViewModel) {
        BaseActivityViewModel activityConfiguration = baseActivityViewModel;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(C40727Fyd.LJLIL);
        activityConfiguration.config(C40724Fya.LJLIL);
        if (C36152EGu.LIZIZ(FDW.LJLIL)) {
            activityConfiguration.config(C40728Fye.LJLIL);
        }
        return C76800UCe.LIZ;
    }
}
