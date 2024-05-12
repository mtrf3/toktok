package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XO9 {
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final Context LJII;
    public final MediaSessionCompat.Token LJIIIIZZ;
    public final int LJIIIZ;

    public final PendingIntent LIZ(ComponentName componentName) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 201326592;
        } else {
            i = 134217728;
        }
        Context context = this.LJII;
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.putExtra("command_from_notification", 3);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 3, intent, i);
        o.LJFF(broadcast, "PendingIntent.getBroadca…           flag\n        )");
        return broadcast;
    }

    public XO9(Context mContext, MediaSessionCompat.Token token, ComponentName notificationReceiverComponentName, int i) {
        o.LJIIJ(mContext, "mContext");
        o.LJIIJ(notificationReceiverComponentName, "notificationReceiverComponentName");
        this.LJII = mContext;
        this.LJIIIIZZ = token;
        this.LJIIIZ = i;
        this.LIZ = C221108m2.LIZIZ(new AqS162S0200000_15(this, notificationReceiverComponentName, 83));
        this.LIZIZ = C221108m2.LIZIZ(new AqS162S0200000_15(this, notificationReceiverComponentName, 82));
        this.LIZJ = C221108m2.LIZIZ(new AqS162S0200000_15(this, notificationReceiverComponentName, 84));
        this.LIZLLL = C221108m2.LIZIZ(new AqS162S0200000_15(this, notificationReceiverComponentName, 87));
        this.LJ = C221108m2.LIZIZ(new AqS162S0200000_15(this, notificationReceiverComponentName, 85));
        this.LJFF = C221108m2.LIZIZ(new AqS162S0200000_15(this, notificationReceiverComponentName, 86));
        this.LJI = C221108m2.LIZIZ(XOE.LJLIL);
    }
}
