package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;

/* loaded from: classes8.dex */
public final class GL9 implements Runnable {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Bundle LJLJI;
    public final /* synthetic */ List<String> LJLJJI;
    public final /* synthetic */ IPageToFinish LJLJJL;

    public GL9(ActivityC45651qj activityC45651qj, boolean z, Bundle bundle, List<String> list, IPageToFinish iPageToFinish) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = z;
        this.LJLJI = bundle;
        this.LJLJJI = list;
        this.LJLJJL = iPageToFinish;
    }

    public final void LIZ() {
        C43617H9x c43617H9x = new C43617H9x(this.LJLIL, this.LJLILLLLZI);
        ShortVideoContext LIZIZ = HB3.LIZIZ(this.LJLJI);
        if (C43723HDz.LJI(LIZIZ.shootWay)) {
            C41658GWo.LIZLLL().LJ = Boolean.FALSE;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C41403GMt(LIZIZ, this.LJLJJI, c43617H9x, this.LJLJI, this.LJLJJL, null), 3);
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
