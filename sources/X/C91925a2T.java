package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.a2T, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91925a2T {
    public static final /* synthetic */ int LIZ = 0;

    public static Locale LIZIZ() {
        C87093YGb c87093YGb = C43286Gyo.LIZ;
        EF7.LIZIZ();
        Locale locale = c87093YGb.LIZIZ().getLocale();
        o.LJIIIIZZ(locale, "get().getCurrentI18nItem…licationContext()).locale");
        return locale;
    }

    public static String LIZ(String amount, String currency) {
        o.LJIIIZ(amount, "amount");
        o.LJIIIZ(currency, "currency");
        try {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(LIZIZ());
            currencyInstance.setMinimumFractionDigits(0);
            currencyInstance.setCurrency(Currency.getInstance(currency));
            String format = currencyInstance.format(CastDoubleProtector.parseDouble(amount));
            o.LJIIIIZZ(format, "{\n            val format…unt.toDouble())\n        }");
            return format;
        } catch (Throwable th) {
            C16880lQ.LJLLJ(C91925a2T.class);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("failed to format amount: ");
            LIZ2.append(th);
            String msg = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(msg, "msg");
            return "";
        }
    }
}
