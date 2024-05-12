package Y;

import X.C68322mC;
import X.C7JX;
import X.InterfaceC65350Pko;
import android.text.Layout;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public class ARunnableS2S1200000_3 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.text.Layout, T] */
    public final void LIZ$0() {
        int i;
        ((C68322mC) this.l1).element = ((TextView) ((MixFeedCell) this.l2).itemView.findViewById(R.id.gkj)).getLayout();
        T t = ((C68322mC) this.l1).element;
        Layout layout = (Layout) t;
        if (layout != null) {
            Layout layout2 = (Layout) t;
            if (layout2 != null) {
                i = layout2.getLineCount();
            } else {
                i = 1;
            }
            if (layout.getEllipsisCount(i - 1) > 0) {
                ((TextView) ((MixFeedCell) this.l2).itemView.findViewById(R.id.gki)).setText(this.s0);
                ((MixFeedCell) this.l2).itemView.findViewById(R.id.gki).setVisibility(0);
                return;
            }
        }
        ((MixFeedCell) this.l2).itemView.findViewById(R.id.gkj).setVisibility(0);
    }

    public static final void run$0(ARunnableS2S1200000_3 aRunnableS2S1200000_3) {
        boolean LIZ;
        try {
            C7JX.LIZ.LIZIZ((ReusedUIAssem) aRunnableS2S1200000_3.l1, (InterfaceC65350Pko) aRunnableS2S1200000_3.l2, aRunnableS2S1200000_3.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S1200000_3 aRunnableS2S1200000_3) {
        boolean LIZ;
        try {
            aRunnableS2S1200000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS2S1200000_3(Object obj, T t, InterfaceC65350Pko<? extends ReusedAssem<?>> interfaceC65350Pko, String str) {
        this.$t = str;
        this.l1 = obj;
        this.l2 = t;
        this.s0 = interfaceC65350Pko;
    }
}
