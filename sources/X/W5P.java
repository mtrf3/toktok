package X;

/* loaded from: classes15.dex */
public final class W5P {
    public android.net.Uri LIZ;
    public C79238V7y LIZJ;
    public V85 LIZLLL;
    public InterfaceC81754W6s LJIILJJIL;
    public W50 LIZIZ = W50.FULL_FETCH;
    public C81810W8w LJ = C81810W8w.LJIILIIL;
    public QGT LJFF = QGT.DEFAULT;
    public boolean LJI = false;
    public boolean LJII = false;
    public boolean LJIIIIZZ = false;
    public W92 LJIIIZ = W92.MEDIUM;
    public VA3 LJIIJ = null;
    public boolean LJIIJJI = true;
    public boolean LJIIL = false;
    public boolean LJIILIIL = true;
    public C81787W7z LJIILL = null;
    public String LJIILLIIL = null;
    public final int LJIIZILJ = 1;
    public final boolean LJIJ = true;

    public final W5O LIZ() {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400600, "com/facebook/imagepipeline/request/ImageRequestBuilder", "build", this, new Object[0], "com.facebook.imagepipeline.request.ImageRequest", new C65300Pk0(false, "()Lcom/facebook/imagepipeline/request/ImageRequest;", "553654957552611802"));
        if (LIZJ.LIZ) {
            return (W5O) LIZJ.LIZIZ;
        }
        android.net.Uri uri = this.LIZ;
        if (uri != null) {
            if ("res".equals(C78964Uyu.LIZIZ(uri))) {
                if (this.LIZ.isAbsolute()) {
                    if (!this.LIZ.getPath().isEmpty()) {
                        try {
                            Integer.parseInt(this.LIZ.getPath().substring(1));
                        } catch (NumberFormatException unused) {
                            throw new UHS("Resource URI path must be a resource id.");
                        }
                    } else {
                        throw new UHS("Resource URI must not be empty");
                    }
                } else {
                    throw new UHS("Resource URI path must be absolute.");
                }
            }
            if (!"asset".equals(C78964Uyu.LIZIZ(this.LIZ)) || this.LIZ.isAbsolute()) {
                return new W5O(this);
            }
            throw new UHS("Asset URI path must be absolute.");
        }
        throw new UHS("Source must be set!");
    }

    public static W5P LIZIZ(W5O w5o) {
        W5P LIZLLL = LIZLLL(w5o.LIZIZ);
        LIZLLL.LJ = w5o.LJII;
        LIZLLL.LJIILL = w5o.LJIIJ;
        LIZLLL.LJFF = w5o.LIZ;
        LIZLLL.LJIIIIZZ = w5o.LJI;
        LIZLLL.LIZIZ = w5o.LJIIL;
        LIZLLL.LJIIJ = w5o.LJIILLIIL;
        LIZLLL.LJI = w5o.LJ;
        LIZLLL.LJIIIZ = w5o.LJIIJJI;
        LIZLLL.LIZJ = w5o.LJIIIIZZ;
        LIZLLL.LJIILJJIL = w5o.LJIIZILJ;
        LIZLLL.LIZLLL = w5o.LJIIIZ;
        return LIZLLL;
    }

    public static W5P LIZJ(int i) {
        return LIZLLL(C78964Uyu.LIZJ(i));
    }

    public static W5P LIZLLL(android.net.Uri uri) {
        W5P w5p = new W5P();
        uri.getClass();
        w5p.LIZ = uri;
        return w5p;
    }
}
