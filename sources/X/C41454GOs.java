package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GOs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41454GOs extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ CommerceToolsTcmModel LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41454GOs(Context context, boolean z, CommerceToolsTcmModel commerceToolsTcmModel, boolean z2, int i) {
        super(1);
        this.LJLIL = context;
        this.LJLILLLLZI = z;
        this.LJLJI = commerceToolsTcmModel;
        this.LJLJJI = z2;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(C41458GOw.LIZIZ() ? 1 : 0, "is_tcm_creator");
        c145995oB.LJI("user_id", C44172HVg.LJIJ.getCurrentUserID());
        FMX.LJIIL("ttcm_turnon_disclosure_setting_click_turnon", c145995oB.LIZ);
        C41459GOx.LIZ(C45804HyK.LJIJJ(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, "post", this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
