package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.a32, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91960a32 {
    public static final java.util.Map<String, Integer> LIZ = C51029K0z.LJJIIZI(new OSZ("IDR", 0));

    public static final String LIZ(String amount, Locale locale) {
        Currency currency;
        int intValue;
        o.LJIIIZ(amount, "amount");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        try {
            currency = Currency.getInstance(locale);
        } catch (Exception unused) {
            currency = Currency.getInstance(Locale.getDefault());
        }
        o.LJIIIIZZ(currency, "currency");
        Integer num = LIZ.get(currency.getCurrencyCode());
        if (num == null) {
            intValue = currency.getDefaultFractionDigits();
        } else {
            intValue = num.intValue();
        }
        currencyInstance.setMinimumFractionDigits(intValue);
        String format = currencyInstance.format(CastDoubleProtector.parseDouble(amount));
        o.LJIIIIZZ(format, "currencyFormat.format(amount.toDouble())");
        return format;
    }
}
