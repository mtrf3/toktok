package X;

import android.text.TextUtils;
import com.bytedance.vcloud.abrmodule.ABRResult;
import com.bytedance.vcloud.abrmodule.DefaultABRModule;
import com.ss.ttm.player.ABRStrategy;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;

/* renamed from: X.IlL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47547IlL extends ABRStrategy {
    public final WeakReference<TTVideoEngineImpl> LIZJ;

    public C47547IlL(TTVideoEngineImpl tTVideoEngineImpl) {
        this.LIZJ = new WeakReference<>(tTVideoEngineImpl);
    }

    @Override // com.ss.ttm.player.ABRStrategy
    public final int probeBitrate(int i) {
        DefaultABRModule defaultABRModule;
        ABRResult predict;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZJ.get();
        if (tTVideoEngineImpl != null && (defaultABRModule = tTVideoEngineImpl.E3) != null && (predict = defaultABRModule.getPredict()) != null && predict.size() > 0) {
            int bitrate = (int) predict.get(0).getBitrate();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[ABR] predict next segment bitrate:");
            LIZ.append(bitrate);
            LIZ.append("bps, this:");
            LIZ.append(tTVideoEngineImpl);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ));
            return bitrate;
        }
        return -1;
    }

    @Override // com.ss.ttm.player.ABRStrategy
    public final String probeBitrate(String str) {
        DefaultABRModule defaultABRModule;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZJ.get();
        if (tTVideoEngineImpl != null && (defaultABRModule = tTVideoEngineImpl.E3) != null) {
            String predictByJsonParams = defaultABRModule.getPredictByJsonParams(str);
            if (!TextUtils.isEmpty(predictByJsonParams)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[ABR] predict next segment result:");
                LIZ.append(predictByJsonParams);
                LIZ.append(", this:");
                LIZ.append(tTVideoEngineImpl);
                TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ));
            }
            return predictByJsonParams;
        }
        return null;
    }
}
