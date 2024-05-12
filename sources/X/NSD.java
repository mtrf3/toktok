package X;

/* loaded from: classes11.dex */
public final class NSD {
    public final String LIZ;
    public final java.net.URL LIZIZ;
    public final String LIZJ;

    public NSD(String str, java.net.URL url, String str2) {
        this.LIZ = str;
        this.LIZIZ = url;
        this.LIZJ = str2;
    }

    public static NSD LIZ(String str, java.net.URL url, String str2) {
        C38891fp.LJI(str, "VendorKey is null or empty");
        C38891fp.LJI(str2, "VerificationParameters is null or empty");
        return new NSD(str, url, str2);
    }
}
