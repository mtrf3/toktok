package X;

import com.ss.android.ugc.aweme.homepage.landing.ForceBackFYPViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.homepage.landing.ForceBackFYPViewModel$switchFYP$2", f = "ForceBackFYPViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3EG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ForceBackFYPViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3EG(ForceBackFYPViewModel forceBackFYPViewModel, InterfaceC67352kd<? super C3EG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = forceBackFYPViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3EG(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLILLLLZI.Cv0(V3N.LJ(new OSZ("fromStart", "MainFragment")), "For You");
        C221018lt.LJFF("LandingFYP", "switch to fyp!");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
