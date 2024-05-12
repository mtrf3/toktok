package X;

import Y.IDRunnableS6S0101000;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.67P, reason: invalid class name */
/* loaded from: classes3.dex */
public class C67P extends FrameLayout implements InterfaceC1549166d<TextStickerData> {
    public static final /* synthetic */ int LLIIL = 0;
    public float LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public final C1553867y LJLJJI;
    public boolean LJLJJL;
    public List<TextStickerTextWrap> LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public String LJLJLLL;
    public boolean LJLL;
    public final SafeHandler LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public int LJLLLLLL;
    public C67V LJLZ;
    public C67Z LJZ;
    public C67T LJZI;
    public TextStickerData LJZL;
    public long LL;
    public long LLD;
    public final ArrayList<PointF[]> LLF;
    public int LLFF;
    public int LLFFF;
    public final C6DA LLFII;
    public final PointF LLFZ;
    public C66B LLI;
    public InterfaceC1543363x LLIFFJFJJ;
    public boolean LLII;
    public final int LLIIII;
    public C68B LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;

    public RectF getBubbleShowLimitRect() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        RectF currentHelpBoxRect = getCurrentHelpBoxRect();
        int i = iArr[0];
        float f = i + currentHelpBoxRect.left;
        int i2 = iArr[1];
        return new RectF(f, i2 + currentHelpBoxRect.top, i + currentHelpBoxRect.right, i2 + currentHelpBoxRect.bottom);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    private int getFontSize() {
        float fontSize;
        C1553867y c1553867y = this.LJLJJI;
        if (c1553867y.LJ < 0) {
            Context context = getContext();
            TextStickerData textStickerData = this.LJZL;
            if (textStickerData == null) {
                fontSize = 28.0f;
            } else {
                fontSize = textStickerData.getFontSize();
            }
            c1553867y.LJ = (int) C170576mj.LJ(context, fontSize);
        }
        return this.LJLJJI.LJ;
    }

    public TextStickerData LJ() {
        if (this.LJZL == null) {
            TextStickerData textStickerData = new TextStickerData("", this.LJLJL, this.LJLJLJ, this.LJLJJI.LIZLLL, this.LJLJLLL);
            this.LJZL = textStickerData;
            textStickerData.setTextWrapList(getTextWrapList());
            C6PB.LIZJ();
            C6PB.LIZJ().LIZIZ(new IllegalStateException("Why are you running here?"));
        }
        this.LJZL.setTextStr(C68W.LJFF(getTextWrapList()));
        this.LJZL.setX(this.LJLIL);
        this.LJZL.setY(this.LJLILLLLZI);
        this.LJZL.setRotation(this.LJLJJI.LIZIZ);
        this.LJZL.setScale(this.LJLJJI.LIZ);
        this.LJZL.setTextWrapList(getTextWrapList());
        this.LJZL.setBgMode(this.LJLJL);
        this.LJZL.setColor(this.LJLJLJ);
        this.LJZL.setAlign(this.LJLJJI.LIZLLL);
        this.LJZL.setFontType(this.LJLJLLL);
        TextStickerData textStickerData2 = this.LJZL;
        textStickerData2.setFontSize(textStickerData2.getFontSize());
        this.LJZL.setLayoutWidth(getMeasuredWidth());
        this.LJZL.setLayoutHeight(getMeasuredHeight());
        return this.LJZL;
    }

