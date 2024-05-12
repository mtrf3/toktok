package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.zhiliaoapp.musically.R;
import ujb.o;

/* renamed from: X.9JM, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9JM {
    public static String LIZ;
    public static String LIZIZ;

    public static String LIZ() {
        String str = LIZIZ;
        if (str == null || o.LJJJJJL(str)) {
            int LJIIJJI = C246079lD.LIZ().LJIIJJI();
            IECommerceService.LIZ.getClass();
            if (LJIIJJI == 0) {
                return "order_center";
            }
            return "my_order";
        }
        return str;
    }

    public static int LIZJ() {
        int LJIIJJI = C246079lD.LIZ().LJIIJJI();
        IECommerceService.LIZ.getClass();
        if (LJIIJJI == 0) {
            return R.string.skk;
        }
        return R.string.skj;
    }

    public static String LIZIZ(Context context) {
        String string;
        String str = LIZ;
        if (str == null || o.LJJJJJL(str)) {
            if (context == null || (string = context.getString(LIZJ())) == null) {
                return C44384HbQ.LJJZ(LIZJ());
            }
            return string;
        }
        return str;
    }
}
