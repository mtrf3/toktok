package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import android.graphics.Paint;

/* loaded from: classes4.dex */
public class AqS42S0001000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i0;

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

    public static final Object invoke$0(AqS42S0001000_3 aqS42S0001000_3) {
        Paint paint = new Paint(1);
        paint.setColor(aqS42S0001000_3.i0);
        return paint;
    }

    public static final Object invoke$1(AqS42S0001000_3 aqS42S0001000_3) {
        return Integer.valueOf(aqS42S0001000_3.i0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS42S0001000_3(int i, int i2) {
        super(0);
        this.$t = i2;
        this.i0 = i;
    }
}
