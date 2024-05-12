package X;

import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MQK extends AbstractC65781Prl implements InterfaceC88472Yns<BaseActivityViewModel, C76800UCe> {
    public static final MQK LJLIL = new MQK();

    public MQK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BaseActivityViewModel baseActivityViewModel) {
        BaseActivityViewModel activityConfiguration = baseActivityViewModel;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(MRC.LJLIL);
        return C76800UCe.LIZ;
    }
}
