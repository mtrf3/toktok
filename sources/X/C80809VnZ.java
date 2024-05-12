package X;

import android.database.DataSetObserver;

/* renamed from: X.VnZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80809VnZ extends DataSetObserver {
    public final /* synthetic */ C80796VnM LIZ;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (C187857Yv.LIZ >= 2) {
            C36922EeM.LIZLLL(3, "FeedNotOnRenderFirstFrameLog", "PagerObserver onChanged");
        }
        this.LIZ.LJIILL();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.LIZ.LJIILL();
    }

    public C80809VnZ(C80796VnM c80796VnM) {
        this.LIZ = c80796VnM;
    }
}
