package X;

import android.content.Context;
import com.google.android.material.snackbar.Snackbar;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.utils.SnackBarUtils$showIMSnackbar$2", f = "SnackBarUtils.kt", l = {68, 69}, m = "invokeSuspend")
/* renamed from: X.2kU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67262kU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Snackbar LJLILLLLZI;
    public final /* synthetic */ C111684Zw LJLJI;
    public final /* synthetic */ C107794Kx LJLJJI;
    public final /* synthetic */ Context LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67262kU(Snackbar snackbar, C111684Zw c111684Zw, C107794Kx c107794Kx, Context context, InterfaceC67352kd<? super C67262kU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = snackbar;
        this.LJLJI = c111684Zw;
        this.LJLJJI = c107794Kx;
        this.LJLJJL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67262kU(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = 1;
            if (C1JD.LIZJ(500L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C111614Zp c111614Zp = new C111614Zp(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN, c111614Zp, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
