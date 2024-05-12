package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.utils.LifecycleExtensionsKt$removeObserverOnMainThread$1", f = "LifecycleExtensions.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68152lv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ LifecycleOwner LJLIL;
    public final /* synthetic */ LifecycleObserver LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68152lv(LifecycleOwner lifecycleOwner, LifecycleObserver lifecycleObserver, InterfaceC67352kd<? super C68152lv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = lifecycleObserver;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68152lv(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Lifecycle lifecycle;
        C141335gf.LIZJ(obj);
        LifecycleOwner lifecycleOwner = this.LJLIL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.LJLILLLLZI);
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
