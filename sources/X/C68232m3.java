package X;

import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.PausingDispatcherKt;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.feed.platform.panel.RootPanelComponentExtKt$launchOnViewCreated$1", f = "RootPanelComponentExt.kt", l = {428}, m = "invokeSuspend")
/* renamed from: X.2m3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68232m3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C8W0 LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C68232m3(C8W0 c8w0, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C68232m3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c8w0;
        this.LJLJI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68232m3(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            LifecycleRegistry lifecycle = this.LJLILLLLZI.getLifecycle();
            InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88471Ynr = this.LJLJI;
            this.LJLIL = 1;
            if (PausingDispatcherKt.whenCreated(lifecycle, interfaceC88471Ynr, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
