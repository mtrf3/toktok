package Y;

import X.C44498HdG;
import X.C45344Hqu;
import X.C5S1;
import X.GWG;
import X.InterfaceC43172Gwy;
import X.V16;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.downloadv2.event.newet.DownloadFinishEvent;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public class ARunnableS13S0110000_7 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ((C45344Hqu) this.l0).LJIIIIZZ();
        ShareDependService.LIZ.getClass();
        C44498HdG.LIZ().LJIIJ(false);
        InterfaceC43172Gwy interfaceC43172Gwy = ((C45344Hqu) this.l0).LJLLL;
        if (interfaceC43172Gwy != null) {
            interfaceC43172Gwy.LIZIZ();
        }
        ((C45344Hqu) this.l0).LJ();
        C45344Hqu c45344Hqu = (C45344Hqu) this.l0;
        if (!c45344Hqu.LLIIIJ && !this.z1) {
            if (c45344Hqu.LLD == -113) {
                C5S1 c5s1 = new C5S1(((C45344Hqu) this.l0).LJLIL);
                c5s1.LIZJ(R.string.r49);
                c5s1.LJ();
            } else {
                C5S1 c5s12 = new C5S1(((C45344Hqu) this.l0).LJLIL);
                c5s12.LIZJ(R.string.q_l);
                c5s12.LJ();
            }
        }
        if (!this.z1) {
            GScope gScope = GScope.LJLIL;
            long currentTimeMillis = System.currentTimeMillis();
            C45344Hqu c45344Hqu2 = (C45344Hqu) this.l0;
            long j = currentTimeMillis - c45344Hqu2.LLIIZ;
            int i = c45344Hqu2.LLILLIZIL;
            V16.LJJZ(gScope, Long.valueOf(j), 0, c45344Hqu2.LLILLJJLI, c45344Hqu2.LLILLL, Integer.valueOf(i));
            V16.LJJLIIIIJ(DownloadFinishEvent.class);
        }
    }

    public static final void run$0(ARunnableS13S0110000_7 aRunnableS13S0110000_7) {
        boolean LIZ;
        try {
            if (aRunnableS13S0110000_7.z1) {
                ((GWG) aRunnableS13S0110000_7.l0).LJLJJL.setVisibility(0);
            } else {
                ((GWG) aRunnableS13S0110000_7.l0).LIZJ(false, false);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS13S0110000_7 aRunnableS13S0110000_7) {
        boolean LIZ;
        try {
            aRunnableS13S0110000_7.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS13S0110000_7(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
