package ms.bd.o;

import ms.bd.o.u;

/* loaded from: classes7.dex */
public final class x implements u.b {
    public static String LIZ(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
