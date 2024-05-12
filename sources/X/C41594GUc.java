package X;

/* renamed from: X.GUc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41594GUc {
    public int LIZ;

    public final boolean LIZ() {
        boolean z;
        synchronized (this) {
            if (this.LIZ == 0) {
                this.LIZ = 2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
