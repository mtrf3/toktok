package X;

import android.database.DataSetObserver;

/* renamed from: X.Lhf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54963Lhf extends DataSetObserver {
    public final /* synthetic */ C56597MJd LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        super/*androidx.viewpager.widget.PagerAdapter*/.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        onChanged();
    }

    public C54963Lhf(C56597MJd c56597MJd) {
        this.LIZ = c56597MJd;
    }
}
