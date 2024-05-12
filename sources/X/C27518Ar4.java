package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.view.PdpSelectItemView$bindRelateProducts$1", f = "PdpSelectItemView.kt", l = {151}, m = "invokeSuspend")
/* renamed from: X.Ar4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27518Ar4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C27517Ar3 LJLILLLLZI;
    public final /* synthetic */ List<RelateProduct> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<View, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27518Ar4(C27517Ar3 c27517Ar3, List<RelateProduct> list, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C27518Ar4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c27517Ar3;
        this.LJLJI = list;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27518Ar4(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            View select_item_relate_products = this.LJLILLLLZI._$_findCachedViewById(R.id.jlj);
            o.LJIIIIZZ(select_item_relate_products, "select_item_relate_products");
            this.LJLIL = 1;
            if (OUP.LJJIJLIJ(select_item_relate_products, this, true) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C119774mz flow = (C119774mz) this.LJLILLLLZI._$_findCachedViewById(R.id.jlj);
        int i2 = (int) ((C27517Ar3.LJLILLLLZI - (C27162AlK.LJIIIZ * 3)) / 4);
        o.LJIIIIZZ(flow, "flow");
        C78977Uz7.LJJIIJZLJL(flow, this.LJLJI, new AqS94S0101000_4(flow, i2, 19), C27519Ar5.INSTANCE);
        InterfaceC88472Yns<View, C76800UCe> interfaceC88472Yns = this.LJLJJI;
        if (interfaceC88472Yns != null) {
            C16880lQ.LJIIJ(new Au2S15S0100000_4(interfaceC88472Yns, 97, 42), flow);
        }
        return C76800UCe.LIZ;
    }
}
