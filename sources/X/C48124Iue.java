package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: X.Iue, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48124Iue {
    public static WeakReference<C48124Iue> LIZLLL;
    public final SharedPreferences LIZ;
    public C48123Iud LIZIZ;
    public final Executor LIZJ;

    public final synchronized ETB LIZ() {
        ETB etb;
        String LIZIZ = this.LIZIZ.LIZIZ();
        if (!TextUtils.isEmpty(LIZIZ)) {
            String[] split = LIZIZ.split("!", -1);
            if (split.length == 2) {
                etb = new ETB(split[0], split[1]);
            }
        }
        etb = null;
        return etb;
    }

    public final synchronized void LIZIZ() {
        this.LIZIZ = C48123Iud.LIZ(this.LIZ, this.LIZJ);
    }

    public final synchronized void LIZJ(ETB etb) {
        this.LIZIZ.LIZJ(etb.LIZJ);
    }

    public C48124Iue(SharedPreferences sharedPreferences, Executor executor) {
        this.LIZJ = executor;
        this.LIZ = sharedPreferences;
    }
}
