package X;

import Y.IDCListenerS252S0100000_2;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.6OL, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6OL<T extends TextView> {
    public static final /* synthetic */ int LJFF = 0;
    public final TextView LIZ;
    public final C6OK LIZIZ;
    public final InterfaceC88472Yns<Float, C76800UCe> LIZJ;
    public float LIZLLL;
    public final IDCListenerS252S0100000_2 LJ;

    public float LIZJ() {
        return 20.0f;
    }

    public float LIZLLL() {
        return this.LIZ.getTextSize() / this.LIZ.getResources().getDisplayMetrics().scaledDensity;
    }

    public void LJ() {
        this.LIZ.addOnLayoutChangeListener(this.LJ);
        if (C16330kX.LIZJ(this.LIZ)) {
            float LIZLLL = LIZLLL() / LIZJ();
            if (LIZLLL == this.LIZLLL) {
                return;
            }
            this.LIZJ.invoke(Float.valueOf(LIZLLL));
            this.LIZLLL = LIZLLL;
        }
    }

    public void LJFF() {
        this.LIZ.removeOnLayoutChangeListener(this.LJ);
    }

    public void LJI(float f) {
        this.LIZ.setTextSize(2, O6R.LJJIIZ(f));
    }

    public C6OL(TextView textView, C6OK sizeHelper, C6OS c6os) {
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(sizeHelper, "sizeHelper");
        this.LIZ = textView;
        this.LIZIZ = sizeHelper;
        this.LIZJ = c6os;
        this.LJ = new IDCListenerS252S0100000_2(this, 1);
    }
}
