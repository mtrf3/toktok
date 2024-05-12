package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.userright.PdpUserRightHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.userright.PdpUserRightHolder$onClick$1$1", f = "PdpUserRightHolder.kt", l = {363}, m = "invokeSuspend")
/* renamed from: X.AdV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26677AdV extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpUserRightHolder LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26677AdV(PdpUserRightHolder pdpUserRightHolder, String str, InterfaceC67352kd<? super C26677AdV> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = pdpUserRightHolder;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26677AdV(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            C27066Ajm c27066Ajm = UserRightFragment.Companion;
            FragmentManager fragmentManager = this.LJLILLLLZI.LJLIL.getFragmentManager();
            UserRight userRight = ((C26678AdW) this.LJLILLLLZI.getItem()).LJLIL;
            String str = ((C26678AdW) this.LJLILLLLZI.getItem()).LJLIL.name;
            String str2 = this.LJLJI;
            this.LJLIL = 1;
            if (C27066Ajm.LIZIZ(c27066Ajm, fragmentManager, userRight, str, str2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
