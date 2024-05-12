package X;

/* renamed from: X.Q9o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66540Q9o {
    public final android.net.Uri LIZ;
    public final android.net.Uri LIZIZ;
    public final android.net.Uri LIZJ;
    public final C66550Q9y LIZLLL;

    public C66540Q9o() {
        throw null;
    }

    public C66540Q9o(C66550Q9y c66550Q9y) {
        this.LIZLLL = c66550Q9y;
        this.LIZ = (android.net.Uri) c66550Q9y.LIZ(C66550Q9y.LIZIZ);
        this.LIZIZ = (android.net.Uri) c66550Q9y.LIZ(C66550Q9y.LIZJ);
        this.LIZJ = (android.net.Uri) c66550Q9y.LIZ(C66550Q9y.LIZLLL);
    }

    public static void LIZ(android.net.Uri uri, QAM qam) {
        android.net.Uri build = uri.buildUpon().appendPath(".well-known").appendPath("openid-configuration").build();
        T2R.LJIILLIIL(build, "openIDConnectDiscoveryUri cannot be null");
        new AsyncTaskC66539Q9n(build, qam).execute1(new Void[0]);
    }

    public C66540Q9o(android.net.Uri uri, android.net.Uri uri2, android.net.Uri uri3) {
        uri.getClass();
        this.LIZ = uri;
        uri2.getClass();
        this.LIZIZ = uri2;
        this.LIZJ = uri3;
        this.LIZLLL = null;
    }
}
