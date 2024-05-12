package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;
import kotlin.jvm.internal.AqS35S1000000_12;

/* renamed from: X.Skn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogInterfaceOnCancelListenerC72993Skn implements DialogInterface.OnCancelListener {
    public final /* synthetic */ LiveReplayVideoClipActivity LJLIL;
    public final /* synthetic */ C72242sW LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public DialogInterfaceOnCancelListenerC72993Skn(LiveReplayVideoClipActivity liveReplayVideoClipActivity, C72242sW c72242sW, String str) {
        this.LJLIL = liveReplayVideoClipActivity;
        this.LJLILLLLZI = c72242sW;
        this.LJLJI = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.LJLIL.LLIIIJ(this.LJLILLLLZI.element);
        C79258V8s.LIZ(new AqS35S1000000_12(this.LJLJI, 30));
    }
}
