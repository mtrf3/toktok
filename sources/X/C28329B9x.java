package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.B9x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28329B9x {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(long j) {
        boolean z;
        if (10000 <= j && j < 1000000) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder LIZ2 = X1D.LIZ();
            String LLLZI = C16880lQ.LLLZI(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000)}, 1));
            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
            LIZ2.append(LLLZI);
            LIZ2.append('K');
            return X1D.LIZIZ(LIZ2);
        }
        if (j >= 1000000) {
            StringBuilder LIZ3 = X1D.LIZ();
            String LLLZI2 = C16880lQ.LLLZI(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000)}, 1));
            o.LJIIIIZZ(LLLZI2, "format(locale, format, *args)");
            LIZ3.append(LLLZI2);
            LIZ3.append('M');
            return X1D.LIZIZ(LIZ3);
        }
        if (j >= 1000) {
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(j));
            stringBuffer.insert(1, ',');
            return stringBuffer.toString();
        }
        return String.valueOf(j);
    }

    public static final boolean LIZIZ(Context context) {
        ActivityC45651qj LIZIZ;
        if (context != null && (LIZIZ = C29306Beo.LIZIZ(context)) != null && !TextUtils.isEmpty(LIZIZ.toString()) && !s.LJJJLZIJ(LIZIZ.toString(), ".LivePlayActivity", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Context context) {
        if (context != null) {
            return !LIZIZ(context);
        }
        return false;
    }
}
