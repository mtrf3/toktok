package X;

import android.database.DataSetObserver;

/* renamed from: X.Vnn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80823Vnn extends DataSetObserver {
    public final /* synthetic */ C80797VnN LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.LIZ.LJFF();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.LIZ.LJFF();
    }

    public C80823Vnn(C80797VnN c80797VnN) {
        this.LIZ = c80797VnN;
    }
}
