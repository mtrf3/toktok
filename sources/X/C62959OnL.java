package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.settings.DoBStatus;
import com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.OnL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62959OnL<T> implements InterfaceC64592gB {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ AgeGateServiceImpl LJLILLLLZI;
    public final /* synthetic */ InterfaceC62969OnV LJLJI;
    public final /* synthetic */ Activity LJLJJI;

    public C62959OnL(String str, AgeGateServiceImpl ageGateServiceImpl, InterfaceC62969OnV interfaceC62969OnV, Activity activity) {
        this.LJLIL = str;
        this.LJLILLLLZI = ageGateServiceImpl;
        this.LJLJI = interfaceC62969OnV;
        this.LJLJJI = activity;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Integer type;
        DoBStatus dobStatus = (DoBStatus) obj;
        o.LJIIIZ(dobStatus, "dobStatus");
        Integer type2 = dobStatus.getType();
        int i = 0;
        if ((type2 == null || type2.intValue() != 1) && ((type = dobStatus.getType()) == null || type.intValue() != 2)) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLJJI);
            c26045AKb.LJIIIIZZ(R.string.rf3);
            c26045AKb.LJIIJ();
            InterfaceC62969OnV interfaceC62969OnV = this.LJLJI;
            if (interfaceC62969OnV != null) {
                interfaceC62969OnV.LIZ("", false);
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "illegal_edit_dob");
            FMX.LJIIL("pns_analysis_event", c188727au.LIZ);
            return;
        }
        java.util.Map<String, String> LJJL = C113554cx.LJJL(new OSZ("enter_method", this.LJLIL), new OSZ("user_type", "edit"));
        this.LJLILLLLZI.LJJI().LIZIZ(LJJL);
        AgeGateServiceImpl.LJIIJ = LJJL;
        IPNSAgeGateService LJJI = this.LJLILLLLZI.LJJI();
        C43286Gyo.LIZ.getClass();
        LJJI.LJII(new Locale(C87093YGb.LIZ(), C85990Xow.LIZ()));
        AgeGateServiceImpl.LJIIIIZZ = this.LJLJI;
        this.LJLILLLLZI.LJJI().LIZLLL();
        IPNSAgeGateService pnsAgeGateService = this.LJLILLLLZI.LJJI();
        Activity activity = this.LJLJJI;
        this.LJLILLLLZI.getClass();
        C62958OnK c62958OnK = new C62958OnK(activity, "from_edit_age", AgeGateServiceImpl.LJJIFFI());
        int intValue = dobStatus.getType().intValue();
        Integer descType = dobStatus.getDescType();
        if (descType != null) {
            i = descType.intValue();
        }
        C63062Op0 c63062Op0 = new C63062Op0(intValue, i, C63761P0r.LIZ(dobStatus.getDefaultDoB()), C63761P0r.LIZ(dobStatus.getUpperBoundDate()));
        EnumC86095Xqd enumC86095Xqd = EnumC86095Xqd.EDIT;
        C62977Ond c62977Ond = new C62977Ond();
        o.LJIIIIZZ(pnsAgeGateService, "pnsAgeGateService");
        C62966OnS.LIZ(pnsAgeGateService, enumC86095Xqd, c62958OnK, this.LJLJJI, c62977Ond, null, c63062Op0, 16);
    }
}
