package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel$scheduleDelayDismiss$job$1$1", f = "FakeMessageViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2nC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68942nC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ FakeMessageViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68942nC(FakeMessageViewModel fakeMessageViewModel, String str, InterfaceC67352kd<? super C68942nC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = fakeMessageViewModel;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68942nC(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC68952nD interfaceC68952nD = this.LJLIL.LJLJJI;
        if (interfaceC68952nD != null) {
            interfaceC68952nD.w(this.LJLILLLLZI, false, true);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
