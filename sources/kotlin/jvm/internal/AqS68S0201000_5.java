package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C28877BUz;
import X.C31371CSx;
import X.C76800UCe;
import X.CT7;
import X.InterfaceC65784Pro;
import com.bytedance.android.livesdk.qa.QuestionEx;

/* loaded from: classes6.dex */
public class AqS68S0201000_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AqS68S0201000_5 aqS68S0201000_5) {
        ((C28877BUz) aqS68S0201000_5.l0).L(aqS68S0201000_5.i2, (QuestionEx) aqS68S0201000_5.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS68S0201000_5 aqS68S0201000_5) {
        ((C28877BUz) aqS68S0201000_5.l0).L(aqS68S0201000_5.i2, (QuestionEx) aqS68S0201000_5.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS68S0201000_5 aqS68S0201000_5) {
        CT7 ct7 = ((C31371CSx) aqS68S0201000_5.l0).LIZJ;
        if (ct7 != null) {
            ct7.notifyItemChanged(aqS68S0201000_5.i2, aqS68S0201000_5.l1);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S0201000_5(C28877BUz c28877BUz, QuestionEx questionEx, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c28877BUz;
        this.l1 = questionEx;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S0201000_5(C31371CSx c31371CSx, int i, Object obj, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c31371CSx;
        this.i2 = i;
        this.l1 = obj;
    }
}
