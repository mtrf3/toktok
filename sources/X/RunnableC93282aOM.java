package X;

import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.inner.impl.CoreDefaultImpl;
import com.bytedance.pitaya.inner.impl.CoreDefaultImpl$runTask$callbackAdapter$1;

/* renamed from: X.aOM, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class RunnableC93282aOM implements Runnable {
    public final /* synthetic */ CoreDefaultImpl LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ PTYTaskConfig LJLJI;
    public final /* synthetic */ PTYTaskData LJLJJI;
    public final /* synthetic */ CoreDefaultImpl$runTask$callbackAdapter$1 LJLJJL;
    public final /* synthetic */ double LJLJJLL;

    public RunnableC93282aOM(CoreDefaultImpl coreDefaultImpl, String str, PTYTaskConfig pTYTaskConfig, PTYTaskData pTYTaskData, CoreDefaultImpl$runTask$callbackAdapter$1 coreDefaultImpl$runTask$callbackAdapter$1, double d) {
        this.LJLIL = coreDefaultImpl;
        this.LJLILLLLZI = str;
        this.LJLJI = pTYTaskConfig;
        this.LJLJJI = pTYTaskData;
        this.LJLJJL = coreDefaultImpl$runTask$callbackAdapter$1;
        this.LJLJJLL = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.nativeInstance.LJIIJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, System.currentTimeMillis() / 1000.0d);
        } finally {
            if (LIZ) {
            }
        }
    }
}
