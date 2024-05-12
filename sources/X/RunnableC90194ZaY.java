package X;

import com.byted.cast.common.CastLogger;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.Statistics;
import com.byted.cast.sdk.render.video.VideoJitterBuffer;

/* renamed from: X.ZaY, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final /* synthetic */ class RunnableC90194ZaY implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                ((VideoJitterBuffer) this.LJLILLLLZI).lambda$new$0();
                return;
            default:
                C90436ZeS c90436ZeS = (C90436ZeS) this.LJLILLLLZI;
                ICastSource iCastSource = c90436ZeS.LIZIZ;
                if (iCastSource == null) {
                    return;
                }
                Statistics statistics = iCastSource.getStatistics();
                CastLogger castLogger = c90436ZeS.LJFF;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ByteLink getStatistics statistics:");
                LIZ.append(statistics);
                castLogger.d("MirrorController", X1D.LIZIZ(LIZ));
                IMirrorListener iMirrorListener = c90436ZeS.LJIIIZ;
                if (iMirrorListener == null) {
                    return;
                }
                iMirrorListener.onStatistics(statistics);
                return;
        }
    }

    public /* synthetic */ RunnableC90194ZaY(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
