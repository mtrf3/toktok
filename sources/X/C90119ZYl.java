package X;

import android.util.LruCache;
import com.google.android.gms.cast.MediaQueueItem;
import java.util.ArrayList;

/* renamed from: X.ZYl, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90119ZYl extends LruCache<Integer, MediaQueueItem> {
    public final /* synthetic */ C90120ZYm LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90119ZYl(C90120ZYm c90120ZYm) {
        super(20);
        this.LIZ = c90120ZYm;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Integer num, MediaQueueItem mediaQueueItem, MediaQueueItem mediaQueueItem2) {
        if (!z) {
            return;
        }
        QH7.LJIIIIZZ(this.LIZ.LJI);
        ((ArrayList) this.LIZ.LJI).add(num);
    }
}
