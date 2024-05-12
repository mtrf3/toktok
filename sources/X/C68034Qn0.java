package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Qn0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68034Qn0 extends C68048QnE {
    public Boolean LIZIZ;
    public InterfaceC68064QnU LIZJ;
    public Boolean LIZLLL;

    public final Bundle LJIIL() {
        try {
            if (this.LIZ.LIZ.getPackageManager() == null) {
                this.LIZ.LIZJ().LJFF.LIZ("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo LIZ = QCX.LIZ(this.LIZ.LIZ).LIZ(128, this.LIZ.LIZ.getPackageName());
            if (LIZ == null) {
                this.LIZ.LIZJ().LJFF.LIZ("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return LIZ.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            this.LIZ.LIZJ().LJFF.LIZIZ(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final int LJIIIIZZ() {
        C68083Qnn LJIL = this.LIZ.LJIL();
        Boolean bool = LJIL.LIZ.LJIJJ().LJ;
        if (LJIL.LJJLI() < 201500) {
            if (bool != null && !bool.booleanValue()) {
                return 100;
            }
            return 25;
        }
        return 100;
    }

    public final void LJIIJ() {
        this.LIZ.getClass();
    }

    public final boolean LJIILL() {
        Boolean LJIILIIL = LJIILIIL("google_analytics_automatic_screen_reporting_enabled");
        if (LJIILIIL == null || LJIILIIL.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean LJIILLIIL() {
        this.LIZ.getClass();
        Boolean LJIILIIL = LJIILIIL("firebase_analytics_collection_deactivated");
        if (LJIILIIL != null && LJIILIIL.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean LJIJ() {
        if (this.LIZIZ == null) {
            Boolean LJIILIIL = LJIILIIL("app_measurement_lite");
            this.LIZIZ = LJIILIIL;
            if (LJIILIIL == null) {
                this.LIZIZ = Boolean.FALSE;
            }
        }
        if (this.LIZIZ.booleanValue() || !this.LIZ.LJ) {
            return true;
        }
        return false;
    }

    public C68034Qn0(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
        this.LIZJ = new InterfaceC68064QnU() { // from class: X.QnT
            @Override // X.InterfaceC68064QnU
            public final String LJJIIZ(String str, String str2) {
                return null;
            }
        };
    }

    public final String LJI(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            QH7.LJIIIIZZ(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            this.LIZ.LIZJ().LJFF.LIZIZ(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            this.LIZ.LIZJ().LJFF.LIZIZ(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            this.LIZ.LIZJ().LJFF.LIZIZ(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            this.LIZ.LIZJ().LJFF.LIZIZ(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final Boolean LJIILIIL(String str) {
        QH7.LJI(str);
        Bundle LJIIL = LJIIL();
        if (LJIIL == null) {
            this.LIZ.LIZJ().LJFF.LIZ("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!LJIIL.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(LJIIL.getBoolean(str));
    }

    public final boolean LJIIZILJ(String str) {
        return "1".equals(this.LIZJ.LJJIIZ(str, "measurement.event_sampling_enabled"));
    }

    public final double LJII(String str, C68067QnX c68067QnX) {
        if (str == null) {
            return ((Double) c68067QnX.LIZ(null)).doubleValue();
        }
        String LJJIIZ = this.LIZJ.LJJIIZ(str, c68067QnX.LIZ);
        if (TextUtils.isEmpty(LJJIIZ)) {
            return ((Double) c68067QnX.LIZ(null)).doubleValue();
        }
        try {
            return ((Double) c68067QnX.LIZ(Double.valueOf(CastDoubleProtector.parseDouble(LJJIIZ)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c68067QnX.LIZ(null)).doubleValue();
        }
    }

    public final int LJIIIZ(String str, C68067QnX c68067QnX) {
        if (str == null) {
            return ((Integer) c68067QnX.LIZ(null)).intValue();
        }
        String LJJIIZ = this.LIZJ.LJJIIZ(str, c68067QnX.LIZ);
        if (TextUtils.isEmpty(LJJIIZ)) {
            return ((Integer) c68067QnX.LIZ(null)).intValue();
        }
        try {
            return ((Integer) c68067QnX.LIZ(Integer.valueOf(CastIntegerProtector.parseInt(LJJIIZ)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c68067QnX.LIZ(null)).intValue();
        }
    }

    public final long LJIIJJI(String str, C68067QnX c68067QnX) {
        if (str == null) {
            return ((Long) c68067QnX.LIZ(null)).longValue();
        }
        String LJJIIZ = this.LIZJ.LJJIIZ(str, c68067QnX.LIZ);
        if (TextUtils.isEmpty(LJJIIZ)) {
            return ((Long) c68067QnX.LIZ(null)).longValue();
        }
        try {
            return ((Long) c68067QnX.LIZ(Long.valueOf(CastLongProtector.parseLong(LJJIIZ)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c68067QnX.LIZ(null)).longValue();
        }
    }

    public final boolean LJIILJJIL(String str, C68067QnX c68067QnX) {
        if (str == null) {
            return ((Boolean) c68067QnX.LIZ(null)).booleanValue();
        }
        String LJJIIZ = this.LIZJ.LJJIIZ(str, c68067QnX.LIZ);
        if (TextUtils.isEmpty(LJJIIZ)) {
            return ((Boolean) c68067QnX.LIZ(null)).booleanValue();
        }
        return ((Boolean) c68067QnX.LIZ(Boolean.valueOf("1".equals(LJJIIZ)))).booleanValue();
    }
}
