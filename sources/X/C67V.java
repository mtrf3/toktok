package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.67V, reason: invalid class name */
/* loaded from: classes3.dex */
public class C67V {
    public Context LIZ;
    public Bitmap LJI;
    public Path LJII;
    public Bitmap LJIIIIZZ;
    public Paint LJIIJJI;
    public Paint LJIJ;
    public List<TextStickerTextWrap> LJIJJ;
    public TextStickerString[] LJIJJLI;
    public float LJJIFFI;
    public float LJJII;
    public int LJJIIJZLJL;
    public float LJJIIZ;
    public Path LJJIJIIJIL;
    public C67P LJJIJIL;
    public float LJJIJL;
    public float LJJIJLIJ;
    public float LJJIZ;
    public float LJJJIL;
    public RectF LIZIZ = new RectF();
    public final RectF LIZJ = new RectF();
    public final Rect LIZLLL = new Rect();
    public final RectF LJ = new RectF();
    public final RectF LJFF = new RectF();
    public final Rect LJIIIZ = new Rect();
    public final RectF LJIIJ = new RectF();
    public int LJIIL = 0;
    public int LJIILIIL = 0;
    public float LJIILJJIL = 0.0f;
    public float LJIILL = 0.0f;
    public boolean LJIILLIIL = false;
    public boolean LJIIZILJ = true;
    public int LJIJI = 0;
    public float LJIL = 60.0f;
    public float LJJ = 20.0f;
    public float LJJI = 20.0f;
    public int LJJIII = 20;
    public int LJJIIJ = 10;
    public final TextPaint LJJIIZI = new TextPaint();
    public final Paint LJJIJ = new Paint();
    public final Paint LJJIJIIJI = new Paint(2);
    public boolean LJJIL = false;
    public final List<PointF> LJJJ = new ArrayList();
    public boolean LJJJI = false;
    public final Paint.FontMetrics LJJJJ = new Paint.FontMetrics();
    public float LJJJJI = 0.0f;
    public float LJJJJIZL = 0.0f;

    public float LIZ(float f, TextStickerString[] textStickerStringArr) {
        return f;
    }

    public int LIZIZ(int i) {
        return i;
    }

    public TextStickerString[] LIZLLL(TextStickerString[] textStickerStringArr) {
        return textStickerStringArr;
    }

    public float LJ() {
        return 28.0f;
    }

    public int LJIILIIL() {
        return 0;
    }

    public int LJIILL(int i, int i2, int i3) {
        return i3;
    }

    public final RectF LJIIL() {
        RectF rectF = new RectF();
        rectF.set(this.LIZIZ);
        float f = rectF.left;
        int i = this.LJJIII;
        rectF.set(f - i, rectF.top - i, rectF.right + i, rectF.bottom + i);
        return rectF;
    }

    public int LJIILJJIL() {
        Paint.FontMetrics fontMetrics = this.LJJIIZI.getFontMetrics();
        return (int) (fontMetrics.descent - fontMetrics.ascent);
    }

    public int LJIIZILJ(int i) {
        return LJIILJJIL() * i;
    }

