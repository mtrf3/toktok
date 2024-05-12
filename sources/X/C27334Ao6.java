package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment$onViewCreated$1$1", f = "SkuPanelFragment.kt", l = {383}, m = "invokeSuspend")
/* renamed from: X.Ao6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27334Ao6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SkuPanelFragment LJLILLLLZI;
    public final /* synthetic */ List<ShopPolicy> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27334Ao6(SkuPanelFragment skuPanelFragment, List<ShopPolicy> list, InterfaceC67352kd<? super C27334Ao6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = skuPanelFragment;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27334Ao6(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            View _$_findCachedViewById = this.LJLILLLLZI.LJLJJLL._$_findCachedViewById(R.id.hvo);
            o.LJIIIIZZ(_$_findCachedViewById, "fragment.policies_container");
            _$_findCachedViewById.setVisibility(0);
            TuxTextView tuxTextView = (TuxTextView) this.LJLILLLLZI.LJLJJLL._$_findCachedViewById(R.id.hvn);
            o.LJIIIIZZ(tuxTextView, "fragment.policies");
            List<ShopPolicy> list = this.LJLJI;
            this.LJLIL = 1;
            if (OQN.LJIIJJI(tuxTextView, list, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        TuxIconView tuxIconView = (TuxIconView) this.LJLILLLLZI.LJLJJLL._$_findCachedViewById(R.id.hvp);
        o.LJIIIIZZ(tuxIconView, "fragment.policies_small_icon");
        OQN.LJIIL(tuxIconView, this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
