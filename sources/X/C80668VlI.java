package X;

import android.database.DataSetObserver;

/* renamed from: X.VlI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80668VlI extends DataSetObserver {
    public final /* synthetic */ C80664VlE LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.LIZ.LJIIJJI();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.LIZ.LJIIJJI();
    }

    public C80668VlI(C80664VlE c80664VlE) {
        this.LIZ = c80664VlE;
    }
}
