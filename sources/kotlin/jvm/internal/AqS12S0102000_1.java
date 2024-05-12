package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C43045Guv;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.W5G;
import android.graphics.Bitmap;
import com.zhiliaoapp.musically.R;

/* loaded from: classes2.dex */
public class AqS12S0102000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

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
    public AqS12S0102000_1(Runnable runnable, int i) {
        super(1);
        this.$t = i;
        this.i1 = R.string.h8m;
        this.i2 = R.string.h4j;
        this.l0 = runnable;
    }

    public static final Object invoke$0(AqS12S0102000_1 aqS12S0102000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(aqS12S0102000_1.i1, new AqS167S0100000_1((Runnable) aqS12S0102000_1.l0, 169));
        actionGroup.LJIIIIZZ(aqS12S0102000_1.i2, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS12S0102000_1 aqS12S0102000_1, Object obj) {
        Bitmap it = (Bitmap) obj;
        o.LJIIIZ(it, "it");
        if (!it.isRecycled()) {
            C43045Guv.LIZLLL(new AqS8S0202000_1((W5G) aqS12S0102000_1.l0, it, aqS12S0102000_1.i1, aqS12S0102000_1.i2, 0), 0L);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S0102000_1(W5G w5g, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = w5g;
        this.i1 = i;
        this.i2 = i2;
    }
}
