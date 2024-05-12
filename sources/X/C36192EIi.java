package X;

import android.content.SharedPreferences;
import kotlin.jvm.internal.o;

/* renamed from: X.EIi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36192EIi extends C36821Ecj<String> {
    public C36192EIi() {
        super("ab_common_meta_version", "");
    }

    @Override // X.C36821Ecj
    public final SharedPreferences LIZIZ() {
        SharedPreferences settingsApiPreferences = C36191EIh.LIZ;
        o.LJIIIIZZ(settingsApiPreferences, "settingsApiPreferences");
        return settingsApiPreferences;
    }
}
