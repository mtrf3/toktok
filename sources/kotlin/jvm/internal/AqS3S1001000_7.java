package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C145995oB;
import X.C76800UCe;
import X.InterfaceC88472Yns;

/* loaded from: classes8.dex */
public class AqS3S1001000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS3S1001000_7 aqS3S1001000_7, Object obj) {
        C145995oB mobDownloadStatus = (C145995oB) obj;
        o.LJIIIZ(mobDownloadStatus, "$this$mobDownloadStatus");
        mobDownloadStatus.LIZ(aqS3S1001000_7.i1, "error_code");
        String str = aqS3S1001000_7.s0;
        if (str == null) {
            str = "";
        }
        mobDownloadStatus.LIZLLL("error_msg", str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS3S1001000_7 aqS3S1001000_7, Object obj) {
        C145995oB mobProcess = (C145995oB) obj;
        o.LJIIIZ(mobProcess, "$this$mobProcess");
        mobProcess.LIZ(aqS3S1001000_7.i1, "error_code");
        mobProcess.LIZLLL("error_msg", aqS3S1001000_7.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS3S1001000_7 aqS3S1001000_7, Object obj) {
        C145995oB mobProcess = (C145995oB) obj;
        o.LJIIIZ(mobProcess, "$this$mobProcess");
        mobProcess.LIZ(aqS3S1001000_7.i1, "error_code");
        mobProcess.LIZLLL("error_msg", aqS3S1001000_7.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S1001000_7(int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }
}
