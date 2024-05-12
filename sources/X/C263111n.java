package X;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.11n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C263111n {
    public final List<C16V> LIZ = new LinkedList();

    public static C268313n LIZJ(File file) {
        if (file instanceof C268313n) {
            return (C268313n) file;
        }
        return new C268313n(file.getPath());
    }

    public final String LIZ(String str) {
        if (str == null) {
            return str;
        }
        C16U c16u = new C16U(str);
        return new C263211o(this.LIZ, 0, c16u).LIZ(c16u).LIZ;
    }

    public final String LIZIZ(String str, String str2) {
        if (str2 == null) {
            return str2;
        }
        if (str != null && !str.isEmpty()) {
            if (str2.isEmpty() || str2.equals("/")) {
                return LIZ(str);
            }
            if (str2.charAt(0) == '/' && str.equals("/")) {
                return LIZ(str2);
            }
            C16U c16u = new C16U(str, str2);
            return new C263211o(this.LIZ, 0, c16u).LIZ(c16u).LIZ;
        }
        return LIZ(str2);
    }
}
