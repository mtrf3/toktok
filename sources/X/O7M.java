package X;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O7M implements O6W {
    public final SharedPreferences LIZ;
    public final SharedPreferences.Editor LIZIZ;

    public final void LIZ() {
        this.LIZIZ.apply();
    }

    public final void LIZIZ() {
        this.LIZIZ.commit();
    }

    public O7M(Context context) {
        o.LJIIJ(context, "context");
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "splash_ad_sp");
        o.LJFF(LIZIZ, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        this.LIZ = LIZIZ;
        SharedPreferences.Editor edit = LIZIZ.edit();
        o.LJFF(edit, "mSharedPref.edit()");
        this.LIZIZ = edit;
        O8O.LIZLLL().LJIIIIZZ("service_splash_kv_type", 0, new JSONObject(), new JSONObject());
    }

    public final String LIZJ(String str) {
        return this.LIZ.getString(str, "");
    }

    public final O6W LIZLLL(long j, String str) {
        this.LIZIZ.putLong(str, j);
        return this;
    }
}
