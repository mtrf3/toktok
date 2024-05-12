package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C76800UCe;
import X.C94350afa;
import X.C94379ag3;
import X.InterfaceC88472Yns;
import X.W5F;
import X.W5U;
import android.widget.ImageView;

/* loaded from: classes34.dex */
public class IDqS9S1000000_42 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(ImageView imageView) {
        o.LJIIIZ(imageView, "imageView");
        W5F LJIIIIZZ = W5U.LJIIIIZZ(this.s0);
        LJIIIIZZ.LIZLLL = true;
        LJIIIIZZ.LJJIIJZLJL = imageView;
        C16880lQ.LLJJJ(LJIIIIZZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS9S1000000_42(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(IDqS9S1000000_42 iDqS9S1000000_42, Object obj) {
        iDqS9S1000000_42.invoke$0((ImageView) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS9S1000000_42 iDqS9S1000000_42, Object obj) {
        C94350afa setState = (C94350afa) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C94350afa.L(setState, 0, null, null, iDqS9S1000000_42.s0, 7);
    }

    public static final Object invoke$2(IDqS9S1000000_42 iDqS9S1000000_42, Object obj) {
        C94379ag3 setState = (C94379ag3) obj;
        o.LJIIIZ(setState, "$this$setState");
        String str = iDqS9S1000000_42.s0;
        return C94379ag3.L(setState, str, str, false, null, 12);
    }

    public static final Object invoke$3(IDqS9S1000000_42 iDqS9S1000000_42, Object obj) {
        C94379ag3 setState = (C94379ag3) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C94379ag3.L(setState, null, iDqS9S1000000_42.s0, !o.LJ(r3, setState.LJLIL), null, 9);
    }
}
