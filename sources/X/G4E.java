package X;

import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G4E extends AbstractC65781Prl implements InterfaceC88472Yns<BaseActivityViewModel, C76800UCe> {
    public static final G4E LJLIL = new G4E();

    public G4E() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BaseActivityViewModel baseActivityViewModel) {
        BaseActivityViewModel activityConfiguration = baseActivityViewModel;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(G4F.LJLIL);
        activityConfiguration.config(G4G.LJLIL);
        activityConfiguration.config(G4D.LJLIL);
        return C76800UCe.LIZ;
    }
}
