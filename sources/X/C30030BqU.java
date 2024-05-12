package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BqU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30030BqU {
    public int LIZ;
    public boolean LIZIZ;
    public DataChannel LIZJ;

    public final void LIZ(String str, boolean z) {
        if (this.LIZIZ != z) {
            if (z) {
                this.LIZ = 0;
            } else if (this.LIZ < 0 && LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_comment_slide_up", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                BZI LIZ = C28787BRn.LIZ("livesdk_comment_slide_up");
                LIZ.LJIILLIIL(this.LIZJ);
                LIZ.LJIJJ(((IInteractService) CN1.LIZ(IInteractService.class)).h00(), "comment_slide_up_scene");
                LIZ.LJIJJ(str, "admin_type");
                LIZ.LJIJJ(C28594BKc.LIZJ().LIZLLL(), "enter_live_method");
                LIZ.LJJIIJZLJL();
            }
            this.LIZIZ = z;
        }
    }
}
