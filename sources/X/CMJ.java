package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDirtyLensDetectionSetting;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CMJ<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ TTLiveBroadcastView LIZ;

    public CMJ(TTLiveBroadcastView tTLiveBroadcastView) {
        this.LIZ = tTLiveBroadcastView;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        this.LIZ.LIZIZ();
        TTLiveBroadcastView tTLiveBroadcastView = this.LIZ;
        tTLiveBroadcastView.getClass();
        if (LiveDirtyLensDetectionSetting.INSTANCE.getENABLED()) {
            Context context = tTLiveBroadcastView.LJLIL;
            o.LJIIIZ(context, "context");
            BZG bzg = new BZG(context, false);
            IRecordingOperationPanel iRecordingOperationPanel = tTLiveBroadcastView.LJLILLLLZI;
            if (iRecordingOperationPanel != null) {
                iRecordingOperationPanel.detectDirtyLens(bzg);
            }
        }
        return C76800UCe.LIZ;
    }
}
