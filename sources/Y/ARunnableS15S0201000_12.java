package Y;

import X.C16310kV;
import X.C26338AVi;
import X.C32151Nz;
import X.C70242RhW;
import X.C70248Rhc;
import X.C70261Rhp;
import X.C71306Ryg;
import X.InterfaceC70269Rhx;
import X.KL2;
import X.O6R;
import X.SG4;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ARunnableS15S0201000_12 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
        if (this.i2 == 2) {
            C70261Rhp c70261Rhp = (C70261Rhp) this.l0;
            Iterator it = ((List) this.l1).iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((InterfaceC70269Rhx) it.next()).LIZ()) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            c70261Rhp.LJLJJLL = i;
            if (((C70261Rhp) this.l0).getSelectIndex() > -1) {
                C70261Rhp c70261Rhp2 = (C70261Rhp) this.l0;
                c70261Rhp2.LJLJL.post(new ARunnableS48S0100000_12(c70261Rhp2, 33));
            }
        }
    }

    public final void LIZ$1() {
        try {
            int width = (((SG4) this.l0).getWidth() - C16310kV.LJFF((SG4) this.l0)) - C16310kV.LJ((SG4) this.l0);
            if (((SG4) this.l0).getLayout() == null || ((SG4) this.l0).getLayout().getLineCount() == 0) {
                ((SG4) this.l0).measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(KL2.LJIIIZ(((SG4) this.l0).getContext()), LiveLayoutPreloadThreadPriority.DEFAULT));
            }
            C71306Ryg c71306Ryg = new C71306Ryg((SG4) this.l0, width, "", this.i2, O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
            CharSequence text = ((SG4) this.l0).getText();
            if (text == null) {
                text = "";
            }
            SpannableString LIZ = c71306Ryg.LIZ(SpannableString.valueOf(text));
            if (c71306Ryg.LIZLLL) {
                ((SG4) this.l0).setMaxLines(Integer.MAX_VALUE);
                int width2 = (((SG4) this.l0).getWidth() - C16310kV.LJFF((SG4) this.l0)) - C16310kV.LJ((SG4) this.l0);
                AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12((SG4) this.l0, 1148);
                ((SG4) this.l0).LJZI = new SpannableStringBuilder(((SG4) this.l0).getText());
                SG4 sg4 = (SG4) this.l0;
                SpannableStringBuilder spannableStringBuilder = sg4.LJZI;
                if (spannableStringBuilder != null) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(1));
                    int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(1));
                    int LJJIIZ3 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(15));
                    int LJJIIZ4 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(15));
                    int LJJIIZ5 = width2 - O6R.LJJIIZ(C32151Nz.LJIIZILJ(15));
                    Context context = sg4.getContext();
                    o.LJIIIIZZ(context, "context");
                    sg4.LJJJJ(spannableStringBuilder, R.raw.icon_chevron_up_fill, LJJIIZ, LJJIIZ2, LJJIIZ3, LJJIIZ4, LJJIIZ5, C26338AVi.LIZJ(context), aqS162S0100000_12);
                }
                ((SG4) this.l0).LJZ = new SpannableStringBuilder(LIZ).append((CharSequence) ((SG4) this.l0).LJZL);
                SG4 sg42 = (SG4) this.l0;
                sg42.LJJJJ(sg42.LJZ, R.raw.icon_chevron_down_fill, O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), false, aqS162S0100000_12);
                SG4 sg43 = (SG4) this.l0;
                sg43.setText(sg43.LJZ);
                ((SG4) this.l0).requestLayout();
            }
        } catch (Exception unused) {
            ((SG4) this.l0).setText((CharSequence) this.l1);
            ((SG4) this.l0).setMaxLines(this.i2);
        }
    }

    public static final void run$0(ARunnableS15S0201000_12 aRunnableS15S0201000_12) {
        boolean LIZ;
        try {
            aRunnableS15S0201000_12.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS15S0201000_12 aRunnableS15S0201000_12) {
        boolean LIZ;
        try {
            aRunnableS15S0201000_12.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS15S0201000_12 aRunnableS15S0201000_12) {
        boolean LIZ;
        try {
            C70248Rhc c70248Rhc = (C70248Rhc) aRunnableS15S0201000_12.l0;
            if (c70248Rhc.LJLJI != aRunnableS15S0201000_12.i2) {
                if (!((C70242RhW) aRunnableS15S0201000_12.l1).LJ) {
                    ((RecyclerView) c70248Rhc.LIZ(R.id.k9c)).LJLI(aRunnableS15S0201000_12.i2);
                } else {
                    c70248Rhc.LIZIZ();
                }
                C70248Rhc c70248Rhc2 = (C70248Rhc) aRunnableS15S0201000_12.l0;
                c70248Rhc2.LJLJI = c70248Rhc2.LJLILLLLZI;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS15S0201000_12(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
