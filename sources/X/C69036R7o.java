package X;

import com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl;
import java.util.LinkedHashMap;

/* renamed from: X.R7o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69036R7o<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ EnumC69116RAq LIZLLL;
    public final /* synthetic */ EnumC69113RAn LJ;

    public C69036R7o(InterfaceC69056R8i interfaceC69056R8i, String str, String str2, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        this.LIZ = interfaceC69056R8i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = enumC69116RAq;
        this.LJ = enumC69113RAn;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C68972R5c.LJIIIIZZ(Boolean.TRUE, "email", this.LIZ.q9(), false, null, 24);
        R8G r8g = new R8G(c73516StE, this.LIZLLL, this.LJ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C69093R9t.LJIIIIZZ());
        if (RegistrationAgeGateServiceImpl.LIZ().isYearOnlyBirthdaySelection()) {
            if (RegistrationAgeGateServiceImpl.LIZ().getTreatmentGroupForYearOnlyFlow() == 1) {
                linkedHashMap.put("birthday_type", "1");
            } else if (RegistrationAgeGateServiceImpl.LIZ().getTreatmentGroupForYearOnlyFlow() == 2) {
                linkedHashMap.put("birthday_type", "2");
            }
        }
        this.LIZ.bi(r8g);
        this.LIZ.r9().LJIL(this.LIZIZ, this.LIZJ, linkedHashMap, r8g);
    }
}
