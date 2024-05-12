package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.lego.RecUserRequestLegoTask$requestMAF$2", f = "RecUserRequestLegoTask.kt", l = {59, 60}, m = "invokeSuspend")
/* renamed from: X.39z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C794739z extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C68322mC<InterfaceC80643Em> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C794739z(C68322mC<InterfaceC80643Em> c68322mC, InterfaceC67352kd<? super C794739z> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C794739z(this.LJLILLLLZI, interfaceC67352kd);
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
            C3GF imUserService = IMService.createIIMServicebyMonsterPlugin(false).getImUserService();
            this.LJLIL = 1;
            obj = imUserService.LIZJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Number) obj).intValue() < 15) {
            InterfaceC80643Em interfaceC80643Em = this.LJLILLLLZI.element;
            this.LJLIL = 2;
            if (interfaceC80643Em.LLLLLJLJLL(this) == enumC58928NAu) {
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
