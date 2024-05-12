package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* renamed from: X.R7m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69034R7m<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ Fragment LJFF;

    public C69034R7m(BaseAccountFlowFragment baseAccountFlowFragment, BaseAccountFlowFragment baseAccountFlowFragment2, String str, String str2, String str3, boolean z) {
        this.LIZ = baseAccountFlowFragment2;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = baseAccountFlowFragment;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C68972R5c.LJIIIIZZ(Boolean.TRUE, "email", this.LIZ.q9(), false, null, 24);
        R82 r82 = new R82(c73516StE, this.LIZ, this.LJFF, this.LJ, this.LIZLLL);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C69093R9t.LJJIIJ(this.LIZIZ, linkedHashMap);
        linkedHashMap.putAll(C69093R9t.LJIIIIZZ());
        if (C69040R7s.LIZIZ()) {
            linkedHashMap.putAll(C69040R7s.LIZ());
        }
        if (this.LIZJ) {
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
        this.LIZ.bi(r82);
        this.LIZ.r9().LJIIJ(this.LIZLLL, this.LJ, linkedHashMap, r82);
    }
}
