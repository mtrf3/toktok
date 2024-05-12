package com.lynx.tasm.ui.image;

import X.AbstractC78707Uul;
import X.C117434jD;
import X.C13870gZ;
import X.C16880lQ;
import X.C78731Uv9;
import X.C78732UvA;
import X.C78747UvP;
import X.C79285V9t;
import X.C79411VEp;
import X.C81250Vug;
import X.C81392Vwy;
import X.C81705W4v;
import X.EWS;
import X.EnumC78943UyZ;
import X.F5B;
import X.InterfaceC78716Uuu;
import X.InterfaceC81252Vui;
import X.V92;
import X.V9C;
import X.V9H;
import X.V9R;
import X.V9U;
import X.VNU;
import X.VPD;
import X.VPH;
import X.VPR;
import X.VQ1;
import X.VQ6;
import X.VQB;
import X.VQG;
import X.VQM;
import X.VQN;
import X.VQO;
import X.VQP;
import X.VQQ;
import X.W5B;
import X.W5I;
import X.X1D;
import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.UIBody;

/* loaded from: classes15.dex */
public class FlattenUIImage extends LynxFlattenUI implements Drawable.Callback, V9C {
    public V9R mBigImageHelper;
    public String mCapInsets;
    public String mCapInsetsScale;
    public boolean mDeferInvalidation;
    public boolean mFrescoNinePatch;
    public final Handler mHandler;
    public boolean mHasPendingPlaceholder;
    public boolean mHasPendingSource;
    public Drawable mImageDrawable;
    public final V9H mLynxImageManager;
    public String mOriginPlaceholder;
    public boolean mPendingLoad;
    public float mPreFetchHeihgt;
    public float mPreFetchWidth;
    public C81392Vwy<?> mRef;
    public boolean mRepeat;
    public InterfaceC78716Uuu mScaleType;
    public int mScrollState;
    public VQG mScrollStateChangeListener;
    public int mShowCnt;
    public boolean mSkipRedirection;
    public String mSources;
    public boolean mSuspendable;
    public boolean mUseLocalCache;

