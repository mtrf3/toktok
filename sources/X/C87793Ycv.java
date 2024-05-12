package X;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import kotlin.jvm.internal.o;

/* renamed from: X.Ycv, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87793Ycv extends AbstractC87817YdJ {
    public RunnableC87795Ycx LJIILJJIL;
    public int LJIILL;
    public ValueAnimator LJIILLIIL;
    public boolean LJIIZILJ;

    @Override // X.AbstractC87817YdJ
    public final void LJ(C31521CYr textInfo) {
        int i;
        o.LJIIIZ(textInfo, "textInfo");
        CharSequence text = this.LJI.getText();
        int i2 = 0;
        if (this.LJI.getVisibility() == 0 && !o.LJ(text, "")) {
            this.LJI.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            Layout layout = this.LJI.getLayout();
            if (layout != null) {
                i = (int) layout.getLineWidth(0);
            } else {
                i = 0;
            }
            if (i > this.LJI.getWidth()) {
                int i3 = this.LJIILL + 1;
                this.LJIILL = i3;
                if (i3 == 0) {
                    RunnableC87795Ycx runnableC87795Ycx = this.LJIILJJIL;
                    this.LJIILJJIL = null;
                    if (runnableC87795Ycx != null) {
                        runnableC87795Ycx.run();
                    }
                }
                TextView textView = this.LJI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append((Object) text);
                LIZ.append("     ");
                textView.setText(X1D.LIZIZ(LIZ));
                this.LJI.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                Layout layout2 = this.LJI.getLayout();
                if (layout2 != null) {
                    i2 = (int) layout2.getLineWidth(0);
                }
                TextView textView2 = this.LJI;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append((Object) text);
                LIZ2.append("     ");
                LIZ2.append((Object) text);
                textView2.setText(X1D.LIZIZ(LIZ2));
                this.LJI.post(new RunnableC87800Yd2(this, i2, text));
                return;
            }
            this.LIZIZ.LJIIL = false;
            LJII(false);
            return;
        }
        this.LIZIZ.LJIIL = false;
        LJII(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87793Ycv(CardView contentView, C87818YdK dataHolder) {
        super(contentView, dataHolder);
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(dataHolder, "dataHolder");
    }
}
