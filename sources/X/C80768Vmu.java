package X;

import android.database.DataSetObserver;

/* renamed from: X.Vmu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80768Vmu extends DataSetObserver {
    public final C80771Vmx LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C80771Vmx c80771Vmx = this.LIZ;
        if (c80771Vmx != null) {
            c80771Vmx.notifyDataSetChanged();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }

    public C80768Vmu(C80771Vmx c80771Vmx) {
        this.LIZ = c80771Vmx;
    }
}
