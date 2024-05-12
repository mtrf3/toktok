package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SEZ implements InterfaceC71754SEc {
    public static final List<String> LIZ = C47261Igj.LJJIJ("eg_pi_vnatmcard_c_d_expiration_date_expiration_date");

    @Override // X.InterfaceC71754SEc
    public final SEX LIZ(String... values) {
        boolean z;
        int LJIJI;
        o.LJIIIZ(values, "values");
        String str = (String) ORY.LJJJJI(0, values);
        String str2 = (String) ORY.LJJJJI(1, values);
        SEX sex = new SEX(0);
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = -1;
        if (z) {
            sex.LIZJ("pipo_common_error_required_field", "pipo_common_payin_expiry_date");
            LJIJI = -1;
        } else {
            LJIJI = O5Y.LJIJI(str);
            if (!Pattern.matches("^[0-9]{2}$", str)) {
                sex.LIZJ("pipo_common_payin_expiry_date", new String[0]);
            } else if (LJIJI > i + 15) {
                sex.LIZJ("pipo_common_error_year_too_far", new String[0]);
            } else {
                int LJIJ = O5Y.LJIJ(str2);
                if (LJIJI < i || (LJIJI == i && LJIJ < i2)) {
                    sex.LIZJ("pipo_common_error_card_expired", new String[0]);
                }
            }
        }
        SEX sex2 = new SEX(0);
        if (str2 == null || str2.length() == 0) {
            sex.LIZJ("pipo_common_error_required_field", "pipo_common_payin_expiry_date");
        } else {
            try {
                i3 = CastIntegerProtector.parseInt(str2);
            } catch (Throwable unused) {
            }
            if (!Pattern.matches("^[0-9]{2}$", str2)) {
                sex2.LIZJ("pipo_common_payin_expiry_date", new String[0]);
            } else if (i3 > 12 || i3 < 1) {
                sex2.LIZJ("pipo_common_error_month_check", new String[0]);
            } else if ((LJIJI == i && i3 < i2) || LJIJI < i) {
                sex2.LIZJ("pipo_common_error_card_expired", new String[0]);
            }
        }
        ((ArrayList) sex.LIZIZ).add(sex2);
        return sex;
    }
}
