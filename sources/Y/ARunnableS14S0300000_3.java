package Y;

import X.C193187i6;
import X.C201437vP;
import X.C2049182l;
import X.C2050382x;
import X.C211248Qu;
import X.C3C8;
import X.C62562cu;
import X.C62846OlW;
import X.C76732zl;
import X.C78765Uvh;
import X.C80U;
import X.C8XG;
import X.C8XH;
import X.C8XI;
import X.EnumC84576XHg;
import X.InterfaceC65350Pko;
import X.W5U;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.explore.ui.ExploreFeedCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ARunnableS14S0300000_3 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public final void LIZ$2() {
        C2049182l.LIZ = W5U.LIZJ().LIZIZ(new C62562cu(((Aweme) this.l0).getVideo().getCover().getUrlList()));
        C2050382x.LIZ.execute(new ARunnableS22S0200000_3((ExploreFeedCell) this.l1, (C201437vP) this.l2, 62));
    }

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ((ConstraintLayout) this.l0).animate().scaleX(((C80U) this.l1).LIZLLL).scaleY(((C80U) this.l1).LIZLLL).setDuration(150L).withEndAction(new ARunnableS22S0200000_3((VideoShareAssem) this.l2, (C80U) this.l1, 39)).start();
    }

    public final void LIZ$1() {
        C8XG c8xg;
        ((C8XH) this.l0).LJLZ.clear();
        C8XH c8xh = (C8XH) this.l0;
        c8xh.LJIIZILJ(new C8XI(c8xh), (List) this.l1);
        C8XH c8xh2 = (C8XH) this.l0;
        c8xh2.LJLLJ = true;
        ReusedAssem<? extends C3C8> reusedAssem = c8xh2.LJLJI;
        if (reusedAssem != null && (c8xg = reusedAssem.LJLJL) != null) {
            c8xg.LIZIZ(c8xh2.LJLIL, (List) this.l2, c8xh2.LJLLL);
        }
        C8XH c8xh3 = (C8XH) this.l0;
        ConcurrentHashMap<InterfaceC65350Pko<?>, Object> concurrentHashMap = c8xh3.LJLLLL;
        List list = (List) this.l2;
        for (Map.Entry<InterfaceC65350Pko<?>, Object> entry : concurrentHashMap.entrySet()) {
            AssemViewModel<?> assemViewModel = c8xh3.LJLLLLLL.get(entry.getKey());
            if (assemViewModel != null) {
                assemViewModel.maxScheduledGeneration = c8xh3.LJLLL;
                AssemViewModel.syncItem2State$default(assemViewModel, c8xh3.LJLIL, list, entry.getValue(), null, 8, null);
            }
        }
        ((C8XH) this.l0).LJLLL++;
    }

    public static final void run$0(ARunnableS14S0300000_3 aRunnableS14S0300000_3) {
        boolean LIZ;
        try {
            ((ViewGroup) ((View) aRunnableS14S0300000_3.l0)).addView((View) aRunnableS14S0300000_3.l1);
            ReusedUISlotAssem reusedUISlotAssem = (ReusedUISlotAssem) aRunnableS14S0300000_3.l2;
            View v = (View) aRunnableS14S0300000_3.l1;
            o.LJIIIIZZ(v, "v");
            reusedUISlotAssem.N3(v);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS14S0300000_3 aRunnableS14S0300000_3) {
        boolean LIZ;
        try {
            ((ExploreFeedCell) aRunnableS14S0300000_3.l0).X((Layout) aRunnableS14S0300000_3.l1, (Long) aRunnableS14S0300000_3.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS14S0300000_3 aRunnableS14S0300000_3) {
        boolean LIZ;
        try {
            ((MixVideosViewModel) aRunnableS14S0300000_3.l0).qv0((MixVideosResponse) aRunnableS14S0300000_3.l1, ((C76732zl) aRunnableS14S0300000_3.l2).element, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS14S0300000_3 aRunnableS14S0300000_3) {
        boolean LIZ;
        Boolean bool;
        try {
            if (((EnumC84576XHg) aRunnableS14S0300000_3.l0) == EnumC84576XHg.Optimistic) {
                Object obj = aRunnableS14S0300000_3.l1;
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                } else {
                    bool = null;
                }
                if (o.LJ(bool, Boolean.TRUE)) {
                    C193187i6 c193187i6 = (C193187i6) aRunnableS14S0300000_3.l2;
                    c193187i6.LJFF(c193187i6.LJLIL);
                } else {
                    C193187i6 c193187i62 = (C193187i6) aRunnableS14S0300000_3.l2;
                    c193187i62.LIZIZ(c193187i62.LJLIL);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS14S0300000_3 aRunnableS14S0300000_3) {
        boolean LIZ;
        try {
            aRunnableS14S0300000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS14S0300000_3 aRunnableS14S0300000_3) {
        boolean LIZ;
        try {
            ((ConstraintLayout) aRunnableS14S0300000_3.l0).animate().scaleX(1.08f).scaleY(1.08f).setDuration(150L).withEndAction(new ARunnableS14S0300000_3((ConstraintLayout) aRunnableS14S0300000_3.l0, (C80U) aRunnableS14S0300000_3.l1, (VideoShareAssem) aRunnableS14S0300000_3.l2, 4)).start();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS14S0300000_3 aRunnableS14S0300000_3) {
        boolean LIZ;
        try {
            C78765Uvh.LIZ((C62846OlW) aRunnableS14S0300000_3.l0, R.drawable.ajd);
            ((ConstraintLayout) aRunnableS14S0300000_3.l1).animate().scaleX(1.16f).scaleY(1.16f).setDuration(150L).withEndAction(new ARunnableS22S0200000_3((ConstraintLayout) aRunnableS14S0300000_3.l1, (VideoShareAssem) aRunnableS14S0300000_3.l2, 45)).start();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS14S0300000_3 aRunnableS14S0300000_3) {
        boolean LIZ;
        try {
            aRunnableS14S0300000_3.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS14S0300000_3 aRunnableS14S0300000_3) {
        boolean LIZ;
        try {
            aRunnableS14S0300000_3.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS14S0300000_3 aRunnableS14S0300000_3) {
        boolean LIZ;
        try {
            ((C211248Qu) aRunnableS14S0300000_3.l0).LIZIZ((Aweme) aRunnableS14S0300000_3.l1, ((VideoViewCell) aRunnableS14S0300000_3.l2).getEventType());
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS14S0300000_3(Object obj, View view, View view2, ReusedUISlotAssem<RECEIVER> reusedUISlotAssem) {
        this.$t = reusedUISlotAssem;
        this.l0 = obj;
        this.l1 = view;
        this.l2 = view2;
    }

    public ARunnableS14S0300000_3(Fragment fragment, VideoViewCell videoViewCell, Aweme aweme, C211248Qu c211248Qu, int i) {
        this.$t = i;
        this.l0 = c211248Qu;
        this.l1 = aweme;
        this.l2 = videoViewCell;
    }
}
