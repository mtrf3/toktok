package X;

import android.view.Choreographer;
import com.ss.android.ugc.aweme.lego.kita.InitKitaTask;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* renamed from: X.IdX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47063IdX implements EW1 {
    public final /* synthetic */ InitKitaTask LIZ;

    @Override // X.EW1
    public final void onError() {
        this.LIZ.getClass();
    }

    public C47063IdX(InitKitaTask initKitaTask) {
        this.LIZ = initKitaTask;
    }

    @Override // X.EW1
    public final void LIZIZ(Choreographer.FrameCallback callback) {
        o.LJIIIZ(callback, "callback");
        InitKitaTask initKitaTask = this.LIZ;
        initKitaTask.LJLJJI = callback;
        if (IOH.LIZJ) {
            if (initKitaTask.LJLIL) {
                C16880lQ.LLIIIJ().postFrameCallback(this.LIZ.LJLJI);
                return;
            }
            Choreographer LLIIIJ = C16880lQ.LLIIIJ();
            o.LJIIIIZZ(LLIIIJ, "getInstance()");
            Choreographer.FrameCallback frameCallback = this.LIZ.LJLJJI;
            if (frameCallback != null) {
                EWN.LIZ(LLIIIJ, frameCallback);
                return;
            } else {
                o.LJIJI("realCallback");
                throw null;
            }
        }
        C16880lQ.LLIIIJ().postFrameCallback(this.LIZ.LJLILLLLZI);
    }

    @Override // X.EW1
    public final void LIZ(Object origin, Method method, Choreographer.FrameCallback callback) {
        o.LJIIIZ(origin, "origin");
        o.LJIIIZ(method, "method");
        o.LJIIIZ(callback, "callback");
        LIZIZ(callback);
    }
}
