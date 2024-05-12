package X;

import android.app.Notification;
import android.os.Bundle;

/* renamed from: X.1AW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AW extends AnonymousClass070 {
    public CharSequence LJ;

    @Override // X.AnonymousClass070
    public final String LJ() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // X.AnonymousClass070
    public final void LIZ(Bundle bundle) {
        super.LIZ(bundle);
    }

    @Override // X.AnonymousClass070
    public final void LIZIZ(AnonymousClass071 anonymousClass071) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(anonymousClass071.LIZIZ).setBigContentTitle(this.LIZIZ).bigText(this.LJ);
        if (this.LIZLLL) {
            bigText.setSummaryText(this.LIZJ);
        }
    }
}
