package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import p83.a;

/* renamed from: X.Qal, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67275Qal extends AbstractC68187QpT {
    public final java.util.Map LIZLLL;
    public String LJ;
    public boolean LJFF;
    public long LJI;
    public final C67194QYs LJII;
    public final C67194QYs LJIIIIZZ;
    public final C67194QYs LJIIIZ;
    public final C67194QYs LJIIJ;
    public final C67194QYs LJIIJJI;

    @Override // X.AbstractC68187QpT
    public final void LJIIIIZZ() {
    }

    public C67275Qal(C68241QqL c68241QqL) {
        super(c68241QqL);
        this.LIZLLL = new HashMap();
        C67274Qak LJIILLIIL = this.LIZ.LJIILLIIL();
        LJIILLIIL.getClass();
        this.LJII = new C67194QYs(LJIILLIIL, "last_delete_stale", 0L);
        C67274Qak LJIILLIIL2 = this.LIZ.LJIILLIIL();
        LJIILLIIL2.getClass();
        this.LJIIIIZZ = new C67194QYs(LJIILLIIL2, "backoff", 0L);
        C67274Qak LJIILLIIL3 = this.LIZ.LJIILLIIL();
        LJIILLIIL3.getClass();
        this.LJIIIZ = new C67194QYs(LJIILLIIL3, "last_upload", 0L);
        C67274Qak LJIILLIIL4 = this.LIZ.LJIILLIIL();
        LJIILLIIL4.getClass();
        this.LJIIJ = new C67194QYs(LJIILLIIL4, "last_upload_attempt", 0L);
        C67274Qak LJIILLIIL5 = this.LIZ.LJIILLIIL();
        LJIILLIIL5.getClass();
        this.LJIIJJI = new C67194QYs(LJIILLIIL5, "midnight_offset", 0L);
    }

    public static a.C0043a LJIIIZ(Context context) {
        if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(103000)) {
            return new a.C0043a("00000000-0000-0000-0000-000000000000", true);
        }
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {context};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", "-8261907262454631631");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", a.class, objArr, "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", null, objArr, a.class, c65300Pk0, false);
            return (a.C0043a) LIZJ.LIZIZ;
        }
        a.C0043a LIZIZ = a.LIZIZ(context);
        c03880Dg.LIZIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", LIZIZ, objArr, a.class, c65300Pk0, true);
        return LIZIZ;
    }

    public final Pair LJIIJ(String str) {
        a.C0043a LJIIIZ;
        C67276Qam c67276Qam;
        a.C0043a LJIIIZ2;
        LJFF();
        this.LIZ.LJIILIIL.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C68575Qvj.LIZIZ();
        if (this.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJJLIIJ)) {
            C67276Qam c67276Qam2 = (C67276Qam) ((HashMap) this.LIZLLL).get(str);
            if (c67276Qam2 == null || elapsedRealtime >= c67276Qam2.LIZJ) {
                long LJIIJJI = this.LIZ.LJI.LJIIJJI(str, C68555QvP.LIZJ) + elapsedRealtime;
                try {
                    LJIIIZ2 = LJIIIZ(this.LIZ.LIZ);
                } catch (Exception e) {
                    this.LIZ.LIZJ().LJIIL.LIZIZ(e, "Unable to get advertising id");
                    c67276Qam = new C67276Qam("", false, LJIIJJI);
                }
                if (LJIIIZ2 == null) {
                    return new Pair("", Boolean.FALSE);
                }
                String str2 = LJIIIZ2.LIZ;
                if (str2 != null) {
                    c67276Qam = new C67276Qam(str2, LJIIIZ2.LIZIZ, LJIIJJI);
                } else {
                    c67276Qam = new C67276Qam("", LJIIIZ2.LIZIZ, LJIIJJI);
                }
                ((HashMap) this.LIZLLL).put(str, c67276Qam);
                return new Pair(c67276Qam.LIZ, Boolean.valueOf(c67276Qam.LIZIZ));
            }
            return new Pair(c67276Qam2.LIZ, Boolean.valueOf(c67276Qam2.LIZIZ));
        }
        String str3 = this.LJ;
        if (str3 == null || elapsedRealtime >= this.LJI) {
            this.LJI = this.LIZ.LJI.LJIIJJI(str, C68555QvP.LIZJ) + elapsedRealtime;
            try {
                LJIIIZ = LJIIIZ(this.LIZ.LIZ);
            } catch (Exception e2) {
                this.LIZ.LIZJ().LJIIL.LIZIZ(e2, "Unable to get advertising id");
                this.LJ = "";
            }
            if (LJIIIZ == null) {
                return new Pair("", Boolean.FALSE);
            }
            this.LJ = "";
            String str4 = LJIIIZ.LIZ;
            if (str4 != null) {
                this.LJ = str4;
            }
            this.LJFF = LJIIIZ.LIZIZ;
            return new Pair(this.LJ, Boolean.valueOf(this.LJFF));
        }
        return new Pair(str3, Boolean.valueOf(this.LJFF));
    }

    public final String LJIIL(String str) {
        LJFF();
        String str2 = (String) LJIIJ(str).first;
        MessageDigest LJIILIIL = C68083Qnn.LJIILIIL();
        if (LJIILIIL == null) {
            return null;
        }
        return C16880lQ.LLLZI(Locale.US, "%032X", new Object[]{new BigInteger(1, LJIILIIL.digest(str2.getBytes()))});
    }

    public final Pair LJIIJJI(String str, C68090Qnu c68090Qnu) {
        if (c68090Qnu.LJFF(EnumC68125QoT.AD_STORAGE)) {
            return LJIIJ(str);
        }
        return new Pair("", Boolean.FALSE);
    }
}
