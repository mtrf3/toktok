package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C72207SVn;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import com.bytedance.tux.input.TuxTextView;

/* loaded from: classes13.dex */
public class AqS18S0102000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

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

    public static final Object invoke$0(AqS18S0102000_12 aqS18S0102000_12) {
        super/*androidx.appcompat.widget.AppCompatTextView*/.onMeasure(aqS18S0102000_12.i1, aqS18S0102000_12.i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS18S0102000_12 aqS18S0102000_12) {
        ((C72207SVn) aqS18S0102000_12.l0).LIZJ(aqS18S0102000_12.i1, aqS18S0102000_12.i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS18S0102000_12 aqS18S0102000_12) {
        ((C72207SVn) aqS18S0102000_12.l0).LIZLLL(aqS18S0102000_12.i1, aqS18S0102000_12.i2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS18S0102000_12(int i, int i2, TuxTextView tuxTextView, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = tuxTextView;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS18S0102000_12(C72207SVn c72207SVn, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c72207SVn;
        this.i1 = i;
        this.i2 = i2;
    }
}
