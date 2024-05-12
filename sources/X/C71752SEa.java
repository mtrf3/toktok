package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* renamed from: X.SEa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71752SEa implements InterfaceC71754SEc {
    public static final List<String> LIZ = C47261Igj.LJJIJ("eg_pi_vnatmcard_c_d_issue_date_issue_date");

    @Override // X.InterfaceC71754SEc
    public final SEX LIZ(String... values) {
        boolean z;
        int LJIJI;
        o.LJIIIZ(values, "values");
        SEX sex = new SEX(0);
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        String str = (String) ORY.LJJJJI(0, values);
        String str2 = (String) ORY.LJJJJI(1, values);
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = -1;
        if (z) {
            sex.LIZIZ(R.string.fbd);
            LJIJI = -1;
        } else {
            LJIJI = O5Y.LJIJI(str);
            if (!Pattern.matches("^[0-9]{2}$", str)) {
                sex.LIZIZ(R.string.fbb);
            } else {
                int LJIJ = O5Y.LJIJ(str2);
                if (LJIJI > i || (LJIJI == i && LJIJ > i2)) {
                    sex.LIZIZ(R.string.fbc);
                }
            }
        }
        SEX sex2 = new SEX(0);
        if (str2 == null || str2.length() == 0) {
            sex.LIZIZ(R.string.fbd);
        } else {
            try {
                i3 = CastIntegerProtector.parseInt(str2);
            } catch (Throwable unused) {
            }
            if (!Pattern.matches("^[0-9]{2}$", str2)) {
                sex.LIZIZ(R.string.fbb);
            } else if (i3 > 12 || i3 < 1) {
                sex.LIZIZ(R.string.fbb);
            } else if ((LJIJI == i && i3 > i2) || LJIJI > i) {
                sex.LIZIZ(R.string.fbc);
            }
        }
        ((ArrayList) sex.LIZIZ).add(sex2);
        return sex;
    }
}
