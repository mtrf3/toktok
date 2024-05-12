package Y;

import X.ActivityC45651qj;
import X.C183557Ih;
import X.C26045AKb;
import X.C68322mC;
import X.C7IZ;
import android.animation.AnimatorSet;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ARunnableS4S1100000_3 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

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
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean E4 = ((UpvoteVideoAssem) this.l1).E4();
        C7IZ u4 = ((UpvoteVideoAssem) this.l1).u4();
        if (u4 != null) {
            String updateReason = this.s0;
            o.LJIIIZ(updateReason, "updateReason");
            if (!(!o.LJ(updateReason, "publish_success"))) {
                return;
            }
            if (!o.LJ(u4.LJIIJ, u4.LIZIZ.LJLJJL)) {
                u4.LJII(true, E4);
            } else if (!u4.LJIIL()) {
                C7IZ.LJIIIIZZ(u4, false, 3);
            } else {
                u4.LJIIJJI();
            }
        }
    }

    public final void LIZ$1() {
        C183557Ih B4 = ((UpvoteVideoAssemNew) this.l1).B4();
        if (B4 != null) {
            String updateReason = this.s0;
            o.LJIIIZ(updateReason, "updateReason");
            if (!o.LJ(B4.LJII, B4.LIZIZ.LJLJI)) {
                B4.LJ();
                return;
            }
            switch (updateReason.hashCode()) {
                case -1817577947:
                    if (updateReason.equals("fake_publish")) {
                        return;
                    }
                    break;
                case -807683369:
                    if (updateReason.equals("fake_add_comment")) {
                        return;
                    }
                    break;
                case 1062405331:
                    if (updateReason.equals("publish_success")) {
                        return;
                    }
                    break;
                case 1868504495:
                    if (updateReason.equals("fake_delete_upvote")) {
                        return;
                    }
                    break;
            }
            if (o.LJ(updateReason, "refresh") && B4.LJFF == 2) {
                return;
            }
            AnimatorSet animatorSet = B4.LJIIJ;
            if (animatorSet != null && animatorSet.isRunning()) {
                return;
            }
            B4.LJ();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.text.Layout, T] */
    public final void LIZ$2() {
        C68322mC c68322mC = new C68322mC();
        ?? layout = ((TextView) ((MixFeedCell) this.l1).itemView.findViewById(R.id.gkj)).getLayout();
        c68322mC.element = layout;
        if (layout != 0 && layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
            ((TuxTextView) ((MixFeedCell) this.l1).itemView.findViewById(R.id.gkj)).LJJJ(10.0f);
            ((MixFeedCell) this.l1).itemView.findViewById(R.id.gkj).post(new ARunnableS2S1200000_3(c68322mC, (MixFeedCell) this.l1, this.s0, 1));
        } else {
            ((MixFeedCell) this.l1).itemView.findViewById(R.id.gkj).setVisibility(0);
        }
    }

    public static final void run$0(ARunnableS4S1100000_3 aRunnableS4S1100000_3) {
        boolean LIZ;
        try {
            C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) aRunnableS4S1100000_3.l1);
            c26045AKb.LJIIIZ(aRunnableS4S1100000_3.s0);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS4S1100000_3 aRunnableS4S1100000_3) {
        boolean LIZ;
        try {
            ((PoiCollectStatusBaseAssem) aRunnableS4S1100000_3.l1).Q3();
            PoiCollectStatusBaseAssem poiCollectStatusBaseAssem = (PoiCollectStatusBaseAssem) aRunnableS4S1100000_3.l1;
            String str = aRunnableS4S1100000_3.s0;
            poiCollectStatusBaseAssem.O3().gv0(null, str, new AqS57S1100000_3(poiCollectStatusBaseAssem, str, 42));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS4S1100000_3 aRunnableS4S1100000_3) {
        boolean LIZ;
        try {
            aRunnableS4S1100000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS4S1100000_3 aRunnableS4S1100000_3) {
        boolean LIZ;
        try {
            aRunnableS4S1100000_3.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS4S1100000_3 aRunnableS4S1100000_3) {
        boolean LIZ;
        try {
            aRunnableS4S1100000_3.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS4S1100000_3(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
