package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Ecg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36818Ecg implements InterfaceC84387X9z {
    public final SharedPreferences LIZ;

    @Override // X.InterfaceC84387X9z
    public final void clear() {
        SharedPreferences.Editor edit = this.LIZ.edit();
        if (edit != null) {
            Iterator<String> it = this.LIZ.getAll().keySet().iterator();
            while (it.hasNext()) {
                edit.remove(it.next());
            }
            edit.apply();
        }
    }

    public C36818Ecg(Context context, String name) {
        o.LJIIJ(context, "context");
        o.LJIIJ(name, "name");
        SharedPreferences LIZIZ = F9J.LIZIZ(C16880lQ.LLLLL(context), 0, name);
        o.LJFF(LIZIZ, "appContext.getSharedPref…ences(name, MODE_PRIVATE)");
        this.LIZ = LIZIZ;
    }

    @Override // X.InterfaceC84387X9z
    public final String getString(String key, String defaultValue) {
        o.LJIIJ(key, "key");
        o.LJIIJ(defaultValue, "defaultValue");
        String string = this.LIZ.getString(key, defaultValue);
        if (string != null) {
            return string;
        }
        return defaultValue;
    }

    @Override // X.InterfaceC84387X9z
    public final void putString(String key, String value) {
        SharedPreferences.Editor putString;
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        SharedPreferences.Editor edit = this.LIZ.edit();
        if (edit != null && (putString = edit.putString(key, value)) != null) {
            putString.apply();
        }
    }
}
