package X;

import android.view.View;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercebase.utils.LifecycleKt$onClick$1$1$job$1", f = "Lifecycle.kt", l = {45}, m = "invokeSuspend")
/* renamed from: X.2fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64252fd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> LJLJI;
    public final /* synthetic */ View LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C64252fd(InterfaceC88473Ynt<? super InterfaceC70422pa, ? super View, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt, View view, InterfaceC67352kd<? super C64252fd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC88473Ynt;
        this.LJLJJI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C64252fd c64252fd = new C64252fd(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c64252fd.LJLILLLLZI = obj;
        return c64252fd;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            Object obj2 = this.LJLILLLLZI;
            InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88473Ynt = this.LJLJI;
            View it = this.LJLJJI;
            o.LJIIIIZZ(it, "it");
            this.LJLIL = 1;
            if (interfaceC88473Ynt.invoke(obj2, it, this) == enumC58928NAu) {
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
