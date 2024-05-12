package X;

import com.google.gson.j;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModelV2$2$1$1", f = "CaptionViewModelV2.kt", l = {84}, m = "invokeSuspend")
/* renamed from: X.2vL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73992vL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C77090UNi LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73992vL(String str, C77090UNi c77090UNi, InterfaceC67352kd<? super C73992vL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = c77090UNi;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C73992vL(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                j LJJIJ = C38393F4z.LJ(this.LJLILLLLZI).LJJIJ("ts");
                if (LJJIJ != null) {
                    AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                    C792339b c792339b = new C792339b(this.LJLJI, LJJIJ, null);
                    this.LJLIL = 1;
                    if (XKX.LJI(abstractC78621UtN, c792339b, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
        } catch (Exception e) {
            C0NB.LIZIZ("CaptionViewModel", e.toString());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
