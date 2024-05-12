package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C2A8;
import X.C32207CkV;
import X.C76800UCe;
import X.C76824UDc;
import X.InterfaceC88472Yns;
import X.U5M;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableString;

/* loaded from: classes14.dex */
public class AqS1S0303000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AqS1S0303000_13 aqS1S0303000_13, Object obj) {
        Bitmap it = (Bitmap) obj;
        o.LJIIIZ(it, "it");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(it);
        int i = aqS1S0303000_13.i5;
        bitmapDrawable.setBounds(0, 0, i, i);
        C32207CkV c32207CkV = new C32207CkV(bitmapDrawable);
        ((Spannable) aqS1S0303000_13.l0).removeSpan((C32207CkV) aqS1S0303000_13.l1);
        ((Spannable) aqS1S0303000_13.l0).setSpan(c32207CkV, aqS1S0303000_13.i3, aqS1S0303000_13.i4, 33);
        C2A8 c2a8 = ((U5M) aqS1S0303000_13.l2).LJLILLLLZI;
        if (c2a8 != null) {
            c2a8.setText((Spannable) aqS1S0303000_13.l0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S0303000_13 aqS1S0303000_13, Object obj) {
        Bitmap it = (Bitmap) obj;
        o.LJIIIZ(it, "it");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(it);
        int i = aqS1S0303000_13.i5;
        bitmapDrawable.setBounds(0, 0, i, i);
        C32207CkV c32207CkV = new C32207CkV(bitmapDrawable);
        ((SpannableString) aqS1S0303000_13.l0).removeSpan((C32207CkV) aqS1S0303000_13.l1);
        ((SpannableString) aqS1S0303000_13.l0).setSpan(c32207CkV, aqS1S0303000_13.i3, aqS1S0303000_13.i4, 33);
        ((C76824UDc) aqS1S0303000_13.l2).LIZJ.setText((SpannableString) aqS1S0303000_13.l0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0303000_13(Spannable spannable, C32207CkV c32207CkV, int i, int i2, U5M u5m, int i3, int i4) {
        super(1);
        this.$t = i4;
        this.l0 = spannable;
        this.l1 = c32207CkV;
        this.i3 = i;
        this.i4 = i2;
        this.l2 = u5m;
        this.i5 = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0303000_13(SpannableString spannableString, C32207CkV c32207CkV, int i, int i2, C76824UDc c76824UDc, int i3, int i4) {
        super(1);
        this.$t = i4;
        this.l0 = spannableString;
        this.l1 = c32207CkV;
        this.i3 = i;
        this.i4 = i2;
        this.l2 = c76824UDc;
        this.i5 = i3;
    }
}
