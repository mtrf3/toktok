package X;

/* renamed from: X.Pt0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65858Pt0<T> extends C65854Psw {
    public static EnumC65856Psy protectorType = EnumC65856Psy.CAST_NUMBER;

    public static <T> T tryProtect(Throwable th, Class<?> cls) {
        return (T) C65854Psw.tryProtect(protectorType, th, cls);
    }
}
