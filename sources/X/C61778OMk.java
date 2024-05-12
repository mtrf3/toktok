package X;

/* renamed from: X.OMk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61778OMk {
    public static String LIZ(Integer num) {
        for (EnumC61777OMj enumC61777OMj : EnumC61777OMj.values()) {
            int type = enumC61777OMj.getType();
            if (num != null && type == num.intValue()) {
                return AnonymousClass028.LIZJ("getDefault()", enumC61777OMj.name(), "this as java.lang.String).toLowerCase(locale)");
            }
        }
        return "";
    }
}
