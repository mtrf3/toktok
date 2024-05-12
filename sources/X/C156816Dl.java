package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap;
import java.util.List;

/* renamed from: X.6Dl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C156816Dl extends C19K {
    public static final /* synthetic */ int LJZL = 0;
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

    public List<InteractTextStructWrap> getTextStructWrapList() {
        return this.LJZI;
    }

    private void setMaskBlurColor(int i) {
        setTextColor(-1);
        setShadowLayer(12.0f, 0.0f, 0.0f, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        char c;
        char c2;
        int i;
        int i2 = this.LJLLI;
        int i3 = 1;
        if (i2 != 1 && i2 != 4 && !TextUtils.isEmpty(getText().toString())) {
            this.LJLJL.setColor(this.LJLL);
            String[] textStr = getTextStr();
            if (textStr != null && textStr.length != 0) {
                int length = textStr.length;
                Point[][] pointArr = new Point[length];
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                int ceil = (int) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
                int textSize = ((int) getTextSize()) / 4;
                if (this.LJLLILLLL == 1) {
                    this.LJLLJ = getPaddingLeft();
                }
                if (this.LJLLILLLL == 3) {
                    this.LJLLJ = getMeasuredWidth() - getPaddingRight();
                }
                if (this.LJLLILLLL == 2) {
                    this.LJLLJ = getMeasuredWidth() / 2;
                }
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i6 < length) {
                    int measureText = (int) getPaint().measureText(textStr[i6]);
                    int i12 = this.LJLLJ;
                    int i13 = measureText / 2;
                    int i14 = this.LJLJJLL * 2;
                    int i15 = (i12 - i13) - i14;
                    int i16 = i12 + i13 + i14;
                    int i17 = this.LJLLILLLL;
                    if (i17 == i3) {
                        i15 = i12 - i14;
                        i16 = i12 + measureText + i14;
                    } else if (i17 == 3) {
                        i15 = (i12 - measureText) - i14;
                        i16 = i14 + i12;
                    }
                    if (TextUtils.isEmpty(textStr[i6]) || textStr[i6].trim().length() == 0) {
                        i16 = getMeasuredWidth() / 2;
                        int i18 = this.LJLLILLLL;
                        if (i18 == 1) {
                            i16 = this.LJLLJ;
                        } else if (i18 == 3) {
                            i16 = this.LJLLJ;
                        }
                        i15 = i16;
                    }
                    if (Math.abs(measureText - i7) >= textSize || ((i = this.LJLLILLLL) != 1 ? i != 3 ? i != 2 || i9 <= 0 : i9 <= 0 : i8 <= 0)) {
                        i8 = i16;
                        i9 = i15;
                    }
                    if (i6 == 0) {
                        C6IH LJ = C6IH.LJ();
                        int scene = getScene();
                        LJ.getClass();
                        String[] strArr = C6IH.LJI;
                        int length2 = strArr.length;
                        int i19 = 0;
                        while (true) {
                            if (i19 < length2) {
                                if (strArr[i19].equals(C6IH.LJ().LIZJ(scene))) {
                                    i10 = this.LJLLL;
                                    break;
                                }
                                i19++;
                            } else {
                                i10 = this.LJLLL - this.LJLJJLL;
                                break;
                            }
                        }
                    }
                    int i20 = i10 + ceil;
                    if (length > 1) {
                        if (i6 > 0) {
                            i4 = (int) getPaint().measureText(textStr[i6 - 1]);
                        }
                        if (i6 < length - 1) {
                            i5 = (int) getPaint().measureText(textStr[i6 + 1]);
                        }
                    }
                    if (i4 > 0 && measureText >= i4) {
                        i20 += this.LJLJJLL;
                    }
                    if (i5 > 0 && measureText > i5) {
                        i20 += this.LJLJJLL;
                    }
                    if (i6 == 0) {
                        i10 -= this.LJLJJLL;
                    }
                    if (i6 == length - 1) {
                        i20 += this.LJLJJLL;
                    }
                    Point[] pointArr2 = new Point[4];
                    pointArr2[0] = new Point(i9, i10);
                    pointArr2[1] = new Point(i8, i10);
                    pointArr2[2] = new Point(i8, i20);
                    pointArr2[3] = new Point(i9, i20);
                    pointArr[i6] = pointArr2;
                    if (measureText > i11) {
                        i11 = measureText;
                    }
                    i6++;
                    i7 = measureText;
                    i10 = i20;
                    i3 = 1;
                }
                this.LJLJLLL.reset();
                for (int i21 = 0; i21 < length; i21++) {
                    if (i21 == 0) {
                        Path path = this.LJLJLLL;
                        Point point = pointArr[i21][0];
                        path.moveTo(point.x, point.y);
                    }
                    Path path2 = this.LJLJLLL;
                    Point point2 = pointArr[i21][1];
                    path2.lineTo(point2.x, point2.y);
                    Point[] pointArr3 = pointArr[i21];
                    int i22 = pointArr3[0].x;
                    int i23 = pointArr3[1].x;
                    if (i22 == i23) {
                        this.LJLJLLL.lineTo(i23, r3.y);
                        Path path3 = this.LJLJLLL;
                        c2 = 2;
                        Point point3 = pointArr[i21][2];
                        path3.lineTo(point3.x, point3.y);
                    } else {
                        c2 = 2;
                    }
                    Path path4 = this.LJLJLLL;
                    Point point4 = pointArr[i21][c2];
                    path4.lineTo(point4.x, point4.y);
                }
                char c3 = 1;
                int i24 = length - 1;
                while (i24 >= 0) {
                    Point[] pointArr4 = pointArr[i24];
                    if (pointArr4[0].x == pointArr4[c3].x) {
                        Path path5 = this.LJLJLLL;
                        c = 3;
                        Point point5 = pointArr4[3];
                        path5.lineTo(point5.x, point5.y);
                    } else {
                        c = 3;
                    }
                    Path path6 = this.LJLJLLL;
                    Point point6 = pointArr[i24][c];
                    path6.lineTo(point6.x, point6.y);
                    Point[] pointArr5 = pointArr[i24];
                    int i25 = pointArr5[0].x;
                    if (i25 == pointArr5[1].x) {
                        this.LJLJLLL.lineTo(i25, r3.y);
                    }
                    Path path7 = this.LJLJLLL;
                    Point point7 = pointArr[i24][0];
                    path7.lineTo(point7.x, point7.y);
                    i24--;
                    c3 = 1;
                }
                Path path8 = this.LJLJLLL;
                Point point8 = pointArr[0][1];
                path8.lineTo(point8.x, point8.y);
                canvas.drawPath(this.LJLJLLL, this.LJLJL);
            }
        }
        if (this.LJLLI == 4) {
            TextPaint paint = getPaint();
            Paint.Cap strokeCap = paint.getStrokeCap();
            paint.setStrokeCap(Paint.Cap.ROUND);
            Paint.Join strokeJoin = paint.getStrokeJoin();
            paint.setStrokeJoin(Paint.Join.ROUND);
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            float strokeWidth = paint.getStrokeWidth();
            paint.setStrokeWidth(C156826Dm.LIZIZ(getContext(), getTextSize()));
            super.onDraw(canvas);
            canvas.drawRect(0.0f, 0.0f, Math.max(getLayout().getWidth(), getWidth()) * 1.5f, Math.max(getLayout().getHeight(), getHeight()) * 1.5f, this.LJLJLJ);
            paint.setStrokeCap(strokeCap);
            paint.setStrokeJoin(strokeJoin);
            paint.setStyle(style);
            paint.setStrokeWidth(strokeWidth);
        }
        super.onDraw(canvas);
    }

    public void setAligin(int i) {
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

    public void setFontSize(int i) {
        float f = i;
        float f2 = f / 28.0f;
        this.LJLJJLL = (int) (C74275TDb.LIZIZ(getContext(), 6.0f) * f2);
        this.LJLLLL = (int) (C74275TDb.LIZIZ(getContext(), 5.0f) * f2);
        this.LJLJL.setPathEffect(new CornerPathEffect(this.LJLLLL));
        setLineSpacing(this.LJLJJLL, getLineSpacingMultiplier());
        setTextSize(f);
    }

    public void setFontType(Typeface typeface) {
        if (getTypeface() != typeface) {
            setTypeface(typeface);
            if (this.LJLJLJ.getTypeface() != typeface) {
                this.LJLJLJ.setTypeface(typeface);
            }
        }
        C6IH LJ = C6IH.LJ();
        int scene = getScene();
        boolean z = false;
        if (LJ.LIZ.get(LJ.LIZJ(scene)) != null && LJ.LIZ.get(LJ.LIZJ(scene)).enableMaskBlurLightColor == 1) {
            z = true;
        }
        this.LJLLLLLL = z;
        if (z) {
            setMaskBlurColor(getCurrentTextColor());
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        if (i > 0) {
            super.setMaxWidth(i);
        }
    }

    public void setMode(int i) {
        this.LJLLI = i;
    }

    public void setTextStructWrapList(List<InteractTextStructWrap> list) {
        this.LJZI = list;
    }

    public C156816Dl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLL = -1;
        this.LJLLI = 1;
        this.LJLLILLLL = 2;
        this.LJLJJLL = (int) C74275TDb.LIZIZ(context, 6.0f);
        this.LJLLLL = (int) C74275TDb.LIZIZ(context, 5.0f);
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
        TextPaint textPaint = new TextPaint();
        this.LJLJLJ = textPaint;
        textPaint.set(getPaint());
        this.LJLJLJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.LJLJLJ.setStyle(Paint.Style.FILL);
    }

    public final void LJI(int i, int i2) {
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
            this.LJLJLJ.setColor(C156826Dm.LIZ(i2));
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
            if (i2 == -1) {
                setTextColor(-16777216);
                return;
            } else {
                setTextColor(-1);
                return;
            }
        }
        if (i != 3) {
            return;
        }
        this.LJLLI = 3;
        this.LJLL = Color.argb(153, (16711680 & i2) >> 16, (65280 & i2) >> 8, i2 & 255);
        setTextColor(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLLJ = getMeasuredWidth() / 2;
        this.LJLLL = (getLineHeight() - this.LJLJJLL) / 2;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (getText() != null && i == i2) {
            if (V1M.LJJIJ(getText().length(), this.LJZI)) {
                for (InteractTextStructWrap interactTextStructWrap : this.LJZI) {
                    if (i > interactTextStructWrap.getRange().getStart() && i < interactTextStructWrap.getRange().getEnd()) {
                        setSelection(Math.min(interactTextStructWrap.getRange().getEnd(), getText().toString().length()));
                        return;
                    }
                }
            }
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        if (getLineCount() > 20) {
            getText().toString().substring(0, r2.length() - 1);
        }
    }
}
