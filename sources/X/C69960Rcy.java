package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.api.ClaimVoucherApi;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InteractiveUserTask;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInteractiveInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FollowAndClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$followAndClaimCoupon$1", f = "PdpViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rcy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69960Rcy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Voucher LJLIL;
    public final /* synthetic */ PdpViewModel LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69960Rcy(Voucher voucher, PdpViewModel pdpViewModel, Context context, int i, InterfaceC67352kd<? super C69960Rcy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = voucher;
        this.LJLILLLLZI = pdpViewModel;
        this.LJLJI = context;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69960Rcy(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        VoucherInteractiveInfo interactiveInfo;
        InteractiveUserTask taskInfo;
        VoucherInteractiveInfo interactiveInfo2;
        InteractiveUserTask taskInfo2;
        C141335gf.LIZJ(obj);
        C69961Rcz c69961Rcz = ClaimVoucherApi.LIZ;
        Voucher voucher = this.LJLIL;
        String str3 = null;
        if (voucher != null) {
            str = voucher.getVoucherTypeID();
        } else {
            str = null;
        }
        Voucher voucher2 = this.LJLIL;
        if (voucher2 != null && (interactiveInfo2 = voucher2.getInteractiveInfo()) != null && (taskInfo2 = interactiveInfo2.getTaskInfo()) != null) {
            str2 = taskInfo2.getUserTaskId();
        } else {
            str2 = null;
        }
        Voucher voucher3 = this.LJLIL;
        if (voucher3 != null && (interactiveInfo = voucher3.getInteractiveInfo()) != null && (taskInfo = interactiveInfo.getTaskInfo()) != null) {
            str3 = taskInfo.getRoomId();
        }
        C70101RfF c70101RfF = IPdpStarter.LIZ;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LJLILLLLZI.LJLJJLL;
        c70101RfF.getClass();
        FollowAndClaimVoucherRequest followAndClaimVoucherRequest = new FollowAndClaimVoucherRequest(str, str2, null, str3, new Integer(C70101RfF.LIZIZ(pdpEnterParam)), null, 36, null);
        c69961Rcz.getClass();
        ((ClaimVoucherApi) C69961Rcz.LIZIZ.create(ClaimVoucherApi.class)).followAndClaimVoucher(followAndClaimVoucherRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new RYE(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLIL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
