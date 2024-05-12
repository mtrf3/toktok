package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Vq8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80968Vq8 extends View {
    public TextPaint LJLIL;
    public Path LJLILLLLZI;
    public Paint LJLJI;
    public Paint LJLJJI;
    public String LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80968Vq8(Context context) {
        super(context, null);
        a1.LJFF(context, "context");
        TextPaint textPaint = new TextPaint();
        this.LJLIL = textPaint;
        textPaint.setAntiAlias(true);
        this.LJLJI = new Paint();
        this.LJLILLLLZI = new Path();
        Paint paint = this.LJLJI;
        if (paint != null) {
            paint.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.LJLJJI = paint2;
            paint2.setAntiAlias(true);
            Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
            if (LIZLLL != null) {
                try {
                    TextPaint textPaint2 = this.LJLIL;
                    if (textPaint2 != null) {
                        textPaint2.setTypeface(LIZLLL);
                        return;
                    } else {
                        o.LJIJI("textPaint");
                        throw null;
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
            return;
        }
        o.LJIJI("mBgPaint");
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (TextUtils.isEmpty(this.LJLJJL)) {
            return;
        }
        TextPaint textPaint = this.LJLIL;
        if (textPaint != null) {
            int measureText = (this.LJLJLLL * 2) + ((int) textPaint.measureText(this.LJLJJL));
            Rect rect = new Rect();
            TextPaint textPaint2 = this.LJLIL;
            if (textPaint2 != null) {
                String str = this.LJLJJL;
                o.LJI(str);
                textPaint2.getTextBounds(str, 0, str.length(), rect);
                int height = (this.LJLJLLL * 2) + rect.height();
                int i = this.LJLL;
                float f = i + measureText;
                float f2 = height;
                RectF rectF = new RectF(i, 0.0f, f, f2);
                int i2 = this.LJLL;
                float f3 = i2;
                float f4 = i2;
                Paint paint = this.LJLJI;
                if (paint != null) {
                    canvas.drawRoundRect(rectF, f3, f4, paint);
                    Path path = this.LJLILLLLZI;
                    if (path != null) {
                        path.moveTo(this.LJLJLJ + this.LJLJJLL + this.LJLL, f2);
                        Path path2 = this.LJLILLLLZI;
                        if (path2 != null) {
                            path2.lineTo((this.LJLJJLL / 2) + this.LJLJLJ + this.LJLL, this.LJLJL + height);
                            Path path3 = this.LJLILLLLZI;
                            if (path3 != null) {
                                path3.lineTo(this.LJLJLJ + this.LJLL, f2);
                                Path path4 = this.LJLILLLLZI;
                                if (path4 != null) {
                                    Paint paint2 = this.LJLJJI;
                                    if (paint2 != null) {
                                        canvas.drawPath(path4, paint2);
                                        String str2 = this.LJLJJL;
                                        o.LJI(str2);
                                        String str3 = this.LJLJJL;
                                        o.LJI(str3);
                                        int length = str3.length();
                                        float f5 = this.LJLL + this.LJLJLLL;
                                        float f6 = (height - r1) - 4;
                                        TextPaint textPaint3 = this.LJLIL;
                                        if (textPaint3 != null) {
                                            canvas.drawText(str2, 0, length, f5, f6, (Paint) textPaint3);
                                            return;
                                        } else {
                                            o.LJIJI("textPaint");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("anglePaint");
                                    throw null;
                                }
                                o.LJIJI("anglePath");
                                throw null;
                            }
                            o.LJIJI("anglePath");
                            throw null;
                        }
                        o.LJIJI("anglePath");
                        throw null;
                    }
                    o.LJIJI("anglePath");
                    throw null;
                }
                o.LJIJI("mBgPaint");
                throw null;
            }
            o.LJIJI("textPaint");
            throw null;
        }
        o.LJIJI("textPaint");
        throw null;
    }

    public final void setAttribute(C80969Vq9 attribute) {
        o.LJIIIZ(attribute, "attribute");
        this.LJLLILLLL = attribute.LJI;
        int i = attribute.LJII;
        this.LJLLJ = i;
        this.LJLL = attribute.LJ;
        this.LJLJLLL = attribute.LIZLLL;
        this.LJLJJLL = attribute.LIZ;
        this.LJLJL = attribute.LIZIZ;
        this.LJLJLJ = attribute.LIZJ;
        this.LJLLL = attribute.LJIIIIZZ;
        Paint paint = this.LJLJI;
        if (paint != null) {
            paint.setColor(i);
            Paint paint2 = this.LJLJJI;
            if (paint2 != null) {
                paint2.setColor(this.LJLLJ);
                TextPaint textPaint = this.LJLIL;
                if (textPaint != null) {
                    textPaint.setColor(this.LJLLILLLL);
                    TextPaint textPaint2 = this.LJLIL;
                    if (textPaint2 != null) {
                        textPaint2.setTextSize(this.LJLLL);
                        this.LJLLI = attribute.LJFF;
                        Paint paint3 = this.LJLJJI;
                        if (paint3 != null) {
                            paint3.setPathEffect(new CornerPathEffect(this.LJLLI));
                            invalidate();
                            return;
                        } else {
                            o.LJIJI("anglePaint");
                            throw null;
                        }
                    }
                    o.LJIJI("textPaint");
                    throw null;
                }
                o.LJIJI("textPaint");
                throw null;
            }
            o.LJIJI("anglePaint");
            throw null;
        }
        o.LJIJI("mBgPaint");
        throw null;
    }

    public final void setBgColor(int i) {
        Paint paint = this.LJLJI;
        if (paint != null) {
            paint.setColor(i);
            invalidate();
        } else {
            o.LJIJI("mBgPaint");
            throw null;
        }
    }

    public final void setText(String str) {
        this.LJLJJL = str;
        invalidate();
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.LJLIL;
        if (textPaint != null) {
            textPaint.setColor(i);
            invalidate();
        } else {
            o.LJIJI("textPaint");
            throw null;
        }
    }

    public final void setTextSize(int i) {
        TextPaint textPaint = this.LJLIL;
        if (textPaint != null) {
            textPaint.setTextSize(i);
            invalidate();
        } else {
            o.LJIJI("textPaint");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (TextUtils.isEmpty(this.LJLJJL)) {
            setMeasuredDimension(0, 0);
            return;
        }
        TextPaint textPaint = this.LJLIL;
        if (textPaint != null) {
            int measureText = (this.LJLL * 2) + (this.LJLJLLL * 2) + ((int) textPaint.measureText(this.LJLJJL));
            Rect rect = new Rect();
            TextPaint textPaint2 = this.LJLIL;
            if (textPaint2 != null) {
                String str = this.LJLJJL;
                o.LJI(str);
                textPaint2.getTextBounds(str, 0, str.length(), rect);
                setMeasuredDimension(measureText, (this.LJLJLLL * 2) + rect.height() + this.LJLJL);
                return;
            }
            o.LJIJI("textPaint");
            throw null;
        }
        o.LJIJI("textPaint");
        throw null;
    }
}
