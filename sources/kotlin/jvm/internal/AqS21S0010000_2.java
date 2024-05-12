package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C143205jg;
import X.InterfaceC65784Pro;
import X.X1D;

/* loaded from: classes3.dex */
public class AqS21S0010000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public boolean z0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS21S0010000_2 aqS21S0010000_2) {
        if (!aqS21S0010000_2.z0) {
            return "no neccessary to preload";
        }
        return "preload effect watermark succeeded";
    }

    public static final Object invoke$1(AqS21S0010000_2 aqS21S0010000_2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isFullScreenDevice: ");
        LIZ.append(((Boolean) C143205jg.LIZ.getValue()).booleanValue());
        LIZ.append(", width: ");
        LIZ.append(C143205jg.LJ());
        LIZ.append(", height: ");
        LIZ.append(C143205jg.LIZLLL());
        LIZ.append(", ABValue: ");
        LIZ.append(aqS21S0010000_2.z0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$2(AqS21S0010000_2 aqS21S0010000_2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isNeedAdapterFullScreenRecordDraft: ");
        LIZ.append(aqS21S0010000_2.z0);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS21S0010000_2(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
