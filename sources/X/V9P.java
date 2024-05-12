package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.ui.image.GlobalImageLoadListener;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes14.dex */
public class V9P extends W5G {
    public V9R mBigImageHelper;
    public VQQ mBorderRadii;
    public final Object mCallerContext;
    public W4Z mControllerForTesting;
    public W4Z mControllerListener;
    public boolean mCoverStart;
    public W5O mCurImageRequest;
    public boolean mDeferInvalidation;
    public boolean mDisableDefaultPlaceholder;
    public final AbstractC81686W4c mDraweeControllerBuilder;
    public int mFadeDurationMs;
    public boolean mFixFrescoBug;
    public boolean mFrescoNinePatch;
    public GlobalImageLoadListener mGlobalImageLoadListener;
    public C79285V9t mImageDelegate;
    public boolean mIsBorderRadiusDirty;
    public boolean mIsDirty;
    public boolean mIsFrescoAttach;
    public boolean mIsFrescoVisible;
    public boolean mIsNoSubSampleMode;
    public C61828OOi mLoaderCallback;
    public int mLoopCount;
    public int mOverlayColor;
    public float mPreFetchHeight;
    public float mPreFetchWidth;
    public C81392Vwy<?> mRef;
    public boolean mRepeat;
    public InterfaceC78716Uuu mScaleType;
    public int mShowCnt;
    public int mSourceImageHeight;
    public int mSourceImageWidth;
    public long mStartTimeStamp;
    public C81392Vwy<Bitmap> mTempPlaceHolder;

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void markDirty() {
        this.mIsDirty = true;
    }

    public void maybeUpdateView() {
        if ((!this.mIsDirty || ((getWidth() <= 0 || getHeight() <= 0) && !this.mImageDelegate.LJI)) && this.mPreFetchWidth <= 0.0f && this.mPreFetchHeight <= 0.0f) {
            return;
        }
        if (getWidth() > 0 && getHeight() > 0) {
            maybeUpdateViewInternal(getWidth(), getHeight(), getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        } else {
            tryFetchImage((int) this.mPreFetchWidth, (int) this.mPreFetchHeight, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onImageRequestLoaded() {
    }

    public void onPostprocessorPreparing(List<VA3> list) {
    }

    public void destroy() {
        V9R v9r = this.mBigImageHelper;
        if (v9r != null) {
            v9r.LIZJ();
        }
        C81392Vwy<?> c81392Vwy = this.mRef;
        if (c81392Vwy != null) {
            c81392Vwy.close();
            this.mRef = null;
        }
        C79285V9t c79285V9t = this.mImageDelegate;
        c79285V9t.LIZJ = 0;
        c79285V9t.LIZLLL = 0;
        c79285V9t.LJJI = null;
        if (this.mTempPlaceHolder != null) {
            V92 hierarchy = getHierarchy();
            if (hierarchy != null) {
                hierarchy.LJIILL(null, 1);
            }
            this.mTempPlaceHolder.close();
            this.mTempPlaceHolder = null;
        }
    }

    public String getSrc() {
        C117434jD c117434jD = this.mImageDelegate.LJIILLIIL;
        if (c117434jD != null) {
            return c117434jD.LIZIZ().toString();
        }
        return null;
    }

    public void onSourceSetted() {
        int i = this.mShowCnt + 1;
        this.mShowCnt = i;
        V9R v9r = this.mBigImageHelper;
        if (v9r != null) {
            v9r.LIZLLL = i;
            v9r.LIZJ();
        }
    }

    @Override // X.VA9
    public void onAttach() {
        this.mStartTimeStamp = System.currentTimeMillis();
        super.onAttach();
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mIsFrescoVisible) {
            setFrescoVisible();
        }
        if (this.mIsFrescoAttach) {
            setFrescoAttach();
        }
    }

    public void setFrescoVisible() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(true, false);
        }
    }

    public void startAnimate() {
        if (getController() != null && getController().LIZ() != null) {
            getController().LIZ().start();
        }
    }

    public void stopAnimate() {
        if (getController() != null && getController().LIZ() != null) {
            getController().LIZ().stop();
        }
    }

    public InterfaceC78716Uuu getFrescoScaleType() {
        return this.mScaleType;
    }

    public int getLoopCount() {
        return this.mLoopCount;
    }

    public void setFrescoAttach() {
        doAttach();
    }

    private float[] adjustBorderRadiusArrayWithPadding(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return null;
        }
        float[] fArr2 = new float[8];
        int i = 0;
        fArr2[0] = getPaddingLeft();
        fArr2[1] = getPaddingTop();
        fArr2[2] = getPaddingRight();
        fArr2[3] = getPaddingTop();
        fArr2[4] = getPaddingRight();
        fArr2[5] = getPaddingBottom();
        fArr2[6] = getPaddingLeft();
        fArr2[7] = getPaddingBottom();
        do {
            fArr2[i] = Math.max(0.0f, fArr[i] - fArr2[i]);
            i++;
        } while (i < 8);
        return fArr2;
    }

