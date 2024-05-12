package X;

import com.bytedance.android.livesdk.model.message.BottomMessage;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.broadcast.bgbroadcast.game.GameUiStrategy$updateWarnTips$1$autoDismissJob$1", f = "GameUiStrategy.kt", l = {787}, m = "invokeSuspend")
/* renamed from: X.2H1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2H1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BottomMessage LJLILLLLZI;
    public final /* synthetic */ C37661dq LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2H1(BottomMessage bottomMessage, C37661dq c37661dq, int i, InterfaceC67352kd<? super C2H1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = bottomMessage;
        this.LJLJI = c37661dq;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2H1(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            long j = this.LJLILLLLZI.duration * 1000;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJI.LJFF(false, this.LJLJJI, "", this.LJLILLLLZI.punishInfo);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
