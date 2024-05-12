package X;

/* renamed from: X.Qg4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67604Qg4 {
    public final C68033Qmz LIZ;

    public C67604Qg4(C68241QqL c68241QqL) {
        this.LIZ = c68241QqL.LJIIJJI;
    }

    public final boolean LIZ() {
        try {
            C67166QXq LIZ = QCX.LIZ(this.LIZ.LIZ);
            if (LIZ != null) {
                return LIZ.LIZIZ(128, "com.android.vending").versionCode >= 80837300;
            }
            this.LIZ.LIZJ().LJIILIIL.LIZ("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.LIZ.LIZJ().LJIILIIL.LIZIZ(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
