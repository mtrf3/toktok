package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C94378ag2;
import X.InterfaceC88472Yns;
import android.widget.ImageView;

/* loaded from: classes34.dex */
public class IDqS1S0001000_42 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

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
    public IDqS1S0001000_42(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(IDqS1S0001000_42 iDqS1S0001000_42, Object obj) {
        ImageView iv = (ImageView) obj;
        o.LJIIIZ(iv, "iv");
        iv.setImageResource(iDqS1S0001000_42.i0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS1S0001000_42 iDqS1S0001000_42, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C94378ag2(iDqS1S0001000_42.i0);
    }
}
