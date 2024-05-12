package X;

import android.text.SpannableString;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;

/* renamed from: X.Ryg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71306Ryg {
    public final TextView LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public final String LJ;
    public final float LJFF;

    public final SpannableString LIZ(SpannableString spannableString) {
        if (this.LIZ.getLineCount() > this.LIZJ) {
            int i = 1;
            this.LIZLLL = true;
            TextPaint paint = this.LIZ.getPaint();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("  ...");
            LIZ.append(this.LJ);
            float measureText = paint.measureText(X1D.LIZIZ(LIZ));
            if (this.LJFF > 0.0f) {
                measureText = this.LIZ.getPaint().measureText("  ...") + this.LJFF;
            }
            if (this.LIZ.getLayout() == null) {
                return spannableString;
            }
            int lineStart = this.LIZ.getLayout().getLineStart(this.LIZJ - 1);
            int lineStart2 = this.LIZ.getLayout().getLineStart(this.LIZJ) - 1;
            float measureText2 = this.LIZ.getPaint().measureText(spannableString.subSequence(lineStart, lineStart2).toString());
            float f = (int) (this.LIZIZ - measureText);
            if (measureText2 > f) {
                float f2 = measureText2 - f;
                while (i < lineStart2 && this.LIZ.getPaint().measureText(spannableString.subSequence(lineStart2 - i, lineStart2).toString()) <= f2) {
                    i++;
                }
            } else {
                i = 0;
            }
            return SpannableString.valueOf(spannableString.subSequence(0, lineStart2 - i));
        }
        return spannableString;
    }

    public C71306Ryg(TuxTextView tuxTextView, int i, String str, int i2, float f) {
        this.LIZJ = 4;
        this.LIZ = tuxTextView;
        this.LIZIZ = i;
        this.LJ = str;
        this.LIZJ = i2;
        this.LJFF = f;
    }
}