    private void configureBounds() {
        Drawable drawable = this.mImageDrawable;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, getWidth(), getHeight());
    }

    private void onSourceSetted() {
        int i = this.mShowCnt + 1;
        this.mShowCnt = i;
        V9R v9r = this.mBigImageHelper;
        if (v9r != null) {
            v9r.LIZLLL = i;
            v9r.LIZJ();
        }
    }

    public void maybeUpdateView() {
        if (this.mSuspendable && this.mScrollState != 0) {
            this.mPendingLoad = true;
            return;
        }
        if (getWidth() <= 0 && getHeight() <= 0) {
            float f = this.mPreFetchWidth;
            if (f > 0.0f) {
                float f2 = this.mPreFetchHeihgt;
                if (f2 > 0.0f) {
                    this.mLynxImageManager.LIZIZ((int) f, (int) f2, this.mPaddingLeft + this.mBorderLeftWidth, this.mPaddingTop + this.mBorderTopWidth, this.mPaddingRight + this.mBorderRightWidth, this.mPaddingBottom + this.mBorderBottomWidth);
                    return;
                }
            }
        }
        this.mLynxImageManager.LIZIZ(getWidth(), getHeight(), this.mPaddingLeft + this.mBorderLeftWidth, this.mPaddingTop + this.mBorderTopWidth, this.mPaddingRight + this.mBorderRightWidth, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    public void postInvalidate() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new ARunnableS50S0100000_14(this, 46));
        }
    }

    @EWS
    public void startAnimate() {
        InterfaceC81252Vui interfaceC81252Vui;
        C81250Vug<V92> c81250Vug = this.mLynxImageManager.LJIIJ;
        if (c81250Vug != null && (interfaceC81252Vui = c81250Vug.LJ) != null && interfaceC81252Vui.LIZ() != null) {
            this.mLynxImageManager.LJIIJ.LJ.LIZ().stop();
            this.mLynxImageManager.LJIIJ.LJ.LIZ().start();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        this.mLynxImageManager.LIZLLL();
        V9R v9r = this.mBigImageHelper;
        if (v9r != null) {
            v9r.LIZJ();
        }
        C81392Vwy<?> c81392Vwy = this.mRef;
        if (c81392Vwy != null) {
            c81392Vwy.close();
            this.mRef = null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
        this.mLynxImageManager.LIZJ();
        this.mLynxImageManager.LJII = true;
        maybeUpdateView();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        this.mLynxImageManager.LIZLLL();
        V9R v9r = this.mBigImageHelper;
        if (v9r != null) {
            v9r.LIZJ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        configureBounds();
        maybeUpdateView();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onPropsUpdated() {
        super.onPropsUpdated();
        if (!this.mSkipRedirection && this.mHasPendingPlaceholder && this.mHasPendingSource) {
            V9H v9h = this.mLynxImageManager;
            v9h.LJJIIJ.LJIIIZ(this.mSources, this.mOriginPlaceholder);
            this.mHasPendingSource = false;
            this.mHasPendingPlaceholder = false;
        }
        if (this.mHasPendingSource) {
            if (this.mSkipRedirection) {
                V9H v9h2 = this.mLynxImageManager;
                v9h2.LJJIIJ.LJIIJ(this.mSources, false);
            } else {
                V9H v9h3 = this.mLynxImageManager;
                v9h3.LJJIIJ.LJIIJ(this.mSources, true);
            }
            this.mHasPendingSource = false;
        }
        if (this.mHasPendingPlaceholder) {
            this.mHasPendingPlaceholder = false;
            V9H v9h4 = this.mLynxImageManager;
            String str = this.mOriginPlaceholder;
            boolean z = true ^ this.mSkipRedirection;
            C79285V9t c79285V9t = v9h4.LJJIIJ;
            if (z) {
                c79285V9t.LJIIIZ(null, str);
            } else {
                c79285V9t.LJIIIIZZ(str);
            }
        }
        maybeUpdateView();
    }

    public Drawable getImageDrawable() {
        return this.mImageDrawable;
    }

    public void onImageLoaded() {
        configureBounds();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void renderIfNeeded() {
        maybeUpdateView();
    }

    public FlattenUIImage(VNU vnu) {
        super(vnu);
        this.mPreFetchWidth = -1.0f;
        this.mPreFetchHeihgt = -1.0f;
        this.mScaleType = InterfaceC78716Uuu.LJJJLZIJ;
        V9H createImageManager = createImageManager(vnu);
        this.mLynxImageManager = createImageManager;
        createImageManager.LJJIIJ.LJJ = this;
        createImageManager.LJIILL = new VQ1(this);
        createImageManager.LJJIIJ.LJIJ = new VQP(this);
        this.mHandler = new Handler(C16880lQ.LLJJJJ());
        this.mShowCnt = 0;
        this.mRepeat = false;
    }

    public V9H createImageManager(Context context) {
        C81705W4v LIZJ = W5I.LIZJ();
        this.mContext.getClass();
        return new V9H(context, LIZJ, this, false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onBorderRadiusUpdated(int i) {
        V9H v9h = this.mLynxImageManager;
        VQQ LIZIZ = this.mLynxBackground.LIZIZ();
        if (v9h.LJIIIIZZ == LIZIZ) {
            if (LIZIZ != null && LIZIZ.LJ != null) {
                return;
            }
            v9h.LJII = true;
            return;
        }
        v9h.LJIIIIZZ = LIZIZ;
        v9h.LJII = true;
    }

    @Override // X.V9C
    public void onCloseableRefReady(C81392Vwy<?> c81392Vwy) {
        if (c81392Vwy == null || !this.mUseLocalCache) {
            return;
        }
        this.mRef = c81392Vwy.clone();
        LynxEnv.LJIIIZ().getClass();
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        super.onDraw(canvas);
        if (this.mPendingLoad) {
            return;
        }
        if (this.mImageDrawable == null && this.mRef == null) {
            return;
        }
        C81392Vwy<?> c81392Vwy = this.mRef;
        String str = null;
        if (c81392Vwy != null && c81392Vwy.LJIIJ() && this.mUseLocalCache) {
            Object LJI = this.mRef.LJI();
            if (LJI instanceof W5B) {
                bitmap = ((W5B) LJI).getUnderlyingBitmap();
            } else if (LJI instanceof Bitmap) {
                bitmap = (Bitmap) LJI;
            }
            if (bitmap != null) {
                LLog.LIZLLL(2, "Lynx Android Flatten Image", "draw image from local cache");
                if (C78732UvA.customDraw(getWidth(), getHeight(), bitmap.getWidth(), bitmap.getHeight(), this.mScaleType, this.mCapInsets, this.mCapInsetsScale, canvas, bitmap)) {
                    return;
                }
            }
        }
        if (!this.mFrescoNinePatch && this.mCapInsets != null) {
            LLog.LIZLLL(2, "Lynx Android Flatten Image", "load origin bitmap to draw image with cap-insets");
            if (this.mBigImageHelper == null) {
                this.mBigImageHelper = new V9R(new VQM(this), this.mShowCnt);
            }
            int i = this.mShowCnt;
            float width = getWidth();
            float height = getHeight();
            boolean z = this.mRepeat;
            InterfaceC78716Uuu interfaceC78716Uuu = this.mScaleType;
            C117434jD c117434jD = this.mLynxImageManager.LJJIIJ.LJIILLIIL;
            if (c117434jD != null) {
                str = c117434jD.LIZIZ().toString();
            }
            if (this.mBigImageHelper.LIZLLL(this.mContext, canvas, this.mLynxImageManager.LJIILJJIL, new V9U(i, width, height, z, interfaceC78716Uuu, str, V9R.LJFF(canvas), this.mCapInsets, this.mCapInsetsScale))) {
                return;
            }
        }
        try {
            this.mImageDrawable.draw(canvas);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(th.getMessage());
            LIZ.append(", view sie:");
            LIZ.append(getWidth());
            LIZ.append("x");
            LIZ.append(getHeight());
            LIZ.append(", url:");
            C13870gZ.LIZJ(LIZ, this.mSources, LIZ, 4, "Lynx-Image");
        }
    }

    @Override // X.V9C
    public void onDrawableReady(Drawable drawable) {
        this.mImageDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        configureBounds();
        invalidate();
    }

    @VPD(name = "auto-size")
    public void setAutoSize(boolean z) {
        C79285V9t c79285V9t = this.mLynxImageManager.LJJIIJ;
        c79285V9t.LJI = z;
        if (!z || (c79285V9t.LIZLLL != 0 && c79285V9t.LIZJ != 0)) {
            c79285V9t.LIZLLL();
        }
        c79285V9t.LJIJI.LIZJ();
    }

    @VPD(name = "blur-radius")
    public void setBlurRadius(String str) {
        UIBody uIBody = this.mContext.LJLJLLL;
        V9H v9h = this.mLynxImageManager;
        int round = Math.round(VPR.LIZLLL(str, uIBody.mFontSize, this.mFontSize, uIBody.getWidth(), uIBody.getHeight(), 0.0f, this.mContext.LJLZ));
        C79285V9t c79285V9t = v9h.LJJIIJ;
        if (round == 0) {
            c79285V9t.LJIIJJI = null;
        } else {
            c79285V9t.getClass();
            c79285V9t.LJIIJJI = new C78747UvP(round);
        }
        c79285V9t.LJIJI.LIZJ();
    }

    @VPD(name = "capInsets")
    public void setCapInsets(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            this.mCapInsets = null;
        } else {
            this.mCapInsets = str;
        }
        V9H v9h = this.mLynxImageManager;
        String str2 = this.mCapInsets;
        C79285V9t c79285V9t = v9h.LJJIIJ;
        c79285V9t.LJ = str2;
        c79285V9t.LJIJI.LIZJ();
    }

    @VPD(name = "cap-insets")
    public void setCapInsetsBackUp(String str) {
        setCapInsets(str);
    }

    @VPD(name = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            this.mCapInsetsScale = null;
        } else {
            this.mCapInsetsScale = str;
        }
        V9H v9h = this.mLynxImageManager;
        String str2 = this.mCapInsetsScale;
        C79285V9t c79285V9t = v9h.LJJIIJ;
        c79285V9t.LJFF = str2;
        c79285V9t.LJIJI.LIZJ();
    }

    @VPD(defaultBoolean = false, name = "defer-src-invalidation")
    public void setDeferInvalidation(boolean z) {
        this.mDeferInvalidation = z;
        this.mLynxImageManager.LJJ = z;
    }

    @VPD(name = "disable-default-resize")
    public void setDisableDefaultResize(boolean z) {
        V9H v9h = this.mLynxImageManager;
        if (v9h == null) {
            return;
        }
        if (z) {
            EnumC78943UyZ enumC78943UyZ = EnumC78943UyZ.SCALE;
            C79285V9t c79285V9t = v9h.LJJIIJ;
            c79285V9t.LJIIJ = enumC78943UyZ;
            c79285V9t.LJIJI.LIZJ();
            return;
        }
        EnumC78943UyZ enumC78943UyZ2 = EnumC78943UyZ.RESIZE;
        C79285V9t c79285V9t2 = v9h.LJJIIJ;
        c79285V9t2.LJIIJ = enumC78943UyZ2;
        c79285V9t2.LJIJI.LIZJ();
    }

    @VPD(defaultBoolean = false, name = "fresco-nine-patch")
    public void setFrescoNinePatch(boolean z) {
        this.mFrescoNinePatch = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @VPD(name = "image-config")
    public void setImageConfig(String str) {
        super.setImageConfig(str);
        V9H v9h = this.mLynxImageManager;
        Bitmap.Config config = this.mBitmapConfig;
        C79285V9t c79285V9t = v9h.LJJIIJ;
        c79285V9t.LJIIIZ = config;
        c79285V9t.LJIJI.LIZJ();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setLocalCache(F5B f5b) {
        super.setLocalCache(f5b);
        if (this.mLynxImageManager == null) {
            return;
        }
        VQB LIZ = VQ6.LIZ(f5b);
        boolean z = LIZ.LIZ;
        this.mUseLocalCache = z;
        boolean z2 = LIZ.LIZIZ;
        C79285V9t c79285V9t = this.mLynxImageManager.LJJIIJ;
        c79285V9t.LJIIL = z;
        c79285V9t.LJIILIIL = z2;
    }

    @VPD(name = "loop-count")
    public void setLoopCount(int i) {
        if (i <= 0) {
            i = 0;
        }
        this.mLynxImageManager.LJIJJLI = i;
    }

    @VPD(name = "mode")
    public void setObjectFit(String str) {
        AbstractC78707Uul LIZ = C78731Uv9.LIZ(str);
        this.mScaleType = LIZ;
        V9H v9h = this.mLynxImageManager;
        v9h.LJI = LIZ;
        v9h.LJII = true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setParent(VPH vph) {
        super.setParent(vph);
        this.mLynxImageManager.LIZJ();
    }

    @VPD(name = "placeholder")
    public void setPlaceholder(String str) {
        this.mHasPendingPlaceholder = true;
        this.mOriginPlaceholder = str;
    }

    @VPD(name = "prefetch-height")
    public void setPreFetchHeight(String str) {
        this.mPreFetchHeihgt = VPR.LIZLLL(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.LJLZ);
    }

    @VPD(name = "prefetch-width")
    public void setPreFetchWidth(String str) {
        this.mPreFetchWidth = VPR.LIZLLL(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.LJLZ);
    }

    @VPD(defaultBoolean = false, name = "repeat")
    public void setRepeat(boolean z) {
        this.mRepeat = z;
    }

    @VPD(defaultBoolean = false, name = "skip-redirection")
    public void setSkipRedirection(boolean z) {
        this.mSkipRedirection = z;
    }

    @VPD(name = "src")
    public void setSource(String str) {
        if (!TextUtils.equals(str, this.mLynxImageManager.LJJIIJ.LJIILJJIL)) {
            if (!this.mDeferInvalidation) {
                this.mImageDrawable = null;
            }
            C81392Vwy<?> c81392Vwy = this.mRef;
            if (c81392Vwy != null) {
                c81392Vwy.close();
                this.mRef = null;
            }
        }
        this.mSources = str;
        this.mHasPendingSource = true;
        onSourceSetted();
        invalidate();
    }

    @VPD(name = "suspendable")
    public void setSuspendable(F5B f5b) {
        this.mSuspendable = false;
        if (f5b != null) {
            int i = VQN.LIZ[f5b.getType().ordinal()];
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
            this.mScrollStateChangeListener = new VQO(this);
        }
        registerScrollStateListener(this.mScrollStateChangeListener);
    }

    public FlattenUIImage(Context context) {
        this((VNU) context);
    }

    public void setLocalCache(Boolean bool) {
        if (this.mLynxImageManager == null) {
            return;
        }
        if (bool == null) {
            this.mUseLocalCache = false;
        }
        boolean booleanValue = bool.booleanValue();
        this.mUseLocalCache = booleanValue;
        this.mLynxImageManager.LJJIIJ.LJIIL = booleanValue;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C79411VEp.LIZIZ(runnable, drawable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C79411VEp.LIZLLL(runnable, drawable, j);
    }
}
