package com.lynx.tasm.behavior.ui.text;

import X.F5B;
import X.VNA;
import X.VNU;
import X.VPD;
import X.VPL;
import X.VPY;
import X.VRS;
import X.VRT;
import X.VS2;
import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import com.lynx.tasm.behavior.ui.UIGroup;
import java.util.Map;

/* loaded from: classes15.dex */
public class UIText extends UIGroup<VS2> implements VPL {
    @Override // X.VPL
    public final Layout LJIILIIL() {
        T t = this.mView;
        if (t == 0) {
            return null;
        }
        return ((VS2) t).getTextLayout();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        ((VS2) this.mView).release();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final CharSequence getAccessibilityLabel() {
        CharSequence accessibilityLabel = super.getAccessibilityLabel();
        if (!TextUtils.isEmpty(accessibilityLabel)) {
            return accessibilityLabel;
        }
        return ((VS2) this.mView).getText();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        this.mView.setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    public UIText(VNU vnu) {
        super(vnu);
        this.mAccessibilityElementStatus = 1;
        if (this.mContext.LLFF) {
            this.mOverflow = 3;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    /* renamed from: LJIJJLI, reason: merged with bridge method [inline-methods] */
    public VS2 createView(Context context) {
        return new VS2(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    @VPD(name = "accessibility-label")
    public void setAccessibilityLabel(F5B f5b) {
        super.setAccessibilityLabel(f5b);
        T t = this.mView;
        if (t != 0) {
            t.setFocusable(true);
            this.mView.setContentDescription(getAccessibilityLabel());
        }
    }

    @VPD(defaultBoolean = false, name = "text-selection")
    public void setEnableTextSelection(boolean z) {
        ((VS2) this.mView).setEnableTextSelection(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        if (obj instanceof VRS) {
            VRS vrs = (VRS) obj;
            ((VS2) this.mView).setTextBundle(vrs);
            VRT.LIZ(vrs, this);
        }
        Map<String, VNA> map = this.mEvents;
        if (map == null || !map.containsKey("layout") || LJIILIIL() == null) {
            return;
        }
        this.mContext.LJLJJL.LIZIZ(VRT.LIZIZ(getSign(), LJIILIIL()));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final VPY hitTest(float f, float f2) {
        T t = this.mView;
        if (t == 0) {
            return this;
        }
        float f3 = f - this.mPaddingLeft;
        float f4 = f2 - this.mPaddingTop;
        Spanned spanned = null;
        if (this.mContext.LLIIIZ) {
            VS2 vs2 = (VS2) t;
            Layout layout = vs2.mTextLayout;
            if (vs2.getText() instanceof Spanned) {
                spanned = (Spanned) vs2.getText();
            }
            return VRT.LIZLLL(this, f3, f4, this, layout, spanned, ((VS2) this.mView).mTextTranslateOffset, this.mContext.LLF);
        }
        VS2 vs22 = (VS2) t;
        Layout layout2 = vs22.mTextLayout;
        if (vs22.getText() instanceof Spanned) {
            spanned = (Spanned) vs22.getText();
        }
        return VRT.LIZJ(this, f3, f4, this, layout2, spanned);
    }
}
