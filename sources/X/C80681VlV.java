package X;

import android.database.DataSetObserver;

/* renamed from: X.VlV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80681VlV extends DataSetObserver {
    public final /* synthetic */ C80675VlP LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.LIZ.LJIIL();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.LIZ.LJIIL();
    }

    public C80681VlV(C80675VlP c80675VlP) {
        this.LIZ = c80675VlP;
    }
}
