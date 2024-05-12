package X;

import com.lynx.tasm.base.LLog;

/* renamed from: X.VEa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79396VEa implements InterfaceC79397VEb {
    public final InterfaceC79397VEb LIZ;

    public C79396VEa() {
        try {
            this.LIZ = (InterfaceC79397VEb) Class.forName("com.bytedance.lynx.service.impl.FluencyFactoryImpl").newInstance();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("create factory failed! ");
            LIZ.append(e.getMessage());
            LLog.LIZLLL(4, "LynxFluency", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC79397VEb
    public final void LIZIZ(C79403VEh c79403VEh, String str) {
        InterfaceC79397VEb interfaceC79397VEb = this.LIZ;
        if (interfaceC79397VEb == null) {
            return;
        }
        interfaceC79397VEb.LIZIZ(c79403VEh, str);
    }
}
