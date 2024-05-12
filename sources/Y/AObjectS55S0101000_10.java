package Y;

import X.C16880lQ;
import X.C40400FtM;
import X.C63081OpJ;
import X.C6FS;
import X.C81303VvX;
import X.GGS;
import X.InterfaceC40402FtO;
import X.InterfaceC65784Pro;
import X.NPQ;
import X.OW6;
import X.ViewOnClickListenerC62596OhU;
import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public class AObjectS55S0101000_10 implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS55S0101000_10 aObjectS55S0101000_10) {
        switch (aObjectS55S0101000_10.i1) {
            case 0:
                NPQ.LIZIZ.LJ((String) aObjectS55S0101000_10.l0);
                return null;
            default:
                return ((VideoEditContainerScene) aObjectS55S0101000_10.l0).LLIILII.LLJJI();
        }
    }

    public static final Object invoke$1(AObjectS55S0101000_10 aObjectS55S0101000_10) {
        switch (aObjectS55S0101000_10.i1) {
            case 0:
                ViewOnClickListenerC62596OhU viewOnClickListenerC62596OhU = (ViewOnClickListenerC62596OhU) aObjectS55S0101000_10.l0;
                C81303VvX c81303VvX = viewOnClickListenerC62596OhU.LJLILLLLZI;
                if (c81303VvX != null) {
                    c81303VvX.LIZIZ();
                }
                Activity activity = viewOnClickListenerC62596OhU.LJLJL;
                if (activity != null && !activity.isFinishing() && !viewOnClickListenerC62596OhU.isShowing()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = viewOnClickListenerC62596OhU.LJLIL;
                    viewOnClickListenerC62596OhU.LJLJJL = currentTimeMillis + j;
                    viewOnClickListenerC62596OhU.LJLILLLLZI.postDelayed(viewOnClickListenerC62596OhU.LJLJJI, j);
                    if (viewOnClickListenerC62596OhU.LJLJJLL.getParent() != null) {
                        C16880lQ.LJLLL(viewOnClickListenerC62596OhU.LJLJJLL, (ViewGroup) viewOnClickListenerC62596OhU.LJLJJLL.getParent());
                    }
                    try {
                        C16880lQ.LLLIILIL(viewOnClickListenerC62596OhU, viewOnClickListenerC62596OhU.LJLJL.getWindow().getDecorView(), -C63081OpJ.LJJJJLI(viewOnClickListenerC62596OhU.LJLJL));
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                return null;
            case 1:
                aObjectS55S0101000_10.l0.getClass();
                return GGS.LIZJ;
            case 2:
                final OW6 ow6 = (OW6) aObjectS55S0101000_10.l0;
                ow6.getClass();
                return new C40400FtM(new InterfaceC40402FtO() { // from class: X.OVl
                    @Override // X.InterfaceC40402FtO
                    public final void onActivityResult(int i, int i2, Intent intent) {
                        OW6 ow62 = OW6.this;
                        if (i == 100) {
                            Activity activity2 = ow62.LIZIZ;
                            if (C62011OVj.LJFF(activity2, activity2.getPackageName())) {
                                C5S1 c5s1 = new C5S1(EF7.LIZIZ());
                                c5s1.LIZJ(R.string.tu8);
                                c5s1.LJ();
                                C62011OVj.LJIIJ(ow62.LIZ.getAid(), "share", "", true);
                                C62011OVj.LJIIIIZZ(0, "");
                                return;
                            }
                            return;
                        }
                        ow62.getClass();
                    }
                });
            default:
                ((C6FS) aObjectS55S0101000_10.l0).gs0();
                return null;
        }
    }

    public AObjectS55S0101000_10(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
