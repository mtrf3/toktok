package X;

import Y.IDHandlerS21S0100000_8;
import android.os.Message;
import android.util.Pair;
import com.ss.android.ugc.aweme.video.preload.experiment.VideoCoverPreloadConfig;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* renamed from: X.IEz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46297IEz implements IFW {
    public final /* synthetic */ IH1 LIZ;

    @Override // X.IFW
    public final void LIZIZ(SimVideoUrlModel simVideoUrlModel) {
    }

    @Override // X.IFW
    public final void LIZJ(List<SimVideoUrlModel> list) {
    }

    public C46297IEz(IH1 ih1) {
        this.LIZ = ih1;
    }

    @Override // X.IFW
    public final void LIZ(Pair<SimVideoUrlModel, String> pair) {
        String str;
        IDHandlerS21S0100000_8 iDHandlerS21S0100000_8;
        Message obtainMessage;
        SimVideoUrlModel simVideoUrlModel;
        IH1 ih1 = this.LIZ;
        if (pair != null && (simVideoUrlModel = (SimVideoUrlModel) pair.first) != null) {
            str = simVideoUrlModel.getSourceId();
        } else {
            str = null;
        }
        ih1.getClass();
        VideoCoverPreloadConfig videoCoverPreloadConfig = IH1.LJFF;
        if (!videoCoverPreloadConfig.enablePreload || !videoCoverPreloadConfig.preloadWhenPreloadNextVideoDown || str == null || str.length() == 0 || (iDHandlerS21S0100000_8 = ih1.LIZLLL) == null || (obtainMessage = iDHandlerS21S0100000_8.obtainMessage(2, str)) == null) {
            return;
        }
        obtainMessage.sendToTarget();
    }
}
