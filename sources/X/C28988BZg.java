package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.layer.VoiceChatWidget;

/* renamed from: X.BZg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28988BZg implements InterfaceC28986BZe {
    public final /* synthetic */ VoiceChatWidget LIZ;

    @Override // X.InterfaceC28986BZe
    public final LiveDialogFragment LIZIZ() {
        return this.LIZ.LJLJL;
    }

    @Override // X.InterfaceC28986BZe
    public final FragmentManager getFragmentManager() {
        return this.LIZ.LJLJI;
    }

    public C28988BZg(VoiceChatWidget voiceChatWidget) {
        this.LIZ = voiceChatWidget;
    }

    @Override // X.InterfaceC28986BZe
    public final void LIZ(LiveDialogFragment liveDialogFragment) {
        this.LIZ.LJLJL = liveDialogFragment;
    }
}
