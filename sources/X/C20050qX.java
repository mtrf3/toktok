package X;

/* renamed from: X.0qX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20050qX {
    public static final /* synthetic */ int LJFF = 0;
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public long LIZLLL;
    public String LJ;

    public C20050qX(String str, String str2, String str3, int i) {
        String str4 = str3;
        String str5 = str2;
        String str6 = (i & 1) != 0 ? "" : str;
        str5 = (i & 2) != 0 ? "inapp" : str5;
        str4 = (i & 4) != 0 ? "" : str4;
        String str7 = (i & 16) == 0 ? null : "";
        C43588H8u.LIZLLL(str6, "productId", str5, "productType", str4, "offerToken", str7, "currency");
        this.LIZ = str6;
        this.LIZIZ = str5;
        this.LIZJ = str4;
        this.LIZLLL = 0L;
        this.LJ = str7;
    }
}
