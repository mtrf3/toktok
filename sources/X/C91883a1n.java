package X;

/* renamed from: X.a1n, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91883a1n {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (invoke != null) {
                return (String) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
