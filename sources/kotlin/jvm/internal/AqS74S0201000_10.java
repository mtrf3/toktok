package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC60850NuQ;
import X.InterfaceC60949Nw1;
import X.InterfaceC88471Ynr;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkPopup;

/* loaded from: classes11.dex */
public class AqS74S0201000_10 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS74S0201000_10 aqS74S0201000_10, Object obj, Object obj2) {
        InterfaceC60850NuQ receiver = (InterfaceC60850NuQ) obj;
        SparkActivity baseActivity = (SparkActivity) obj2;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(baseActivity, "baseActivity");
        receiver.LJJIJIL(baseActivity, aqS74S0201000_10.i2, (String[]) aqS74S0201000_10.l0, (int[]) aqS74S0201000_10.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS74S0201000_10 aqS74S0201000_10, Object obj, Object obj2) {
        InterfaceC60949Nw1 receiver = (InterfaceC60949Nw1) obj;
        SparkPopup popup = (SparkPopup) obj2;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(popup, "popup");
        receiver.LJIIZILJ(popup, aqS74S0201000_10.i2, (String[]) aqS74S0201000_10.l0, (int[]) aqS74S0201000_10.l1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS74S0201000_10(int i, String[] strArr, int[] iArr, int i2) {
        super(2);
        this.$t = i2;
        this.i2 = i;
        this.l0 = strArr;
        this.l1 = iArr;
    }
}
