package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.a6j, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92189a6j implements InterfaceC91946a2o<C91741ZzV> {
    public final /* synthetic */ C91847a1D LIZ;

    public C92189a6j(C91847a1D c91847a1D) {
        this.LIZ = c91847a1D;
    }

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(C91741ZzV c91741ZzV) {
        C91741ZzV it = c91741ZzV;
        o.LJIIIZ(it, "it");
        if (this.LIZ.LIZ && TextUtils.isEmpty(it.toString())) {
            return C91945a2n.LIZ("pipo_cashier_form_error_required");
        }
        if (it.toString().length() == 4) {
            String currDate = new SimpleDateFormat("yyMM").format(new Date());
            o.LJIIIIZZ(currDate, "currDate");
            String substring = currDate.substring(0, 2);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = CastIntegerProtector.parseInt(substring);
            if (o.LJ(it.LIZ, "00")) {
                return C91945a2n.LIZ("pipo_rule_common_invalid");
            }
            String substring2 = it.toString().substring(2);
            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
            if (CastIntegerProtector.parseInt(substring2) > parseInt + 15) {
                return C91945a2n.LIZ("pipo_cashier_form_error_year_toofar");
            }
            String substring3 = it.toString().substring(2, 4);
            o.LJIIIIZZ(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring4 = it.toString().substring(0, 2);
            o.LJIIIIZZ(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
            if (o.LJIILLIIL(substring4, substring3).compareTo(currDate) >= 0) {
                return C91945a2n.LIZIZ();
            }
            return C91945a2n.LIZ("pipo_cashier_form_error_card_expired");
        }
        return C91945a2n.LIZ("pipo_rule_common_invalid");
    }
}
