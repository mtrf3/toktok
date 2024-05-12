package X;

import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GCL extends AbstractC65781Prl implements InterfaceC88472Yns<BaseActivityViewModel, C76800UCe> {
    public static final GCL LJLIL = new GCL();

    public GCL() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BaseActivityViewModel baseActivityViewModel) {
        BaseActivityViewModel activityConfiguration = baseActivityViewModel;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(GCM.LJLIL);
        return C76800UCe.LIZ;
    }
}
