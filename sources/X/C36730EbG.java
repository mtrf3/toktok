package X;

import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.EbG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36730EbG {
    public static final /* synthetic */ InterfaceC74236TBo[] LJFF;
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final String LJ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C36730EbG.class), "uri", "getUri()Landroid/net/Uri;");
        C65352Pkq.LIZ.getClass();
        LJFF = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(C36730EbG.class), "host", "getHost()Ljava/lang/String;"), new TBT(C65352Pkq.LIZ(C36730EbG.class), "queryMap", "getQueryMap()Ljava/util/SortedMap;"), new TBT(C65352Pkq.LIZ(C36730EbG.class), "hash", "getHash()Ljava/lang/String;")};
    }

    public final android.net.Uri LIZ() {
        return (android.net.Uri) this.LIZ.getValue();
    }

    public C36730EbG(String url) {
        o.LJIIJ(url, "url");
        this.LJ = url;
        this.LIZ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 86));
        this.LIZIZ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 84));
        this.LIZJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 85));
        this.LIZLLL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 83));
    }
}
