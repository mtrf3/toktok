package X;

import com.ss.android.ugc.aweme.compliance.consent.termsconditions.component.TermsConditionsAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SUO extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final SUO LJLIL = new SUO();

    public SUO() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(TermsConditionsAssem.class);
        uiSlotAssem.LJIIIZ = new TermsConditionsAssem();
        uiSlotAssem.LJI = R.id.a93;
        return C76800UCe.LIZ;
    }
}
