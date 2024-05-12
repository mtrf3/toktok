package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XO8 {
    public final Context LIZ;
    public final MediaSessionCompat.Token LIZIZ;
    public final ComponentName LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final C62822Ol8 LJI;

    public final PendingIntent LIZLLL() {
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZJ);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 2);
        PendingIntent service = PendingIntent.getService(context, 2, intent, this.LJFF);
        o.LJIIIIZZ(service, "getService(\n        cont…        pendingFlag\n    )");
        return service;
    }

    public final PendingIntent LJ() {
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZJ);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 1);
        PendingIntent service = PendingIntent.getService(context, 1, intent, this.LJFF);
        o.LJIIIIZZ(service, "getService(\n            …    pendingFlag\n        )");
        return service;
    }

    public final PendingIntent LJFF() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            Context LIZIZ = EF7.LIZIZ();
            Intent launchIntentForPackage = LIZIZ.getPackageManager().getLaunchIntentForPackage(LIZIZ.getPackageName());
            if (launchIntentForPackage == null) {
                return LJI();
            }
            PendingIntent activity = PendingIntent.getActivity(LIZIZ, 3, launchIntentForPackage, this.LJFF);
            o.LJIIIIZZ(activity, "getActivity(\n           …    pendingFlag\n        )");
            return activity;
        }
        if (i <= 22) {
            Context LIZIZ2 = EF7.LIZIZ();
            Intent launchIntentForPackage2 = LIZIZ2.getPackageManager().getLaunchIntentForPackage(LIZIZ2.getPackageName());
            if (launchIntentForPackage2 == null) {
                return LJI();
            }
            PendingIntent activity2 = PendingIntent.getActivity(LIZIZ2, 3, launchIntentForPackage2, this.LJFF);
            o.LJIIIIZZ(activity2, "getActivity(\n           …    pendingFlag\n        )");
            return activity2;
        }
        return LJI();
    }

    public final PendingIntent LJI() {
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZJ);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 3);
        PendingIntent service = PendingIntent.getService(context, 3, intent, this.LJFF);
        o.LJIIIIZZ(service, "getService(\n            …    pendingFlag\n        )");
        return service;
    }

    public final void LIZ(C022406y c022406y) {
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZJ);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 8);
        c022406y.LIZ(R.drawable.zm, "FastForward", PendingIntent.getService(context, 8, intent, this.LJFF));
    }

    public final void LIZIZ(C022406y c022406y) {
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZJ);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 7);
        c022406y.LIZ(R.drawable.aun, "FastBackward", PendingIntent.getService(context, 7, intent, this.LJFF));
    }

    public final void LIZJ(C022406y c022406y, boolean z) {
        int i;
        if (z) {
            i = R.drawable.dex;
        } else {
            i = R.drawable.deu;
        }
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZJ);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 4);
        c022406y.LIZ(i, "PlayOrPause", PendingIntent.getService(context, 4, intent, this.LJFF));
    }

    public XO8(Context context, MediaSessionCompat.Token token, ComponentName notificationReceiverComponentName, int i) {
        int i2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(notificationReceiverComponentName, "notificationReceiverComponentName");
        this.LIZ = context;
        this.LIZIZ = token;
        this.LIZJ = notificationReceiverComponentName;
        this.LIZLLL = i;
        this.LJ = hashCode();
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 201326592;
        } else {
            i2 = 134217728;
        }
        this.LJFF = i2;
        this.LJI = C221108m2.LIZIZ(XOF.LJLIL);
    }
}
