package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextUnderlineIndexRange;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.67c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1551667c extends C65A {
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
    public boolean LL;
    public int LLD;
    public int LLF;
    public float LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public int LLFZ;
    public final int LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public final C62822Ol8 LLIIII;
    public C68H LLIIIILZ;
    public float LLIIIJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1551667c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    private final int getScene() {
        return 0;
    }

    @Override // X.C65A
    public void setFontTypeChangedListener(InterfaceC159496Nt interfaceC159496Nt) {
    }

    private final C68U getHeightMeasureHelper() {
        return (C68U) this.LLIIII.getValue();
    }

    private final int getPositivePadding() {
        int i = this.LJLJJLL;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    private final String[] getTextStr() {
        if (TextUtils.isEmpty(getText())) {
            return null;
        }
        Layout layout = getLayout();
        String valueOf = String.valueOf(getText());
        String[] strArr = new String[getLineCount()];
        int lineCount = getLineCount();
        int i = 0;
        int i2 = 0;
        while (i < lineCount) {
            int lineEnd = layout.getLineEnd(i);
            String substring = valueOf.substring(i2, lineEnd);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            strArr[i] = substring;
            layout.getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        return strArr;
    }

    public final int getAlign() {
        return this.LJLLILLLL;
    }

    public final C68H getAutoSizeListener() {
        return this.LLIIIILZ;
    }

    public final int getBgColor() {
        return this.LJZ;
    }

    public final int getBgColorMode() {
        return this.LJLZ;
    }

    @Override // X.C65A
    public int getDefaultTextSize() {
        return this.LLIFFJFJJ;
    }

    @Override // X.C65A
    public int getEditFontSize() {
        return this.LLII;
    }

    public final boolean getInEdit() {
        return this.LLFFF;
    }

    public final int getMaxMeasuredWidth() {
        return this.LLD;
    }

    public final boolean getNeedUnspecialiedMeasure() {
        return this.LL;
    }

    public final int getOriginTextSize() {
        return this.LLF;
    }

    public final float getRealFontSize() {
        return this.LLIIIJ;
    }

    public final float getTextSizeScaleValue() {
        return this.LLFF;
    }

    public final List<InteractTextStructWrap> getTextStructWrapList() {
        return this.LJZI;
    }

    public final boolean getUseAutoTextSize() {
        return this.LLFII;
    }

    private final void setMaskBlurColor(int i) {
        setTextColor(-1);
        setShadowLayer(12.0f, 0.0f, 0.0f, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x029e, code lost:
    
        if (r13 == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b7, code lost:
    
        if (r17.subSequence(r12, r14 + 1).toString().length() == 0) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0273  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r26) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1551667c.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLFFF) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setAligin(int i) {
        this.LJLLILLLL = i;
        if (i == 1) {
            setGravity(8388611);
        } else if (i == 2) {
            setGravity(17);
        } else {
            if (i != 3) {
                return;
            }
            setGravity(8388613);
        }
    }

    public final void setAutoSizeListener(C68H c68h) {
        this.LLIIIILZ = c68h;
    }

    @Override // X.C65A
    public void setDefaultTextSize(int i) {
        this.LLIFFJFJJ = i;
    }

    @Override // X.C65A
    public void setEditFontSize(int i) {
        this.LLII = i;
    }

    public final void setFontType(Typeface typeface) {
        boolean z;
        TextPaint textPaint;
        if (typeface == null) {
            return;
        }
        TextFontStyleData textFontStyleData = C68M.LJIIJ().LIZ.get(C68M.LJIIJ().LJIIJJI(typeface));
        if (getTypeface() != typeface) {
            setTypeface(typeface);
            TextPaint textPaint2 = this.LJLJLJ;
            if ((textPaint2 == null || textPaint2.getTypeface() != typeface) && (textPaint = this.LJLJLJ) != null) {
                textPaint.setTypeface(typeface);
            }
        }
        if (textFontStyleData != null) {
            z = textFontStyleData.LIZIZ();
        } else {
            z = false;
        }
        this.LJLLLLLL = z;
        if (z) {
            setMaskBlurColor(getCurrentTextColor());
        }
    }

    public final void setInEdit(boolean z) {
        this.LLFFF = z;
    }

    public final void setMaxMeasuredWidth(int i) {
        this.LLD = i;
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        if (i > 0) {
            super.setMaxWidth(i);
        }
    }

    public final void setMode(int i) {
        this.LJLLI = i;
    }

    public final void setNeedUnspecialiedMeasure(boolean z) {
        this.LL = z;
    }

    public final void setOriginTextSize(int i) {
        this.LLF = i;
    }

    public final void setRealFontSize(float f) {
        this.LLIIIJ = f;
    }

    public final void setTextSizeScaleValue(float f) {
        this.LLFF = f;
    }

    public final void setTextStructWrapList(List<InteractTextStructWrap> list) {
        this.LJZI = list;
    }

    public final void setUseAutoTextSize(boolean z) {
        this.LLFII = z;
    }

    @Override // X.C65A
    public final void LJI(float f, int i) {
        if (this.LLF == -1) {
            this.LLF = i;
            this.LLFF = i / this.LLIIIJ;
        }
        float f2 = i;
        this.LJLJJLL = (int) ((f2 / this.LLIIIJ) * f);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        this.LJLLLL = (int) ((f2 / this.LLIIIJ) * C74275TDb.LIZIZ(context, 5.0f));
        Paint paint = this.LJLJL;
        if (paint != null) {
            paint.setPathEffect(new CornerPathEffect(this.LJLLLL));
        }
        setLineSpacing(this.LJLJJLL, getLineSpacingMultiplier());
        setTextSize(f2);
        if (this.LL) {
            int positivePadding = getPositivePadding();
            V2B.LJIILL(this, positivePadding, positivePadding, positivePadding, positivePadding);
        }
        setEditFontSize(i);
    }

    public final int LJII(int i, String[] strArr) {
        float measureText;
        if (C138865cg.LIZ()) {
            measureText = getLayout().getLineWidth(i);
        } else {
            measureText = getPaint().measureText(strArr[i]);
        }
        return (int) measureText;
    }

    public final void LJIIIIZZ(int i, int i2) {
        int LIZ;
        this.LJLZ = i;
        this.LJZ = i2;
        if (this.LJLLLLLL) {
            setMaskBlurColor(i2);
            this.LJLLI = 1;
            return;
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    this.LJLLI = 4;
                    this.LJLL = i2;
                    TextPaint textPaint = this.LJLJLJ;
                    if (textPaint != null) {
                        if (C138525c8.LIZ()) {
                            LIZ = C1553267s.LIZ(i2);
                        } else {
                            LIZ = C1553767x.LIZ(i2);
                        }
                        textPaint.setColor(LIZ);
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
                this.LJLLI = 3;
                this.LJLL = Color.argb(153, (16711680 & i2) >> 16, (65280 & i2) >> 8, i2 & 255);
                setTextColor(-1);
                return;
            }
            this.LJLLI = 2;
            this.LJLL = i2;
            setTextColor(C1553267s.LIZIZ(i2));
            return;
        }
        this.LJLLI = 1;
        this.LJLL = i2;
        setBackground(null);
        setTextColor(i2);
    }

    public final void LJIIIZ(int i, CharSequence charSequence) {
        this.LJZL = true;
        if (!C68W.LJIIL(charSequence.length(), this.LJZI)) {
            setText(charSequence);
            setSelection(Math.min(i, String.valueOf(getText()).length()));
        } else {
            setText(charSequence);
            setSelection(Math.min(i, String.valueOf(getText()).length()));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LL) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (((getTextSize() * (this.LLD - (C170576mj.LIZ(getContext(), 32.0f) * 2))) / C170576mj.LJ(getContext(), this.LLIIIJ)) + (this.LJLJJLL * 2)), LiveLayoutPreloadThreadPriority.DEFAULT), i2);
        } else {
            super.onMeasure(i, i2);
        }
        this.LJLLJ = getMeasuredWidth() / 2;
        this.LJLLJ = getMeasuredWidth() / 2;
        if (this.LL) {
            this.LJLLL = getBaseline();
        } else {
            this.LJLLL = (getLineHeight() - this.LJLJJLL) / 2;
        }
        this.LLFZ = i2;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (getText() != null && i == i2) {
            List<InteractTextStructWrap> list = this.LJZI;
            Editable text = getText();
            o.LJI(text);
            if (C68W.LJIIL(text.length(), list)) {
                List<InteractTextStructWrap> list2 = this.LJZI;
                o.LJI(list2);
                Iterator<InteractTextStructWrap> it = list2.iterator();
                while (it.hasNext()) {
                    TextStickerTextUnderlineIndexRange range = it.next().getRange();
                    if (i > range.getStart() && i < range.getEnd()) {
                        setSelection(Math.min(range.getEnd(), String.valueOf(getText()).length()));
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1551667c(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r2 = 2
            r0 = r8 & 2
            r3 = 0
            if (r0 == 0) goto L7
            r7 = r3
        L7:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r6, r0)
            r0 = 0
            r5.<init>(r6, r7, r0)
            r1 = -1
            r5.LJLL = r1
            r4 = 1
            r5.LJLLI = r4
            r5.LJLLILLLL = r2
            int r0 = X.C81184Vtc.LJ(r6)
            r5.LLD = r0
            r5.LLF = r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.LLFF = r0
            r5.LLFII = r4
            r0 = 12
            r5.LLI = r0
            r0 = 28
            r5.LLIFFJFJJ = r0
            int r0 = r5.getDefaultTextSize()
            r5.LLII = r0
            kotlin.jvm.internal.AqS152S0100000_2 r1 = new kotlin.jvm.internal.AqS152S0100000_2
            r0 = 602(0x25a, float:8.44E-43)
            r1.<init>(r5, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.LLIIII = r0
            r0 = 1105199104(0x41e00000, float:28.0)
            r5.LLIIIJ = r0
            r0 = 1086324736(0x40c00000, float:6.0)
            float r0 = X.C74275TDb.LIZIZ(r6, r0)
            int r0 = (int) r0
            r5.LJLJJLL = r0
            r0 = 1084227584(0x40a00000, float:5.0)
            float r0 = X.C74275TDb.LIZIZ(r6, r0)
            int r0 = (int) r0
            r5.LJLLLL = r0
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.LJLJL = r1
            int r0 = r5.LJLL
            r1.setColor(r0)
            android.graphics.Paint r1 = r5.LJLJL
            if (r1 != 0) goto Ld4
        L67:
            android.graphics.Paint r0 = r5.LJLJL
            if (r0 != 0) goto Ld0
        L6b:
            android.graphics.Paint r2 = r5.LJLJL
            if (r2 != 0) goto Lc5
        L6f:
            android.graphics.Paint r2 = r5.LJLJL
            if (r2 != 0) goto Lb9
        L73:
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r5.LJLJLLL = r0
            r5.setLayerType(r4, r3)
            int r0 = r5.LJLJJLL
            float r1 = (float) r0
            float r0 = r5.getLineSpacingMultiplier()
            r5.setLineSpacing(r1, r0)
            Y.IDObjectS175S0100000_2 r1 = new Y.IDObjectS175S0100000_2
            r0 = 8
            r1.<init>(r5, r0)
            r5.addTextChangedListener(r1)
            android.text.TextPaint r1 = new android.text.TextPaint
            r1.<init>()
            r5.LJLJLJ = r1
            android.text.TextPaint r0 = r5.getPaint()
            r1.set(r0)
            android.text.TextPaint r2 = r5.LJLJLJ
            if (r2 != 0) goto Lae
        La3:
            android.text.TextPaint r1 = r5.LJLJLJ
            if (r1 != 0) goto La8
        La7:
            return
        La8:
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            goto La7
        Lae:
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.<init>(r0)
            r2.setXfermode(r1)
            goto La3
        Lb9:
            android.graphics.CornerPathEffect r1 = new android.graphics.CornerPathEffect
            int r0 = r5.LJLLLL
            float r0 = (float) r0
            r1.<init>(r0)
            r2.setPathEffect(r1)
            goto L73
        Lc5:
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.DST_OVER
            r1.<init>(r0)
            r2.setXfermode(r1)
            goto L6f
        Ld0:
            r0.setAntiAlias(r4)
            goto L6b
        Ld4:
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1551667c.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence text, int i, int i2, int i3) {
        o.LJIIIZ(text, "text");
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        if (getLineCount() > 20) {
            String substring = String.valueOf(getText()).substring(0, r2.length() - 1);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Editable text2 = getText();
            o.LJI(text2);
            LJIIIZ(text2.length(), substring);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLFII) {
            getHeightMeasureHelper().LIZ(this.LLFZ, getEditFontSize(), getDefaultTextSize(), this.LLI, new AqS168S0100000_2(this, 349));
        }
    }
}
