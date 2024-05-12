package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.67R, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67R extends C67P {
    public final C1552667m LLIILII;
    public final C1554768h LLIILZL;
    public final C1555868s LLIIZ;
    public final View LLIL;
    public final View LLILII;
    public final View LLILIL;
    public final View LLILL;
    public InnerEffectTextLayoutConfig LLILLIZIL;
    public boolean LLILLJJLI;

    private final RectF getEffectTextRect() {
        C1555868s c1555868s = this.LLIIZ;
        Matrix matrix = c1555868s.getMatrix();
        o.LJIIIIZZ(matrix, "matrix");
        Context context = c1555868s.getContext();
        o.LJIIIIZZ(context, "context");
        if (C74275TDb.LJFF(context)) {
            matrix.setTranslate(c1555868s.getX(), c1555868s.getY());
            matrix.preTranslate(c1555868s.getScaleX(), c1555868s.getScaleY());
        }
        Rect rect = new Rect();
        c1555868s.getDrawingRect(rect);
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        return rectF;
    }

    @Override // X.C67P
    public final TextStickerData LJ() {
        if (this.LJZL == null) {
            TextStickerData textStickerData = new TextStickerData("", this.LJLJL, this.LJLJLJ, this.LJLJJI.LIZLLL, this.LJLJLLL, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -32, -1, 1048575, null);
            this.LJZL = textStickerData;
            List<TextStickerTextWrap> mTextWrapList = this.LJLJJLL;
            o.LJIIIIZZ(mTextWrapList, "mTextWrapList");
            textStickerData.setTextWrapList(mTextWrapList);
        }
        this.LJZL.setX(this.LJLIL);
        this.LJZL.setY(this.LJLILLLLZI);
        this.LJZL.setRotation(this.LJLJJI.LIZIZ);
        this.LJZL.setScale(this.LJLJJI.LIZ);
        TextStickerData textStickerData2 = this.LJZL;
        List<TextStickerTextWrap> mTextWrapList2 = this.LJLJJLL;
        o.LJIIIIZZ(mTextWrapList2, "mTextWrapList");
        textStickerData2.setTextWrapList(mTextWrapList2);
        this.LJZL.setBgMode(this.LJLJL);
        this.LJZL.setColor(this.LJLJLJ);
        this.LJZL.setAlign(this.LJLJJI.LIZLLL);
        this.LJZL.setFontType(this.LJLJLLL);
        TextStickerData mData = this.LJZL;
        o.LJIIIIZZ(mData, "mData");
        return mData;
    }

    @Override // X.C67P
    public final void LJJIIJ() {
        TextStickerData textStickerData = this.LJZL;
        if (textStickerData != null && textStickerData.hasPositionData()) {
            if (this.LJZL.getCoverExtraData().isPortrait() == this.LLIILII.LJLIL) {
                this.LJLIL = this.LJZL.getX();
                this.LJLILLLLZI = this.LJZL.getY();
            }
            this.LJLJJI.LIZIZ = this.LJZL.getRotation();
            this.LJLJJI.LIZ = this.LJZL.getScale();
        }
    }

    @Override // X.C67P
    public PointF[] getAnglePointList() {
        if (this.LLILLJJLI) {
            RectF effectTextRect = getEffectTextRect();
            return new PointF[]{new PointF(effectTextRect.left, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.bottom), new PointF(effectTextRect.left, effectTextRect.bottom)};
        }
        PointF[] anglePointList = super.getAnglePointList();
        o.LJIIIIZZ(anglePointList, "{\n            super.getAnglePointList()\n        }");
        return anglePointList;
    }

    @Override // X.C67P
    public PointF[] getAnglePointListForBlock() {
        if (this.LLILLJJLI) {
            RectF effectTextRect = getEffectTextRect();
            return new PointF[]{new PointF(effectTextRect.left, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.bottom), new PointF(effectTextRect.left, effectTextRect.bottom)};
        }
        PointF[] anglePointListForBlock = super.getAnglePointListForBlock();
        o.LJIIIIZZ(anglePointListForBlock, "{\n            super.getA…tListForBlock()\n        }");
        return anglePointListForBlock;
    }

    @Override // X.C67P
    public RectF getCurrentHelpBoxRect() {
        if (this.LLILLJJLI) {
            return getEffectTextRect();
        }
        return this.LJLZ.LJIIL();
    }

    public final InnerEffectTextLayoutConfig getEffectTextLayoutConfig() {
        return this.LLILLIZIL;
    }

    public final boolean getEffectTextMode() {
        return this.LLILLJJLI;
    }

    public final void LJJIIZI(boolean z) {
        if (!this.LLIILZL.LIZ) {
            return;
        }
        if (z) {
            if (this.LLIILII.LJLIL) {
                this.LLIL.setVisibility(0);
                this.LLILII.setVisibility(0);
                this.LLILIL.setVisibility(4);
                this.LLILL.setVisibility(4);
                return;
            }
            this.LLIL.setVisibility(4);
            this.LLILII.setVisibility(4);
            this.LLILIL.setVisibility(0);
            this.LLILL.setVisibility(0);
            return;
        }
        this.LLIL.setVisibility(4);
        this.LLILII.setVisibility(4);
        this.LLILIL.setVisibility(4);
        this.LLILL.setVisibility(4);
    }

    @Override // X.C67P, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.LLILLJJLI) {
            C1555868s c1555868s = this.LLIIZ;
            float width = this.LJLIL - (c1555868s.getWidth() / 2.0f);
            float height = this.LJLILLLLZI - (c1555868s.getHeight() / 2.0f);
            c1555868s.setX(width);
            c1555868s.setY(height);
            c1555868s.setRotation(this.LJLJJI.LIZIZ);
            c1555868s.setScaleX(this.LJLJJI.LIZ);
            c1555868s.setScaleY(this.LJLJJI.LIZ);
            C1555868s c1555868s2 = this.LLIIZ;
            if (this.LJZI.LJIIIIZZ) {
                drawable = c1555868s2.LJLL;
            } else {
                drawable = null;
            }
            c1555868s2.setBackground(drawable);
        } else {
            LIZLLL(canvas);
        }
        C67Z c67z = this.LJZ;
        C1553867y c1553867y = this.LJLJJI;
        c67z.LIZIZ(c1553867y.LIZ, c1553867y.LIZIZ, this.LJLIL, this.LJLILLLLZI);
        C67Z c67z2 = this.LJZ;
        C1553867y c1553867y2 = this.LJLJJI;
        c67z2.LIZ(c1553867y2.LIZ, c1553867y2.LIZIZ, this.LJLIL, this.LJLILLLLZI);
    }

    public final void setEffectTextLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this.LLILLIZIL = innerEffectTextLayoutConfig;
    }

    public final void setEffectTextMode(boolean z) {
        this.LLILLJJLI = z;
    }

    @Override // X.C67P
    public final PointF LJII(float f, float f2) {
        float f3;
        float f4;
        PointF LJII = super.LJII(f, f2);
        C1552667m c1552667m = this.LLIILII;
        float f5 = c1552667m.LJLILLLLZI;
        if (f5 == 0.0f) {
            f5 = 1.0f;
        }
        if (c1552667m.LJLIL) {
            f4 = LJII.x / f5;
            f3 = (((1 - f5) * (-getHeight())) / 2) + (LJII.y / f5);
        } else {
            float f6 = LJII.x / f5;
            f3 = LJII.y / f5;
            f4 = f6 + (((1 - f5) * (-getWidth())) / 2);
        }
        return new PointF(f4, f3);
    }

    @Override // X.C67P
    public final boolean LJIIIIZZ(float f, float f2) {
        if (this.LLILLJJLI) {
            return C77119UOl.LJIILL(f, f2, getEffectTextRect(), this.LJLJJI.LIZIZ);
        }
        return C77119UOl.LJIILL(f, f2 - this.LJLLLLLL, getHelpRect(), this.LJLJJI.LIZIZ);
    }

    @Override // X.C67P
    public final boolean LJIIIZ(float f, float f2) {
        if (this.LLILLJJLI) {
            return C77119UOl.LJIILL(f, f2, getEffectTextRect(), this.LJLJJI.LIZIZ);
        }
        return C77119UOl.LJIILL(f, f2, getHelpRect(), this.LJLJJI.LIZIZ);
    }

    @Override // X.C67P
    public final void LJJIIJZLJL(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, List textWrapList) {
        o.LJIIIZ(textWrapList, "textWrapList");
        this.LJLJJLL = textWrapList;
        Context context = getContext();
        this.LLIILZL.getClass();
        String string = context.getString(R.string.p72);
        o.LJIIIIZZ(string, "context.getString(\n     …elect_entertext\n        )");
        ArrayList arrayList = new ArrayList();
        Iterator it = textWrapList.iterator();
        while (it.hasNext()) {
            TextStickerTextWrap textStickerTextWrap = (TextStickerTextWrap) it.next();
            String text = textStickerTextWrap.getText();
            if (text == null || text.length() == 0) {
                arrayList.add(C68W.LIZIZ(string, true));
            } else {
                arrayList.add(textStickerTextWrap);
            }
        }
        LJJIJ(innerEffectTextLayoutConfig, arrayList);
    }

    public final void LJJIJ(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, List list) {
        this.LLILLIZIL = innerEffectTextLayoutConfig;
        if (innerEffectTextLayoutConfig != null) {
            this.LLILLJJLI = true;
            this.LLIIZ.setInnerLayoutConfig(innerEffectTextLayoutConfig);
            this.LLIIZ.setVisibility(0);
            C1555868s c1555868s = this.LLIIZ;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TextStickerTextWrap textStickerTextWrap = (TextStickerTextWrap) it.next();
                arrayList.add(new C1555968t(textStickerTextWrap.getSelectionStart(), textStickerTextWrap.isReplaceString(), textStickerTextWrap.getText(), 8));
            }
            c1555868s.setText(arrayList);
            return;
        }
        this.LLILLJJLI = false;
        this.LLIIZ.setVisibility(4);
        if (!list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            C69D c69d = C69E.LIZ;
            if (c69d != null) {
                int i = c69d.LJLJI;
                Iterator it2 = list.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    TextStickerTextWrap textStickerTextWrap2 = (TextStickerTextWrap) it2.next();
                    if (i2 >= i) {
                        break;
                    }
                    if (textStickerTextWrap2.getText().length() + i2 <= i) {
                        arrayList2.add(textStickerTextWrap2);
                        i2 += textStickerTextWrap2.getText().length();
                    } else {
                        String substring = textStickerTextWrap2.getText().substring(0, i - i2);
                        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        arrayList2.add(C68W.LIZIZ(substring, false));
                        i2 = i;
                    }
                }
                list = arrayList2;
            } else {
                o.LJIJI("effectTextConfig");
                throw null;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (((TextStickerTextWrap) obj).safeStrPair().first.length() > 0) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            this.LJLZ.LJIJJ(arrayList3);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LJLZ.LJIJJ(C47261Igj.LJII(C68W.LIZIZ("", false)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67R(ActivityC45651qj context, SafeHandler safeHandler, TextStickerData textStickerData, C1552667m cover2EffectTextBean, C1554768h textStickerInitConfig) {
        super(context, safeHandler, textStickerData, false, null, Boolean.FALSE);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cover2EffectTextBean, "cover2EffectTextBean");
        o.LJIIIZ(textStickerInitConfig, "textStickerInitConfig");
        new LinkedHashMap();
        this.LLIILII = cover2EffectTextBean;
        this.LLIILZL = textStickerInitConfig;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "getContext()");
        C1555868s c1555868s = new C1555868s(context2);
        c1555868s.setEditable(false);
        c1555868s.setMaxTextWidth(cover2EffectTextBean.LJLJI);
        c1555868s.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        c1555868s.setVisibility(4);
        this.LLIIZ = c1555868s;
        View view = new View(getContext());
        Context context3 = view.getContext();
        o.LJIIIIZZ(context3, "getContext()");
        view.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.ef, context3));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 48;
        view.setLayoutParams(layoutParams);
        view.setVisibility(4);
        this.LLIL = view;
        View view2 = new View(getContext());
        Context context4 = view2.getContext();
        o.LJIIIIZZ(context4, "getContext()");
        view2.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.ef, context4));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        view2.setLayoutParams(layoutParams2);
        view2.setVisibility(4);
        this.LLILII = view2;
        View view3 = new View(getContext());
        Context context5 = view3.getContext();
        o.LJIIIIZZ(context5, "getContext()");
        view3.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.ef, context5));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 3;
        view3.setLayoutParams(layoutParams3);
        view3.setVisibility(4);
        this.LLILIL = view3;
        View view4 = new View(getContext());
        Context context6 = view4.getContext();
        o.LJIIIIZZ(context6, "getContext()");
        view4.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.ef, context6));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 5;
        view4.setLayoutParams(layoutParams4);
        view4.setVisibility(4);
        this.LLILL = view4;
        addView(c1555868s);
        if (textStickerInitConfig.LIZ) {
            addView(view);
            addView(view2);
            addView(view3);
            addView(view4);
        }
        post(new ARunnableS38S0100000_2(this, 139));
        C67T c67t = this.LJZI;
        c67t.LJIJI = null;
        c67t.LJIIJ = 1000;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View child, int i, int i2, int i3, int i4) {
        o.LJIIIZ(child, "child");
        if (o.LJ(child, this.LLIIZ)) {
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            child.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i3) - ((((getPaddingBottom() + getPaddingTop()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4)), 0));
            return;
        }
        super.measureChildWithMargins(child, i, i2, i3, i4);
    }
}
