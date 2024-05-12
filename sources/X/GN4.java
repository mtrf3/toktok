package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$initData$1", f = "DraftFragment.kt", l = {531, 537}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GN4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ DraftFragment LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GN4(DraftFragment draftFragment, InterfaceC67352kd<? super GN4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = draftFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GN4 gn4 = new GN4(this.LJLJI, interfaceC67352kd);
        gn4.LJLILLLLZI = obj;
        return gn4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            DraftViewModel Dl = this.LJLJI.Dl();
            Dl.getClass();
            int LIZLLL = GPD.LIZLLL(new GPG(null, null, null, false, Dl.jv0(), null, 47));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Dl.LJLIL);
            LIZ.append(" getTotalPage: ");
            LIZ.append(LIZLLL);
            H78.LIZJ(X1D.LIZIZ(LIZ));
            Dl.LJLLJ = LIZLLL;
            int i3 = Dl.LJLLILLLL;
            int i4 = LIZLLL / i3;
            if (LIZLLL % i3 == 0) {
                i = 0;
            } else {
                i = 1;
            }
            Dl.LJLLI = i4 + i;
            if (C26223AQx.LIZ()) {
                XKX.LIZIZ(interfaceC70422pa, null, null, new GM5(this.LJLJI, null), 3);
                if (this.LJLJI.Dl().LJLLJ == 0) {
                    AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                    GN1 gn1 = new GN1(this.LJLJI, null);
                    this.LJLIL = 1;
                    if (XKX.LJI(abstractC78621UtN, gn1, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
        }
        DraftFragment draftFragment = this.LJLJI;
        Context context = draftFragment.getContext();
        this.LJLIL = 2;
        if (draftFragment.Nl(context, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
