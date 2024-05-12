package X;

/* renamed from: X.Vum, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81256Vum {
    public static C81254Vuk LIZIZ(Object obj) {
        String replaceAll = obj.getClass().getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return new C81254Vuk(replaceAll.substring(lastIndexOf + 1));
    }

    public static boolean LIZ(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
