package X;

import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import java.util.List;

/* renamed from: X.UpH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78367UpH implements InterfaceC78385UpZ<AbsIapProduct> {
    public final /* synthetic */ C78348Uoy LIZ;

    public C78367UpH(C78348Uoy c78348Uoy) {
        this.LIZ = c78348Uoy;
    }

    @Override // X.InterfaceC78385UpZ
    public final void LIZ(AbsResult absResult, List<AbsIapProduct> list) {
        InterfaceC78402Upq LIZJ = C78379UpT.LJ().LIZJ();
        C78368UpI LIZ = C78368UpI.LIZ(absResult);
        C78348Uoy c78348Uoy = this.LIZ;
        C78392Upg c78392Upg = (C78392Upg) LIZJ;
        c78392Upg.LJIIIZ(LIZ, c78348Uoy.LIZIZ, list, c78348Uoy.LIZ);
        ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIILJJIL(C78368UpI.LIZ(absResult), this.LIZ.LIZ, list);
    }
}
