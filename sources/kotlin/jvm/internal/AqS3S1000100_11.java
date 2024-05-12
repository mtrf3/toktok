package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.R1V;
import X.R1W;

/* loaded from: classes12.dex */
public class AqS3S1000100_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS3S1000100_11 aqS3S1000100_11) {
        long j = R1W.LIZIZ().getLong(aqS3S1000100_11.s0, 0L);
        String str = aqS3S1000100_11.s0;
        if (o.LJ(str, "prepare_time") || o.LJ(str, "total_time")) {
            R1W.LIZIZ().storeLong(aqS3S1000100_11.s0, aqS3S1000100_11.j1);
        } else {
            R1W.LIZIZ().storeLong(aqS3S1000100_11.s0, j + aqS3S1000100_11.j1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS3S1000100_11 aqS3S1000100_11) {
        long j = R1V.LIZIZ().getLong(aqS3S1000100_11.s0, 0L);
        String str = aqS3S1000100_11.s0;
        if (o.LJ(str, "prepare_time") || o.LJ(str, "total_time")) {
            R1V.LIZIZ().storeLong(aqS3S1000100_11.s0, aqS3S1000100_11.j1);
        } else {
            R1V.LIZIZ().storeLong(aqS3S1000100_11.s0, j + aqS3S1000100_11.j1);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S1000100_11(String str, long j, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
