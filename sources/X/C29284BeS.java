package X;

import com.bytedance.android.live.effect.api.IEffectService;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.broadcast.guide.GuidanceViewModel$tryDownloadEffect$1", f = "GuidanceViewModel.kt", l = {548}, m = "invokeSuspend")
/* renamed from: X.BeS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29284BeS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C29285BeT LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29284BeS(C29285BeT c29285BeT, InterfaceC67352kd<? super C29284BeS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c29285BeT;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29284BeS(this.LJLILLLLZI, interfaceC67352kd);
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
            C0WL liveEffectController = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveEffectController();
            C29285BeT c29285BeT = this.LJLILLLLZI;
            String str = c29285BeT.LJLILLLLZI;
            String str2 = c29285BeT.LJLIL;
            String str3 = c29285BeT.LJLJI;
            this.LJLIL = 1;
            if (liveEffectController.LIZLLL(str, str2, str3, this) == enumC58928NAu) {
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
