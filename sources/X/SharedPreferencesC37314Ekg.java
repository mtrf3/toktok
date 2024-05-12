package X;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Process;
import com.bytedance.apm.core.SpPair;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Ekg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class SharedPreferencesC37314Ekg implements SharedPreferences {
    public static int LIZLLL = -1;
    public final Application LIZ;
    public final String LIZIZ;
    public final android.net.Uri LIZJ;

    @Override // android.content.SharedPreferences
    public final java.util.Map<String, ?> getAll() {
        ArrayList LIZ = LIZ(null, null);
        if (LIZ == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = LIZ.iterator();
        while (it.hasNext()) {
            SpPair spPair = (SpPair) it.next();
            hashMap.put(spPair.mKey, spPair.mValue);
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC37313Ekf(this);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        String str2;
        Bundle bundle = null;
        try {
            ContentResolver contentResolver = this.LIZ.getContentResolver();
            android.net.Uri uri = this.LIZJ;
            if (str != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LIZIZ);
                LIZ.append("/");
                LIZ.append(str);
                str2 = X1D.LIZIZ(LIZ);
            } else {
                str2 = this.LIZIZ;
            }
            bundle = contentResolver.call(uri, str2, "contains", (Bundle) null);
        } catch (Exception unused) {
        }
        if (bundle != null && bundle.getBoolean("contains")) {
            return true;
        }
        return false;
    }

    public SharedPreferencesC37314Ekg(String str, Application application) {
        this.LIZ = application;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("content://");
        LIZ.append(application.getPackageName());
        LIZ.append(".apm");
        LIZ.append("/sp/");
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        this.LIZIZ = LIZIZ;
        this.LIZJ = UriProtector.parse(LIZIZ);
    }

    public static SharedPreferences LIZIZ(Context context, String str) {
        boolean z;
        Application application;
        int i = -1;
        if (LIZLLL == -1) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("content://");
                LIZ.append(context.getPackageName());
                LIZ.append(".apm");
                Bundle call = contentResolver.call(UriProtector.parse(X1D.LIZIZ(LIZ)), "getPid", (String) null, (Bundle) null);
                if (call != null) {
                    i = call.getInt("Pid", -1);
                }
            } catch (Exception unused) {
            }
            LIZLLL = i;
        }
        if (LIZLLL == Process.myPid()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return F9J.LIZIZ(context, 0, str);
        }
        if (context instanceof Application) {
            application = (Application) context;
        } else {
            application = (Application) C16880lQ.LLLLL(context);
        }
        return new SharedPreferencesC37314Ekg(str, application);
    }

    public final ArrayList LIZ(Object obj, String str) {
        Bundle bundle;
        String str2;
        Bundle bundle2 = new Bundle();
        if (obj != null) {
            bundle2.putParcelable("sp", new SpPair(str, obj));
        }
        try {
            ContentResolver contentResolver = this.LIZ.getContentResolver();
            android.net.Uri uri = this.LIZJ;
            if (str != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LIZIZ);
                LIZ.append("/");
                LIZ.append(str);
                str2 = X1D.LIZIZ(LIZ);
            } else {
                str2 = this.LIZIZ;
            }
            if (obj == null) {
                bundle2 = null;
            }
            bundle = contentResolver.call(uri, str2, "query", bundle2);
        } catch (Exception unused) {
            bundle = null;
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(SharedPreferencesC37314Ekg.class.getClassLoader());
        return bundle.getParcelableArrayList("sp");
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        ArrayList LIZ = LIZ(String.valueOf(z), str);
        if (LIZ == null) {
            return z;
        }
        Object obj = ((SpPair) ListProtector.get(LIZ, 0)).mValue;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj).booleanValue();
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        ArrayList LIZ = LIZ(String.valueOf(f), str);
        if (LIZ == null) {
            return f;
        }
        Object obj = ((SpPair) ListProtector.get(LIZ, 0)).mValue;
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof String) {
            return CastFloatProtector.valueOf((String) obj).floatValue();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        ArrayList LIZ = LIZ(String.valueOf(i), str);
        if (LIZ == null) {
            return i;
        }
        Object obj = ((SpPair) ListProtector.get(LIZ, 0)).mValue;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.decode((String) obj).intValue();
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        ArrayList LIZ = LIZ(String.valueOf(j), str);
        if (LIZ == null) {
            return j;
        }
        Object obj = ((SpPair) ListProtector.get(LIZ, 0)).mValue;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.decode((String) obj).longValue();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        ArrayList LIZ = LIZ(str2, str);
        if (LIZ == null) {
            return null;
        }
        return (String) ((SpPair) ListProtector.get(LIZ, 0)).mValue;
    }

    @Override // android.content.SharedPreferences
    public final java.util.Set<String> getStringSet(String str, java.util.Set<String> set) {
        ArrayList LIZ = LIZ(set, str);
        if (LIZ == null || ((SpPair) ListProtector.get(LIZ, 0)).mValue == null) {
            return null;
        }
        String[] strArr = (String[]) ((SpPair) ListProtector.get(LIZ, 0)).mValue;
        HashSet hashSet = new HashSet(strArr.length);
        hashSet.addAll(Arrays.asList(strArr));
        return hashSet;
    }
}
