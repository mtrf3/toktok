package X;

import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.performance.LiveVideoFrameListenerSettings;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes6.dex */
public final class C2D implements InterfaceC30498By2 {
    public final /* synthetic */ VoiceChatBroadcastFragment LIZ;

    public C2D(VoiceChatBroadcastFragment voiceChatBroadcastFragment) {
        this.LIZ = voiceChatBroadcastFragment;
    }

    @Override // X.InterfaceC30498By2
    public final void LIZ(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        if (LiveVideoFrameListenerSettings.INSTANCE.autoRemoveFrameListener()) {
            this.LIZ.fm(true);
            return;
        }
        this.LIZ.fm(false);
        CKO cko = this.LIZ.LJLLLL;
        if (cko == null) {
            return;
        }
        cko.LJJIJIIJIL(i, i3, i4, j);
    }
}
