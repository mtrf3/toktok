package X;

import android.view.Choreographer;
import com.ss.android.ugc.aweme.lego.kita.InitKitaTask;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FFR implements EW1 {
    public final /* synthetic */ InitKitaTask LIZ;

    @Override // X.EW1
    public final void onError() {
        this.LIZ.getClass();
    }

    public FFR(InitKitaTask initKitaTask) {
        this.LIZ = initKitaTask;
    }

    @Override // X.EW1
    public final void LIZIZ(Choreographer.FrameCallback callback) {
        o.LJIIIZ(callback, "callback");
        Choreographer LLIIIJ = C16880lQ.LLIIIJ();
        o.LJIIIIZZ(LLIIIJ, "getInstance()");
        EWN.LIZ(LLIIIJ, callback);
    }

    @Override // X.EW1
    public final void LIZ(Object origin, Method method, Choreographer.FrameCallback callback) {
        o.LJIIIZ(origin, "origin");
        o.LJIIIZ(method, "method");
        o.LJIIIZ(callback, "callback");
        LIZIZ(callback);
    }
}
