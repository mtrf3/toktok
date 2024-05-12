package X;

/* loaded from: classes15.dex */
public final class W8K {
    public final W8L LIZ;
    public WB5 LIZIZ;
    public W9X LIZJ;
    public W9Y LIZLLL;
    public C81376Vwi LJ;
    public W82 LJFF;
    public W8M LJI;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final WB5 LIZ() {
        if (this.LIZIZ == null) {
            String str = this.LIZ.LJIIIIZZ;
            switch (str.hashCode()) {
                case -1868884870:
                    if (str.equals("legacy_default_params")) {
                        this.LIZIZ = new W8I(this.LIZ.LIZLLL, W9E.LIZ(), this.LIZ.LIZIZ);
                        break;
                    }
                    W8L w8l = this.LIZ;
                    this.LIZIZ = new W8I(w8l.LIZLLL, w8l.LIZ, w8l.LIZIZ);
                    break;
                case -1106578487:
                    if (str.equals("legacy")) {
                    }
                    W8L w8l2 = this.LIZ;
                    this.LIZIZ = new W8I(w8l2.LIZLLL, w8l2.LIZ, w8l2.LIZIZ);
                    break;
                case -404562712:
                    if (str.equals("experimental")) {
                        W8L w8l3 = this.LIZ;
                        this.LIZIZ = new W8Q(w8l3.LJIIIZ, w8l3.LJIIJ, C78937UyT.LJIIIIZZ());
                        break;
                    }
                    W8L w8l22 = this.LIZ;
                    this.LIZIZ = new W8I(w8l22.LIZLLL, w8l22.LIZ, w8l22.LIZIZ);
                    break;
                case 95945896:
                    if (str.equals("dummy")) {
                        this.LIZIZ = new W9A();
                        break;
                    }
                    W8L w8l222 = this.LIZ;
                    this.LIZIZ = new W8I(w8l222.LIZLLL, w8l222.LIZ, w8l222.LIZIZ);
                    break;
                default:
                    W8L w8l2222 = this.LIZ;
                    this.LIZIZ = new W8I(w8l2222.LIZLLL, w8l2222.LIZ, w8l2222.LIZIZ);
                    break;
            }
        }
        return this.LIZIZ;
    }

    public final W82 LIZJ() {
        if (this.LJFF == null) {
            if (this.LJI == null) {
                W8L w8l = this.LIZ;
                this.LJI = new W8M(w8l.LIZLLL, w8l.LJI, w8l.LJII);
            }
            this.LJFF = new W82(this.LJI);
        }
        return this.LJFF;
    }

    public W8K(W8L w8l) {
        this.LIZ = w8l;
    }

    public final W84 LIZIZ(int i) {
        W8H w8h;
        if (this.LJ == null) {
            if (i != 0) {
                if (i == 1) {
                    if (this.LIZJ == null) {
                        W8L w8l = this.LIZ;
                        this.LIZJ = new W9X(w8l.LIZLLL, w8l.LJ, w8l.LJFF);
                    }
                    w8h = this.LIZJ;
                } else {
                    throw new IllegalArgumentException("Invalid MemoryChunkType");
                }
            } else {
                if (this.LIZLLL == null) {
                    W8L w8l2 = this.LIZ;
                    this.LIZLLL = new W9Y(w8l2.LIZLLL, w8l2.LJ, w8l2.LJFF);
                }
                w8h = this.LIZLLL;
            }
            this.LJ = new C81376Vwi(w8h, LIZJ());
        }
        return this.LJ;
    }
}
