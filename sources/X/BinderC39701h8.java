package X;

import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* renamed from: X.1h8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class BinderC39701h8 extends AnonymousClass186 {
    public final WeakReference<C01U> LJLILLLLZI;

    public BinderC39701h8(C01U c01u) {
        this.LJLILLLLZI = new WeakReference<>(c01u);
    }

    @Override // X.InterfaceC007601g
    public final void LLJLLL(PlaybackStateCompat playbackStateCompat) {
        C01U c01u = this.LJLILLLLZI.get();
        if (c01u != null) {
            c01u.LIZLLL(2, playbackStateCompat, null);
        }
    }
}
