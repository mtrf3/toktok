package X;

import android.database.ContentObserver;

/* loaded from: classes12.dex */
public final class QCA extends ContentObserver {
    public QCA() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AbstractC68056QnM.LJII.incrementAndGet();
    }
}
