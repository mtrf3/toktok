package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.59V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C59V extends View {
    public static final int LLILLJJLI = ColorProtector.parseColor("#6677fffb");
    public static final int LLILLL = ColorProtector.parseColor("#66ff5c8e");
    public static final int LLILZ = ColorProtector.parseColor("#66fccf15");
    public static final int LLILZIL = ColorProtector.parseColor("#99000000");
    public NLETrackSlot LJLIL;
    public C122864ry LJLILLLLZI;
    public NLEVideoAnimation LJLJI;
    public final Paint LJLJJI;
    public final Paint LJLJJL;
    public int LJLJJLL;
    public long LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public boolean LJLL;
    public final RectF LJLLI;
    public final Rect LJLLILLLL;
    public final Path LJLLJ;
    public final Path LJLLL;
    public EnumC127354zD LJLLLL;
    public boolean LJLLLLLL;
    public long LJLZ;
    public final Paint LJZ;
    public final Path LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public InterfaceC88471Ynr<? super String, ? super Integer, Bitmap> LLFFF;
    public int LLFII;
    public float LLFZ;
    public final RectF LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public final int LLIIII;
    public final Rect LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public Bitmap LLIIIL;
    public final RectF LLIIIZ;
    public boolean LLIIJI;
    public long LLIIJLIL;
    public long LLIIL;
    public Bitmap LLIILII;
    public Long LLIILZL;
    public Bitmap LLIIZ;
    public Long LLIL;
    public float LLILII;
    public int LLILIL;
    public int LLILL;
    public int LLILLIZIL;

    private final Paint getBlackSlotPaint() {
        return (Paint) this.LLF.getValue();
    }

    private final Paint getDividerPaint() {
        return (Paint) this.LLFF.getValue();
    }

    public final boolean LIZIZ() {
        return ((Boolean) this.LLIIIJ.getValue()).booleanValue();
    }

    public final int getFrameDuration() {
        int i = this.LLILLIZIL;
        if (i > 0) {
            return i;
        }
        return C1300758p.LIZ;
    }

    public final float getPxMs() {
        float f = this.LLILII;
        if (f > 0.0f) {
            return f;
        }
        return C1300758p.LIZIZ();
    }

    public final int getThumbHeight() {
        int i = this.LLILL;
        if (i > 0) {
            return i;
        }
        return C1300758p.LIZLLL;
    }

    public final int getThumbWidth() {
        int i = this.LLILIL;
        if (i > 0) {
            return i;
        }
        return C1300758p.LIZJ;
    }

    public final Bitmap getDragThumbMask() {
        return this.LLIIIL;
    }

    public final boolean getEnableShade() {
        return this.LLIIJI;
    }

    public final boolean getEndDivider() {
        return this.LLII;
    }

    public final InterfaceC88471Ynr<String, Integer, Bitmap> getFrameFetcher() {
        return this.LLFFF;
    }

    public final float getHalfDivideWidth() {
        return this.LLFZ;
    }

    public final int getRound() {
        return this.LLFII;
    }

    public final RectF getRoundRectF() {
        return this.LLI;
    }

    public final long getShadeClipEndTime() {
        return this.LLIIL;
    }

    public final long getShadeClipStartTime() {
        return this.LLIIJLIL;
    }

    public final NLETrackSlot getSlot() {
        return this.LJLIL;
    }

    public final boolean getStartDivider() {
        return this.LLIFFJFJJ;
    }

    public final void LIZLLL(float f) {
        int i;
        if (!Float.isNaN(f)) {
            i = O6R.LJJIIZ(f);
        } else {
            i = (int) f;
        }
        this.LJLJJLL = i;
        getLayoutParams().width = this.LJLJJLL;
        setLayoutParams(getLayoutParams());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        float f6;
        int i2;
        int i3;
        int i4;
        int thumbWidth;
        Bitmap bitmap;
        long j;
        float f7;
        Bitmap invoke;
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        int i5 = 0;
        float f8 = 0.0f;
        if (this.LJLL) {
            C122864ry c122864ry = this.LJLILLLLZI;
            if (c122864ry == null) {
                return;
            }
            if (!this.LJZL) {
                f8 = (getPxMs() * ((float) (c122864ry.LJLILLLLZI / 1000))) / c122864ry.LJLJJL;
            }
            canvas.save();
            int thumbWidth2 = getThumbWidth();
            if (LIZIZ()) {
                this.LJLLILLLL.set((int) ((getMeasuredWidth() - f8) - thumbWidth2), 0, (int) (getMeasuredWidth() - f8), thumbWidth2);
            } else {
                int i6 = (int) f8;
                this.LJLLILLLL.set(i6, 0, i6 + thumbWidth2, thumbWidth2);
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.ajs);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.ajt);
            if (LIZIZ()) {
                this.LLIIIILZ.set((int) ((getMeasuredWidth() - f8) - dimensionPixelSize2), thumbWidth2 - dimensionPixelSize, (int) (getMeasuredWidth() - f8), thumbWidth2);
            } else {
                int i7 = (int) f8;
                this.LLIIIILZ.set(i7, thumbWidth2 - dimensionPixelSize, dimensionPixelSize2 + i7, thumbWidth2);
            }
            this.LLI.set(this.LJLLILLLL);
            this.LJZI.reset();
            Path path = this.LJZI;
            RectF rectF = this.LLI;
            float f9 = this.LLIIII;
            path.addRoundRect(rectF, f9, f9, Path.Direction.CCW);
            canvas.clipPath(this.LJZI);
            if (!ujb.o.LJJJJJL(c122864ry.LJLJJI)) {
                if (!this.LJZL) {
                    i5 = C5DZ.LIZ(((int) c122864ry.LJLILLLLZI) / 1000);
                    long j2 = this.LJLJL;
                    if (i5 > j2) {
                        i5 = (int) j2;
                    }
                }
                InterfaceC88471Ynr<? super String, ? super Integer, Bitmap> interfaceC88471Ynr = this.LLFFF;
                if (interfaceC88471Ynr != null && (invoke = interfaceC88471Ynr.invoke(c122864ry.LJLJJI, Integer.valueOf(i5))) != null) {
                    canvas.drawBitmap(invoke, (Rect) null, this.LJLLILLLL, (Paint) null);
                }
                Bitmap bitmap2 = this.LLIIIL;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, (Rect) null, this.LLIIIILZ, (Paint) null);
                }
            }
            canvas.restore();
            return;
        }
        C122864ry c122864ry2 = this.LJLILLLLZI;
        if (c122864ry2 == null) {
            return;
        }
        long j3 = 1000;
        float pxMs = (getPxMs() * ((float) (c122864ry2.LJLILLLLZI / j3))) / c122864ry2.LJLJJL;
        float pxMs2 = getPxMs() * ((float) (c122864ry2.LJLJI / j3));
        float f10 = pxMs + pxMs2;
        if (LIZIZ()) {
            if (this.LJZL) {
                this.LJLLI.set(getMeasuredWidth() - (pxMs2 + this.LJLJLLL), 0.0f, getMeasuredWidth(), getHeight());
            } else {
                this.LJLLI.set(getMeasuredWidth() - (f10 + this.LJLJLLL), 0.0f, getMeasuredWidth() - (pxMs + this.LJLJLJ), getHeight());
            }
        } else if (this.LJZL) {
            this.LJLLI.set(0.0f, 0.0f, pxMs2 + this.LJLJLLL, getHeight());
        } else {
            this.LJLLI.set(pxMs + this.LJLJLJ, 0.0f, f10 + this.LJLJLLL, getHeight());
        }
        float pxMs3 = getPxMs() * ((float) this.LJLZ);
        float pxMs4 = getPxMs() * ((float) (c122864ry2.LJLJJLL / j3));
        if (this.LLIFFJFJJ && this.LJLLLL == EnumC127354zD.NONE) {
            f = this.LLFZ;
        } else {
            f = 0.0f;
        }
        if (this.LLII && this.LJLLLL == EnumC127354zD.NONE) {
            f2 = this.LLFZ;
        } else {
            f2 = 0.0f;
        }
        if (LIZIZ()) {
            f3 = (this.LJLLI.right - (pxMs3 / 2)) - f;
        } else {
            f3 = (pxMs3 / 2) + this.LJLLI.left + f;
        }
        float f11 = this.LJLLI.top;
        if (LIZIZ()) {
            f4 = (pxMs4 / 2) + this.LJLLI.left + f2;
        } else {
            f4 = (this.LJLLI.right - f2) - (pxMs4 / 2);
        }
        float f12 = this.LJLLI.bottom;
        if (LIZIZ()) {
            f5 = (f / 2) + f3;
            i = this.LLFII;
        } else {
            f5 = f3 - (f / 2);
            i = this.LLFII;
        }
        float f13 = (i / 2.0f) + f5;
        if (LIZIZ()) {
            f6 = (this.LLFII / 2.0f) + (f4 - (f2 / 2));
        } else {
            f6 = (this.LLFII / 2.0f) + (f2 / 2) + f4;
        }
        if (this.LJLLLL == EnumC127354zD.NONE) {
            Integer num = C1291054w.LJ().LJJ;
            if (num != null) {
                int intValue = num.intValue();
                getDividerPaint().setStrokeWidth(this.LLFZ + this.LLFII);
                getDividerPaint().setColor(intValue);
                f7 = f11;
                canvas.drawLine(f13, f11, f13, f12, getDividerPaint());
                canvas.drawLine(f6, f11, f6, f12, getDividerPaint());
            } else {
                f7 = f11;
            }
            if (LIZIZ()) {
                this.LLIIIZ.set(f4, f7, f3, f12);
            } else {
                this.LLIIIZ.set(f3, f7, f4, f12);
            }
        } else {
            RectF rectF2 = this.LLIIIZ;
            RectF rectF3 = this.LJLLI;
            rectF2.set(rectF3.left, f11, rectF3.right, f12);
        }
        this.LJZI.reset();
        Path path2 = this.LJZI;
        RectF rectF4 = this.LLIIIZ;
        float f14 = this.LLFII;
        path2.addRoundRect(rectF4, f14, f14, Path.Direction.CCW);
        canvas.clipPath(this.LJZI);
        if (this.LJLLLLLL) {
            return;
        }
        Rect rect = new Rect();
        long j4 = 0;
        if (getLocalVisibleRect(rect)) {
            if (LIZIZ()) {
                i4 = getMeasuredWidth() - rect.right;
            } else {
                i4 = rect.left;
            }
            int thumbWidth3 = i4 / getThumbWidth();
            if (LIZIZ()) {
                thumbWidth = (getMeasuredWidth() - rect.left) / getThumbWidth();
            } else {
                thumbWidth = rect.right / getThumbWidth();
            }
            if (thumbWidth3 <= thumbWidth) {
                while (true) {
                    int thumbWidth4 = getThumbWidth() * thumbWidth3;
                    if (this.LL) {
                        if (LIZIZ()) {
                            this.LJLLILLLL.set((getMeasuredWidth() - thumbWidth4) - getThumbWidth(), 0, getMeasuredWidth() - thumbWidth4, getThumbHeight());
                        } else {
                            this.LJLLILLLL.set(thumbWidth4, 0, getThumbWidth() + thumbWidth4, getThumbHeight());
                        }
                        canvas.drawRect(this.LJLLILLLL, getBlackSlotPaint());
                        this.LLD = false;
                    } else if (!ujb.o.LJJJJJL(c122864ry2.LJLJJI)) {
                        if (!this.LJZL) {
                            bitmap = LIZ(c122864ry2.LJLJJL, c122864ry2.LJLJJI, thumbWidth3);
                        } else {
                            InterfaceC88471Ynr<? super String, ? super Integer, Bitmap> interfaceC88471Ynr2 = this.LLFFF;
                            if (interfaceC88471Ynr2 != null) {
                                bitmap = interfaceC88471Ynr2.invoke(c122864ry2.LJLJJI, 0);
                            } else {
                                bitmap = null;
                            }
                        }
                        Long l = this.LLIILZL;
                        long j5 = -1;
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = -1;
                        }
                        Long l2 = this.LLIL;
                        if (l2 != null) {
                            j5 = l2.longValue();
                        }
                        NLETrackSlot nLETrackSlot = this.LJLIL;
                        if (!this.LJZL && j >= j4 && j5 >= j4 && nLETrackSlot != null) {
                            long startTime = nLETrackSlot.getStartTime() + (O6R.LJJIIJZLJL(((getFrameDuration() * thumbWidth3) * c122864ry2.LJLJJL) / 1000.0d) * 1000 * 1000);
                            if (Math.abs(startTime - j) > Math.abs(startTime - j5)) {
                                bitmap = this.LLIIZ;
                            }
                        }
                        if (bitmap != null || (bitmap = this.LLIILII) != null || (bitmap = this.LLIIZ) != null) {
                            this.LLIILII = bitmap;
                            if (LIZIZ()) {
                                this.LJLLILLLL.set((getMeasuredWidth() - thumbWidth4) - getThumbWidth(), 0, getMeasuredWidth() - thumbWidth4, getThumbHeight());
                            } else {
                                this.LJLLILLLL.set(thumbWidth4, 0, getThumbWidth() + thumbWidth4, getThumbHeight());
                            }
                            canvas.drawBitmap(bitmap, (Rect) null, this.LJLLILLLL, (Paint) null);
                            this.LLD = false;
                        } else {
                            this.LLD = true;
                        }
                    } else {
                        this.LLD = true;
                    }
                    if (thumbWidth3 == thumbWidth) {
                        break;
                    }
                    thumbWidth3++;
                    j4 = 0;
                }
            }
        } else {
            this.LLD = true;
        }
        NLEVideoAnimation nLEVideoAnimation = this.LJLJI;
        if (nLEVideoAnimation != null && nLEVideoAnimation.getDuration() > 0) {
            Paint paint = this.LJLJJI;
            String extra = nLEVideoAnimation.getExtra("anim_type");
            if (o.LJ(extra, "anim_all")) {
                i3 = LLILZ;
            } else if (o.LJ(extra, "anim_out")) {
                i3 = LLILLL;
            } else {
                i3 = LLILLJJLI;
            }
            paint.setColor(i3);
            this.LJLJJI.setColor(LLILLJJLI);
            float min = Math.min(getPxMs() * (((float) nLEVideoAnimation.getDuration()) / 1000), this.LJLLI.width());
            if ((o.LJ(nLEVideoAnimation.getExtra("anim_type"), "anim_out") && !LIZIZ()) || (o.LJ(nLEVideoAnimation.getExtra("anim_type"), "anim_in") && LIZIZ())) {
                RectF rectF5 = this.LJLLI;
                float f15 = rectF5.right;
                canvas.drawRect(f15 - min, rectF5.top, f15, rectF5.bottom, this.LJLJJI);
            } else {
                RectF rectF6 = this.LJLLI;
                float f16 = rectF6.left;
                canvas.drawRect(f16, rectF6.top, f16 + min, rectF6.bottom, this.LJLJJI);
            }
        }
        NLETrackSlot nLETrackSlot2 = this.LJLIL;
        if (nLETrackSlot2 == null) {
            return;
        }
        if (this.LLIIJI) {
            float pxMs5 = getPxMs() * ((float) (this.LLIIJLIL / j3));
            float pxMs6 = getPxMs() * ((float) (this.LLIIL / j3));
            if (pxMs5 > 0.0f) {
                if (LIZIZ()) {
                    RectF rectF7 = this.LJLLI;
                    float f17 = rectF7.right;
                    canvas.drawRect(f17 - pxMs5, rectF7.top, f17, rectF7.bottom, this.LJLJJL);
                } else {
                    RectF rectF8 = this.LJLLI;
                    float f18 = rectF8.left;
                    canvas.drawRect(f18, rectF8.top, f18 + pxMs5, rectF8.bottom, this.LJLJJL);
                }
            }
            if (pxMs6 > 0.0f) {
                if (LIZIZ()) {
                    RectF rectF9 = this.LJLLI;
                    float f19 = rectF9.left;
                    canvas.drawRect(f19, rectF9.top, f19 + pxMs6, rectF9.bottom, this.LJLJJL);
                } else {
                    RectF rectF10 = this.LJLLI;
                    float f20 = rectF10.right;
                    canvas.drawRect(f20 - pxMs6, rectF10.top, f20, rectF10.bottom, this.LJLJJL);
                }
            }
        }
        if (this.LJLLLL == EnumC127354zD.NONE) {
            return;
        }
        if (pxMs3 == 0.0f) {
            i2 = 2;
        } else {
            this.LJLLJ.reset();
            if (LIZIZ()) {
                this.LJLLJ.moveTo(this.LJLLI.right, 0.0f);
                i2 = 2;
                this.LJLLJ.lineTo(this.LJLLI.right - O6R.LJJIIZ(pxMs3 / 2), 0.0f);
                this.LJLLJ.lineTo(this.LJLLI.right, getHeight());
                this.LJLLJ.lineTo(this.LJLLI.right, 0.0f);
            } else {
                i2 = 2;
                this.LJLLJ.moveTo(this.LJLLI.left, 0.0f);
                this.LJLLJ.lineTo(this.LJLLI.left + O6R.LJJIIZ(pxMs3 / 2), 0.0f);
                this.LJLLJ.lineTo(this.LJLLI.left, getHeight());
                this.LJLLJ.lineTo(this.LJLLI.left, 0.0f);
            }
            canvas.drawPath(this.LJLLJ, this.LJZ);
        }
        NLESegmentTransition LIZLLL = nLETrackSlot2.LIZLLL();
        if (LIZLLL == null || !LIZLLL.LJ()) {
            return;
        }
        float pxMs7 = getPxMs() * ((float) (LIZLLL.LJFF() / j3));
        this.LJLLL.reset();
        if (LIZIZ()) {
            this.LJLLL.moveTo(this.LJLLI.left, 0.0f);
            this.LJLLL.lineTo(this.LJLLI.left + O6R.LJJIIZ(pxMs7 / i2), getHeight());
            this.LJLLL.lineTo(this.LJLLI.left, getHeight());
            this.LJLLL.lineTo(this.LJLLI.left, 0.0f);
        } else {
            this.LJLLL.moveTo(this.LJLLI.right, 0.0f);
            this.LJLLL.lineTo(this.LJLLI.right - O6R.LJJIIZ(pxMs7 / i2), getHeight());
            this.LJLLL.lineTo(this.LJLLI.right, getHeight());
            this.LJLLL.lineTo(this.LJLLI.right, 0.0f);
        }
        canvas.drawPath(this.LJLLL, this.LJZ);
    }

    public final void setDragThumbMask(Bitmap bitmap) {
        this.LLIIIL = bitmap;
    }

    public final void setDrawMyTransitionOverlap(boolean z) {
        postInvalidate();
    }

    public final void setDrawPreTransitionOverlap(boolean z) {
        postInvalidate();
    }

    public final void setEnableShade(boolean z) {
        this.LLIIJI = z;
    }

    public final void setEndDivider(boolean z) {
        this.LLII = z;
    }

    public final void setFrameDuration(int i) {
        this.LLILLIZIL = i;
    }

    public final void setFrameFetcher(InterfaceC88471Ynr<? super String, ? super Integer, Bitmap> interfaceC88471Ynr) {
        this.LLFFF = interfaceC88471Ynr;
    }

    public final void setHalfDivideWidth(float f) {
        this.LLFZ = f;
    }

    public final void setIsFooter(boolean z) {
        this.LJLLLLLL = z;
        invalidate();
    }

    public final void setNeedRefresh(boolean z) {
        this.LLD = z;
    }

    public final void setPxMs(float f) {
        this.LLILII = f;
    }

    public final void setRound(int i) {
        this.LLFII = i;
    }

    public final void setShadeClipEndTime(long j) {
        this.LLIIL = j;
    }

    public final void setShadeClipStartTime(long j) {
        this.LLIIJLIL = j;
    }

    public final void setSlot(NLETrackSlot nLETrackSlot) {
        this.LJLIL = nLETrackSlot;
    }

    public final void setStartDivider(boolean z) {
        this.LLIFFJFJJ = z;
    }

    public final void setThumbHeight(int i) {
        this.LLILL = i;
    }

    public final void setThumbWidth(int i) {
        this.LLILIL = i;
    }

    public final void setTrackStyle(EnumC127354zD style) {
        o.LJIIIZ(style, "style");
        this.LJLLLL = style;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59V(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int LIZ;
        float dimension;
        new LinkedHashMap();
        Paint paint = new Paint(1);
        this.LJLJJI = paint;
        Paint paint2 = new Paint(1);
        this.LJLJJL = paint2;
        this.LJLJJLL = C1300758p.LIZJ;
        Context LLLLL = C16880lQ.LLLLL(C58S.LIZ());
        o.LJIIIIZZ(LLLLL, "TrackSdk.application.applicationContext");
        C134845Qy.LIZJ(LLLLL);
        this.LJLLI = new RectF();
        this.LJLLILLLL = new Rect();
        this.LJLLJ = new Path();
        this.LJLLL = new Path();
        this.LJLLLL = EnumC127354zD.NONE;
        Paint paint3 = new Paint(1);
        this.LJZ = paint3;
        this.LJZI = new Path();
        this.LLF = C221108m2.LIZIZ(C1301959b.LJLIL);
        this.LLFF = C221108m2.LIZIZ(C1302159d.LJLIL);
        this.LLI = new RectF();
        this.LLIIII = C1291054w.LJ().LIZ.LJIIJ;
        this.LLIIIILZ = new Rect();
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setTextSize(C134845Qy.LIZ(10.0f));
        LIZIZ.setStrokeWidth(C134845Qy.LIZ(1.0f));
        LIZIZ.setTextAlign(Paint.Align.LEFT);
        LIZIZ.setColor(-1);
        this.LLIIIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 45));
        this.LLIIIZ = new RectF();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.bw7, R.attr.bw8});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr….styleable.ItemFrameView)");
            this.LLFII = obtainStyledAttributes.getDimensionPixelSize(0, C1291054w.LJ().LIZ.LJIIIIZZ);
            Float f = C1291054w.LJ().LJIL;
            if (f != null) {
                dimension = C134845Qy.LIZ(f.floatValue());
            } else {
                dimension = obtainStyledAttributes.getDimension(1, C134845Qy.LIZ(1.5f));
            }
            this.LLFZ = dimension;
            obtainStyledAttributes.recycle();
        } else {
            this.LLFII = C1291054w.LJ().LIZ.LJIIIIZZ;
            Float f2 = C1291054w.LJ().LJIL;
            if (f2 != null) {
                LIZ = C134845Qy.LIZ(f2.floatValue());
            } else {
                LIZ = C134845Qy.LIZ(1.5f);
            }
            this.LLFZ = LIZ;
        }
        paint3.setColor(ColorProtector.parseColor("#66000000"));
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setColor(LLILZIL);
    }

    public final void LIZJ(long j, NLETrackSlot slot) {
        NLEResourceNode LIZIZ;
        long j2;
        long j3;
        o.LJIIIZ(slot, "slot");
        this.LJLIL = slot;
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(slot.LJI());
        if (LJJ == null) {
            return;
        }
        this.LJLILLLLZI = C121084p6.LIZ(slot, LJJ);
        this.LLIILII = null;
        if (C124614un.LJIILIIL(slot)) {
            String originPath = NLESegmentVideo.LJJ(slot.LJI()).LJIIJ().LIZJ();
            o.LJIIIIZZ(originPath, "originPath");
            this.LLIILII = LIZ(1.0f, originPath, 0);
        }
        this.LLIILZL = null;
        if (C124614un.LJIILIIL(slot)) {
            LIZIZ = C124614un.LJIIIIZZ(slot);
        } else {
            LIZIZ = LJJ.LIZIZ();
        }
        if (LIZIZ != null) {
            j3 = LIZIZ.getDuration() / 1000;
        } else {
            NLEResourceNode LIZIZ2 = LJJ.LIZIZ();
            if (LIZIZ2 != null) {
                j2 = LIZIZ2.getDuration();
            } else {
                j2 = 0;
            }
            j3 = j2 / 1000;
        }
        this.LJLJL = j3;
        this.LJZL = C124574uj.LJJJJ(slot);
        float pxMs = getPxMs() * ((float) this.LJLJL);
        NLESegmentVideo LJJ2 = NLESegmentVideo.LJJ(slot.LJI());
        o.LJIIIIZZ(LJJ2, "dynamicCast(slot.mainSegment)");
        this.LJLJJLL = O6R.LJJIIZ(pxMs / C124574uj.LIZ(LJJ2));
        getLayoutParams().width = this.LJLJJLL;
        this.LJLJLJ = 0.0f;
        this.LJLJLLL = 0.0f;
        this.LL = Boolean.parseBoolean(slot.getExtra("is_black_frame"));
        this.LJLZ = j;
        requestLayout();
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public final Bitmap LIZ(float f, String str, int i) {
        long j;
        int i2 = 0;
        Bitmap bitmap = null;
        Bitmap bitmap2 = null;
        while (bitmap2 == null) {
            if (i >= 0 && i2 <= 20) {
                int LJJIIJZLJL = O6R.LJJIIJZLJL(((getFrameDuration() * i) * f) / 1000.0d) * 1000;
                InterfaceC88471Ynr<? super String, ? super Integer, Bitmap> interfaceC88471Ynr = this.LLFFF;
                if (interfaceC88471Ynr != null) {
                    bitmap2 = interfaceC88471Ynr.invoke(str, Integer.valueOf(LJJIIJZLJL));
                } else {
                    bitmap2 = null;
                }
                i--;
                i2++;
                if (bitmap2 != null) {
                    long j2 = LJJIIJZLJL * 1000;
                    NLETrackSlot nLETrackSlot = this.LJLIL;
                    if (nLETrackSlot != null) {
                        j = nLETrackSlot.getStartTime();
                    } else {
                        j = 0;
                    }
                    this.LLIILZL = Long.valueOf(j2 + j);
                }
            } else {
                InterfaceC88471Ynr<? super String, ? super Integer, Bitmap> interfaceC88471Ynr2 = this.LLFFF;
                if (interfaceC88471Ynr2 != null) {
                    bitmap = interfaceC88471Ynr2.invoke(str, 1000);
                }
                return bitmap;
            }
        }
        return bitmap2;
    }
}
