package X;

import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS167S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel$getSelfInfo$1$5", f = "ProfilePlatformViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.39A, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39A extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ProfilePlatformViewModel LJLIL;
    public final /* synthetic */ Exception LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39A(ProfilePlatformViewModel profilePlatformViewModel, Exception exc, InterfaceC67352kd<? super C39A> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = profilePlatformViewModel;
        this.LJLILLLLZI = exc;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C39A(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.setState(new AqS167S0100000_1(this.LJLILLLLZI, 485));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
