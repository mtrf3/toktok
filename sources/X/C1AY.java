package X;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1AY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AY extends AnonymousClass070 {
    public final ArrayList<CharSequence> LJ = new ArrayList<>();

    @Override // X.AnonymousClass070
    public final String LJ() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // X.AnonymousClass070
    public final void LIZIZ(AnonymousClass071 anonymousClass071) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(anonymousClass071.LIZIZ).setBigContentTitle(this.LIZIZ);
        if (this.LIZLLL) {
            bigContentTitle.setSummaryText(this.LIZJ);
        }
        Iterator<CharSequence> it = this.LJ.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }
}
