package X;

import android.database.DataSetObserver;

/* renamed from: X.VnH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80791VnH extends DataSetObserver {
    public final C80780Vn6 LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C80780Vn6 c80780Vn6 = this.LIZ;
        if (c80780Vn6 == null) {
            return;
        }
        c80780Vn6.LJJIIJZLJL();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }

    public C80791VnH(C80780Vn6 c80780Vn6) {
        this.LIZ = c80780Vn6;
    }
}