    public void LJFF() {
        C67Z c67z = this.LJZ;
        float f = this.LJLIL;
        float f2 = this.LJLILLLLZI;
        C1553867y c1553867y = this.LJLJJI;
        float f3 = c1553867y.LIZ;
        float f4 = c1553867y.LIZIZ;
        c67z.LJI = true;
        c67z.LJII = false;
        c67z.LJIIIIZZ = f;
        c67z.LJIIIZ = f2;
        c67z.LJIIJ = f4;
        c67z.LJIIJJI = f3;
        float f5 = 15;
        c67z.LIZ = f3 / f5;
        c67z.LIZIZ = f4 / f5;
        c67z.LIZJ = (f - c67z.LJ) / f5;
        c67z.LIZLLL = (f2 - c67z.LJFF) / f5;
        c67z.LJIIL.invalidate();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public void LJI() {
        C67Z c67z = this.LJZ;
        c67z.LJII = true;
        c67z.LJI = false;
        float f = 15;
        c67z.LIZ = (-c67z.LJIIJJI) / f;
        c67z.LIZIZ = (-c67z.LJIIJ) / f;
        c67z.LIZJ = (-(c67z.LJIIIIZZ - c67z.LJ)) / f;
        c67z.LIZLLL = (-(c67z.LJIIIZ - c67z.LJFF)) / f;
        super.invalidate();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        TextStickerData textStickerData = this.LJZL;
        if (textStickerData != null && !textStickerData.isVisibleWhen(this.LL)) {
            C67Z c67z2 = this.LJZ;
            c67z2.LJII = false;
            c67z2.LJI = false;
            C67P c67p = c67z2.LJIIL;
            c67p.LJLJJI.LIZ = c67z2.LJIIJJI;
            c67p.LJJIFFI(c67z2.LJIIJ);
            c67z2.LJIIL.setCenterX(c67z2.LJIIIIZZ);
            c67z2.LJIIL.setCenterY(c67z2.LJIIIZ);
            super.invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (r3 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r8.LJZL
            if (r0 == 0) goto L1e
            X.67y r1 = r8.LJLJJI
            X.67T r0 = r8.LJZI
            boolean r0 = r0.LJIIIIZZ
            r1.LJI = r0
            if (r0 != 0) goto L1e
            boolean r0 = r8.LLIIJLIL
            if (r0 != 0) goto L1e
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r1 = r8.LLD
            r5 = 1
            r4 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1f
        L1e:
            return
        L1f:
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r2 = r8.LJZL
            long r0 = r8.LL
            boolean r3 = r2.isVisibleWhen(r0)
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r8.LJZL
            boolean r0 = r0.getShowOnScreen()
            if (r0 != 0) goto L63
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r8.LJZL
            r0.setShowOnScreen(r5)
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r2 = r8.LJZL
            float r1 = r2.getX()
            android.content.Context r0 = r8.getContext()
            int r0 = X.C81184Vtc.LJ(r0)
            float r0 = (float) r0
            float r1 = r1 + r0
            r2.setX(r1)
            float r1 = r8.getCenterX()
            android.content.Context r0 = r8.getContext()
            int r0 = X.C81184Vtc.LJ(r0)
            float r0 = (float) r0
            float r1 = r1 + r0
            r8.setCenterX(r1)
        L58:
            if (r3 == 0) goto L79
        L5a:
            X.C162696a1.LJ(r4, r8)
            super.invalidate()
            r8.LJLL = r3
            goto L1e
        L63:
            boolean r0 = X.C158206Iu.LIZ()
            if (r0 == 0) goto L58
            if (r3 == 0) goto L72
            int r0 = r8.getVisibility()
            if (r0 == 0) goto L78
            goto L5a
        L72:
            int r0 = r8.getVisibility()
            if (r0 == 0) goto L79
        L78:
            return
        L79:
            r4 = 8
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67P.LJIL():void");
    }

    public void LJJIIJ() {
        TextStickerData textStickerData = this.LJZL;
        if (textStickerData != null && textStickerData.hasPositionData()) {
            if (!this.LJZL.isGuidanceSticker()) {
                this.LJLIL = this.LJZL.getX();
            }
            this.LJLILLLLZI = this.LJZL.getY();
            this.LJLJJI.LIZIZ = this.LJZL.getRotation();
            this.LJLJJI.LIZ = this.LJZL.getScale();
        }
    }

    public final boolean LJJIIZ() {
        if (this.LJLL && getVisibility() == 0 && (!this.LJZI.LIZ() || this.LJLJJI.LJII)) {
            return true;
        }
        return false;
    }

    public PointF[] getAnglePointList() {
        C67V c67v = this.LJLZ;
        int size = ((ArrayList) c67v.LJJJ).size();
        PointF[] pointFArr = new PointF[size];
        float radians = (float) Math.toRadians(c67v.LJJIZ);
        for (int i = 0; i < size; i++) {
            pointFArr[i] = C77119UOl.LJJIII((PointF) ListProtector.get(c67v.LJJJ, i), c67v.LIZJ.centerX(), c67v.LIZJ.centerY(), radians);
        }
        return pointFArr;
    }

    public PointF[] getAnglePointListForBlock() {
        C67V c67v = this.LJLZ;
        c67v.getClass();
        PointF[] pointFArr = new PointF[4];
        RectF rectF = c67v.LIZIZ;
        int i = 0;
        pointFArr[0] = new PointF(rectF.left, rectF.top);
        RectF rectF2 = c67v.LIZIZ;
        pointFArr[1] = new PointF(rectF2.right, rectF2.top);
        RectF rectF3 = c67v.LIZIZ;
        pointFArr[2] = new PointF(rectF3.right, rectF3.bottom);
        RectF rectF4 = c67v.LIZIZ;
        pointFArr[3] = new PointF(rectF4.left, rectF4.bottom);
        float radians = (float) Math.toRadians(c67v.LJJIZ);
        do {
            pointFArr[i] = C77119UOl.LJJIII(pointFArr[i], c67v.LIZIZ.centerX(), c67v.LIZIZ.centerY(), radians);
            i++;
        } while (i < 4);
        return pointFArr;
    }

    public int getCurAlignTxt() {
        return this.LJLJJI.LIZLLL;
    }

    public RectF getCurrentHelpBoxRect() {
        return this.LJLZ.LJIIL();
    }

    public RectF getDeleteIconRect() {
        C67V c67v = this.LJLZ;
        if (c67v.LJIILLIIL) {
            return c67v.LJIIJ;
        }
        return null;
    }

    public float getGuidanceRectBottom() {
        return this.LJLZ.LIZIZ.bottom + r2.LJIIL;
    }

    public RectF getHelpRect() {
        return this.LJLZ.LIZJ;
    }

    public RectF getMinTextRect() {
        C67V c67v = this.LJLZ;
        c67v.getClass();
        RectF rectF = c67v.LIZIZ;
        float f = rectF.left;
        float f2 = c67v.LJJ;
        float f3 = rectF.top;
        float f4 = c67v.LJJI;
        return new RectF(f + f2, f3 + f4, rectF.right - f2, rectF.bottom - f4);
    }

    public float getOriginHeight() {
        if (this.LLF.isEmpty()) {
            return 0.0f;
        }
        float f = ((PointF[]) ListProtector.get(this.LLF, 0))[0].x;
        float f2 = ((PointF[]) ListProtector.get(this.LLF, 0))[0].x;
        float f3 = ((PointF[]) ListProtector.get(this.LLF, 0))[0].y;
        float f4 = ((PointF[]) ListProtector.get(this.LLF, 0))[0].y;
        Iterator<PointF[]> it = this.LLF.iterator();
        while (it.hasNext()) {
            for (PointF pointF : it.next()) {
                float f5 = pointF.x;
                if (f5 < f) {
                    f = f5;
                }
                if (f5 > f2) {
                    f2 = f5;
                }
                float f6 = pointF.y;
                if (f6 < f3) {
                    f3 = f6;
                }
                if (f6 > f4) {
                    f4 = f6;
                }
            }
        }
        return (f4 - f3) / this.LJZL.getScale();
    }

    public float getOriginWidth() {
        if (this.LLF.isEmpty()) {
            return 0.0f;
        }
        float f = ((PointF[]) ListProtector.get(this.LLF, 0))[0].x;
        float f2 = ((PointF[]) ListProtector.get(this.LLF, 0))[0].x;
        float f3 = ((PointF[]) ListProtector.get(this.LLF, 0))[0].y;
        float f4 = ((PointF[]) ListProtector.get(this.LLF, 0))[0].y;
        Iterator<PointF[]> it = this.LLF.iterator();
        while (it.hasNext()) {
            for (PointF pointF : it.next()) {
                float f5 = pointF.x;
                if (f5 < f) {
                    f = f5;
                }
                if (f5 > f2) {
                    f2 = f5;
                }
                float f6 = pointF.y;
                if (f6 < f3) {
                    f3 = f6;
                }
                if (f6 > f4) {
                    f4 = f6;
                }
            }
        }
        return (f2 - f) / this.LJZL.getScale();
    }

    public float getStickerRotate() {
        return this.LJLJJI.LIZIZ;
    }

    public float getStickerScale() {
        return this.LJLJJI.LIZ;
    }

    public String getText() {
        return C68W.LJII(this.LJLJJLL);
    }

    public float getTextMiddleLineCenterX() {
        C67V c67v = this.LJLZ;
        if (c67v == null) {
            return 0.0f;
        }
        return c67v.LJJJJIZL;
    }

    public float getTextMiddleLineCenterY() {
        C67V c67v = this.LJLZ;
        if (c67v == null) {
            return 0.0f;
        }
        return c67v.LJJJJI;
    }

    public RectF getTextRect() {
        return this.LJLZ.LIZIZ;
    }

    public List<TextStickerTextWrap> getTextWrapList() {
        List<TextStickerTextWrap> list = this.LJLJJLL;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public C67V LIZIZ() {
        if (C138865cg.LIZ()) {
            return new C67W();
        }
        return new C67V();
    }

    public float LIZJ() {
        return getMeasuredWidth() / 2.0f;
    }

    @Override // X.InterfaceC1549166d
    public final TextStickerData LJIJ() {
        return LJ().m110clone();
    }

    public final boolean LJIJJ() {
        if (!LJJIIZ()) {
            return false;
        }
        this.LLIIJI = false;
        super.invalidate();
        return true;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJJI() {
        if (getData() != null && getData().hasTimeData()) {
            return getData().getUiStartTime();
        }
        return 0;
    }

    public int getContentViewHeight() {
        return (int) Math.abs(getMinTextRect().bottom - getMinTextRect().top);
    }

    public int getContentViewWidth() {
        return (int) Math.abs(getMinTextRect().right - getMinTextRect().left);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        if (!C158206Iu.LIZ() && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6DA c6da = this.LLFII;
        if (c6da != null) {
            c6da.LJIIIZ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6DA c6da = this.LLFII;
        if (c6da != null) {
            c6da.LJIIJ();
        }
    }

    public float getCenterX() {
        return this.LJLIL;
    }

    public float getCenterY() {
        return this.LJLILLLLZI;
    }

    public int getCurColor() {
        return this.LJLJLJ;
    }

    public String getCurFontType() {
        return this.LJLJLLL;
    }

    public int getCurMode() {
        return this.LJLJL;
    }

    public TextStickerData getData() {
        return this.LJZL;
    }

    public boolean getGuideFirstEdit() {
        return this.LJLLLL;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
    }

    public final void LIZ(int i) {
        C67V c67v = this.LJLZ;
        c67v.LJIJ.setColor(i);
        c67v.LJIJI = i;
        if (c67v.LJJIL) {
            c67v.LJJIIZI.setShadowLayer(12.0f, 0.0f, 0.0f, i);
        } else {
            c67v.LJJIIZI.setShadowLayer(0.0f, 0.0f, 0.0f, i);
        }
        this.LLFF = i;
    }

    public final void LIZLLL(Canvas canvas) {
        boolean z;
        C1553867y c1553867y = this.LJLJJI;
        PointF pointF = c1553867y.LIZJ;
        pointF.x = this.LJLIL;
        pointF.y = this.LJLILLLLZI;
        c1553867y.LJI = this.LJZI.LJIIIIZZ;
        getFontSize();
        C67V c67v = this.LJLZ;
        if (this.LJLLILLLL && !this.LLIIJLIL && !this.LLIIJI) {
            z = true;
        } else {
            z = false;
        }
        c67v.LJIILLIIL = z;
        c67v.LJIIIZ(canvas, this.LJLJJI, this.LLF);
    }

    public final void LJIIJJI(TextStickerData textStickerData) {
        this.LJZL = textStickerData;
        if (textStickerData == null) {
            return;
        }
        setFontSize(textStickerData.getFontSize());
        LJJI(this.LJZL.getBgMode(), this.LJZL.getColor(), this.LJZL.getAlign(), this.LJZL.getFontType());
        LJJIII(textStickerData.getEffectTextLayoutConfig(), this.LJZL.getTextWrapList());
        setAnimXY(this.LJZL.getEditCenterPoint());
        LJJIIJ();
        super.invalidate();
    }

    public final boolean LJIIL(MotionEvent motionEvent) {
        if (!LJJIIZ()) {
            return false;
        }
        this.LLI = new C66B(getStickerRotate(), getStickerScale(), getCenterX(), getCenterY());
        motionEvent.getY();
        motionEvent.getRawY();
        boolean LIZIZ = this.LJZI.LIZIZ(motionEvent.getX(), motionEvent.getY());
        if (LIZIZ) {
            setTouching(true);
        }
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
    
        if (r1 != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(X.C82537WaL r17) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67P.LJIILIIL(X.WaL):boolean");
    }

    public final boolean LJIILJJIL(float f) {
        if (!LJJIIZ()) {
            return false;
        }
        float degrees = (float) Math.toDegrees(f);
        if (Math.abs(degrees) > 10.0f) {
            degrees = 0.0f;
        }
        if (!this.LLIIIL && !this.LLIIIJ && this.LJZI.LJIIIZ != 3) {
            return false;
        }
        C1553867y c1553867y = this.LJLJJI;
        C67T c67t = this.LJZI;
        float f2 = c1553867y.LIZIZ;
        if (-1 != c67t.LIZ.LJFF(c67t.LJIILLIIL, false, true)) {
            degrees = c67t.LIZ.LIZ(degrees);
        }
        float f3 = f2 - degrees;
        if (f3 > 180.0f) {
            f3 -= 360.0f;
        }
        if (f3 < -180.0f) {
            f3 += 360.0f;
        }
        c67t.LIZJ(false);
        C68C c68c = c67t.LJIJJ;
        if (c68c != null) {
            c68c.LIZLLL();
        }
        c1553867y.LIZIZ = f3;
        super.invalidate();
        return true;
    }

    public final boolean LJIILL(C82536WaK c82536WaK) {
        if (!LJJIIZ()) {
            return false;
        }
        this.LLIIIL = LJIIIIZZ(c82536WaK.LJIILIIL, c82536WaK.LJIILJJIL);
        this.LJZI.LIZIZ(c82536WaK.LJIILIIL, c82536WaK.LJIILJJIL);
        if (!this.LLIIIL && !this.LLIIIJ && this.LJZI.LJIIIZ != 3) {
            return false;
        }
        return true;
    }

    public final boolean LJIILLIIL(ScaleGestureDetector scaleGestureDetector) {
        if (!LJJIIZ()) {
            return false;
        }
        if ((!this.LLIIIZ && !this.LLIIIJ && this.LJZI.LJIIIZ != 3) || (scaleGestureDetector.getScaleFactor() > 1.0f ? this.LJLJJI.LIZ > 11.0f : this.LJLJJI.LIZ < 0.4f)) {
            return false;
        }
        this.LJLJJI.LIZ *= scaleGestureDetector.getScaleFactor();
        super.invalidate();
        return true;
    }

    @Override // X.InterfaceC1549166d
    public final int LJIIZILJ(int i) {
        if (getData() != null && getData().hasTimeData()) {
            return getData().getUiEndTime();
        }
        return i;
    }

    public final boolean LJIJI(ScaleGestureDetector scaleGestureDetector) {
        if (!LJJIIZ()) {
            return false;
        }
        this.LLIIIZ = LJIIIIZZ(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        this.LJZI.LIZIZ(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        this.LLIIJI = true;
        if (!this.LLIIIZ && !this.LLIIIJ && this.LJZI.LJIIIZ != 3) {
            return false;
        }
        return true;
    }

    public final boolean LJIJJLI(MotionEvent motionEvent) {
        C66B c66b;
        boolean z;
        int i;
        this.LLFZ.set(motionEvent.getRawX(), motionEvent.getRawY());
        if (!LJJIIZ()) {
            return false;
        }
        C67T c67t = this.LJZI;
        c67t.getClass();
        long currentTimeMillis = System.currentTimeMillis() - c67t.LJFF;
        if (c67t.LIZ != null && currentTimeMillis <= 200 && c67t.LJIILLIIL.LJIIJ(c67t.LIZLLL, c67t.LJ) && c67t.LJIILLIIL.LJIIJ(motionEvent.getX() - c67t.LJIIJJI, motionEvent.getY() - c67t.LJIIL)) {
            c67t.LIZ.LJ(c67t.LJIILLIIL);
        }
        boolean z2 = true;
        if (this.LJZI.LJIIIZ != 2 && (c66b = this.LLI) != null) {
            float centerX = getCenterX();
            C66B c66b2 = this.LLI;
            c66b.LJLJI = centerX - c66b2.LJLJI;
            c66b2.LJLJJI = getCenterY() - this.LLI.LJLJJI;
            C67T c67t2 = this.LJZI;
            c67t2.LJIJ = true;
            if (c67t2.LIZ != null && c67t2.LJIIIZ == 3) {
                RectF helpRect = c67t2.LJIILLIIL.getHelpRect();
                C77119UOl.LJJIIJZLJL(helpRect.centerX(), helpRect.centerY(), helpRect, c67t2.LJIILLIIL.getStickerRotate());
                C77119UOl.LJJIIZ(helpRect, c67t2.LJIILLIIL.getStickerScale());
                c67t2.LIZ.LIZJ(c67t2.LJIILLIIL, helpRect, new C1541163b(true, false, ((int) c67t2.LJI) + c67t2.LJIIJJI, ((int) c67t2.LJII) + c67t2.LJIIL, c67t2.LIZ()));
                if (c67t2.LJIIZILJ) {
                    if (c67t2.LIZ()) {
                        c67t2.LIZJ(false);
                    } else {
                        c67t2.LIZJ(false);
                    }
                    c67t2.LJIIZILJ = false;
                }
                c67t2.LIZ.LJFF(c67t2.LJIILLIIL, true, false);
                z = true;
            } else {
                z = false;
            }
            if (c67t2.LJIILIIL) {
                long currentTimeMillis2 = System.currentTimeMillis() - c67t2.LJFF;
                int abs = (int) Math.abs(motionEvent.getX() - (c67t2.LIZLLL + c67t2.LJIIJJI));
                C6FB c6fb = AnonymousClass699.LIZJ;
                if (c6fb != null) {
                    i = c6fb.LIZ();
                } else {
                    i = 0;
                }
                int abs2 = (int) Math.abs((motionEvent.getY() - i) - (c67t2.LJ + c67t2.LJIIL));
                if (currentTimeMillis2 <= 200 && (abs <= 5 || abs2 <= 5)) {
                    if (!c67t2.LJJ.LIZ()) {
                        if (!c67t2.LJIIIIZZ && !c67t2.LIZ()) {
                            C67P c67p = c67t2.LJIILLIIL;
                            boolean z3 = c67p.LJLLILLLL;
                            InterfaceC1552467k interfaceC1552467k = c67t2.LIZ;
                            if (interfaceC1552467k != null) {
                                interfaceC1552467k.LIZLLL(c67p, z3, null);
                            }
                            c67t2.LIZJ(!z3);
                        } else {
                            if (c67t2.LIZ != null) {
                                new C139355dT().LIZ.storeBoolean("text_sticker_hint_set", true);
                                c67t2.LIZ.LIZLLL(c67t2.LJIILLIIL, true, null);
                            }
                            c67t2.LIZJ(false);
                        }
                    }
                    C68C c68c = c67t2.LJIJJ;
                    if (c68c != null) {
                        c68c.LIZIZ();
                    }
                }
            } else {
                z2 = z;
            }
            C68C c68c2 = c67t2.LJIJJ;
            if (c68c2 != null) {
                c68c2.LIZ();
            }
        } else {
            z2 = false;
        }
        C68B c68b = this.LLIIIILZ;
        if (c68b != null) {
            if (this.LLIIIJ) {
                c68b.LIZIZ();
            }
            if (this.LLIIIL) {
                this.LLIIIILZ.LIZ();
            }
            if (this.LLIIIZ) {
                this.LLIIIILZ.LIZJ();
            }
        }
        this.LLIIIL = false;
        this.LLIIIJ = false;
        this.LLIIIZ = false;
        C67T c67t3 = this.LJZI;
        c67t3.LJI = 0.0f;
        c67t3.LJII = 0.0f;
        setTouching(false);
        return z2;
    }

    public final void LJJIFFI(float f) {
        C1553867y c1553867y = this.LJLJJI;
        c1553867y.LIZIZ = f;
        if (f > 180.0f) {
            c1553867y.LIZIZ = f - 360.0f;
        }
        float f2 = c1553867y.LIZIZ;
        if (f2 < -180.0f) {
            c1553867y.LIZIZ = f2 + 360.0f;
        }
    }

    @Override // X.InterfaceC1549166d
    public final int LJJII(int i) {
        if (getData() != null && getData().hasTimeData()) {
            return getData().getStartTime();
        }
        return i;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJZ(int i) {
        if (getData() != null && getData().hasTimeData()) {
            return getData().getEndTime();
        }
        return i;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        LIZLLL(canvas);
        C67Z c67z = this.LJZ;
        C1553867y c1553867y = this.LJLJJI;
        c67z.LIZIZ(c1553867y.LIZ, c1553867y.LIZIZ, this.LJLIL, this.LJLILLLLZI);
        C67Z c67z2 = this.LJZ;
        C1553867y c1553867y2 = this.LJLJJI;
        c67z2.LIZ(c1553867y2.LIZ, c1553867y2.LIZIZ, this.LJLIL, this.LJLILLLLZI);
    }

    @Override // X.InterfaceC1549166d
    public void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        LJJ(f, false);
    }

    public void setAnimXY(Point point) {
        C67Z c67z = this.LJZ;
        c67z.LJIIL.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1553167r(c67z, point.x, point.y));
    }

    public void setCenterX(float f) {
        this.LJLIL = f;
    }

    public void setCenterY(float f) {
        this.LJLILLLLZI = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r3 <= r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        r2 = X.C6PB.LIZJ();
        r1 = X.X1D.LIZ();
        r1.append("TextSticker setLayerType -> viewType: ");
        r1.append(r6);
        r2.i(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        setLayerType(r6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (r8 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDrawStrokeState(int r13) {
        /*
            r12 = this;
            r6 = 1
            r5 = 4
            if (r13 != r5) goto L78
            r8 = 1
        L5:
            X.67V r0 = r12.LJLZ
            r0.LJJJI = r8
            boolean r0 = X.C158226Iw.LIZ()
            if (r0 != 0) goto L73
            if (r8 == 0) goto L74
            android.content.Context r2 = r12.getContext()
            java.lang.String r0 = "view.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            int r9 = r12.getWidth()
            int r7 = r12.getHeight()
            long r3 = (long) r9
            long r0 = (long) r7
            long r3 = r3 * r0
            long r0 = (long) r5
            long r3 = r3 * r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r2)
            int r0 = r0.getScaledMaximumDrawingCacheSize()
            long r1 = (long) r0
            X.68d r11 = X.C6PB.LIZJ()
            java.lang.String r10 = "TextSticker isDrawCacheValid -> width: "
            java.lang.String r5 = ", height: "
            java.lang.String r0 = ", pbSize: "
            java.lang.StringBuilder r5 = X.C06460Ne.LIZJ(r10, r9, r5, r7, r0)
            r5.append(r3)
            java.lang.String r0 = ", dcSize: "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = X.X1D.LIZIZ(r5)
            r11.i(r0)
            if (r9 <= 0) goto L74
            if (r7 <= 0) goto L74
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L74
        L58:
            X.68d r2 = X.C6PB.LIZJ()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "TextSticker setLayerType -> viewType: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.i(r0)
        L6f:
            r0 = 0
            r12.setLayerType(r6, r0)
        L73:
            return
        L74:
            r6 = 2
            if (r8 == 0) goto L6f
            goto L58
        L78:
            r8 = 0
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67P.setDrawStrokeState(int):void");
    }

    public void setEnableEdit(boolean z) {
        this.LJLL = z;
    }

    public void setFontSize(int i) {
        TextStickerData textStickerData = this.LJZL;
        if (textStickerData != null) {
            textStickerData.setFontSize(i);
        }
        this.LJLJJI.LJ = (int) C170576mj.LJ(getContext(), i);
        C67V c67v = this.LJLZ;
        float f = this.LJLJJI.LJ;
        c67v.LJIL = f;
        float LJ = f / C170576mj.LJ(c67v.LJJIJIL.getContext(), c67v.LJ());
        c67v.LJJ = C170576mj.LIZ(c67v.LJJIJIL.getContext(), 12.0f) * LJ;
        float LIZ = C170576mj.LIZ(c67v.LJJIJIL.getContext(), 8.0f) * LJ;
        c67v.LJJI = LIZ;
        c67v.LJJIFFI = c67v.LJJ;
        c67v.LJJII = LIZ;
        c67v.LJJIIJZLJL = (int) (C170576mj.LIZ(c67v.LJJIJIL.getContext(), 5.0f) * LJ);
        c67v.LJIJ.setPathEffect(new CornerPathEffect(c67v.LJJIIJZLJL));
        super.invalidate();
    }

    public void setGuideFirstEdit(boolean z) {
        this.LJLLLL = z;
    }

    public void setInitOffsetY(float f) {
        this.LJLJI = f;
    }

    public void setIsGuidanceSticker(boolean z) {
        this.LJLLILLLL = z;
    }

    public void setMotionInterceptor(C66N c66n) {
        this.LJZI.LJJ = c66n;
    }

    public void setOnEditClickListener(InterfaceC1552467k interfaceC1552467k) {
        this.LJZI.LIZ = interfaceC1552467k;
    }

    public void setOnEffectTextGestureListener(C68C c68c) {
        this.LJZI.LJIJJ = c68c;
    }

    public void setPlayPosition(long j) {
        this.LL = j;
    }

    public void setShowHelpBox(boolean z) {
        this.LJZI.LIZJ(z);
        if (!z) {
            this.LLD = SystemClock.elapsedRealtime();
            this.LJLLI.postDelayed(new IDRunnableS6S0101000(5, this, 31), 1000L);
        }
    }

    public void setTextColor(int i) {
        boolean z;
        C67V c67v = this.LJLZ;
        c67v.getClass();
        C68M LJIIJ = C68M.LJIIJ();
        if (LJIIJ.LIZ.get(LJIIJ.LIZJ) != null) {
            z = LJIIJ.LIZ.get(LJIIJ.LIZJ).LIZIZ();
        } else {
            z = false;
        }
        c67v.LJJIL = z;
        if (c67v.LJJIIZI.getTypeface() != C68M.LJIIJ().LIZLLL()) {
            c67v.LJJIIZI.setTypeface(C68M.LJIIJ().LIZLLL());
        }
        if (c67v.LJJIL) {
            c67v.LJJIIZI.setColor(-1);
            c67v.LJJIIZI.setShadowLayer(12.0f, 0.0f, 0.0f, i);
        } else {
            c67v.LJJIIZI.setShadowLayer(0.0f, 0.0f, 0.0f, i);
            c67v.LJJIIZI.setColor(i);
        }
        this.LLFFF = i;
    }

    public void setTextGestureEventTrackListener(C68B c68b) {
        this.LLIIIILZ = c68b;
    }

    public void setTouching(boolean z) {
        if (z == this.LLIIJLIL) {
            return;
        }
        this.LLIIJLIL = z;
        super.invalidate();
        if (!z) {
            this.LLD = SystemClock.elapsedRealtime();
            this.LJLLI.postDelayed(new IDRunnableS6S0101000(5, this, 31), 1000L);
        }
    }

    public void setWasGuidanceSticker(boolean z) {
        this.LJLLL = z;
    }

    public PointF LJII(float f, float f2) {
        getLocationOnScreen(new int[2]);
        return new PointF(f - r1[0], f2 - r1[1]);
    }

    public boolean LJIIIIZZ(float f, float f2) {
        return C77119UOl.LJIILL(f, f2 - this.LJLLLLLL, getHelpRect(), this.LJLJJI.LIZIZ);
    }

    public boolean LJIIIZ(float f, float f2) {
        return C77119UOl.LJIILL(f, f2, getHelpRect(), this.LJLJJI.LIZIZ);
    }

    public final boolean LJIIJ(float f, float f2) {
        RectF deleteIconRect = getDeleteIconRect();
        if (deleteIconRect == null) {
            return false;
        }
        C77119UOl.LJJIIJ(new Point((int) deleteIconRect.centerX(), (int) deleteIconRect.centerY()), getHelpRect().centerX(), getHelpRect().centerY(), this.LJLJJI.LIZIZ);
        if (Math.pow(Math.pow(r4.y - f2, 2.0d) + Math.pow(r4.x - f, 2.0d), 0.5d) > deleteIconRect.width() / 2.0f) {
            return false;
        }
        return true;
    }

    public final void LJJ(float f, boolean z) {
        if (z) {
            setAlpha(1.0f);
        } else {
            setAlpha(f);
        }
    }

    public final void LJJIII(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, List list) {
        TextStickerData textStickerData = this.LJZL;
        if (textStickerData != null) {
            textStickerData.setTextWrapList(list);
        }
        LJJIIJZLJL(innerEffectTextLayoutConfig, list);
        super.invalidate();
    }

    public void LJJIIJZLJL(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, List list) {
        this.LJLJJLL = list;
        this.LJLZ.LJIJJ(list);
        C67V c67v = this.LJLZ;
        if (c67v instanceof C67W) {
            C67W c67w = (C67W) c67v;
            List<InlineRichTextStyleData> inlineTextStyles = this.LJZL.getInlineTextStyles();
            c67w.getClass();
            if (inlineTextStyles != null) {
                TextStickerString[] mStickerStringArray = c67w.LJIJJLI;
                o.LJIIIIZZ(mStickerStringArray, "mStickerStringArray");
                List<TextStickerTextWrap> mTextWrapList = c67w.LJIJJ;
                o.LJIIIIZZ(mTextWrapList, "mTextWrapList");
                Object LJLLJ = ORZ.LJLLJ(mTextWrapList);
                o.LJIIIIZZ(LJLLJ, "mTextWrapList.first()");
                SpannableStringBuilder LIZ = C157136Er.LIZ((TextStickerTextWrap) LJLLJ, inlineTextStyles);
                if (LIZ == null) {
                    LIZ = null;
                } else {
                    int i = 0;
                    for (TextStickerString textStickerString : mStickerStringArray) {
                        int length = textStickerString.getStr().length() + i;
                        if (length < LIZ.length() && LIZ.charAt(length) != '\n') {
                            LIZ.insert(length, (CharSequence) "\n");
                        }
                        i = length + 1;
                    }
                }
                c67w.LJJJJJ = LIZ;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // X.InterfaceC1549166d
    public final /* bridge */ /* synthetic */ void LJJJJLI(TextStickerData textStickerData, int i, int i2) {
        LJIIJJI(textStickerData);
    }

    public void LJJI(int i, int i2, int i3, String str) {
        TextStickerData textStickerData = this.LJZL;
        if (textStickerData != null) {
            textStickerData.setBgMode(i);
            this.LJZL.setColor(i2);
            this.LJZL.setFontType(str);
            this.LJZL.setAlign(i3);
        }
        this.LJLJL = i;
        setDrawStrokeState(i);
        this.LJLJLJ = i2;
        this.LJLJLLL = str;
        C68M.LJIIJ().LIZJ = this.LJLJLLL;
        if (i == 1 || i == 4) {
            setTextColor(i2);
            this.LJLJJI.LJFF = false;
        } else if (i == 2) {
            setTextColor(C1553267s.LIZIZ(i2));
            if (this.LJLLILLLL && !this.LJLLJ) {
                setTextColor(1461065763);
            }
            LIZ(i2);
            this.LJLJJI.LJFF = true;
        } else if (i == 3) {
            setTextColor(-1);
            LIZ(C1551767d.LJIILIIL(i2));
            this.LJLJJI.LJFF = true;
        }
        this.LJLJJI.LIZLLL = i3;
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LJLJJL) {
            this.LJLJJL = false;
            this.LJLIL = LIZJ();
            this.LJLILLLLZI = ((getMeasuredHeight() / 2.0f) - (getFontSize() / 2.0f)) + this.LJLJI;
            C1553867y c1553867y = this.LJLJJI;
            c1553867y.LIZIZ = 0.0f;
            c1553867y.LIZ = 1.0f;
            LJIIJJI(this.LJZL);
        }
    }

    public C67P(Context context, SafeHandler safeHandler, TextStickerData textStickerData, boolean z, C68K c68k, Boolean bool) {
        this(context, safeHandler, textStickerData, z, c68k, bool, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.67l] */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.67l] */
    public C67P(Context context, SafeHandler safeHandler, TextStickerData textStickerData, boolean z, C68K c68k, Boolean bool, C82622Wbi c82622Wbi) {
        super(context);
        C1553867y c1553867y = new C1553867y();
        this.LJLJJI = c1553867y;
        this.LJLJJL = true;
        this.LJLJL = 1;
        this.LJLJLJ = -1;
        this.LJLJLLL = "default";
        this.LJLL = true;
        this.LJLLILLLL = false;
        this.LJLLJ = false;
        this.LJLLL = false;
        this.LJLLLL = true;
        this.LLF = new ArrayList<>();
        this.LLFZ = new PointF();
        this.LLII = false;
        int i = C68W.LIZ;
        C68W.LIZ = i + 1;
        this.LLIIII = i;
        this.LLIIIILZ = null;
        this.LLIIJI = false;
        setWillNotDraw(false);
        this.LJLLI = safeHandler;
        c1553867y.LJII = z;
        if (AnonymousClass699.LIZIZ().LIZJ != null && bool.booleanValue()) {
            C6DA LIZ = AnonymousClass699.LIZIZ().LIZJ.LIZ(this, new AbstractC38911fr() { // from class: X.67l
                @Override // X.C6GI
                public final void LJ() {
                }

                @Override // X.C6GI
                public final void LJFF() {
                }

                @Override // X.C6GI
                public final void LIZJ() {
                    C67P c67p = C67P.this;
                    if (c67p.LJZI.LIZ != null) {
                        boolean z2 = !C1JI.LJIL(c67p);
                        C67P c67p2 = C67P.this;
                        c67p2.LJZI.LIZ.LIZLLL(c67p2, z2, null);
                    }
                }

                @Override // X.C6GI
                public final void LIZLLL() {
                    C67P c67p = C67P.this;
                    InterfaceC1552467k interfaceC1552467k = c67p.LJZI.LIZ;
                    if (interfaceC1552467k != null) {
                        interfaceC1552467k.LJ(c67p);
                    }
                }

                @Override // X.C6GI
                public final void LJIIIIZZ() {
                    C67P c67p = C67P.this;
                    InterfaceC1552467k interfaceC1552467k = c67p.LJZI.LIZ;
                    if (interfaceC1552467k != null) {
                        interfaceC1552467k.LIZIZ(c67p);
                    }
                }

                @Override // X.C6GI
                public final void LJIIIZ() {
                    C67P c67p = C67P.this;
                    InterfaceC1552467k interfaceC1552467k = c67p.LJZI.LIZ;
                    if (interfaceC1552467k != null) {
                        interfaceC1552467k.LJII(c67p);
                    }
                }

                @Override // X.C6GI
                public final void LJIIJ() {
                    C67P c67p = C67P.this;
                    InterfaceC1552467k interfaceC1552467k = c67p.LJZI.LIZ;
                    if (interfaceC1552467k != null) {
                        interfaceC1552467k.LJI(c67p);
                    }
                }
            }, c82622Wbi);
            this.LLFII = LIZ;
            LIZ.LIZJ = c1553867y.LJII;
        }
        if (textStickerData.getType().equals("type_inline_caption")) {
            C89462Z9e c89462Z9e = new C89462Z9e(this, new AbstractC38911fr() { // from class: X.67l
                @Override // X.C6GI
                public final void LJ() {
                }

                @Override // X.C6GI
                public final void LJFF() {
                }

                @Override // X.C6GI
                public final void LIZJ() {
                    C67P c67p = C67P.this;
                    if (c67p.LJZI.LIZ != null) {
                        boolean z2 = !C1JI.LJIL(c67p);
                        C67P c67p2 = C67P.this;
                        c67p2.LJZI.LIZ.LIZLLL(c67p2, z2, null);
                    }
                }

                @Override // X.C6GI
                public final void LIZLLL() {
                    C67P c67p = C67P.this;
                    InterfaceC1552467k interfaceC1552467k = c67p.LJZI.LIZ;
                    if (interfaceC1552467k != null) {
                        interfaceC1552467k.LJ(c67p);
                    }
                }

                @Override // X.C6GI
                public final void LJIIIIZZ() {
                    C67P c67p = C67P.this;
                    InterfaceC1552467k interfaceC1552467k = c67p.LJZI.LIZ;
                    if (interfaceC1552467k != null) {
                        interfaceC1552467k.LIZIZ(c67p);
                    }
                }

                @Override // X.C6GI
                public final void LJIIIZ() {
                    C67P c67p = C67P.this;
                    InterfaceC1552467k interfaceC1552467k = c67p.LJZI.LIZ;
                    if (interfaceC1552467k != null) {
                        interfaceC1552467k.LJII(c67p);
                    }
                }

                @Override // X.C6GI
                public final void LJIIJ() {
                    C67P c67p = C67P.this;
                    InterfaceC1552467k interfaceC1552467k = c67p.LJZI.LIZ;
                    if (interfaceC1552467k != null) {
                        interfaceC1552467k.LJI(c67p);
                    }
                }
            }, textStickerData.getCaptionOnlyShowDeleteBubble());
            this.LLFII = c89462Z9e;
            c89462Z9e.LIZJ = false;
        }
        this.LJLZ = LIZIZ();
        this.LJZI = new C67T(c68k, c82622Wbi);
        this.LJZ = new C67Z();
        this.LJLZ.LJIJ(this, context);
        C67T c67t = this.LJZI;
        c67t.LJIILLIIL = this;
        c67t.LJIILJJIL = safeHandler;
        this.LJZ.LJIIL = this;
        c67t.LJIJI = new C67Y(this);
        C81184Vtc.LJ(context);
        C81184Vtc.LIZLLL(context);
        C16880lQ.LLILL(context, "vibrator");
        this.LJZL = textStickerData;
        this.LJLJL = textStickerData.getBgMode();
        this.LJLJLJ = this.LJZL.getColor();
        c1553867y.LIZLLL = this.LJZL.getAlign();
        this.LJLJLLL = this.LJZL.getFontType();
        this.LJLIL = this.LJZL.getX();
        this.LJLILLLLZI = this.LJZL.getY();
        c1553867y.LIZIZ = this.LJZL.getRotation();
        c1553867y.LIZ = this.LJZL.getScale();
        this.LJLJJLL = this.LJZL.getTextWrapList();
        this.LJLLILLLL = this.LJZL.isGuidanceSticker();
        this.LJLLJ = this.LJZL.getGuidanceWithDefaultText();
    }
}
