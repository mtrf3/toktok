package X;

import android.view.Choreographer;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class EW0 implements EW1 {
    @Override // X.EW1
    public final /* synthetic */ void onError() {
    }

    @Override // X.EW1
    public final void LIZIZ(Choreographer.FrameCallback frameCallback) {
        C16880lQ.LLIIIJ().postFrameCallback(frameCallback);
    }

    @Override // X.EW1
    public final void LIZ(Object obj, Method method, Choreographer.FrameCallback frameCallback) {
        method.invoke(obj, frameCallback);
    }
}
