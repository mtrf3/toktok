package X;

import android.content.Context;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssemVM;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.IDqS8S1000000_31;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssemVM$requestRegisterInfo$2$2", f = "LandingAssemVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLx, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93133aLx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ LandingAssemVM LJLIL;
    public final /* synthetic */ Exception LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93133aLx(LandingAssemVM landingAssemVM, Exception exc, InterfaceC67352kd<? super C93133aLx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = landingAssemVM;
        this.LJLILLLLZI = exc;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93133aLx(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C141335gf.LIZJ(obj);
        LandingAssemVM landingAssemVM = this.LJLIL;
        Context LIZIZ = EF7.LIZIZ();
        if (this.LJLILLLLZI instanceof C64698PaI) {
            i = R.string.f3i;
        } else {
            i = R.string.f3g;
        }
        String string = LIZIZ.getString(i);
        landingAssemVM.getClass();
        landingAssemVM.setState(new IDqS8S1000000_31(string, 4));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
