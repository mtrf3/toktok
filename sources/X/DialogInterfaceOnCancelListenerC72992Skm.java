package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.AqS35S1000000_12;

/* renamed from: X.Skm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogInterfaceOnCancelListenerC72992Skm implements DialogInterface.OnCancelListener {
    public final /* synthetic */ A90 LJLIL;
    public final /* synthetic */ C188727au LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public DialogInterfaceOnCancelListenerC72992Skm(A90 a90, C188727au c188727au, String str) {
        this.LJLIL = a90;
        this.LJLILLLLZI = c188727au;
        this.LJLJI = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.LJLIL.dismiss();
        C79258V8s.LIZ(new AqS35S1000000_12(this.LJLJI, 32));
        FMX.LJIIL("livesdk_live_replay_clip_post_cancel", this.LJLILLLLZI.LIZ);
    }
}
