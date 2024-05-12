package X;

import Y.IDObjectS175S0100000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextCoverConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WH4 extends C19K {
    public InnerEffectTextConfig LJLJJLL;
    public final Paint LJLJL;
    public final List<C157166Eu> LJLJLJ;
    public final List<TextPaint> LJLJLLL;
    public final List<W1T> LJLL;
    public final C74244TBw LJLLI;
    public final C0W8 LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public final C64962gm LJLLLL;
    public final Paint.FontMetrics LJLLLLLL;

    public final InnerEffectTextConfig getInnerTextConfig() {
        return this.LJLJJLL;
    }

    public final int getMaxViewWidth() {
        return this.LJLLL;
    }

    public final void LJI(Canvas canvas) {
        Layout layout;
        if (canvas != null && (layout = getLayout()) != null) {
            Iterator it = ((ArrayList) this.LJLJLJ).iterator();
            while (it.hasNext()) {
                C157166Eu c157166Eu = (C157166Eu) it.next();
                for (TextPaint textPaint : (Iterable) c157166Eu.LJLJI) {
                    C74244TBw c74244TBw = this.LJLLI;
                    String valueOf = String.valueOf(getText());
                    int width = layout.getWidth();
                    Layout.Alignment alignment = layout.getAlignment();
                    o.LJIIIIZZ(alignment, "finalLayout.alignment");
                    C86793Y4n.LJIILJJIL(C74244TBw.LIZ(c74244TBw, valueOf, textPaint, width, alignment, layout.getSpacingMultiplier(), layout.getSpacingAdd(), layout.getEllipsizedWidth()), canvas, ((InnerEffectTextCoverConfig) c157166Eu.LJLIL).getOffsetX(), ((InnerEffectTextCoverConfig) c157166Eu.LJLIL).getOffsetY());
                }
                C74244TBw c74244TBw2 = this.LJLLI;
                String valueOf2 = String.valueOf(getText());
                TextPaint textPaint2 = (TextPaint) c157166Eu.LJLILLLLZI;
                int width2 = layout.getWidth();
                Layout.Alignment alignment2 = layout.getAlignment();
                o.LJIIIIZZ(alignment2, "finalLayout.alignment");
                StaticLayout LIZ = C74244TBw.LIZ(c74244TBw2, valueOf2, textPaint2, width2, alignment2, layout.getSpacingMultiplier(), layout.getSpacingAdd(), layout.getEllipsizedWidth());
                LJIIIIZZ((TextPaint) c157166Eu.LJLILLLLZI, ((InnerEffectTextCoverConfig) c157166Eu.LJLIL).getTextColorStart(), ((InnerEffectTextCoverConfig) c157166Eu.LJLIL).getTextColorEnd(), ((InnerEffectTextCoverConfig) c157166Eu.LJLIL).getGradientType(), ((InnerEffectTextCoverConfig) c157166Eu.LJLIL).getGradientOrientation(), LIZ.getWidth(), LIZ.getHeight());
                C86793Y4n.LJIILJJIL(LIZ, canvas, ((InnerEffectTextCoverConfig) c157166Eu.LJLIL).getOffsetX(), ((InnerEffectTextCoverConfig) c157166Eu.LJLIL).getOffsetY());
            }
        }
    }

    public final void LJII(Canvas canvas) {
        Layout layout;
        if (canvas != null && (layout = getLayout()) != null) {
            Iterator it = ((ArrayList) this.LJLJLLL).iterator();
            while (it.hasNext()) {
                TextPaint textPaint = (TextPaint) it.next();
                C74244TBw c74244TBw = this.LJLLI;
                String valueOf = String.valueOf(getText());
                int width = layout.getWidth();
                Layout.Alignment alignment = layout.getAlignment();
                o.LJIIIIZZ(alignment, "finalLayout.alignment");
                C86793Y4n.LJIILJJIL(C74244TBw.LIZ(c74244TBw, valueOf, textPaint, width, alignment, layout.getSpacingMultiplier(), layout.getSpacingAdd(), layout.getEllipsizedWidth()), canvas, 0.0f, 0.0f);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Layout layout;
        if (this.LJLJJLL != null) {
            if (canvas != null) {
                Iterator it = ((ArrayList) this.LJLL).iterator();
                while (it.hasNext()) {
                    W1T w1t = (W1T) it.next();
                    NinePatch ninePatch = (NinePatch) w1t.LJLJI;
                    if (ninePatch != null) {
                        ninePatch.draw(canvas, (Rect) w1t.LJLJJI);
                        if (C76800UCe.LIZ == null) {
                        }
                    }
                    canvas.drawBitmap((Bitmap) w1t.LJLILLLLZI, (Rect) null, (Rect) w1t.LJLJJI, this.LJLJL);
                }
            }
            getPaint().getFontMetrics(this.LJLLLLLL);
            if (canvas != null) {
                float paddingLeft = getPaddingLeft();
                float baseline = getBaseline() + this.LJLLLLLL.top;
                int save = canvas.save();
                canvas.translate(paddingLeft, baseline);
                try {
                    LJI(canvas);
                    LJII(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
        InnerEffectTextConfig innerEffectTextConfig = this.LJLJJLL;
        if (innerEffectTextConfig != null && innerEffectTextConfig.getGradientType() != WHB.NONE && (layout = getLayout()) != null) {
            TextPaint paint = getPaint();
            o.LJIIIIZZ(paint, "paint");
            LJIIIIZZ(paint, innerEffectTextConfig.getTextColorStart(), innerEffectTextConfig.getTextColorEnd(), innerEffectTextConfig.getGradientType(), innerEffectTextConfig.getGradientOrientation(), layout.getWidth(), layout.getHeight());
        }
        super.onDraw(canvas);
    }

    public final void setInnerTextConfig(InnerEffectTextConfig innerEffectTextConfig) {
        List<InnerEffectTextStrokeConfig> strokeConfigs;
        List<InnerEffectTextCoverConfig> coverConfigs;
        String str;
        if (!o.LJ(this.LJLJJLL, innerEffectTextConfig)) {
            this.LJLJJLL = innerEffectTextConfig;
            this.LJLLJ = 1;
            TextPaint paint = getPaint();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            paint.setTextSize(C44729Hgz.LJIIL(context, 28.0f));
            getPaint().setTypeface(null);
            getPaint().setStyle(Paint.Style.FILL);
            setTextColor(0);
            setPadding(0, 0, 0, 0);
            C16360ka.LJJ(this, 0.0f);
            setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            setLineSpacing(0.0f, 1.0f);
            setLetterSpacing(0.0f);
            setBackground(null);
            setGravity(17);
            setHint(" ");
            setMinWidth(0);
            setMinHeight(0);
            ((ArrayList) this.LJLJLJ).clear();
            ((ArrayList) this.LJLJLLL).clear();
            Iterator it = ((ArrayList) this.LJLL).iterator();
            while (it.hasNext()) {
                ((Bitmap) ((W1T) it.next()).LJLILLLLZI).recycle();
            }
            ((ArrayList) this.LJLL).clear();
            InnerEffectTextConfig innerEffectTextConfig2 = this.LJLJJLL;
            if (innerEffectTextConfig2 != null) {
                this.LJLLJ = innerEffectTextConfig2.getMaxLine();
                getPaint().setTextSize(innerEffectTextConfig2.getTextSize());
                try {
                    OSZ<String, String> typefacePath = innerEffectTextConfig2.getTypefacePath();
                    if (typefacePath != null) {
                        str = typefacePath.getSecond();
                    } else {
                        str = null;
                    }
                    getPaint().setTypeface(C16880lQ.LJJLIIIJLLLLLLLZ(str));
                } catch (Exception e) {
                    InterfaceC1554368d LIZJ = C6PB.LIZJ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("EffectEditText --- ");
                    LIZ.append(android.util.Log.getStackTraceString(e));
                    LIZJ.LIZ(X1D.LIZIZ(LIZ));
                }
                getPaint().setStyle(innerEffectTextConfig2.getPaintStyle());
                if (innerEffectTextConfig2.getGradientType() == WHB.NONE) {
                    setTextColor(innerEffectTextConfig2.getTextColorStart());
                }
                setPadding(innerEffectTextConfig2.getPaddingStart(), innerEffectTextConfig2.getPaddingTop(), innerEffectTextConfig2.getPaddingEnd(), innerEffectTextConfig2.getPaddingBottom());
                C16360ka.LJJ(this, innerEffectTextConfig2.getLayerWeight());
                InnerEffectTextShadowConfig shadowConfig = innerEffectTextConfig2.getShadowConfig();
                if (shadowConfig != null) {
                    setShadowLayer(shadowConfig.getRadius(), shadowConfig.getOffsetX(), shadowConfig.getOffsetY(), shadowConfig.getColor());
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    setFallbackLineSpacing(false);
                }
                setLineSpacing(innerEffectTextConfig2.getSpacingAdd(), innerEffectTextConfig2.getSpacingMult());
                setLetterSpacing(innerEffectTextConfig2.getSpacingLetter());
                setBackground(null);
                setGravity(innerEffectTextConfig2.getGravity());
                setHint(" ");
                setHintTextColor(innerEffectTextConfig2.getReplaceStringColor());
                setMinWidth(innerEffectTextConfig2.getMinWidth());
                setMinHeight(innerEffectTextConfig2.getMinHeight());
            }
            InnerEffectTextConfig innerEffectTextConfig3 = this.LJLJJLL;
            if (innerEffectTextConfig3 != null && (coverConfigs = innerEffectTextConfig3.getCoverConfigs()) != null) {
                for (InnerEffectTextCoverConfig innerEffectTextCoverConfig : coverConfigs) {
                    TextPaint textPaint = new TextPaint();
                    textPaint.set(getPaint());
                    textPaint.setStyle(innerEffectTextCoverConfig.getPaintStyle());
                    InnerEffectTextShadowConfig shadowConfig2 = innerEffectTextCoverConfig.getShadowConfig();
                    if (shadowConfig2 != null) {
                        textPaint.setShadowLayer(shadowConfig2.getRadius(), shadowConfig2.getOffsetX(), shadowConfig2.getOffsetY(), shadowConfig2.getColor());
                    }
                    ArrayList arrayList = new ArrayList();
                    for (InnerEffectTextStrokeConfig innerEffectTextStrokeConfig : innerEffectTextCoverConfig.getStrokeConfigs()) {
                        TextPaint textPaint2 = new TextPaint();
                        textPaint2.set(textPaint);
                        textPaint2.setStrokeWidth(innerEffectTextStrokeConfig.getStrokeWidth() * 2);
                        textPaint2.setColor(innerEffectTextStrokeConfig.getStrokeColor());
                        textPaint2.setStrokeJoin(innerEffectTextStrokeConfig.getStrokeJoin());
                        textPaint2.setStyle(Paint.Style.STROKE);
                        arrayList.add(textPaint2);
                    }
                    ((ArrayList) this.LJLJLJ).add(new C157166Eu(innerEffectTextCoverConfig, textPaint, arrayList));
                }
            }
            InnerEffectTextConfig innerEffectTextConfig4 = this.LJLJJLL;
            if (innerEffectTextConfig4 != null && (strokeConfigs = innerEffectTextConfig4.getStrokeConfigs()) != null) {
                for (InnerEffectTextStrokeConfig innerEffectTextStrokeConfig2 : strokeConfigs) {
                    TextPaint textPaint3 = new TextPaint();
                    textPaint3.set(getPaint());
                    textPaint3.setStrokeWidth(innerEffectTextStrokeConfig2.getStrokeWidth() * 2);
                    textPaint3.setColor(innerEffectTextStrokeConfig2.getStrokeColor());
                    textPaint3.setStrokeJoin(innerEffectTextStrokeConfig2.getStrokeJoin());
                    textPaint3.setStyle(Paint.Style.STROKE);
                    ((ArrayList) this.LJLJLLL).add(textPaint3);
                }
            }
            XKX.LIZLLL(this.LJLLLL, null, null, new ETH(this, null), 3);
            requestLayout();
        }
    }

    public final void setMaxViewWidth(int i) {
        if (i > 0) {
            this.LJLLL = i;
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        if (i > 0) {
            super.setMaxWidth(i);
        }
    }

    public final void setTextColor(boolean z) {
        InnerEffectTextConfig innerEffectTextConfig = this.LJLJJLL;
        if (innerEffectTextConfig != null) {
            if (z) {
                setTextColor(innerEffectTextConfig.getReplaceStringColor());
            } else {
                if (innerEffectTextConfig.getGradientType() != WHB.NONE) {
                    return;
                }
                setTextColor(innerEffectTextConfig.getTextColorStart());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WH4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        this.LJLJL = new Paint(3);
        this.LJLJLJ = new ArrayList();
        this.LJLJLLL = new ArrayList();
        this.LJLL = new ArrayList();
        this.LJLLI = new C74244TBw();
        this.LJLLILLLL = new C0W8();
        this.LJLLJ = 1;
        this.LJLLL = getMaxWidth();
        this.LJLLLL = u.LJFF();
        addTextChangedListener(new IDObjectS175S0100000_2(this, 10));
        this.LJLLLLLL = new Paint.FontMetrics();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Iterator it = ((ArrayList) this.LJLL).iterator();
        while (it.hasNext()) {
            W1T w1t = (W1T) it.next();
            InnerEffectTextBgConfig innerEffectTextBgConfig = (InnerEffectTextBgConfig) w1t.LJLIL;
            Rect rect = (Rect) w1t.LJLJJI;
            WHC dimensionModeWidth = innerEffectTextBgConfig.getDimensionModeWidth();
            int[] iArr = WHA.LIZJ;
            if (iArr[dimensionModeWidth.ordinal()] == 1) {
                WHE whe = WH5.Companion;
                int gravity = innerEffectTextBgConfig.getGravity();
                whe.getClass();
                WH5 wh5 = WH5.LEFT;
                if ((wh5.getGravity() & gravity) == wh5.getGravity()) {
                    WH5 wh52 = WH5.RIGHT;
                    if ((gravity & wh52.getGravity()) != wh52.getGravity()) {
                        rect.set(innerEffectTextBgConfig.getMarginStart(), rect.top, innerEffectTextBgConfig.getWidth() + innerEffectTextBgConfig.getMarginStart(), rect.bottom);
                    }
                }
                int gravity2 = innerEffectTextBgConfig.getGravity();
                if ((wh5.getGravity() & gravity2) == wh5.getGravity()) {
                    WH5 wh53 = WH5.RIGHT;
                    if ((gravity2 & wh53.getGravity()) == wh53.getGravity()) {
                        int width = (measuredWidth - innerEffectTextBgConfig.getWidth()) / 2;
                        rect.set(width, rect.top, innerEffectTextBgConfig.getWidth() + width, rect.bottom);
                    }
                }
                int gravity3 = innerEffectTextBgConfig.getGravity();
                if ((wh5.getGravity() & gravity3) != wh5.getGravity()) {
                    WH5 wh54 = WH5.RIGHT;
                    if ((gravity3 & wh54.getGravity()) == wh54.getGravity()) {
                        rect.set((measuredWidth - innerEffectTextBgConfig.getWidth()) - innerEffectTextBgConfig.getMarginEnd(), rect.top, measuredWidth - innerEffectTextBgConfig.getMarginEnd(), rect.bottom);
                    }
                }
                rect.set(innerEffectTextBgConfig.getMarginStart(), rect.top, innerEffectTextBgConfig.getWidth() + innerEffectTextBgConfig.getMarginStart(), rect.bottom);
            } else {
                rect.set(innerEffectTextBgConfig.getMarginStart(), rect.top, measuredWidth - innerEffectTextBgConfig.getMarginEnd(), rect.bottom);
            }
            if (iArr[innerEffectTextBgConfig.getDimensionModeHeight().ordinal()] == 1) {
                WHE whe2 = WH5.Companion;
                int gravity4 = innerEffectTextBgConfig.getGravity();
                whe2.getClass();
                WH5 wh55 = WH5.TOP;
                if ((wh55.getGravity() & gravity4) == wh55.getGravity()) {
                    WH5 wh56 = WH5.BOTTOM;
                    if ((gravity4 & wh56.getGravity()) != wh56.getGravity()) {
                        rect.set(rect.left, innerEffectTextBgConfig.getMarginTop(), rect.right, innerEffectTextBgConfig.getHeight() + innerEffectTextBgConfig.getMarginTop());
                    }
                }
                int gravity5 = innerEffectTextBgConfig.getGravity();
                if ((wh55.getGravity() & gravity5) == wh55.getGravity()) {
                    WH5 wh57 = WH5.BOTTOM;
                    if ((gravity5 & wh57.getGravity()) == wh57.getGravity()) {
                        int height = (measuredHeight - innerEffectTextBgConfig.getHeight()) / 2;
                        rect.set(rect.left, height, rect.right, innerEffectTextBgConfig.getHeight() + height);
                    }
                }
                int gravity6 = innerEffectTextBgConfig.getGravity();
                if ((wh55.getGravity() & gravity6) != wh55.getGravity()) {
                    WH5 wh58 = WH5.BOTTOM;
                    if ((gravity6 & wh58.getGravity()) == wh58.getGravity()) {
                        rect.set(rect.left, (measuredHeight - innerEffectTextBgConfig.getHeight()) - innerEffectTextBgConfig.getMarginBottom(), rect.right, measuredHeight - innerEffectTextBgConfig.getMarginBottom());
                    }
                }
                rect.set(rect.left, innerEffectTextBgConfig.getMarginTop(), rect.right, innerEffectTextBgConfig.getHeight() + innerEffectTextBgConfig.getMarginTop());
            } else {
                rect.set(rect.left, innerEffectTextBgConfig.getMarginTop(), rect.right, measuredHeight - innerEffectTextBgConfig.getMarginBottom());
            }
        }
    }

    public final void LJIIIIZZ(TextPaint textPaint, int i, int i2, WHB whb, WH9 wh9, int i3, int i4) {
        int i5 = WHA.LIZIZ[whb.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                return;
            }
            textPaint.setColor(i);
            return;
        }
        int i6 = WHA.LIZ[wh9.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                return;
            }
            textPaint.setShader(this.LJLLILLLL.LIZ(i, i2, i3, 0));
            return;
        }
        textPaint.setShader(this.LJLLILLLL.LIZ(i, i2, 0, i4));
    }
}
