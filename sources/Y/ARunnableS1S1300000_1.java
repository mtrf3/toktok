package Y;

import X.C2055284u;
import X.C34K;
import X.C60692Zt;
import X.C68322mC;
import X.C777333h;
import X.C78609UtB;
import X.X1D;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class ARunnableS1S1300000_1 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
    /* JADX WARN: Type inference failed for: r0v46, types: [T, java.lang.String] */
    public final void LIZ$0() {
        View view = (View) this.l1;
        int width = view.getWidth();
        float measureText = ((TuxTextView) this.l2).getPaint().measureText(this.s0);
        C2055284u.LIZJ((TuxTextView) this.l2, 63);
        float measureText2 = ((TuxTextView) this.l2).getPaint().measureText((String) ((C68322mC) this.l3).element);
        C2055284u.LIZJ((TuxTextView) this.l2, 62);
        float f = width;
        if (measureText <= f && measureText + measureText2 > f) {
            C68322mC c68322mC = (C68322mC) this.l3;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('\n');
            LIZ.append((String) ((C68322mC) this.l3).element);
            c68322mC.element = X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.s0);
        LIZ2.append((String) ((C68322mC) this.l3).element);
        SpannableString spannableString = new SpannableString(X1D.LIZIZ(LIZ2));
        spannableString.setSpan(new ForegroundColorSpan(C78609UtB.LJJJ(R.attr.eb, view.getContext())), this.s0.length(), ((String) ((C68322mC) this.l3).element).length() + this.s0.length(), 17);
        spannableString.setSpan(C2055284u.LIZIZ(6, 63, false, false), this.s0.length(), ((String) ((C68322mC) this.l3).element).length() + this.s0.length(), 17);
        ((TuxTextView) this.l2).setText(spannableString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$0(ARunnableS1S1300000_1 aRunnableS1S1300000_1) {
        boolean LIZ;
        try {
            if (((C34K) aRunnableS1S1300000_1.l1).element) {
                ((ConcurrentHashMap) ((C777333h) aRunnableS1S1300000_1.l2).LIZJ).put(aRunnableS1S1300000_1.s0, Boolean.TRUE);
                ((C777333h) aRunnableS1S1300000_1.l2).LIZJ((C60692Zt) ((C68322mC) aRunnableS1S1300000_1.l3).element);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S1300000_1 aRunnableS1S1300000_1) {
        boolean LIZ;
        try {
            aRunnableS1S1300000_1.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S1300000_1(TuxTextView tuxTextView, TuxTextView tuxTextView2, String str, C68322mC c68322mC, int i) {
        this.$t = i;
        this.l1 = tuxTextView;
        this.l2 = tuxTextView2;
        this.s0 = str;
        this.l3 = c68322mC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS1S1300000_1(C34K c34k, C34K c34k2, C777333h c777333h, String str, C68322mC<C60692Zt> c68322mC, String str2) {
        this.$t = str2;
        this.l1 = c34k;
        this.l2 = c34k2;
        this.s0 = c777333h;
        this.l3 = str;
    }
}
