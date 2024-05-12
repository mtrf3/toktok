package X;

import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.86y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2060886y extends View {
    public final T5S LJLIL;
    public final T5S LJLILLLLZI;
    public final T5S LJLJI;
    public final Paint LJLJJI;
    public final Paint LJLJJL;
    public final Paint LJLJJLL;
    public final Paint LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public final int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public final List<String> LJLLLLLL;
    public final List<String> LJLZ;
    public final java.util.Map<Integer, C7MF> LJZ;
    public final java.util.Map<Integer, Long> LJZI;
    public final java.util.Map<Integer, String> LJZL;
    public final java.util.Set<Integer> LL;
    public String LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public int LLFII;
    public int LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public final Calendar LLII;
    public final Rect LLIIII;
    public final Rect LLIIIILZ;
    public final Rect LLIIIJ;
    public final RectF LLIIIL;
    public final RectF LLIIIZ;
    public final RectF LLIIJI;
    public C7MG LLIIJLIL;
    public boolean LLIIL;
    public final ARunnableS39S0100000_3 LLIILII;
    public final boolean LLIILZL;
    public int LLIIZ;

    public final int LIZIZ(Date date) {
        this.LLII.setTime(date);
        if (this.LLII.get(2) != this.LLI || this.LLII.get(1) != this.LLIFFJFJJ) {
            return -1;
        }
        return (this.LLII.get(5) + this.LLFF) - 1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float LJIIZILJ;
        int i;
        int i2;
        int i3;
        float LJIIZILJ2;
        super.onDraw(canvas);
        Paint.FontMetrics fontMetrics = this.LJLIL.getFontMetrics();
        o.LJIIIIZZ(fontMetrics, "monthYearHeaderTextPaint.fontMetrics");
        float f = -fontMetrics.top;
        if (this.LLIILZL) {
            LJIIZILJ = (this.LJLLL - C32151Nz.LJIIZILJ(20)) - this.LJLLLL;
        } else {
            LJIIZILJ = C32151Nz.LJIIZILJ(20);
        }
        if (canvas != null) {
            canvas.drawText(this.LLD, LJIIZILJ, f, this.LJLIL);
        }
        Paint.FontMetrics fontMetrics2 = this.LJLILLLLZI.getFontMetrics();
        o.LJIIIIZZ(fontMetrics2, "weekDayTextPaint.fontMetrics");
        Paint.FontMetrics fontMetrics3 = this.LJLIL.getFontMetrics();
        o.LJIIIIZZ(fontMetrics3, "monthYearHeaderTextPaint.fontMetrics");
        Iterator<String> it = this.LJLLLLLL.iterator();
        while (it.hasNext()) {
            if (this.LJLILLLLZI.measureText(it.next()) > this.LJLLILLLL) {
                T5S t5s = this.LJLILLLLZI;
                t5s.setTextSize(t5s.getTextSize() - C32151Nz.LJIIZILJ(1));
            }
        }
        float LIZIZ = (-fontMetrics2.ascent) + C7MY.LIZIZ(16) + this.LJLJLLL + fontMetrics3.bottom + fontMetrics3.leading;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i = 2;
            i2 = 6;
            if (i5 >= 7) {
                break;
            }
            int i6 = this.LLIIZ + i5;
            if (i6 > 6) {
                i6 -= 7;
            }
            this.LJLILLLLZI.getTextBounds((String) ListProtector.get(this.LJLLLLLL, i6), 0, ((String) ListProtector.get(this.LJLLLLLL, i6)).length(), this.LLIIIJ);
            float width = this.LLIIIJ.width();
            float f2 = 2;
            float f3 = (this.LJLLILLLL / f2) - (width / f2);
            if (this.LLIILZL) {
                LJIIZILJ2 = (this.LJLLL - (C32151Nz.LJIIZILJ(16) + ((i5 + 1) * (r11 + this.LJLLI)))) + f3 + this.LJLLI;
            } else {
                LJIIZILJ2 = C32151Nz.LJIIZILJ(16) + ((r11 + this.LJLLI) * i5) + f3;
            }
            if (canvas != null) {
                canvas.drawText((String) ListProtector.get(this.LJLLLLLL, i6), LJIIZILJ2, LIZIZ, this.LJLILLLLZI);
            }
            i5++;
        }
        this.LJLJLJ = (int) (LIZIZ + fontMetrics2.bottom + fontMetrics2.leading);
        int LIZIZ2 = C7MY.LIZIZ(12);
        int LIZIZ3 = C7MY.LIZIZ(16);
        int i7 = this.LJLJLJ + LIZIZ2;
        int i8 = this.LLFF;
        int i9 = this.LLFFF;
        while (i8 < i9) {
            String valueOf = String.valueOf((i8 - this.LLFF) + 1);
            this.LJLJI.getTextBounds(valueOf, i4, valueOf.length(), this.LLIIIILZ);
            int width2 = (this.LJLLILLLL - this.LLIIIILZ.width()) / i;
            int height = this.LLIIIILZ.height() + ((this.LJLLJ - this.LLIIIILZ.height()) / i);
            int i10 = i8 / 7;
            int i11 = i8 % 7;
            int i12 = this.LJLLJ + LIZIZ2;
            if (this.LLIILZL) {
                int i13 = this.LJLLL;
                int i14 = i11 + 1;
                int i15 = this.LJLLI;
                i3 = (i13 - (((this.LJLLILLLL + i15) * i14) + LIZIZ3)) + i15 + width2;
            } else {
                i3 = ((this.LJLLI + this.LJLLILLLL) * i11) + width2 + LIZIZ3;
            }
            int i16 = i10 * i12;
            int i17 = height + i16 + i7;
            int i18 = i3 - width2;
            if (this.LL.contains(Integer.valueOf(i8))) {
                RectF rectF = this.LLIIJI;
                rectF.left = i18;
                rectF.top = i16 + i7;
                rectF.right = this.LJLLILLLL + i18;
                rectF.bottom = r12 + this.LJLLJ;
                if (canvas != null) {
                    canvas.drawRoundRect(rectF, C32151Nz.LJIIZILJ(Integer.valueOf(i2)), C32151Nz.LJIIZILJ(Integer.valueOf(i2)), this.LJLJJLL);
                }
            }
            if (((LinkedHashMap) this.LJZ).keySet().contains(Integer.valueOf(i8)) && !this.LL.contains(Integer.valueOf(i8))) {
                C7MF c7mf = (C7MF) ((LinkedHashMap) this.LJZ).get(Integer.valueOf(i8));
                if (c7mf != null) {
                    RectF rectF2 = this.LLIIIL;
                    rectF2.left = i18;
                    rectF2.top = i16 + i7;
                    rectF2.right = this.LJLLILLLL + i18;
                    rectF2.bottom = r12 + this.LJLLJ;
                    if (canvas != null) {
                        canvas.drawBitmap(c7mf.LJLIL, (Rect) null, rectF2, this.LJLJJL);
                        Integer valueOf2 = Integer.valueOf(canvas.saveLayer(this.LLIIIL, this.LJLJL));
                        if (valueOf2 != null) {
                            int intValue = valueOf2.intValue();
                            canvas.drawRoundRect(this.LLIIIL, C32151Nz.LJIIZILJ(6), C32151Nz.LJIIZILJ(6), this.LJLJL);
                            this.LJLJL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                            canvas.drawRect(this.LLIIIL, this.LJLJL);
                            this.LJLJL.setXfermode(null);
                            canvas.restoreToCount(intValue);
                        }
                    }
                }
            }
            if (i8 == this.LLFII) {
                float LJIIZILJ3 = (C32151Nz.LJIIZILJ(2) / 2) - 0.5f;
                RectF rectF3 = this.LLIIIZ;
                rectF3.left = i18 - LJIIZILJ3;
                rectF3.top = (i16 + i7) - LJIIZILJ3;
                rectF3.right = i18 + this.LJLLILLLL + LJIIZILJ3;
                rectF3.bottom = r2 + this.LJLLJ + LJIIZILJ3;
                if (canvas != null) {
                    canvas.drawRoundRect(rectF3, C32151Nz.LJIIZILJ(7), C32151Nz.LJIIZILJ(7), this.LJLJJI);
                    canvas.drawText(valueOf, i3, i17, this.LJLJI);
                    i8++;
                    i4 = 0;
                    i = 2;
                    i2 = 6;
                } else {
                    i8++;
                    i4 = 0;
                    i = 2;
                    i2 = 6;
                }
            } else {
                if (canvas == null) {
                    i8++;
                    i4 = 0;
                    i = 2;
                    i2 = 6;
                }
                canvas.drawText(valueOf, i3, i17, this.LJLJI);
                i8++;
                i4 = 0;
                i = 2;
                i2 = 6;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (r1 < r6.LLFFF) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 != 0) goto L4
            return r5
        L4:
            float r0 = r7.getX()
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r3 = (int) r0
            float r0 = r7.getY()
            float r0 = r0 + r1
            int r4 = (int) r0
            int r1 = r7.getAction()
            r2 = 1
            if (r1 == r2) goto L21
            r0 = 3
            if (r1 == r0) goto L1d
        L1c:
            return r2
        L1d:
            r6.invalidate()
            goto L1c
        L21:
            boolean r0 = r6.LLIIL
            if (r0 == 0) goto L1c
            r6.LLIIL = r5
            Y.ARunnableS39S0100000_3 r5 = r6.LLIILII
            r0 = 300(0x12c, double:1.48E-321)
            r6.postDelayed(r5, r0)
            r0 = 16
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r5)
            int r0 = X.O6R.LJJIIZ(r0)
            if (r3 <= r0) goto L4f
            int r0 = r6.LJLJLJ
            if (r4 <= r0) goto L4f
            int r1 = r6.LJLLL
            float r0 = X.C32151Nz.LJIIZILJ(r5)
            int r0 = X.O6R.LJJIIZ(r0)
            int r1 = r1 - r0
            if (r3 <= r1) goto L7c
        L4f:
            r1 = -1
        L50:
            java.util.Map<java.lang.Integer, java.lang.Long> r3 = r6.LJZI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            java.lang.Object r0 = r3.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L1c
            long r3 = r0.longValue()
            java.util.Map<java.lang.Integer, java.lang.String> r5 = r6.LJZL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L1c
            X.7MG r0 = r6.LLIIJLIL
            if (r0 == 0) goto L1c
            r0.LIZ(r3, r1)
            goto L1c
        L7c:
            boolean r0 = r6.LLIILZL
            if (r0 == 0) goto L84
            int r0 = r6.LJLLL
            int r3 = r0 - r3
        L84:
            float r0 = X.C32151Nz.LJIIZILJ(r5)
            int r0 = X.O6R.LJJIIZ(r0)
            int r3 = r3 - r0
            int r1 = r6.LJLLILLLL
            int r0 = r6.LJLLI
            int r1 = r1 + r0
            int r3 = r3 / r1
            int r0 = r6.LJLJLJ
            int r4 = r4 - r0
            r0 = 12
            int r1 = X.C7MY.LIZIZ(r0)
            int r0 = r6.LJLLJ
            int r1 = r1 + r0
            int r4 = r4 / r1
            int r1 = r4 * 7
            int r1 = r1 + r3
            int r0 = r6.LLFF
            if (r1 < r0) goto L4f
            int r0 = r6.LLFFF
            if (r1 < r0) goto L50
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2060886y.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnDaySelectListener(C7MG listener) {
        o.LJIIIZ(listener, "listener");
        this.LLIIJLIL = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2060886y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        T5S t5s = new T5S();
        this.LJLIL = t5s;
        T5S t5s2 = new T5S();
        this.LJLILLLLZI = t5s2;
        T5S t5s3 = new T5S();
        this.LJLJI = t5s3;
        Paint paint = new Paint();
        this.LJLJJI = paint;
        Paint paint2 = new Paint();
        this.LJLJJL = paint2;
        Paint paint3 = new Paint();
        this.LJLJJLL = paint3;
        Paint paint4 = new Paint();
        this.LJLJL = paint4;
        this.LJLLI = C7MY.LIZIZ(8);
        String string = getResources().getString(R.string.izm);
        o.LJIIIIZZ(string, "resources.getString(R.string.now_calendar_sun)");
        String string2 = getResources().getString(R.string.izg);
        o.LJIIIIZZ(string2, "resources.getString(R.string.now_calendar_mon)");
        String string3 = getResources().getString(R.string.izo);
        o.LJIIIIZZ(string3, "resources.getString(R.string.now_calendar_tue)");
        String string4 = getResources().getString(R.string.izq);
        o.LJIIIIZZ(string4, "resources.getString(R.string.now_calendar_wed)");
        String string5 = getResources().getString(R.string.izn);
        o.LJIIIIZZ(string5, "resources.getString(R.string.now_calendar_thu)");
        String string6 = getResources().getString(R.string.iza);
        o.LJIIIIZZ(string6, "resources.getString(R.string.now_calendar_fri)");
        String string7 = getResources().getString(R.string.izk);
        o.LJIIIIZZ(string7, "resources.getString(R.string.now_calendar_sat)");
        this.LJLLLLLL = C47261Igj.LJJIJIIJI(string, string2, string3, string4, string5, string6, string7);
        String string8 = getResources().getString(R.string.izb);
        o.LJIIIIZZ(string8, "resources.getString(R.string.now_calendar_jan)");
        String string9 = getResources().getString(R.string.iz_);
        o.LJIIIIZZ(string9, "resources.getString(R.string.now_calendar_feb)");
        String string10 = getResources().getString(R.string.ize);
        o.LJIIIIZZ(string10, "resources.getString(R.string.now_calendar_mar)");
        String string11 = getResources().getString(R.string.iz6);
        o.LJIIIIZZ(string11, "resources.getString(R.string.now_calendar_apr)");
        String string12 = getResources().getString(R.string.izf);
        o.LJIIIIZZ(string12, "resources.getString(R.string.now_calendar_may)");
        String string13 = getResources().getString(R.string.izd);
        o.LJIIIIZZ(string13, "resources.getString(R.string.now_calendar_jun)");
        String string14 = getResources().getString(R.string.izc);
        o.LJIIIIZZ(string14, "resources.getString(R.string.now_calendar_jul)");
        String string15 = getResources().getString(R.string.iz7);
        o.LJIIIIZZ(string15, "resources.getString(R.string.now_calendar_aug)");
        String string16 = getResources().getString(R.string.izl);
        o.LJIIIIZZ(string16, "resources.getString(R.string.now_calendar_sep)");
        String string17 = getResources().getString(R.string.izi);
        o.LJIIIIZZ(string17, "resources.getString(R.string.now_calendar_oct)");
        String string18 = getResources().getString(R.string.izh);
        o.LJIIIIZZ(string18, "resources.getString(R.string.now_calendar_nov)");
        String string19 = getResources().getString(R.string.iz8);
        o.LJIIIIZZ(string19, "resources.getString(R.string.now_calendar_dec)");
        this.LJLZ = C47261Igj.LJJIJIIJI(string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19);
        this.LJZ = new LinkedHashMap();
        this.LJZI = new LinkedHashMap();
        this.LJZL = new LinkedHashMap();
        this.LL = new LinkedHashSet();
        this.LLD = "";
        this.LLFII = -1;
        Calendar calendar = Calendar.getInstance();
        o.LJIIIIZZ(calendar, "getInstance()");
        this.LLII = calendar;
        this.LLIIII = new Rect();
        this.LLIIIILZ = new Rect();
        this.LLIIIJ = new Rect();
        this.LLIIIL = new RectF();
        this.LLIIIZ = new RectF();
        this.LLIIJI = new RectF();
        this.LLIIL = true;
        this.LLIILII = new ARunnableS39S0100000_3(this, 127);
        this.LLIILZL = C26338AVi.LIZJ(context);
        LIZ(calendar.get(1), calendar.get(2));
        t5s.setAntiAlias(true);
        t5s.LIZ(33);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.dj, context2);
        if (LJI != null) {
            t5s.setColor(LJI.intValue());
        }
        t5s2.setAntiAlias(true);
        t5s2.LIZ(71);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        Integer LJI2 = C79045V0n.LJI(R.attr.dj, context3);
        if (LJI2 != null) {
            t5s2.setColor(LJI2.intValue());
        }
        t5s3.setAntiAlias(true);
        t5s3.LIZ(32);
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        Integer LJI3 = C79045V0n.LJI(R.attr.dj, context4);
        if (LJI3 != null) {
            t5s3.setColor(LJI3.intValue());
        }
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C32151Nz.LJIIZILJ(2));
        Context context5 = getContext();
        o.LJIIIIZZ(context5, "context");
        Integer LJI4 = C79045V0n.LJI(R.attr.dj, context5);
        if (LJI4 != null) {
            paint.setColor(LJI4.intValue());
        }
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);
        Context context6 = getContext();
        o.LJIIIIZZ(context6, "context");
        Integer LJI5 = C79045V0n.LJI(R.attr.d1, context6);
        if (LJI5 != null) {
            paint3.setColor(LJI5.intValue());
        }
        paint2.setAntiAlias(true);
        paint4.setAntiAlias(true);
    }

    public final void LIZ(int i, int i2) {
        this.LLII.set(1, i);
        this.LLII.set(2, i2);
        this.LLI = i2;
        this.LLIFFJFJJ = i;
        String str = (String) ListProtector.get(this.LJLZ, i2);
        String valueOf = String.valueOf(i);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(valueOf);
        LIZ.append(" ");
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        o.LJIIIIZZ(LIZIZ, "StringBuilder().append(y…end(monthName).toString()");
        this.LLD = LIZIZ;
        int firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
        int i3 = 0;
        if (firstDayOfWeek != 1) {
            if (firstDayOfWeek != 2) {
                if (firstDayOfWeek == 7) {
                    i3 = 6;
                }
            } else {
                i3 = 1;
            }
        }
        this.LLIIZ = i3;
        this.LLF = this.LLII.getActualMaximum(5);
        this.LLII.set(5, 1);
        int i4 = this.LLII.get(7) - 1;
        this.LLFF = i4;
        int i5 = this.LLIIZ;
        if (i5 != 1) {
            if (i5 == 6) {
                int i6 = i4 + 1;
                this.LLFF = i6;
                if (i6 >= 7) {
                    this.LLFF = i6 - 7;
                }
            }
        } else {
            int i7 = i4 - 1;
            this.LLFF = i7;
            if (i7 < 0) {
                this.LLFF = i7 + 7;
            }
        }
        this.LLFFF = this.LLFF + this.LLF;
        this.LLFZ = (int) Math.ceil(r1 / 7.0f);
        this.LLFII = LIZIZ(new Date(System.currentTimeMillis()));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.LJLL = 0;
        Paint.FontMetrics fontMetrics = this.LJLIL.getFontMetrics();
        o.LJIIIIZZ(fontMetrics, "monthYearHeaderTextPaint.fontMetrics");
        Paint.FontMetrics fontMetrics2 = this.LJLILLLLZI.getFontMetrics();
        o.LJIIIIZZ(fontMetrics2, "weekDayTextPaint.fontMetrics");
        T5S t5s = this.LJLIL;
        String str = this.LLD;
        t5s.getTextBounds(str, 0, str.length(), this.LLIIII);
        this.LJLJLLL = this.LLIIII.height();
        this.LJLLLL = this.LLIIII.width();
        this.LJLL += this.LJLJLLL;
        if (!this.LJLLLLLL.isEmpty()) {
            this.LJLILLLLZI.getTextBounds((String) ListProtector.get(this.LJLLLLLL, 0), 0, ((String) ListProtector.get(this.LJLLLLLL, 0)).length(), this.LLIIII);
        } else {
            this.LJLILLLLZI.getTextBounds("SUN", 0, 3, this.LLIIII);
        }
        this.LJLL = C47959Irz.LIZJ(16, this.LLIIII.height()) + ((int) ((fontMetrics.bottom + fontMetrics.leading) - fontMetrics2.ascent)) + this.LJLL + ((int) (fontMetrics2.bottom + fontMetrics2.leading));
        int min = (int) (((Math.min(size, O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LiveChatShowDelayForHotLiveSetting.DEFAULT)))) - (C32151Nz.LJIIZILJ(8) * 6)) - (C32151Nz.LJIIZILJ(16) * 2)) / 7.0f);
        this.LJLLILLLL = min;
        this.LJLLJ = (int) ((min / 3.0f) * 4.0f);
        int LIZ = C0EH.LIZ(C7MY.LIZIZ(12), this.LJLLJ, this.LLFZ, this.LJLL);
        this.LJLL = LIZ;
        setMeasuredDimension(size, LIZ);
        this.LJLLL = size;
    }
}
