package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeQAFragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS54S0110000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sjp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72933Sjp extends AbstractC008101l {
    public final /* synthetic */ MultiGuestConnectDistributeQAFragment LIZJ;

    @Override // X.AbstractC008101l
    public final void LIZ() {
        MultiGuestConnectDistributeQAFragment multiGuestConnectDistributeQAFragment = this.LIZJ;
        multiGuestConnectDistributeQAFragment.getClass();
        C0NB.LIZIZ("ConnectStatusDistribute_MultiGuestConnectDistributeQAFragment", "handleOnBackPressed");
        AssemViewModel assemViewModel = (AssemViewModel) multiGuestConnectDistributeQAFragment.LJLJJL.getValue();
        EnumC72939Sjv page = EnumC72939Sjv.STATUS_SETTING_PAGE;
        o.LJIIIZ(page, "page");
        assemViewModel.setState(new AqS54S0110000_12(page, false, 8));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72933Sjp(MultiGuestConnectDistributeQAFragment multiGuestConnectDistributeQAFragment) {
        super(true);
        this.LIZJ = multiGuestConnectDistributeQAFragment;
    }
}
