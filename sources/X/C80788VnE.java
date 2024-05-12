package X;

import android.database.DataSetObserver;

/* renamed from: X.VnE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80788VnE extends DataSetObserver {
    public final C80782Vn8 LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C80782Vn8 c80782Vn8 = this.LIZ;
        if (c80782Vn8 != null) {
            c80782Vn8.LJJIII();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }

    public C80788VnE(C80782Vn8 c80782Vn8) {
        this.LIZ = c80782Vn8;
    }
}
