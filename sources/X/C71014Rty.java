package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.slot.ECExplanationWatcherCardSlotV4$goToPage$1", f = "ECExplanationWatcherCardSlotV4.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rty, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71014Rty extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C48502J1u LJLIL;
    public final /* synthetic */ C71124Rvk LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ PopupCardVO LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71014Rty(C48502J1u c48502J1u, C71124Rvk c71124Rvk, Context context, PopupCardVO popupCardVO, String str, InterfaceC67352kd<? super C71014Rty> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c48502J1u;
        this.LJLILLLLZI = c71124Rvk;
        this.LJLJI = context;
        this.LJLJJI = popupCardVO;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71014Rty(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r61) {
        /*
            Method dump skipped, instructions count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71014Rty.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
