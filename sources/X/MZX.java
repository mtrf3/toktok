package X;

import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MZX extends AbstractC65781Prl implements InterfaceC88472Yns<BaseActivityViewModel, C76800UCe> {
    public static final MZX LJLIL = new MZX();

    public MZX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BaseActivityViewModel baseActivityViewModel) {
        BaseActivityViewModel activityConfiguration = baseActivityViewModel;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(C57023MZn.LJLIL);
        activityConfiguration.config(C57024MZo.LJLIL);
        activityConfiguration.config(GDO.LJLIL);
        return C76800UCe.LIZ;
    }
}
