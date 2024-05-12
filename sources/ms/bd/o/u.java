package ms.bd.o;

import X.C16880lQ;
import android.content.Context;
import java.util.Locale;

/* loaded from: classes7.dex */
public class u {

    /* loaded from: classes7.dex */
    public interface a {
    }

    /* loaded from: classes7.dex */
    public interface b {
    }

    /* loaded from: classes7.dex */
    public interface c {
    }

    public static void LIZ(Context context, String str) {
        v vVar = new v(new x(), new s());
        if (context != null) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Given library is either null or empty");
            }
            C16880lQ.LLLZI(Locale.US, "Beginning load of %s...", new Object[]{str});
            vVar.LIZIZ(context, str, null);
            return;
        }
        throw new IllegalArgumentException("Given context is null");
    }
}
