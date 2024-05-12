package X;

import com.bytedance.android.livesdk.firstrecharge.FirstChargeData;
import kotlin.jvm.internal.o;

/* renamed from: X.Clc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32276Clc implements InterfaceC77677Ue9 {
    public final /* synthetic */ C32313CmD LIZ;

    public C32276Clc(C32313CmD c32313CmD) {
        this.LIZ = c32313CmD;
    }

    @Override // X.InterfaceC77677Ue9
    public final void LIZ(FirstChargeData firstChargeData) {
        String str = this.LIZ.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRechargeInfoLoad(");
        this.LIZ.getClass();
        LIZ.append(C32313CmD.LJIILL(firstChargeData));
        LIZ.append(')');
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
        this.LIZ.LIZLLL = firstChargeData;
        boolean z = false;
        if (o.LJ(InterfaceC30442Bx8.O1.LIZ(), Boolean.TRUE) && firstChargeData != null && !firstChargeData.isFirstCharge) {
            C32282Cli.LIZLLL = Boolean.FALSE;
            C32282Cli.LJII = true;
            InterfaceC32301Cm1 interfaceC32301Cm1 = C32282Cli.LJ;
            if (interfaceC32301Cm1 != null) {
                interfaceC32301Cm1.LIZJ();
            }
            C0NB.LJIIIZ("LiveFastFirstRechargeHolder", " update first charge success");
        }
        if (firstChargeData != null) {
            z = firstChargeData.isFirstCharge;
        }
        Boolean valueOf = Boolean.valueOf(z);
        C32282Cli.LIZLLL = valueOf;
        C32282Cli.LIZ(valueOf, C32282Cli.LIZIZ, C32282Cli.LIZ, C32282Cli.LIZJ);
    }

    @Override // X.InterfaceC77677Ue9
    public final void LIZIZ(FirstChargeData firstChargeData) {
        String str = this.LIZ.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRechargePaySuccess(");
        this.LIZ.getClass();
        LIZ.append(C32313CmD.LJIILL(firstChargeData));
        LIZ.append(')');
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
    }
}
