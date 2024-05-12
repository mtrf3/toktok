package X;

import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew$initBottomVoiceButtonInsetsAnimation$1$1", f = "AbstractSearchIntermediateFragmentNew.kt", l = {577}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class K4Z extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AbstractSearchIntermediateFragmentNew LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4Z(AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew, InterfaceC67352kd<? super K4Z> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractSearchIntermediateFragmentNew;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new K4Z(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(100L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew = this.LJLILLLLZI;
        C80413VhB c80413VhB = abstractSearchIntermediateFragmentNew.LJZ;
        if (c80413VhB != null) {
            C26338AVi.LJI(c80413VhB, null, null, null, new Integer(AbstractSearchIntermediateFragmentNew.Jl(abstractSearchIntermediateFragmentNew)), false, 23);
        }
        if (AbstractSearchIntermediateFragmentNew.Kl(this.LJLILLLLZI)) {
            C79043V0l.LJJIIZI(this.LJLILLLLZI.LJZ);
            C80413VhB c80413VhB2 = this.LJLILLLLZI.LJZ;
            if (c80413VhB2 != null) {
                c80413VhB2.setAlpha(1.0f);
            }
        } else {
            C79043V0l.LJIIJ(this.LJLILLLLZI.LJZ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
