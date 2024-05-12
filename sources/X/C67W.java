package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.67W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67W extends C67V {
    public SpannableStringBuilder LJJJJJ;
    public StaticLayout LJJJJJL;
    public int LJJJJL;
    public final C62822Ol8 LJJJJLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 765));

    @Override // X.C67V
    public final int LJIIZILJ(int i) {
        StaticLayout staticLayout = this.LJJJJJL;
        if (staticLayout != null) {
            return staticLayout.getHeight();
        }
        return super.LJIIZILJ(i);
    }

    @Override // X.C67V
    public final int LJIJI(int i) {
        StaticLayout staticLayout = this.LJJJJJL;
        if (staticLayout != null) {
            return O6R.LJJIIZ(staticLayout.getLineWidth(i));
        }
        return 0;
    }

    @Override // X.C67V
    public final void LJIJJ(List<TextStickerTextWrap> list) {
        super.LJIJJ(list);
    }

    public final void LJIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Paint.Style style = this.LJJIIZI.getStyle();
        this.LJJIIZI.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint.Cap strokeCap = this.LJJIIZI.getStrokeCap();
        this.LJJIIZI.setStrokeCap(Paint.Cap.ROUND);
        Paint.Join strokeJoin = this.LJJIIZI.getStrokeJoin();
        this.LJJIIZI.setStrokeJoin(Paint.Join.ROUND);
        float strokeWidth = this.LJJIIZI.getStrokeWidth();
        this.LJJIIZI.setStrokeWidth(this.LJJJIL);
        interfaceC65784Pro.invoke();
        this.LJJIIZI.setStyle(style);
        this.LJJIIZI.setStrokeCap(strokeCap);
        this.LJJIIZI.setStrokeJoin(strokeJoin);
        this.LJJIIZI.setStrokeWidth(strokeWidth);
    }

    public final StaticLayout LJIJJLI(int i, Layout.Alignment alignment) {
        if (this.LJJJJJ == null) {
            this.LJJJJJ = null;
        }
        CharSequence charSequence = this.LJJJJJ;
        if (charSequence == null) {
            if (this.LJIJJLI == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            TextStickerString[] mStickerStringArray = this.LJIJJLI;
            o.LJIIIIZZ(mStickerStringArray, "mStickerStringArray");
            for (TextStickerString textStickerString : mStickerStringArray) {
                sb.append(textStickerString.getStr());
                if (!ujb.o.LJJJJ(textStickerString.getStr(), "\n", false)) {
                    sb.append("\n");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            charSequence = sb.toString();
            o.LJIIIIZZ(charSequence, "sb.toString()");
        }
        if (charSequence == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.LJJIIZI, i).setIncludePad(false).setAlignment(alignment).setLineSpacing(this.LJJI, 1.0f).build();
        }
        return new StaticLayout(charSequence, this.LJJIIZI, i, alignment, 1.0f, this.LJJI, false);
    }

    @Override // X.C67V
    public final void LJIIIZ(Canvas canvas, C1553867y config, ArrayList<PointF[]> arrayList) {
        int i;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(config, "config");
        PointF pointF = config.LIZJ;
        this.LJJIJL = pointF.x;
        this.LJJIJLIJ = pointF.y;
        this.LJJIIZI.setTextSize(config.LJ * config.LIZ);
        Context mContext = this.LIZ;
        o.LJIIIIZZ(mContext, "mContext");
        this.LJJJIL = C1553767x.LIZIZ(mContext, this.LJJIIZI.getTextSize());
        this.LJJIIZI.getFontMetrics(this.LJJJJ);
        float f = 2;
        this.LJJIJLIJ = (this.LJJJJ.bottom * f) + this.LJJIJLIJ;
        this.LJJIZ = config.LIZIZ;
        float f2 = this.LJJIFFI;
        float f3 = config.LIZ;
        float f4 = f2 * f3;
        this.LJJ = f4;
        float f5 = this.LJJII;
        float f6 = f3 * f5;
        this.LJJI = f6;
        if (f6 >= f5) {
            this.LJJI = f5;
        }
        if (f4 >= f2) {
            this.LJJ = f2;
        }
        if (this.LJJJJJ != null || this.LJIJJLI != null) {
            StaticLayout LJIJJLI = LJIJJLI(Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL);
            this.LJJJJJL = LJIJJLI;
            if (LJIJJLI != null) {
                i = LJIJJLI.getLineCount();
            } else {
                i = 0;
            }
            StaticLayout staticLayout = this.LJJJJJL;
            float f7 = 0.0f;
            if (staticLayout != null) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (f7 < staticLayout.getLineWidth(i2)) {
                        f7 = staticLayout.getLineWidth(i2);
                    }
                }
            }
            int i3 = config.LIZLLL;
            if (i3 == 1) {
                this.LJJIJL -= f7 / f;
            } else if (i3 == 3) {
                this.LJJIJL = (f7 / f) + this.LJJIJL;
            }
            this.LJJJJL = (int) f7;
        }
        LIZJ(this.LJJIJL, this.LJJIJLIJ, config.LIZ, config.LIZLLL, this.LJIILLIIL, arrayList);
        if (this.LJIILLIIL && this.LJIIZILJ) {
            this.LJIIZILJ = false;
            float LJIIJ = C60996Nwm.LJIIJ(this.LJJIJIL.getContext()) - (C170576mj.LIZ(this.LJJIJIL.getContext(), 54.0f) * f);
            if (this.LIZIZ.width() > LJIIJ) {
                float width = (config.LIZ * LJIIJ) / this.LIZIZ.width();
                this.LJJIJIL.LJLJJI.LIZ = width;
                config.LIZ = width;
                LJIIIZ(canvas, config, null);
                return;
            }
        }
        LJII(canvas, config.LIZIZ, config.LJI);
        LJIIIIZZ(canvas, this.LJJIJL, this.LJJIJLIJ, config.LIZIZ, config.LIZ, config.LIZLLL);
        LJFF(canvas, config.LIZIZ, config.LJFF);
        LJI(canvas, config.LIZIZ, this.LJIILLIIL);
    }

    @Override // X.C67V
    public final int LJIILL(int i, int i2, int i3) {
        float f;
        StaticLayout staticLayout = this.LJJJJJL;
        if (staticLayout == null) {
            return i3;
        }
        float lineBottom = (staticLayout.getLineBottom(i) - staticLayout.getLineTop(i)) - this.LJJI;
        if (i == 0) {
            f = staticLayout.getTopPadding();
        } else {
            if (i == i2 - 1) {
                lineBottom -= staticLayout.getBottomPadding();
                f = this.LJJI;
            }
            return (int) lineBottom;
        }
        lineBottom += f;
        return (int) lineBottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    @Override // X.C67V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(android.graphics.Canvas r6, float r7, float r8, float r9, float r10, int r11) {
        /*
            r5 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r6.save()
            android.graphics.RectF r0 = r5.LIZJ
            float r1 = r0.centerX()
            android.graphics.RectF r0 = r5.LIZJ
            float r0 = r0.centerY()
            r6.rotate(r9, r1, r0)
            r4 = 3
            r3 = 2
            if (r11 == r3) goto L50
            if (r11 == r4) goto L54
        L1d:
            android.text.StaticLayout r2 = r5.LJJJJJL
            if (r2 == 0) goto L6a
            android.graphics.RectF r0 = r5.LIZJ
            float r1 = r0.centerY()
            int r0 = r2.getHeight()
            int r0 = r0 / r3
            float r0 = (float) r0
            float r1 = r1 - r0
            r6.translate(r7, r1)
            r0 = 1
            if (r11 == r0) goto L4d
            if (r11 == r3) goto L4a
            if (r11 == r4) goto L47
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
        L3a:
            int r0 = r5.LJJJJL
            int r0 = r0 + 5
            android.text.StaticLayout r2 = r5.LJIJJLI(r0, r1)
            r5.LJJJJJL = r2
            if (r2 != 0) goto L59
            return
        L47:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L3a
        L4a:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L3a
        L4d:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L3a
        L50:
            int r0 = r5.LJJJJL
            int r0 = r0 / r3
            goto L56
        L54:
            int r0 = r5.LJJJJL
        L56:
            float r0 = (float) r0
            float r7 = r7 - r0
            goto L1d
        L59:
            boolean r0 = r5.LJJJI
            if (r0 == 0) goto L67
            kotlin.jvm.internal.AqS91S0300000_2 r1 = new kotlin.jvm.internal.AqS91S0300000_2
            r0 = 14
            r1.<init>(r6, r2, r5, r0)
            r5.LJIL(r1)
        L67:
            r2.draw(r6)
        L6a:
            r0 = 0
            r5.LJJJJJL = r0
            r6.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67W.LJIIIIZZ(android.graphics.Canvas, float, float, float, float, int):void");
    }
}
