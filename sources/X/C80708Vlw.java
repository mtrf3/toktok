package X;

import android.database.DataSetObserver;

/* renamed from: X.Vlw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80708Vlw extends DataSetObserver {
    public final /* synthetic */ C80695Vlj LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.LIZ.LJIILIIL();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.LIZ.LJIILIIL();
    }

    public C80708Vlw(C80695Vlj c80695Vlj) {
        this.LIZ = c80695Vlj;
    }
}
