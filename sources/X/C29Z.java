package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {232}, m = "invokeSuspend")
/* renamed from: X.29Z, reason: invalid class name */
/* loaded from: classes.dex */
public final class C29Z extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C36001bA LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29Z(C36001bA c36001bA, View view, InterfaceC67352kd<? super C29Z> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c36001bA;
        this.LJLJI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29Z(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                C36001bA c36001bA = this.LJLILLLLZI;
                this.LJLIL = 1;
                Object LJIILJJIL = V1M.LJIILJJIL(c36001bA.LJIILLIIL, new C2GV(null), this);
                if (LJIILJJIL != obj2) {
                    LJIILJJIL = C76800UCe.LIZ;
                }
                if (LJIILJJIL == obj2) {
                    return obj2;
                }
            }
            return C76800UCe.LIZ;
        } finally {
            if (C05M.LIZIZ(this.LJLJI) == this.LJLILLLLZI) {
                View view = this.LJLJI;
                o.LJIIIZ(view, "<this>");
                view.setTag(R.id.a4z, null);
            }
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
