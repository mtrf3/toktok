package X;

import androidx.lifecycle.Observer;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.feed.repository.ObservableValue$observe$1", f = "NowFeedRepository.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2j1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66352j1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3KA<Object> LJLIL;
    public final /* synthetic */ Observer<Object> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66352j1(C3KA<Object> c3ka, Observer<Object> observer, InterfaceC67352kd<? super C66352j1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3ka;
        this.LJLILLLLZI = observer;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66352j1(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZ.add(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
