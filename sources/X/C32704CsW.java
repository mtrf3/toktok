package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.list.adapter.LiveGiftPanelPageAdapter$setupScrollListeners$1$onScrollStateChanged$1", f = "LiveGiftPanelPageAdapter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.CsW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32704CsW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C32691CsJ LJLIL;
    public final /* synthetic */ RecyclerView LJLILLLLZI;
    public final /* synthetic */ GridLayoutManager LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32704CsW(C32691CsJ c32691CsJ, RecyclerView recyclerView, GridLayoutManager gridLayoutManager, InterfaceC67352kd<? super C32704CsW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c32691CsJ;
        this.LJLILLLLZI = recyclerView;
        this.LJLJI = gridLayoutManager;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32704CsW(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.LJLJJI != null) {
            GiftPanelLeafViewModel.kv0(this.LJLILLLLZI, this.LJLJI);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
