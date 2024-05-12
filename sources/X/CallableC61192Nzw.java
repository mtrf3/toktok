package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.Nzw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC61192Nzw<V> implements Callable {
    public final /* synthetic */ C61191Nzv LJLIL;
    public final /* synthetic */ UpdatePackage LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ Throwable LJLJJI;

    public CallableC61192Nzw(C61191Nzv c61191Nzv, UpdatePackage updatePackage, boolean z, Throwable th) {
        this.LJLIL = c61191Nzv;
        this.LJLILLLLZI = updatePackage;
        this.LJLJI = z;
        this.LJLJJI = th;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        UpdatePackage updatePackage = this.LJLILLLLZI;
        C61191Nzv c61191Nzv = this.LJLIL;
        boolean z = this.LJLJI;
        Throwable th = this.LJLJJI;
        if (updatePackage == null || (str = updatePackage.getChannel()) == null) {
            str = c61191Nzv.LIZIZ;
        }
        jSONObject.put("channel", str);
        jSONObject.put("failed", z);
        if (th == null || (str2 = th.getMessage()) == null) {
            str2 = "";
        }
        jSONObject.put("failedMsg", str2);
        StringBuilder LIZ = X1D.LIZ();
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(jSONObject), JBR.LJFF(LIZ, this.LJLIL.LIZIZ, "_getGeckoUpdateResult", LIZ)));
        return C76800UCe.LIZ;
    }
}
