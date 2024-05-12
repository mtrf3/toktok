package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlatformPromotionItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$claimPlatformVoucher$1", f = "PdpViewModel.kt", l = {3911}, m = "invokeSuspend")
/* renamed from: X.Rcx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69959Rcx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C76732zl LJLIL;
    public C68322mC LJLILLLLZI;
    public C68322mC LJLJI;
    public PdpViewModel LJLJJI;
    public int LJLJJL;
    public final /* synthetic */ PlatformPromotionItem LJLJJLL;
    public final /* synthetic */ PdpViewModel LJLJL;
    public final /* synthetic */ View LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69959Rcx(PlatformPromotionItem platformPromotionItem, PdpViewModel pdpViewModel, View view, InterfaceC67352kd<? super C69959Rcx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJLL = platformPromotionItem;
        this.LJLJL = pdpViewModel;
        this.LJLJLJ = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69959Rcx(this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [T, com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69959Rcx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
