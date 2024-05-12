package Y;

import X.C28736BPo;
import X.C47121t6;
import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public class ARunnableS4S1200000_5 implements Runnable {
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

    public final void LIZ$0() {
        C47121t6 c47121t6 = new C47121t6((Context) this.l1, null);
        c47121t6.setBackgroundColor(((Context) this.l1).getResources().getColor(R.color.holo_red_light));
        c47121t6.setText(this.s0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(((View) this.l2).getWidth() / 2, -2);
        layoutParams.gravity = 8388691;
        c47121t6.setLayoutParams(layoutParams);
        ((ViewGroup) ((View) this.l2)).addView(c47121t6);
    }

    public static final void run$0(ARunnableS4S1200000_5 aRunnableS4S1200000_5) {
        ((C28736BPo) aRunnableS4S1200000_5.l1).LIZ((Context) aRunnableS4S1200000_5.l2, aRunnableS4S1200000_5.s0);
    }

    public static final void run$1(ARunnableS4S1200000_5 aRunnableS4S1200000_5) {
        boolean LIZ;
        try {
            aRunnableS4S1200000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS4S1200000_5(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
