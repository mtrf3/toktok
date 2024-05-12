package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B1W extends FrameLayout {
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

    public final void LIZIZ() {
        String str;
        PaymentMethod paymentMethod;
        Availability availability;
        PaymentMethod paymentMethod2 = this.LJLIL;
        if (paymentMethod2 != null && (str = paymentMethod2.balance) != null && str.length() > 0) {
            if (LIZ(R.id.fge).isSelected() || ((paymentMethod = this.LJLIL) != null && (availability = paymentMethod.availability) != null && o.LJ(availability.isAvailable, Boolean.FALSE))) {
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

    public final void LIZJ() {
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
            PaymentMethod paymentMethod4 = this.LJLIL;
            if (paymentMethod4 != null) {
                int LJII2 = C79081V1x.LJII(286);
                int LJII3 = C79081V1x.LJII(20);
                int LJII4 = C79081V1x.LJII(16);
                int LJII5 = C79081V1x.LJII(32);
                TextPaint paint = ((TextView) LIZ(R.id.ly0)).getPaint();
                paint.setTextSize(((TextView) LIZ(R.id.ly0)).getTextSize());
                float measureText = paint.measureText(paymentMethod4.displayName);
                TextPaint paint2 = ((TextView) LIZ(R.id.lwg)).getPaint();
                paint2.setTextSize(((TextView) LIZ(R.id.lwg)).getTextSize());
                if (paint2.measureText(paymentMethod4.extraInfo) >= (((LJII2 - LJII3) - LJII4) - LJII5) - measureText) {
                    View tvExtraInfoRight = LIZ(R.id.lwg);
                    o.LJIIIIZZ(tvExtraInfoRight, "tvExtraInfoRight");
                    OUP.LJIJJLI(tvExtraInfoRight);
                    View tvExtraInfoBelow = LIZ(R.id.lwf);
                    o.LJIIIIZZ(tvExtraInfoBelow, "tvExtraInfoBelow");
                    OUP.LJJLIIIJ(tvExtraInfoBelow);
                    ((TextView) LIZ(R.id.lwf)).setText(str);
                    return;
                }
            }
            View tvExtraInfoRight2 = LIZ(R.id.lwg);
            o.LJIIIIZZ(tvExtraInfoRight2, "tvExtraInfoRight");
            OUP.LJJLIIIJ(tvExtraInfoRight2);
            View tvExtraInfoBelow2 = LIZ(R.id.lwf);
            o.LJIIIIZZ(tvExtraInfoBelow2, "tvExtraInfoBelow");
            OUP.LJIJJLI(tvExtraInfoBelow2);
            ((TextView) LIZ(R.id.lwg)).setText(str);
            return;
        }
        View tvExtraInfoRight3 = LIZ(R.id.lwg);
        o.LJIIIIZZ(tvExtraInfoRight3, "tvExtraInfoRight");
        OUP.LJIJJLI(tvExtraInfoRight3);
        View tvExtraInfoBelow3 = LIZ(R.id.lwf);
        o.LJIIIIZZ(tvExtraInfoBelow3, "tvExtraInfoBelow");
        OUP.LJIJJLI(tvExtraInfoBelow3);
    }

    public final PaymentMethod getSubPaymentMethod() {
        return this.LJLIL;
    }

    public B1W(Context context) {
        super(context, null, 0);
        OUP.LJIL(R.layout.a16, this, true);
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
        LIZIZ();
        LIZJ();
    }

    public final void setSubPaymentMethod(PaymentMethod paymentMethod) {
        this.LJLIL = paymentMethod;
    }
}
