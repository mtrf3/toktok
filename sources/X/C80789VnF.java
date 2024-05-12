package X;

import android.database.DataSetObserver;

/* renamed from: X.VnF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80789VnF extends DataSetObserver {
    public final C80776Vn2 LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C80776Vn2 c80776Vn2 = this.LIZ;
        if (c80776Vn2 == null) {
            return;
        }
        c80776Vn2.LJJIIJZLJL();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }

    public C80789VnF(C80776Vn2 c80776Vn2) {
        this.LIZ = c80776Vn2;
    }
}
