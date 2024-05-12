package X;

import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G4U extends AbstractC65781Prl implements InterfaceC88472Yns<BaseActivityViewModel, C76800UCe> {
    public static final G4U LJLIL = new G4U();

    public G4U() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BaseActivityViewModel baseActivityViewModel) {
        BaseActivityViewModel activityConfiguration = baseActivityViewModel;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(G4V.LJLIL);
        return C76800UCe.LIZ;
    }
}
