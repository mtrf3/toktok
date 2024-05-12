package X;

import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.VWs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79882VWs implements IProgressListener {
    public final /* synthetic */ LynxAlphaVideo LIZ;

    public C79882VWs(LynxAlphaVideo lynxAlphaVideo) {
        this.LIZ = lynxAlphaVideo;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener
    public final void onProgress(long j) {
        try {
            PlayerController playerController = this.LIZ.LJLIL;
            if (playerController != null) {
                playerController.getDuration();
                LynxAlphaVideo lynxAlphaVideo = this.LIZ;
                if (j < lynxAlphaVideo.LJLLI) {
                    ((ArrayList) lynxAlphaVideo.LJLLLL).clear();
                }
                LynxAlphaVideo lynxAlphaVideo2 = this.LIZ;
                lynxAlphaVideo2.LJLLI = j;
                int size = ((ArrayList) lynxAlphaVideo2.LJLLLL).size();
                if (size < ((ArrayList) this.LIZ.LJLLL).size()) {
                    LynxAlphaVideo lynxAlphaVideo3 = this.LIZ;
                    int intValue = ((Number) ListProtector.get(lynxAlphaVideo3.LJLLL, ((ArrayList) lynxAlphaVideo3.LJLLLL).size())).intValue();
                    if (intValue <= j) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("send trackedMSCount is ");
                        LIZ.append(size);
                        LIZ.append(", trackedMS is ");
                        LIZ.append(intValue);
                        LIZ.append(", progress is ");
                        LIZ.append(j);
                        LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ));
                        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                        javaOnlyMap.putInt("subscribedMillisecond", intValue);
                        LynxAlphaVideo lynxAlphaVideo4 = this.LIZ;
                        lynxAlphaVideo4.getClass();
                        lynxAlphaVideo4.LJJIIJ("update", LynxAlphaVideo.LJJ(1, "", javaOnlyMap));
                        ((ArrayList) this.LIZ.LJLLLL).add(Integer.valueOf(intValue));
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIIZILJ();
            throw null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            LLog.LIZLLL(4, "x-alpha-video", e.toString());
        }
    }
}
