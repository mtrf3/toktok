package X;

import com.ss.android.ugc.aweme.AccountService;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Op1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63063Op1 {
    public static boolean LIZ() {
        String LJ;
        if ((!ORY.LJJIJIIJIL(AccountService.LJIJ().LJIILL(), new String[]{"US", "BR", "MX", "CA"})) && (LJ = a.LIZIZ().LJ()) != null) {
            Date parse = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).parse(LJ);
            o.LJIIIIZZ(parse, "dateFormat.parse(birthday)");
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(parse);
            int i = calendar.get(1);
            int i2 = calendar.get(2);
            int i3 = calendar.get(5);
            int i4 = calendar2.get(1);
            int i5 = calendar2.get(2);
            int i6 = calendar2.get(5);
            int i7 = i - i4;
            if (i2 < i5 || (i2 == i5 && i3 < i6)) {
                i7--;
            }
            if (i7 >= 18) {
                return true;
            }
        }
        return false;
    }
}
