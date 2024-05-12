package X;

import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.common.popcard.view.HorizontalPopCardViewV0$loadCoverImage$1", f = "HorizontalPopCardViewV0.kt", l = {457}, m = "invokeSuspend")
/* renamed from: X.RyB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71275RyB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC43919HLn<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ S2L LJLJI;
    public final /* synthetic */ PopupCardVO LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71275RyB(InterfaceC43919HLn<C76800UCe> interfaceC43919HLn, S2L s2l, PopupCardVO popupCardVO, boolean z, String str, InterfaceC67352kd<? super C71275RyB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC43919HLn;
        this.LJLJI = s2l;
        this.LJLJJI = popupCardVO;
        this.LJLJJL = z;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71275RyB(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
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
            InterfaceC43919HLn<C76800UCe> interfaceC43919HLn = this.LJLILLLLZI;
            if (interfaceC43919HLn != null) {
                this.LJLIL = 1;
                if (interfaceC43919HLn.LJI(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        this.LJLJI.LJJZ(this.LJLJJI, this.LJLJJL, this.LJLJJLL, false);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
