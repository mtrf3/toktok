package X;

import android.view.Choreographer;
import com.ss.android.ugc.aweme.lego.kita.InitKitaTask;
import kotlin.jvm.internal.o;

/* renamed from: X.IdZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ChoreographerFrameCallbackC47065IdZ implements Choreographer.FrameCallback {
    public final /* synthetic */ InitKitaTask LJLIL;

    public ChoreographerFrameCallbackC47065IdZ(InitKitaTask initKitaTask) {
        this.LJLIL = initKitaTask;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        InitKitaTask initKitaTask = this.LJLIL;
        initKitaTask.LJLIL = true;
        Choreographer.FrameCallback frameCallback = initKitaTask.LJLJJI;
        if (frameCallback != null) {
            frameCallback.doFrame(j);
            this.LJLIL.LJLIL = false;
        } else {
            o.LJIJI("realCallback");
            throw null;
        }
    }
}
