package X;

import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GCQ extends AbstractC65781Prl implements InterfaceC88472Yns<BaseActivityViewModel, C76800UCe> {
    public static final GCQ LJLIL = new GCQ();

    public GCQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BaseActivityViewModel baseActivityViewModel) {
        BaseActivityViewModel activityConfiguration = baseActivityViewModel;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(GCP.LJLIL);
        activityConfiguration.config(GCR.LJLIL);
        return C76800UCe.LIZ;
    }
}
