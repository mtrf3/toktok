package X;

import com.lynx.tasm.base.LLog;
import com.lynx.tasm.core.ExternalSourceLoader;
import com.lynx.tasm.core.JSProxy;

/* loaded from: classes15.dex */
public final class VEJ extends QXX {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ExternalSourceLoader LJLJI;

    @Override // X.QXX
    public final void LLLILZJ(VEH<byte[]> veh) {
        boolean z;
        if (veh.LIZJ != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LLog.LIZLLL(2, "ExternalSourceLoader", "loadExternalSourceAsync onSuccess.");
            byte[] bArr = veh.LIZJ;
            if (bArr == null || bArr.length == 0) {
                ExternalSourceLoader externalSourceLoader = this.LJLJI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ExternalSourceLoader loadExternalSourceAsync failed, url: ");
                LIZ.append(this.LJLIL);
                LIZ.append(" error: get null data for provider");
                externalSourceLoader.LIZIZ(1701, X1D.LIZIZ(LIZ));
                return;
            }
            JSProxy jSProxy = this.LJLJI.LJ.get();
            if (jSProxy != null) {
                jSProxy.LJ(this.LJLILLLLZI, this.LJLIL, bArr);
                return;
            }
            return;
        }
        ExternalSourceLoader externalSourceLoader2 = this.LJLJI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ExternalSourceLoader loadExternalSourceAsync request failed, url: ");
        LIZ2.append(this.LJLIL);
        LIZ2.append(" error: ");
        LIZ2.append(veh.LIZ);
        externalSourceLoader2.LIZIZ(1701, X1D.LIZIZ(LIZ2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VEJ(int i, ExternalSourceLoader externalSourceLoader, String str) {
        super((Object) null);
        this.LJLJI = externalSourceLoader;
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}
