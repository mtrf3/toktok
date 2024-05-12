package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.policy.PdpPolicyHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPolicy;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.policy.PdpPolicyHolder$onBind$1", f = "PdpPolicyHolder.kt", l = {34}, m = "invokeSuspend")
/* renamed from: X.AfJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26789AfJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpPolicyHolder LJLILLLLZI;
    public final /* synthetic */ C26792AfM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26789AfJ(PdpPolicyHolder pdpPolicyHolder, C26792AfM c26792AfM, InterfaceC67352kd<? super C26789AfJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpPolicyHolder;
        this.LJLJI = c26792AfM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26789AfJ(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            TuxTextView tuxTextView = (TuxTextView) this.LJLILLLLZI.itemView.findViewById(R.id.hvn);
            o.LJIIIIZZ(tuxTextView, "itemView.policies");
            List<ShopPolicy> list = this.LJLJI.LJLIL;
            this.LJLIL = 1;
            if (OQN.LJIIJJI(tuxTextView, list, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
