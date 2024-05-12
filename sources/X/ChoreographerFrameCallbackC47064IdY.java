package X;

import android.view.Choreographer;
import com.ss.android.ugc.aweme.lego.kita.InitKitaTask;
import kotlin.jvm.internal.o;

/* renamed from: X.IdY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ChoreographerFrameCallbackC47064IdY implements Choreographer.FrameCallback {
    public final /* synthetic */ InitKitaTask LJLIL;

    public ChoreographerFrameCallbackC47064IdY(InitKitaTask initKitaTask) {
        this.LJLIL = initKitaTask;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (IOH.LIZJ) {
            Choreographer LLIIIJ = C16880lQ.LLIIIJ();
            o.LJIIIIZZ(LLIIIJ, "getInstance()");
            Choreographer.FrameCallback frameCallback = this.LJLIL.LJLJJI;
            if (frameCallback != null) {
                EWN.LIZ(LLIIIJ, frameCallback);
                return;
            } else {
                o.LJIJI("realCallback");
                throw null;
            }
        }
        Choreographer.FrameCallback frameCallback2 = this.LJLIL.LJLJJI;
        if (frameCallback2 != null) {
            frameCallback2.doFrame(j);
        } else {
            o.LJIJI("realCallback");
            throw null;
        }
    }
}
