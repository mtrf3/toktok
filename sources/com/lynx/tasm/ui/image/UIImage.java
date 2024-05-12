package com.lynx.tasm.ui.image;

import X.AbstractC81686W4c;
import X.C78731Uv9;
import X.EWS;
import X.EnumC78943UyZ;
import X.F5B;
import X.V9P;
import X.VNU;
import X.VPD;
import X.VPR;
import X.VQ0;
import X.VQ6;
import X.VQB;
import X.VQG;
import X.VQJ;
import X.VQK;
import X.VQL;
import X.W5I;
import android.content.Context;
import android.text.TextUtils;
import com.lynx.tasm.behavior.ui.image.AbsUIImage;

/* loaded from: classes15.dex */
public class UIImage<T extends V9P> extends AbsUIImage<T> {
    public AbstractC81686W4c mDraweeControllerBuilder;
    public boolean mHasPendingPlaceholder;
    public boolean mHasPendingSource;
    public int mImageDstHeight;
    public int mImageDstWidth;
    public boolean mIsNoSubSampleMode;
    public String mOriginPlaceholder;
    public boolean mPendingLoad;
    public int mScrollState;
    public VQG mScrollStateChangeListener;
    public boolean mSkipRedirection;
    public String mSources;
    public boolean mSuspendable;

    public void reloadImage() {
        if (this.mSuspendable && this.mScrollState != 0) {
            this.mPendingLoad = true;
        } else {
            ((V9P) this.mView).maybeUpdateView();
        }
    }

