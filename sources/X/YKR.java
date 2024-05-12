package X;

import Y.IDRunnableS6S0101000;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YKR extends FrameLayout {
    public static final /* synthetic */ int LLIIII = 0;
    public float LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public final C87208YKm LJLJJI;
    public boolean LJLJJL;
    public List<TextStickerTextWrap> LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public String LJLJLLL;
    public boolean LJLL;
    public final SafeHandler LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public YKS LJLLL;
    public YKV LJLLLL;
    public YKT LJLLLLLL;
    public TextStickerData LJLZ;
    public long LJZ;
    public long LJZI;
    public final ArrayList<PointF[]> LJZL;
    public int LL;
    public int LLD;
    public final PointF LLF;
    public C66851QLn LLFF;
    public boolean LLFFF;
    public final int LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;

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
        C87208YKm c87208YKm = this.LJLJJI;
        if (c87208YKm.LJ < 0) {
            Context context = getContext();
            TextStickerData textStickerData = this.LJLZ;
            if (textStickerData == null) {
                fontSize = 64.0f;
            } else {
                fontSize = textStickerData.getFontSize();
            }
            c87208YKm.LJ = (int) C170576mj.LJ(context, fontSize);
        }
        return this.LJLJJI.LJ;
    }

    public final TextStickerData LIZIZ() {
        if (this.LJLZ == null) {
            TextStickerData textStickerData = new TextStickerData("", this.LJLJL, this.LJLJLJ, this.LJLJJI.LIZLLL, this.LJLJLLL);
            this.LJLZ = textStickerData;
            textStickerData.setTextWrapList(getTextWrapList());
        }
        this.LJLZ.setTextStr(V1M.LJIJJ(getTextWrapList()));
        this.LJLZ.setX(this.LJLIL);
        this.LJLZ.setY(this.LJLILLLLZI);
        this.LJLZ.setRotation(this.LJLJJI.LIZIZ);
        this.LJLZ.setScale(this.LJLJJI.LIZ);
        this.LJLZ.setTextWrapList(getTextWrapList());
        this.LJLZ.setBgMode(this.LJLJL);
        this.LJLZ.setColor(this.LJLJLJ);
        this.LJLZ.setAlign(this.LJLJJI.LIZLLL);
        this.LJLZ.setFontType(this.LJLJLLL);
        this.LJLZ.setLayoutWidth(getMeasuredWidth());
        this.LJLZ.setLayoutHeight(getMeasuredHeight());
        return this.LJLZ;
    }

    public final void LIZJ() {
        YKV ykv = this.LJLLLL;
        float f = this.LJLIL;
        float f2 = this.LJLILLLLZI;
        C87208YKm c87208YKm = this.LJLJJI;
        float f3 = c87208YKm.LIZ;
        float f4 = c87208YKm.LIZIZ;
        ykv.LJI = true;
        ykv.LJII = false;
        ykv.LJIIIIZZ = f;
        ykv.LJIIIZ = f2;
        ykv.LJIIJ = f4;
        ykv.LJIIJJI = f3;
        float f5 = 15;
        ykv.LIZ = f3 / f5;
        ykv.LIZIZ = f4 / f5;
        ykv.LIZJ = (f - ykv.LJ) / f5;
        ykv.LIZLLL = (f2 - ykv.LJFF) / f5;
        ykv.LJIIL.invalidate();
        InterfaceC87211YKp interfaceC87211YKp = ykv.LJIILIIL;
        if (interfaceC87211YKp != null) {
            interfaceC87211YKp.LIZIZ();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final void LIZLLL() {
        YKV ykv = this.LJLLLL;
        ykv.LJII = true;
        ykv.LJI = false;
        float f = 15;
        ykv.LIZ = (-ykv.LJIIJJI) / f;
        ykv.LIZIZ = (-ykv.LJIIJ) / f;
        ykv.LIZJ = (-(ykv.LJIIIIZZ - ykv.LJ)) / f;
        ykv.LIZLLL = (-(ykv.LJIIIZ - ykv.LJFF)) / f;
        super.invalidate();
        InterfaceC87211YKp interfaceC87211YKp = ykv.LJIILIIL;
        if (interfaceC87211YKp != null) {
            interfaceC87211YKp.LIZLLL();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        TextStickerData textStickerData = this.LJLZ;
        if (textStickerData != null && !textStickerData.isVisibleWhen(this.LJZ)) {
            YKV ykv2 = this.LJLLLL;
            ykv2.LJII = false;
            ykv2.LJI = false;
            YKR ykr = ykv2.LJIIL;
            ykr.LJLJJI.LIZ = ykv2.LJIIJJI;
            ykr.LJIIL(ykv2.LJIIJ);
            ykv2.LJIIL.setCenterX(ykv2.LJIIIIZZ);
            ykv2.LJIIL.setCenterY(ykv2.LJIIIZ);
            super.invalidate();
            InterfaceC87211YKp interfaceC87211YKp2 = ykv2.LJIILIIL;
            if (interfaceC87211YKp2 != null) {
                interfaceC87211YKp2.LIZJ();
                ykv2.LJIILIIL.LIZ();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (r3 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData r0 = r8.LJLZ
            if (r0 == 0) goto L1e
            X.YKm r1 = r8.LJLJJI
            X.YKT r0 = r8.LJLLLLLL
            boolean r0 = r0.LJIIIIZZ
            r1.LJI = r0
            if (r0 != 0) goto L1e
            boolean r0 = r8.LLII
            if (r0 != 0) goto L1e
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r1 = r8.LJZI
            r5 = 1
            r4 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1f
        L1e:
            return
        L1f:
            com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData r2 = r8.LJLZ
            long r0 = r8.LJZ
            boolean r3 = r2.isVisibleWhen(r0)
            com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData r0 = r8.LJLZ
            boolean r0 = r0.getShowOnScreen()
            if (r0 != 0) goto L63
            com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData r0 = r8.LJLZ
            r0.setShowOnScreen(r5)
            com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData r2 = r8.LJLZ
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
        throw new UnsupportedOperationException("Method not decompiled: X.YKR.LJIIIZ():void");
    }

    public final boolean LJIILJJIL() {
        if (this.LJLL && getVisibility() == 0 && (!this.LJLLLLLL.LIZ() || this.LJLJJI.LJII)) {
            return true;
        }
        return false;
    }

    public PointF[] getAnglePointList() {
        YKS yks = this.LJLLL;
        int size = ((ArrayList) yks.LJJIIJZLJL).size();
        PointF[] pointFArr = new PointF[size];
        float radians = (float) Math.toRadians(yks.LJJIIJ);
        for (int i = 0; i < size; i++) {
            pointFArr[i] = C77119UOl.LJJIII((PointF) ListProtector.get(yks.LJJIIJZLJL, i), yks.LIZJ.centerX(), yks.LIZJ.centerY(), radians);
        }
        return pointFArr;
    }

    public PointF[] getAnglePointListForBlock() {
        YKS yks = this.LJLLL;
        yks.getClass();
        PointF[] pointFArr = new PointF[4];
        RectF rectF = yks.LIZIZ;
        int i = 0;
        pointFArr[0] = new PointF(rectF.left, rectF.top);
        RectF rectF2 = yks.LIZIZ;
        pointFArr[1] = new PointF(rectF2.right, rectF2.top);
        RectF rectF3 = yks.LIZIZ;
        pointFArr[2] = new PointF(rectF3.right, rectF3.bottom);
        RectF rectF4 = yks.LIZIZ;
        pointFArr[3] = new PointF(rectF4.left, rectF4.bottom);
        float radians = (float) Math.toRadians(yks.LJJIIJ);
        do {
            pointFArr[i] = C77119UOl.LJJIII(pointFArr[i], yks.LIZIZ.centerX(), yks.LIZIZ.centerY(), radians);
            i++;
        } while (i < 4);
        return pointFArr;
    }

    public int getCurAlignTxt() {
        return this.LJLJJI.LIZLLL;
    }

    public RectF getCurrentHelpBoxRect() {
        YKS yks = this.LJLLL;
        yks.getClass();
        RectF rectF = new RectF();
        rectF.set(yks.LIZIZ);
        float f = rectF.left;
        float f2 = yks.LJIILLIIL;
        rectF.set(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
        return rectF;
    }

    public RectF getDeleteIconRect() {
        this.LJLLL.getClass();
        return null;
    }

    public RectF getHelpRect() {
        return this.LJLLL.LIZJ;
    }

    public RectF getMinTextRect() {
        YKS yks = this.LJLLL;
        yks.getClass();
        RectF rectF = yks.LIZIZ;
        float f = rectF.left;
        float f2 = yks.LJIIL;
        float f3 = rectF.top;
        float f4 = yks.LJIILIIL;
        return new RectF(f + f2, f3 + f4, rectF.right - f2, rectF.bottom - f4);
    }

    public float getOriginHeight() {
        if (this.LJZL.isEmpty()) {
            return 0.0f;
        }
        float f = ((PointF[]) ListProtector.get(this.LJZL, 0))[0].x;
        float f2 = ((PointF[]) ListProtector.get(this.LJZL, 0))[0].x;
        float f3 = ((PointF[]) ListProtector.get(this.LJZL, 0))[0].y;
        float f4 = ((PointF[]) ListProtector.get(this.LJZL, 0))[0].y;
        Iterator<PointF[]> it = this.LJZL.iterator();
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
        return (f4 - f3) / this.LJLZ.getScale();
    }

    public float getOriginWidth() {
        if (this.LJZL.isEmpty()) {
            return 0.0f;
        }
        float f = ((PointF[]) ListProtector.get(this.LJZL, 0))[0].x;
        float f2 = ((PointF[]) ListProtector.get(this.LJZL, 0))[0].x;
        float f3 = ((PointF[]) ListProtector.get(this.LJZL, 0))[0].y;
        float f4 = ((PointF[]) ListProtector.get(this.LJZL, 0))[0].y;
        Iterator<PointF[]> it = this.LJZL.iterator();
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
        return (f2 - f) / this.LJLZ.getScale();
    }

    public float getStickerRotate() {
        return this.LJLJJI.LIZIZ;
    }

    public float getStickerScale() {
        return this.LJLJJI.LIZ;
    }

    public String getText() {
        return V1M.LJJIII(this.LJLJJLL);
    }

    public float getTextMiddleLineCenterX() {
        YKS yks = this.LJLLL;
        if (yks == null) {
            return 0.0f;
        }
        return yks.LJJIJIIJIL;
    }

    public float getTextMiddleLineCenterY() {
        YKS yks = this.LJLLL;
        if (yks == null) {
            return 0.0f;
        }
        return yks.LJJIJIIJI;
    }

    public RectF getTextRect() {
        return this.LJLLL.LIZIZ;
    }

    public List<TextStickerTextWrap> getTextWrapList() {
        List<TextStickerTextWrap> list = this.LJLJJLL;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public final boolean LJIIIIZZ() {
        if (!LJIILJJIL()) {
            return false;
        }
        super.invalidate();
        return true;
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
        return this.LJLZ;
    }

    public int getDeltaX() {
        return this.LJLLILLLL;
    }

    public int getDeltaY() {
        return this.LJLLJ;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void LIZ(int i) {
        YKS yks = this.LJLLL;
        yks.LJII.setColor(i);
        yks.LJIIIIZZ = i;
        if (yks.LJJIII) {
            yks.LJIJJ.setShadowLayer(12.0f, 0.0f, 0.0f, i);
        } else {
            yks.LJIJJ.setShadowLayer(0.0f, 0.0f, 0.0f, i);
        }
        this.LL = i;
    }

    public final void LJFF(TextStickerData textStickerData) {
        this.LJLZ = textStickerData;
        if (textStickerData == null) {
            return;
        }
        setFontSize(textStickerData.getFontSize());
        LJIIJJI(this.LJLZ.getBgMode(), this.LJLZ.getColor(), this.LJLZ.getAlign(), this.LJLZ.getFontType());
        setText(this.LJLZ.getTextWrapList());
        setAnimXY(this.LJLZ.getEditCenterPoint());
        TextStickerData textStickerData2 = this.LJLZ;
        if (textStickerData2 != null && textStickerData2.hasPositionData()) {
            this.LJLIL = this.LJLZ.getX();
            this.LJLILLLLZI = this.LJLZ.getY();
            this.LJLJJI.LIZIZ = this.LJLZ.getRotation();
            this.LJLJJI.LIZ = this.LJLZ.getScale();
        }
        super.invalidate();
    }

    public final boolean LJI(float f) {
        if (!LJIILJJIL()) {
            return false;
        }
        float degrees = (float) Math.toDegrees(f);
        if (Math.abs(degrees) > 10.0f) {
            degrees = 0.0f;
        }
        if ((!this.LLI && !this.LLFZ && this.LJLLLLLL.LJIIIZ != 3) || !this.LLFFF) {
            return false;
        }
        C87208YKm c87208YKm = this.LJLJJI;
        YKT ykt = this.LJLLLLLL;
        float f2 = c87208YKm.LIZIZ;
        ykt.LIZ.LJFF(ykt.LJIILL);
        ykt.LIZ.LIZ(degrees);
        float f3 = f2 - degrees;
        if (f3 > 180.0f) {
            f3 -= 360.0f;
        }
        if (f3 < -180.0f) {
            f3 += 360.0f;
        }
        ykt.LIZJ(false);
        c87208YKm.LIZIZ = f3;
        super.invalidate();
        return true;
    }

    public final boolean LJII(ScaleGestureDetector scaleGestureDetector) {
        if (!LJIILJJIL()) {
            return false;
        }
        if ((!this.LLIFFJFJJ && !this.LLFZ && this.LJLLLLLL.LJIIIZ != 3) || (scaleGestureDetector.getScaleFactor() > 1.0f ? this.LJLJJI.LIZ > 2.0f : this.LJLJJI.LIZ < 0.81f)) {
            return false;
        }
        this.LJLJJI.LIZ *= scaleGestureDetector.getScaleFactor();
        super.invalidate();
        return true;
    }

    public final void LJIIL(float f) {
        C87208YKm c87208YKm = this.LJLJJI;
        c87208YKm.LIZIZ = f;
        if (f > 180.0f) {
            c87208YKm.LIZIZ = f - 360.0f;
        }
        float f2 = c87208YKm.LIZIZ;
        if (f2 < -180.0f) {
            c87208YKm.LIZIZ = f2 + 360.0f;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        Object obj;
        List<InteractTextStructWrap> arrayList;
        char c;
        char c2;
        super.onDraw(canvas);
        C87208YKm c87208YKm = this.LJLJJI;
        PointF pointF = c87208YKm.LIZJ;
        pointF.x = this.LJLIL;
        pointF.y = this.LJLILLLLZI;
        c87208YKm.LJI = this.LJLLLLLL.LJIIIIZZ;
        getFontSize();
        YKS yks = this.LJLLL;
        C87208YKm c87208YKm2 = this.LJLJJI;
        ArrayList<PointF[]> arrayList2 = this.LJZL;
        yks.getClass();
        PointF pointF2 = c87208YKm2.LIZJ;
        yks.LJJIFFI = pointF2.x;
        yks.LJJII = pointF2.y;
        yks.LJIJJ.setTextSize(c87208YKm2.LJ * c87208YKm2.LIZ);
        yks.LJJIIZI = C156826Dm.LIZIZ(yks.LIZ, yks.LJIJJ.getTextSize());
        yks.LJIJJ.getFontMetrics(yks.LJJIJ);
        yks.LJJII = (yks.LJJIJ.bottom * 2.0f) + yks.LJJII;
        yks.LJJIIJ = c87208YKm2.LIZIZ;
        if (yks.LJIIJ != null) {
            int i = 0;
            int i2 = 0;
            while (true) {
                TextStickerString[] textStickerStringArr = yks.LJIIJ;
                if (i >= textStickerStringArr.length) {
                    break;
                }
                int LJJIIJ = V1M.LJJIIJ(yks.LJIJJ, textStickerStringArr[i].getStr(), 0, yks.LJIIJ[i].getStr().length());
                if (LJJIIJ > i2) {
                    i2 = LJJIIJ;
                }
                i++;
            }
            int i3 = c87208YKm2.LIZLLL;
            if (i3 == 1) {
                yks.LJJIFFI -= i2 / 2;
            } else if (i3 == 3) {
                yks.LJJIFFI += i2 / 2;
            }
        }
        float f = yks.LJJIFFI;
        float f2 = yks.LJJII;
        float f3 = c87208YKm2.LIZ;
        int i4 = c87208YKm2.LIZLLL;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        TextStickerString[] textStickerStringArr2 = yks.LJIIJ;
        if (textStickerStringArr2 != null && textStickerStringArr2.length != 0) {
            Paint.FontMetrics fontMetrics = yks.LJIJJ.getFontMetrics();
            float f4 = fontMetrics.ascent;
            float f5 = fontMetrics.descent;
            int length = yks.LJIIJ.length;
            int i5 = length - 1;
            float f6 = f5 - f4;
            float f7 = i5 * f6;
            PointF[][] pointFArr = new PointF[length];
            int i6 = (int) f6;
            float f8 = yks.LJIILJJIL;
            float f9 = f8 * f3;
            yks.LJIIL = f9;
            float f10 = yks.LJIILL;
            float f11 = f10 * f3;
            yks.LJIILIIL = f11;
            if (f11 >= f10) {
                yks.LJIILIIL = f10;
            }
            if (f9 >= f8) {
                yks.LJIIL = f8;
            }
            int i7 = (int) (f2 - (f7 / 2.0f));
            float f12 = (yks.LJIIJJI * f3) / 4.0f;
            float f13 = Float.MAX_VALUE;
            float f14 = Float.MIN_VALUE;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            float f15 = 0.0f;
            float f16 = 0.0f;
            int i12 = -1;
            int i13 = -1;
            while (i8 < length) {
                int measureText = (int) yks.LJIJJ.measureText(yks.LJIIJ[i8].getStr());
                float f17 = measureText / 2;
                float f18 = yks.LJIIL;
                float f19 = (f - f17) - f18;
                float f20 = f17 + f + f18;
                if (f19 < f13) {
                    f13 = f19;
                }
                if (f20 > f14) {
                    f14 = f20;
                }
                if (i4 == 1) {
                    f19 = f - f18;
                    f20 = measureText + f + f18;
                } else if (i4 == 3) {
                    f19 = (f - measureText) - f18;
                    f20 = f + f18;
                }
                if (yks.LJIIJ[i8].getStr().trim().length() == 0) {
                    if (i4 == 1) {
                        f20 = yks.LJIIL + f;
                    } else {
                        f20 = f;
                        if (i4 == 3) {
                            f20 = f - yks.LJIIL;
                        }
                    }
                    f19 = f20;
                }
                if (Math.abs(measureText - i10) < f12 && (i4 != 1 ? !(i4 != 3 ? i4 != 2 || f16 <= 0.0f : f16 <= 0.0f) : f15 > 0.0f)) {
                    f20 = f15;
                } else {
                    f16 = f19;
                }
                if (i8 == 0) {
                    i11 = i7 - i6;
                }
                int i14 = i11 + i6;
                if (length > 1) {
                    if (i8 > 0) {
                        i12 = (int) yks.LJIJJ.measureText(yks.LJIIJ[i8 - 1].getStr());
                    }
                    if (i8 < i5) {
                        i13 = (int) yks.LJIJJ.measureText(yks.LJIIJ[i8 + 1].getStr());
                    }
                }
                if (i12 > 0 && measureText >= i12) {
                    i14 = (int) (i14 + yks.LJIILIIL);
                }
                if (i13 > 0 && measureText > i13) {
                    i14 = (int) (i14 + yks.LJIILIIL);
                }
                if (i8 == 0) {
                    i11 = (int) (i11 - yks.LJIILIIL);
                }
                if (i8 == i5) {
                    i14 = (int) (i14 + yks.LJIILIIL);
                }
                PointF[] pointFArr2 = new PointF[4];
                float f21 = i11;
                pointFArr2[0] = new PointF(f16, f21);
                pointFArr2[1] = new PointF(f20, f21);
                float f22 = i14;
                pointFArr2[2] = new PointF(f20, f22);
                pointFArr2[3] = new PointF(f16, f22);
                pointFArr[i8] = pointFArr2;
                if (arrayList2 != null) {
                    arrayList2.add(pointFArr2);
                }
                if (measureText > i9) {
                    i9 = measureText;
                }
                i8++;
                f15 = f20;
                i11 = i14;
                i10 = measureText;
            }
            PointF pointF3 = pointFArr[0][0];
            float f23 = pointF3.x;
            float f24 = pointF3.y;
            float f25 = f24;
            float f26 = f23;
            for (int i15 = 0; i15 < length; i15++) {
                for (PointF pointF4 : pointFArr[i15]) {
                    float f27 = pointF4.x;
                    if (f27 < f26) {
                        f26 = f27;
                    }
                    if (f27 > f23) {
                        f23 = f27;
                    }
                    float f28 = pointF4.y;
                    if (f28 < f25) {
                        f25 = f28;
                    }
                    if (f28 > f24) {
                        f24 = f28;
                    }
                }
            }
            yks.LJJ.reset();
            ((ArrayList) yks.LJJIIJZLJL).clear();
            for (int i16 = 0; i16 < length; i16++) {
                if (i16 == 0) {
                    Path path = yks.LJJ;
                    PointF pointF5 = pointFArr[i16][0];
                    path.moveTo(pointF5.x, pointF5.y);
                }
                Path path2 = yks.LJJ;
                PointF pointF6 = pointFArr[i16][1];
                path2.lineTo(pointF6.x, pointF6.y);
                PointF[] pointFArr3 = pointFArr[i16];
                float f29 = pointFArr3[0].x;
                PointF pointF7 = pointFArr3[1];
                float f30 = pointF7.x;
                if (f29 == f30) {
                    yks.LJJ.lineTo(f30, pointF7.y);
                    Path path3 = yks.LJJ;
                    c2 = 2;
                    PointF pointF8 = pointFArr[i16][2];
                    path3.lineTo(pointF8.x, pointF8.y);
                } else {
                    c2 = 2;
                }
                Path path4 = yks.LJJ;
                PointF pointF9 = pointFArr[i16][c2];
                path4.lineTo(pointF9.x, pointF9.y);
                ((ArrayList) yks.LJJIIJZLJL).add(pointFArr[i16][0]);
                ((ArrayList) yks.LJJIIJZLJL).add(pointFArr[i16][1]);
                ((ArrayList) yks.LJJIIJZLJL).add(pointFArr[i16][2]);
                ((ArrayList) yks.LJJIIJZLJL).add(pointFArr[i16][3]);
            }
            for (int i17 = i5; i17 >= 0; i17--) {
                PointF[] pointFArr4 = pointFArr[i17];
                if (pointFArr4[0].x == pointFArr4[1].x) {
                    Path path5 = yks.LJJ;
                    c = 3;
                    PointF pointF10 = pointFArr4[3];
                    path5.lineTo(pointF10.x, pointF10.y);
                } else {
                    c = 3;
                }
                Path path6 = yks.LJJ;
                PointF pointF11 = pointFArr[i17][c];
                path6.lineTo(pointF11.x, pointF11.y);
                PointF[] pointFArr5 = pointFArr[i17];
                PointF pointF12 = pointFArr5[0];
                float f31 = pointF12.x;
                if (f31 == pointFArr5[1].x) {
                    yks.LJJ.lineTo(f31, pointF12.y);
                }
                Path path7 = yks.LJJ;
                PointF pointF13 = pointFArr[i17][0];
                path7.lineTo(pointF13.x, pointF13.y);
            }
            Path path8 = yks.LJJ;
            PointF pointF14 = pointFArr[0][1];
            path8.lineTo(pointF14.x, pointF14.y);
            yks.LJIJJ.getTextBounds(yks.LJIIJ[0].getStr(), 0, yks.LJIIJ[0].getStr().length(), new Rect());
            int i18 = i9 >> 1;
            if (i4 == 1) {
                float f32 = yks.LJIIL;
                yks.LIZIZ = new RectF(f - f32, pointFArr[0][0].y, i9 + f + f32, pointFArr[i5][2].y);
            } else if (i4 == 3) {
                float f33 = yks.LJIIL;
                yks.LIZIZ = new RectF((f - i9) - f33, pointFArr[0][0].y, f33 + f, pointFArr[i5][2].y);
            } else if (i4 == 2) {
                float f34 = i18;
                float f35 = yks.LJIIL;
                yks.LIZIZ = new RectF((f - f34) - f35, pointFArr[0][0].y, f + f34 + f35, pointFArr[i5][2].y);
            }
            yks.LIZJ.set(yks.LIZIZ);
            RectF rectF = yks.LIZJ;
            float f36 = rectF.left;
            float f37 = yks.LJIILLIIL;
            rectF.set(f36 - f37, rectF.top - f37, rectF.right + f37, rectF.bottom + f37);
        }
        float f38 = c87208YKm2.LIZIZ;
        if (c87208YKm2.LJI) {
            canvas.save();
            canvas.rotate(f38, yks.LIZJ.centerX(), yks.LIZJ.centerY());
            yks.LJIJJLI.setColor(-1);
            RectF rectF2 = yks.LIZJ;
            float f39 = yks.LJIIZILJ;
            canvas.drawRoundRect(rectF2, f39, f39, yks.LJIJJLI);
            canvas.restore();
        }
        float f40 = yks.LJJIFFI;
        float f41 = yks.LJJII;
        float f42 = c87208YKm2.LIZIZ;
        float f43 = c87208YKm2.LIZ;
        int i19 = c87208YKm2.LIZLLL;
        TextStickerString[] textStickerStringArr3 = yks.LJIIJ;
        if (textStickerStringArr3 != null && textStickerStringArr3.length != 0) {
            Paint.FontMetrics fontMetrics2 = yks.LJIJJ.getFontMetrics();
            float f44 = fontMetrics2.ascent;
            float f45 = fontMetrics2.descent;
            int length2 = yks.LJIIJ.length;
            float f46 = f45 - f44;
            float f47 = (((length2 - 1) * f46) / 2.0f) - f45;
            canvas.save();
            canvas.rotate(f42, yks.LIZJ.centerX(), yks.LIZJ.centerY());
            float f48 = yks.LJIIJJI * 0.7f;
            yks.LJ.set(0.0f, 0.0f, f48, f48);
            yks.LJFF.set(yks.LJ);
            C77119UOl.LJJIIZ(yks.LJFF, f43);
            C77119UOl.LJJIIJZLJL(f40, f41, yks.LJFF, f42);
            float f49 = 0.0f;
            float f50 = 0.0f;
            for (int i20 = 0; i20 < length2; i20++) {
                float f51 = ((-((length2 - i20) - 1)) * f46) + f47;
                String str = yks.LJIIJ[i20].getStr();
                List<TextStickerTextWrap> list = yks.LJIIIZ;
                TextStickerString str2 = yks.LJIIJ[i20];
                o.LJIIIZ(str2, "str");
                if (list == null) {
                    arrayList = new ArrayList<>();
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<TextStickerTextWrap> it = list.iterator();
                    while (it.hasNext()) {
                        ORS.LJJLIIIJILLIZJL(it.next().getStrMap().entrySet(), arrayList3);
                    }
                    Iterator it2 = arrayList3.iterator();
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
                int i21 = 0;
                int LJJIIJ2 = V1M.LJJIIJ(yks.LJIJJ, str, 0, str.length());
                if (V1M.LJJIJ(str.length(), arrayList)) {
                    for (int i22 = 0; i22 < arrayList.size(); i22++) {
                        InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) ListProtector.get(arrayList, i22);
                        if (interactTextStructWrap.getRange().isValid(str.length())) {
                            int start = interactTextStructWrap.getRange().getStart();
                            if (start < str.length() && str.charAt(start) == ' ') {
                                start++;
                            }
                            if (start < str.length() && str.charAt(start) == '_') {
                                i21 = (int) (yks.LJFF.width() + yks.LJIJI + (i21 - V1M.LJJIIJ(yks.LJIJJ, str, start, start + 1)));
                            }
                        }
                    }
                }
                int i23 = LJJIIJ2 + i21;
                if (i19 == 2) {
                    yks.LIZIZ(canvas, arrayList, str, f40 - (i23 / 2), (yks.LJIILIIL * i20) + f41 + f51);
                } else if (i19 == 1) {
                    yks.LIZIZ(canvas, arrayList, str, f40, (yks.LJIILIIL * i20) + f41 + f51);
                } else if (i19 == 3) {
                    yks.LIZIZ(canvas, arrayList, str, f40 - i23, (yks.LJIILIIL * i20) + f41 + f51);
                }
                if (length2 % 2 == 0) {
                    int i24 = i20 + 1;
                    int i25 = length2 / 2;
                    if (i24 == i25) {
                        f49 = (yks.LJIILIIL * i20) + f41 + f51;
                    }
                    if (i24 == i25 + 1) {
                        f50 = (yks.LJIILIIL * i20) + f41 + f51;
                    }
                } else if (i20 + 1 == (length2 / 2) + 1) {
                    f49 = (yks.LJIILIIL * i20) + f41 + f51;
                    f50 = f49;
                }
            }
            yks.LJJIJIIJI = ((((yks.LJIJJ.ascent() + yks.LJIJJ.descent()) / 2.0f) - yks.LJIJJ.descent()) / 2.0f) + ((f49 + f50) / 2.0f);
            yks.LJJIJIIJIL = f40;
            canvas.restore();
        }
        float f52 = c87208YKm2.LIZIZ;
        boolean z3 = c87208YKm2.LJFF;
        if (!yks.LJJIII && z3) {
            canvas.save();
            canvas.rotate(f52, yks.LIZJ.centerX(), yks.LIZJ.centerY());
            yks.LJII.setColor(yks.LJIIIIZZ);
            canvas.drawPath(yks.LJJ, yks.LJII);
            canvas.restore();
        }
        YKV ykv = this.LJLLLL;
        C87208YKm c87208YKm3 = this.LJLJJI;
        float f53 = c87208YKm3.LIZ;
        float f54 = c87208YKm3.LIZIZ;
        float f55 = this.LJLIL;
        float f56 = this.LJLILLLLZI;
        float f57 = 1.0f;
        if (ykv.LJII) {
            float f58 = ykv.LJIIJ;
            if (f58 < 0.0f ? f54 <= f58 : f54 >= f58) {
                z = true;
            } else {
                z = false;
            }
            float f59 = ykv.LJIIJJI;
            if (f59 < 1.0f ? f53 <= f59 : f53 >= f59) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2 && f55 == ykv.LJIIIIZZ && f56 == ykv.LJIIIZ) {
                ykv.LJII = false;
                ykv.LJI = false;
                YKR ykr = ykv.LJIIL;
                ykr.LJLJJI.LIZ = f59;
                ykr.LJIIL(f58);
                ykv.LJIIL.setCenterX(ykv.LJIIIIZZ);
                ykv.LJIIL.setCenterY(ykv.LJIIIZ);
                super.invalidate();
                InterfaceC87211YKp interfaceC87211YKp = ykv.LJIILIIL;
                if (interfaceC87211YKp != null) {
                    interfaceC87211YKp.LIZ();
                }
            } else {
                if (f53 <= f59) {
                    float f60 = f53 - ykv.LIZ;
                    if (f60 <= f59) {
                        f59 = f60;
                    }
                    ykv.LJIIL.LJLJJI.LIZ = f59;
                } else {
                    float f61 = f53 + ykv.LIZ;
                    if (f61 >= f59) {
                        f59 = f61;
                    }
                    ykv.LJIIL.LJLJJI.LIZ = f59;
                }
                if (f58 > 0.0f) {
                    if (f54 <= f58) {
                        float f62 = f54 - ykv.LIZIZ;
                        if (f62 <= f58) {
                            f58 = f62;
                        }
                        ykv.LJIIL.LJIIL(f58);
                    }
                } else if (f54 >= f58) {
                    float f63 = f54 - ykv.LIZIZ;
                    if (f63 >= f58) {
                        f58 = f63;
                    }
                    ykv.LJIIL.LJIIL(f58);
                }
                float f64 = ykv.LJIIIIZZ;
                if (f64 > ykv.LJ) {
                    if (f55 < f64) {
                        float f65 = f55 - ykv.LIZJ;
                        if (f65 <= f64) {
                            f64 = f65;
                        }
                        ykv.LJIIL.setCenterX(f64);
                    }
                } else if (f55 > f64) {
                    float f66 = f55 - ykv.LIZJ;
                    if (f66 >= f64) {
                        f64 = f66;
                    }
                    ykv.LJIIL.setCenterX(f64);
                }
                float f67 = ykv.LJIIIZ;
                if (f67 > ykv.LJFF) {
                    if (f56 < f67) {
                        float f68 = f56 - ykv.LIZLLL;
                        if (f68 <= f67) {
                            f67 = f68;
                        }
                        ykv.LJIIL.setCenterY(f67);
                    }
                } else if (f56 > f67) {
                    float f69 = f56 - ykv.LIZLLL;
                    if (f69 >= f67) {
                        f67 = f69;
                    }
                    ykv.LJIIL.setCenterY(f67);
                }
                super.invalidate();
            }
        }
        YKV ykv2 = this.LJLLLL;
        C87208YKm c87208YKm4 = this.LJLJJI;
        float f70 = c87208YKm4.LIZ;
        float f71 = c87208YKm4.LIZIZ;
        float f72 = this.LJLIL;
        float f73 = this.LJLILLLLZI;
        if (!ykv2.LJI) {
            return;
        }
        float f74 = ykv2.LJIIJ;
        if (f74 < 0.0f ? !(f70 > 1.0f || f71 < 0.0f || f72 != ykv2.LJ || f73 != ykv2.LJFF) : !(f70 > 1.0f || f71 > 0.0f || f72 != ykv2.LJ || f73 != ykv2.LJFF)) {
            ykv2.LJI = false;
            ykv2.LJII = false;
            YKR ykr2 = ykv2.LJIIL;
            ykr2.LJLJJI.LIZ = 1.0f;
            ykr2.LJIIL(0.0f);
            ykv2.LJIIL.setCenterX(ykv2.LJ);
            ykv2.LJIIL.setCenterY(ykv2.LJFF);
            super.invalidate();
            InterfaceC87211YKp interfaceC87211YKp2 = ykv2.LJIILIIL;
            if (interfaceC87211YKp2 == null) {
                return;
            }
            interfaceC87211YKp2.LIZJ();
            return;
        }
        if (f70 > 1.0f) {
            float f75 = f70 - ykv2.LIZ;
            if (f75 >= 1.0f) {
                f57 = f75;
            }
            ykv2.LJIIL.LJLJJI.LIZ = f57;
        } else {
            float f76 = f70 + ykv2.LIZ;
            if (f76 <= 1.0f) {
                f57 = f76;
            }
            ykv2.LJIIL.LJLJJI.LIZ = f57;
        }
        if (f74 > 0.0f) {
            if (f71 >= 0.0f) {
                float f77 = f71 - ykv2.LIZIZ;
                if (f77 < 0.0f) {
                    f77 = 0.0f;
                }
                ykv2.LJIIL.LJIIL(f77);
            }
        } else if (f71 <= 0.0f) {
            float f78 = f71 - ykv2.LIZIZ;
            if (f78 > 0.0f) {
                f78 = 0.0f;
            }
            ykv2.LJIIL.LJIIL(f78);
        }
        float f79 = ykv2.LJIIIIZZ;
        float f80 = ykv2.LJ;
        if (f79 > f80) {
            if (f72 > f80) {
                float f81 = f72 - ykv2.LIZJ;
                if (f81 >= f80) {
                    f80 = f81;
                }
                ykv2.LJIIL.setCenterX(f80);
            }
        } else if (f72 < f80) {
            float f82 = f72 - ykv2.LIZJ;
            if (f82 <= f80) {
                f80 = f82;
            }
            ykv2.LJIIL.setCenterX(f80);
        }
        float f83 = ykv2.LJIIIZ;
        float f84 = ykv2.LJFF;
        if (f83 > f84) {
            if (f73 > f84) {
                float f85 = f73 - ykv2.LIZLLL;
                if (f85 >= f84) {
                    f84 = f85;
                }
                ykv2.LJIIL.setCenterY(f84);
            }
        } else if (f73 < f84) {
            float f86 = f73 - ykv2.LIZLLL;
            if (f86 <= f84) {
                f84 = f86;
            }
            ykv2.LJIIL.setCenterY(f84);
        }
        super.invalidate();
    }

    public void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        LJIIJ(f, false);
    }

    public void setAnimXY(Point point) {
        YKV ykv = this.LJLLLL;
        float f = point.x;
        float f2 = point.y;
        ykv.LJIIL.getLocationOnScreen(new int[2]);
        PointF pointF = new PointF(f - r1[0], f2 - r1[1]);
        ykv.LJ = pointF.x;
        ykv.LJFF = pointF.y;
    }

    public void setCenterX(float f) {
        this.LJLIL = f;
    }

    public void setCenterY(float f) {
        this.LJLILLLLZI = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r3 <= r1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDrawStrokeState(int r10) {
        /*
            r9 = this;
            r6 = 1
            r8 = 4
            if (r10 != r8) goto L39
            r1 = 1
        L5:
            X.YKS r0 = r9.LJLLL
            r0.LJJIIZ = r1
            if (r1 == 0) goto L37
            android.content.Context r2 = r9.getContext()
            java.lang.String r0 = "view.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            int r7 = r9.getWidth()
            int r5 = r9.getHeight()
            long r3 = (long) r7
            long r0 = (long) r5
            long r3 = r3 * r0
            long r0 = (long) r8
            long r3 = r3 * r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r2)
            int r0 = r0.getScaledMaximumDrawingCacheSize()
            long r1 = (long) r0
            if (r7 <= 0) goto L37
            if (r5 <= 0) goto L37
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L37
        L32:
            r0 = 0
            r9.setLayerType(r6, r0)
            return
        L37:
            r6 = 2
            goto L32
        L39:
            r1 = 0
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YKR.setDrawStrokeState(int):void");
    }

    public void setEditModeListener(InterfaceC87211YKp interfaceC87211YKp) {
        this.LJLLLL.LJIILIIL = interfaceC87211YKp;
    }

    public void setEnableEdit(boolean z) {
        this.LJLL = z;
    }

    public void setEnableRotate(boolean z) {
        this.LLFFF = z;
    }

    public void setFontSize(int i) {
        TextStickerData textStickerData = this.LJLZ;
        if (textStickerData != null) {
            textStickerData.setFontSize(i);
        }
        this.LJLJJI.LJ = (int) C170576mj.LJ(getContext(), i);
        YKS yks = this.LJLLL;
        float f = this.LJLJJI.LJ;
        yks.LJIIJJI = f;
        float LJ = f / C170576mj.LJ(yks.LJJI.getContext(), 28.0f);
        yks.LJIIL = C170576mj.LIZ(yks.LJJI.getContext(), 12.0f) * LJ;
        float LIZ = C170576mj.LIZ(yks.LJJI.getContext(), 8.0f) * LJ;
        yks.LJIILIIL = LIZ;
        yks.LJIILJJIL = yks.LJIIL;
        yks.LJIILL = LIZ;
        yks.LJIJ = (int) (C170576mj.LIZ(yks.LJJI.getContext(), 5.0f) * LJ);
        yks.LJII.setPathEffect(new CornerPathEffect(yks.LJIJ));
        super.invalidate();
    }

    public void setInitOffsetY(float f) {
        this.LJLJI = f;
    }

    public void setMotionInterceptor(InterfaceC87213YKr interfaceC87213YKr) {
        this.LJLLLLLL.LJIJI = interfaceC87213YKr;
    }

    public void setOnEditClickListener(InterfaceC87207YKl interfaceC87207YKl) {
        this.LJLLLLLL.LIZ = interfaceC87207YKl;
    }

    public void setPlayPosition(long j) {
        this.LJZ = j;
    }

    public void setShowHelpBox(boolean z) {
        this.LJLLLLLL.LIZJ(z);
        if (!z) {
            this.LJZI = SystemClock.elapsedRealtime();
            this.LJLLI.postDelayed(new IDRunnableS6S0101000(7, this, 8), 1000L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r9 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r9.isEmpty() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r9.size() != 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r0 = (com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerString[]) ((com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap) com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, 0)).getStrMap().keySet().toArray(new com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerString[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r4 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r4.hasNext() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r2 = r4.next();
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r1.isReplaceString() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (ujb.s.LJZI(r1.getText()).toString().length() <= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r2 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        r2 = new java.util.ArrayList();
        r7 = new java.util.ArrayList();
        r6 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r6.hasNext() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        r4 = r6.next();
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r1.isReplaceString() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        if (ujb.s.LJZI(r1.getText()).toString().length() <= 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        r7.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        r1 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        if (r1.hasNext() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        r2.addAll(((com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap) r1.next()).getStrMap().keySet());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        r0 = (com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerString[]) r2.toArray(new com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerString[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        r0 = (com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerString[]) ((com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap) com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, 0)).getStrMap().keySet().toArray(new com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerString[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0100, code lost:
    
        if (r1 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setText(java.util.List<com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap> r9) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YKR.setText(java.util.List):void");
    }

    public void setTextColor(int i) {
        YKS yks = this.LJLLL;
        yks.getClass();
        C6IH LJ = C6IH.LJ();
        boolean z = false;
        if (LJ.LIZ.get(LJ.LIZJ) != null && LJ.LIZ.get(LJ.LIZJ).enableMaskBlurLightColor == 1) {
            z = true;
        }
        yks.LJJIII = z;
        if (yks.LJIJJ.getTypeface() != C6IH.LJ().LIZ()) {
            yks.LJIJJ.setTypeface(C6IH.LJ().LIZ());
        }
        if (yks.LJJIII) {
            yks.LJIJJ.setColor(-1);
            yks.LJIJJ.setShadowLayer(12.0f, 0.0f, 0.0f, i);
        } else {
            yks.LJIJJ.setShadowLayer(0.0f, 0.0f, 0.0f, i);
            yks.LJIJJ.setColor(i);
        }
        this.LLD = i;
    }

    public void setTouching(boolean z) {
        if (z == this.LLII) {
            return;
        }
        this.LLII = z;
        super.invalidate();
        if (!z) {
            this.LJZI = SystemClock.elapsedRealtime();
            this.LJLLI.postDelayed(new IDRunnableS6S0101000(7, this, 8), 1000L);
        }
    }

    public final boolean LJ(float f, float f2) {
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

    public final void LJIIJ(float f, boolean z) {
        if (z) {
            setAlpha(1.0f);
        } else {
            setAlpha(f);
        }
    }

    public final void LJIILIIL(int i, int i2) {
        this.LJLLILLLL = i;
        this.LJLLJ = i2;
        YKT ykt = this.LJLLLLLL;
        ykt.LJIIJ = i;
        ykt.LJIIJJI = i2;
        TextStickerData textStickerData = this.LJLZ;
        if (textStickerData != null && textStickerData.getEditCenterPoint() != null) {
            setAnimXY(this.LJLZ.getEditCenterPoint());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void LJIIJJI(int i, int i2, int i3, String str) {
        TextStickerData textStickerData = this.LJLZ;
        if (textStickerData != null) {
            textStickerData.setBgMode(i);
            this.LJLZ.setColor(i2);
            this.LJLZ.setFontType(str);
            this.LJLZ.setAlign(i3);
        }
        this.LJLJL = i;
        setDrawStrokeState(i);
        this.LJLJLJ = i2;
        this.LJLJLLL = str;
        C6IH.LJ().LIZJ = this.LJLJLLL;
        if (i == 1 || i == 4) {
            setTextColor(i2);
            this.LJLJJI.LJFF = false;
        } else if (i == 2) {
            if (i2 == -1) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            LIZ(i2);
            this.LJLJJI.LJFF = true;
        } else if (i == 3) {
            setTextColor(-1);
            LIZ(Color.argb(153, (16711680 & i2) >> 16, (65280 & i2) >> 8, i2 & 255));
            this.LJLJJI.LJFF = true;
        }
        this.LJLJJI.LIZLLL = i3;
        super.invalidate();
    }

    public YKR(ActivityC45651qj activityC45651qj, SafeHandler safeHandler, TextStickerData textStickerData, boolean z, UHV uhv) {
        super(activityC45651qj);
        C87208YKm c87208YKm = new C87208YKm();
        this.LJLJJI = c87208YKm;
        this.LJLJJL = true;
        this.LJLJL = 1;
        this.LJLJLJ = -1;
        this.LJLJLLL = "default";
        this.LJLL = true;
        this.LJZL = new ArrayList<>();
        this.LLF = new PointF();
        this.LLFFF = true;
        int i = V1M.LJLJJL;
        V1M.LJLJJL = i + 1;
        this.LLFII = i;
        setWillNotDraw(false);
        this.LJLLI = safeHandler;
        c87208YKm.LJII = z;
        this.LJLLL = new YKS();
        this.LJLLLLLL = new YKT(uhv);
        this.LJLLLL = new YKV();
        YKS yks = this.LJLLL;
        yks.LIZ = activityC45651qj;
        yks.LJJI = this;
        setLayerType(2, null);
        yks.LJIIJJI = C170576mj.LJ(activityC45651qj, 28.0f);
        yks.LJIIL = C170576mj.LIZ(activityC45651qj, 12.0f);
        float LIZ = C170576mj.LIZ(activityC45651qj, 8.0f);
        yks.LJIILIIL = LIZ;
        yks.LJIILJJIL = yks.LJIIL;
        yks.LJIILL = LIZ;
        yks.LJIILLIIL = (int) C170576mj.LIZ(activityC45651qj, 2.0f);
        C170576mj.LIZ(activityC45651qj, 14.0f);
        yks.LJIIZILJ = (int) C170576mj.LIZ(activityC45651qj, 2.0f);
        yks.LJIJ = (int) C170576mj.LIZ(activityC45651qj, 5.0f);
        yks.LJIJI = C74275TDb.LIZIZ(activityC45651qj, 4.0f);
        Bitmap decodeResource = BitmapFactory.decodeResource(activityC45651qj.getResources(), R.drawable.bq6);
        yks.LJI = decodeResource;
        yks.LIZLLL.set(0, 0, decodeResource.getWidth(), yks.LJI.getHeight());
        yks.LJIJJ.setColor(-1);
        yks.LJIJJ.setTypeface(Typeface.DEFAULT_BOLD);
        yks.LJIJJ.setTextSize(yks.LJIIJJI);
        yks.LJIJJ.setAntiAlias(true);
        new Paint(yks.LJIJJ).setColor(-16737912);
        yks.LJIJJLI.setColor(-2130706433);
        yks.LJIJJLI.setStyle(Paint.Style.STROKE);
        yks.LJIJJLI.setAntiAlias(true);
        yks.LJIJJLI.setStrokeWidth(2.0f);
        Paint paint = new Paint();
        yks.LJII = paint;
        paint.setStyle(Paint.Style.FILL);
        yks.LJII.setAntiAlias(true);
        yks.LJII.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        yks.LJII.setPathEffect(new CornerPathEffect(yks.LJIJ));
        yks.LJJ = new Path();
        YKT ykt = this.LJLLLLLL;
        ykt.LJIILL = this;
        ykt.LJIILIIL = safeHandler;
        this.LJLLLL.LJIIL = this;
        C81184Vtc.LJ(activityC45651qj);
        C81184Vtc.LIZLLL(activityC45651qj);
        C16880lQ.LLILL(activityC45651qj, "vibrator");
        this.LJLZ = textStickerData;
        this.LJLJL = textStickerData.getBgMode();
        this.LJLJLJ = this.LJLZ.getColor();
        c87208YKm.LIZLLL = this.LJLZ.getAlign();
        this.LJLJLLL = this.LJLZ.getFontType();
        this.LJLIL = this.LJLZ.getX();
        this.LJLILLLLZI = this.LJLZ.getY();
        c87208YKm.LIZIZ = this.LJLZ.getRotation();
        c87208YKm.LIZ = this.LJLZ.getScale();
        this.LJLJJLL = this.LJLZ.getTextWrapList();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LJLJJL) {
            this.LJLJJL = false;
            this.LJLIL = getMeasuredWidth() / 2.0f;
            this.LJLILLLLZI = ((getMeasuredHeight() / 2.0f) - (getFontSize() / 2.0f)) + this.LJLJI;
            C87208YKm c87208YKm = this.LJLJJI;
            c87208YKm.LIZIZ = 0.0f;
            c87208YKm.LIZ = 1.0f;
            LJFF(this.LJLZ);
        }
    }
}
