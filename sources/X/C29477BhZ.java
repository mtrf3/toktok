package X;

import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog$onViewCreated$4", f = "LiveProfileDialog.kt", l = {349}, m = "invokeSuspend")
/* renamed from: X.BhZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29477BhZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LiveProfileDialog LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29477BhZ(LiveProfileDialog liveProfileDialog, InterfaceC67352kd<? super C29477BhZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = liveProfileDialog;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29477BhZ(this.LJLILLLLZI, interfaceC67352kd);
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
            C29465BhN xl = this.LJLILLLLZI.xl();
            this.LJLIL = 1;
            if (xl.LIZJ(this) == enumC58928NAu) {
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
