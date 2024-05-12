package X;

/* renamed from: X.O4a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61300O4a {
    public static C39745Fin LIZ(java.util.Map map) {
        String str;
        if (map == null || ((str = (String) map.get("Content-Type")) == null && (str = (String) map.get("content-type")) == null)) {
            str = "text/html; charset=UTF-8";
        }
        return C39745Fin.LIZJ(str);
    }
}
