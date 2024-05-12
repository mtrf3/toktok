package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationPlayer$showNotificationUsingPlatformApi$1", f = "IMNotificationPlayer.kt", l = {402, 404}, m = "invokeSuspend")
/* renamed from: X.2yM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75862yM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C112444bA LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75862yM(long j, C112444bA c112444bA, InterfaceC67352kd<? super C75862yM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = c112444bA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75862yM(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            if (this.LJLILLLLZI > 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[showNew], delay ");
                LIZ.append(this.LJLILLLLZI);
                LIZ.append(" ms");
                C34B.LJI("IMNotificationPlayer", X1D.LIZIZ(LIZ));
                long j = this.LJLILLLLZI;
                this.LJLIL = 1;
                if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        C112444bA c112444bA = this.LJLJI;
        this.LJLIL = 2;
        if (C112444bA.LIZLLL(c112444bA, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
