package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.brdatagift.api.BaseBemobiResponse;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.OFo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61600OFo implements InterfaceC61605OFt {
    @Override // X.InterfaceC61605OFt
    public final void LIZIZ(BaseBemobiResponse baseBemobiResponse) {
        o.LJIIIZ(baseBemobiResponse, "baseBemobiResponse");
    }

    @Override // X.InterfaceC61605OFt
    public final void LIZJ(BaseBemobiResponse baseBemobiResponse) {
        o.LJIIIZ(baseBemobiResponse, "baseBemobiResponse");
    }

    @Override // X.InterfaceC61605OFt
    public final void onFailed(Exception exc) {
    }

    @Override // X.InterfaceC61605OFt
    public final void LIZ(BaseBemobiResponse baseBemobiResponse) {
        o.LJIIIZ(baseBemobiResponse, "baseBemobiResponse");
        if (C52212KeO.LIZ()) {
            C10K.LIZIZ(new Callable() { // from class: X.6uQ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    FMX.onEventV3("bemobi_show_recharge_dialog");
                    return C76800UCe.LIZ;
                }
            }, C10K.LJI, null);
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                DialogC117534jN dialogC117534jN = new DialogC117534jN(LJIIIIZZ, C61601OFp.LIZJ);
                try {
                    if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/brdatagift/view/BemobiBottomChargeDialog", "show", dialogC117534jN, new Object[0], "void", new C65300Pk0(false, "()V", "-8995349310985164311")).LIZ) {
                        dialogC117534jN.show();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
