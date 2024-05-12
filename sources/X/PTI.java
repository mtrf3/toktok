package X;

import defpackage.a1;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes12.dex */
public final class PTI {
    public static String LIZ(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String LIZIZ;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                LIZIZ = "null";
            } else {
                try {
                    LIZIZ = obj.toString();
                } catch (Exception e) {
                    String LJ = a1.LJ(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(LJ), (Throwable) e);
                    LIZIZ = UPJ.LIZIZ("<", LJ, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = LIZIZ;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
