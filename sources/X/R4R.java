package X;

import android.app.Application;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R4R {
    public static final String LIZIZ(QQI qqi) {
        Integer num;
        String str = null;
        if (qqi != null) {
            num = Integer.valueOf(qqi.LIZLLL);
            str = qqi.LJFF;
        } else {
            num = null;
        }
        return LIZ(num, str);
    }

    public static final String LIZ(Integer num, String str) {
        if (num == null || num.intValue() < 0 || str == null || str.length() == 0) {
            Application application = C58725N2z.LIZ;
            if (application == null) {
                return "Sorry, error occurred";
            }
            String string = application.getString(R.string.img);
            o.LJIIIIZZ(string, "{\n                Module…navailable)\n            }");
            return string;
        }
        return str;
    }
}
