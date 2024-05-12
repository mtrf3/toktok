package X;

import Y.AUListenerS103S0100000_16;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

/* renamed from: X.Yd4, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class RunnableC87802Yd4 implements Runnable {
    public final /* synthetic */ AbstractC87817YdJ LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ TextView LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ InterfaceC87791Yct LJLJJL;

    public RunnableC87802Yd4(AbstractC87817YdJ abstractC87817YdJ, int i, TextView textView, long j, InterfaceC87791Yct interfaceC87791Yct) {
        this.LJLIL = abstractC87817YdJ;
        this.LJLILLLLZI = i;
        this.LJLJI = textView;
        this.LJLJJI = j;
        this.LJLJJL = interfaceC87791Yct;
    }

    public final void LIZ() {
        int scrollX;
        if (CCJ.LIZ(this.LJLIL.LJI.getContext())) {
            scrollX = this.LJLIL.LJI.getScrollX() - this.LJLILLLLZI;
        } else {
            scrollX = this.LJLIL.LJI.getScrollX() + this.LJLILLLLZI;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.LJLJI.getScrollX(), scrollX);
        ofInt.setInterpolator(new LinearInterpolator());
        long j = ((this.LJLILLLLZI * 1.0f) / this.LJLIL.LIZIZ.LIZLLL) * ((float) 1000);
        long j2 = this.LJLJJI;
        if (j2 > 0 && j > j2) {
            j = j2;
        }
        ofInt.setDuration(j);
        ofInt.setStartDelay(100L);
        ofInt.addUpdateListener(new AUListenerS103S0100000_16(this.LJLJI, 14));
        ofInt.addListener(new C87798Yd0(this.LJLJJL, this.LJLILLLLZI, this.LJLIL));
        ofInt.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
