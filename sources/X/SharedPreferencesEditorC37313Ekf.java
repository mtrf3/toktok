package X;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.apm.core.SpPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ekf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class SharedPreferencesEditorC37313Ekf implements SharedPreferences.Editor {
    public boolean LIZ;
    public final HashMap<String, Object> LIZIZ = new HashMap<>();
    public final /* synthetic */ SharedPreferencesC37314Ekg LIZJ;

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        if (!this.LIZ && this.LIZIZ.isEmpty()) {
            return;
        }
        Bundle bundle = new Bundle();
        if (this.LIZ) {
            bundle.putBoolean("clear", true);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.LIZIZ.size());
        for (Map.Entry<String, Object> entry : this.LIZIZ.entrySet()) {
            arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
        }
        bundle.putParcelableArrayList("edit", arrayList);
        try {
            ContentResolver contentResolver = this.LIZJ.LIZ.getContentResolver();
            SharedPreferencesC37314Ekg sharedPreferencesC37314Ekg = this.LIZJ;
            contentResolver.call(sharedPreferencesC37314Ekg.LIZJ, sharedPreferencesC37314Ekg.LIZIZ, "edit", bundle);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.LIZIZ.clear();
        this.LIZ = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        apply();
        return true;
    }

    public SharedPreferencesEditorC37313Ekf(SharedPreferencesC37314Ekg sharedPreferencesC37314Ekg) {
        this.LIZJ = sharedPreferencesC37314Ekg;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.LIZIZ.put(str, null);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        this.LIZIZ.put(str, Boolean.valueOf(z));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        this.LIZIZ.put(str, Float.valueOf(f));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        this.LIZIZ.put(str, Integer.valueOf(i));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        this.LIZIZ.put(str, Long.valueOf(j));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        this.LIZIZ.put(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, java.util.Set<String> set) {
        this.LIZIZ.put(str, C17N.LJJJZ(set));
        return this;
    }
}
