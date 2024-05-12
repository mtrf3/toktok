package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.common.utils.LifecycleExtensionsKt$observeOnMainThread$2", f = "LifecycleExtensions.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63172dt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ LiveData<Object> LJLIL;
    public final /* synthetic */ LifecycleOwner LJLILLLLZI;
    public final /* synthetic */ Observer<Object> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63172dt(LiveData<Object> liveData, LifecycleOwner lifecycleOwner, Observer<Object> observer, InterfaceC67352kd<? super C63172dt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = liveData;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = observer;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63172dt(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.observe(this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
