package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GOu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41456GOu extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ CommerceToolsTcmModel LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41456GOu(boolean z, Context context, boolean z2, CommerceToolsTcmModel commerceToolsTcmModel, boolean z3, int i) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = context;
        this.LJLJI = z2;
        this.LJLJJI = commerceToolsTcmModel;
        this.LJLJJL = z3;
        this.LJLJJLL = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        String str;
        String str2;
        o.LJIIIZ(it, "it");
        if (this.LJLIL) {
            str = "passively_popup_highfans_bc";
        } else {
            str = "passively_popup_lowfans_bc";
        }
        C145995oB c145995oB = new C145995oB();
        if (this.LJLIL) {
            str2 = "highfans_choice";
        } else {
            str2 = "lowfans_choice";
        }
        c145995oB.LIZ(2, str2);
        FMX.LJIIL(str, c145995oB.LIZ);
        C41459GOx.LIZ(C45804HyK.LJIJJ(this.LJLILLLLZI), this.LJLJI, this.LJLJJI, this.LJLJJL, "post", this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
