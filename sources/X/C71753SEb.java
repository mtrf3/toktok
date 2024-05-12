package X;

import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* renamed from: X.SEb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71753SEb implements InterfaceC71754SEc {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("eg_pi_vnatmcard_c_d_issue_date_holder_name", "eg_pi_vnatmcard_c_d_expiration_date_holder_name");

    @Override // X.InterfaceC71754SEc
    public final SEX LIZ(String... values) {
        o.LJIIIZ(values, "values");
        boolean z = false;
        String str = (String) ORY.LJJJJI(0, values);
        SEX sex = new SEX(0);
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        }
        if (z) {
            sex.LIZJ("pipo_common_error_required_field", "pipo_common_payin_cardholder_name");
        } else if (!Pattern.matches("^[a-zA-Z ]*$", str)) {
            sex.LIZJ("pipo_common_error_is_invalid", "pipo_common_payin_cardholder_name");
        }
        return sex;
    }
}
