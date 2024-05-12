package X;

import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.dialog.FriendsDialogScene$checkAuthFlow$2", f = "FriendsDialogScene.kt", l = {269}, m = "invokeSuspend")
/* renamed from: X.LMr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54141LMr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;

    public C54141LMr(InterfaceC67352kd<? super C54141LMr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54141LMr c54141LMr = new C54141LMr(interfaceC67352kd);
        c54141LMr.LJLILLLLZI = obj;
        return c54141LMr;
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
            Object obj2 = this.LJLILLLLZI;
            XJO xjo = C54137LMn.LJLJI;
            this.LJLIL = 1;
            if (xjo.LIZ(obj2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C54137LMn c54137LMn = C54137LMn.LJLIL;
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        UQF LJJIJIIJIL = c77266UUc.LJJIJIIJIL(3, false);
        if (LJJIJIIJIL.LJLIL || LJJIJIIJIL.LJLILLLLZI) {
            String LIZLLL = c54137LMn.LIZLLL();
            UQF LJJIJIIJIL2 = c77266UUc.LJJIJIIJIL(3, false);
            ActivityC45651qj LIZLLL2 = StateOwner.LJLIL.LIZLLL();
            o.LJII(LIZLLL2, "null cannot be cast to non-null type android.content.Context");
            C54149LMz.LIZ(c77266UUc, LJJIJIIJIL2, LIZLLL, LIZLLL2, c54137LMn, 16);
        } else {
            C54137LMn.LJLJI.LIZIZ(null);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
