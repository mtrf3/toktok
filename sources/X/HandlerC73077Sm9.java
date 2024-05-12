package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Sm9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class HandlerC73077Sm9 extends Handler {
    public final /* synthetic */ LiveReplayVideoPlayerDialogFragment LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 0) {
            C0ER LIZJ = C0ER.LIZJ();
            C73079SmB c73079SmB = this.LIZ.LJLLJ;
            LIZJ.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("registerCallback:");
            LIZ.append(c73079SmB.LIZIZ());
            C0NB.LIZIZ("LiveReplyDownloader", X1D.LIZIZ(LIZ));
            C0EP.LJFF().LJII(c73079SmB.LIZIZ(), c73079SmB);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC73077Sm9(LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment, Looper looper) {
        super(looper);
        this.LIZ = liveReplayVideoPlayerDialogFragment;
    }
}
