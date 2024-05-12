package X;

import android.widget.TextView;
import java.text.DecimalFormat;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W2V implements Runnable {
    public final /* synthetic */ WOC LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    public W2V(WOC woc, long j, long j2, long j3) {
        this.LJLIL = woc;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
    }

    public final void LIZ() {
        float measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        WOC woc = this.LJLIL;
        long j = this.LJLILLLLZI;
        long j2 = this.LJLJI;
        long j3 = this.LJLJJI;
        float f = ((float) (j - j2)) * 1.0f;
        if (woc.LJLIL != null) {
            float max = Math.max(0.0f, (f * r0.getMeasuredWidth()) / ((float) j3));
            TextView textView = this.LJLIL.LJLJJLL;
            if (textView != null) {
                StringBuilder LIZ = X1D.LIZ();
                String format = new DecimalFormat("0.0").format(Float.valueOf(((float) (this.LJLILLLLZI - this.LJLJI)) / 1000.0f));
                o.LJIIIIZZ(format, "DecimalFormat(\"0.0\").format(this)");
                LIZ.append(format);
                LIZ.append('s');
                textView.setText(X1D.LIZIZ(LIZ));
                WOC woc2 = this.LJLIL;
                TextView textView2 = woc2.LJLJJLL;
                if (textView2 != null) {
                    if (C173636rf.LIZIZ(woc2.mActivity)) {
                        float f2 = -max;
                        if (this.LJLIL.LJLIL != null) {
                            measuredWidth = f2 / r0.getMeasuredWidth();
                            GestureDetectorOnGestureListenerC81986WFq gestureDetectorOnGestureListenerC81986WFq = this.LJLIL.LJLIL;
                            if (gestureDetectorOnGestureListenerC81986WFq != null) {
                                measuredWidth2 = gestureDetectorOnGestureListenerC81986WFq.getMeasuredWidth();
                                TextView textView3 = this.LJLIL.LJLJJLL;
                                if (textView3 != null) {
                                    measuredWidth3 = textView3.getMeasuredWidth();
                                } else {
                                    o.LJIJI("anchorTextView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("volumeTapsView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("volumeTapsView");
                            throw null;
                        }
                    } else {
                        if (this.LJLIL.LJLIL != null) {
                            measuredWidth = max / r0.getMeasuredWidth();
                            GestureDetectorOnGestureListenerC81986WFq gestureDetectorOnGestureListenerC81986WFq2 = this.LJLIL.LJLIL;
                            if (gestureDetectorOnGestureListenerC81986WFq2 != null) {
                                measuredWidth2 = gestureDetectorOnGestureListenerC81986WFq2.getMeasuredWidth();
                                TextView textView4 = this.LJLIL.LJLJJLL;
                                if (textView4 != null) {
                                    measuredWidth3 = textView4.getMeasuredWidth();
                                } else {
                                    o.LJIJI("anchorTextView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("volumeTapsView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("volumeTapsView");
                            throw null;
                        }
                    }
                    textView2.setTranslationX(measuredWidth * (measuredWidth2 - measuredWidth3));
                    WOC woc3 = this.LJLIL;
                    TextView textView5 = woc3.LJLJJL;
                    if (textView5 != null) {
                        textView5.setAlpha(woc3.LLJILJILJ(max));
                        WOC woc4 = this.LJLIL;
                        TextView textView6 = woc4.LJLJJI;
                        if (textView6 != null) {
                            if (woc4.LJLIL != null) {
                                textView6.setAlpha(woc4.LLJILJILJ(r0.getMeasuredWidth() - max));
                                return;
                            } else {
                                o.LJIJI("volumeTapsView");
                                throw null;
                            }
                        }
                        o.LJIJI("startTextView");
                        throw null;
                    }
                    o.LJIJI("endTextView");
                    throw null;
                }
                o.LJIJI("anchorTextView");
                throw null;
            }
            o.LJIJI("anchorTextView");
            throw null;
        }
        o.LJIJI("volumeTapsView");
        throw null;
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
