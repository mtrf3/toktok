package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Zrm, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91262Zrm {
    public final Context LIZ;
    public final C91419ZuJ LIZIZ;
    public final MediaSessionCompat.Token LIZJ;
    public final ComponentName LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final C62822Ol8 LJI;

    public final PendingIntent LJ() {
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZLLL);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 2);
        PendingIntent service = PendingIntent.getService(context, 2, intent, this.LJFF);
        o.LJIIIIZZ(service, "getService(\n        cont…        pendingFlag\n    )");
        return service;
    }

    public final PendingIntent LJFF() {
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZLLL);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 1);
        PendingIntent service = PendingIntent.getService(context, 1, intent, this.LJFF);
        o.LJIIIIZZ(service, "getService(\n            …    pendingFlag\n        )");
        return service;
    }

    public final PendingIntent LJI() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            Context LIZIZ = EF7.LIZIZ();
            Intent launchIntentForPackage = LIZIZ.getPackageManager().getLaunchIntentForPackage(LIZIZ.getPackageName());
            if (launchIntentForPackage == null) {
                return LJII();
            }
            PendingIntent activity = PendingIntent.getActivity(LIZIZ, 3, launchIntentForPackage, 201326592);
            o.LJIIIIZZ(activity, "getActivity(\n           ….FLAG_IMMUTABLE\n        )");
            return activity;
        }
        if (i <= 22) {
            Context LIZIZ2 = EF7.LIZIZ();
            Intent launchIntentForPackage2 = LIZIZ2.getPackageManager().getLaunchIntentForPackage(LIZIZ2.getPackageName());
            if (launchIntentForPackage2 == null) {
                return LJII();
            }
            PendingIntent activity2 = PendingIntent.getActivity(LIZIZ2, 3, launchIntentForPackage2, this.LJFF);
            o.LJIIIIZZ(activity2, "getActivity(\n           …    pendingFlag\n        )");
            return activity2;
        }
        return LJII();
    }

    public final PendingIntent LJII() {
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZLLL);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 3);
        PendingIntent service = PendingIntent.getService(context, 3, intent, this.LJFF);
        o.LJIIIIZZ(service, "getService(\n            …    pendingFlag\n        )");
        return service;
    }

    public final Notification LIZLLL(C91263Zrn params) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        o.LJIIIZ(params, "params");
        try {
            C022406y c022406y = new C022406y(this.LIZ, this.LIZIZ.LJLJJLL);
            c022406y.LIZLLL(false);
            c022406y.LJJIIJ.icon = this.LIZIZ.LJLILLLLZI;
            c022406y.LJIIIZ(null);
            c022406y.LJIIJJI = false;
            ((InterfaceC91267Zrr) this.LJI.getValue()).LIZ();
            c022406y.LJJ = 1;
            c022406y.LJI = LJI();
            CharSequence charSequence = params.LIZLLL;
            String str = "";
            if (charSequence == null) {
                charSequence = "";
            }
            c022406y.LJFF(charSequence);
            CharSequence charSequence2 = params.LJ;
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            c022406y.LJ(charSequence2);
            String str2 = params.LJFF;
            if (str2 != null) {
                str = str2;
            }
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c022406y.LJIILIIL = C022406y.LIZJ(str);
            }
            c022406y.LJJIIJ.deleteIntent = LJFF();
            c022406y.LJIIZILJ = this.LIZIZ.LJLJI;
            Bitmap bitmap = params.LJI;
            if (bitmap != null && bitmap.isRecycled()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("coverBitmap(");
                LIZ.append(params.LJI);
                LIZ.append(") already recycled.");
                X1D.LIZIZ(LIZ);
            } else {
                c022406y.LJIIIIZZ(params.LJI);
            }
            Boolean bool = params.LIZIZ;
            if (bool != null) {
                z3 = bool.booleanValue();
            } else {
                z3 = false;
            }
            LIZJ(c022406y, z3);
            Boolean bool2 = params.LIZ;
            if (bool2 != null) {
                z4 = bool2.booleanValue();
            } else {
                z4 = false;
            }
            LIZIZ(c022406y, z4);
            Boolean bool3 = params.LIZJ;
            if (bool3 != null) {
                z5 = bool3.booleanValue();
            } else {
                z5 = false;
            }
            LIZ(c022406y, z5);
            C33081Ro c33081Ro = new C33081Ro();
            c33081Ro.LJ = new int[]{0, 1, 2};
            c33081Ro.LJFF = this.LIZJ;
            LJ();
            c022406y.LJIIJ(c33081Ro);
            return c022406y.LIZIZ();
        } catch (Throwable th) {
            C78983UzD.LJIJ(th, "create");
            return null;
        }
    }

    public final void LIZ(C022406y c022406y, boolean z) {
        int i;
        if (z) {
            i = R.drawable.kw;
        } else {
            i = R.drawable.kx;
        }
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZLLL);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 5);
        c022406y.LIZ(i, "SkipToNext", PendingIntent.getService(context, 5, intent, this.LJFF));
    }

    public final void LIZIZ(C022406y c022406y, boolean z) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addPlayingAction ");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        if (z) {
            i = R.drawable.ky;
        } else {
            i = R.drawable.kz;
        }
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZLLL);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 4);
        c022406y.LIZ(i, "PlayOrPause", PendingIntent.getService(context, 4, intent, this.LJFF));
    }

    public final void LIZJ(C022406y c022406y, boolean z) {
        int i;
        if (z) {
            i = R.drawable.l0;
        } else {
            i = R.drawable.l1;
        }
        Context context = this.LIZ;
        Intent intent = new Intent();
        intent.setComponent(this.LIZLLL);
        intent.putExtra("EXTRA_KEY_FACTORY_ID", this.LJ);
        intent.putExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", 6);
        c022406y.LIZ(i, "SkipToPrevious", PendingIntent.getService(context, 6, intent, this.LJFF));
    }

    public C91262Zrm(Context context, C91419ZuJ config, MediaSessionCompat.Token token, ComponentName serviceComponentName) {
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(serviceComponentName, "serviceComponentName");
        this.LIZ = context;
        this.LIZIZ = config;
        this.LIZJ = token;
        this.LIZLLL = serviceComponentName;
        this.LJ = hashCode();
        if (Build.VERSION.SDK_INT >= 23) {
            i = 201326592;
        } else {
            i = 134217728;
        }
        this.LJFF = i;
        this.LJI = C221108m2.LIZIZ(C91599ZxD.LJLIL);
    }
}
