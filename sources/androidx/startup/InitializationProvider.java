package androidx.startup;

import X.C270814m;
import X.C271014o;
import X.InterfaceC270914n;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class InitializationProvider extends ContentProvider {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (C270814m.LIZLLL == null) {
                synchronized (C270814m.LJ) {
                    if (C270814m.LIZLLL == null) {
                        C270814m.LIZLLL = new C270814m(context);
                    }
                }
            }
            C270814m c270814m = C270814m.LIZLLL;
            c270814m.getClass();
            try {
                try {
                    Trace.beginSection("Startup");
                    Bundle bundle = c270814m.LIZJ.getPackageManager().getProviderInfo(new ComponentName(c270814m.LIZJ.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                    String string = c270814m.LIZJ.getString(R.string.bqw);
                    if (bundle != null) {
                        HashSet hashSet = new HashSet();
                        for (String str : bundle.keySet()) {
                            if (string.equals(bundle.getString(str, null))) {
                                Class<?> cls = Class.forName(str);
                                if (InterfaceC270914n.class.isAssignableFrom(cls)) {
                                    ((HashSet) c270814m.LIZIZ).add(cls);
                                    c270814m.LIZ(cls, hashSet);
                                }
                            }
                        }
                    }
                    Trace.endSection();
                    return true;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
                throw new C271014o(e);
            }
        }
        throw new C271014o("Context cannot be null");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }
}
