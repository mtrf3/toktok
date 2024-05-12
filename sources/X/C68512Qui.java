package X;

/* renamed from: X.Qui, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68512Qui extends Error {
    public C68512Qui() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public C68512Qui(String str) {
        super(str);
    }

    public C68512Qui(Throwable th) {
        super(th);
    }

    public C68512Qui(String str, Throwable th) {
        super(str, th);
    }
}
