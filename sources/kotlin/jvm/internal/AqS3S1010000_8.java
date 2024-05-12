package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C47300IhM;
import X.C76800UCe;
import X.InterfaceC65784Pro;

/* loaded from: classes9.dex */
public class AqS3S1010000_8 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;
    public boolean z1;

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

    public static final Object invoke$0(AqS3S1010000_8 aqS3S1010000_8) {
        String str;
        C47300IhM c47300IhM = C47300IhM.LIZ;
        String str2 = aqS3S1010000_8.s0;
        boolean z = aqS3S1010000_8.z1;
        c47300IhM.getClass();
        Object LIZJ = C47300IhM.LIZJ(str2, z);
        if (LIZJ != null) {
            str = LIZJ.toString();
        } else {
            str = null;
        }
        C47300IhM.LIZLLL(aqS3S1010000_8.s0, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS3S1010000_8 aqS3S1010000_8) {
        String str;
        C47300IhM c47300IhM = C47300IhM.LIZ;
        String str2 = aqS3S1010000_8.s0;
        boolean z = aqS3S1010000_8.z1;
        c47300IhM.getClass();
        Object LIZJ = C47300IhM.LIZJ(str2, z);
        if (LIZJ != null) {
            str = LIZJ.toString();
        } else {
            str = null;
        }
        C47300IhM.LIZLLL(aqS3S1010000_8.s0, str);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S1010000_8(String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }
}
