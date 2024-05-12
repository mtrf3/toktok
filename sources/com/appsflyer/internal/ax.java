package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class ax<T> {
    public final Context AFInAppEventType;
    public final String[] AFKeystoreWrapper;
    public final FutureTask<T> valueOf = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.ax.4
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (ax.this.AFInAppEventParameterName()) {
                return (T) ax.this.values();
            }
            return null;
        }
    });
    public final String values;

    public final boolean AFInAppEventParameterName() {
        try {
            ProviderInfo resolveContentProvider = this.AFInAppEventType.getPackageManager().resolveContentProvider(this.values, 128);
            if (resolveContentProvider != null) {
                return Arrays.asList(this.AFKeystoreWrapper).contains(ac.values(this.AFInAppEventType.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName));
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return false;
        }
    }

    public abstract T values();

    public T valueOf() {
        try {
            return this.valueOf.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return null;
        }
    }

    public ax(Context context, String str, String... strArr) {
        this.AFInAppEventType = context;
        this.values = str;
        this.AFKeystoreWrapper = strArr;
    }
}
