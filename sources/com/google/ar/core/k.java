package com.google.ar.core;

import X.C16880lQ;
import X.C93532aSO;
import X.C94119abr;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* loaded from: classes34.dex */
public final class k extends ArCoreApk {
    public static final k c = new k();
    public Exception a;
    public boolean b = true;
    public boolean d;
    public int e;
    public long f;
    public ArCoreApk.Availability g;
    public boolean h;
    public v i;
    public boolean j;
    public boolean k;
    public int l;

    public static k a() {
        return c;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public final synchronized void c() {
        if (this.a == null) {
            this.e = 0;
        }
        this.d = false;
        v vVar = this.i;
        if (vVar != null) {
            vVar.b();
            this.i = null;
        }
    }

    private final boolean g(Context context) {
        j(context);
        return this.k;
    }

    public static int i(Context context) {
        try {
            PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), "com.google.ar.core", 4);
            int i = LLLLLLZ.versionCode;
            if (i == 0) {
                ServiceInfo[] serviceInfoArr = LLLLLLZ.services;
                if (serviceInfoArr != null) {
                    if (serviceInfoArr.length != 0) {
                        return 0;
                    }
                }
                return -1;
            }
            return i;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private final synchronized void j(Context context) {
        String str;
        if (this.j) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            Bundle bundle = C16880lQ.LLLLLLLLL(packageManager, packageName, 128).metaData;
            if (bundle.containsKey("com.google.ar.core")) {
                String string = bundle.getString("com.google.ar.core");
                string.getClass();
                this.k = string.equals("required");
                if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                    this.l = bundle.getInt("com.google.ar.core.min_apk_version");
                    try {
                        ActivityInfo[] activityInfoArr = C16880lQ.LLLLLLZ(packageManager, packageName, 1).activities;
                        String LJLLILLLL = C16880lQ.LJLLILLLL(InstallActivity.class);
                        for (ActivityInfo activityInfo : activityInfoArr) {
                            if (LJLLILLLL.equals(activityInfo.name)) {
                                this.j = true;
                                return;
                            }
                        }
                        String valueOf = String.valueOf(LJLLILLLL);
                        if (valueOf.length() != 0) {
                            str = "Application manifest must contain activity ".concat(valueOf);
                        } else {
                            str = new String("Application manifest must contain activity ");
                        }
                        throw new FatalException(str);
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new FatalException("Could not load application package info", e);
                    }
                }
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
            }
            throw new FatalException("Application manifest must contain meta-data com.google.ar.core");
        } catch (PackageManager.NameNotFoundException e2) {
            throw new FatalException("Could not load application package metadata", e2);
        }
    }

    public static final ArCoreApk.InstallStatus k(Activity activity) {
        PendingIntent LIZ = C93532aSO.LIZ(activity);
        if (LIZ != null) {
            try {
                activity.startIntentSender(LIZ.getIntentSender(), null, 0, 0, 0);
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            } catch (IntentSender.SendIntentException | RuntimeException unused) {
            }
        }
        return ArCoreApk.InstallStatus.INSTALLED;
    }

    public final synchronized v b(Context context) {
        if (this.i == null) {
            v vVar = new v(null);
            vVar.a(C16880lQ.LLLLL(context));
            this.i = vVar;
        }
        return this.i;
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.Availability checkAvailability(Context context) {
        ArCoreApk.Availability availability;
        if (!h()) {
            return ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
        }
        try {
            if (d(context)) {
                c();
                try {
                    if (C93532aSO.LIZ(context) != null) {
                        availability = ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD;
                    } else {
                        availability = ArCoreApk.Availability.SUPPORTED_INSTALLED;
                    }
                    return availability;
                } catch (UnavailableDeviceNotCompatibleException unused) {
                    return ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
                } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
                    return ArCoreApk.Availability.UNKNOWN_ERROR;
                }
            }
            synchronized (this) {
                ArCoreApk.Availability availability2 = this.g;
                if ((availability2 == null || availability2.isUnknown()) && !this.h) {
                    this.h = true;
                    C94119abr c94119abr = new C94119abr(this);
                    if (d(context)) {
                        c94119abr.LIZ(ArCoreApk.Availability.SUPPORTED_INSTALLED);
                    } else if (i(context) != -1) {
                        c94119abr.LIZ(ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD);
                    } else if (g(context)) {
                        c94119abr.LIZ(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
                    } else {
                        b(context).c(context, c94119abr);
                    }
                }
                ArCoreApk.Availability availability3 = this.g;
                if (availability3 != null) {
                    return availability3;
                }
                if (this.h) {
                    return ArCoreApk.Availability.UNKNOWN_CHECKING;
                }
                return ArCoreApk.Availability.UNKNOWN_ERROR;
            }
        } catch (FatalException unused3) {
            return ArCoreApk.Availability.UNKNOWN_ERROR;
        }
    }

    public final boolean d(Context context) {
        j(context);
        if (i(context) == 0 || i(context) >= this.l) {
            return true;
        }
        return false;
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z) {
        ArCoreApk.InstallBehavior installBehavior;
        ArCoreApk.UserMessageType userMessageType;
        if (g(activity)) {
            installBehavior = ArCoreApk.InstallBehavior.REQUIRED;
        } else {
            installBehavior = ArCoreApk.InstallBehavior.OPTIONAL;
        }
        if (g(activity)) {
            userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        } else {
            userMessageType = ArCoreApk.UserMessageType.USER_ALREADY_INFORMED;
        }
        return requestInstall(activity, z, installBehavior, userMessageType);
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) {
        if (h()) {
            if (d(activity)) {
                c();
                return k(activity);
            }
            if (this.d) {
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            }
            Exception exc = this.a;
            if (exc != null) {
                if (z) {
                    this.a = null;
                } else {
                    if (!(exc instanceof UnavailableDeviceNotCompatibleException)) {
                        if (!(exc instanceof UnavailableUserDeclinedInstallationException)) {
                            if (exc instanceof RuntimeException) {
                                throw exc;
                            }
                            throw new RuntimeException("Unexpected exception type", exc);
                        }
                        throw exc;
                    }
                    throw exc;
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f > 5000) {
                this.e = 0;
            }
            int i = this.e + 1;
            this.e = i;
            this.f = uptimeMillis;
            if (i <= 2) {
                try {
                    C16880lQ.LIZIZ(activity, new Intent(activity, (Class<?>) InstallActivity.class).putExtra("message", userMessageType).putExtra("behavior", installBehavior));
                    this.d = true;
                    return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
                } catch (ActivityNotFoundException e) {
                    throw new FatalException("Failed to launch InstallActivity", e);
                }
            }
            throw new FatalException("Requesting ARCore installation too rapidly.");
        }
        throw new UnavailableDeviceNotCompatibleException();
    }
}
