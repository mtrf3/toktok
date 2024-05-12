package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DMNavArg;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DMNavHelper$startNav$1", f = "DMNavHelper.kt", l = {51}, m = "invokeSuspend")
/* renamed from: X.3tx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98613tx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DMNavArg LJLILLLLZI;
    public final /* synthetic */ C98603tw LJLJI;
    public final /* synthetic */ Activity LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C98613tx(DMNavArg dMNavArg, C98603tw c98603tw, Activity activity, InterfaceC67352kd<? super C98613tx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = dMNavArg;
        this.LJLJI = c98603tw;
        this.LJLJJI = activity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C98613tx(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C63120Opw LJII = C4WC.LIZIZ.LJII(this.LJLILLLLZI.getConversationId());
            XIF xif = EXV.LIZ;
            C98623ty c98623ty = new C98623ty(LJII, this.LJLJI, this.LJLJJI, this.LJLILLLLZI, null);
            this.LJLIL = 1;
            if (XKX.LJI(xif, c98623ty, this) == enumC58928NAu) {
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
