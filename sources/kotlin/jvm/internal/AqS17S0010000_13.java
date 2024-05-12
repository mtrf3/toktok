package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.EnumC77147UPn;
import X.InterfaceC88472Yns;
import X.URJ;
import X.USH;

/* loaded from: classes14.dex */
public class AqS17S0010000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public boolean z0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S0010000_13(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AqS17S0010000_13 aqS17S0010000_13, Object obj) {
        USH pipelineConfig = (USH) obj;
        o.LJIIIZ(pipelineConfig, "$this$pipelineConfig");
        pipelineConfig.LIZ(EnumC77147UPn.CONTACT);
        pipelineConfig.LIZIZ = aqS17S0010000_13.z0;
        pipelineConfig.LIZIZ(URJ.DIALOG_ACTUAL);
        pipelineConfig.LIZLLL = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS17S0010000_13 aqS17S0010000_13, Object obj) {
        USH pipelineConfig = (USH) obj;
        o.LJIIIZ(pipelineConfig, "$this$pipelineConfig");
        pipelineConfig.LIZ(EnumC77147UPn.FACEBOOK);
        pipelineConfig.LIZIZ = aqS17S0010000_13.z0;
        pipelineConfig.LIZIZ(URJ.DIALOG_ACTUAL);
        pipelineConfig.LIZLLL = true;
        return C76800UCe.LIZ;
    }
}
