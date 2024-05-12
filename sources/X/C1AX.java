package X;

import android.app.Notification;
import android.os.Build;
import android.widget.RemoteViews;

/* renamed from: X.1AX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AX extends AnonymousClass070 {
    @Override // X.AnonymousClass070
    public final String LJ() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    @Override // X.AnonymousClass070
    public final RemoteViews LJFF() {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        C022406y c022406y = this.LIZ;
        RemoteViews remoteViews = c022406y.LJJIFFI;
        if (remoteViews == null && (remoteViews = c022406y.LJJI) == null) {
            return null;
        }
        return LJIIIZ(remoteViews, true);
    }

    @Override // X.AnonymousClass070
    public final RemoteViews LJI() {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24 || (remoteViews = this.LIZ.LJJI) == null) {
            return null;
        }
        return LJIIIZ(remoteViews, false);
    }

    @Override // X.AnonymousClass070
    public final void LJII() {
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        this.LIZ.getClass();
    }

    @Override // X.AnonymousClass070
    public final void LIZIZ(AnonymousClass071 anonymousClass071) {
        if (Build.VERSION.SDK_INT >= 24) {
            anonymousClass071.LIZIZ.setStyle(new Notification.DecoratedCustomViewStyle());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.RemoteViews LJIIIZ(android.widget.RemoteViews r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AX.LJIIIZ(android.widget.RemoteViews, boolean):android.widget.RemoteViews");
    }
}
