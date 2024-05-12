package X;

import android.database.DataSetObserver;

/* renamed from: X.Zpv, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91147Zpv extends DataSetObserver {
    public final /* synthetic */ C91362ZtO LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.LIZ.LJIIL();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.LIZ.LJIIL();
    }

    public C91147Zpv(C91362ZtO c91362ZtO) {
        this.LIZ = c91362ZtO;
    }
}
