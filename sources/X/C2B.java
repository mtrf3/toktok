package X;

import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.performance.LiveVideoFrameListenerSettings;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes6.dex */
public final class C2B implements InterfaceC30498By2 {
    public final /* synthetic */ TryModeBroadcastFragment LIZ;

    public C2B(TryModeBroadcastFragment tryModeBroadcastFragment) {
        this.LIZ = tryModeBroadcastFragment;
    }

    @Override // X.InterfaceC30498By2
    public final void LIZ(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        if (LiveVideoFrameListenerSettings.INSTANCE.autoRemoveFrameListener()) {
            this.LIZ.Tl(true);
            return;
        }
        this.LIZ.Tl(false);
        CKO cko = this.LIZ.LL;
        if (cko == null) {
            return;
        }
        cko.LJJIJIIJIL(i, i3, i4, j);
    }
}
