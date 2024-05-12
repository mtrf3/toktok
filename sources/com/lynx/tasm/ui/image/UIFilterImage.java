package com.lynx.tasm.ui.image;

import X.AbstractC81686W4c;
import X.C79707VPz;
import X.V9O;
import X.V9P;
import X.VNU;
import X.VPD;
import X.VPR;
import X.W5I;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.utils.ColorUtils;

/* loaded from: classes15.dex */
public class UIFilterImage extends UIImage<V9O> {
    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        ((V9O) this.mView).markShadowDirty();
    }

    public UIFilterImage(VNU vnu) {
        super(vnu);
    }

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.LynxUI
    public final V9P createView(Context context) {
        this.mDraweeControllerBuilder = W5I.LIZJ();
        AbstractC81686W4c abstractC81686W4c = this.mDraweeControllerBuilder;
        this.mContext.getClass();
        V9O v9o = new V9O(context, abstractC81686W4c, null, null);
        v9o.setImageLoaderCallback(new C79707VPz(this));
        return v9o;
    }

    @VPD(name = "drop-shadow")
    public void setDropShadow(String str) {
        if (str == null) {
            ((V9O) this.mView).setShadowOffsetX(0);
            ((V9O) this.mView).setShadowOffsetY(0);
            ((V9O) this.mView).setShadowColor(0);
            ((V9O) this.mView).setShadowRadius(0);
            return;
        }
        String[] split = str.split(" +");
        try {
            if (split.length == 4) {
                UIBody uIBody = this.mContext.LJLJLLL;
                ((V9O) this.mView).setShadowOffsetX(Math.round(VPR.LIZLLL(split[0], uIBody.mFontSize, this.mFontSize, uIBody.getWidth(), uIBody.getHeight(), 0.0f, this.mContext.LJLZ)));
                ((V9O) this.mView).setShadowOffsetY(Math.round(VPR.LIZLLL(split[1], uIBody.mFontSize, this.mFontSize, uIBody.getWidth(), uIBody.getHeight(), 0.0f, this.mContext.LJLZ)));
                ((V9O) this.mView).setShadowRadius(Math.round(VPR.LIZLLL(split[2], uIBody.mFontSize, this.mFontSize, uIBody.getWidth(), uIBody.getHeight(), 0.0f, this.mContext.LJLZ)));
                ((V9O) this.mView).setShadowColor(ColorUtils.LIZ(split[3]));
                return;
            }
        } catch (Exception unused) {
            if (1 == 0) {
                return;
            }
        }
        LLog.LIZLLL(3, "UIShadowImage", "Parse error for drop-shadow!");
    }

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        this.mDraweeControllerBuilder = W5I.LIZJ();
        AbstractC81686W4c abstractC81686W4c = this.mDraweeControllerBuilder;
        this.mContext.getClass();
        V9O v9o = new V9O(context, abstractC81686W4c, null, null);
        v9o.setImageLoaderCallback(new C79707VPz(this));
        return v9o;
    }
}
