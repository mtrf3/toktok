package X;

import com.lynx.tasm.base.LLog;
import com.lynx.tasm.lepus.LepusApiActor;

/* loaded from: classes15.dex */
public final class VNK implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ LepusApiActor LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LepusApiActor lepusApiActor = this.LJLJJI;
            long j = lepusApiActor.LIZ;
            if (j == 0) {
                LLog.LIZLLL(4, "LepusApiActor", "OnPseudoStatusChanged failed since mNativePtr is null");
            } else {
                lepusApiActor.nativeOnPseudoStatusChanged(j, this.LJLIL, this.LJLILLLLZI, this.LJLJI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public VNK(LepusApiActor lepusApiActor, int i, int i2, int i3) {
        this.LJLJJI = lepusApiActor;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
    }
}
