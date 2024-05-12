package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NzN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61157NzN {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public static final C61159NzP LJIIIIZZ = new C61159NzP();
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C61158NzO.LJLIL);

    public /* synthetic */ C61157NzN(String str, String str2, long j, String str3, String str4, String str5) {
        this(j, str, str2, str3, str4, str5, true);
    }

    public C61157NzN(String accessKey, String offlineDir, long j, String appVersion, String did, String region, boolean z) {
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(offlineDir, "offlineDir");
        o.LJIIJ(appVersion, "appVersion");
        o.LJIIJ(did, "did");
        o.LJIIJ(region, "region");
        this.LIZ = accessKey;
        this.LIZIZ = offlineDir;
        this.LIZJ = j;
        this.LIZLLL = appVersion;
        this.LJ = did;
        this.LJFF = region;
        this.LJI = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C61157NzN(long j, String str, String offlineDir, String appVersion, String did, String region, boolean z) {
        this(str, offlineDir, j, appVersion, did, region, z);
        o.LJIIJ(offlineDir, "offlineDir");
        o.LJIIJ(appVersion, "appVersion");
        o.LJIIJ(did, "did");
        o.LJIIJ(region, "region");
    }
}
