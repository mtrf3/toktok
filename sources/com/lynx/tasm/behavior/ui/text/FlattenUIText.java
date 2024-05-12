package com.lynx.tasm.behavior.ui.text;

import X.AbstractC79742VRi;
import X.C79681VOz;
import X.C79741VRh;
import X.VNA;
import X.VNU;
import X.VPL;
import X.VPY;
import X.VRS;
import X.VRT;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import java.util.Map;

/* loaded from: classes15.dex */
public class FlattenUIText extends LynxFlattenUI implements VPL {
    public Layout LJLIL;
    public float LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final C79681VOz LJLJJLL;

    public final CharSequence LJIJJLI() {
        Layout layout = this.LJLIL;
        if (layout != null) {
            return layout.getText();
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        if (this.LJLJI && (LJIJJLI() instanceof Spanned)) {
            AbstractC79742VRi.LJII((Spanned) LJIJJLI(), null);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final CharSequence getAccessibilityLabel() {
        CharSequence accessibilityLabel = super.getAccessibilityLabel();
        if (!TextUtils.isEmpty(accessibilityLabel)) {
            return accessibilityLabel;
        }
        return LJIJJLI();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        invalidate();
    }

    @Override // X.VPL
    public final Layout LJIILIIL() {
        return this.LJLIL;
    }

    public FlattenUIText(VNU vnu) {
        super(vnu);
        this.LJLJJLL = new C79681VOz(this);
        this.mAccessibilityElementStatus = 1;
        if (this.mContext.LLFF) {
            this.mOverflow = 3;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI
    public final void onDraw(Canvas canvas) {
        TraceEvent.LIZIZ("text.FlattenUIText.onDraw");
        super.onDraw(canvas);
        if (this.LJLIL == null) {
            TraceEvent.LJ("text.FlattenUIText.onDraw");
            return;
        }
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        int i3 = this.mPaddingTop + this.mBorderTopWidth;
        int i4 = this.mPaddingBottom + this.mBorderBottomWidth;
        canvas.save();
        if (getOverflow() != 0) {
            Rect boundRectForOverflow = getBoundRectForOverflow();
            if (boundRectForOverflow != null) {
                canvas.clipRect(boundRectForOverflow);
            }
        } else if (!this.mContext.LLFF) {
            canvas.clipRect(i, i3, getWidth() - i2, getHeight() - i4);
        }
        canvas.translate(i + this.LJLILLLLZI, i3);
        if (this.LJLJJL && Build.VERSION.SDK_INT < 26) {
            C79741VRh.LIZJ(canvas, this.LJLIL, (getWidth() - i) - i2);
        } else {
            this.LJLIL.draw(canvas);
        }
        if (this.LJLJJI) {
            C79741VRh.LIZLLL(canvas, this.LJLIL);
        }
        canvas.restore();
        C79741VRh.LIZIZ(canvas, this.LJLIL);
        TraceEvent.LJ("text.FlattenUIText.onDraw");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        if (obj instanceof VRS) {
            VRS vrs = (VRS) obj;
            if (this.LJLJI && (LJIJJLI() instanceof Spanned)) {
                Spanned spanned = (Spanned) LJIJJLI();
                for (AbstractC79742VRi abstractC79742VRi : (AbstractC79742VRi[]) spanned.getSpans(0, spanned.length(), AbstractC79742VRi.class)) {
                    abstractC79742VRi.LJ();
                    abstractC79742VRi.LJIIIIZZ(null);
                }
            }
            this.LJLIL = vrs.LIZJ;
            this.LJLILLLLZI = vrs.LJFF;
            boolean z = vrs.LIZ;
            this.LJLJI = z;
            this.LJLJJI = vrs.LJI;
            this.LJLJJL = vrs.LIZIZ;
            if (z && (LJIJJLI() instanceof Spanned)) {
                AbstractC79742VRi.LJII((Spanned) LJIJJLI(), this.LJLJJLL);
            }
            invalidate();
            VRT.LIZ(vrs, this);
        }
        Map<String, VNA> map = this.mEvents;
        if (map == null || !map.containsKey("layout") || this.LJLIL == null) {
            return;
        }
        this.mContext.LJLJJL.LIZIZ(VRT.LIZIZ(getSign(), this.LJLIL));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final VPY hitTest(float f, float f2) {
        float f3 = f - this.mPaddingLeft;
        float f4 = f2 - this.mPaddingTop;
        Spanned spanned = null;
        if (this.mContext.LLIIIZ) {
            Layout layout = this.LJLIL;
            if (layout != null && (layout.getText() instanceof Spanned)) {
                spanned = (Spanned) layout.getText();
            }
            return VRT.LIZLLL(this, f3, f4, this, layout, spanned, this.LJLILLLLZI, this.mContext.LLF);
        }
        Layout layout2 = this.LJLIL;
        if (layout2 != null && (layout2.getText() instanceof Spanned)) {
            spanned = (Spanned) layout2.getText();
        }
        return VRT.LIZJ(this, f3, f4, this, layout2, spanned);
    }
}
