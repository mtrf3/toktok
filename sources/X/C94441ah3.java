package X;

import Y.IDObjectS187S0100000_42;
import android.content.Context;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextUnderlineIndexRange;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ah3, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94441ah3 extends C19K {
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
    public List<InteractTextStructWrap> LJLZ;
    public boolean LJZ;
    public int LJZI;
    public boolean LJZL;

    private final int getScene() {
        return 0;
    }

    private final String[] getTextStr() {
        if (TextUtils.isEmpty(getText())) {
            return null;
        }
        Layout layout = getLayout();
        String valueOf = String.valueOf(getText());
        ArrayList arrayList = new ArrayList();
        int lineCount = getLineCount();
        int i = 0;
        int i2 = 0;
        while (i < lineCount) {
            int lineEnd = layout.getLineEnd(i);
            String substring = valueOf.substring(i2, lineEnd);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (i != getLineCount() - 1 || substring.length() != 0) {
                arrayList.add(substring);
            }
            layout.getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final boolean getInEdit() {
        return this.LJZL;
    }

    public final List<InteractTextStructWrap> getTextStructWrapList() {
        return this.LJLZ;
    }

    private final void setMaskBlurColor(int i) {
        setTextColor(-1);
        setShadowLayer(12.0f, 0.0f, 0.0f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021b A[SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94441ah3.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJZL) {
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

    public final void setFontSize(int i) {
        if (this.LJZI == -1) {
            this.LJZI = i;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        float f = i;
        float f2 = f / 28.0f;
        this.LJLJJLL = (int) (C74275TDb.LIZIZ(context, 6.0f) * f2);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        this.LJLLLL = (int) (C74275TDb.LIZIZ(context2, 5.0f) * f2);
        Paint paint = this.LJLJL;
        if (paint != null) {
            paint.setPathEffect(new CornerPathEffect(this.LJLLLL));
        }
        setLineSpacing(this.LJLJJLL, getLineSpacingMultiplier());
        setTextSize(f);
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
        this.LJZL = z;
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

    public final void setTextStructWrapList(List<InteractTextStructWrap> list) {
        this.LJLZ = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94441ah3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        this.LJLL = -1;
        this.LJLLI = 1;
        this.LJLLILLLL = 2;
        C81184Vtc.LJ(context);
        this.LJZI = -1;
        this.LJLJJLL = (int) C74275TDb.LIZIZ(context, 6.0f);
        this.LJLLLL = (int) C74275TDb.LIZIZ(context, 5.0f);
        Paint paint = new Paint();
        this.LJLJL = paint;
        paint.setColor(this.LJLL);
        Paint paint2 = this.LJLJL;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.FILL);
        }
        Paint paint3 = this.LJLJL;
        if (paint3 != null) {
            paint3.setAntiAlias(true);
        }
        Paint paint4 = this.LJLJL;
        if (paint4 != null) {
            paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        }
        Paint paint5 = this.LJLJL;
        if (paint5 != null) {
            paint5.setPathEffect(new CornerPathEffect(this.LJLLLL));
        }
        this.LJLJLLL = new Path();
        setLayerType(1, null);
        setLineSpacing(this.LJLJJLL, getLineSpacingMultiplier());
        addTextChangedListener(new IDObjectS187S0100000_42(this, 1));
        TextPaint textPaint = new TextPaint();
        this.LJLJLJ = textPaint;
        textPaint.set(getPaint());
        TextPaint textPaint2 = this.LJLJLJ;
        if (textPaint2 != null) {
            textPaint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
        TextPaint textPaint3 = this.LJLJLJ;
        if (textPaint3 == null) {
            return;
        }
        textPaint3.setStyle(Paint.Style.FILL);
    }

    public final void LJI(int i, int i2) {
        if (this.LJLLLLLL) {
            setMaskBlurColor(i2);
            this.LJLLI = 1;
            return;
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            setFallbackLineSpacing(true);
        }
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
                        textPaint.setColor(C1553767x.LIZ(i2));
                    }
                    setBackground(null);
                    setTextColor(i2);
                    setShadowLayer(12.0f, 0.0f, 0.0f, 0);
                    if (i3 < 28) {
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
            if (i2 == -1) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            if (i3 < 28) {
                return;
            }
            setFallbackLineSpacing(false);
            return;
        }
        this.LJLLI = 1;
        this.LJLL = i2;
        setBackground(null);
        setTextColor(i2);
    }

    public final void LJII(int i, String str) {
        if (str == null) {
            return;
        }
        this.LJZ = true;
        if (!C68W.LJIIL(str.length(), this.LJLZ)) {
            setText(str);
            setSelection(Math.min(i, String.valueOf(getText()).length()));
        } else {
            setText(str);
            setSelection(Math.min(i, String.valueOf(getText()).length()));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getLayerType() == 1) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0 && measuredWidth * 4 * measuredHeight > ViewConfiguration.get(context).getScaledMaximumDrawingCacheSize()) {
                setLayerType(0, null);
            }
        }
        this.LJLLJ = getMeasuredWidth() / 2;
        this.LJLLL = (getLineHeight() - this.LJLJJLL) / 2;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        int i3;
        List<InteractTextStructWrap> list;
        super.onSelectionChanged(i, i2);
        if (getText() != null && i == i2) {
            List<InteractTextStructWrap> list2 = this.LJLZ;
            Editable text = getText();
            if (text != null) {
                i3 = text.length();
            } else {
                i3 = 0;
            }
            if (!C68W.LJIIL(i3, list2) || (list = this.LJLZ) == null) {
                return;
            }
            Iterator<InteractTextStructWrap> it = list.iterator();
            while (it.hasNext()) {
                TextStickerTextUnderlineIndexRange range = it.next().getRange();
                if (i > range.getStart() && i < range.getEnd()) {
                    setSelection(Math.min(range.getEnd(), String.valueOf(getText()).length()));
                    return;
                }
            }
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence text, int i, int i2, int i3) {
        o.LJIIIZ(text, "text");
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        if (getLineCount() > 20) {
            int i4 = 0;
            String substring = String.valueOf(getText()).substring(0, r1.length() - 1);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Editable text2 = getText();
            if (text2 != null) {
                i4 = text2.length();
            }
            LJII(i4, substring);
        }
    }
}
