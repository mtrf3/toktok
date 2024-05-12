package X;

import android.database.DataSetObserver;

/* renamed from: X.VlA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80660VlA extends DataSetObserver {
    public final /* synthetic */ C80655Vl5 LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.LIZ.LJIIJ();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.LIZ.LJIIJ();
    }

    public C80660VlA(C80655Vl5 c80655Vl5) {
        this.LIZ = c80655Vl5;
    }
}
