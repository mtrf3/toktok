package X;

import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qnasearch.ui.QnaSearchComponent$observe$7$1", f = "QnaSearchComponent.kt", l = {193, 194}, m = "invokeSuspend")
/* renamed from: X.ECd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36031ECd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C74137T7t LJLILLLLZI;
    public final /* synthetic */ QnaBannerViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36031ECd(C74137T7t c74137T7t, QnaBannerViewModel qnaBannerViewModel, InterfaceC67352kd<? super C36031ECd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c74137T7t;
        this.LJLJI = qnaBannerViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36031ECd(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = 1;
            if (C1JD.LIZJ(175L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C36032ECe c36032ECe = new C36032ECe(this.LJLILLLLZI, this.LJLJI, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN, c36032ECe, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
