package X;

/* renamed from: X.QyL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68737QyL {
    public static final C68737QyL[] LJII;
    public static final C68737QyL[] LJIIIIZZ;
    public final String LIZ;
    public final String[] LIZIZ;
    public boolean LIZJ;
    public String LJ;
    public long LJI = -1;
    public String LIZLLL = "";
    public String LJFF = "";

    static {
        C68737QyL c68737QyL = new C68737QyL("facebook", null);
        C68737QyL c68737QyL2 = new C68737QyL("twitter", new String[]{"twitter", "m_twitter"});
        C68737QyL c68737QyL3 = new C68737QyL("google", null);
        C68737QyL c68737QyL4 = new C68737QyL("kakaotalk", null);
        C68737QyL c68737QyL5 = new C68737QyL("instagram", null);
        C68737QyL c68737QyL6 = new C68737QyL("vk", null);
        C68737QyL c68737QyL7 = new C68737QyL("line", null);
        LJII = new C68737QyL[]{c68737QyL, c68737QyL2, c68737QyL3, c68737QyL7, c68737QyL4, c68737QyL5, c68737QyL6, new C68737QyL("mobile", null)};
        LJIIIIZZ = new C68737QyL[]{c68737QyL, c68737QyL2, c68737QyL3, c68737QyL7, c68737QyL4, c68737QyL5, c68737QyL6};
    }

    public C68737QyL(String str, String[] strArr) {
        this.LIZ = str;
        this.LIZIZ = strArr;
    }
}