    public static V92 buildHierarchy(Context context) {
        C79077V1t c79077V1t = new C79077V1t(context.getResources());
        c79077V1t.LJIILL = V8L.LIZIZ(0.0f);
        return c79077V1t.LIZ();
    }

    public W5P createImageRequestBuilder(android.net.Uri uri) {
        C79285V9t c79285V9t = this.mImageDelegate;
        c79285V9t.getClass();
        W5P LIZLLL = W5P.LIZLLL(uri);
        V9E.LIZIZ(LIZLLL, c79285V9t.LJIIIZ);
        return LIZLLL;
    }

    public void fixFrescoWebPBug(boolean z) {
        this.mFixFrescoBug = z;
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        C61828OOi c61828OOi = this.mLoaderCallback;
        if (c61828OOi != null) {
            c61828OOi.LIZIZ(getWidth(), getHeight());
            if (this.mLoaderCallback.LIZ()) {
                return;
            }
        }
        C81392Vwy<?> c81392Vwy = this.mRef;
        if (c81392Vwy != null && c81392Vwy.LJIIJ() && this.mImageDelegate.LJIIL) {
            Object LJI = this.mRef.LJI();
            if (LJI instanceof W5B) {
                bitmap = ((W5B) LJI).getUnderlyingBitmap();
            } else if (LJI instanceof Bitmap) {
                bitmap = (Bitmap) LJI;
            }
            if (bitmap != null) {
                LLog.LIZLLL(2, "Lynx Android Image", "draw image from local cache");
                int width = canvas.getWidth();
                int height = canvas.getHeight();
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                InterfaceC78716Uuu interfaceC78716Uuu = this.mScaleType;
                C79285V9t c79285V9t = this.mImageDelegate;
                if (C78732UvA.customDraw(width, height, width2, height2, interfaceC78716Uuu, c79285V9t.LJ, c79285V9t.LJFF, canvas, bitmap)) {
                    return;
                }
            }
        }
        if (!this.mFrescoNinePatch && this.mImageDelegate.LJ != null) {
            LLog.LIZLLL(2, "Lynx Android Image", "load origin bitmap to draw image with cap-insets");
            if (this.mBigImageHelper == null) {
                this.mBigImageHelper = new V9R(new V9Q(this), this.mShowCnt);
            }
            int i = this.mShowCnt;
            float width3 = getWidth();
            float height3 = getHeight();
            boolean z = this.mRepeat;
            InterfaceC78716Uuu interfaceC78716Uuu2 = this.mScaleType;
            String src = getSrc();
            Point LJFF = V9R.LJFF(canvas);
            C79285V9t c79285V9t2 = this.mImageDelegate;
            if (this.mBigImageHelper.LIZLLL(getContext(), canvas, this.mCurImageRequest, new V9U(i, width3, height3, z, interfaceC78716Uuu2, src, LJFF, c79285V9t2.LJ, c79285V9t2.LJFF))) {
                return;
            }
        }
        TraceEvent.LIZIZ("FrescoImageView.onDraw");
        if (this.mIsNoSubSampleMode || (getController() != null && getController().LIZ() == null && this.mImageDelegate.LJ == null)) {
            if (this.mBigImageHelper == null) {
                this.mBigImageHelper = new V9R(new V9Q(this), this.mShowCnt);
            }
            int i2 = this.mShowCnt;
            float width4 = getWidth();
            float height4 = getHeight();
            boolean z2 = this.mRepeat;
            InterfaceC78716Uuu interfaceC78716Uuu3 = this.mScaleType;
            String src2 = getSrc();
            Point LJFF2 = V9R.LJFF(canvas);
            C79285V9t c79285V9t3 = this.mImageDelegate;
            V9U v9u = new V9U(i2, width4, height4, z2, interfaceC78716Uuu3, src2, LJFF2, c79285V9t3.LJ, c79285V9t3.LJFF);
            if (this.mIsNoSubSampleMode) {
                V9R v9r = this.mBigImageHelper;
                Context context = getContext();
                W5O w5o = this.mCurImageRequest;
                v9r.LJ = true;
                V9T v9t = v9r.LIZIZ;
                if (v9t == null || v9t.LIZLLL == null || v9t.LJFF.LIZ != i2) {
                    v9r.LIZJ();
                    v9r.LJII(context, w5o, v9u);
                    v9r.LJ(canvas, v9r.LIZIZ);
                } else {
                    v9r.LJ(canvas, v9t);
                }
                TraceEvent.LJ("FrescoImageView.onDraw");
                return;
            }
            V9R v9r2 = this.mBigImageHelper;
            Context context2 = getContext();
            W5O w5o2 = this.mCurImageRequest;
            v9r2.getClass();
            if (DisplayMetricsHolder.LIZIZ() != null && (width4 > DisplayMetricsHolder.LIZIZ().widthPixels * 3 || height4 > DisplayMetricsHolder.LIZIZ().heightPixels || z2)) {
                v9r2.LJ = false;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("drawBigImage: w:");
                LIZ.append(width4);
                LIZ.append(", h:");
                LIZ.append(height4);
                LLog.LIZLLL(1, "LynxImageHelper", X1D.LIZIZ(LIZ));
                V9T v9t2 = v9r2.LIZIZ;
                if (v9t2 == null || v9t2.LIZLLL == null || v9t2.LJFF.LIZ != i2) {
                    v9r2.LIZJ();
                    v9r2.LJII(context2, w5o2, v9u);
                    v9r2.LJ(canvas, v9r2.LIZIZ);
                } else {
                    v9r2.LJ(canvas, v9t2);
                }
                TraceEvent.LJ("FrescoImageView.onDraw");
                return;
            }
        }
        try {
            super.onDraw(canvas);
        } catch (OutOfMemoryError e) {
            LLog.LIZLLL(4, "FrescoImageView", e.getMessage());
        }
        TraceEvent.LJ("FrescoImageView.onDraw");
    }

