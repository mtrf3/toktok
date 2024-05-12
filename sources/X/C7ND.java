package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.nows.feed.ui.NowExposeMobAssem;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7ND, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7ND extends AbstractC65781Prl implements InterfaceC88471Ynr<NowExposeMobAssem, C7NN, C76800UCe> {
    public static final C7ND LJLIL = new C7ND();

    public C7ND() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowExposeMobAssem nowExposeMobAssem, C7NN c7nn) {
        boolean z;
        InterfaceC1805076o interfaceC1805076o;
        InterfaceC1805076o interfaceC1805076o2;
        NowExposeMobAssem selectSubscribe = nowExposeMobAssem;
        C7NN it = c7nn;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if ((((Number) C1806977h.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (it == C7NN.VISIBLE_ENOUGH) {
            C197387os.LJLIL.LIZJ(((C7ML) C51029K0z.LJIILLIIL(selectSubscribe)).z());
            if (!z && (interfaceC1805076o2 = (InterfaceC1805076o) selectSubscribe.LLF.getValue()) != null) {
                interfaceC1805076o2.jd(((C7ML) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid(), true);
            }
        } else if (!z && (interfaceC1805076o = (InterfaceC1805076o) selectSubscribe.LLF.getValue()) != null) {
            interfaceC1805076o.jd(((C7ML) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid(), false);
        }
        C8YN.LJIJI((AssemViewModel) selectSubscribe.LJZL.LIZ(selectSubscribe, NowExposeMobAssem.LLI[0]), new AqS134S0200000_3(selectSubscribe, it, 284));
        return C76800UCe.LIZ;
    }
}
