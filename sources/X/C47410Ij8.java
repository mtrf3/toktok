package X;

import org.json.JSONObject;

/* renamed from: X.Ij8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47410Ij8 extends AbstractC73391SrD<C47411Ij9> {
    public final /* synthetic */ InterfaceC47416IjE LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        IXB.LIZ("ttnet doTask startTask onComplete");
    }

    public C47410Ij8(InterfaceC47416IjE interfaceC47416IjE) {
        this.LJLILLLLZI = interfaceC47416IjE;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        IXB.LJ("ttnet doTask startTask onError", th);
        this.LJLILLLLZI.LIZ(null, new C47419IjH(-1, "", th));
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        String str;
        C47411Ij9 c47411Ij9 = (C47411Ij9) obj;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ttnet doTask startTask onNext:");
            JSONObject jSONObject = c47411Ij9.LIZ;
            if (jSONObject != null) {
                str = jSONObject.toString();
            } else {
                str = "json null.";
            }
            LIZ.append(str);
            IXB.LIZ(X1D.LIZIZ(LIZ));
        }
        if (c47411Ij9.LIZIZ == null) {
            this.LJLILLLLZI.LIZ(c47411Ij9.LIZ, null);
        } else {
            this.LJLILLLLZI.LIZ(c47411Ij9.LIZ, new C47419IjH(c47411Ij9.LIZJ, "", c47411Ij9.LIZIZ));
        }
    }
}
