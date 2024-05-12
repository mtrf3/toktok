package X;

import android.app.Activity;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.KNn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class RunnableC51615KNn implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                ((C40624Fwy) this.LJLILLLLZI).LJIJJ = -1L;
                return;
            case 1:
                PortraitAudienceInteractionFragment.sn((PortraitAudienceInteractionFragment) this.LJLILLLLZI);
                return;
            case 2:
                ((C80796VnM) this.LJLILLLLZI).LJJIJIIJI();
                return;
            case 3:
                DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) this.LJLILLLLZI;
                detailFragmentPanel.LLIIIILZ = detailFragmentPanel.LLIIIJ.LIZIZ();
                return;
            case 4:
                WO1.LIZIZ((WO1) this.LJLILLLLZI);
                return;
            case 5:
                ((VideoEditContainerScene) this.LJLILLLLZI).LLFFF = true;
                return;
            case 6:
                VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) this.LJLILLLLZI;
                if (videoRecordNewScene.LLIIJLIL) {
                    videoRecordNewScene.LLIIJLIL = false;
                    H78.LIZ("VideoRecordNewScene => addFragment by postDelay");
                    videoRecordNewScene.LLLJIL();
                    Activity activity = videoRecordNewScene.mActivity;
                    if (activity == null || activity.isFinishing() || !videoRecordNewScene.mArguments.getBoolean("auto_start_recording", false)) {
                        return;
                    }
                    videoRecordNewScene.LLJIJIL.Tf0();
                    return;
                }
                return;
            default:
                DVideoPreloadManager this$0 = (DVideoPreloadManager) this.LJLILLLLZI;
                o.LJIIIZ(this$0, "this$0");
                try {
                    new AqS158S0100000_8(this$0, 701).invoke();
                } catch (Throwable unused) {
                }
                SimRadar.keyScan("CBOF", "cold boot mdl degrade: block task remove", new Object[0]);
                return;
        }
    }

    public /* synthetic */ RunnableC51615KNn(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
