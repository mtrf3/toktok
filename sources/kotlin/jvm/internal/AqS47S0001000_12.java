package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C15380j0;
import X.C16880lQ;
import X.C30868C9o;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.graphics.Paint;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* loaded from: classes13.dex */
public class AqS47S0001000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.ngw);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_newgift_toast_3plus)");
        String LLLZ = C16880lQ.LLLZ(LJIILJJIL, Arrays.copyOf(new Object[]{Integer.valueOf(this.i0)}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        C30868C9o.LJI(LLLZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS47S0001000_12 aqS47S0001000_12) {
        aqS47S0001000_12.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS47S0001000_12 aqS47S0001000_12) {
        Paint paint = new Paint(1);
        paint.setColor(aqS47S0001000_12.i0);
        return paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0001000_12(int i, int i2) {
        super(0);
        this.$t = i2;
        this.i0 = i;
    }
}
