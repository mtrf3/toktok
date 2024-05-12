package X;

import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.performance.LiveVideoFrameListenerSettings;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes6.dex */
public final class C2C implements InterfaceC30498By2 {
    public final /* synthetic */ LiveBroadcastFragment LIZ;

    public C2C(LiveBroadcastFragment liveBroadcastFragment) {
        this.LIZ = liveBroadcastFragment;
    }

    @Override // X.InterfaceC30498By2
    public final void LIZ(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        if (LiveVideoFrameListenerSettings.INSTANCE.autoRemoveFrameListener()) {
            this.LIZ.nm(true);
            return;
        }
        this.LIZ.nm(false);
        CKO cko = this.LIZ.LLIIIL;
        if (cko == null) {
            return;
        }
        cko.LJJIJIIJIL(i, i3, i4, j);
    }
}
