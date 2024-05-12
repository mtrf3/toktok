package Y;

import X.C76457TzZ;
import X.C76805UCj;
import X.CL6;
import X.InterfaceC76675U7j;
import X.U27;
import X.U7T;
import X.U7V;
import X.UCK;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.ui.MatchSpeedChallengeAssem;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS163S0100000_13;

/* loaded from: classes14.dex */
public class ARunnableS16S0100100_13 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        LinearLayout linearLayout = ((C76805UCj) this.l0).LJLLLL;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            LinearLayout linearLayout2 = ((C76805UCj) this.l0).LJLLLL;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            FrameLayout frameLayout = ((C76805UCj) this.l0).LJZI;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            U27.LJIIIIZZ(this.j1 - 3, ((C76805UCj) this.l0).LLFII);
            C76457TzZ.LIZ(UCK.PROGRESS_RESULT, 0L, ((C76805UCj) this.l0).LLFII);
        }
        CL6.LIZIZ("match_in_progress");
    }

    public final void LIZ$1() {
        LinearLayout linearLayout = ((MatchSpeedChallengeAssem) this.l0).LLFFF;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            LinearLayout linearLayout2 = ((MatchSpeedChallengeAssem) this.l0).LLFFF;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            FrameLayout frameLayout = ((MatchSpeedChallengeAssem) this.l0).LLIFFJFJJ;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            U27.LJIIIIZZ(this.j1 - 3, ((MatchSpeedChallengeAssem) this.l0).LLIIIZ);
            C76457TzZ.LIZ(UCK.PROGRESS_RESULT, 0L, ((MatchSpeedChallengeAssem) this.l0).LLIIIZ);
        }
        CL6.LIZIZ("match_in_progress");
    }

    public static final void run$0(ARunnableS16S0100100_13 aRunnableS16S0100100_13) {
        boolean LIZ;
        try {
            aRunnableS16S0100100_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS16S0100100_13 aRunnableS16S0100100_13) {
        boolean LIZ;
        try {
            aRunnableS16S0100100_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS16S0100100_13 aRunnableS16S0100100_13) {
        boolean LIZ;
        try {
            ((U7T) aRunnableS16S0100100_13.l0).LJIIIZ.LJIIIZ("live_end");
            U7T u7t = (U7T) aRunnableS16S0100100_13.l0;
            CopyOnWriteArrayList<InterfaceC76675U7j> copyOnWriteArrayList = u7t.LJIIIIZZ;
            long j = aRunnableS16S0100100_13.j1;
            Iterator<InterfaceC76675U7j> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJIIZILJ(u7t, j);
            }
            U7T u7t2 = (U7T) aRunnableS16S0100100_13.l0;
            u7t2.getClass();
            U7V.LJIILJJIL(new AqS163S0100000_13(u7t2, 418));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS16S0100100_13(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
