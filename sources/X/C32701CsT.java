package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$initViews$9$onScrollStateChanged$1", f = "GiftPanelLeafV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.CsT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32701CsT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C32676Cs4 LJLIL;
    public final /* synthetic */ RecyclerView LJLILLLLZI;
    public final /* synthetic */ GridLayoutManager LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32701CsT(C32676Cs4 c32676Cs4, RecyclerView recyclerView, GridLayoutManager gridLayoutManager, InterfaceC67352kd<? super C32701CsT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c32676Cs4;
        this.LJLILLLLZI = recyclerView;
        this.LJLJI = gridLayoutManager;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32701CsT(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.LJJIJIL() != null) {
            GiftPanelLeafViewModel.kv0(this.LJLILLLLZI, this.LJLJI);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
