package X;

import android.database.DataSetObserver;

/* renamed from: X.Vnp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80825Vnp extends DataSetObserver {
    public final /* synthetic */ C80795VnL LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.LIZ.LJIILIIL();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.LIZ.LJIILIIL();
    }

    public C80825Vnp(C80795VnL c80795VnL) {
        this.LIZ = c80795VnL;
    }
}
