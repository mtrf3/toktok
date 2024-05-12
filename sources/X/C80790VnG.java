package X;

import android.database.DataSetObserver;

/* renamed from: X.VnG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80790VnG extends DataSetObserver {
    public final C80778Vn4 LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C80778Vn4 c80778Vn4 = this.LIZ;
        if (c80778Vn4 != null) {
            c80778Vn4.LJJIIJZLJL();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }

    public C80790VnG(C80778Vn4 c80778Vn4) {
        this.LIZ = c80778Vn4;
    }
}