    @Override // X.VA9, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("catch onTouchEvent exception: ");
            LIZ.append(th.toString());
            LLog.LIZLLL(4, "Lynx FrescoImageView", X1D.LIZIZ(LIZ));
            return false;
        }
    }

    public void setAutoSize(boolean z) {
        C79285V9t c79285V9t = this.mImageDelegate;
        c79285V9t.LJI = z;
        if (!z || (c79285V9t.LIZLLL != 0 && c79285V9t.LIZJ != 0)) {
            c79285V9t.LIZLLL();
        }
        c79285V9t.LJIJI.LIZJ();
    }

    public void setAwaitLocalCache(boolean z) {
        this.mImageDelegate.LJIILIIL = z;
    }

    public void setBitmapConfig(Bitmap.Config config) {
        C79285V9t c79285V9t = this.mImageDelegate;
        c79285V9t.LJIIIZ = config;
        c79285V9t.LJIJI.LIZJ();
    }

    public void setBlurRadius(int i) {
        C79285V9t c79285V9t = this.mImageDelegate;
        if (i == 0) {
            c79285V9t.LJIIJJI = null;
        } else {
            c79285V9t.getClass();
            c79285V9t.LJIIJJI = new C78747UvP(i);
        }
        c79285V9t.LJIJI.LIZJ();
    }

    public void setBorderRadius(VQQ vqq) {
        this.mBorderRadii = vqq;
        this.mIsDirty = true;
        this.mIsBorderRadiusDirty = true;
    }

    public void setCapInsets(String str) {
        C79285V9t c79285V9t = this.mImageDelegate;
        c79285V9t.LJ = str;
        c79285V9t.LJIJI.LIZJ();
    }

    public void setCapInsetsScale(String str) {
        C79285V9t c79285V9t = this.mImageDelegate;
        c79285V9t.LJFF = str;
        c79285V9t.LJIJI.LIZJ();
    }

    public void setControllerListener(W4Z w4z) {
        this.mControllerForTesting = w4z;
        this.mIsDirty = true;
        maybeUpdateView();
    }

    public void setCoverStart(boolean z) {
        this.mCoverStart = z;
        this.mIsDirty = true;
    }

    public void setDeferInvalidation(boolean z) {
        this.mDeferInvalidation = z;
    }

    public void setDisableDefaultPlaceHolder(boolean z) {
        this.mDisableDefaultPlaceholder = z;
    }

    public void setFadeDuration(int i) {
        this.mFadeDurationMs = i;
    }

    public void setFrescoNinePatch(boolean z) {
        this.mFrescoNinePatch = z;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.mImageDelegate.LJIJJLI = readableMap;
    }

    public void setImageLoaderCallback(C61828OOi c61828OOi) {
        this.mLoaderCallback = c61828OOi;
    }

    public void setImageRedirectListener(VA0 va0) {
        this.mImageDelegate.LJIJ = va0;
    }

    public void setLocalCache(boolean z) {
        this.mImageDelegate.LJIIL = z;
    }

    public void setLoopCount(int i) {
        this.mLoopCount = i;
    }

    public void setLynxBaseUI(LynxBaseUI lynxBaseUI) {
        this.mImageDelegate.LJJ = lynxBaseUI;
    }

    public void setNoSubSampleMode(boolean z) {
        this.mIsNoSubSampleMode = z;
    }

    public void setOverlayColor(int i) {
        this.mOverlayColor = i;
        this.mIsDirty = true;
    }

    public void setPlaceholder(String str) {
        this.mImageDelegate.LJIIIZ(null, str);
    }

    public void setPreFetchHeight(float f) {
        this.mPreFetchHeight = f;
    }

    public void setPreFetchWidth(float f) {
        this.mPreFetchWidth = f;
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.mImageDelegate.LJIIIIZZ = z;
    }

    public void setRepeat(boolean z) {
        this.mRepeat = z;
    }

    public void setResizeMethod(EnumC78943UyZ enumC78943UyZ) {
        C79285V9t c79285V9t = this.mImageDelegate;
        c79285V9t.LJIIJ = enumC78943UyZ;
        c79285V9t.LJIJI.LIZJ();
    }

    public void setScaleType(InterfaceC78716Uuu interfaceC78716Uuu) {
        this.mScaleType = interfaceC78716Uuu;
        this.mIsDirty = true;
    }

    public void setSource(String str) {
        this.mImageDelegate.LJIIJJI(str);
    }

    public void setSrc(String str) {
        this.mImageDelegate.LJIIJ(str, true);
    }

    public void setSrcSkippingRedirection(String str) {
        this.mImageDelegate.LJIIJ(str, false);
    }

    public void setPlaceholder(String str, boolean z) {
        C79285V9t c79285V9t = this.mImageDelegate;
        if (z) {
            c79285V9t.LJIIIZ(null, str);
        } else {
            c79285V9t.LJIIIIZZ(str);
        }
    }

    public void setRedirectImageSource(String str, String str2) {
        this.mImageDelegate.LJIIIZ(str, str2);
    }

    public V9P(Context context, AbstractC81686W4c abstractC81686W4c, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context, buildHierarchy(context));
        this.mLoopCount = 0;
        this.mSourceImageWidth = 0;
        this.mSourceImageHeight = 0;
        this.mPreFetchWidth = -1.0f;
        this.mPreFetchHeight = -1.0f;
        this.mIsFrescoVisible = false;
        this.mIsFrescoAttach = false;
        this.mFrescoNinePatch = false;
        this.mFadeDurationMs = -1;
        this.mBorderRadii = null;
        this.mIsNoSubSampleMode = false;
        this.mRef = null;
        this.mDisableDefaultPlaceholder = false;
        this.mTempPlaceHolder = null;
        this.mScaleType = InterfaceC78716Uuu.LJJJLZIJ;
        this.mDraweeControllerBuilder = abstractC81686W4c;
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
        this.mShowCnt = 0;
        this.mRepeat = false;
        this.mCoverStart = false;
        this.mImageDelegate = new C79285V9t(context, new V9N(this));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            maybeUpdateView();
        }
    }

    private void maybeUpdateViewInternal(int i, int i2, int i3, int i4, int i5, int i6) {
        C81392Vwy<?> c81392Vwy;
        C79285V9t c79285V9t = this.mImageDelegate;
        C117434jD c117434jD = c79285V9t.LJIILLIIL;
        if (c117434jD == null && c79285V9t.LJIIZILJ == null) {
            return;
        }
        if (C78939UyV.LJJJJL(c117434jD, c79285V9t.LJIIJ) && !this.mImageDelegate.LJI && (i <= 0 || i2 <= 0)) {
            return;
        }
        TraceEvent.LIZIZ("FrescoImageView.maybeUpdateViewInternal");
        this.mImageDelegate.LJIIL(i, i2);
        if (this.mImageDelegate.LJIIL && (((c81392Vwy = this.mRef) != null && c81392Vwy.LJIIJ() && this.mRef.LJI() != null) || this.mImageDelegate.LJIILIIL)) {
            TraceEvent.LJ("FrescoImageView.maybeUpdateViewInternal");
        } else {
            tryFetchImageFromFresco(i, i2, i3, i4, i5, i6);
            TraceEvent.LJ("FrescoImageView.maybeUpdateViewInternal");
        }
    }

    public void tryFetchImage(int i, int i2, int i3, int i4, int i5, int i6) {
        maybeUpdateViewInternal(i, i2, i3, i4, i5, i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.W5O, REQUEST] */
    public void tryFetchImageFromFresco(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        float[] fArr;
        C117434jD c117434jD;
        V8L LIZIZ;
        TraceEvent.LIZIZ("LynxImageManager.tryFetchImageFromFresco");
        V92 hierarchy = getHierarchy();
        if (!this.mFixFrescoBug) {
            hierarchy.LJIILJJIL(this.mScaleType);
        }
        InterfaceC78716Uuu interfaceC78716Uuu = this.mScaleType;
        C78714Uus c78714Uus = InterfaceC78716Uuu.LJJLIIIJILLIZJL;
        if (interfaceC78716Uuu == c78714Uus && this.mCoverStart) {
            HO0 ho0 = new HO0();
            this.mScaleType = ho0;
            hierarchy.LJIILJJIL(ho0);
        }
        InterfaceC78716Uuu interfaceC78716Uuu2 = this.mScaleType;
        boolean z2 = true;
        if (interfaceC78716Uuu2 != c78714Uus && interfaceC78716Uuu2 != InterfaceC78716Uuu.LJJLIIIJJI) {
            z = true;
        } else {
            z = false;
        }
        VQQ vqq = this.mBorderRadii;
        if (vqq != null) {
            if (vqq.LJ(i + i3 + i5, i2 + i4 + i6)) {
                this.mIsBorderRadiusDirty = true;
            }
            fArr = adjustBorderRadiusArrayWithPadding(this.mBorderRadii.LIZ());
        } else {
            fArr = null;
        }
        if (this.mIsBorderRadiusDirty) {
            if (!z && fArr != null) {
                LIZIZ = V8L.LIZ(fArr);
            } else {
                LIZIZ = V8L.LIZIZ(0.0f);
            }
            int i7 = this.mOverlayColor;
            if (i7 != 0) {
                LIZIZ.LJI(i7);
            } else {
                LIZIZ.LIZ = V8K.BITMAP_ONLY;
            }
            hierarchy.LJIL(LIZIZ);
            this.mIsBorderRadiusDirty = true;
        }
        int i8 = this.mFadeDurationMs;
        if (i8 < 0) {
            i8 = 0;
        }
        hierarchy.LJIILLIIL(i8);
        ?? createImageRequest = createImageRequest(this.mImageDelegate.LJIILLIIL, i, i2, 0, 0, 0, 0, fArr, this.mScaleType);
        W5O w5o = this.mCurImageRequest;
        this.mCurImageRequest = createImageRequest;
        REQUEST request = createImageRequest(this.mImageDelegate.LJIIZILJ, i, i2, 0, 0, 0, 0, fArr, this.mScaleType);
        if (this.mDeferInvalidation) {
            request = w5o;
        }
        GlobalImageLoadListener globalImageLoadListener = this.mGlobalImageLoadListener;
        if (globalImageLoadListener != null && (c117434jD = this.mImageDelegate.LJIILLIIL) != null) {
            globalImageLoadListener.onLoadAttempt(c117434jD.LIZIZ());
        }
        this.mDraweeControllerBuilder.LIZJ();
        WeakReference weakReference = new WeakReference(this);
        AbstractC81686W4c abstractC81686W4c = this.mDraweeControllerBuilder;
        abstractC81686W4c.LJIIJ = true;
        abstractC81686W4c.LIZJ = this.mCallerContext;
        abstractC81686W4c.LJIIL = getController();
        abstractC81686W4c.LIZLLL = createImageRequest;
        if (request == 0) {
            z2 = false;
        }
        abstractC81686W4c.LJIIJJI = z2;
        abstractC81686W4c.LJ = request;
        String str = this.mImageDelegate.LJIILJJIL;
        this.mStartTimeStamp = System.currentTimeMillis();
        V9I v9i = new V9I(this, weakReference, str);
        this.mControllerListener = v9i;
        if (this.mControllerForTesting == null) {
            this.mDraweeControllerBuilder.LJII = v9i;
        } else {
            W4S w4s = new W4S();
            w4s.LJIIL(this.mControllerListener);
            w4s.LJIIL(this.mControllerForTesting);
            this.mDraweeControllerBuilder.LJII = w4s;
        }
        setController(this.mDraweeControllerBuilder.LIZ());
        this.mIsDirty = false;
        C79285V9t c79285V9t = this.mImageDelegate;
        c79285V9t.LIZ = i;
        c79285V9t.LIZIZ = i2;
        this.mDraweeControllerBuilder.LIZJ();
        TraceEvent.LJ("LynxImageManager.tryFetchImageFromFresco");
    }

    public W5O createImageRequest(C117434jD c117434jD, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, InterfaceC78716Uuu interfaceC78716Uuu) {
        return this.mImageDelegate.LIZIZ(c117434jD, i, i2, i3, i4, i5, i6, fArr, interfaceC78716Uuu);
    }
}
