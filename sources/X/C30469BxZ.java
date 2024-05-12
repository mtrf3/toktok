package X;

import com.bytedance.android.live.effect.api.FaceDetectEvent;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BxZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30469BxZ implements C0WD {
    public final /* synthetic */ VideoWidget LJLIL;

    public C30469BxZ(VideoWidget videoWidget) {
        this.LJLIL = videoWidget;
    }

    @Override // X.C0WD
    public final void Z00(LiveEffect liveEffect, String str, boolean z) {
        if (C0TY.LIZ.equals(str) && z && liveEffect != null) {
            BZI LIZ = C28787BRn.LIZ("live_take_gesture_select");
            LIZ.LJIILLIIL(this.LJLIL.dataChannel);
            LIZ.LJIIIZ("live_take");
            LIZ.LJIIL("click");
            C30869C9p.LIZ(liveEffect.effectId, LIZ, "gesture_id");
        }
        java.util.Map<String, java.util.Map<String, LiveEffect>> Z5 = C30355Bvj.LIZJ().Z5();
        String str2 = C0TY.LIZIZ;
        if (Z5.containsKey(str2) && Z5.get(str2).size() > 0) {
            this.LJLIL.hasSticker = true;
        } else {
            this.LJLIL.hasSticker = false;
            this.LJLIL.mHandler.removeMessages(101);
            DataChannel dataChannel = this.LJLIL.dataChannel;
            if (dataChannel != null) {
                dataChannel.qv0(FaceDetectEvent.class, Boolean.FALSE);
            }
        }
        this.LJLIL.startOriginImageUpload(z, liveEffect);
    }
}
