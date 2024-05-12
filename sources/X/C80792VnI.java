package X;

import android.database.DataSetObserver;

/* renamed from: X.VnI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80792VnI extends DataSetObserver {
    public final /* synthetic */ C80769Vmv LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.LIZ.LJIIIZ();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.LIZ.LJIIIZ();
    }

    public C80792VnI(C80769Vmv c80769Vmv) {
        this.LIZ = c80769Vmv;
    }
}
