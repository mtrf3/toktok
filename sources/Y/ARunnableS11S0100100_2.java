package Y;

import X.AbstractC029409q;
import X.C139875eJ;
import X.C142575if;
import X.C172196pL;
import X.C47261Igj;
import X.C57V;
import X.C5MM;
import X.InterfaceC162066Xq;
import X.ORZ;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverFragment;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ARunnableS11S0100100_2 implements Runnable {
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

    public static final void run$0(ARunnableS11S0100100_2 aRunnableS11S0100100_2) {
        boolean LIZ;
        try {
            ((FTCChooseCoverFragment) aRunnableS11S0100100_2.l0).LJLJL = false;
            C5MM LIZLLL = C5MM.LIZLLL(aRunnableS11S0100100_2.j1);
            InterfaceC162066Xq interfaceC162066Xq = ((FTCChooseCoverFragment) aRunnableS11S0100100_2.l0).LJLIL;
            if (interfaceC162066Xq != null) {
                interfaceC162066Xq.LJIIIZ().setValue(LIZLLL);
                ((FTCChooseCoverFragment) aRunnableS11S0100100_2.l0).xl(aRunnableS11S0100100_2.j1);
            } else {
                o.LJIJI("mDependency");
                throw null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS11S0100100_2 aRunnableS11S0100100_2) {
        boolean LIZ;
        try {
            ((C142575if) aRunnableS11S0100100_2.l0).M(aRunnableS11S0100100_2.j1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS11S0100100_2 aRunnableS11S0100100_2) {
        boolean LIZ;
        try {
            ((C139875eJ) aRunnableS11S0100100_2.l0).M(aRunnableS11S0100100_2.j1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS11S0100100_2 aRunnableS11S0100100_2) {
        boolean LIZ;
        long j;
        try {
            RecyclerView frameRecycler = ((C57V) aRunnableS11S0100100_2.l0).getFrameRecycler();
            if (((C57V) aRunnableS11S0100100_2.l0).LJJLJLI()) {
                j = -aRunnableS11S0100100_2.j1;
            } else {
                j = aRunnableS11S0100100_2.j1;
            }
            frameRecycler.scrollBy((int) (((float) j) * ((C57V) aRunnableS11S0100100_2.l0).LJLJJI), 0);
            ((C57V) aRunnableS11S0100100_2.l0).LJLJLJ = true;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS11S0100100_2 aRunnableS11S0100100_2) {
        int intValue;
        int intValue2;
        Integer num;
        long j;
        NewCutPlayerActivity this$0 = (NewCutPlayerActivity) aRunnableS11S0100100_2.l0;
        long j2 = aRunnableS11S0100100_2.j1;
        o.LJIIIZ(this$0, "this$0");
        AbstractC029409q adapter = ((RecyclerView) this$0.findViewById(R.id.n6l)).getAdapter();
        if (adapter == null) {
            return;
        }
        C172196pL c172196pL = (C172196pL) adapter;
        HashSet hashSet = new HashSet(c172196pL.LJLJJI);
        c172196pL.LJLJJI.clear();
        Iterator it = ((ArrayList) c172196pL.LJLJI).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                MediaItem mediaItem = (MediaItem) next;
                if (i2 < ((ArrayList) c172196pL.LJLJI).size()) {
                    j = ((MediaItem) ListProtector.get(c172196pL.LJLJI, i2)).targetStartTime - mediaItem.targetStartTime;
                } else {
                    j = mediaItem.duration;
                }
                long j3 = mediaItem.targetStartTime;
                if (j2 < j3) {
                    break;
                }
                if (j2 < j3 + j) {
                    c172196pL.LJLJJI.add(Integer.valueOf(i));
                    break;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        Set LLJILLL = ORZ.LLJILLL(hashSet);
        LLJILLL.removeAll(c172196pL.LJLJJI);
        Set LLJILLL2 = ORZ.LLJILLL(c172196pL.LJLJJI);
        LLJILLL2.removeAll(hashSet);
        LLJILLL.addAll(LLJILLL2);
        if (!(!LLJILLL.isEmpty())) {
            return;
        }
        Integer num2 = (Integer) ORZ.LLII(LLJILLL);
        if (num2 == null) {
            intValue = 0;
        } else {
            intValue = num2.intValue();
        }
        Integer num3 = (Integer) ORZ.LLFZ(LLJILLL);
        if (num3 == null) {
            intValue2 = ((ArrayList) c172196pL.LJLJI).size() - 1;
        } else {
            intValue2 = num3.intValue();
        }
        c172196pL.notifyItemRangeChanged(intValue, (intValue2 - intValue) + 1, 0);
        Set<Integer> set = c172196pL.LJLJJI;
        if (set == null || (num = (Integer) ORZ.LLFZ(set)) == null) {
            return;
        }
        int intValue3 = num.intValue();
        if (this$0.findViewById(R.id.n6l).isPressed() || ((RecyclerView) this$0.findViewById(R.id.n6l)).getScrollState() == 1 || ((RecyclerView) this$0.findViewById(R.id.n6l)).getScrollState() == 2) {
            return;
        }
        ((RecyclerView) this$0.findViewById(R.id.n6l)).LJLIL(Math.min(c172196pL.getItemCount(), intValue3));
    }

    public ARunnableS11S0100100_2(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
