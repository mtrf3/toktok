package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import p83.a;

/* renamed from: X.Qak, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67274Qak extends AbstractC68049QnF {
    public static final Pair LJIL = new Pair("", 0L);
    public SharedPreferences LIZJ;
    public C67279Qap LIZLLL;
    public final C67194QYs LJ;
    public final C67192QYq LJFF;
    public String LJI;
    public boolean LJII;
    public long LJIIIIZZ;
    public final C67194QYs LJIIIZ;
    public final C67186QYk LJIIJ;
    public final C67192QYq LJIIJJI;
    public final C67186QYk LJIIL;
    public final C67194QYs LJIILIIL;
    public boolean LJIILJJIL;
    public final C67186QYk LJIILL;
    public final C67186QYk LJIILLIIL;
    public final C67194QYs LJIIZILJ;
    public final C67192QYq LJIJ;
    public final C67192QYq LJIJI;
    public final C67194QYs LJIJJ;
    public final PDJ LJIJJLI;

    @Override // X.AbstractC68049QnF
    public final boolean LJI() {
        return true;
    }

    public final void LJIIJJI() {
        SharedPreferences LIZIZ = F9J.LIZIZ(this.LIZ.LIZ, 0, "com.google.android.gms.measurement.prefs");
        this.LIZJ = LIZIZ;
        boolean z = LIZIZ.getBoolean("has_been_opened", false);
        this.LJIILJJIL = z;
        if (!z) {
            SharedPreferences.Editor edit = this.LIZJ.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.LIZLLL = new C67279Qap(this, Math.max(0L, ((Long) C68555QvP.LIZLLL.LIZ(null)).longValue()));
    }

    public final SharedPreferences LJIIJ() {
        LJFF();
        LJII();
        QH7.LJIIIIZZ(this.LIZJ);
        return this.LIZJ;
    }

    public final C68090Qnu LJIIL() {
        LJFF();
        return C68090Qnu.LIZIZ(LJIIJ().getString("consent_settings", "G1"));
    }

    public final Boolean LJIILIIL() {
        LJFF();
        if (LJIIJ().contains("measurement_enabled")) {
            return Boolean.valueOf(LJIIJ().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public C67274Qak(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
        this.LJIIIZ = new C67194QYs(this, "session_timeout", 1800000L);
        this.LJIIJ = new C67186QYk(this, "start_new_session", true);
        this.LJIILIIL = new C67194QYs(this, "last_pause_time", 0L);
        this.LJIIJJI = new C67192QYq(this, "non_personalized_ads");
        this.LJIIL = new C67186QYk(this, "allow_remote_dynamite", false);
        this.LJ = new C67194QYs(this, "first_open_time", 0L);
        new C67194QYs(this, "app_install_time", 0L);
        this.LJFF = new C67192QYq(this, "app_instance_id");
        this.LJIILL = new C67186QYk(this, "app_backgrounded", false);
        this.LJIILLIIL = new C67186QYk(this, "deep_link_retrieval_complete", false);
        this.LJIIZILJ = new C67194QYs(this, "deep_link_retrieval_attempts", 0L);
        this.LJIJ = new C67192QYq(this, "firebase_feature_rollouts");
        this.LJIJI = new C67192QYq(this, "deferred_attribution_cache");
        this.LJIJJ = new C67194QYs(this, "deferred_attribution_cache_timestamp", 0L);
        this.LJIJJLI = new PDJ(this);
    }

    public static a.C0043a LJIIIZ(Context context) {
        if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(103000)) {
            return new a.C0043a("00000000-0000-0000-0000-000000000000", true);
        }
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {context};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", "-8261907262454631777");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", a.class, objArr, "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", null, objArr, a.class, c65300Pk0, false);
            return (a.C0043a) LIZJ.LIZIZ;
        }
        a.C0043a LIZIZ = a.LIZIZ(context);
        c03880Dg.LIZIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", LIZIZ, objArr, a.class, c65300Pk0, true);
        return LIZIZ;
    }

    public final void LJIILJJIL(Boolean bool) {
        LJFF();
        SharedPreferences.Editor edit = LJIIJ().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void LJIILL(boolean z) {
        LJFF();
        this.LIZ.LIZJ().LJIILIIL.LIZIZ(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = LJIIJ().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final boolean LJIILLIIL(long j) {
        if (j - this.LJIIIZ.LIZ() > this.LJIILIIL.LIZ()) {
            return true;
        }
        return false;
    }

    public final boolean LJIIZILJ(int i) {
        if (i <= LJIIJ().getInt("consent_source", 100)) {
            return true;
        }
        return false;
    }
}
