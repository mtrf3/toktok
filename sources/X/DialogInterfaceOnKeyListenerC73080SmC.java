package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.SmC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogInterfaceOnKeyListenerC73080SmC implements DialogInterface.OnKeyListener {
    public final /* synthetic */ LiveReplayVideoPlayerDialogFragment LJLIL;

    public DialogInterfaceOnKeyListenerC73080SmC(LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment) {
        this.LJLIL = liveReplayVideoPlayerDialogFragment;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        if (4 == i && 1 == event.getAction()) {
            this.LJLIL.onBackPressed();
            return true;
        }
        return false;
    }
}
