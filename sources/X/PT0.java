package X;

import Y.ARunnableS1S3100000_11;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class PT0 implements SharedPreferences.Editor {
    public final Context LIZ;
    public final java.util.Map<String, String> LIZIZ = new ConcurrentHashMap();
    public final SharedPreferences.Editor LIZJ;
    public final /* synthetic */ PT1 LIZLLL;

    public final void LIZ() {
        for (Map.Entry entry : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
            new ARunnableS1S3100000_11(this.LIZ, this.LIZLLL.LIZLLL, (String) entry.getKey(), (String) entry.getValue(), 0).run();
        }
        ((ConcurrentHashMap) this.LIZIZ).clear();
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.LIZJ.apply();
        LIZ();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        throw new UnsupportedOperationException("clear not support");
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        boolean commit = this.LIZJ.commit();
        LIZ();
        return commit;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.LIZJ.remove(str);
        ((ConcurrentHashMap) this.LIZIZ).remove(str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        this.LIZJ.putBoolean(str, z);
        if (z == this.LIZLLL.getBoolean(str, false)) {
            ((ConcurrentHashMap) this.LIZIZ).remove(str);
        } else {
            ((ConcurrentHashMap) this.LIZIZ).put(str, "boolean");
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        this.LIZJ.putFloat(str, f);
        if (f == this.LIZLLL.getFloat(str, 0.0f)) {
            ((ConcurrentHashMap) this.LIZIZ).remove(str);
        } else {
            ((ConcurrentHashMap) this.LIZIZ).put(str, "float");
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        this.LIZJ.putInt(str, i);
        if (i == this.LIZLLL.getInt(str, 0)) {
            ((ConcurrentHashMap) this.LIZIZ).remove(str);
        } else {
            ((ConcurrentHashMap) this.LIZIZ).put(str, "integer");
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        this.LIZJ.putLong(str, j);
        if (j == this.LIZLLL.getLong(str)) {
            ((ConcurrentHashMap) this.LIZIZ).remove(str);
        } else {
            ((ConcurrentHashMap) this.LIZIZ).put(str, "long");
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        this.LIZJ.putString(str, str2);
        if (TextUtils.equals(this.LIZLLL.getString(str, null), str2)) {
            ((ConcurrentHashMap) this.LIZIZ).remove(str);
        } else {
            ((ConcurrentHashMap) this.LIZIZ).put(str, "string");
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, java.util.Set<String> set) {
        throw new UnsupportedOperationException("not support putStringSet");
    }

    public PT0(PT1 pt1, Context context, SharedPreferences.Editor editor) {
        this.LIZLLL = pt1;
        this.LIZ = context;
        this.LIZJ = editor;
    }
}
