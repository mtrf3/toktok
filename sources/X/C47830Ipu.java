package X;

import com.ss.ttm.player.MaskInfo;
import com.ss.ttvideoengine.TTVideoEngineImpl;

/* renamed from: X.Ipu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47830Ipu extends MaskInfo {
    public final /* synthetic */ TTVideoEngineImpl LIZJ;

    public C47830Ipu(TTVideoEngineImpl tTVideoEngineImpl) {
        this.LIZJ = tTVideoEngineImpl;
    }

    @Override // com.ss.ttm.player.MaskInfo
    public final void onMaskInfoCallback(int i, int i2, String str) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZJ;
        if (tTVideoEngineImpl.LLZLI != null && tTVideoEngineImpl.LIZ(499, tTVideoEngineImpl.n5) > 0) {
            this.LIZJ.LLZLI.LIZJ(i, i2, str);
        }
    }
}
