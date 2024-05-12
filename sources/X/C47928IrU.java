package X;

import com.mammon.audiosdk.enums.SAMICoreAbConfigType;
import com.mammon.audiosdk.structures.SAMICoreAbCallback;
import defpackage.m0;
import kotlin.jvm.internal.o;

/* renamed from: X.IrU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47928IrU implements SAMICoreAbCallback {
    @Override // com.mammon.audiosdk.structures.SAMICoreAbCallback
    public final Object getSAMICoreAbConfig(String str, SAMICoreAbConfigType sAMICoreAbConfigType) {
        return null;
    }

    @Override // com.mammon.audiosdk.structures.SAMICoreAbCallback
    public final Boolean getSAMICoreAbBoolConfig(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (o.LJ(str, "sami_test_bool")) {
            return m0.LIZIZ(31744, "sami_test_bool", true, false);
        }
        if (!o.LJ(str, "sami_tiga_ab_all")) {
            return null;
        }
        return m0.LIZIZ(31744, "sami_tiga_ab_all", true, false);
    }

    @Override // com.mammon.audiosdk.structures.SAMICoreAbCallback
    public final Float getSAMICoreAbFloatConfig(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !o.LJ(str, "sami_test_float")) {
            return null;
        }
        FFL.LJIIIZ().getClass();
        return Float.valueOf(FFL.LJIIIIZZ(31744, "sami_test_float", -0.999f));
    }

    @Override // com.mammon.audiosdk.structures.SAMICoreAbCallback
    public final Integer getSAMICoreAbIntConfig(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !o.LJ(str, "sami_test_int")) {
            return null;
        }
        return C06540Nm.LIZIZ(31744, -999, "sami_test_int", true);
    }

    @Override // com.mammon.audiosdk.structures.SAMICoreAbCallback
    public final String getSAMICoreAbStringConfig(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (o.LJ(str, "sami_test_string")) {
            FFL.LJIIIZ().getClass();
            String LJIILJJIL = FFL.LJIILJJIL(31744, "sami_test_string", "sami_test_string default", true);
            o.LJIIIIZZ(LJIILJJIL, "getInstance().getStringV…ring: value = $it\")\n    }");
            return LJIILJJIL;
        }
        if (!o.LJ(str, "sami_test_string4")) {
            return null;
        }
        FFL.LJIIIZ().getClass();
        String LJIILJJIL2 = FFL.LJIILJJIL(31744, "sami_test_string4", "test_default2", true);
        o.LJIIIIZZ(LJIILJJIL2, "getInstance().getStringV…cise: value = $it\")\n    }");
        return LJIILJJIL2;
    }
}
