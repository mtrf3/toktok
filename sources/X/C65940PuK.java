package X;

/* renamed from: X.PuK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65940PuK {
    public static Object LIZ(String str) {
        try {
            return Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            C65926Pu6.LIZ("Helios:Network-Common", null, 6, th);
            return null;
        }
    }
}
