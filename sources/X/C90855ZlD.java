package X;

import Y.IDRunnableS1S1201000_24;
import Y.IDRunnableS86S0100000_24;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.Monitor;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.IInitListener;

/* renamed from: X.ZlD, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90855ZlD implements IInitListener {
    public final /* synthetic */ Config LIZ;
    public final /* synthetic */ IInitListener LIZIZ;

    @Override // com.byted.cast.common.config.IInitListener
    public final void onSuccess() {
        Monitor.sendByteCastAuthEvent(this.LIZ.isInitialModeBind(), "success", -1);
        Monitor.sendSinkEvent("ByteCast_BindSdk_Result", "true");
        TeaEventTrack.getInstance().trackSinkEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_AUTH, new C90550ZgI(this));
        Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(this.LIZIZ, 46));
    }

    public C90855ZlD(Config config, IInitListener iInitListener) {
        this.LIZ = config;
        this.LIZIZ = iInitListener;
    }

    @Override // com.byted.cast.common.config.IInitListener
    public final void onFail(int i, String str, Exception exc) {
        Monitor.sendByteCastAuthEvent(this.LIZ.isInitialModeBind(), "fail", i);
        Monitor.sendSinkEvent("ByteCast_BindSdk_Result", "false");
        TeaEventTrack.getInstance().trackSinkEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_AUTH, new C90551ZgJ(this, i, str, exc));
        Dispatcher.getInstance().runOnMainThread(new IDRunnableS1S1201000_24(this.LIZIZ, i, str, exc, 1));
    }
}
