package X;

/* renamed from: X.EmR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37423EmR<T> implements BQ6<Throwable> {
    public final /* synthetic */ BQ6 LIZ = null;

    @Override // X.BQ6
    public final void accept(Throwable th) {
        Throwable th2 = th;
        C37542EoM c37542EoM = C37542EoM.LJIIJJI;
        BQ6 bq6 = this.LIZ;
        if (bq6 != null) {
            bq6.accept(new C37394Ely(-10001, th2.getMessage()));
        }
        c37542EoM.getClass();
        C37542EoM.LJFF.set(false);
        C37238EjS.LIZLLL(4, "Update settings error:", th2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[PIASettings] Update Async settings failed. Error: ");
        LIZ.append(th2.getMessage());
        C37238EjS.LJI(6, X1D.LIZIZ(LIZ), null);
    }
}
