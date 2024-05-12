package X;

import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.broadcast.bgbroadcast.game.GameUiStrategy$onPerceptionMessage$autoDismissJob$1", f = "GameUiStrategy.kt", l = {875}, m = "invokeSuspend")
/* renamed from: X.2Gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55812Gz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C37661dq LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ PerceptionMessage LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55812Gz(C37661dq c37661dq, C76732zl c76732zl, PerceptionMessage perceptionMessage, InterfaceC67352kd<? super C55812Gz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c37661dq;
        this.LJLJI = c76732zl;
        this.LJLJJI = perceptionMessage;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55812Gz(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            if (C1JD.LIZJ(180000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.LJFF(false, this.LJLJI.element, "", this.LJLJJI.publicEventInfo);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
