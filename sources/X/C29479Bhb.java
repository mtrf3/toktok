package X;

import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog$onViewCreated$3", f = "LiveProfileDialog.kt", l = {345}, m = "invokeSuspend")
/* renamed from: X.Bhb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29479Bhb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LiveProfileDialog LJLILLLLZI;
    public final /* synthetic */ C29471BhT LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29479Bhb(LiveProfileDialog liveProfileDialog, C29471BhT c29471BhT, InterfaceC67352kd<? super C29479Bhb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = liveProfileDialog;
        this.LJLJI = c29471BhT;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29479Bhb(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C29471BhT c29471BhT = this.LJLJI;
            this.LJLIL = 1;
            if (xl.LIZIZ(c29471BhT, 0L, this) == enumC58928NAu) {
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
