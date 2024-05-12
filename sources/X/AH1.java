package X;

import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AH1 extends AbstractC65781Prl implements InterfaceC88472Yns<BaseActivityViewModel, C76800UCe> {
    public static final AH1 LJLIL = new AH1();

    public AH1() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BaseActivityViewModel baseActivityViewModel) {
        BaseActivityViewModel activityConfiguration = baseActivityViewModel;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        final GGT ggt = GGS.LIZ;
        activityConfiguration.config(new TBR(ggt) { // from class: X.AH2
            @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
            public final Object get() {
                this.receiver.getClass();
                return GGS.LIZJ;
            }
        });
        return C76800UCe.LIZ;
    }
}
