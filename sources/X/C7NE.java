package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.nows.feed.ui.NowExposeMobAssem;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7NE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7NE extends AbstractC65781Prl implements InterfaceC88471Ynr<NowExposeMobAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C7NE LJLIL = new C7NE();

    public C7NE() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowExposeMobAssem nowExposeMobAssem, C43I<? extends Integer> c43i) {
        NowExposeMobAssem selectSubscribe = nowExposeMobAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLFII = true;
            C8YN.LJIJI((AssemViewModel) selectSubscribe.LJZL.LIZ(selectSubscribe, NowExposeMobAssem.LLI[0]), new AqS169S0100000_3(selectSubscribe, 973));
        }
        return C76800UCe.LIZ;
    }
}
