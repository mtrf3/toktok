package X;

/* renamed from: X.Int, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47705Int {
    public static volatile C47705Int LIZIZ;
    public volatile Object LIZ;

    public final Object LIZ() {
        if (this.LIZ == null) {
            synchronized (C47705Int.class) {
                if (this.LIZ == null) {
                    try {
                        this.LIZ = Class.forName("android.os.SystemProperties").newInstance();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return this.LIZ;
    }
}
