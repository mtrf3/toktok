package X;

/* renamed from: X.Elu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C37390Elu implements BQ6 {
    public final /* synthetic */ C37558Eoc LIZ;
    public final /* synthetic */ BQ6 LIZIZ;

    public /* synthetic */ C37390Elu(BQ6 bq6, C37558Eoc c37558Eoc) {
        this.LIZ = c37558Eoc;
        this.LIZIZ = bq6;
    }

    @Override // X.BQ6
    public final void accept(Object obj) {
        C37558Eoc c37558Eoc = this.LIZ;
        BQ6 bq6 = this.LIZIZ;
        String str = (String) obj;
        c37558Eoc.getClass();
        StringBuilder LIZ = X1D.LIZ();
        YE1.LIZLLL(LIZ, c37558Eoc.LJI, "Handle message from worker (Message: ", str, ")");
        C37238EjS.LJFF(X1D.LIZIZ(LIZ));
        bq6.accept(str);
    }
}
