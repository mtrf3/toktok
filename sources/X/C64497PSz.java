package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.PSz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64497PSz implements InterfaceC66858QLu {
    public final SharedPreferences LIZ;
    public final java.util.Map<PTB, SharedPreferences.OnSharedPreferenceChangeListener> LIZIZ = new ConcurrentHashMap();

    @Override // X.InterfaceC66858QLu
    public final void LIZ(Context context, String str, String str2) {
    }

    @Override // X.InterfaceC66858QLu
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC66858QLu
    public SharedPreferences.Editor edit() {
        return this.LIZ.edit();
    }

    @Override // X.InterfaceC66858QLu
    public final float LIZJ(String str) {
        return getFloat(str, 0.0f);
    }

    @Override // X.InterfaceC66858QLu
    public final boolean contains(String str) {
        return this.LIZ.contains(str);
    }

    @Override // X.InterfaceC66858QLu
    public final boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // X.InterfaceC66858QLu
    public final int getInt(String str) {
        return getInt(str, 0);
    }

    @Override // X.InterfaceC66858QLu
    public final long getLong(String str) {
        return getLong(str, 0L);
    }

    @Override // X.InterfaceC66858QLu
    public final String getString(String str) {
        return getString(str, null);
    }

    public C64497PSz(Context context, String str) {
        this.LIZ = F9J.LIZIZ(context, 0, str);
    }

    @Override // X.InterfaceC66858QLu
    public final boolean getBoolean(String str, boolean z) {
        try {
            return this.LIZ.getBoolean(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    @Override // X.InterfaceC66858QLu
    public final float getFloat(String str, float f) {
        try {
            return this.LIZ.getFloat(str, f);
        } catch (Exception unused) {
            return f;
        }
    }

    @Override // X.InterfaceC66858QLu
    public final int getInt(String str, int i) {
        try {
            return this.LIZ.getInt(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    @Override // X.InterfaceC66858QLu
    public final long getLong(String str, long j) {
        try {
            return this.LIZ.getLong(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    @Override // X.InterfaceC66858QLu
    public final String getString(String str, String str2) {
        try {
            return this.LIZ.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }
}
