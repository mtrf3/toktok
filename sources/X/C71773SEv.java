package X;

import Y.ARunnableS13S1100000_12;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.SEv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71773SEv extends FrameLayout {
    public PaymentMethod LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZJ() {
        String str;
        PaymentMethod paymentMethod;
        Availability availability;
        PaymentMethod paymentMethod2 = this.LJLIL;
        if (paymentMethod2 != null && (str = paymentMethod2.balance) != null && str.length() > 0) {
            if (LIZIZ() || ((paymentMethod = this.LJLIL) != null && (availability = paymentMethod.availability) != null && o.LJ(availability.isAvailable, Boolean.FALSE))) {
                ((TextView) LIZ(R.id.lvj)).setText(str);
                View tvBalance = LIZ(R.id.lvj);
                o.LJIIIIZZ(tvBalance, "tvBalance");
                OUP.LJJLIIIJ(tvBalance);
                return;
            }
            View tvBalance2 = LIZ(R.id.lvj);
            o.LJIIIIZZ(tvBalance2, "tvBalance");
            OUP.LJIJJLI(tvBalance2);
            return;
        }
        View tvBalance3 = LIZ(R.id.lvj);
        o.LJIIIIZZ(tvBalance3, "tvBalance");
        OUP.LJIJJLI(tvBalance3);
    }

    public final void LIZLLL() {
        boolean z;
        String LJII;
        PaymentMethod paymentMethod = this.LJLIL;
        if (paymentMethod != null && (LJII = paymentMethod.LJII()) != null && C78685UuP.LJJJZ(LJII)) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            PaymentMethod paymentMethod2 = this.LJLIL;
            if (paymentMethod2 != null) {
                str = paymentMethod2.LJII();
            }
        } else {
            PaymentMethod paymentMethod3 = this.LJLIL;
            if (paymentMethod3 != null) {
                str = paymentMethod3.extraInfo;
            }
        }
        if (str != null && str.length() > 0) {
            View tvExtraInfoRight = LIZ(R.id.lwg);
            o.LJIIIIZZ(tvExtraInfoRight, "tvExtraInfoRight");
            OUP.LJJ(tvExtraInfoRight);
            ((TextView) LIZ(R.id.lwg)).setText(str);
            View LIZ = LIZ(R.id.lwg);
            if (LIZ != null) {
                LIZ.post(new ARunnableS13S1100000_12(this, str, 1));
                return;
            }
            return;
        }
        View tvExtraInfoRight2 = LIZ(R.id.lwg);
        o.LJIIIIZZ(tvExtraInfoRight2, "tvExtraInfoRight");
        OUP.LJIJJLI(tvExtraInfoRight2);
        View tvExtraInfoBelow = LIZ(R.id.lwf);
        o.LJIIIIZZ(tvExtraInfoBelow, "tvExtraInfoBelow");
        OUP.LJIJJLI(tvExtraInfoBelow);
    }

    public final boolean LIZIZ() {
        return LIZ(R.id.fge).isSelected();
    }

    public final PaymentMethod getSubPaymentMethod() {
        return this.LJLIL;
    }

    public C71773SEv(Context context) {
        super(context, null, 0);
        OUP.LJIL(R.layout.a1x, this, true);
    }

    public final void setChecked(boolean z) {
        int i;
        if (LIZ(R.id.fge).isSelected() == z) {
            return;
        }
        LIZ(R.id.fge).setSelected(z);
        TuxTextView tuxTextView = (TuxTextView) LIZ(R.id.ly0);
        if (!z) {
            i = R.attr.go;
        } else {
            i = R.attr.eb;
        }
        tuxTextView.setTextColorRes(i);
        LIZJ();
        LIZLLL();
    }

    public final void setSubPaymentMethod(PaymentMethod paymentMethod) {
        this.LJLIL = paymentMethod;
    }
}
