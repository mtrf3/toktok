package X;

import com.byted.cast.common.bean.SinkDeviceInfo;
import com.byted.cast.sdk.core.RTCEventNotifier;

/* renamed from: X.ZaV, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final /* synthetic */ class RunnableC90191ZaV implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                ((RTCEventNotifier) this.LJLILLLLZI).lambda$onStat$0((String) this.LJLJI);
                return;
            default:
                C90804ZkO c90804ZkO = (C90804ZkO) this.LJLILLLLZI;
                c90804ZkO.LIZIZ.LJJL.onSuccess((SinkDeviceInfo) this.LJLJI);
                return;
        }
    }

    public /* synthetic */ RunnableC90191ZaV(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
