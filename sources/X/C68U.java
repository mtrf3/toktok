package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* renamed from: X.68U, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C68U {
    public final TextView LIZ;
    public int LIZIZ;
    public int LIZJ;

    public C68U(TextView textView) {
        o.LJIIIZ(textView, "textView");
        this.LIZ = textView;
    }

    public final int LIZIZ(int i) {
        float textSize = this.LIZ.getTextSize();
        this.LIZ.setTextSize(i);
        TextView textView = this.LIZ;
        textView.measure(View.MeasureSpec.makeMeasureSpec(textView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(C60996Nwm.LJFF(this.LIZ.getContext()), LiveLayoutPreloadThreadPriority.DEFAULT));
        int measuredHeight = this.LIZ.getMeasuredHeight();
        this.LIZ.setTextSize(0, textSize);
        return measuredHeight;
    }

    public final void LIZ(int i, int i2, int i3, int i4, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        int size;
        View view;
        int i5 = this.LIZJ;
        if (i5 > 0) {
            LIZJ(i2, i3, i4, i5, interfaceC88472Yns);
            return;
        }
        C68V c68v = new C68V(this, i2, i3, i4, interfaceC88472Yns);
        TextView textView = this.LIZ;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            Object parent = textView.getParent();
            if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                size = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
            } else {
                size = textView.getResources().getDisplayMetrics().heightPixels;
            }
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        c68v.invoke(Integer.valueOf(textView.getMeasuredHeight()), Integer.valueOf(size));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r5, int r6, int r7, int r8, X.InterfaceC88472Yns<? super java.lang.Integer, X.C76800UCe> r9) {
        /*
            r4 = this;
            android.widget.TextView r0 = r4.LIZ
            java.lang.CharSequence r0 = r0.getText()
            r3 = 0
            if (r0 == 0) goto L42
            int r1 = r0.length()
        Ld:
            int r0 = r4.LIZIZ
            int r0 = r1 - r0
            r4.LIZIZ = r1
            if (r0 <= 0) goto L3d
            r1 = 1
        L16:
            r2 = 0
            if (r0 == 0) goto L56
        L19:
            android.widget.TextView r0 = r4.LIZ
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L5c
            int r0 = r4.LIZIZ(r5)
            if (r1 == 0) goto L44
            r1 = r5
        L2e:
            if (r0 < r8) goto L58
            if (r3 != 0) goto L58
            int r1 = r1 + (-1)
            if (r1 > r7) goto L38
            r1 = r7
            r3 = 1
        L38:
            int r0 = r4.LIZIZ(r1)
            goto L2e
        L3d:
            r1 = 0
            if (r0 >= 0) goto L16
            r2 = 1
            goto L19
        L42:
            r1 = 0
            goto Ld
        L44:
            r1 = r5
            if (r2 == 0) goto L58
        L47:
            if (r0 > r8) goto L58
            if (r3 != 0) goto L58
            int r1 = r1 + 1
            if (r1 < r6) goto L51
            r1 = r6
            r3 = 1
        L51:
            int r0 = r4.LIZIZ(r1)
            goto L47
        L56:
            r6 = r5
            goto L5c
        L58:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L66
        L5c:
            if (r6 == r5) goto L65
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r9.invoke(r0)
        L65:
            return
        L66:
            r6 = r1
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68U.LIZJ(int, int, int, int, X.Yns):void");
    }
}
