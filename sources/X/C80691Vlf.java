package X;

import android.database.DataSetObserver;

/* renamed from: X.Vlf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80691Vlf extends DataSetObserver {
    public final /* synthetic */ C80684VlY LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.LIZ.LJIIL();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.LIZ.LJIIL();
    }

    public C80691Vlf(C80684VlY c80684VlY) {
        this.LIZ = c80684VlY;
    }
}
