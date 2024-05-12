package X;

import fjb.a;
import kotlin.jvm.internal.AqS175S0100000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.notification.view.BottomNotificationObserver$requirePermissionPopUp$1", f = "BottomNotificationObserver.kt", l = {299}, m = "invokeSuspend")
/* renamed from: X.2q7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70752q7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ViewOnClickListenerC54142LMs LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70752q7(ViewOnClickListenerC54142LMs viewOnClickListenerC54142LMs, InterfaceC67352kd<? super C70752q7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = viewOnClickListenerC54142LMs;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C70752q7 c70752q7 = new C70752q7(this.LJLJI, interfaceC67352kd);
        c70752q7.LJLILLLLZI = obj;
        return c70752q7;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3C3 LIZJ;
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
            InterfaceC70542pm LJJII = C78609UtB.LJJII(this.LJLJI.LJLIL, new AqS175S0100000_9((InterfaceC70422pa) this.LJLILLLLZI, 454));
            if (LJJII != null && (LIZJ = ((C77202URq) LJJII).LIZJ()) != null) {
                this.LJLIL = 1;
                if (V1M.LJII(LIZJ, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
