package X;

import Y.AUListenerS103S0100000_16;
import android.animation.ValueAnimator;
import android.text.Layout;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

/* renamed from: X.Yd3, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class RunnableC87801Yd3 implements Runnable {
    public final /* synthetic */ TextView LJLIL;
    public final /* synthetic */ AbstractC87817YdJ LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ InterfaceC87791Yct LJLJJI;

    public RunnableC87801Yd3(TextView textView, AbstractC87817YdJ abstractC87817YdJ, long j, InterfaceC87791Yct interfaceC87791Yct) {
        this.LJLIL = textView;
        this.LJLILLLLZI = abstractC87817YdJ;
        this.LJLJI = j;
        this.LJLJJI = interfaceC87791Yct;
    }

    public final void LIZ() {
        float f;
        int scrollX;
        Layout layout = this.LJLIL.getLayout();
        if (layout != null) {
            f = layout.getLineWidth(0);
        } else {
            f = 0.0f;
        }
        int width = (int) (f - this.LJLIL.getWidth());
        if (width > 0) {
            if (CCJ.LIZ(this.LJLILLLLZI.LJI.getContext())) {
                scrollX = this.LJLILLLLZI.LJI.getScrollX() - width;
            } else {
                scrollX = this.LJLILLLLZI.LJI.getScrollX() + width;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.LJLIL.getScrollX(), scrollX);
            ofInt.addUpdateListener(new AUListenerS103S0100000_16(this.LJLIL, 13));
            ofInt.addListener(new C87799Yd1(this.LJLJJI, width, this.LJLILLLLZI));
            long j = ((width * 1.0f) / this.LJLILLLLZI.LIZIZ.LIZLLL) * ((float) 1000);
            long j2 = this.LJLJI;
            if (j2 > 0 && j > j2) {
                j = j2;
            }
            ofInt.setDuration(j);
            ofInt.setStartDelay(100L);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
            return;
        }
        InterfaceC87791Yct interfaceC87791Yct = this.LJLJJI;
        if (interfaceC87791Yct == null) {
            return;
        }
        interfaceC87791Yct.LIZ();
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
