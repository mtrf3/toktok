package X;

import Y.AObjectS42S0101000_5;
import Y.IDObjectS175S0100000_2;
import android.content.Context;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.67d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1551767d extends C65A {
    public static final /* synthetic */ int LLIIII = 0;
    public int LJLJJLL;
    public Paint LJLJL;
    public TextPaint LJLJLJ;
    public Path LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public List<InteractTextStructWrap> LJZI;
    public boolean LJZL;
    public float LL;
    public float LLD;
    public int LLF;
    public InterfaceC159496Nt LLFF;
    public C68H LLFFF;
    public final C68U LLFII;
    public boolean LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public int LLII;

    public C1551767d() {
        throw null;
    }

    public void LJIIIZ(String str) {
    }

    public float LJIIJ() {
        return 6.0f;
    }

    public int getScene() {
        return 0;
    }

    private String[] getTextStr() {
        if (TextUtils.isEmpty(getText())) {
            return null;
        }
        Layout layout = getLayout();
        String obj = getText().toString();
        String[] strArr = new String[getLineCount()];
        int i = 0;
        int i2 = 0;
        while (i < getLineCount()) {
            int lineEnd = layout.getLineEnd(i);
            strArr[i] = obj.substring(i2, lineEnd);
            layout.getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        return strArr;
    }

    public int getAlign() {
        return this.LJLLILLLL;
    }

    public int getBgColor() {
        return this.LJZ;
    }

    public int getBgColorMode() {
        return this.LJLZ;
    }

    @Override // X.C65A
    public int getDefaultTextSize() {
        return this.LLII;
    }

    @Override // X.C65A
    public int getEditFontSize() {
        return this.LLF;
    }

    public int getMinTextSize() {
        return this.LLIFFJFJJ;
    }

    public List<InteractTextStructWrap> getTextStructWrapList() {
        return this.LJZI;
    }

    public static int LJIILIIL(int i) {
        return Color.argb(153, (16711680 & i) >> 16, (65280 & i) >> 8, i & 255);
    }

    public int LJII(int i) {
        if (C138855cf.LIZ()) {
            return i + this.LJLJJLL;
        }
        return i;
    }

    public int LJIIIIZZ(int i) {
        if (C138855cf.LIZ()) {
            return Math.max(i, getPaddingTop());
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0197 A[SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1551767d.onDraw(android.graphics.Canvas):void");
    }

    public void setAligin(int i) {
        this.LJLLILLLL = i;
        if (i == 1) {
            setGravity(3);
        } else if (i == 2) {
            setGravity(17);
        } else {
            if (i != 3) {
                return;
            }
            setGravity(5);
        }
    }

    public void setAutoSizeChangedListener(C68H c68h) {
        this.LLFFF = c68h;
    }

    @Override // X.C65A
    public void setDefaultTextSize(int i) {
        this.LLII = i;
    }

    @Override // X.C65A
    public void setEditFontSize(int i) {
        this.LLF = i;
    }

    public void setFontType(Typeface typeface) {
        boolean z;
        if (getTypeface() != typeface) {
            setTypeface(typeface);
            if (this.LJLJLJ.getTypeface() != typeface) {
                this.LJLJLJ.setTypeface(typeface);
            }
        }
        C68M LJIIJ = C68M.LJIIJ();
        int scene = getScene();
        if (LJIIJ.LJFF(scene) != null) {
            z = LJIIJ.LJFF(scene).LIZIZ();
        } else {
            z = false;
        }
        this.LJLLLLLL = z;
        if (z) {
            setMaskBlurColor(getCurrentTextColor());
        }
    }

    @Override // X.C65A
    public void setFontTypeChangedListener(InterfaceC159496Nt interfaceC159496Nt) {
        this.LLFF = interfaceC159496Nt;
    }

    public void setMaskBlurColor(int i) {
        setTextColor(-1);
        setShadowLayer(12.0f, 0.0f, 0.0f, i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        if (i > 0) {
            super.setMaxWidth(i);
        }
    }

    public void setMinTextSize(int i) {
        this.LLIFFJFJJ = i;
    }

    public void setMode(int i) {
        this.LJLLI = i;
    }

    public void setTextStructWrapList(List<InteractTextStructWrap> list) {
        this.LJZI = list;
    }

    public void setUseAutoTextSize(boolean z) {
        this.LLFZ = z;
    }

    public C1551767d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLL = -1;
        this.LJLLI = 1;
        this.LJLLILLLL = 2;
        this.LLF = getDefaultTextSize();
        this.LLFF = null;
        this.LLFFF = null;
        this.LLFII = new C68U(this);
        this.LLFZ = false;
        this.LLI = 0;
        this.LLII = 28;
        this.LJLJJLL = (int) C74275TDb.LIZIZ(context, LJIIJ());
        this.LJLLLL = (int) C74275TDb.LIZIZ(context, 5.0f);
        this.LLD = C74275TDb.LIZIZ(context, 4.0f);
        Paint paint = new Paint();
        this.LJLJL = paint;
        paint.setColor(this.LJLL);
        this.LJLJL.setStyle(Paint.Style.FILL);
        this.LJLJL.setAntiAlias(true);
        this.LJLJL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.LJLJL.setPathEffect(new CornerPathEffect(this.LJLLLL));
        this.LJLJLLL = new Path();
        setLayerType(1, null);
        setLineSpacing(this.LJLJJLL, getLineSpacingMultiplier());
        addTextChangedListener(new IDObjectS175S0100000_2(this, 11));
        TextPaint textPaint = new TextPaint();
        this.LJLJLJ = textPaint;
        textPaint.set(getPaint());
        this.LJLJLJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.LJLJLJ.setStyle(Paint.Style.FILL);
    }

    @Override // X.C65A
    public final void LJI(float f, int i) {
        float f2 = i;
        this.LJLJJLL = (int) ((f2 / getDefaultTextSize()) * C74275TDb.LIZIZ(getContext(), LJIIJ()));
        this.LJLLLL = (int) (C74275TDb.LIZIZ(getContext(), 5.0f) * (i / getDefaultTextSize()));
        this.LJLJL.setPathEffect(new CornerPathEffect(this.LJLLLL));
        setLineSpacing(this.LJLJJLL, getLineSpacingMultiplier());
        setTextSize(f2);
        setEditFontSize(i);
    }

    public int LJIIJJI(int i, String str) {
        float measureText;
        if (C138865cg.LIZ()) {
            measureText = getLayout().getLineWidth(i);
        } else {
            measureText = getPaint().measureText(str);
        }
        return (int) measureText;
    }

    public void LJIILJJIL(int i, int i2) {
        this.LJLZ = i;
        this.LJZ = i2;
        if (this.LJLLLLLL) {
            setMaskBlurColor(i2);
            this.LJLLI = 1;
            return;
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        if (i == 1) {
            this.LJLLI = 1;
            this.LJLL = i2;
            setBackground(null);
            setTextColor(i2);
            return;
        }
        if (i == 4) {
            this.LJLLI = 4;
            this.LJLL = i2;
            if (C138525c8.LIZ()) {
                this.LJLJLJ.setColor(C1553267s.LIZ(i2));
            } else {
                this.LJLJLJ.setColor(C1553767x.LIZ(i2));
            }
            setBackground(null);
            setTextColor(i2);
            setShadowLayer(12.0f, 0.0f, 0.0f, 0);
            if (Build.VERSION.SDK_INT < 28) {
                return;
            }
            setFallbackLineSpacing(false);
            return;
        }
        if (i == 2) {
            this.LJLLI = 2;
            this.LJLL = i2;
            setTextColor(C1553267s.LIZIZ(i2));
        } else {
            if (i != 3) {
                return;
            }
            this.LJLLI = 3;
            this.LJLL = LJIILIIL(i2);
            setTextColor(-1);
        }
    }

    public final void LJIILL(int i, String str) {
        if (str == null) {
            return;
        }
        this.LJZL = true;
        if (!C68W.LJIIL(str.length(), this.LJZI)) {
            setText(str);
            setSelection(Math.min(i, getText().toString().length()));
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        final Drawable drawable = getContext().getResources().getDrawable(R.drawable.b4x);
        this.LL = getTextSize() * 0.7f;
        float f = this.LL;
        drawable.setBounds(new Rect(0, 0, (int) f, (int) f));
        for (InteractTextStructWrap interactTextStructWrap : this.LJZI) {
            if (interactTextStructWrap.isValid(str.length())) {
                final float f2 = this.LLD;
                spannableString.setSpan(new C6B5(drawable, f2) { // from class: X.686
                    public final float LJLJI;

                    {
                        this.LJLJI = f2;
                    }

                    @Override // X.C6B5, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                        o.LJIIIZ(paint, "paint");
                        return (int) (super.getSize(paint, charSequence, i2, i3, fontMetricsInt) + this.LJLJI);
                    }
                }, interactTextStructWrap.getRange().getStart() + 1, interactTextStructWrap.getRange().getStart() + 2, 33);
                spannableString.setSpan(new UnderlineSpan(), interactTextStructWrap.getRange().getStart() + 2, interactTextStructWrap.getRange().getEnd() - 1, 33);
            }
        }
        setText(spannableString);
        setSelection(Math.min(i, getText().toString().length()));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLLJ = getMeasuredWidth() / 2;
        this.LJLLL = (getLineHeight() - this.LJLJJLL) / 2;
        this.LLI = i2;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (getText() != null && i == i2) {
            if (C68W.LJIIL(getText().length(), this.LJZI)) {
                for (InteractTextStructWrap interactTextStructWrap : this.LJZI) {
                    if (i > interactTextStructWrap.getRange().getStart() && i < interactTextStructWrap.getRange().getEnd()) {
                        setSelection(Math.min(interactTextStructWrap.getRange().getEnd(), getText().toString().length()));
                        return;
                    }
                }
            }
        }
    }

    public int LJIIL(int i, int i2, int i3) {
        if (C138865cg.LIZ()) {
            int lineBottom = (getLayout().getLineBottom(i) - getLayout().getLineTop(i)) - this.LJLJJLL;
            if (i == 0) {
                if (i2 == 1) {
                    return lineBottom;
                }
                return lineBottom + getLayout().getTopPadding();
            }
            if (i != i2 - 1) {
                return lineBottom;
            }
            return (lineBottom - getLayout().getBottomPadding()) + this.LJLJJLL;
        }
        return i3;
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        if (getLineCount() > 20) {
            LJIILL(getText().length(), getText().toString().substring(0, r2.length() - 1));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLFZ) {
            this.LLFII.LIZ(this.LLI, this.LLF, getDefaultTextSize(), this.LLIFFJFJJ, new AObjectS42S0101000_5(4, this, 46));
        }
    }
}
