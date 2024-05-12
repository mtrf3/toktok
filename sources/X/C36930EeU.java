package X;

/* renamed from: X.EeU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36930EeU {
    public static volatile C36930EeU LIZIZ;
    public volatile Object LIZ;

    public final Object LIZ() {
        if (this.LIZ == null) {
            synchronized (C36930EeU.class) {
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
