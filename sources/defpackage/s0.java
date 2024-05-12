package defpackage;

import X.X1D;
import android.content.Context;
import android.view.ViewStub;

/* loaded from: classes9.dex */
public final /* synthetic */ class s0 {
    public static /* synthetic */ int LIZ(int i, String str) {
        if (str.length() > 1 && str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long parseLong = Long.parseLong(str, i);
        if ((4294967295L & parseLong) == parseLong) {
            return (int) parseLong;
        }
        throw new NumberFormatException("Input " + str + " in base " + i + " is not in the range of an unsigned integer");
    }

    public static ViewStub LIZIZ(Context context, int i) {
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(i);
        return viewStub;
    }

    public static String LIZJ(StringBuilder sb, Integer num, char c, StringBuilder sb2) {
        sb.append(num);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }
}
