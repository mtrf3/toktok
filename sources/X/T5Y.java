package X;

import android.graphics.RectF;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T5Y {
    public final TextView LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final int LJ;
    public final RectF LJFF;
    public int[] LJI;
    public TextPaint LJII;
    public boolean LJIIIIZZ;
    public final T5Z LJIIIZ;

    public static void LIZIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "6559539482995714056")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    static {
        new ConcurrentHashMap();
    }

    public T5Y(TuxTextView textView) {
        o.LJIIIZ(textView, "textView");
        this.LIZ = textView;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJ = 1;
        this.LJFF = new RectF();
        this.LJI = new int[0];
        this.LJIIIZ = new T5Z();
    }

    public final void LIZ(int i) {
        int measuredWidth;
        if (this.LIZIZ) {
            if (this.LIZ.getMeasuredHeight() <= 0 || this.LIZ.getMeasuredWidth() <= 0) {
                return;
            }
            if (((Boolean) C74066T5a.LIZIZ(this.LIZ, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue()) {
                measuredWidth = 1048576;
            } else {
                measuredWidth = (this.LIZ.getMeasuredWidth() - this.LIZ.getTotalPaddingLeft()) - this.LIZ.getTotalPaddingRight();
            }
            if (this.LJIIIIZZ && this.LIZ.getMinWidth() != this.LIZ.getMeasuredWidth() && this.LIZ.getMaxWidth() != this.LIZ.getMeasuredWidth()) {
                return;
            }
            int height = (this.LIZ.getHeight() - this.LIZ.getCompoundPaddingBottom()) - this.LIZ.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            synchronized (this.LJFF) {
                this.LJFF.setEmpty();
                RectF rectF = this.LJFF;
                rectF.right = measuredWidth;
                rectF.bottom = height;
                float LIZJ = LIZJ(rectF, i);
                if (LIZJ != this.LIZ.getTextSize()) {
                    LIZLLL(LIZJ);
                }
            }
        }
        this.LIZIZ = true;
    }

    public final void LIZLLL(float f) {
        if (f == this.LIZ.getPaint().getTextSize()) {
            return;
        }
        this.LIZ.getPaint().setTextSize(f);
        boolean isInLayout = this.LIZ.isInLayout();
        if (this.LIZ.getLayout() == null) {
            return;
        }
        this.LIZIZ = false;
        try {
            Method LIZ = C74066T5a.LIZ("nullLayouts");
            if (LIZ != null) {
                LIZIZ(this.LIZ, LIZ, new Object[0]);
            }
        } catch (Exception unused) {
        }
        if (!isInLayout) {
            this.LIZ.requestLayout();
        } else {
            this.LIZ.forceLayout();
        }
        this.LIZ.invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x011f, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r7.LJIIIZ, X.C74066T5a.LIZIZ(r5, android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic")) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013d, code lost:
    
        if (r7.LJIIJ.equalsForTextMeasurement(r7.LJIIJJI) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01cd, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r5.getFontVariationSettings(), r7.LJIIJ.getFontVariationSettings()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZJ(android.graphics.RectF r18, int r19) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5Y.LIZJ(android.graphics.RectF, int):int");
    }
}
