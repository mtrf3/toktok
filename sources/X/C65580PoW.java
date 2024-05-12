package X;

/* renamed from: X.PoW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65580PoW {
    public final Object LIZ;
    public final Object LIZIZ;
    public final Object LIZJ;

    public C65580PoW(Object obj, Object obj2, Object obj3) {
        this.LIZ = obj;
        this.LIZIZ = obj2;
        this.LIZJ = obj3;
    }

    public final IllegalArgumentException LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Multiple entries with same key: ");
        LIZ.append(this.LIZ);
        LIZ.append("=");
        LIZ.append(this.LIZIZ);
        LIZ.append(" and ");
        LIZ.append(this.LIZ);
        LIZ.append("=");
        LIZ.append(this.LIZJ);
        return new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }
}
