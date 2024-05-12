package X;

import android.database.DataSetObserver;

/* renamed from: X.Vel, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80263Vel extends DataSetObserver {
    public final /* synthetic */ C80261Vej LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C80261Vej c80261Vej = this.LIZ;
        if (c80261Vej instanceof C86894Y8k) {
            return;
        }
        c80261Vej.populateFromPagerAdapter();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        C80261Vej c80261Vej = this.LIZ;
        if (c80261Vej instanceof C86894Y8k) {
            return;
        }
        c80261Vej.populateFromPagerAdapter();
    }

    public C80263Vel(C80261Vej c80261Vej) {
        this.LIZ = c80261Vej;
    }
}