    @EWS
    public void startAnimate() {
        T t = this.mView;
        if (t != 0) {
            ((V9P) t).stopAnimate();
            ((V9P) this.mView).startAnimate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        ((V9P) this.mView).destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        ((V9P) this.mView).destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        int i3 = this.mPaddingTop + this.mBorderTopWidth;
        int i4 = this.mPaddingBottom + this.mBorderBottomWidth;
        if ((this.mImageDstWidth < getWidth() || this.mImageDstHeight < getHeight()) && !hasAnimationRunning()) {
            ((V9P) this.mView).markDirty();
        }
        this.mView.setPadding(i, i3, i2, i4);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onPropsUpdated() {
        super.onPropsUpdated();
        if (!this.mSkipRedirection && this.mHasPendingPlaceholder && this.mHasPendingSource) {
            ((V9P) this.mView).setRedirectImageSource(this.mSources, this.mOriginPlaceholder);
            this.mView.invalidate();
            this.mHasPendingSource = false;
            this.mHasPendingPlaceholder = false;
        }
        if (this.mHasPendingSource) {
            if (this.mSkipRedirection) {
                ((V9P) this.mView).setSrcSkippingRedirection(this.mSources);
            } else {
                ((V9P) this.mView).setSrc(this.mSources);
                this.mView.invalidate();
            }
            this.mHasPendingSource = false;
        }
        if (this.mHasPendingPlaceholder) {
            this.mHasPendingPlaceholder = false;
            ((V9P) this.mView).setPlaceholder(this.mOriginPlaceholder, !this.mSkipRedirection);
        }
        reloadImage();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void renderIfNeeded() {
        reloadImage();
    }

    public UIImage(Context context) {
        this((VNU) context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public T createView(Context context) {
        this.mDraweeControllerBuilder = W5I.LIZJ();
        AbstractC81686W4c abstractC81686W4c = this.mDraweeControllerBuilder;
        this.mContext.getClass();
        T t = (T) new V9P(context, abstractC81686W4c, null, null);
        t.setNoSubSampleMode(this.mIsNoSubSampleMode);
        t.setLynxBaseUI(this);
        t.setImageLoaderCallback(new VQ0(this));
        t.setImageRedirectListener(new VQL(this));
        return t;
    }

    @VPD(name = "fix-fresco-bug")
    public void fixFrescoWebPBug(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((V9P) t).fixFrescoWebPBug(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onBorderRadiusUpdated(int i) {
        ((V9P) this.mView).setBorderRadius(this.mLynxBackground.LIZIZ());
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setAutoSize(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((V9P) t).setAutoSize(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setBlurRadius(String str) {
        ((V9P) this.mView).setBlurRadius(Math.round(VPR.LIZLLL(str, this.mContext.LJLJLLL.mFontSize, this.mFontSize, r2.getWidth(), r2.getHeight(), 0.0f, this.mContext.LJLZ)));
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setCapInsets(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            ((V9P) this.mView).setCapInsets(null);
        } else {
            ((V9P) this.mView).setCapInsets(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    @VPD(name = "cap-insets")
    public void setCapInsetsBackUp(String str) {
        setCapInsets(str);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    @VPD(name = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            ((V9P) this.mView).setCapInsetsScale(null);
        } else {
            ((V9P) this.mView).setCapInsetsScale(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setCoverStart(boolean z) {
        ((V9P) this.mView).setCoverStart(z);
    }

    @VPD(defaultBoolean = false, name = "defer-src-invalidation")
    public void setDeferInvalidation(boolean z) {
        ((V9P) this.mView).setDeferInvalidation(z);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setDisableDefaultPlaceholder(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((V9P) t).setDisableDefaultPlaceHolder(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setDisableDefaultResize(boolean z) {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        if (z) {
            ((V9P) t).setResizeMethod(EnumC78943UyZ.SCALE);
        } else {
            ((V9P) t).setResizeMethod(EnumC78943UyZ.RESIZE);
        }
    }

    @VPD(name = "fresco-attach")
    public void setFrescoAttach(String str) {
        if (str != null) {
            if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes")) {
                T t = this.mView;
                ((V9P) t).mIsFrescoAttach = true;
                ((V9P) t).setFrescoAttach();
            }
        }
    }

    @VPD(defaultBoolean = false, name = "fresco-nine-patch")
    public void setFrescoNinePatch(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((V9P) t).setFrescoNinePatch(z);
        }
    }

    @VPD(name = "fresco-visible")
    public void setFrescoVisible(String str) {
        if (str != null) {
            if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes")) {
                T t = this.mView;
                ((V9P) t).mIsFrescoVisible = true;
                ((V9P) t).setFrescoVisible();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @VPD(name = "image-config")
    public void setImageConfig(String str) {
        super.setImageConfig(str);
        ((V9P) this.mView).setBitmapConfig(this.mBitmapConfig);
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setLocalCache(F5B f5b) {
        super.setLocalCache(f5b);
        if (this.mView == 0) {
            return;
        }
        VQB LIZ = VQ6.LIZ(f5b);
        boolean z = LIZ.LIZ;
        boolean z2 = LIZ.LIZIZ;
        ((V9P) this.mView).setLocalCache(z);
        ((V9P) this.mView).setAwaitLocalCache(z2);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setLoopCount(int i) {
        if (i <= 0) {
            i = 0;
        }
        ((V9P) this.mView).setLoopCount(i);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setObjectFit(String str) {
        ((V9P) this.mView).setScaleType(C78731Uv9.LIZ(str));
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setPlaceholder(String str) {
        this.mHasPendingPlaceholder = true;
        this.mOriginPlaceholder = str;
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setPreFetchHeight(String str) {
        ((V9P) this.mView).setPreFetchHeight(VPR.LIZLLL(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.LJLZ));
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setPreFetchWidth(String str) {
        ((V9P) this.mView).setPreFetchWidth(VPR.LIZLLL(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.LJLZ));
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setRepeat(boolean z) {
        ((V9P) this.mView).setRepeat(z);
    }

    @VPD(defaultBoolean = false, name = "skip-redirection")
    public void setSkipRedirection(boolean z) {
        this.mSkipRedirection = z;
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setSource(String str) {
        this.mSources = str;
        this.mHasPendingSource = true;
    }

    @VPD(name = "subsample")
    public void setSubSample(String str) {
        if (str != null && (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("no"))) {
            this.mIsNoSubSampleMode = true;
        } else {
            this.mIsNoSubSampleMode = false;
        }
        T t = this.mView;
        if (t != 0) {
            ((V9P) t).setNoSubSampleMode(this.mIsNoSubSampleMode);
        }
    }

    @VPD(name = "suspendable")
    public void setSuspendable(F5B f5b) {
        this.mSuspendable = false;
        if (f5b != null) {
            int i = VQJ.LIZ[f5b.getType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.mSuspendable = TextUtils.equals("true", f5b.asString());
                }
            } else {
                this.mSuspendable = f5b.asBoolean();
            }
        }
        if (!this.mSuspendable) {
            unRegisterScrollStateListener(this.mScrollStateChangeListener);
            return;
        }
        if (this.mScrollStateChangeListener == null) {
            this.mScrollStateChangeListener = new VQK(this);
        }
        registerScrollStateListener(this.mScrollStateChangeListener);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    @VPD(name = "visibility")
    public void setVisibility(int i) {
        super.setVisibility(i);
        T t = this.mView;
        if (((V9P) t).mIsFrescoVisible) {
            ((V9P) t).setFrescoVisible();
        }
    }

    public UIImage(VNU vnu) {
        super(vnu);
    }

    public void setLocalCache(Boolean bool) {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        if (bool == null) {
            ((V9P) t).setLocalCache(false);
        }
        ((V9P) this.mView).setLocalCache(bool.booleanValue());
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onBeforeAnimation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > this.mImageDstWidth || i4 > this.mImageDstHeight) {
            ((V9P) this.mView).tryFetchImage(i3, i4, i5, i6, i7, i8);
        }
    }
}
