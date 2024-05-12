package com.bytedance.ugc.glue;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class UGCSharePrefs {
    public final String name;
    public SharedPreferences prefs;

    public static UGCSharePrefs get() {
        return new UGCSharePrefs("ugc_share_prefs");
    }

    private boolean init() {
        if (this.prefs == null) {
            return false;
        }
        return true;
    }

    public Set<? extends Map.Entry<String, ?>> getAll() {
        if (init()) {
            return this.prefs.getAll().entrySet();
        }
        return null;
    }

    public UGCSharePrefs(String str) {
        this.name = str;
    }

    public static UGCSharePrefs get(String str) {
        return new UGCSharePrefs(str);
    }

    public boolean contains(String str) {
        if (init() && this.prefs.contains(str)) {
            return true;
        }
        return false;
    }

    public void remove(String str) {
        if (init()) {
            this.prefs.edit().remove(str).apply();
        }
    }

    public boolean getBoolean(String str, boolean z) {
        if (init()) {
            return UGCTools.parseBoolean(this.prefs.getString(str, String.valueOf(z)));
        }
        return z;
    }

    public int getInt(String str, int i) {
        if (init()) {
            return UGCTools.parseInt(this.prefs.getString(str, null), i);
        }
        return i;
    }

    public String getString(String str, String str2) {
        if (init()) {
            return this.prefs.getString(str, str2);
        }
        return str2;
    }

    public <T> void put(String str, T t) {
        if (init()) {
            if (t == null) {
                this.prefs.edit().putString(str, "").apply();
            } else {
                this.prefs.edit().putString(str, String.valueOf(t)).apply();
            }
        }
    }
}
