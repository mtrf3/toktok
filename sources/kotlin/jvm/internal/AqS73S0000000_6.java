package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C34925DnF;
import X.C35060DpQ;
import X.C35532Dx2;
import X.C61878OQg;
import X.C62643OiF;
import X.C76800UCe;
import X.E38;
import X.InterfaceC65784Pro;
import X.ORY;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.video.experiment.JatoBoostConfig;
import java.util.List;

/* loaded from: classes7.dex */
public class AqS73S0000000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S0000000_6(int i) {
        super(0);
        this.$t = i;
    }

    public static final Object invoke$0(AqS73S0000000_6 aqS73S0000000_6) {
        List LJJZZIII;
        SettingsManager.LIZLLL().getClass();
        Object[] objArr = (Object[]) SettingsManager.LJII("aweme_data_prefetch_allow_list", String[].class);
        if (objArr == null || (LJJZZIII = ORY.LJJZZIII(objArr)) == null) {
            return C61878OQg.INSTANCE;
        }
        return LJJZZIII;
    }

    public static final Object invoke$1(AqS73S0000000_6 aqS73S0000000_6) {
        JatoBoostConfig LJIJ = C62643OiF.LJIJ(((Number) C35060DpQ.LIZ.getValue()).longValue());
        if (LJIJ.L()) {
            C35532Dx2.LIZ(LJIJ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS73S0000000_6 aqS73S0000000_6) {
        JatoBoostConfig LJIJ = C62643OiF.LJIJ(((Number) C34925DnF.LIZ.getValue()).longValue());
        if (LJIJ.L()) {
            C35532Dx2.LIZ(LJIJ);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S0000000_6(E38 e38, int i) {
        super(0);
        this.$t = i;
    }
}
