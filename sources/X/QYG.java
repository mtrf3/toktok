package X;

import com.google.android.gms.cloudmessaging.zzd;

/* loaded from: classes12.dex */
public final class QYG extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) {
        if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
            android.util.Log.isLoggable("CloudMessengerCompat", 3);
            return zzd.class;
        }
        return super.loadClass(str, z);
    }
}
