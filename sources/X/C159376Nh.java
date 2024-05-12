package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.6Nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159376Nh extends C19K implements C6UF<TextStickerModel> {
    public C1NS<TextStickerModel> LJLJJLL;
    public LifecycleOwner LJLJL;
    public InterfaceC88472Yns<? super String, ? extends Typeface> LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public final int LJLLILLLL;
    public Paint LJLLJ;
    public Path LJLLL;
    public Path LJLLLL;
    public Bitmap LJLLLLLL;
    public Rect LJLZ;
    public RectF LJZ;
    public Paint LJZI;
    public final float LJZL;
    public final float LL;
    public AnonymousClass635 LLD;
    public final int LLF;
    public boolean LLFF;

    @Override // X.C6UF
    public final void LIZIZ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
    }

    @Override // X.C6UF
    public final void LIZJ() {
    }

    @Override // X.C6UF
    public final void LJFF() {
    }

    @Override // X.C6UF
    public View getView() {
        return this;
    }

    public final RectF getDeleteIconRect() {
        C1NS<TextStickerModel> c1ns = this.LJLJJLL;
        if (c1ns != null) {
            float scale = c1ns.LJ.getBaseStickerModel().getScale();
            C1NS<TextStickerModel> c1ns2 = this.LJLJJLL;
            if (c1ns2 != null) {
                RectF visibleRectWithoutRotation = c1ns2.LJ.getBaseSticker().getVisibleRectWithoutRotation();
                float f = visibleRectWithoutRotation.left;
                float f2 = visibleRectWithoutRotation.top;
                float f3 = this.LL;
                float f4 = 2;
                RectF rectF = new RectF(f, f2, (f3 * scale * f4) + f, (f3 * scale * f4) + f2);
                Matrix matrix = new Matrix();
                matrix.postRotate(getRotation(), visibleRectWithoutRotation.centerX(), visibleRectWithoutRotation.centerY());
                matrix.mapRect(rectF);
                return rectF;
            }
            o.LJIJI("stateContainer");
            throw null;
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159376Nh(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLJLLL = C88517Yob.LIZ();
        this.LJLL = ((Number) C88517Yob.LIZIZ.getValue()).intValue();
        this.LJLLI = ((Number) C88517Yob.LJ.getValue()).intValue() * 2;
        this.LJLLILLLL = ((Number) C88517Yob.LIZLLL.getValue()).intValue();
        this.LJLLJ = new Paint();
        this.LJLLL = new Path();
        new TextPaint();
        this.LJZL = C32151Nz.LJIIZILJ(12);
        this.LL = C32151Nz.LJIIZILJ(9);
        this.LLF = ((Number) C88517Yob.LIZ.getValue()).intValue();
    }

    private final void setFontService(InterfaceC88472Yns<? super String, ? extends Typeface> interfaceC88472Yns) {
        this.LJLJLJ = interfaceC88472Yns;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        float lineBottom;
        o.LJIIIZ(canvas, "canvas");
        if (String.valueOf(getText()).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && getLayout() != null) {
            float f = getPaint().getFontMetrics().ascent - getPaint().getFontMetrics().top;
            float f2 = this.LJZL + this.LL;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int lineCount = getLayout().getLineCount();
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (int i = 0; i < lineCount; i++) {
                if (i == 0) {
                    lineBottom = getLayout().getLineTop(i) + f2;
                } else {
                    lineBottom = this.LLF + getLayout().getLineBottom(i - 1) + f;
                }
                float lineBottom2 = getLayout().getLineBottom(i) + f;
                if (i == getLayout().getLineCount() - 1) {
                    lineBottom2 += this.LJLLILLLL + f2 + this.LLF;
                }
                float lineLeft = getLayout().getLineLeft(i) - (this.LJLLI / 2);
                float lineRight = getLayout().getLineRight(i) + (this.LJLLI / 2);
                PointF pointF = new PointF(lineLeft, lineBottom);
                PointF pointF2 = new PointF(lineRight, lineBottom);
                PointF pointF3 = new PointF(lineLeft, lineBottom2);
                PointF pointF4 = new PointF(lineRight, lineBottom2);
                if (!o.LJ(pointF, ORZ.LLFII(arrayList))) {
                    arrayList.add(pointF);
                }
                if (!o.LJ(pointF3, ORZ.LLFF(arrayList))) {
                    arrayList.add(pointF3);
                }
                if (!o.LJ(pointF2, ORZ.LLFII(arrayList2))) {
                    arrayList2.add(pointF2);
                }
                if (!o.LJ(pointF4, ORZ.LLFF(arrayList2))) {
                    arrayList2.add(pointF4);
                }
                if (f4 == 0.0f) {
                    f4 = lineLeft;
                } else {
                    f4 = Math.min(lineLeft, f4);
                }
                if (f5 == 0.0f) {
                    f5 = lineBottom;
                } else {
                    f5 = Math.min(lineBottom, f5);
                }
                if (f6 == 0.0f) {
                    f6 = lineRight;
                } else {
                    f6 = Math.max(lineRight, f6);
                }
                if (f3 == 0.0f) {
                    f3 = lineBottom2;
                } else {
                    f3 = Math.max(lineBottom2, f3);
                }
            }
            this.LJLLL.reset();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 == 0) {
                    this.LJLLL.moveTo(((PointF) ListProtector.get(arrayList, i2)).x, ((PointF) ListProtector.get(arrayList, i2)).y);
                } else {
                    this.LJLLL.lineTo(((PointF) ListProtector.get(arrayList, i2)).x, ((PointF) ListProtector.get(arrayList, i2)).y);
                }
            }
            Collections.reverse(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                PointF pointF5 = (PointF) it.next();
                this.LJLLL.lineTo(pointF5.x, pointF5.y);
            }
            this.LJLLL.lineTo(((PointF) ListProtector.get(arrayList, 0)).x, ((PointF) ListProtector.get(arrayList, 0)).y);
            this.LJLLL.close();
            canvas.drawPath(this.LJLLL, this.LJLLJ);
            RectF rectF = new RectF(f4, f5, f6, f3);
            float f7 = rectF.left;
            float f8 = this.LJZL;
            float f9 = f7 - f8;
            float f10 = rectF.right + f8;
            float f11 = rectF.top - f8;
            float f12 = rectF.bottom + f8;
            Path path = this.LJLLLL;
            if (path != null) {
                path.reset();
                path.moveTo(f9, f11);
                path.lineTo(f10, f11);
                path.lineTo(f10, f12);
                path.lineTo(f9, f12);
                path.lineTo(f9, f11);
                float f13 = this.LL;
                this.LJZ = new RectF(f9 - f13, f11 - f13, f9 + f13, f11 + f13);
            } else {
                o.LJIJI("guidanceRectPath");
                throw null;
            }
        }
        if (!this.LLFF) {
            canvas.save();
            Path path2 = this.LJLLLL;
            if (path2 != null) {
                Paint paint = this.LJZI;
                if (paint != null) {
                    canvas.drawPath(path2, paint);
                    Bitmap bitmap = this.LJLLLLLL;
                    if (bitmap != null) {
                        Rect rect = this.LJLZ;
                        if (rect != null) {
                            RectF rectF2 = this.LJZ;
                            if (rectF2 != null) {
                                Paint paint2 = this.LJZI;
                                if (paint2 != null) {
                                    canvas.drawBitmap(bitmap, rect, rectF2, paint2);
                                    canvas.restore();
                                } else {
                                    o.LJIJI("guidanceRectPaint");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("deleteIconRect");
                                throw null;
                            }
                        } else {
                            o.LJIJI("guidanceSrcRect");
                            throw null;
                        }
                    } else {
                        o.LJIJI("guidanceTextDeleteBitmap");
                        throw null;
                    }
                } else {
                    o.LJIJI("guidanceRectPaint");
                    throw null;
                }
            } else {
                o.LJIJI("guidanceRectPath");
                throw null;
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1NS<TextStickerModel> c1ns = this.LJLJJLL;
        if (c1ns != null) {
            if (!c1ns.LJ.getClickable()) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    public final void setFontType(Typeface fontType) {
        o.LJIIIZ(fontType, "fontType");
        setTypeface(fontType);
        setLineSpacing(getLineSpacingExtra() + this.LLF, getLineSpacingMultiplier());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float f = 2;
        setMeasuredDimension((int) (((this.LJZL + this.LL) * f) + getMeasuredWidth() + this.LJLLI), (int) (((this.LJZL + this.LL + this.LJLLILLLL) * f) + getMeasuredHeight() + this.LLF));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C1NS<com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel> r13, androidx.lifecycle.LifecycleOwner r14, X.AnonymousClass635 r15, X.InterfaceC88472Yns<? super java.lang.String, ? extends android.graphics.Typeface> r16) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159376Nh.LJI(X.1NS, androidx.lifecycle.LifecycleOwner, X.635, X.Yns):void");
    }
}
