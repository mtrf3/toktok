package X;

import Y.IDRunnableS1S1201000_24;
import Y.IDRunnableS86S0100000_24;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.IInitListener;

/* renamed from: X.Zkb, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90817Zkb implements IInitListener {
    public final /* synthetic */ Config LIZ;
    public final /* synthetic */ IInitListener LIZIZ;
    public final /* synthetic */ C90459Zep LIZJ;

    @Override // com.byted.cast.common.config.IInitListener
    public final void onSuccess() {
        this.LIZJ.LIZJ.sendByteCastAuthEvent(this.LIZ.isInitialModeBind(), "success", -1);
        this.LIZJ.LIZLLL.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_AUTH, new C90457Zen(this));
        this.LIZJ.LIZJ.sendSourceEvent("ByteCast_BindSdk_Result", "true");
        Dispatcher.getInstance().runOnMainThread(new IDRunnableS86S0100000_24(this.LIZIZ, 25));
    }

    public C90817Zkb(C90459Zep c90459Zep, Config config, IInitListener iInitListener) {
        this.LIZJ = c90459Zep;
        this.LIZ = config;
        this.LIZIZ = iInitListener;
    }

    @Override // com.byted.cast.common.config.IInitListener
    public final void onFail(int i, String str, Exception exc) {
        this.LIZJ.LIZJ.sendByteCastAuthEvent(this.LIZ.isInitialModeBind(), "fail", i);
        this.LIZJ.LIZLLL.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_AUTH, new C90458Zeo(this, i, str, exc));
        this.LIZJ.LIZJ.sendSourceEvent("ByteCast_BindSdk_Result", "false");
        Dispatcher.getInstance().runOnMainThread(new IDRunnableS1S1201000_24(this.LIZIZ, i, str, exc, 0));
    }
}
