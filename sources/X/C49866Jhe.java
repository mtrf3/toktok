package X;

/* renamed from: X.Jhe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49866Jhe extends RuntimeException {
    public final int insertPosition;
    public final int listSize;

    public C49866Jhe(int i, int i2) {
        super(C48690J9a.LJIIJJI("decide to insert position:", i, ",but listSize limit:", i2, "."));
        this.insertPosition = i;
        this.listSize = i2;
    }
}
