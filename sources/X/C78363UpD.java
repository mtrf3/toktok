package X;

import android.text.TextUtils;
import com.bytedance.globalpayment.iap.model.AbsResult;
import defpackage.b1;
import java.util.List;

/* renamed from: X.UpD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78363UpD implements InterfaceC78399Upn {
    public final /* synthetic */ InterfaceC78385UpZ LIZ;
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ java.util.Map LIZJ;
    public final /* synthetic */ C78345Uov LIZLLL;

    @Override // X.InterfaceC78399Upn
    public final void LIZ(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            b1.LIZLLL();
            InterfaceC78385UpZ interfaceC78385UpZ = this.LIZ;
            AbsResult absResult = new AbsResult();
            absResult.withErrorCode(1);
            absResult.withMessage("mark_place is empty,can not build iapProduct list");
            interfaceC78385UpZ.LIZ(absResult, this.LIZIZ);
            return;
        }
        try {
            this.LIZLLL.LIZIZ(new C78364UpE(this));
        } catch (Throwable th) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error when build iapProductList:");
            LIZ.append(th.getMessage());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            InterfaceC78385UpZ interfaceC78385UpZ2 = this.LIZ;
            AbsResult absResult2 = new AbsResult();
            absResult2.withErrorCode(1);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("error when build iapProductList:");
            LIZ2.append(th.getMessage());
            absResult2.withMessage(X1D.LIZIZ(LIZ2));
            interfaceC78385UpZ2.LIZ(absResult2, this.LIZIZ);
        }
    }

    public C78363UpD(C78345Uov c78345Uov, InterfaceC78385UpZ interfaceC78385UpZ, List list, java.util.Map map) {
        this.LIZLLL = c78345Uov;
        this.LIZ = interfaceC78385UpZ;
        this.LIZIZ = list;
        this.LIZJ = map;
    }
}
