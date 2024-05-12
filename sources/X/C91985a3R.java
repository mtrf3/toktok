package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.a3R, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public class C91985a3R implements TextWatcher {
    public final DecimalFormat LJLIL;
    public final WeakReference<C26018AJa> LJLILLLLZI;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C91985a3R(C26018AJa c26018AJa) {
        C43286Gyo.LIZ.getClass();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(new Locale(C87093YGb.LIZ(), C85990Xow.LIZ()));
        o.LJII(numberInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
        this.LJLIL = (DecimalFormat) numberInstance;
        this.LJLILLLLZI = new WeakReference<>(c26018AJa);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C19K c19k;
        BigDecimal ZERO;
        String obj;
        C26018AJa c26018AJa = this.LJLILLLLZI.get();
        if (c26018AJa != null) {
            c19k = (C19K) c26018AJa.findViewById(R.id.cps);
        } else {
            c19k = null;
        }
        if (c19k != null) {
            Editable text = c19k.getText();
            if (text == null || (obj = text.toString()) == null || obj.length() != 0) {
                c19k.removeTextChangedListener(this);
                String valueOf = String.valueOf(c19k.getText());
                try {
                    StringBuilder sb = new StringBuilder();
                    int length = valueOf.length();
                    for (int i = 0; i < length; i++) {
                        char charAt = valueOf.charAt(i);
                        if (Character.isDigit(charAt)) {
                            sb.append(charAt);
                        }
                    }
                    String sb2 = sb.toString();
                    o.LJIIIIZZ(sb2, "filterTo(StringBuilder(), predicate).toString()");
                    if (o.LJ("", sb2)) {
                        sb2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    ZERO = new BigDecimal(sb2);
                } catch (Throwable unused) {
                    ZERO = BigDecimal.ZERO;
                    o.LJIIIIZZ(ZERO, "ZERO");
                }
                RepaymentViewModel v3 = ((C92224a7I) this).LJLJI.v3();
                String bigDecimal = ZERO.toString();
                o.LJIIIIZZ(bigDecimal, "amount.toString()");
                v3.jv0(bigDecimal);
                String format = this.LJLIL.format(ZERO);
                c19k.setText(format);
                c19k.setSelection(format.length());
                c19k.addTextChangedListener(this);
                return;
            }
        }
        BigDecimal ZERO2 = BigDecimal.ZERO;
        o.LJIIIIZZ(ZERO2, "ZERO");
        RepaymentViewModel v32 = ((C92224a7I) this).LJLJI.v3();
        String bigDecimal2 = ZERO2.toString();
        o.LJIIIIZZ(bigDecimal2, "amount.toString()");
        v32.jv0(bigDecimal2);
    }
}
