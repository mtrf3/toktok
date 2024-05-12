package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.67U, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67U extends C67V {
    public int LJJJJJ;
    public int LJJJJJL;

    @Override // X.C67V
    public final float LJ() {
        return 20.0f;
    }

    @Override // X.C67V
    public final float LJIILLIIL(float f, float f2, int i) {
        return f + f2;
    }

    @Override // X.C67V
    public final int LJIILJJIL() {
        Paint.FontMetrics fontMetrics = this.LJJIIZI.getFontMetrics();
        return (int) (((int) (fontMetrics.descent - fontMetrics.ascent)) + this.LJJI);
    }

    @Override // X.C67V
    public final int LJIILIIL() {
        return this.LJJJJJL;
    }

    @Override // X.C67V
    public final int LIZIZ(int i) {
        return Math.min(i, this.LJJJJJL);
    }

    @Override // X.C67V
    public final TextStickerString[] LIZLLL(TextStickerString[] textStickerStringArr) {
        int LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL == 0) {
            return textStickerStringArr;
        }
        int i = this.LJJJJJ / LJIILJJIL;
        if (textStickerStringArr != null) {
            int length = textStickerStringArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                TextPaint mPaint = this.LJJIIZI;
                o.LJIIIIZZ(mPaint, "mPaint");
                if (C68W.LJIIIIZZ(mPaint, textStickerStringArr[i2].getStr(), 0, textStickerStringArr[i2].getStr().length()) > this.LJJJJJL) {
                    String str = textStickerStringArr[i2].getStr();
                    TextPaint mPaint2 = this.LJJIIZI;
                    o.LJIIIIZZ(mPaint2, "mPaint");
                    int length2 = str.length();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            break;
                        }
                        int i5 = i3 + 1;
                        i4 += C68W.LJIIIIZZ(mPaint2, str, i3, i5);
                        if (i4 > this.LJJJJJL) {
                            str = str.substring(0, i3);
                            o.LJIIIIZZ(str, "this as java.lang.String…ing(startIndex, endIndex)");
                            break;
                        }
                        i3 = i5;
                    }
                    textStickerStringArr[i2] = new TextStickerString(str);
                }
            }
        }
        if (textStickerStringArr == null) {
            return null;
        }
        if (textStickerStringArr.length > i && i > 0) {
            return (TextStickerString[]) Arrays.copyOf(textStickerStringArr, i);
        }
        return textStickerStringArr;
    }

    @Override // X.C67V
    public final float LIZ(float f, TextStickerString[] textStickerStringArr) {
        int LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL == 0) {
            return f;
        }
        int i = (int) (((this.LJJJJJ * 4) / 5.0f) / LJIILJJIL);
        if (textStickerStringArr != null && textStickerStringArr.length < i) {
            return (f * 9) / 10.0f;
        }
        return f;
    }

    @Override // X.C67V
    public final void LJIJ(C67P c67p, Context context) {
        super.LJIJ(c67p, context);
        this.LJJJJJL = (int) (C60996Nwm.LJIIJ(context) - KL2.LIZJ(context, 96.0f));
    }
}
