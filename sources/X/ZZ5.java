package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import java.util.ArrayList;

/* loaded from: classes29.dex */
public final class ZZ5 extends BroadcastReceiver {
    public final /* synthetic */ MediaNotificationService LIZ;

    public ZZ5(MediaNotificationService mediaNotificationService) {
        this.LIZ = mediaNotificationService;
    }

    public final void LIZ(Context context, Intent intent) {
        boolean z;
        PendingIntent activities;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("targetActivity");
        QH7.LJIIIIZZ(componentName);
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        ZYJ zyj = this.LIZ.LJLLLL;
        zyj.getClass();
        QH7.LJ("Must be called from the main thread.");
        try {
            z = zyj.LIZIZ.LJII();
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = ZYJ.LJII;
            C16880lQ.LJLLJ(InterfaceC90110ZYc.class);
            c90469Zez.getClass();
            z = false;
        }
        if (z) {
            intent2.setFlags(603979776);
            activities = PendingIntent.getActivity(context, 1, intent2, C90295ZcB.LIZ | 134217728);
        } else {
            C020906j c020906j = new C020906j(this.LIZ);
            c020906j.LIZJ(componentName);
            c020906j.LJLIL.add(intent2);
            int i = C90295ZcB.LIZ | 134217728;
            if (!c020906j.LJLIL.isEmpty()) {
                Intent[] intentArr = (Intent[]) c020906j.LJLIL.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                activities = PendingIntent.getActivities(c020906j.LJLILLLLZI, 1, intentArr, i, null);
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
            }
        }
        try {
            QH7.LJIIIIZZ(activities);
            activities.send(context, 1, new Intent().setFlags(268435456));
        } catch (PendingIntent.CanceledException unused2) {
            MediaNotificationService.LJLZ.getClass();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}
