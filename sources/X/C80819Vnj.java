package X;

import android.database.DataSetObserver;

/* renamed from: X.Vnj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80819Vnj extends DataSetObserver {
    public final /* synthetic */ C80794VnK LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.LIZ.LJIILIIL();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.LIZ.LJIILIIL();
    }

    public C80819Vnj(C80794VnK c80794VnK) {
        this.LIZ = c80794VnK;
    }
}
