package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;

/* renamed from: X.F8t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnCancelListenerC38491F8t implements DialogInterface.OnCancelListener {
    public final /* synthetic */ LiveReplayVideoClipActivity LJLIL;
    public final /* synthetic */ OSZ<Long, Long> LJLILLLLZI;

    public DialogInterfaceOnCancelListenerC38491F8t(LiveReplayVideoClipActivity liveReplayVideoClipActivity, OSZ<Long, Long> osz) {
        this.LJLIL = liveReplayVideoClipActivity;
        this.LJLILLLLZI = osz;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.LJLIL.LLIIIJ(this.LJLILLLLZI.getSecond().longValue() - this.LJLILLLLZI.getFirst().longValue());
    }
}
