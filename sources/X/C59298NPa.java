package X;

import android.content.SharedPreferences;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import kotlin.jvm.internal.o;

/* renamed from: X.NPa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59298NPa<T> implements InterfaceC64592gB {
    public static final C59298NPa<T> LJLIL = new C59298NPa<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        SharedPreferences sharedPreferences;
        Boolean it = (Boolean) obj;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            NPQ LIZIZ = NPQ.LIZIZ();
            FFL.LJIIIZ().getClass();
            boolean LJ = FFL.LJ(31744, "awesome_splash_preload_json_enabled", true, false);
            LIZIZ.getClass();
            TopViewJsonManager topViewJsonManager = NPQ.LIZIZ;
            if (topViewJsonManager != null && (sharedPreferences = topViewJsonManager.LIZJ) != null) {
                sharedPreferences.edit().putBoolean("awesome_splash_preload_json", LJ).apply();
            }
            C55511LqV.LJIIL = 0L;
            return;
        }
        C55511LqV.LJIIL = System.currentTimeMillis();
    }
}
