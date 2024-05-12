package X;

import android.util.LruCache;
import android.view.View;

/* renamed from: X.Nlh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60309Nlh extends LruCache<android.net.Uri, C30897CAr> {
    public C60309Nlh(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, android.net.Uri uri, C30897CAr c30897CAr, C30897CAr c30897CAr2) {
        View view;
        C60193Njp LIZLLL;
        C30897CAr c30897CAr3 = c30897CAr;
        super.entryRemoved(z, uri, c30897CAr3, c30897CAr2);
        if (z && c30897CAr3 != null && (view = c30897CAr3.LJLJI) != null && (LIZLLL = C28791BRr.LIZLLL(view)) != null) {
            LIZLLL.release();
        }
    }
}
