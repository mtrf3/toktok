package X;

import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.source.ServiceInfo;

/* renamed from: X.ZeA, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class RunnableC90418ZeA implements Runnable {
    public final /* synthetic */ ServiceInfo LJLIL;
    public final /* synthetic */ DramaBean[] LJLILLLLZI;
    public final /* synthetic */ C90780Zk0 LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJI.LIZ.onDramaList(this.LJLIL, this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC90418ZeA(C90780Zk0 c90780Zk0, ServiceInfo serviceInfo, DramaBean[] dramaBeanArr) {
        this.LJLJI = c90780Zk0;
        this.LJLIL = serviceInfo;
        this.LJLILLLLZI = dramaBeanArr;
    }
}
