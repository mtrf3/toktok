package X;

import Y.IDCListenerS252S0100000_2;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.6BD, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6BD<T extends TextView> {
    public static final /* synthetic */ int LJFF = 0;
    public final T LIZ;
    public final C6BC LIZIZ;
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

    /* JADX WARN: Multi-variable type inference failed */
    public C6BD(TextView textView, C6BC sizeHelper, C6BF c6bf) {
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(sizeHelper, "sizeHelper");
        this.LIZ = textView;
        this.LIZIZ = sizeHelper;
        this.LIZJ = c6bf;
        this.LJ = new IDCListenerS252S0100000_2(this, 2);
    }
}
