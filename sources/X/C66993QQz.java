package X;

/* renamed from: X.QQz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66993QQz {
    public static volatile C66993QQz LIZJ;
    public volatile QR0 LIZ;
    public volatile C78937UyT LIZIZ;

    public static C66993QQz LIZ() {
        if (LIZJ == null) {
            synchronized (C66993QQz.class) {
                if (LIZJ == null) {
                    LIZJ = new C66993QQz();
                }
            }
        }
        return LIZJ;
    }

    public final QR7 LIZIZ() {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    this.LIZ = new QR0();
                }
            }
        }
        return this.LIZ;
    }
}
