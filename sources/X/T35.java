package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T35 {
    public static long LIZ = -1;

    public static final OSZ<String, String> LIZ(Context context) {
        OSZ osz;
        o.LJIIIZ(context, "context");
        C74216TAu c74216TAu = C74216TAu.LIZIZ;
        boolean LJI = c74216TAu.LJI();
        Integer valueOf = Integer.valueOf(R.string.dte);
        if (LJI) {
            return new OSZ<>(context.getString(R.string.dte), context.getString(R.string.dtk));
        }
        int i = T36.LIZ[c74216TAu.LJII().ordinal()];
        if (i != 1) {
            if (i != 2) {
                osz = new OSZ(Integer.valueOf(R.string.jcp), Integer.valueOf(R.string.jco));
            } else {
                osz = new OSZ(valueOf, Integer.valueOf(R.string.jcn));
            }
        } else {
            osz = new OSZ(valueOf, Integer.valueOf(R.string.dtb));
        }
        return new OSZ<>(context.getString(((Number) osz.getFirst()).intValue()), context.getString(((Number) osz.getSecond()).intValue()));
    }

    public static void LIZIZ(Context context) {
        int i;
        String string;
        if (context == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - LIZ < ((Number) C52382Kh8.LIZ.getValue()).longValue()) {
            return;
        }
        LIZ = currentTimeMillis;
        C74216TAu c74216TAu = C74216TAu.LIZIZ;
        if (c74216TAu.LJI()) {
            string = context.getString(R.string.dtk);
            o.LJIIIIZZ(string, "context.getString(R.stri…ction_toast_airplanemode)");
        } else {
            int i2 = T36.LIZ[c74216TAu.LJII().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    i = R.string.dto;
                } else {
                    i = R.string.dtd;
                }
            } else {
                i = R.string.dtf;
            }
            string = context.getString(i);
            o.LJIIIIZZ(string, "context.getString(strID)");
        }
        C82890Wg2.LJFF.getClass();
        new C82890Wg2(context, string, 0, 2).LIZ();
    }
}
