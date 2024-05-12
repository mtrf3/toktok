package X;

/* loaded from: classes16.dex */
public final class Y4J extends F9E implements C33Q {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public Y4J() {
        this(0, 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI)};
    }

    public Y4J(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    public static Y4J L(Y4J y4j, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = y4j.LJLIL;
        }
        if ((i3 & 2) != 0) {
            i2 = y4j.LJLILLLLZI;
        }
        y4j.getClass();
        return new Y4J(i, i2);
    }
}
