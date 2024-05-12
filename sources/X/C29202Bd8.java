package X;

import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.live.GoLiveChecker$runCheck$1$canGoLive$1", f = "GoLiveChecker.kt", l = {54}, m = "invokeSuspend")
/* renamed from: X.Bd8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29202Bd8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C29199Bd5 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29202Bd8(C29199Bd5 c29199Bd5, InterfaceC67352kd<? super C29202Bd8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c29199Bd5;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29202Bd8(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C31130CJq LJJI;
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
            C29199Bd5 c29199Bd5 = this.LJLILLLLZI;
            this.LJLIL = 1;
            c29199Bd5.getClass();
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null && (LJJI = LJJJLL.LJJI()) != null) {
                LJJI.LIZJ(new C26722AeE(c84654XKg), "smooth");
            }
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
