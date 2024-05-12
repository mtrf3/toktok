package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AdPopUpWebPageAssem;
import kotlin.jvm.internal.AqS15S0010000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NXq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59522NXq extends AbstractC65781Prl implements InterfaceC88471Ynr<AdPopUpWebPageAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C59522NXq LJLIL = new C59522NXq();

    public C59522NXq() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdPopUpWebPageAssem adPopUpWebPageAssem, C43I<? extends Boolean> c43i) {
        AdPopUpWebPageAssem selectSubscribe = adPopUpWebPageAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            boolean booleanValue = ((Boolean) c43i2.LIZ).booleanValue();
            AssemViewModel assemViewModel = (AssemViewModel) selectSubscribe.LL.getValue();
            assemViewModel.getClass();
            assemViewModel.setState(new AqS15S0010000_10(booleanValue, 6));
        }
        return C76800UCe.LIZ;
    }
}
