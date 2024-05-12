package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.X1D;
import com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem;
import com.ss.android.ugc.aweme.main.assems.main.MainActivityLogAssem;

/* loaded from: classes7.dex */
public class AqS63S0110000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AqS63S0110000_6 aqS63S0110000_6) {
        ((LoginAndConsentAssem) aqS63S0110000_6.l0).v3(aqS63S0110000_6.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS63S0110000_6 aqS63S0110000_6) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReleaseInstance ");
        LIZ.append((MainActivityLogAssem) aqS63S0110000_6.l0);
        LIZ.append(' ');
        LIZ.append(aqS63S0110000_6.z1);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$2(AqS63S0110000_6 aqS63S0110000_6) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStop ");
        LIZ.append((MainActivityLogAssem) aqS63S0110000_6.l0);
        LIZ.append(" isConfigurationChanging=");
        LIZ.append(aqS63S0110000_6.z1);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S0110000_6(LoginAndConsentAssem loginAndConsentAssem, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = loginAndConsentAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S0110000_6(MainActivityLogAssem mainActivityLogAssem, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = mainActivityLogAssem;
        this.z1 = z;
    }
}
