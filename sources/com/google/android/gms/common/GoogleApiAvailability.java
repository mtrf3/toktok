package com.google.android.gms.common;

import X.AbstractC61220O0y;
import X.AbstractC67638Qgc;
import X.AbstractDialogInterfaceOnClickListenerC66636QDg;
import X.ActivityC45651qj;
import X.C022406y;
import X.C16880lQ;
import X.C1AW;
import X.C44384HbQ;
import X.C44389HbV;
import X.C61219O0x;
import X.C66637QDh;
import X.C67258QaU;
import X.C67259QaV;
import X.C67261QaX;
import X.C67262QaY;
import X.C67263QaZ;
import X.C67264Qaa;
import X.C67547Qf9;
import X.C67719Qhv;
import X.C67824Qjc;
import X.DialogFragmentC66648QDs;
import X.HandlerC67260QaW;
import X.HandlerC67272Qai;
import X.InterfaceC67296Qb6;
import X.InterfaceC67549QfB;
import X.QH7;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes12.dex */
public class GoogleApiAvailability extends C67258QaU {
    public String zac;
    public static final Object zaa = new Object();
    public static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C67258QaU.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    @Override // X.C67258QaU
    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    @Override // X.C67258QaU
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // X.C67258QaU
    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    public final void zaf(Context context) {
        new HandlerC67260QaW(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public static final AbstractC67638Qgc<Map<C67719Qhv<?>, String>> zai(InterfaceC67549QfB<?> interfaceC67549QfB, InterfaceC67549QfB<?>... interfaceC67549QfBArr) {
        C67824Qjc c67824Qjc;
        QH7.LJIIIZ(interfaceC67549QfB, "Requested API must not be null.");
        for (InterfaceC67549QfB<?> interfaceC67549QfB2 : interfaceC67549QfBArr) {
            QH7.LJIIIZ(interfaceC67549QfB2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(interfaceC67549QfBArr.length + 1);
        arrayList.add(interfaceC67549QfB);
        arrayList.addAll(Arrays.asList(interfaceC67549QfBArr));
        synchronized (C67824Qjc.LJZ) {
            QH7.LJIIIZ(C67824Qjc.LJZI, "Must guarantee manager is non-null before using getInstance");
            c67824Qjc = C67824Qjc.LJZI;
        }
        c67824Qjc.getClass();
        C67547Qf9 c67547Qf9 = new C67547Qf9(arrayList);
        HandlerC67272Qai handlerC67272Qai = c67824Qjc.LJLLL;
        handlerC67272Qai.sendMessage(handlerC67272Qai.obtainMessage(2, c67547Qf9));
        return c67547Qf9.LIZJ.LIZ;
    }

    public AbstractC67638Qgc<Void> checkApiAvailability(InterfaceC67549QfB<?> interfaceC67549QfB, InterfaceC67549QfB<?>... interfaceC67549QfBArr) {
        return zai(interfaceC67549QfB, interfaceC67549QfBArr).LJIILJJIL();
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        if (connectionResult.LJJJJL()) {
            return connectionResult.zzc;
        }
        return getErrorResolutionPendingIntent(context, connectionResult.zzb, 0);
    }

    @Override // X.C67258QaU
    public int isGooglePlayServicesAvailable(Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    public void showErrorNotification(Context context, int i) {
        zae(context, i, null, getErrorResolutionPendingIntent(context, i, 0, "n"));
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C67259QaV.LIZJ(18, activity));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zad(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final C61219O0x zac(Context context, AbstractC61220O0y abstractC61220O0y) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C61219O0x c61219O0x = new C61219O0x(abstractC61220O0y);
        C16880lQ.LJJLIIIJILLIZJL(c61219O0x, context, intentFilter);
        c61219O0x.LIZ = context;
        if (!isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            abstractC61220O0y.LIZ();
            synchronized (c61219O0x) {
                Context context2 = c61219O0x.LIZ;
                if (context2 != null) {
                    C16880lQ.LJJLIIIJL(context2, c61219O0x);
                }
                c61219O0x.LIZ = null;
            }
            return null;
        }
        return c61219O0x;
    }

    @Override // X.C67258QaU
    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    @Override // X.C67258QaU
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    public final boolean zah(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent errorResolutionPendingIntent;
        if (C44384HbQ.LJLLL(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        int i2 = connectionResult.zzb;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", errorResolutionPendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        zae(context, i2, null, PendingIntent.getActivity(context, 0, intent, C67262QaY.LIZ | 134217728));
        return true;
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i, new C66637QDh(activity, i2, getErrorResolutionIntent(activity, i, "d")), onCancelListener);
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final Dialog zaa(Context context, int i, AbstractDialogInterfaceOnClickListenerC66636QDg abstractDialogInterfaceOnClickListenerC66636QDg, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C67259QaV.LIZJ(i, context));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String LIZIZ = C67259QaV.LIZIZ(i, context);
        if (LIZIZ != null) {
            builder.setPositiveButton(LIZIZ, abstractDialogInterfaceOnClickListenerC66636QDg);
        }
        String LIZLLL = C67259QaV.LIZLLL(i, context);
        if (LIZLLL != null) {
            builder.setTitle(LIZLLL);
        }
        C16880lQ.LLLZ("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)});
        new IllegalArgumentException();
        return builder.create();
    }

    public final void zad(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC45651qj) {
                FragmentManager supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                QH7.LJIIIZ(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                supportErrorDialogFragment.LJLIL = dialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.LJLILLLLZI = onCancelListener;
                }
                supportErrorDialogFragment.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC66648QDs dialogFragmentC66648QDs = new DialogFragmentC66648QDs();
        QH7.LJIIIZ(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        dialogFragmentC66648QDs.LJLIL = dialog;
        if (onCancelListener != null) {
            dialogFragmentC66648QDs.LJLILLLLZI = onCancelListener;
        }
        dialogFragmentC66648QDs.show(fragmentManager, str);
    }

    public final void zae(Context context, int i, String str, PendingIntent pendingIntent) {
        String LIZLLL;
        String LJ;
        String str2;
        int i2;
        C16880lQ.LLLZ("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null});
        new IllegalArgumentException();
        if (i == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        if (i == 6) {
            LIZLLL = C67259QaV.LJFF(context, "common_google_play_services_resolution_required_title");
        } else {
            LIZLLL = C67259QaV.LIZLLL(i, context);
        }
        if (LIZLLL == null) {
            LIZLLL = context.getResources().getString(com.zhiliaoapp.musically.R.string.dnq);
        }
        if (i == 6 || i == 19) {
            LJ = C67259QaV.LJ(context, "common_google_play_services_resolution_required_text", C67259QaV.LIZ(context));
        } else {
            LJ = C67259QaV.LIZJ(i, context);
        }
        Resources resources = context.getResources();
        Object LLILL = C16880lQ.LLILL(context, "notification");
        QH7.LJIIIIZZ(LLILL);
        NotificationManager notificationManager = (NotificationManager) LLILL;
        C022406y c022406y = new C022406y(context, null);
        c022406y.LJIJI = true;
        c022406y.LJII(16, true);
        c022406y.LJFF(LIZLLL);
        C1AW c1aw = new C1AW();
        c1aw.LJ = C022406y.LIZJ(LJ);
        c022406y.LJIIJ(c1aw);
        PackageManager packageManager = context.getPackageManager();
        if (C67261QaX.LIZ == null) {
            C67261QaX.LIZ = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (C67261QaX.LIZ.booleanValue()) {
            c022406y.LJJIIJ.icon = context.getApplicationInfo().icon;
            c022406y.LJIIJ = 2;
            if (C67261QaX.LIZ(context)) {
                c022406y.LIZ(com.zhiliaoapp.musically.R.drawable.ajo, resources.getString(com.zhiliaoapp.musically.R.string.dpj), pendingIntent);
            } else {
                c022406y.LJI = pendingIntent;
            }
        } else {
            c022406y.LJJIIJ.icon = R.drawable.stat_sys_warning;
            c022406y.LJJIIJ.tickerText = C022406y.LIZJ(resources.getString(com.zhiliaoapp.musically.R.string.dnq));
            c022406y.LJJIIJ.when = System.currentTimeMillis();
            c022406y.LJI = pendingIntent;
            c022406y.LJ(LJ);
        }
        if (C44389HbV.LIZ()) {
            QH7.LJIIJJI(C44389HbV.LIZ());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(com.zhiliaoapp.musically.R.string.dnp);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            c022406y.LJJII = str2;
        }
        Notification LIZIZ = c022406y.LIZIZ();
        if (i != 1 && i != 2 && i != 3) {
            i2 = 39789;
        } else {
            C67264Qaa.LIZ.set(false);
            i2 = 10436;
        }
        notificationManager.notify(i2, LIZIZ);
    }

    public final boolean zag(Activity activity, InterfaceC67296Qb6 interfaceC67296Qb6, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i, new C67263QaZ(getErrorResolutionIntent(activity, i, "d"), interfaceC67296Qb6), onCancelListener);
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
