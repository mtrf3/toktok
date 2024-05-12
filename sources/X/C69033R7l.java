package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* renamed from: X.R7l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69033R7l<T> implements InterfaceC73518StG {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ Fragment LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ EnumC69116RAq LJFF;
    public final /* synthetic */ EnumC69113RAn LJI;

    public C69033R7l(Fragment fragment, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, boolean z) {
        this.LIZ = z;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = fragment;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = enumC69116RAq;
        this.LJI = enumC69113RAn;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        boolean z = this.LIZ;
        if (!z) {
            C68972R5c.LJIIIIZZ(Boolean.valueOf(z), "sms_verification", this.LIZIZ.q9(), false, null, 24);
        }
        R83 r83 = new R83(c73516StE, this.LJFF, this.LJI, this.LIZJ);
        this.LIZIZ.bi(r83);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C69093R9t.LJIIIIZZ());
        if (C69040R7s.LIZIZ()) {
            linkedHashMap.putAll(C69040R7s.LIZ());
        }
        Bundle arguments = this.LIZJ.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        if (arguments.getBoolean("is_multi_account_same_user", false)) {
            linkedHashMap.put("multi_signup", "1");
        } else {
            linkedHashMap.put("multi_signup", CardStruct.IStatusCode.DEFAULT);
        }
        if (RegistrationAgeGateServiceImpl.LIZ().isYearOnlyBirthdaySelection()) {
            if (RegistrationAgeGateServiceImpl.LIZ().getTreatmentGroupForYearOnlyFlow() == 1) {
                linkedHashMap.put("birthday_type", "1");
            } else if (RegistrationAgeGateServiceImpl.LIZ().getTreatmentGroupForYearOnlyFlow() == 2) {
                linkedHashMap.put("birthday_type", "2");
            }
        }
        this.LIZIZ.r9().LJJII(this.LIZLLL, this.LJ, linkedHashMap, r83);
    }
}
