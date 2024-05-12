package X;

/* renamed from: X.0YP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YP {
    public static String LIZ(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed to read system property ");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            C0YN.LIZ(6);
            return null;
        }
    }
}
