package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* renamed from: X.Ezr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38255Ezr implements InterfaceC37745Erd {
    public final /* synthetic */ C38253Ezp LIZ;
    public final /* synthetic */ C60737Nsb LIZIZ;
    public final /* synthetic */ CompletionBlock LIZJ;

    public C38255Ezr(C38253Ezp c38253Ezp, C60737Nsb c60737Nsb, C37356ElM c37356ElM) {
        this.LIZ = c38253Ezp;
        this.LIZIZ = c60737Nsb;
        this.LIZJ = c37356ElM;
    }

    @Override // X.InterfaceC37745Erd
    public final void LIZ(Integer num, String str, Throwable th, java.util.Map map) {
        String str2;
        C37905EuD LIZJ;
        C37904EuC c37904EuC;
        InterfaceC37958Ev4 interfaceC37958Ev4;
        String str3;
        String str4;
        C37905EuD LIZJ2;
        C37904EuC c37904EuC2;
        InterfaceC37958Ev4 interfaceC37958Ev42;
        if (num != null) {
            C60737Nsb c60737Nsb = this.LIZIZ;
            InterfaceC38263Ezz interfaceC38263Ezz = this.LIZ.LJLIL;
            if (interfaceC38263Ezz != null && (LIZJ2 = interfaceC38263Ezz.LIZJ()) != null && (c37904EuC2 = LIZJ2.LIZ.LIZ) != null && (interfaceC37958Ev42 = c37904EuC2.LIZLLL) != null) {
                str3 = interfaceC37958Ev42.getUrl();
            } else {
                str3 = null;
            }
            C38097ExJ.LIZJ(c60737Nsb, str3, 0, null, num);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("errorCode: ");
            LIZ.append(num);
            LIZ.append(", errorMsg: ");
            if (th != null) {
                str4 = th.getMessage();
            } else {
                str4 = null;
            }
            String LIZIZ = C025908h.LIZIZ(LIZ, str4, ", ", str, LIZ);
            CompletionBlock completionBlock = this.LIZJ;
            XBaseModel LIZJ3 = ED5.LIZJ(InterfaceC38256Ezs.class, null);
            InterfaceC38256Ezs interfaceC38256Ezs = (InterfaceC38256Ezs) LIZJ3;
            interfaceC38256Ezs.setState(0);
            interfaceC38256Ezs.setResult(map);
            completionBlock.onFailure(0, LIZIZ, (XBaseResultModel) LIZJ3);
            return;
        }
        C60737Nsb c60737Nsb2 = this.LIZIZ;
        InterfaceC38263Ezz interfaceC38263Ezz2 = this.LIZ.LJLIL;
        if (interfaceC38263Ezz2 != null && (LIZJ = interfaceC38263Ezz2.LIZJ()) != null && (c37904EuC = LIZJ.LIZ.LIZ) != null && (interfaceC37958Ev4 = c37904EuC.LIZLLL) != null) {
            str2 = interfaceC37958Ev4.getUrl();
        } else {
            str2 = null;
        }
        C38097ExJ.LIZJ(c60737Nsb2, str2, 1, null, null);
        CompletionBlock completionBlock2 = this.LIZJ;
        XBaseModel LIZJ4 = ED5.LIZJ(InterfaceC38256Ezs.class, null);
        InterfaceC38256Ezs interfaceC38256Ezs2 = (InterfaceC38256Ezs) LIZJ4;
        interfaceC38256Ezs2.setState(1);
        interfaceC38256Ezs2.setResult(map);
        completionBlock2.onSuccess((XBaseResultModel) LIZJ4, "");
    }
}
