package X;

/* renamed from: X.JEh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48827JEh {
    public long LIZ;

    public final void LIZ() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.LIZ <= 0) {
                this.LIZ = currentTimeMillis;
            }
            if (currentTimeMillis - this.LIZ >= 1000) {
                this.LIZ = currentTimeMillis;
            }
        } catch (Throwable unused) {
        }
    }

    public C48827JEh(boolean z) {
    }
}
