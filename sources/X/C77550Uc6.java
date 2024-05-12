package X;

import android.content.Context;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;

/* renamed from: X.Uc6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77550Uc6 implements InterfaceC77498UbG {
    public final /* synthetic */ InterfaceC77468Uam LIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJFF;
    public final /* synthetic */ InterfaceC88472Yns<Throwable, C76800UCe> LJI;
    public final /* synthetic */ Context LJII;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJIIIIZZ;
    public final /* synthetic */ int LIZIZ = 1;
    public final /* synthetic */ boolean LIZLLL = true;
    public final /* synthetic */ boolean LJ = false;

    @Override // X.InterfaceC77498UbG
    public final void LIZ(boolean z, boolean z2, TaxDialogParams taxDialogParams, Throwable th) {
        if (z) {
            if (z2) {
                InterfaceC77468Uam interfaceC77468Uam = this.LIZ;
                if (interfaceC77468Uam != null) {
                    interfaceC77468Uam.LIZLLL(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
                }
                this.LJFF.invoke();
            }
        } else {
            InterfaceC77468Uam interfaceC77468Uam2 = this.LIZ;
            if (interfaceC77468Uam2 != null) {
                interfaceC77468Uam2.LIZJ();
            }
            this.LJI.invoke(th);
        }
        if (taxDialogParams != null) {
            WalletExchange.LJLIL.LJJIIZ(this.LJII, null, taxDialogParams);
            this.LJIIIIZZ.invoke();
        }
    }

    public C77550Uc6(long j, Context context, InterfaceC77468Uam interfaceC77468Uam, AqS163S0100000_13 aqS163S0100000_13, AqS163S0100000_13 aqS163S0100000_132, AqS179S0100000_13 aqS179S0100000_13) {
        this.LIZ = interfaceC77468Uam;
        this.LIZJ = j;
        this.LJFF = aqS163S0100000_13;
        this.LJI = aqS179S0100000_13;
        this.LJII = context;
        this.LJIIIIZZ = aqS163S0100000_132;
    }
}
