package X;

import Y.ARunnableS40S0100000_4;
import com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager$fetchResourcesWithModelNames$1;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;

/* loaded from: classes16.dex */
public final class XCR implements InterfaceC13850gX {
    public long LIZ;
    public final /* synthetic */ XAR LIZIZ;
    public final /* synthetic */ XDR LIZJ;
    public final /* synthetic */ String[] LIZLLL;

    @Override // X.InterfaceC13850gX
    public final void cancel() {
    }

    @Override // X.InterfaceC13850gX
    public final String getId() {
        return "";
    }

    @Override // X.InterfaceC13850gX
    public final int getLevel() {
        return 0;
    }

    @Override // X.InterfaceC13850gX
    public final void pause() {
    }

    @Override // X.InterfaceC13850gX
    public final void run() {
        try {
            this.LIZIZ.run();
            C15180ig.LIZ(new ARunnableS40S0100000_4((InterfaceC65784Pro) new AqS165S0100000_15(this, 757), 90));
        } catch (Exception e) {
            C15180ig.LIZ(new ARunnableS40S0100000_4((InterfaceC65784Pro) new AqS162S0200000_15(this, e, 63), 90));
        }
    }

    @Override // X.InterfaceC13850gX
    public final long getModifyTime() {
        return this.LIZ;
    }

    @Override // X.InterfaceC13850gX
    public final void setModifyTime(long j) {
        this.LIZ = j;
    }

    public XCR(XAR xar, AlgorithmModelManager$fetchResourcesWithModelNames$1 algorithmModelManager$fetchResourcesWithModelNames$1, String[] strArr) {
        this.LIZIZ = xar;
        this.LIZJ = algorithmModelManager$fetchResourcesWithModelNames$1;
        this.LIZLLL = strArr;
    }
}
