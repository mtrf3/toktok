package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import kotlin.jvm.internal.AqS33S0001000_9;

/* loaded from: classes10.dex */
public final /* synthetic */ class L7X extends TBS implements InterfaceC88472Yns<Integer, C76800UCe> {
    public L7X(UserCardListViewModel userCardListViewModel) {
        super(1, userCardListViewModel, UserCardListViewModel.class, "toastMessage", "toastMessage(I)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int intValue = num.intValue();
        AssemViewModel assemViewModel = (AssemViewModel) this.receiver;
        assemViewModel.getClass();
        assemViewModel.setState(new AqS33S0001000_9(intValue, 0));
        return C76800UCe.LIZ;
    }
}
