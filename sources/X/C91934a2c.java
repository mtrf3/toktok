package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Amount;
import com.zhiliaoapp.musically.R;
import java.text.NumberFormat;
import java.util.Currency;
import kotlin.jvm.internal.o;

/* renamed from: X.a2c, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91934a2c {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(Amount amount) {
        if (amount != null) {
            C87093YGb c87093YGb = C43286Gyo.LIZ;
            EF7.LIZIZ();
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(c87093YGb.LIZIZ().getLocale());
            o.LJIIIIZZ(currencyInstance, "getCurrencyInstance(\n   …text()).locale,\n        )");
            currencyInstance.setMaximumFractionDigits(0);
            String currency = amount.getCurrency();
            if (currency.length() == 0) {
                currency = "IDR";
            }
            currencyInstance.setCurrency(Currency.getInstance(currency));
            String format = currencyInstance.format(CastDoubleProtector.parseDouble(amount.getValue()));
            if (format != null) {
                return format;
            }
        }
        return "";
    }

    public static CharSequence LIZ(Context context, Amount amount) {
        int i;
        o.LJIIIZ(amount, "amount");
        C91936a2e c91936a2e = new C91936a2e();
        c91936a2e.LIZ = LIZIZ(amount);
        c91936a2e.LIZIZ = "";
        c91936a2e.LIZJ = 0;
        c91936a2e.LIZLLL = "";
        c91936a2e.LJ = 42;
        c91936a2e.LJFF = 42;
        c91936a2e.LJI = R.attr.go;
        c91936a2e.LJII = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (c91936a2e.LIZJ == 0) {
            C91936a2e.LIZ(spannableStringBuilder, c91936a2e.LIZIZ, c91936a2e.LJ);
            if (c91936a2e.LIZLLL.length() > 0) {
                C91936a2e.LIZ(spannableStringBuilder, c91936a2e.LIZLLL, c91936a2e.LJFF);
            }
            C91936a2e.LIZ(spannableStringBuilder, c91936a2e.LIZ, c91936a2e.LJFF);
        } else {
            C91936a2e.LIZ(spannableStringBuilder, c91936a2e.LIZ, c91936a2e.LJFF);
            if (c91936a2e.LIZLLL.length() > 0) {
                C91936a2e.LIZ(spannableStringBuilder, c91936a2e.LIZLLL, c91936a2e.LJFF);
            }
            C91936a2e.LIZ(spannableStringBuilder, c91936a2e.LIZIZ, c91936a2e.LJ);
        }
        Integer LJI = C79045V0n.LJI(c91936a2e.LJI, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, spannableStringBuilder.length(), 17);
        if (c91936a2e.LJII) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }
}
