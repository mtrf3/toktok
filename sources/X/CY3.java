package X;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import defpackage.a1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CY3 extends CY1 {
    public String LLFFF;
    public final java.util.Map<String, Float> LLFII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CY3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLFFF = "";
        this.LLFII = C113554cx.LJJLIIIIJ(new OSZ("", Float.valueOf(0.0f)));
    }

    public final void LJJJJ(String textStringWithQuantity, String numberFormatString, float f) {
        float LJJJI;
        o.LJIIIZ(textStringWithQuantity, "textStringWithQuantity");
        o.LJIIIZ(numberFormatString, "numberFormatString");
        if (!getAlreadyMeasureGivenText()) {
            LJJJ();
        }
        boolean z = !o.LJ(this.LJZ, getText());
        if (!z && o.LJ(textStringWithQuantity, getText())) {
            return;
        }
        String LJJJJZI = ujb.o.LJJJJZI(textStringWithQuantity, numberFormatString, "", false);
        boolean z2 = !o.LJ(LJJJJZI, this.LLFFF);
        boolean LJJJIL = LJJJIL(numberFormatString);
        Float f2 = (Float) ((LinkedHashMap) this.LLFII).get(LJJJJZI);
        if (f2 != null) {
            LJJJI = f2.floatValue();
        } else {
            TextPaint paint = getPaint();
            o.LJIIIIZZ(paint, "paint");
            LJJJI = CY1.LJJJI(paint, LJJJJZI);
            this.LLFII.put(LJJJJZI, Float.valueOf(LJJJI));
        }
        if (z || z2 || LJJJIL) {
            int i = (int) (LJJJI + getCurrentNumberFormatStringAnalysisResult().LIZLLL + f);
            int textMeasureMaxWidth = getTextMeasureMaxWidth();
            if (i > textMeasureMaxWidth) {
                i = textMeasureMaxWidth;
            }
            if (i != getLayoutParams().width) {
                getLayoutParams().width = i;
                setLayoutParams(getLayoutParams());
            }
        }
        setCurrentText(textStringWithQuantity);
        setCurrentNumberFormatString(numberFormatString);
        this.LLFFF = LJJJJZI;
        setText(textStringWithQuantity);
    }
}
