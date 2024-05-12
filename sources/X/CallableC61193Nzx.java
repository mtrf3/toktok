package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.Nzx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC61193Nzx<V> implements Callable {
    public final /* synthetic */ C61191Nzv LJLIL;
    public final /* synthetic */ UpdatePackage LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    public CallableC61193Nzx(C61191Nzv c61191Nzv, UpdatePackage updatePackage, long j, long j2) {
        this.LJLIL = c61191Nzv;
        this.LJLILLLLZI = updatePackage;
        this.LJLJI = j;
        this.LJLJJI = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        JSONObject jSONObject = new JSONObject();
        UpdatePackage updatePackage = this.LJLILLLLZI;
        C61191Nzv c61191Nzv = this.LJLIL;
        long j = this.LJLJI;
        long j2 = this.LJLJJI;
        if (updatePackage == null || (str = updatePackage.getChannel()) == null) {
            str = c61191Nzv.LIZIZ;
        }
        jSONObject.put("channel", str);
        jSONObject.put("totalResources", j);
        jSONObject.put("loadedResources", j2);
        StringBuilder LIZ = X1D.LIZ();
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(jSONObject), JBR.LJFF(LIZ, this.LJLIL.LIZIZ, "_getGeckoUpdateProgress", LIZ)));
        return C76800UCe.LIZ;
    }
}
