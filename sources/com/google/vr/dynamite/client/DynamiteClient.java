package com.google.vr.dynamite.client;

import X.C94015aaB;
import X.C94016aaC;
import X.C94017aaD;
import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import dalvik.system.DexClassLoader;

/* loaded from: classes34.dex */
public final class DynamiteClient {
    public static final ArrayMap<C94017aaD, C94016aaC> LIZ = new ArrayMap<>();

    public static synchronized C94016aaC getRemoteLibraryLoaderFromInfo(C94017aaD c94017aaD) {
        synchronized (DynamiteClient.class) {
            ArrayMap<C94017aaD, C94016aaC> arrayMap = LIZ;
            C94016aaC c94016aaC = arrayMap.get(c94017aaD);
            if (c94016aaC == null) {
                C94016aaC c94016aaC2 = new C94016aaC(c94017aaD);
                arrayMap.put(c94017aaD, c94016aaC2);
                return c94016aaC2;
            }
            return c94016aaC;
        }
    }

    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, null);
            if (remoteContext == null) {
                return null;
            }
            try {
                return new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                return null;
            }
            return remoteContext.getClassLoader();
        }
    }

    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context LIZIZ;
        synchronized (DynamiteClient.class) {
            C94017aaD c94017aaD = new C94017aaD(str, str2);
            try {
                LIZIZ = getRemoteLibraryLoaderFromInfo(c94017aaD).LIZIZ(context);
            } catch (C94015aaB unused) {
                new StringBuilder(String.valueOf(c94017aaD).length() + 52);
                return null;
            }
        }
        return LIZIZ;
    }

    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            C94017aaD c94017aaD = new C94017aaD(str, str2);
            C94016aaC remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(c94017aaD);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.LIZ(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.LIZIZ(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    new StringBuilder(String.valueOf(c94017aaD).length() + 72);
                    return 0L;
                }
                return newNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
            } catch (C94015aaB | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError unused) {
                new StringBuilder(String.valueOf(c94017aaD).length() + 54);
                return 0L;
            }
        }
    }

    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        synchronized (DynamiteClient.class) {
            C94017aaD c94017aaD = new C94017aaD(str, str2);
            C94016aaC remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(c94017aaD);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.LIZ(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.LIZIZ(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    new StringBuilder(String.valueOf(c94017aaD).length() + 72);
                    return -1;
                }
                return newNativeLibraryLoader.checkVersion(str3);
            } catch (C94015aaB | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError unused) {
                new StringBuilder(String.valueOf(c94017aaD).length() + 54);
                return -1;
            }
        }
    }
}
