package X;

import Y.ARunnableS29S0200000_10;
import com.ss.android.ugc.aweme.commercialize.model.AdFeInteractionModel;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;

/* loaded from: classes11.dex */
public final class NQ9 implements Runnable {
    public final /* synthetic */ AdFeInteractionModel LJLIL;
    public final /* synthetic */ C59316NPs LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public NQ9(AdFeInteractionModel adFeInteractionModel, C59316NPs c59316NPs, long j, int i, int i2) {
        this.LJLIL = adFeInteractionModel;
        this.LJLILLLLZI = c59316NPs;
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    public final void LIZ() {
        if (!this.LJLIL.isInteractivity()) {
            InterfaceC59347NQx interfaceC59347NQx = this.LJLILLLLZI.LLJJLIIIJLLLLLLLZ;
            if (interfaceC59347NQx != null) {
                interfaceC59347NQx.LIZ();
            }
            VideoPlayTaskManager videoPlayTaskManager = this.LJLILLLLZI.LJLLL;
            N68 n68 = new N68("adFeInteractionDelayHide");
            n68.LIZIZ(this.LJLJI);
            n68.LIZJ = this.LJLJJI + this.LJLJJL;
            n68.LIZLLL = new ARunnableS29S0200000_10(this.LJLIL, this.LJLILLLLZI, 36);
            n68.LJ = true;
            videoPlayTaskManager.LJLJLJ(n68.LIZ());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
