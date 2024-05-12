package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.G4y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40940G4y extends AbstractC40941G4z {
    public final AgeGateSdkRegistrationFlow LIZ;
    public final AbstractC40941G4z LIZIZ;
    public final HashMap<String, String> LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final SimpleDateFormat LJFF;

    public final String LIZ() {
        if (a.LIZIZ().isFtcForRegistration()) {
            return "f_age_gate_registration_response";
        }
        if (this.LIZ != AgeGateSdkRegistrationFlow.SIGN_UP) {
            return "guest_mode_age_gate_response";
        }
        return "age_gate_registration_response";
    }

    @Override // X.AbstractC40941G4z
    public final boolean onCancel() {
        a.LIZIZ().LJIL(null);
        LIZIZ(-3001, LIZ(), this.LIZJ, false);
        return this.LIZIZ.onCancel();
    }

    @Override // X.AbstractC40941G4z
    public final boolean onDeviceBlocked() {
        a.LJIJJ().LJI();
        a.LIZIZ().LJIL(null);
        LIZIZ(56004, LIZ(), this.LIZJ, false);
        return this.LIZIZ.onDeviceBlocked();
    }

    @Override // X.AbstractC40941G4z
    public final boolean onError(PNSErrorModel error) {
        o.LJIIIZ(error, "error");
        Integer errorType = error.getErrorType();
        if (errorType != null) {
            LIZIZ(errorType.intValue(), LIZ(), this.LIZJ, false);
        }
        return this.LIZIZ.onError(error);
    }

    @Override // X.AbstractC40941G4z
    public final boolean onSuccess(C62962OnO result) {
        String str;
        o.LJIIIZ(result, "result");
        C40535FvX.LIZ().edit().putInt("ftc_age_gate_response_mode", result.LIZ.getValue()).apply();
        LIZJ(result.LIZ, false);
        a.LJIJJ().LIZIZ(8);
        Date date = result.LIZIZ;
        if (date == null || (str = this.LJFF.format(date)) == null) {
            str = "";
        }
        a.LIZIZ().LJIL(str);
        if (this.LIZLLL) {
            GuestModeServiceImpl.LJIIJJI().LIZ(str);
        }
        LIZIZ(0, LIZ(), this.LIZJ, true);
        return this.LIZIZ.onSuccess(result);
    }

    @Override // X.AbstractC40941G4z
    public final boolean onUnderage(C62962OnO result) {
        String str;
        o.LJIIIZ(result, "result");
        C40535FvX.LIZ().edit().putBoolean("ftc_age_gate_response_prompt", result.LIZJ).apply();
        C40535FvX.LIZ().edit().putInt("ftc_age_gate_response_mode", result.LIZ.getValue()).apply();
        LIZJ(result.LIZ, true);
        a.LJIJJ().LJI();
        IAgeGateService LIZIZ = a.LIZIZ();
        Date date = result.LIZIZ;
        if (date == null || (str = this.LJFF.format(date)) == null) {
            str = "";
        }
        LIZIZ.LJIL(str);
        LIZIZ(56004, LIZ(), this.LIZJ, false);
        return this.LIZIZ.onUnderage(result);
    }

    public final void LIZJ(EnumC63002Oo2 enumC63002Oo2, boolean z) {
        if (this.LIZLLL) {
            if (enumC63002Oo2 == EnumC63002Oo2.US_FTC) {
                GuestModeServiceImpl.LJIIJJI().LJII();
            } else if (!z) {
                GuestModeServiceImpl.LJIIJJI().LJI(Integer.valueOf(enumC63002Oo2.getValue()));
            }
            G50.LIZ("success");
        }
    }

    public C40940G4y(AgeGateSdkRegistrationFlow flowForEt, AbstractC40941G4z callbackForEt, HashMap<String, String> hashMap, boolean z) {
        o.LJIIIZ(flowForEt, "flowForEt");
        o.LJIIIZ(callbackForEt, "callbackForEt");
        this.LIZ = flowForEt;
        this.LIZIZ = callbackForEt;
        this.LIZJ = hashMap;
        this.LIZLLL = z;
        this.LJ = SystemClock.elapsedRealtime();
        this.LJFF = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT);
    }

    public final void LIZIZ(int i, String str, HashMap hashMap, boolean z) {
        String str2;
        C188727au LIZJ = C78920UyC.LIZJ(i, "error_code");
        LIZJ.LJIIIZ("page_stay_time", String.valueOf(SystemClock.elapsedRealtime() - this.LJ));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.LJIIIZ("is_success", str2);
        LIZJ.LJII(hashMap);
        C36222EJm.LIZ(LIZJ);
        if (RegistrationAgeGateServiceImpl.LIZ().isYearOnlyBirthdaySelection()) {
            if (RegistrationAgeGateServiceImpl.LIZ().getTreatmentGroupForYearOnlyFlow() == 1) {
                LIZJ.LJI("final_page_type", "birth_year");
            } else if (RegistrationAgeGateServiceImpl.LIZ().getTreatmentGroupForYearOnlyFlow() == 2) {
                LIZJ.LJI("final_page_type", "age_only");
            }
        } else {
            LIZJ.LJI("final_page_type", "birthday");
        }
        FMX.LJIIL(str, LIZJ.LIZ);
    }
}
