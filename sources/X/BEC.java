package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BEC {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        String str2;
        o.LJIIIZ(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        o.LJ(String.valueOf(DecimalFormatSymbols.getInstance().getDecimalSeparator()), ".");
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        while (length > 3) {
            int i = length - 3;
            String substring = str.substring(i, length);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            length = i;
        }
        String substring2 = str.substring(0, length);
        o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        arrayList.add(substring2);
        StringBuilder sb = new StringBuilder();
        for (int size = arrayList.size() - 1; size > 0; size--) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append((String) ListProtector.get(arrayList, size));
            if (!o.LJ(String.valueOf(DecimalFormatSymbols.getInstance().getDecimalSeparator()), ".")) {
                str2 = ".";
            } else {
                str2 = ",";
            }
            LIZ2.append(str2);
            sb.append(X1D.LIZIZ(LIZ2));
        }
        return C0EH.LIZJ(sb, (String) ListProtector.get(arrayList, 0), "sb.toString()");
    }
}
