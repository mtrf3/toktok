package X;

import android.app.Notification;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;

/* renamed from: X.1Ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33081Ro extends AnonymousClass070 {
    public int[] LJ;
    public MediaSessionCompat.Token LJFF;

    @Override // X.AnonymousClass070
    public final RemoteViews LJFF() {
        return null;
    }

    @Override // X.AnonymousClass070
    public final RemoteViews LJI() {
        return null;
    }

    @Override // X.AnonymousClass070
    public final void LIZIZ(AnonymousClass071 anonymousClass071) {
        Notification.Builder builder = anonymousClass071.LIZIZ;
        Notification.MediaStyle LIZ = C13790gR.LIZ();
        C13790gR.LIZIZ(LIZ, this.LJ, this.LJFF);
        C13790gR.LIZLLL(builder, LIZ);
    }
}
