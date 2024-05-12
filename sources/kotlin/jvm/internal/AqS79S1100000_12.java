package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C72207SVn;
import X.C72209SVp;
import X.C72710SgE;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.gamora.recorder.navi.core.EffectDependencyLoader;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes13.dex */
public class AqS79S1100000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS79S1100000_12 aqS79S1100000_12) {
        ((C72209SVp) aqS79S1100000_12.l1).setSubTitle(aqS79S1100000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS79S1100000_12 aqS79S1100000_12) {
        ((C72209SVp) aqS79S1100000_12.l1).setTitle(aqS79S1100000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS79S1100000_12 aqS79S1100000_12) {
        ((C72207SVn) aqS79S1100000_12.l1).setRating(aqS79S1100000_12.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS79S1100000_12 aqS79S1100000_12) {
        ((EffectDependencyLoader) aqS79S1100000_12.l1).LJLJI.add(aqS79S1100000_12.s0);
        if (((EffectDependencyLoader) aqS79S1100000_12.l1).LJLJJI.containsKey(aqS79S1100000_12.s0)) {
            List<C72710SgE> list = (List) ((LinkedHashMap) ((EffectDependencyLoader) aqS79S1100000_12.l1).LJLJJI).get(aqS79S1100000_12.s0);
            if (list != null && !list.isEmpty()) {
                for (C72710SgE c72710SgE : list) {
                    ((EffectDependencyLoader) aqS79S1100000_12.l1).LIZIZ(c72710SgE.LJLIL, c72710SgE.LJLILLLLZI, c72710SgE.LJLJI, c72710SgE.LJLJJI);
                }
            }
            ((EffectDependencyLoader) aqS79S1100000_12.l1).LJLJJI.remove(aqS79S1100000_12.s0);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS79S1100000_12(C72207SVn c72207SVn, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c72207SVn;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS79S1100000_12(C72209SVp c72209SVp, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c72209SVp;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS79S1100000_12(EffectDependencyLoader effectDependencyLoader, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = effectDependencyLoader;
        this.s0 = str;
    }
}
