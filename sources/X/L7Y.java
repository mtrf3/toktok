package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final /* synthetic */ class L7Y extends TBS implements InterfaceC88472Yns<InterfaceC88472Yns<? super InterfaceC70422pa, ? extends C76800UCe>, C76800UCe> {
    public L7Y(UserCardListViewModel userCardListViewModel) {
        super(1, userCardListViewModel, UserCardListViewModel.class, "runOnWorkThread", "runOnWorkThread(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC88472Yns<? super InterfaceC70422pa, ? extends C76800UCe> interfaceC88472Yns) {
        InterfaceC88472Yns<? super InterfaceC70422pa, ? extends C76800UCe> p0 = interfaceC88472Yns;
        o.LJIIIZ(p0, "p0");
        ((AssemViewModel) this.receiver).runOnWorkThread(p0);
        return C76800UCe.LIZ;
    }
}
