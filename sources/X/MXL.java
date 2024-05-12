package X;

import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MXL extends AbstractC65781Prl implements InterfaceC88472Yns<BaseActivityViewModel, C76800UCe> {
    public static final MXL LJLIL = new MXL();

    public MXL() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BaseActivityViewModel baseActivityViewModel) {
        BaseActivityViewModel activityConfiguration = baseActivityViewModel;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(MXM.LJLIL);
        activityConfiguration.config(GDM.LJLIL);
        activityConfiguration.config(MXN.LJLIL);
        return C76800UCe.LIZ;
    }
}
