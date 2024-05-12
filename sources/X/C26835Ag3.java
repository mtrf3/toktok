package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpSelectViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.SpecificationsFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpSelectViewHolder$onBind$1$1$1", f = "PdpSelectViewHolder.kt", l = {55}, m = "invokeSuspend")
/* renamed from: X.Ag3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26835Ag3 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpSelectViewHolder LJLILLLLZI;
    public final /* synthetic */ InterfaceC26837Ag5 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26835Ag3(PdpSelectViewHolder pdpSelectViewHolder, InterfaceC26837Ag5 interfaceC26837Ag5, InterfaceC67352kd<? super C26835Ag3> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = pdpSelectViewHolder;
        this.LJLJI = interfaceC26837Ag5;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26835Ag3(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        FragmentManager fragmentManager;
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
            Fragment fragment = this.LJLILLLLZI.LJLIL;
            if (fragment != null) {
                fragmentManager = fragment.getFragmentManager();
            } else {
                fragmentManager = null;
            }
            this.LJLJI.getClass();
            this.LJLILLLLZI.getViewModel();
            this.LJLILLLLZI.getViewModel();
            this.LJLIL = 1;
            if (fragmentManager == null) {
                if (C76800UCe.LIZ == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                SpecificationsFragment.LJLILLLLZI = new C84654XKg(C78555UsJ.LJJII(this));
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
