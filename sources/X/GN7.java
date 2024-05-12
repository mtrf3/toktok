package X;

/* loaded from: classes8.dex */
public final class GN7 extends C41426GNq {
    public final int LIZLLL;
    public int LJ;

    public GN7() {
        this(0);
    }

    @Override // X.C41426GNq
    public final int LIZ() {
        return this.LIZLLL;
    }

    public final int hashCode() {
        return this.LJ;
    }

    public GN7(int i) {
        super(0);
        this.LIZLLL = 108;
        this.LJ = 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GN7)) {
            return false;
        }
        GN7 gn7 = (GN7) obj;
        if (gn7.LIZLLL != this.LIZLLL || gn7.LJ != this.LJ) {
            return false;
        }
        return true;
    }
}
