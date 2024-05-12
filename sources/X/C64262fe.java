package X;

import android.view.View;
import android.view.ViewConfiguration;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercebase.utils.LifecycleKt$onClick$1$1", f = "Lifecycle.kt", l = {46, 47}, m = "invokeSuspend")
/* renamed from: X.2fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64262fe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> LJLJJL;
    public final /* synthetic */ View LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C64262fe(int i, View view, InterfaceC88473Ynt<? super InterfaceC70422pa, ? super View, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt, View view2, InterfaceC67352kd<? super C64262fe> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = i;
        this.LJLJJI = view;
        this.LJLJJL = interfaceC88473Ynt;
        this.LJLJJLL = view2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C64262fe c64262fe = new C64262fe(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c64262fe.LJLILLLLZI = obj;
        return c64262fe;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC79150V4o LIZLLL;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    this.LJLJJI.setEnabled(true);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LIZLLL = (InterfaceC79150V4o) this.LJLILLLLZI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            LIZLLL = XKX.LIZLLL((InterfaceC70422pa) this.LJLILLLLZI, null, null, new C64252fd(this.LJLJJL, this.LJLJJLL, null), 3);
            long max = Math.max(ViewConfiguration.getDoubleTapTimeout(), this.LJLJI);
            this.LJLILLLLZI = LIZLLL;
            this.LJLIL = 1;
            if (C1JD.LIZJ(max, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (this.LJLJI <= 0) {
            this.LJLILLLLZI = null;
            this.LJLIL = 2;
            if (LIZLLL.LJJJJ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJJI.setEnabled(true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
