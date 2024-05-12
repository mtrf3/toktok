package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;

/* renamed from: X.Bxp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30485Bxp implements InterfaceC28986BZe {
    public final /* synthetic */ VideoWidget LIZ;

    @Override // X.InterfaceC28986BZe
    public final LiveDialogFragment LIZIZ() {
        return this.LIZ.bgmDialog;
    }

    @Override // X.InterfaceC28986BZe
    public final FragmentManager getFragmentManager() {
        return this.LIZ.mFragmentManager;
    }

    public C30485Bxp(VideoWidget videoWidget) {
        this.LIZ = videoWidget;
    }

    @Override // X.InterfaceC28986BZe
    public final void LIZ(LiveDialogFragment liveDialogFragment) {
        this.LIZ.bgmDialog = liveDialogFragment;
    }
}
