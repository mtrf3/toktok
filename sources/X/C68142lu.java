package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore$removeLifecycleObserver$2", f = "TrackNodeStore.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68142lu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ LifecycleOwner LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68142lu(LifecycleOwner lifecycleOwner, InterfaceC67352kd<? super C68142lu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = lifecycleOwner;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68142lu(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        TrackNodeStore.LIZIZ.remove(this.LJLIL);
        this.LJLIL.getLifecycle().removeObserver(TrackNodeStore.LIZJ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
