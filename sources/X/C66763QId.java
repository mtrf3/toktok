package X;

/* renamed from: X.QId, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66763QId {
    public final String[] LIZ;
    public final String[] LIZJ;
    public final String[] LIZLLL;
    public final String[] LJ;
    public final String[] LJFF;
    public final String LJII;
    public final String LIZIZ = "https://log-va.tiktokv.com/service/2/log_settings/";
    public final String LJI = "https://log-va.tiktokv.com/service/2/log_settings/";

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append(":\nmApplogURL : ");
        LIZ.append(this.LIZ);
        LIZ.append("\nmApplogTimelyUrl : ");
        LIZ.append(this.LIZJ);
        LIZ.append("\nmDeviceRegisterUrl : ");
        LIZ.append(this.LJ);
        LIZ.append("\nmAppActiveUrl : ");
        LIZ.append(this.LIZLLL);
        LIZ.append("\nmApplogSettingsUrl : ");
        LIZ.append(this.LIZIZ);
        LIZ.append("\n\nmApplogFallbackUrl : ");
        LIZ.append(this.LJFF);
        LIZ.append("\nmApplogSettingsFallbackUrl : ");
        LIZ.append(this.LJI);
        LIZ.append("\nmUserProfileUrl : ");
        return JBR.LJFF(LIZ, this.LJII, "\n\n\n\n", LIZ);
    }

    public C66763QId(String[] strArr, String[] strArr2, String[] strArr3, String str, String[] strArr4, String str2) {
        this.LIZ = strArr;
        this.LIZJ = strArr2;
        this.LIZLLL = new String[]{str};
        this.LJ = strArr3;
        this.LJFF = strArr4;
        this.LJII = str2;
    }
}
