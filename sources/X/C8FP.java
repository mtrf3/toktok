package X;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* renamed from: X.8FP, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8FP extends LinkMovementMethod {
    public static C8FP LJFF;
    public static C8FP LJI;
    public long LIZIZ;
    public final TextPaint LIZJ = new TextPaint();
    public boolean LIZLLL = true;
    public final Paint.FontMetricsInt LJ = new Paint.FontMetricsInt();
    public final long LIZ = ViewConfiguration.getLongPressTimeout();

    public void LIZ(TextView textView, ClickableSpan clickableSpan) {
    }

    public void LIZIZ(ClickableSpan clickableSpan) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        if (r2 == (-1)) goto L32;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.widget.TextView r23, android.text.Spannable r24, android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8FP.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