    public int LJIJI(int i) {
        return (int) this.LJJIIZI.measureText(this.LJIJJLI[i].getStr());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r8.size() != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r0 = (com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString[]) ((com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap) com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, 0)).getStrMap().keySet().toArray(new com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r4 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r4.hasNext() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r2 = r4.next();
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r1.isReplaceString() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (ujb.s.LJZI(r1.getText()).toString().length() <= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r2 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r2 = new java.util.ArrayList();
        r6 = new java.util.ArrayList();
        r5 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r5.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r4 = r5.next();
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r1.isReplaceString() != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (ujb.s.LJZI(r1.getText()).toString().length() <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        r6.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r1 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        if (r1.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        r2.addAll(((com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap) r1.next()).getStrMap().keySet());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        r0 = (com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString[]) r2.toArray(new com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        r0 = (com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString[]) ((com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap) com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, 0)).getStrMap().keySet().toArray(new com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f2, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r8.isEmpty() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIJJ(java.util.List<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap> r8) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67V.LJIJJ(java.util.List):void");
    }

    public void LJIJ(C67P c67p, Context context) {
        this.LIZ = context;
        this.LJJIJIL = c67p;
        if (!C158226Iw.LIZ()) {
            this.LJJIJIL.setLayerType(2, null);
        }
        this.LJIL = C170576mj.LJ(context, 28.0f);
        this.LJJ = C170576mj.LIZ(context, 12.0f);
        float LIZ = C170576mj.LIZ(context, 8.0f);
        this.LJJI = LIZ;
        this.LJJIFFI = this.LJJ;
        this.LJJII = LIZ;
        this.LJJIII = (int) C170576mj.LIZ(context, 2.0f);
        C170576mj.LIZ(context, 14.0f);
        this.LJJIIJ = (int) C170576mj.LIZ(context, 2.0f);
        this.LJJIIJZLJL = (int) C170576mj.LIZ(context, 5.0f);
        this.LJIIL = (int) C170576mj.LIZ(context, 12.0f);
        this.LJIILIIL = (int) C170576mj.LIZ(context, 9.0f);
        this.LJIILJJIL = C170576mj.LIZ(context, 6.0f);
        this.LJIILL = C170576mj.LIZ(context, 1.0f);
        this.LJJIIZ = C74275TDb.LIZIZ(context, 4.0f);
        this.LJI = BitmapFactory.decodeResource(context.getResources(), R.drawable.b4y);
        this.LJIIIIZZ = BitmapFactory.decodeResource(context.getResources(), R.drawable.b4v);
        this.LIZLLL.set(0, 0, this.LJI.getWidth(), this.LJI.getHeight());
        this.LJIIIZ.set(0, 0, this.LJIIIIZZ.getWidth(), this.LJIIIIZZ.getHeight());
        this.LJJIIZI.setColor(-1);
        this.LJJIIZI.setTypeface(Typeface.DEFAULT_BOLD);
        this.LJJIIZI.setTextSize(this.LJIL);
        this.LJJIIZI.setAntiAlias(true);
        new Paint(this.LJJIIZI).setColor(-16737912);
        this.LJJIJ.setColor(-2130706433);
        this.LJJIJ.setStyle(Paint.Style.STROKE);
        this.LJJIJ.setAntiAlias(true);
        this.LJJIJ.setStrokeWidth(2.0f);
        Paint paint = new Paint();
        this.LJIJ = paint;
        paint.setStyle(Paint.Style.FILL);
        this.LJIJ.setAntiAlias(true);
        this.LJIJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.LJIJ.setPathEffect(new CornerPathEffect(this.LJJIIJZLJL));
        this.LJJIJIIJIL = new Path();
        Paint paint2 = new Paint();
        this.LJIIJJI = paint2;
        float f = this.LJIILJJIL;
        paint2.setPathEffect(new DashPathEffect(new float[]{f, f}, 0.0f));
        this.LJIIJJI.setStyle(Paint.Style.STROKE);
        this.LJIIJJI.setColor(-1);
        this.LJIIJJI.setStrokeWidth(this.LJIILL);
        this.LJIIJJI.setAntiAlias(true);
        this.LJII = new Path();
    }

    public final void LJFF(Canvas canvas, float f, boolean z) {
        if (!this.LJJIL && z) {
            canvas.save();
            canvas.rotate(f, this.LIZJ.centerX(), this.LIZJ.centerY());
            this.LJIJ.setColor(this.LJIJI);
            canvas.drawPath(this.LJJIJIIJIL, this.LJIJ);
            canvas.restore();
        }
    }

    public final void LJI(Canvas canvas, float f, boolean z) {
        if (z) {
            canvas.save();
            canvas.rotate(f, this.LIZJ.centerX(), this.LIZJ.centerY());
            canvas.drawPath(this.LJII, this.LJIIJJI);
            canvas.drawBitmap(this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI);
            canvas.restore();
        }
    }

    public final void LJII(Canvas canvas, float f, boolean z) {
        if (z) {
            canvas.save();
            canvas.rotate(f, this.LIZJ.centerX(), this.LIZJ.centerY());
            this.LJJIJ.setColor(-1);
            RectF rectF = this.LIZJ;
            float f2 = this.LJJIIJ;
            canvas.drawRoundRect(rectF, f2, f2, this.LJJIJ);
            canvas.restore();
        }
    }

    public void LJIIIZ(Canvas canvas, C1553867y c1553867y, ArrayList<PointF[]> arrayList) {
        PointF pointF = c1553867y.LIZJ;
        this.LJJIJL = pointF.x;
        this.LJJIJLIJ = LIZ(pointF.y, this.LJIJJLI);
        this.LJJIIZI.setTextSize(c1553867y.LJ * c1553867y.LIZ);
        this.LJJJIL = C1553767x.LIZIZ(this.LIZ, this.LJJIIZI.getTextSize());
        this.LJJIIZI.getFontMetrics(this.LJJJJ);
        this.LJJIJLIJ = (this.LJJJJ.bottom * 2.0f) + this.LJJIJLIJ;
        this.LJJIZ = c1553867y.LIZIZ;
        TextStickerString[] LIZLLL = LIZLLL(this.LJIJJLI);
        this.LJIJJLI = LIZLLL;
        if (LIZLLL != null) {
            int LJIILIIL = LJIILIIL();
            int i = 0;
            while (true) {
                TextStickerString[] textStickerStringArr = this.LJIJJLI;
                if (i >= textStickerStringArr.length) {
                    break;
                }
                int LJIIIIZZ = C68W.LJIIIIZZ(this.LJJIIZI, textStickerStringArr[i].getStr(), 0, this.LJIJJLI[i].getStr().length());
                if (LJIIIIZZ > LJIILIIL) {
                    LJIILIIL = LJIIIIZZ;
                }
                i++;
            }
            int LIZIZ = LIZIZ(LJIILIIL);
            int i2 = c1553867y.LIZLLL;
            if (i2 == 1) {
                this.LJJIJL -= LIZIZ / 2;
            } else if (i2 == 3) {
                this.LJJIJL += LIZIZ / 2;
            }
        }
        LIZJ(this.LJJIJL, this.LJJIJLIJ, c1553867y.LIZ, c1553867y.LIZLLL, this.LJIILLIIL, arrayList);
        if (this.LJIILLIIL && this.LJIIZILJ) {
            this.LJIIZILJ = false;
            float LJIIJ = C60996Nwm.LJIIJ(this.LJJIJIL.getContext()) - (C170576mj.LIZ(this.LJJIJIL.getContext(), 54.0f) * 2.0f);
            if (this.LIZIZ.width() > LJIIJ) {
                float width = (c1553867y.LIZ * LJIIJ) / this.LIZIZ.width();
                this.LJJIJIL.LJLJJI.LIZ = width;
                c1553867y.LIZ = width;
                LJIIIZ(canvas, c1553867y, null);
                return;
            }
        }
        LJII(canvas, c1553867y.LIZIZ, c1553867y.LJI);
        LJIIIIZZ(canvas, this.LJJIJL, this.LJJIJLIJ, c1553867y.LIZIZ, c1553867y.LIZ, c1553867y.LIZLLL);
        LJFF(canvas, c1553867y.LIZIZ, c1553867y.LJFF);
        LJI(canvas, c1553867y.LIZIZ, this.LJIILLIIL);
    }

    public float LJIILLIIL(float f, float f2, int i) {
        return (this.LJJI * i) + f + f2;
    }

    public final void LJIIJJI(Canvas canvas, List<InteractTextStructWrap> list, String str, float f, float f2) {
        char c;
        float f3 = f;
        if (!C68W.LJIIL(str.length(), list)) {
            LJIIJ(canvas, str, 0, str.length(), f3, f2, this.LJJIIZI);
            canvas.drawText(str, f3, f2, this.LJJIIZI);
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) ListProtector.get(list, i2);
            if (interactTextStructWrap.getRange().isValid(str.length())) {
                if (i < interactTextStructWrap.getRange().getStart()) {
                    LJIIJ(canvas, str, i, interactTextStructWrap.getRange().getStart(), f3, f2, this.LJJIIZI);
                    canvas.drawText(str, i, interactTextStructWrap.getRange().getStart(), f3, f2, (Paint) this.LJJIIZI);
                    f3 += C68W.LJIIIIZZ(this.LJJIIZI, str, i, interactTextStructWrap.getRange().getStart());
                }
                int start = interactTextStructWrap.getRange().getStart();
                int end = interactTextStructWrap.getRange().getEnd();
                if (start < str.length() && str.charAt(start) == ' ') {
                    int i3 = start + 1;
                    c = ' ';
                    canvas.drawText(str, start, i3, f3, f2, (Paint) this.LJJIIZI);
                    f3 += C68W.LJIIIIZZ(this.LJJIIZI, str, start, i3);
                    start = i3;
                } else {
                    c = ' ';
                }
                if (start < str.length() && str.charAt(start) == '_') {
                    this.LJFF.offsetTo(f3, ((((this.LJJIIZI.getFontMetricsInt().descent + f2) + f2) + this.LJJIIZI.getFontMetricsInt().ascent) / 2.0f) - (this.LJFF.height() / 2.0f));
                    canvas.drawBitmap(this.LJI, this.LIZLLL, this.LJFF, this.LJJIJIIJI);
                    f3 += this.LJFF.width() + this.LJJIIZ;
                    start++;
                }
                int i4 = end - 1;
                if (str.charAt(i4) == c) {
                    end = i4;
                }
                if (start < end) {
                    LJIIJ(canvas, str, start, end, f3, f2, this.LJJIIZI);
                    this.LJJIIZI.setUnderlineText(true);
                    canvas.drawText(str, start, end, f3, f2, (Paint) this.LJJIIZI);
                    this.LJJIIZI.setUnderlineText(false);
                    f3 += C68W.LJIIIIZZ(this.LJJIIZI, str, start, end);
                }
                if (end < interactTextStructWrap.getRange().getEnd()) {
                    canvas.drawText(str, end, end + 1, f3, f2, (Paint) this.LJJIIZI);
                    f3 += C68W.LJIIIIZZ(this.LJJIIZI, str, end, r4);
                }
                i = interactTextStructWrap.getRange().getEnd();
            }
        }
        if (i < str.length()) {
            LJIIJ(canvas, str, i, str.length(), f3, f2, this.LJJIIZI);
            canvas.drawText(str, i, str.length(), f3, f2, (Paint) this.LJJIIZI);
        }
    }

    public final void LIZJ(float f, float f2, float f3, int i, boolean z, ArrayList<PointF[]> arrayList) {
        char c;
        char c2;
        if (arrayList != null) {
            arrayList.clear();
        }
        TextStickerString[] textStickerStringArr = this.LJIJJLI;
        if (textStickerStringArr == null || textStickerStringArr.length == 0) {
            return;
        }
        Paint.FontMetrics fontMetrics = this.LJJIIZI.getFontMetrics();
        float f4 = fontMetrics.ascent;
        float f5 = fontMetrics.descent;
        int length = this.LJIJJLI.length;
        int i2 = length - 1;
        float LJIIZILJ = LJIIZILJ(i2);
        PointF[][] pointFArr = new PointF[length];
        int i3 = (int) (f5 - f4);
        float f6 = this.LJJIFFI;
        float f7 = f6 * f3;
        this.LJJ = f7;
        float f8 = this.LJJII;
        float f9 = f8 * f3;
        this.LJJI = f9;
        if (f9 >= f8) {
            this.LJJI = f8;
        }
        if (f7 >= f6) {
            this.LJJ = f6;
        }
        int i4 = (int) (f2 - (LJIIZILJ / 2.0f));
        float f10 = (this.LJIL * f3) / 4.0f;
        int i5 = -1;
        int i6 = -1;
        float f11 = Float.MAX_VALUE;
        float f12 = Float.MIN_VALUE;
        int i7 = 0;
        int i8 = 0;
        float f13 = 0.0f;
        int i9 = 0;
        float f14 = 0.0f;
        int i10 = 0;
        while (i7 < length) {
            int LJIJI = LJIJI(i7);
            i3 = LJIILL(i7, length, i3);
            float f15 = LJIJI / 2;
            float f16 = this.LJJ;
            float f17 = (f - f15) - f16;
            float f18 = f + f15 + f16;
            if (f17 < f11) {
                f11 = f17;
            }
            if (f18 > f12) {
                f12 = f18;
            }
            if (i == 1) {
                f17 = f - f16;
                f18 = f + LJIJI + f16;
            } else if (i == 3) {
                f17 = (f - LJIJI) - f16;
                f18 = f + f16;
            }
            if (this.LJIJJLI[i7].getStr().trim().length() == 0) {
                if (i == 1) {
                    f18 = f + this.LJJ;
                } else {
                    f18 = f;
                    if (i == 3) {
                        f18 = f - this.LJJ;
                    }
                }
                f17 = f18;
            }
            if (Math.abs(LJIJI - i9) >= f10 || (i != 1 ? i != 3 ? i != 2 || f14 <= 0.0f : f14 <= 0.0f : f13 <= 0.0f)) {
                f13 = f18;
                f14 = f17;
            }
            if (i7 == 0) {
                i10 = i4 - i3;
            }
            int i11 = i10 + i3;
            if (length > 1) {
                if (i7 > 0) {
                    i5 = LJIJI(i7 - 1);
                }
                if (i7 < i2) {
                    i6 = LJIJI(i7 + 1);
                }
            }
            if (i5 > 0 && LJIJI >= i5) {
                i11 = (int) (i11 + this.LJJI);
            }
            if (i6 > 0 && LJIJI > i6) {
                i11 = (int) (i11 + this.LJJI);
            }
            if (i7 == 0) {
                i10 = (int) (i10 - this.LJJI);
            }
            if (i7 == i2) {
                i11 = (int) (i11 + this.LJJI);
            }
            PointF[] pointFArr2 = new PointF[4];
            float f19 = i10;
            pointFArr2[0] = new PointF(f14, f19);
            pointFArr2[1] = new PointF(f13, f19);
            float f20 = i11;
            pointFArr2[2] = new PointF(f13, f20);
            pointFArr2[3] = new PointF(f14, f20);
            pointFArr[i7] = pointFArr2;
            if (arrayList != null) {
                arrayList.add(pointFArr2);
            }
            if (LJIJI > i8) {
                i8 = LJIJI;
            }
            i7++;
            i9 = LJIJI;
            i10 = i11;
        }
        PointF pointF = pointFArr[0][0];
        float f21 = pointF.x;
        float f22 = pointF.y;
        float f23 = f21;
        float f24 = f22;
        for (int i12 = 0; i12 < length; i12++) {
            for (PointF pointF2 : pointFArr[i12]) {
                float f25 = pointF2.x;
                if (f25 < f21) {
                    f21 = f25;
                }
                if (f25 > f23) {
                    f23 = f25;
                }
                float f26 = pointF2.y;
                if (f26 < f22) {
                    f22 = f26;
                }
                if (f26 > f24) {
                    f24 = f26;
                }
            }
        }
        this.LJJIJIIJIL.reset();
        ((ArrayList) this.LJJJ).clear();
        for (int i13 = 0; i13 < length; i13++) {
            if (i13 == 0) {
                Path path = this.LJJIJIIJIL;
                PointF pointF3 = pointFArr[i13][0];
                path.moveTo(pointF3.x, pointF3.y);
            }
            Path path2 = this.LJJIJIIJIL;
            PointF pointF4 = pointFArr[i13][1];
            path2.lineTo(pointF4.x, pointF4.y);
            PointF[] pointFArr3 = pointFArr[i13];
            float f27 = pointFArr3[0].x;
            PointF pointF5 = pointFArr3[1];
            float f28 = pointF5.x;
            if (f27 == f28) {
                this.LJJIJIIJIL.lineTo(f28, pointF5.y);
                Path path3 = this.LJJIJIIJIL;
                c2 = 2;
                PointF pointF6 = pointFArr[i13][2];
                path3.lineTo(pointF6.x, pointF6.y);
            } else {
                c2 = 2;
            }
            Path path4 = this.LJJIJIIJIL;
            PointF pointF7 = pointFArr[i13][c2];
            path4.lineTo(pointF7.x, pointF7.y);
            ((ArrayList) this.LJJJ).add(pointFArr[i13][0]);
            ((ArrayList) this.LJJJ).add(pointFArr[i13][1]);
            ((ArrayList) this.LJJJ).add(pointFArr[i13][2]);
            ((ArrayList) this.LJJJ).add(pointFArr[i13][3]);
        }
        for (int i14 = i2; i14 >= 0; i14--) {
            PointF[] pointFArr4 = pointFArr[i14];
            if (pointFArr4[0].x == pointFArr4[1].x) {
                Path path5 = this.LJJIJIIJIL;
                c = 3;
                PointF pointF8 = pointFArr4[3];
                path5.lineTo(pointF8.x, pointF8.y);
            } else {
                c = 3;
            }
            Path path6 = this.LJJIJIIJIL;
            PointF pointF9 = pointFArr[i14][c];
            path6.lineTo(pointF9.x, pointF9.y);
            PointF[] pointFArr5 = pointFArr[i14];
            PointF pointF10 = pointFArr5[0];
            float f29 = pointF10.x;
            if (f29 == pointFArr5[1].x) {
                this.LJJIJIIJIL.lineTo(f29, pointF10.y);
            }
            Path path7 = this.LJJIJIIJIL;
            PointF pointF11 = pointFArr[i14][0];
            path7.lineTo(pointF11.x, pointF11.y);
        }
        Path path8 = this.LJJIJIIJIL;
        PointF pointF12 = pointFArr[0][1];
        path8.lineTo(pointF12.x, pointF12.y);
        this.LJJIIZI.getTextBounds(this.LJIJJLI[0].getStr(), 0, this.LJIJJLI[0].getStr().length(), new Rect());
        int i15 = i8 >> 1;
        if (i == 1) {
            float f30 = this.LJJ;
            this.LIZIZ = new RectF(f - f30, pointFArr[0][0].y, f + i8 + f30, pointFArr[i2][2].y);
        } else if (i == 3) {
            float f31 = this.LJJ;
            this.LIZIZ = new RectF((f - i8) - f31, pointFArr[0][0].y, f + f31, pointFArr[i2][2].y);
        } else if (i == 2) {
            float f32 = i15;
            float f33 = this.LJJ;
            this.LIZIZ = new RectF((f - f32) - f33, pointFArr[0][0].y, f + f32 + f33, pointFArr[i2][2].y);
        }
        this.LIZJ.set(this.LIZIZ);
        RectF rectF = this.LIZJ;
        float f34 = rectF.left;
        float f35 = this.LJJIII;
        rectF.set(f34 - f35, rectF.top - f35, rectF.right + f35, rectF.bottom + f35);
        if (!z) {
            return;
        }
        RectF rectF2 = this.LIZIZ;
        float f36 = rectF2.left;
        float f37 = this.LJIIL;
        float f38 = f36 - f37;
        float f39 = rectF2.right + f37;
        float f40 = rectF2.top - f37;
        float f41 = rectF2.bottom + f37;
        this.LJII.reset();
        this.LJII.moveTo(f38, f40);
        this.LJII.lineTo(f39, f40);
        this.LJII.lineTo(f39, f41);
        this.LJII.lineTo(f38, f41);
        this.LJII.lineTo(f38, f40);
        Context context = this.LJJIJIL.getContext();
        if (context != null && C012403c.LIZ(context) == 1) {
            RectF rectF3 = this.LJIIJ;
            float f42 = this.LJIILIIL;
            rectF3.set(f39 - f42, f40 - f42, f39 + f42, f40 + f42);
        } else {
            RectF rectF4 = this.LJIIJ;
            float f43 = this.LJIILIIL;
            rectF4.set(f38 - f43, f40 - f43, f38 + f43, f40 + f43);
        }
    }

    public void LJIIIIZZ(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        Object obj;
        List<InteractTextStructWrap> arrayList;
        int i2;
        TextStickerString[] textStickerStringArr = this.LJIJJLI;
        if (textStickerStringArr == null || textStickerStringArr.length == 0) {
            return;
        }
        float f5 = this.LJJIIZI.getFontMetrics().descent;
        int length = this.LJIJJLI.length;
        float LJIILJJIL = ((LJIILJJIL() * (length - 1)) / 2.0f) - f5;
        canvas.save();
        canvas.rotate(f3, this.LIZJ.centerX(), this.LIZJ.centerY());
        float f6 = this.LJIL * 0.7f;
        this.LJ.set(0.0f, 0.0f, f6, f6);
        this.LJFF.set(this.LJ);
        C77119UOl.LJJIIZ(this.LJFF, f4);
        C77119UOl.LJJIIJZLJL(f, f2, this.LJFF, f3);
        int i3 = 0;
        int i4 = 0;
        float f7 = 0.0f;
        float f8 = 0.0f;
        while (i4 < length) {
            float LJIILJJIL2 = (LJIILJJIL() * (-((length - i4) - 1))) + LJIILJJIL;
            String str = this.LJIJJLI[i4].getStr();
            List<TextStickerTextWrap> list = this.LJIJJ;
            TextStickerString str2 = this.LJIJJLI[i4];
            o.LJIIIZ(str2, "str");
            if (list == null) {
                arrayList = new ArrayList<>();
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator<TextStickerTextWrap> it = list.iterator();
                while (it.hasNext()) {
                    ORS.LJJLIIIJILLIZJL(it.next().getStrMap().entrySet(), arrayList2);
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (o.LJ(((Map.Entry) obj).getKey(), str2)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry != null) {
                    arrayList = (List) entry.getValue();
                } else {
                    arrayList = new ArrayList<>();
                }
            }
            int LJIIIIZZ = C68W.LJIIIIZZ(this.LJJIIZI, str, i3, str.length());
            if (!C68W.LJIIL(str.length(), arrayList)) {
                i2 = 0;
            } else {
                i2 = 0;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) ListProtector.get(arrayList, i5);
                    if (interactTextStructWrap.getRange().isValid(str.length())) {
                        int start = interactTextStructWrap.getRange().getStart();
                        if (start < str.length() && str.charAt(start) == ' ') {
                            start++;
                        }
                        if (start < str.length() && str.charAt(start) == '_') {
                            i2 = (int) (this.LJFF.width() + this.LJJIIZ + (i2 - C68W.LJIIIIZZ(this.LJJIIZI, str, start, start + 1)));
                        }
                    }
                }
            }
            int i6 = LJIIIIZZ + i2;
            float LJIILLIIL = LJIILLIIL(f2, LJIILJJIL2, i4);
            if (i == 2) {
                LJIIJJI(canvas, arrayList, str, f - (i6 / 2), LJIILLIIL);
            } else if (i == 1) {
                LJIIJJI(canvas, arrayList, str, f, LJIILLIIL);
            } else if (i == 3) {
                LJIIJJI(canvas, arrayList, str, f - i6, LJIILLIIL);
            }
            if (length % 2 == 0) {
                int i7 = i4 + 1;
                int i8 = length / 2;
                if (i7 == i8) {
                    f7 = LJIILLIIL;
                }
                if (i7 == i8 + 1) {
                    f8 = LJIILLIIL;
                }
            } else if (i4 + 1 == (length / 2) + 1) {
                f7 = LJIILLIIL;
                f8 = LJIILLIIL;
            }
            i4++;
            i3 = 0;
        }
        this.LJJJJI = ((((this.LJJIIZI.ascent() + this.LJJIIZI.descent()) / 2.0f) - this.LJJIIZI.descent()) / 2.0f) + ((f7 + f8) / 2.0f);
        this.LJJJJIZL = f;
        canvas.restore();
    }

    public final void LJIIJ(Canvas canvas, String str, int i, int i2, float f, float f2, Paint paint) {
        if (this.LJJJI) {
            for (TextStickerTextWrap textStickerTextWrap : this.LJJIJIL.getTextWrapList()) {
                if (textStickerTextWrap != null && !TextUtils.isEmpty(textStickerTextWrap.getText())) {
                    int color = paint.getColor();
                    paint.setColor(C1553767x.LIZ(color));
                    Paint.Style style = paint.getStyle();
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    Paint.Cap strokeCap = paint.getStrokeCap();
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    Paint.Join strokeJoin = paint.getStrokeJoin();
                    paint.setStrokeJoin(Paint.Join.ROUND);
                    float strokeWidth = paint.getStrokeWidth();
                    paint.setStrokeWidth(this.LJJJIL);
                    canvas.drawText(str, i, i2, f, f2, (Paint) this.LJJIIZI);
                    paint.setColor(color);
                    paint.setStyle(style);
                    paint.setStrokeCap(strokeCap);
                    paint.setStrokeJoin(strokeJoin);
                    paint.setStrokeWidth(strokeWidth);
                    return;
                }
            }
        }
    }
}
