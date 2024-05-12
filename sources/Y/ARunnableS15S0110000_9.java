package Y;

import X.C119354mJ;
import X.C27740Aue;
import X.C2NU;
import X.C54309LTd;
import X.C54587Lbb;
import X.C56414MCc;
import X.C80796VnM;
import X.EF7;
import X.MFQ;
import X.SJM;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FollowSkyLightHelper;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.TopTabLayoutAbility;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS14S0010000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ARunnableS15S0110000_9 implements Runnable {
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
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C56414MCc c56414MCc = (C56414MCc) this.l0;
        ValueAnimator valueAnimator = c56414MCc.LJLJLLL;
        if (valueAnimator == null) {
            if (this.z1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(c56414MCc.LJLJL, c56414MCc.LJLJLJ);
                c56414MCc.LJLJLLL = ofFloat;
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                c56414MCc.LJLJLLL.setDuration(1000L);
                c56414MCc.LJLJLLL.addUpdateListener(new AUListenerS97S0100000_9(c56414MCc, 54));
                c56414MCc.LJLJLLL.addListener(new ALAdapterS7S0100000_9(c56414MCc, 15));
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(c56414MCc.LJLJL, c56414MCc.LJLJLJ);
                c56414MCc.LJLJLLL = ofFloat2;
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                c56414MCc.LJLJLLL.setDuration(1000L);
                c56414MCc.LJLJLLL.addUpdateListener(new AUListenerS97S0100000_9(c56414MCc, 53));
                c56414MCc.LJLJLLL.addListener(new ALAdapterS7S0100000_9(c56414MCc, 14));
            }
        } else if (valueAnimator.isRunning()) {
            ((C56414MCc) this.l0).LJLJLLL.cancel();
        }
        ((C56414MCc) this.l0).LJLJLLL.start();
    }

    public final void LIZ$1() {
        RecyclerView recyclerView;
        MFQ mfq = (MFQ) this.l0;
        if (mfq.LIZIZ != null && (recyclerView = mfq.LIZ) != null && C27740Aue.LJI(recyclerView)) {
            if (this.z1) {
                EF7.LIZIZ();
                try {
                    if (!C2NU.LIZ.LIZIZ()) {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            MFQ mfq2 = (MFQ) this.l0;
            mfq2.LIZIZ.LJIJ(mfq2.LIZ, this.z1);
        }
    }

    public final void LIZ$2() {
        long j;
        float f;
        int height = (int) (((View) this.l0).getHeight() * 0.075f);
        boolean z = this.z1;
        if (z) {
            j = 300;
        } else {
            j = 100;
        }
        View view = (View) this.l0;
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        o.LJIIIIZZ(ofFloat, "ofFloat(\n               …lse 0f,\n                )");
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new C54309LTd(height, (View) this.l0, this.z1));
        ofFloat.setInterpolator(new SJM());
        ofFloat.start();
    }

    public static final void run$0(ARunnableS15S0110000_9 aRunnableS15S0110000_9) {
        boolean LIZ;
        try {
            aRunnableS15S0110000_9.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS15S0110000_9 aRunnableS15S0110000_9) {
        DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) aRunnableS15S0110000_9.l0;
        boolean z = aRunnableS15S0110000_9.z1;
        C80796VnM c80796VnM = detailFragmentPanel.mViewPager;
        if (c80796VnM == null || c80796VnM.getScrollState() != 0) {
            return;
        }
        if (z) {
            if (!c80796VnM.LJJIIZI()) {
                return;
            }
            detailFragmentPanel.LJJJLL(false);
            return;
        }
        c80796VnM.LJJIJIIJIL();
    }

    public static final void run$10(ARunnableS15S0110000_9 aRunnableS15S0110000_9) {
        boolean LIZ;
        FeedFollowFragment feedFollowFragment;
        try {
            if (aRunnableS15S0110000_9.z1 && (feedFollowFragment = ((FollowSkyLightHelper) aRunnableS15S0110000_9.l0).LJIIL) != null) {
                feedFollowFragment.Vl(false, false);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS15S0110000_9 aRunnableS15S0110000_9) {
        boolean LIZ;
        try {
            VideoMusicCoverAssem videoMusicCoverAssem = (VideoMusicCoverAssem) aRunnableS15S0110000_9.l0;
            if (videoMusicCoverAssem.LLIZ) {
                TuxTextView tuxTextView = videoMusicCoverAssem.LLILLJJLI;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                }
                ((VideoMusicCoverAssem) aRunnableS15S0110000_9.l0).LLIZLLLIL = false;
                return;
            }
            videoMusicCoverAssem.T4(!aRunnableS15S0110000_9.z1);
            ((VideoMusicCoverAssem) aRunnableS15S0110000_9.l0).LLIZLLLIL = false;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS15S0110000_9 aRunnableS15S0110000_9) {
        boolean LIZ;
        try {
            ((TopTabLayoutAbility) aRunnableS15S0110000_9.l0).LIZJ(aRunnableS15S0110000_9.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS15S0110000_9 aRunnableS15S0110000_9) {
        boolean LIZ;
        try {
            ((TopTabLayoutAbility) aRunnableS15S0110000_9.l0).LIZLLL(aRunnableS15S0110000_9.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS15S0110000_9 aRunnableS15S0110000_9) {
        boolean LIZ;
        try {
            if (((C119354mJ) ((InboxFragment) aRunnableS15S0110000_9.l0)._$_findCachedViewById(R.id.l9q)).getParent() != null) {
                C119354mJ c119354mJ = (C119354mJ) ((InboxFragment) aRunnableS15S0110000_9.l0)._$_findCachedViewById(R.id.l9q);
                if (c119354mJ == null || c119354mJ.LJLJLLL != aRunnableS15S0110000_9.z1) {
                    ((InboxFragment) aRunnableS15S0110000_9.l0).cm();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS15S0110000_9 aRunnableS15S0110000_9) {
        boolean LIZ;
        try {
            C54587Lbb c54587Lbb = (C54587Lbb) aRunnableS15S0110000_9.l0;
            c54587Lbb.LIZIZ(0.0f, c54587Lbb.LIZ(), aRunnableS15S0110000_9.z1, true, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS15S0110000_9 aRunnableS15S0110000_9) {
        boolean LIZ;
        try {
            aRunnableS15S0110000_9.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS15S0110000_9 aRunnableS15S0110000_9) {
        boolean LIZ;
        try {
            aRunnableS15S0110000_9.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS15S0110000_9 aRunnableS15S0110000_9) {
        boolean LIZ;
        try {
            RecSwipeViewModel recSwipeViewModel = (RecSwipeViewModel) aRunnableS15S0110000_9.l0;
            boolean z = aRunnableS15S0110000_9.z1;
            recSwipeViewModel.getClass();
            recSwipeViewModel.setState(new AqS14S0010000_9(z, 13));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS15S0110000_9(C54587Lbb c54587Lbb, int i) {
        this.$t = i;
        this.l0 = c54587Lbb;
        this.z1 = true;
    }

    public ARunnableS15S0110000_9(View view, int i) {
        this.$t = i;
        this.l0 = view;
        this.z1 = true;
    }

    public ARunnableS15S0110000_9(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
