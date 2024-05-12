package X;

import android.database.DataSetObserver;
import kotlin.jvm.internal.o;

/* renamed from: X.Veo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80266Veo extends DataSetObserver {
    public final C80773Vmz LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C80773Vmz c80773Vmz = this.LIZ;
        if (c80773Vmz != null) {
            c80773Vmz.notifyDataSetChanged();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }

    public C80266Veo(C80773Vmz mParent) {
        o.LJIIJ(mParent, "mParent");
        this.LIZ = mParent;
    }
}
