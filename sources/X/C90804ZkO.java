package X;

import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.bean.SinkDeviceInfo;
import com.byted.cast.common.source.ISinkDeviceInfoListener;

/* renamed from: X.ZkO, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90804ZkO implements ISinkDeviceInfoListener {
    public final /* synthetic */ Boolean[] LIZ;
    public final /* synthetic */ C90801ZkL LIZIZ;

    @Override // com.byted.cast.common.source.ISinkDeviceInfoListener
    public final void onSuccess(SinkDeviceInfo sinkDeviceInfo) {
        this.LIZIZ.LIZIZ.i("ByteCastSourceImpl", "getSinkDeviceInfo by chromeCastSource protocol success");
        this.LIZ[0] = Boolean.TRUE;
        this.LIZIZ.LIZLLL.trackSourceGetDeviceInfoEvent("success", new C90433ZeP(sinkDeviceInfo));
        C90801ZkL c90801ZkL = this.LIZIZ;
        if (c90801ZkL.LJJL != null) {
            c90801ZkL.LJJIIZ.saveSinkDeviceInfo(sinkDeviceInfo);
            Dispatcher.getInstance().runOnMainThread(new RunnableC90191ZaV(1, this, sinkDeviceInfo));
        }
    }

    public C90804ZkO(C90801ZkL c90801ZkL, Boolean[] boolArr) {
        this.LIZIZ = c90801ZkL;
        this.LIZ = boolArr;
    }

    @Override // com.byted.cast.common.source.ISinkDeviceInfoListener
    public final void onFail(final int i, final String str) {
        this.LIZIZ.LIZIZ.i("ByteCastSourceImpl", "getSinkDeviceInfo by chromeCastSource protocol failure");
        this.LIZ[0] = Boolean.TRUE;
        this.LIZIZ.LIZLLL.trackSourceGetDeviceInfoEvent("failure", new C90434ZeQ(i, str));
        if (this.LIZIZ.LJJL != null) {
            Dispatcher.getInstance().runOnMainThread(new Runnable() { // from class: X.ZeO
                @Override // java.lang.Runnable
                public final void run() {
                    C90804ZkO c90804ZkO = C90804ZkO.this;
                    c90804ZkO.LIZIZ.LJJL.onFail(i, str);
                }
            });
        }
    }
}
