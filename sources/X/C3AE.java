package X;

import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl$1", f = "ActivityStatusViewModelImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3AE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ActivityStatusViewModelImpl LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3AE(ActivityStatusViewModelImpl activityStatusViewModelImpl, InterfaceC67352kd<? super C3AE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = activityStatusViewModelImpl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3AE(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLLLLLL.getLifecycle().addObserver(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
