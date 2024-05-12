package X;

import Y.ARunnableS12S0300000_1;
import android.content.Context;
import com.google.android.material.snackbar.Snackbar;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.utils.SnackBarUtils$showIMSnackbar$2$1", f = "SnackBarUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Zp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111614Zp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Snackbar LJLIL;
    public final /* synthetic */ C111684Zw LJLILLLLZI;
    public final /* synthetic */ C107794Kx LJLJI;
    public final /* synthetic */ Context LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C111614Zp(Snackbar snackbar, C111684Zw c111684Zw, C107794Kx c107794Kx, Context context, InterfaceC67352kd<? super C111614Zp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = snackbar;
        this.LJLILLLLZI = c111684Zw;
        this.LJLJI = c107794Kx;
        this.LJLJJI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C111614Zp(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Snackbar snackbar = this.LJLIL;
        snackbar.getClass();
        C111664Zu LIZIZ = C111664Zu.LIZIZ();
        int LJI = snackbar.LJI();
        C80204Vdo c80204Vdo = snackbar.LJIIL;
        synchronized (LIZIZ.LIZ) {
            if (LIZIZ.LIZJ(c80204Vdo)) {
                C111644Zs c111644Zs = LIZIZ.LIZJ;
                c111644Zs.LIZIZ = LJI;
                LIZIZ.LIZIZ.removeCallbacksAndMessages(c111644Zs);
                LIZIZ.LJFF(LIZIZ.LIZJ);
            } else {
                C111644Zs c111644Zs2 = LIZIZ.LIZLLL;
                if (c111644Zs2 != null && c80204Vdo != null && c111644Zs2.LIZ.get() == c80204Vdo) {
                    LIZIZ.LIZLLL.LIZIZ = LJI;
                } else {
                    LIZIZ.LIZLLL = new C111644Zs(LJI, c80204Vdo);
                }
                C111644Zs c111644Zs3 = LIZIZ.LIZJ;
                if (c111644Zs3 == null || !LIZIZ.LIZ(c111644Zs3, 4)) {
                    LIZIZ.LIZJ = null;
                    C111644Zs c111644Zs4 = LIZIZ.LIZLLL;
                    if (c111644Zs4 != null) {
                        LIZIZ.LIZJ = c111644Zs4;
                        LIZIZ.LIZLLL = null;
                        InterfaceC111654Zt interfaceC111654Zt = c111644Zs4.LIZ.get();
                        if (interfaceC111654Zt != null) {
                            interfaceC111654Zt.show();
                        } else {
                            LIZIZ.LIZJ = null;
                        }
                    }
                }
            }
        }
        C111684Zw c111684Zw = this.LJLILLLLZI;
        c111684Zw.post(new ARunnableS12S0300000_1(this.LJLJI, c111684Zw, this.LJLJJI, 4));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
