package androidx.core.app;

import X.C06I;
import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import defpackage.i0;

/* loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {
    public static <T> T LIZ(T t) {
        T t2;
        if ((t instanceof C06I) && (t2 = (T) ((C06I) t).LIZ()) != null) {
            return t2;
        }
        return t;
    }

    @Override // android.app.AppComponentFactory
    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) LIZ(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) LIZ(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) LIZ(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) LIZ(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        try {
            return (Service) LIZ(super.instantiateService(classLoader, str, intent));
        } catch (Throwable th) {
            if (th instanceof ClassNotFoundException) {
                throw new RuntimeException(i0.LJFF("GP Service Crash:", str));
            }
            throw th;
        }
    }
}
