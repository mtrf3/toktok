package X;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Qnm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68082Qnm extends AbstractC68050QnG {
    public C68085Qnp LIZJ;
    public C68136Qoe LIZLLL;
    public final java.util.Set LJ;
    public boolean LJFF;
    public final AtomicReference LJI;
    public final Object LJII;
    public C68090Qnu LJIIIIZZ;
    public int LJIIIZ;
    public final AtomicLong LJIIJ;
    public long LJIIJJI;
    public int LJIIL;
    public final C67191QYp LJIILIIL;
    public boolean LJIILJJIL;
    public final OJ3 LJIILL;

    @Override // X.AbstractC68050QnG
    public final boolean LJIIIIZZ() {
        return false;
    }

    public final void LJJI() {
        long j;
        LJFF();
        String LIZ = this.LIZ.LJIILLIIL().LJIIJJI.LIZ();
        int i = 1;
        if (LIZ != null) {
            if ("unset".equals(LIZ)) {
                this.LIZ.LJIILIIL.getClass();
                LJIJJLI(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                if (true != "true".equals(LIZ)) {
                    j = 0;
                } else {
                    j = 1;
                }
                Long valueOf = Long.valueOf(j);
                this.LIZ.LJIILIIL.getClass();
                LJIJJLI(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (this.LIZ.LJII() && this.LJIILJJIL) {
            this.LIZ.LIZJ().LJIIL.LIZ("Recording app launch after enabling measurement for the first time (FE)");
            LJJIIJ();
            ((InterfaceC68142Qok) C68176QpI.LJLILLLLZI.LJLIL.zza()).zza();
            if (this.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJJL)) {
                this.LIZ.LJIJJLI().LIZLLL.LIZ();
            }
            this.LIZ.LIZIZ().LJIILIIL(new RunnableC67190QYo(i, this));
            return;
        }
        this.LIZ.LIZJ().LJIIL.LIZ("Updating Scion state (FE)");
        C68022Qmo LJIJJ = this.LIZ.LJIJJ();
        LJIJJ.LJFF();
        LJIJJ.LJI();
        LJIJJ.LJIIZILJ(new RunnableC68099Qo3(i, LJIJJ, LJIJJ.LJIILJJIL(true)));
    }

    public final void LJIIJ() {
        if ((C16880lQ.LLLLL(this.LIZ.LIZ) instanceof Application) && this.LIZJ != null) {
            ((Application) C16880lQ.LLLLL(this.LIZ.LIZ)).unregisterActivityLifecycleCallbacks(this.LIZJ);
        }
    }

    public final String LJJIFFI() {
        return (String) this.LJI.get();
    }

    public final void LJJIIJ() {
        LJFF();
        LJI();
        if (this.LIZ.LJIIIIZZ()) {
            int i = 1;
            if (this.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJJJJZ)) {
                C68034Qn0 c68034Qn0 = this.LIZ.LJI;
                c68034Qn0.LIZ.getClass();
                Boolean LJIILIIL = c68034Qn0.LJIILIIL("google_analytics_deferred_deep_link_enabled");
                if (LJIILIIL != null && LJIILIIL.booleanValue()) {
                    this.LIZ.LIZJ().LJIIL.LIZ("Deferred Deep Link feature enabled.");
                    this.LIZ.LIZIZ().LJIILIIL(new RunnableC67185QYj(i, this));
                }
            }
            C68022Qmo LJIJJ = this.LIZ.LJIJJ();
            LJIJJ.LJFF();
            LJIJJ.LJI();
            zzq LJIILJJIL = LJIJJ.LJIILJJIL(true);
            LJIJJ.LIZ.LJIILL().LJIIL(3, new byte[0]);
            LJIJJ.LJIIZILJ(new RunnableC68025Qmr(LJIJJ, LJIILJJIL));
            this.LJIILJJIL = false;
            C67274Qak LJIILLIIL = this.LIZ.LJIILLIIL();
            LJIILLIIL.LJFF();
            String string = LJIILLIIL.LJIIJ().getString("previous_os_version", null);
            LJIILLIIL.LIZ.LJIILIIL().LJII();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = LJIILLIIL.LJIIJ().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.LIZ.LJIILIIL().LJII();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    LJIIL("auto", "_ou", bundle);
                }
            }
        }
    }

    public C68082Qnm(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
        this.LJ = new CopyOnWriteArraySet();
        this.LJII = new Object();
        this.LJIILJJIL = true;
        this.LJIILL = new OJ3(this);
        this.LJI = new AtomicReference();
        this.LJIIIIZZ = new C68090Qnu(null, null);
        this.LJIIIZ = 100;
        this.LJIIJJI = -1L;
        this.LJIIL = 100;
        this.LJIIJ = new AtomicLong(0L);
        this.LJIILIIL = new C67191QYp(c68033Qmz);
    }

    public final void LJIJI(C68090Qnu c68090Qnu) {
        boolean z;
        Boolean bool;
        LJFF();
        if ((c68090Qnu.LJFF(EnumC68125QoT.ANALYTICS_STORAGE) && c68090Qnu.LJFF(EnumC68125QoT.AD_STORAGE)) || this.LIZ.LJIJJ().LJIIL()) {
            z = true;
        } else {
            z = false;
        }
        C68033Qmz c68033Qmz = this.LIZ;
        c68033Qmz.LIZIZ().LJFF();
        if (z != c68033Qmz.LJJIIJZLJL) {
            C68033Qmz c68033Qmz2 = this.LIZ;
            c68033Qmz2.LIZIZ().LJFF();
            c68033Qmz2.LJJIIJZLJL = z;
            C67274Qak LJIILLIIL = this.LIZ.LJIILLIIL();
            LJIILLIIL.LJFF();
            if (LJIILLIIL.LJIIJ().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(LJIILLIIL.LJIIJ().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z || bool == null || bool.booleanValue()) {
                LJJ(Boolean.valueOf(z), false);
            }
        }
    }

    public final void LJIILL(long j, boolean z) {
        LJFF();
        LJI();
        this.LIZ.LIZJ().LJIIL.LIZ("Resetting analytics data (FE)");
        C68110QoE LJIJJLI = this.LIZ.LJIJJLI();
        LJIJJLI.LJFF();
        C68088Qns c68088Qns = LJIJJLI.LJ;
        c68088Qns.LIZJ.LIZ();
        c68088Qns.LIZ = 0L;
        c68088Qns.LIZIZ = 0L;
        C68572Qvg.LIZ();
        if (this.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJLJJI)) {
            this.LIZ.LJIILJJIL().LJIIL();
        }
        boolean LJII = this.LIZ.LJII();
        C67274Qak LJIILLIIL = this.LIZ.LJIILLIIL();
        LJIILLIIL.LJ.LIZIZ(j);
        if (!TextUtils.isEmpty(LJIILLIIL.LIZ.LJIILLIIL().LJIJ.LIZ())) {
            LJIILLIIL.LJIJ.LIZIZ(null);
        }
        C68176QpI c68176QpI = C68176QpI.LJLILLLLZI;
        ((InterfaceC68142Qok) c68176QpI.LJLIL.zza()).zza();
        C68034Qn0 c68034Qn0 = LJIILLIIL.LIZ.LJI;
        C68067QnX c68067QnX = C68555QvP.LJJL;
        if (c68034Qn0.LJIILJJIL(null, c68067QnX)) {
            LJIILLIIL.LJIILIIL.LIZIZ(0L);
        }
        if (!LJIILLIIL.LIZ.LJI.LJIILLIIL()) {
            LJIILLIIL.LJIILL(!LJII);
        }
        LJIILLIIL.LJIJI.LIZIZ(null);
        LJIILLIIL.LJIJJ.LIZIZ(0L);
        LJIILLIIL.LJIJJLI.LIZIZ(null);
        if (z) {
            C68022Qmo LJIJJ = this.LIZ.LJIJJ();
            LJIJJ.LJFF();
            LJIJJ.LJI();
            zzq LJIILJJIL = LJIJJ.LJIILJJIL(false);
            LJIJJ.LIZ.getClass();
            LJIJJ.LIZ.LJIILL().LJIIJ();
            LJIJJ.LJIIZILJ(new RunnableC68045QnB(LJIJJ, LJIILJJIL));
        }
        ((InterfaceC68142Qok) c68176QpI.LJLIL.zza()).zza();
        if (this.LIZ.LJI.LJIILJJIL(null, c68067QnX)) {
            this.LIZ.LJIJJLI().LIZLLL.LIZ();
        }
        this.LJIILJJIL = !LJII;
    }

    public final void LJIILLIIL(long j, Bundle bundle) {
        QH7.LJIIIIZZ(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.LIZ.LIZJ().LJIIIIZZ.LIZ("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C78886Uxe.LJJLJLI(bundle2, "app_id", String.class, null);
        C78886Uxe.LJJLJLI(bundle2, "origin", String.class, null);
        C78886Uxe.LJJLJLI(bundle2, "name", String.class, null);
        C78886Uxe.LJJLJLI(bundle2, "value", Object.class, null);
        C78886Uxe.LJJLJLI(bundle2, "trigger_event_name", String.class, null);
        C78886Uxe.LJJLJLI(bundle2, "trigger_timeout", Long.class, 0L);
        C78886Uxe.LJJLJLI(bundle2, "timed_out_event_name", String.class, null);
        C78886Uxe.LJJLJLI(bundle2, "timed_out_event_params", Bundle.class, null);
        C78886Uxe.LJJLJLI(bundle2, "triggered_event_name", String.class, null);
        C78886Uxe.LJJLJLI(bundle2, "triggered_event_params", Bundle.class, null);
        C78886Uxe.LJJLJLI(bundle2, "time_to_live", Long.class, 0L);
        C78886Uxe.LJJLJLI(bundle2, "expired_event_name", String.class, null);
        C78886Uxe.LJJLJLI(bundle2, "expired_event_params", Bundle.class, null);
        QH7.LJI(bundle2.getString("name"));
        QH7.LJI(bundle2.getString("origin"));
        QH7.LJIIIIZZ(C16880lQ.LLJJIII(bundle2, "value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object LLJJIII = C16880lQ.LLJJIII(bundle2, "value");
        if (this.LIZ.LJIL().LJJL(string) == 0) {
            if (this.LIZ.LJIL().LJJJLIIL(LLJJIII, string) == 0) {
                Object LJIIJ = this.LIZ.LJIL().LJIIJ(LLJJIII, string);
                if (LJIIJ == null) {
                    this.LIZ.LIZJ().LJFF.LIZJ(this.LIZ.LJIIL.LJFF(string), LLJJIII, "Unable to normalize conditional user property value");
                    return;
                }
                C78886Uxe.LJJLL(bundle2, LJIIJ);
                long j2 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    C68033Qmz c68033Qmz = this.LIZ;
                    if (j2 > 15552000000L || j2 < 1) {
                        c68033Qmz.LIZJ().LJFF.LIZJ(this.LIZ.LJIIL.LJFF(string), Long.valueOf(j2), "Invalid conditional user property timeout");
                        return;
                    }
                }
                long j3 = bundle2.getLong("time_to_live");
                C68033Qmz c68033Qmz2 = this.LIZ;
                if (j3 > 15552000000L || j3 < 1) {
                    c68033Qmz2.LIZJ().LJFF.LIZJ(this.LIZ.LJIIL.LJFF(string), Long.valueOf(j3), "Invalid conditional user property time to live");
                    return;
                } else {
                    c68033Qmz2.LIZIZ().LJIILIIL(new RunnableC68023Qmp(0, this, bundle2));
                    return;
                }
            }
            this.LIZ.LIZJ().LJFF.LIZJ(this.LIZ.LJIIL.LJFF(string), LLJJIII, "Invalid conditional user property value");
            return;
        }
        this.LIZ.LIZJ().LJFF.LIZIZ(this.LIZ.LJIIL.LJFF(string), "Invalid conditional user property name");
    }

    public final void LJIL(long j, Bundle bundle) {
        if (TextUtils.isEmpty(this.LIZ.LJIILJJIL().LJIIJJI())) {
            LJIIZILJ(bundle, 0, j);
        } else {
            this.LIZ.LIZJ().LJIIJ.LIZ("Using developer consent only; google app id found");
        }
    }

    public final void LJJ(Boolean bool, boolean z) {
        LJFF();
        LJI();
        this.LIZ.LIZJ().LJIIL.LIZIZ(bool, "Setting app measurement enabled (FE)");
        this.LIZ.LJIILLIIL().LJIILJJIL(bool);
        if (z) {
            C67274Qak LJIILLIIL = this.LIZ.LJIILLIIL();
            LJIILLIIL.LJFF();
            SharedPreferences.Editor edit = LJIILLIIL.LJIIJ().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        C68033Qmz c68033Qmz = this.LIZ;
        c68033Qmz.LIZIZ().LJFF();
        if (c68033Qmz.LJJIIJZLJL || (bool != null && !bool.booleanValue())) {
            LJJI();
        }
    }

    public static /* bridge */ /* synthetic */ void LJJII(C68082Qnm c68082Qnm, C68090Qnu c68090Qnu, C68090Qnu c68090Qnu2) {
        boolean z;
        EnumC68125QoT[] enumC68125QoTArr = {EnumC68125QoT.ANALYTICS_STORAGE, EnumC68125QoT.AD_STORAGE};
        int i = 0;
        while (true) {
            EnumC68125QoT enumC68125QoT = enumC68125QoTArr[i];
            if (!c68090Qnu2.LJFF(enumC68125QoT) && c68090Qnu.LJFF(enumC68125QoT)) {
                z = true;
                break;
            }
            i++;
            if (i >= 2) {
                z = false;
                break;
            }
        }
        boolean LJI = c68090Qnu.LJI(c68090Qnu2, EnumC68125QoT.ANALYTICS_STORAGE, EnumC68125QoT.AD_STORAGE);
        if (z || LJI) {
            c68082Qnm.LIZ.LJIILJJIL().LJIIL();
        }
    }

    public final void LJIIIZ(String str, String str2, Bundle bundle) {
        this.LIZ.LJIILIIL.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        QH7.LJI(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.LIZ.LIZIZ().LJIILIIL(new RunnableC68024Qmq(this, bundle2));
    }

    public final void LJIIL(String str, String str2, Bundle bundle) {
        LJFF();
        this.LIZ.LJIILIIL.getClass();
        LJIILIIL(System.currentTimeMillis(), str, str2, bundle);
    }

    public final void LJIIZILJ(Bundle bundle, int i, long j) {
        String string;
        Boolean bool;
        LJI();
        for (EnumC68125QoT enumC68125QoT : EnumC68125QoT.values()) {
            if (bundle.containsKey(enumC68125QoT.zzd) && (string = bundle.getString(enumC68125QoT.zzd)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                } else {
                    this.LIZ.LIZJ().LJIIJ.LIZIZ(string, "Ignoring invalid consent setting");
                    this.LIZ.LIZJ().LJIIJ.LIZ("Valid consent values are 'granted', 'denied'");
                    break;
                }
                if (bool == null) {
                    this.LIZ.LIZJ().LJIIJ.LIZIZ(string, "Ignoring invalid consent setting");
                    this.LIZ.LIZJ().LJIIJ.LIZ("Valid consent values are 'granted', 'denied'");
                    break;
                }
            }
        }
        LJIJ(C68090Qnu.LIZ(bundle), i, j);
    }

    public final void LJIJ(C68090Qnu c68090Qnu, int i, long j) {
        C68090Qnu c68090Qnu2;
        boolean z;
        boolean z2;
        boolean z3;
        C68090Qnu c68090Qnu3 = c68090Qnu;
        LJI();
        if (i == -10 || c68090Qnu3.LIZ.get(EnumC68125QoT.AD_STORAGE) != null || c68090Qnu3.LIZ.get(EnumC68125QoT.ANALYTICS_STORAGE) != null) {
            synchronized (this.LJII) {
                c68090Qnu2 = this.LJIIIIZZ;
                z = true;
                z2 = false;
                if (i <= this.LJIIIZ) {
                    boolean LJI = c68090Qnu3.LJI(c68090Qnu2, (EnumC68125QoT[]) c68090Qnu3.LIZ.keySet().toArray(new EnumC68125QoT[0]));
                    EnumC68125QoT enumC68125QoT = EnumC68125QoT.ANALYTICS_STORAGE;
                    if (c68090Qnu3.LJFF(enumC68125QoT) && !this.LJIIIIZZ.LJFF(enumC68125QoT)) {
                        z2 = true;
                    }
                    c68090Qnu3 = c68090Qnu3.LIZLLL(this.LJIIIIZZ);
                    this.LJIIIIZZ = c68090Qnu3;
                    this.LJIIIZ = i;
                    z3 = z2;
                    z2 = LJI;
                } else {
                    z = false;
                    z3 = false;
                }
            }
            if (!z) {
                this.LIZ.LIZJ().LJIIJJI.LIZIZ(c68090Qnu3, "Ignoring lower-priority consent settings, proposed settings");
                return;
            }
            long andIncrement = this.LJIIJ.getAndIncrement();
            if (z2) {
                this.LJI.set(null);
                this.LIZ.LIZIZ().LJIILJJIL(new RunnableC68108QoC(this, c68090Qnu3, j, i, andIncrement, z3, c68090Qnu2));
                return;
            }
            RunnableC68109QoD runnableC68109QoD = new RunnableC68109QoD(this, c68090Qnu3, i, andIncrement, z3, c68090Qnu2);
            if (i == 30 || i == -10) {
                this.LIZ.LIZIZ().LJIILJJIL(runnableC68109QoD);
                return;
            } else {
                this.LIZ.LIZIZ().LJIILIIL(runnableC68109QoD);
                return;
            }
        }
        this.LIZ.LIZJ().LJIIJ.LIZ("Discarding empty consent settings");
    }

    public final void LJIILIIL(long j, String str, String str2, Bundle bundle) {
        boolean z;
        LJFF();
        if (this.LIZLLL == null || C68083Qnn.LJJJJ(str2)) {
            z = true;
        } else {
            z = false;
        }
        LJIILJJIL(str, str2, j, bundle, true, z, true, null);
    }

    public final void LJIJJLI(long j, Object obj, String str, String str2) {
        boolean LJIIL;
        long j2;
        Object obj2 = obj;
        String str3 = str2;
        QH7.LJI(str);
        QH7.LJI(str3);
        LJFF();
        LJI();
        if ("allow_personalized_ads".equals(str3)) {
            if (obj2 instanceof String) {
                String str4 = (String) obj2;
                if (!TextUtils.isEmpty(str4)) {
                    String str5 = "false";
                    if (true != "false".equals(str4.toLowerCase(Locale.ENGLISH))) {
                        j2 = 0;
                    } else {
                        j2 = 1;
                    }
                    Long valueOf = Long.valueOf(j2);
                    C67192QYq c67192QYq = this.LIZ.LJIILLIIL().LJIIJJI;
                    if (valueOf.longValue() == 1) {
                        str5 = "true";
                    }
                    c67192QYq.LIZIZ(str5);
                    obj2 = valueOf;
                    str3 = "_npa";
                }
            }
            if (obj2 == null) {
                this.LIZ.LJIILLIIL().LJIIJJI.LIZIZ("unset");
                obj2 = obj2;
                str3 = "_npa";
            }
        }
        if (!this.LIZ.LJII()) {
            this.LIZ.LIZJ().LJIILIIL.LIZ("User property not set since app measurement is disabled");
            return;
        }
        if (!this.LIZ.LJIIIIZZ()) {
            return;
        }
        zzlo zzloVar = new zzlo(j, obj2, str3, str);
        C68022Qmo LJIJJ = this.LIZ.LJIJJ();
        LJIJJ.LJFF();
        LJIJJ.LJI();
        LJIJJ.LIZ.getClass();
        C67546Qf8 LJIILL = LJIJJ.LIZ.LJIILL();
        LJIILL.getClass();
        Parcel obtain = Parcel.obtain();
        C68101Qo5.LIZ(zzloVar, obtain);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            LJIILL.LIZ.LIZJ().LJI.LIZ("User property too long for local database. Sending directly to service");
            LJIIL = false;
        } else {
            LJIIL = LJIILL.LJIIL(1, marshall);
        }
        LJIJJ.LJIIZILJ(new RunnableC68078Qni(LJIJJ, LJIJJ.LJIILJJIL(true), LJIIL, zzloVar));
    }

    public final void LJIJJ(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int length;
        int i2;
        String str3 = str;
        if (str3 == null) {
            str3 = "app";
        }
        if (z) {
            i = this.LIZ.LJIL().LJJL(str2);
        } else {
            C68083Qnn LJIL = this.LIZ.LJIL();
            if (LJIL.LJJIZ("user property", str2)) {
                if (!LJIL.LJJIJIIJIL("user property", str2, C68119QoN.LIZ, null)) {
                    i = 15;
                } else if (LJIL.LJJIJIIJI(24, "user property", str2)) {
                    i = 0;
                }
            }
            i = 6;
        }
        if (i != 0) {
            this.LIZ.LJIL().getClass();
            String LJIIL = C68083Qnn.LJIIL(24, str2, true);
            if (str2 != null) {
                i2 = str2.length();
            } else {
                i2 = 0;
            }
            C68083Qnn LJIL2 = this.LIZ.LJIL();
            OJ3 oj3 = this.LJIILL;
            LJIL2.getClass();
            C68083Qnn.LJIJJLI(oj3, null, i, "_ev", LJIIL, i2);
            return;
        }
        if (obj != null) {
            int LJJJLIIL = this.LIZ.LJIL().LJJJLIIL(obj, str2);
            if (LJJJLIIL != 0) {
                this.LIZ.LJIL().getClass();
                String LJIIL2 = C68083Qnn.LJIIL(24, str2, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    length = obj.toString().length();
                } else {
                    length = 0;
                }
                C68083Qnn LJIL3 = this.LIZ.LJIL();
                OJ3 oj32 = this.LJIILL;
                LJIL3.getClass();
                C68083Qnn.LJIJJLI(oj32, null, LJJJLIIL, "_ev", LJIIL2, length);
                return;
            }
            Object LJIIJ = this.LIZ.LJIL().LJIIJ(obj, str2);
            if (LJIIJ != null) {
                this.LIZ.LIZIZ().LJIILIIL(new RunnableC68133Qob(this, str3, str2, LJIIJ, j));
                return;
            }
            return;
        }
        this.LIZ.LIZIZ().LJIILIIL(new RunnableC68133Qob(this, str3, str2, null, j));
    }

    public static void LJJIII(C68082Qnm c68082Qnm, C68090Qnu c68090Qnu, int i, long j, boolean z, boolean z2) {
        c68082Qnm.LJFF();
        c68082Qnm.LJI();
        if (j <= c68082Qnm.LJIIJJI && c68082Qnm.LJIIL <= i) {
            c68082Qnm.LIZ.LIZJ().LJIIJJI.LIZIZ(c68090Qnu, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        C67274Qak LJIILLIIL = c68082Qnm.LIZ.LJIILLIIL();
        LJIILLIIL.LJFF();
        if (LJIILLIIL.LJIIZILJ(i)) {
            SharedPreferences.Editor edit = LJIILLIIL.LJIIJ().edit();
            edit.putString("consent_settings", c68090Qnu.LJ());
            edit.putInt("consent_source", i);
            edit.apply();
            c68082Qnm.LJIIJJI = j;
            c68082Qnm.LJIIL = i;
            C68022Qmo LJIJJ = c68082Qnm.LIZ.LJIJJ();
            LJIJJ.LJFF();
            LJIJJ.LJI();
            if (z) {
                LJIJJ.LIZ.getClass();
                LJIJJ.LIZ.LJIILL().LJIIJ();
            }
            if (LJIJJ.LJIIL()) {
                LJIJJ.LJIIZILJ(new RunnableC68044QnA(LJIJJ, LJIJJ.LJIILJJIL(false)));
            }
            if (z2) {
                c68082Qnm.LIZ.LJIJJ().LJIJJLI(new AtomicReference());
                return;
            }
            return;
        }
        c68082Qnm.LIZ.LIZJ().LJIIJJI.LIZIZ(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
    }

    public final void LJIIJJI(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3;
        String str4;
        C68132Qoa c68132Qoa;
        boolean z3;
        Bundle bundle2 = bundle;
        String str5 = str;
        if (str5 == null) {
            str5 = "app";
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (str2 != "screen_view" && (str2 == null || !str2.equals("screen_view"))) {
            if (!z2 || this.LIZLLL == null || C68083Qnn.LJJJJ(str2)) {
                z3 = true;
            } else {
                z3 = false;
            }
            Bundle bundle3 = new Bundle(bundle2);
            for (String str6 : bundle3.keySet()) {
                Object LLJJIII = C16880lQ.LLJJIII(bundle3, str6);
                if (LLJJIII instanceof Bundle) {
                    bundle3.putBundle(str6, new Bundle((Bundle) LLJJIII));
                } else if (LLJJIII instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) LLJJIII;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (LLJJIII instanceof List) {
                    List list = (List) LLJJIII;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj = ListProtector.get(list, i2);
                        if (obj instanceof Bundle) {
                            ListProtector.set(list, i2, new Bundle((Bundle) obj));
                        }
                    }
                }
            }
            this.LIZ.LIZIZ().LJIILIIL(new RunnableC68130QoY(this, str5, str2, j, bundle3, z2, z3, z));
            return;
        }
        C68084Qno LJIJI = this.LIZ.LJIJI();
        synchronized (LJIJI.LJIIJJI) {
            if (!LJIJI.LJIIJ) {
                LJIJI.LIZ.LIZJ().LJIIJ.LIZ("Cannot log screen view event when the app is in the background.");
                return;
            }
            String string = bundle2.getString("screen_name");
            if (string != null && (string.length() <= 0 || string.length() > 100)) {
                LJIJI.LIZ.LIZJ().LJIIJ.LIZIZ(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                return;
            }
            String string2 = bundle2.getString("screen_class");
            if (string2 != null) {
                if (string2.length() <= 0 || string2.length() > 100) {
                    LJIJI.LIZ.LIZJ().LJIIJ.LIZIZ(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
            } else {
                Activity activity = LJIJI.LJI;
                if (activity != null) {
                    string2 = LJIJI.LJIILIIL(activity.getClass());
                } else {
                    string2 = "Activity";
                }
            }
            C68132Qoa c68132Qoa2 = LJIJI.LIZJ;
            if (LJIJI.LJII && c68132Qoa2 != null) {
                LJIJI.LJII = false;
                boolean LJJLIIIJJI = OUP.LJJLIIIJJI(c68132Qoa2.LIZIZ, string2);
                boolean LJJLIIIJJI2 = OUP.LJJLIIIJJI(c68132Qoa2.LIZ, string);
                if (LJJLIIIJJI && LJJLIIIJJI2) {
                    LJIJI.LIZ.LIZJ().LJIIJ.LIZ("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            C67281Qar c67281Qar = LJIJI.LIZ.LIZJ().LJIILIIL;
            if (string == null) {
                str3 = "null";
            } else {
                str3 = string;
            }
            if (string2 == null) {
                str4 = "null";
            } else {
                str4 = string2;
            }
            c67281Qar.LIZJ(str3, str4, "Logging screen view with name, class");
            if (LJIJI.LIZJ == null) {
                c68132Qoa = LJIJI.LIZLLL;
            } else {
                c68132Qoa = LJIJI.LIZJ;
            }
            C68132Qoa c68132Qoa3 = new C68132Qoa(LJIJI.LIZ.LJIL().LJJLIIIJ(), j, true, string, string2);
            LJIJI.LIZJ = c68132Qoa3;
            LJIJI.LIZLLL = c68132Qoa;
            LJIJI.LJIIIIZZ = c68132Qoa3;
            LJIJI.LIZ.LJIILIIL.getClass();
            LJIJI.LIZ.LIZIZ().LJIILIIL(new RunnableC68117QoL(LJIJI, bundle2, c68132Qoa3, c68132Qoa, SystemClock.elapsedRealtime()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0142, code lost:
    
        if (r9.LJJIJIIJI(40, "event", r27) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(java.lang.String r26, java.lang.String r27, long r28, android.os.Bundle r30, boolean r31, boolean r32, boolean r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68082Qnm.LJIILJJIL(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }
}
