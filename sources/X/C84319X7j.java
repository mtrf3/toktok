package X;

import android.database.ContentObserver;
import java.lang.ref.WeakReference;

/* renamed from: X.X7j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84319X7j extends ContentObserver {
    public final WeakReference<AbstractC84318X7i> LIZ;

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    public C84319X7j(AbstractC84318X7i abstractC84318X7i) {
        super(null);
        this.LIZ = new WeakReference<>(abstractC84318X7i);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AbstractC84318X7i abstractC84318X7i = this.LIZ.get();
        if (abstractC84318X7i != null) {
            synchronized (abstractC84318X7i.LJLJJLL) {
                abstractC84318X7i.LJLL.dispatchChange(false);
            }
        }
    }
}
