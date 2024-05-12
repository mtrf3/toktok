package X;

import Y.IDAListenerS69S0100000;
import Y.IDRunnableS29S0200000;
import Y.IDRunnableS2S0300000;
import Y.IDRunnableS85S0100000;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.JsonReader;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView$SavedState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import javax.net.ssl.SSLException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1Eo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29701Eo extends AppCompatImageView {
    public static final C0GG DEFAULT_CACHE_STRATEGY = C0GG.Weak;
    public static final String TAG = C16880lQ.LJLLJ(C29701Eo.class);
    public String animationName;
    public int animationResId;
    public boolean autoPlay;
    public int buildDrawingCacheDepth;
    public C0GY composition;
    public C0GU compositionTask;
    public C0GG defaultCacheStrategy;
    public boolean disableOptInit;
    public boolean disableRecycleBitmap;
    public final InterfaceC04760Gq<Throwable> failureListener;
    public boolean forceMarkViewShown;
    public boolean hasSetUseHardwareLayer;
    public boolean isInitialized;
    public final InterfaceC04760Gq<C0GY> loadedListener;
    public final C04740Go lottieDrawable;
    public final java.util.Set<C0GM> lottieOnCompositionLoadedListeners;
    public final Runnable playAction;
    public boolean playAnimationWhenDrawableNotThisLottie;
    public boolean playAnimationWhenShown;
    public EnumC04660Gg renderMode;
    public boolean resumeAnimationWhenDrawableNotThisLottie;
    public boolean useHardwareLayer;
    public boolean wasAnimatingWhenDetached;
    public boolean wasAnimatingWhenNotShown;

    public void cancelAnimation() {
        this.wasAnimatingWhenDetached = false;
        this.wasAnimatingWhenNotShown = false;
        this.playAnimationWhenShown = false;
        this.resumeAnimationWhenDrawableNotThisLottie = false;
        this.playAnimationWhenDrawableNotThisLottie = false;
        removeCallbacks(this.playAction);
        this.lottieDrawable.LJ();
        enableOrDisableHardwareLayer();
    }

    public void clearComposition() {
        this.composition = null;
        C04740Go c04740Go = this.lottieDrawable;
        c04740Go.LJI();
        c04740Go.invalidateSelf();
    }

    public void disableOptInit() {
        this.disableOptInit = true;
    }

    public void disableRecycleBitmap() {
        this.disableRecycleBitmap = true;
        this.lottieDrawable.LJLZ = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_lancet_LottieTaskLancet_onRestoreInstanceState(this, parcelable);
    }

    public void pauseAnimation() {
        this.autoPlay = false;
        this.wasAnimatingWhenDetached = false;
        this.wasAnimatingWhenNotShown = false;
        this.playAnimationWhenShown = false;
        this.resumeAnimationWhenDrawableNotThisLottie = false;
        this.playAnimationWhenDrawableNotThisLottie = false;
        removeCallbacks(this.playAction);
        C04740Go c04740Go = this.lottieDrawable;
        c04740Go.getClass();
        c04740Go.LJLJJL.clear();
        c04740Go.LJLJI.LJFF(true);
        enableOrDisableHardwareLayer();
    }

    public void setDrawFpsTracerOutputListener(InterfaceC03950Dn interfaceC03950Dn) {
    }

    public void startDrawFpsTracer() {
    }

    public void stopDrawFpsTracer() {
    }

    public void useExperimentalHardwareAcceleration() {
        useHardwareAcceleration(true);
    }

    public void useHardwareAcceleration() {
        useHardwareAcceleration(true);
    }

    private void cancelLoaderTask() {
        C0GU c0gu = this.compositionTask;
        if (c0gu != null) {
            c0gu.LJII(this.loadedListener);
            this.compositionTask.LJI(this.failureListener);
        }
    }

    private void enableOrDisableHardwareLayer() {
        boolean z;
        try {
            int i = 2;
            int i2 = 1;
            if (C03970Dp.LIZ && !this.hasSetUseHardwareLayer && C03970Dp.LJ) {
                int i3 = C0GF.LIZ[this.renderMode.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            if (Build.VERSION.SDK_INT < 26) {
                            }
                        }
                    }
                    i = 1;
                }
                if (!C03970Dp.LIZLLL || !this.lottieDrawable.LLF) {
                    i2 = i;
                }
                if (i2 != getLayerType()) {
                    setLayerType(i2, null);
                    return;
                }
                return;
            }
            if (this.useHardwareLayer && this.lottieDrawable.LJIILL()) {
                z = true;
            } else {
                z = false;
            }
            if ((!C03970Dp.LIZ || !C03970Dp.LIZLLL || !this.lottieDrawable.LLF) && z) {
                setLayerType(i, null);
            }
            i = 1;
            setLayerType(i, null);
        } catch (Throwable unused) {
        }
    }

    private boolean isShownM() {
        if (C03970Dp.LJIIJJI) {
            if (this.forceMarkViewShown || isShown()) {
                return true;
            }
        } else if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void disableAsyncDraw() {
        this.lottieDrawable.LJII();
    }

    public void disableExtraScaleModeInFitXY() {
        this.lottieDrawable.LJLJLJ = false;
    }

    public long getDuration() {
        if (this.composition != null) {
            return r0.LIZIZ();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.lottieDrawable.LJLJI.LJLJJLL;
    }

    public String getImageAssetsFolder() {
        return this.lottieDrawable.LJLL;
    }

    public float getMaxFrame() {
        return this.lottieDrawable.LJLJI.LIZJ();
    }

    public float getMinFrame() {
        return this.lottieDrawable.LJLJI.LIZLLL();
    }

    public C04640Ge getPerformanceTracker() {
        C0GY c0gy = this.lottieDrawable.LJLILLLLZI;
        if (c0gy != null) {
            return c0gy.LIZ;
        }
        return null;
    }

    public float getProgress() {
        return this.lottieDrawable.LJLJI.LIZIZ();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.LJLJI.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.LJLJI.getRepeatMode();
    }

    public float getScale() {
        return this.lottieDrawable.LJLJJI;
    }

    public float getSpeed() {
        return this.lottieDrawable.LJLJI.LJLJI;
    }

    public boolean hasMasks() {
        AnonymousClass291 anonymousClass291 = this.lottieDrawable.LJLLL;
        if (anonymousClass291 != null && anonymousClass291.LJIJI()) {
            return true;
        }
        return false;
    }

    public boolean hasMatte() {
        AnonymousClass291 anonymousClass291 = this.lottieDrawable.LJLLL;
        if (anonymousClass291 == null) {
            return false;
        }
        if (anonymousClass291.LJJII == null) {
            if (anonymousClass291.LJIILLIIL != null) {
                anonymousClass291.LJJII = Boolean.TRUE;
            } else {
                for (int size = ((ArrayList) anonymousClass291.LJJ).size() - 1; size >= 0; size--) {
                    if (((AbstractC45041pk) ListProtector.get(anonymousClass291.LJJ, size)).LJIILLIIL != null) {
                        anonymousClass291.LJJII = Boolean.TRUE;
                        break;
                    }
                }
                anonymousClass291.LJJII = Boolean.FALSE;
            }
            return true;
        }
        if (!anonymousClass291.LJJII.booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean isAnimating() {
        return this.lottieDrawable.LJIILL();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.LJLLJ;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Integer num;
        C04740Go c04740Go = this.lottieDrawable;
        if (C04020Du.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("traceLottieViewOnDetachedFromWindow  {isShown=");
            LIZ.append(isShown());
            LIZ.append(" visibility:");
            LIZ.append(getVisibility());
            LIZ.append("  view=");
            LIZ.append(hashCode());
            LIZ.append(" drawable=");
            if (c04740Go != null) {
                num = Integer.valueOf(c04740Go.hashCode());
            } else {
                num = null;
            }
            LIZ.append(num);
            LIZ.append(" visible:");
            LIZ.append(isShown());
            LIZ.append("}");
            X1D.LIZIZ(LIZ);
        }
        if (isAnimating()) {
            cancelAnimation();
            this.wasAnimatingWhenDetached = true;
        }
        if (!this.disableRecycleBitmap) {
            INVOKEVIRTUAL_com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_lancet_LottieLancet_recycleBitmaps(this);
        }
        super.onDetachedFromWindow();
    }

    public void playAnimation() {
        if (C03970Dp.LIZ) {
            if (isShownM()) {
                Drawable drawable = getDrawable();
                C04740Go c04740Go = this.lottieDrawable;
                if (drawable != c04740Go) {
                    this.playAnimationWhenDrawableNotThisLottie = true;
                    return;
                } else {
                    c04740Go.LJIILLIIL();
                    enableOrDisableHardwareLayer();
                }
            } else {
                if (C03970Dp.LJIIJJI && isLottieTmpDetached()) {
                    removeCallbacks(this.playAction);
                    post(this.playAction);
                }
                this.playAnimationWhenShown = true;
            }
            this.playAnimationWhenDrawableNotThisLottie = false;
            this.resumeAnimationWhenDrawableNotThisLottie = false;
            return;
        }
        this.lottieDrawable.LJIILLIIL();
        enableOrDisableHardwareLayer();
    }

    public void recycleBitmaps() {
        C04740Go c04740Go = this.lottieDrawable;
        if (c04740Go != null) {
            c04740Go.LJIIZILJ();
        }
    }

    public void removeAllAnimatorListeners() {
        C04740Go c04740Go = this.lottieDrawable;
        ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha = c04740Go.LJLJI;
        if (!DK4.LIZ()) {
            choreographerFrameCallbackC30341Ha.removeAllListeners();
        } else {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AnimatorLancet:::");
            LIZ.append(android.util.Log.getStackTraceString(new Exception()));
            printStream.println(X1D.LIZIZ(LIZ));
            choreographerFrameCallbackC30341Ha.removeAllListeners();
        }
        IDAListenerS69S0100000 iDAListenerS69S0100000 = c04740Go.LLFFF;
        if (iDAListenerS69S0100000 != null) {
            c04740Go.LJLJI.addListener(iDAListenerS69S0100000);
        }
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        C04740Go c04740Go = this.lottieDrawable;
        c04740Go.LJLJI.removeAllUpdateListeners();
        c04740Go.LJLJI.addUpdateListener(c04740Go.LJZ);
    }

    public void resetFailureListener() {
        C0GU c0gu = this.compositionTask;
        if (c0gu != null) {
            c0gu.LJI(this.failureListener);
        }
    }

    public void resumeAnimation() {
        if (C03970Dp.LIZ) {
            if (isShownM()) {
                Drawable drawable = getDrawable();
                C04740Go c04740Go = this.lottieDrawable;
                if (drawable != c04740Go) {
                    this.resumeAnimationWhenDrawableNotThisLottie = true;
                    return;
                } else {
                    c04740Go.LJIJ();
                    enableOrDisableHardwareLayer();
                }
            } else {
                if (C03970Dp.LJIIJJI && isLottieTmpDetached()) {
                    removeCallbacks(this.playAction);
                    post(this.playAction);
                }
                this.playAnimationWhenShown = false;
                this.wasAnimatingWhenNotShown = true;
            }
            this.playAnimationWhenDrawableNotThisLottie = false;
            this.resumeAnimationWhenDrawableNotThisLottie = false;
            return;
        }
        this.lottieDrawable.LJIJ();
        enableOrDisableHardwareLayer();
    }

    public void reverseAnimationSpeed() {
        ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha = this.lottieDrawable.LJLJI;
        choreographerFrameCallbackC30341Ha.LJLJI = -choreographerFrameCallbackC30341Ha.LJLJI;
    }

    private boolean isLottieAttachedToWindow() {
        return isAttachedToWindow();
    }

    private boolean isLottieTmpDetached() {
        if (!isLottieAttachedToWindow()) {
            return false;
        }
        View view = this;
        while (true) {
            Object parent = view.getParent();
            if (parent == null) {
                return true;
            }
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        Integer num;
        super.onAttachedToWindow();
        C04740Go c04740Go = this.lottieDrawable;
        if (C04020Du.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("traceLottieViewOnAttachedToWindow  {isShown=");
            LIZ.append(isShown());
            LIZ.append(" visibility:");
            LIZ.append(getVisibility());
            LIZ.append("  view=");
            LIZ.append(hashCode());
            LIZ.append(" drawable=");
            if (c04740Go != null) {
                num = Integer.valueOf(c04740Go.hashCode());
            } else {
                num = null;
            }
            LIZ.append(num);
            LIZ.append(" visible:");
            LIZ.append(isShown());
            LIZ.append("}");
            X1D.LIZIZ(LIZ);
        }
        if (C03970Dp.LIZ) {
            if (!isInEditMode() && (this.autoPlay || this.wasAnimatingWhenDetached)) {
                playAnimation();
                this.autoPlay = false;
                this.wasAnimatingWhenDetached = false;
            }
            if (Build.VERSION.SDK_INT < 23) {
                onVisibilityChanged(this, getVisibility());
                return;
            }
            return;
        }
        if (this.autoPlay || this.wasAnimatingWhenDetached) {
            playAnimation();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        LottieAnimationView$SavedState lottieAnimationView$SavedState = new LottieAnimationView$SavedState(super.onSaveInstanceState());
        lottieAnimationView$SavedState.LJLIL = this.animationName;
        lottieAnimationView$SavedState.LJLILLLLZI = this.animationResId;
        lottieAnimationView$SavedState.LJLJI = this.lottieDrawable.LJLJI.LIZIZ();
        if (C03970Dp.LIZ) {
            if (this.lottieDrawable.LJIILL() || (!C16330kX.LIZIZ(this) && this.wasAnimatingWhenDetached)) {
                z = true;
            } else {
                z = false;
            }
            lottieAnimationView$SavedState.LJLJJI = z;
        } else {
            lottieAnimationView$SavedState.LJLJJI = this.lottieDrawable.LJIILL();
        }
        C04740Go c04740Go = this.lottieDrawable;
        lottieAnimationView$SavedState.LJLJJL = c04740Go.LJLL;
        lottieAnimationView$SavedState.LJLJJLL = c04740Go.LJLJI.getRepeatMode();
        lottieAnimationView$SavedState.LJLJL = this.lottieDrawable.LJLJI.getRepeatCount();
        return lottieAnimationView$SavedState;
    }

    public String getAnimationName() {
        return this.animationName;
    }

    public C0GY getComposition() {
        return this.composition;
    }

    public boolean getUseHardwareAcceleration() {
        return this.useHardwareLayer;
    }

    public void onAsyncDrawEnableChanged() {
        enableOrDisableHardwareLayer();
    }

    public C29701Eo(Context context) {
        super(context);
        this.loadedListener = new InterfaceC04760Gq<C0GY>() { // from class: X.1Ei
            @Override // X.InterfaceC04760Gq
            public final void onResult(C0GY c0gy) {
                C29701Eo.this.setComposition(c0gy);
            }
        };
        this.failureListener = new InterfaceC04760Gq<Throwable>() { // from class: X.1Ej
            @Override // X.InterfaceC04760Gq
            public final void onResult(Throwable th) {
                Throwable th2 = th;
                if (C03970Dp.LIZ && ((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException))) {
                    return;
                }
                C0GK LIZ = C0GH.LIZ();
                IllegalStateException illegalStateException = new IllegalStateException("Unable to parse composition", th2);
                StringBuilder sb = new StringBuilder();
                sb.append(((LinkedHashMap) C263911v.LIZIZ.LIZ.LJII()).keySet().toString());
                java.util.Map<String, C0GU<C0GY>> map = C04650Gf.LIZ;
                if (map != null) {
                    sb.append(" /---/ ");
                    sb.append(((ConcurrentHashMap) map).keySet().toString());
                }
                LIZ.LIZ(illegalStateException, sb.toString());
            }
        };
        this.lottieDrawable = new C04740Go();
        this.playAnimationWhenShown = false;
        this.playAnimationWhenDrawableNotThisLottie = false;
        this.resumeAnimationWhenDrawableNotThisLottie = false;
        this.wasAnimatingWhenNotShown = false;
        this.wasAnimatingWhenDetached = false;
        this.autoPlay = false;
        this.useHardwareLayer = false;
        this.hasSetUseHardwareLayer = false;
        this.disableRecycleBitmap = false;
        this.renderMode = EnumC04660Gg.AUTOMATIC;
        this.disableOptInit = false;
        this.buildDrawingCacheDepth = 0;
        this.lottieOnCompositionLoadedListeners = new HashSet();
        this.forceMarkViewShown = false;
        this.playAction = new IDRunnableS85S0100000(this, 37);
        init(null);
    }

    public static void INVOKEVIRTUAL_com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_lancet_LottieLancet_recycleBitmaps(C29701Eo c29701Eo) {
        try {
            c29701Eo.recycleBitmaps();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.0Gh] */
    private void init(AttributeSet attributeSet) {
        DisplayMetrics displayMetrics;
        String LLLZLZ;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ay6, R.attr.ay7, R.attr.ay8, R.attr.ay9, R.attr.ay_, R.attr.aya, R.attr.ayb, R.attr.ayc, R.attr.ayd, R.attr.aye, R.attr.ayf, R.attr.ayg, R.attr.ayh});
        this.defaultCacheStrategy = C0GG.values()[obtainStyledAttributes.getInt(1, DEFAULT_CACHE_STRATEGY.ordinal())];
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(8);
            boolean hasValue2 = obtainStyledAttributes.hasValue(4);
            boolean hasValue3 = obtainStyledAttributes.hasValue(12);
            if (hasValue) {
                if (!hasValue2) {
                    int resourceId = obtainStyledAttributes.getResourceId(8, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use use only one at once.");
                }
            } else if (hasValue2) {
                String LLLZLZ2 = C16880lQ.LLLZLZ(obtainStyledAttributes, 4);
                if (LLLZLZ2 != null) {
                    setAnimation(LLLZLZ2);
                }
            } else if (hasValue3 && (LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 12)) != null) {
                setAnimationFromUrl(LLLZLZ);
            }
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.wasAnimatingWhenDetached = true;
            this.autoPlay = true;
        }
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.lottieDrawable.LJLJI.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRepeatMode(obtainStyledAttributes.getInt(10, 1));
        }
        if (obtainStyledAttributes.hasValue(9)) {
            setRepeatCount(obtainStyledAttributes.getInt(9, -1));
        }
        setImageAssetsFolder(C16880lQ.LLLZLZ(obtainStyledAttributes, 5));
        setProgress(obtainStyledAttributes.getFloat(7, 0.0f));
        enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(3, false));
        if (obtainStyledAttributes.hasValue(2)) {
            final int color = obtainStyledAttributes.getColor(2, 0);
            addValueCallback(new C263711t("**"), (C263711t) C0GO.LJJ, (C06800Om<C263711t>) new C06800Om(new PorterDuffColorFilter(color) { // from class: X.0Gh
                {
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                }
            }));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            C04740Go c04740Go = this.lottieDrawable;
            c04740Go.LJLJJI = obtainStyledAttributes.getFloat(11, 1.0f);
            c04740Go.LJJIIJZLJL();
        }
        if (C03970Dp.LIZ && C03970Dp.LIZLLL) {
            C04740Go c04740Go2 = this.lottieDrawable;
            c04740Go2.getClass();
            if (C03970Dp.LIZ && C03970Dp.LIZLLL) {
                c04740Go2.LLF = true;
                c04740Go2.LLFF = new WeakReference<>(this);
                Context context = getContext();
                if (context != null) {
                    displayMetrics = context.getResources().getDisplayMetrics();
                } else {
                    displayMetrics = null;
                }
                c04740Go2.LJZI = new C23770wX(c04740Go2, displayMetrics);
                IDAListenerS69S0100000 iDAListenerS69S0100000 = new IDAListenerS69S0100000(c04740Go2, 2);
                c04740Go2.LLFFF = iDAListenerS69S0100000;
                c04740Go2.LJLJI.addListener(iDAListenerS69S0100000);
            }
        }
        obtainStyledAttributes.recycle();
        enableOrDisableHardwareLayer();
        if (C03970Dp.LIZ) {
            Context context2 = getContext();
            if (!C04650Gf.LIZIZ) {
                C04650Gf.LIZIZ = true;
                if (C03970Dp.LJIIIIZZ && context2 != null) {
                    C16880lQ.LLLLL(context2).registerComponentCallbacks(C04650Gf.LIZJ);
                }
            }
        }
        this.isInitialized = true;
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.LJLJI.addListener(animatorListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.LJLJI.addUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(C0GM c0gm) {
        C0GY c0gy = this.composition;
        if (c0gy != null) {
            c0gm.LIZ(c0gy);
        }
        return this.lottieOnCompositionLoadedListeners.add(c0gm);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        if (C03970Dp.LIZ) {
            if (this.lottieDrawable.LIZLLL()) {
                return;
            }
            this.buildDrawingCacheDepth++;
            super.buildDrawingCache(z);
            if (this.buildDrawingCacheDepth == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
                setRenderMode(EnumC04660Gg.HARDWARE);
            }
            this.buildDrawingCacheDepth--;
            C0GR.LIZ();
            return;
        }
        super.buildDrawingCache(z);
    }

    public void com_airbnb_lottie_LottieAnimationView__onRestoreInstanceState$___twin___(Parcelable parcelable) {
        if (!(parcelable instanceof LottieAnimationView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        LottieAnimationView$SavedState lottieAnimationView$SavedState = (LottieAnimationView$SavedState) parcelable;
        super.onRestoreInstanceState(lottieAnimationView$SavedState.getSuperState());
        String str = lottieAnimationView$SavedState.LJLIL;
        this.animationName = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.animationName);
        }
        int i = lottieAnimationView$SavedState.LJLILLLLZI;
        this.animationResId = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(lottieAnimationView$SavedState.LJLJI);
        if (lottieAnimationView$SavedState.LJLJJI) {
            playAnimation();
        }
        this.lottieDrawable.LJLL = lottieAnimationView$SavedState.LJLJJL;
        setRepeatMode(lottieAnimationView$SavedState.LJLJJLL);
        setRepeatCount(lottieAnimationView$SavedState.LJLJL);
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        C04740Go c04740Go = this.lottieDrawable;
        if (c04740Go.LJLLJ == z) {
            return;
        }
        c04740Go.LJLLJ = z;
        if (c04740Go.LJLILLLLZI == null) {
            return;
        }
        c04740Go.LIZJ();
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z) {
        Handler handler;
        if (C03970Dp.LIZ && this.lottieDrawable.LIZLLL()) {
            C04740Go c04740Go = this.lottieDrawable;
            C23770wX c23770wX = c04740Go.LJZI;
            Bitmap bitmap = null;
            if (c23770wX != null) {
                Bitmap bitmap2 = c04740Go.LLFII;
                C04740Go lottieDrawable = c23770wX.LIZ;
                o.LJIIJ(lottieDrawable, "lottieDrawable");
                LinkedBlockingQueue<Bitmap> linkedBlockingQueue = C25150yl.LIZ.get(Integer.valueOf(lottieDrawable.hashCode()));
                if (linkedBlockingQueue != null) {
                    synchronized (linkedBlockingQueue) {
                        bitmap = linkedBlockingQueue.poll();
                    }
                }
                if (bitmap != null) {
                    if (bitmap2 != null && (handler = c23770wX.LIZJ) != null) {
                        handler.post(new IDRunnableS29S0200000(bitmap2, c23770wX, 39));
                    }
                } else {
                    bitmap = bitmap2;
                }
                c04740Go.LLFII = bitmap;
                c04740Go.LJLJJLL = false;
            }
            if (bitmap != null) {
                return bitmap;
            }
        }
        return super.getDrawingCache(z);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C04740Go c04740Go = this.lottieDrawable;
        if (drawable2 == c04740Go) {
            super.invalidateDrawable(c04740Go);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void loop(boolean z) {
        int i;
        C04740Go c04740Go = this.lottieDrawable;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        c04740Go.LJLJI.setRepeatCount(i);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha = this.lottieDrawable.LJLJI;
        if (!DK4.LIZ()) {
            choreographerFrameCallbackC30341Ha.removeListener(animatorListener);
            return;
        }
        PrintStream printStream = System.err;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimatorLancet:::");
        LIZ.append(android.util.Log.getStackTraceString(new Exception()));
        printStream.println(X1D.LIZIZ(LIZ));
        choreographerFrameCallbackC30341Ha.removeListener(animatorListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(C0GM c0gm) {
        return this.lottieOnCompositionLoadedListeners.remove(c0gm);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.LJLJI.removeUpdateListener(animatorUpdateListener);
    }

    public List<C263711t> resolveKeyPath(C263711t c263711t) {
        C04740Go c04740Go = this.lottieDrawable;
        if (c04740Go.LJLLL == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        c04740Go.LJLLL.LJ(c263711t, 0, arrayList, new C263711t(new String[0]));
        return arrayList;
    }

    public void setAnimation(final int i) {
        C04020Du.LIZ(this, this.lottieDrawable, Integer.valueOf(i));
        this.animationResId = i;
        this.animationName = null;
        C263911v c263911v = C263911v.LIZIZ;
        c263911v.getClass();
        C0GY LIZ = c263911v.LIZ(Integer.toString(i));
        if (LIZ != null) {
            setComposition(LIZ);
            return;
        }
        clearComposition();
        cancelLoaderTask();
        final Context LLLLL = C16880lQ.LLLLL(getContext());
        C0GU<C0GY> LIZ2 = C04650Gf.LIZ(KMP.LJ("rawRes_", i), new Callable<C0GQ<C0GY>>() { // from class: X.0Gj
            @Override // java.util.concurrent.Callable
            public final C0GQ<C0GY> call() {
                Context context = LLLLL;
                int i2 = i;
                try {
                    InputStream openRawResource = context.getResources().openRawResource(i2);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("rawRes_");
                    LIZ3.append(i2);
                    return C04650Gf.LJII(openRawResource, X1D.LIZIZ(LIZ3), true);
                } catch (Resources.NotFoundException e) {
                    return new C0GQ<>((Throwable) e);
                }
            }
        });
        LIZ2.LIZIZ(new InterfaceC04760Gq<C0GY>() { // from class: X.1Ek
            @Override // X.InterfaceC04760Gq
            public final void onResult(C0GY c0gy) {
                C263911v c263911v2 = C263911v.LIZIZ;
                int i2 = i;
                c263911v2.getClass();
                c263911v2.LIZIZ(c0gy, Integer.toString(i2));
            }
        });
        LIZ2.LIZIZ(this.loadedListener);
        LIZ2.LIZ(this.failureListener);
        this.compositionTask = LIZ2;
    }

    public void setAnimationFromJson(String str) {
        C04020Du.LIZ(this, this.lottieDrawable, "jsonString");
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        C04020Du.LIZ(this, this.lottieDrawable, str);
        clearComposition();
        cancelLoaderTask();
        C0GU<C0GY> LJIIIZ = C04650Gf.LJIIIZ(getContext(), str);
        LJIIIZ.LIZIZ(this.loadedListener);
        LJIIIZ.LIZ(this.failureListener);
        this.compositionTask = LJIIIZ;
    }

    public void setComposition(C0GY c0gy) {
        this.lottieDrawable.setCallback(this);
        this.composition = c0gy;
        if (C03970Dp.LIZ && C03970Dp.LIZIZ && !this.disableOptInit && (getDrawable() == null || getDrawable() == this.lottieDrawable)) {
            C04740Go c04740Go = this.lottieDrawable;
            C29681Em c29681Em = new C29681Em(this);
            c04740Go.getClass();
            if (c04740Go.LJLILLLLZI == c0gy) {
                setCompositionAfter(false);
                return;
            }
            if (C03970Dp.LIZ) {
                c04740Go.LJLJJLL = false;
            }
            c04740Go.LJI();
            c04740Go.LJLILLLLZI = c0gy;
            if (c0gy != null) {
                String str = c04740Go.LJLL;
                if (str != null) {
                    c0gy.LJIILJJIL = str;
                }
                C0GP c0gp = c04740Go.LJLLI;
                if (c0gp != null) {
                    c0gy.LJIILJJIL = c0gp.getClass().getName();
                }
            }
            C0GU.LJI.execute(new IDRunnableS2S0300000(c0gy, new C1FB(c04740Go, c0gy, c29681Em), c04740Go, 6));
            return;
        }
        setCompositionAfter(this.lottieDrawable.LJIJI(c0gy));
    }

    public void setCompositionAfter(boolean z) {
        Object[] array;
        enableOrDisableHardwareLayer();
        if (getDrawable() == this.lottieDrawable && !z) {
            if (C03970Dp.LIZ) {
                onVisibilityChanged(this, getVisibility());
                return;
            }
            return;
        }
        if (C03970Dp.LIZ) {
            setImageDrawable(null, false);
            setImageDrawable(this.lottieDrawable, false);
            onVisibilityChanged(this, getVisibility());
        } else {
            setImageDrawable(null);
            setImageDrawable(this.lottieDrawable);
        }
        requestLayout();
        if (C03970Dp.LJIIJ) {
            if (this.lottieOnCompositionLoadedListeners.size() > 0 && (array = this.lottieOnCompositionLoadedListeners.toArray()) != null) {
                for (Object obj : array) {
                    if (obj != null && (obj instanceof C0GM)) {
                        ((C0GM) obj).LIZ(this.composition);
                    }
                }
                return;
            }
            return;
        }
        Iterator<C0GM> it = this.lottieOnCompositionLoadedListeners.iterator();
        while (it.hasNext()) {
            it.next().LIZ(this.composition);
        }
    }

    public void setFailureListener(InterfaceC04760Gq<Throwable> interfaceC04760Gq) {
        C0GU c0gu = this.compositionTask;
        if (c0gu != null) {
            c0gu.LJI(this.failureListener);
            this.compositionTask.LIZ(interfaceC04760Gq);
        }
    }

    public void setFrame(int i) {
        this.lottieDrawable.LJIJJLI(i);
    }

    public void setImageAssetDelegate(C0GP c0gp) {
        C04740Go c04740Go = this.lottieDrawable;
        c04740Go.LJLLI = c0gp;
        C10M c10m = c04740Go.LJLJLLL;
        if (c10m != null) {
            c10m.LIZJ = c0gp;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.LJLL = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        INVOKEVIRTUAL_com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_lancet_LottieLancet_recycleBitmaps(this);
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setImageDrawable(drawable, true);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        INVOKEVIRTUAL_com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_lancet_LottieLancet_recycleBitmaps(this);
        cancelLoaderTask();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.lottieDrawable.LJIL(i);
    }

    public void setMaxProgress(float f) {
        this.lottieDrawable.LJJ(f);
    }

    public void setMinFrame(int i) {
        this.lottieDrawable.LJJII(i);
    }

    public void setMinProgress(float f) {
        this.lottieDrawable.LJJIII(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C04740Go c04740Go = this.lottieDrawable;
        c04740Go.LJLLLLLL = z;
        C0GY c0gy = c04740Go.LJLILLLLZI;
        if (c0gy != null) {
            c0gy.LIZ.LIZIZ = z;
        }
    }

    public void setProgress(float f) {
        this.lottieDrawable.LJJIIJ(f);
    }

    public void setRenderMode(EnumC04660Gg enumC04660Gg) {
        this.renderMode = enumC04660Gg;
        enableOrDisableHardwareLayer();
    }

    public void setRepeatCount(int i) {
        this.lottieDrawable.LJLJI.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.lottieDrawable.LJLJI.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.lottieDrawable.LJLJL = z;
    }

    public void setScale(float f) {
        C04740Go c04740Go = this.lottieDrawable;
        c04740Go.LJLJJI = f;
        c04740Go.LJJIIJZLJL();
        if (getDrawable() == this.lottieDrawable) {
            setImageDrawable(null, false);
            setImageDrawable(this.lottieDrawable, false);
        }
    }

    public void setSpeed(float f) {
        this.lottieDrawable.LJLJI.LJLJI = f;
    }

    public void setTextDelegate(C04680Gi c04680Gi) {
        this.lottieDrawable.getClass();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        if (C03970Dp.LIZ && drawable != this.lottieDrawable && (drawable instanceof C04740Go)) {
            C04740Go c04740Go = (C04740Go) drawable;
            if (c04740Go.LJIILL()) {
                c04740Go.LJ();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void useExperimentalHardwareAcceleration(boolean z) {
        useHardwareAcceleration(z);
    }

    public void useHardwareAcceleration(boolean z) {
        this.hasSetUseHardwareLayer = true;
        if (this.useHardwareLayer == z) {
            return;
        }
        this.useHardwareLayer = z;
        enableOrDisableHardwareLayer();
    }

    public void setFontAssetDelegate(C0GN c0gn) {
    }

    public void setAnimation(final String str) {
        try {
            C04020Du.LIZ(this, this.lottieDrawable, str);
            this.animationName = str;
            this.animationResId = 0;
            C0GY LIZ = C263911v.LIZIZ.LIZ(str);
            if (LIZ != null) {
                setComposition(LIZ);
                return;
            }
            clearComposition();
            cancelLoaderTask();
            C0GU<C0GY> LIZJ = C04650Gf.LIZJ(getContext(), str);
            LIZJ.LIZIZ(new InterfaceC04760Gq<C0GY>() { // from class: X.1El
                @Override // X.InterfaceC04760Gq
                public final void onResult(C0GY c0gy) {
                    C263911v.LIZIZ.LIZIZ(c0gy, str);
                }
            });
            LIZJ.LIZIZ(this.loadedListener);
            LIZJ.LIZ(this.failureListener);
            this.compositionTask = LIZJ;
        } catch (Exception e) {
            C0GH.LIZ().LIZ(new IllegalStateException("setAnimation error!", e), str);
        }
    }

    public void setAnimation(JSONObject jSONObject) {
        C04020Du.LIZ(this, this.lottieDrawable, "json object");
        setAnimation(new JsonReader(new StringReader(jSONObject.toString())));
    }

    public void setAnimation(JsonReader jsonReader) {
        setAnimation(jsonReader, (String) null);
    }

    public C29701Eo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadedListener = new InterfaceC04760Gq<C0GY>() { // from class: X.1Ei
            @Override // X.InterfaceC04760Gq
            public final void onResult(C0GY c0gy) {
                C29701Eo.this.setComposition(c0gy);
            }
        };
        this.failureListener = new InterfaceC04760Gq<Throwable>() { // from class: X.1Ej
            @Override // X.InterfaceC04760Gq
            public final void onResult(Throwable th) {
                Throwable th2 = th;
                if (C03970Dp.LIZ && ((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException))) {
                    return;
                }
                C0GK LIZ = C0GH.LIZ();
                IllegalStateException illegalStateException = new IllegalStateException("Unable to parse composition", th2);
                StringBuilder sb = new StringBuilder();
                sb.append(((LinkedHashMap) C263911v.LIZIZ.LIZ.LJII()).keySet().toString());
                java.util.Map<String, C0GU<C0GY>> map = C04650Gf.LIZ;
                if (map != null) {
                    sb.append(" /---/ ");
                    sb.append(((ConcurrentHashMap) map).keySet().toString());
                }
                LIZ.LIZ(illegalStateException, sb.toString());
            }
        };
        this.lottieDrawable = new C04740Go();
        this.playAnimationWhenShown = false;
        this.playAnimationWhenDrawableNotThisLottie = false;
        this.resumeAnimationWhenDrawableNotThisLottie = false;
        this.wasAnimatingWhenNotShown = false;
        this.wasAnimatingWhenDetached = false;
        this.autoPlay = false;
        this.useHardwareLayer = false;
        this.hasSetUseHardwareLayer = false;
        this.disableRecycleBitmap = false;
        this.renderMode = EnumC04660Gg.AUTOMATIC;
        this.disableOptInit = false;
        this.buildDrawingCacheDepth = 0;
        this.lottieOnCompositionLoadedListeners = new HashSet();
        this.forceMarkViewShown = false;
        this.playAction = new IDRunnableS85S0100000(this, 37);
        init(attributeSet);
    }

    public static void com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_lancet_LottieTaskLancet_onRestoreInstanceState(C29701Eo c29701Eo, Parcelable parcelable) {
        try {
            c29701Eo.com_airbnb_lottie_LottieAnimationView__onRestoreInstanceState$___twin___(parcelable);
        } catch (Throwable unused) {
        }
    }

    private void setImageDrawable(Drawable drawable, boolean z) {
        if (z && drawable != this.lottieDrawable) {
            INVOKEVIRTUAL_com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_lancet_LottieLancet_recycleBitmaps(this);
        }
        cancelLoaderTask();
        super.setImageDrawable(drawable);
        if (!C03970Dp.LIZ || !this.isInitialized || drawable != this.lottieDrawable) {
            return;
        }
        if (!isAnimating()) {
            if (this.playAnimationWhenDrawableNotThisLottie) {
                playAnimation();
            } else if (this.resumeAnimationWhenDrawableNotThisLottie) {
                resumeAnimation();
            }
        }
        this.playAnimationWhenDrawableNotThisLottie = false;
        this.resumeAnimationWhenDrawableNotThisLottie = false;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        Integer num;
        super.onVisibilityChanged(view, i);
        if (!C03970Dp.LIZ || !this.isInitialized) {
            return;
        }
        if (isShownM()) {
            if (this.wasAnimatingWhenNotShown) {
                resumeAnimation();
            } else if (this.playAnimationWhenShown) {
                playAnimation();
            }
            this.wasAnimatingWhenNotShown = false;
            this.playAnimationWhenShown = false;
        } else if (isAnimating()) {
            pauseAnimation();
            this.wasAnimatingWhenNotShown = true;
        }
        C04740Go c04740Go = this.lottieDrawable;
        boolean z = this.wasAnimatingWhenNotShown;
        if (C04020Du.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("traceLottieViewOnVisibilityChanged  {isShown=");
            LIZ.append(isShown());
            LIZ.append(" visibility:");
            LIZ.append(getVisibility());
            LIZ.append("  wasAnimatingWhenNotShown=");
            LIZ.append(z);
            LIZ.append("  view=");
            LIZ.append(hashCode());
            LIZ.append(" drawable=");
            if (c04740Go != null) {
                num = Integer.valueOf(c04740Go.hashCode());
            } else {
                num = null;
            }
            LIZ.append(num);
            LIZ.append(" visible:");
            LIZ.append(isShown());
            LIZ.append("}");
            X1D.LIZIZ(LIZ);
        }
    }

    public void setAnimation(final JsonReader jsonReader, final String str) {
        C04020Du.LIZ(this, this.lottieDrawable, "jsonReader");
        clearComposition();
        cancelLoaderTask();
        C0GU<C0GY> LIZ = C04650Gf.LIZ(str, new Callable<C0GQ<C0GY>>() { // from class: X.0Gl
            @Override // java.util.concurrent.Callable
            public final C0GQ<C0GY> call() {
                return C04650Gf.LJIIIIZZ(jsonReader, str);
            }
        });
        LIZ.LIZIZ(this.loadedListener);
        LIZ.LIZ(this.failureListener);
        this.compositionTask = LIZ;
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new JsonReader(new StringReader(str)), str2);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.lottieDrawable.LJJI(i, i2);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.lottieDrawable.LJJIFFI(f, f2);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        C04740Go c04740Go = this.lottieDrawable;
        C10M LJIILIIL = c04740Go.LJIILIIL();
        if (LJIILIIL == null) {
            return null;
        }
        if (bitmap == null) {
            C04750Gp c04750Gp = LJIILIIL.LIZLLL.get(str);
            bitmap = c04750Gp.LJI;
            c04750Gp.LJI = null;
        } else if (C03970Dp.LIZ) {
            Bitmap bitmap2 = LJIILIIL.LIZLLL.get(str).LJI;
            LJIILIIL.LIZIZ(bitmap, str);
            bitmap = bitmap2;
        } else {
            LJIILIIL.LIZIZ(bitmap, str);
        }
        c04740Go.invalidateSelf();
        return bitmap;
    }

    public void setAnimation(int i, C0GG c0gg) {
        setAnimation(i);
    }

    public void setAnimation(String str, C0GG c0gg) {
        setAnimation(str);
    }

    public C29701Eo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.loadedListener = new InterfaceC04760Gq<C0GY>() { // from class: X.1Ei
            @Override // X.InterfaceC04760Gq
            public final void onResult(C0GY c0gy) {
                C29701Eo.this.setComposition(c0gy);
            }
        };
        this.failureListener = new InterfaceC04760Gq<Throwable>() { // from class: X.1Ej
            @Override // X.InterfaceC04760Gq
            public final void onResult(Throwable th) {
                Throwable th2 = th;
                if (C03970Dp.LIZ && ((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException))) {
                    return;
                }
                C0GK LIZ = C0GH.LIZ();
                IllegalStateException illegalStateException = new IllegalStateException("Unable to parse composition", th2);
                StringBuilder sb = new StringBuilder();
                sb.append(((LinkedHashMap) C263911v.LIZIZ.LIZ.LJII()).keySet().toString());
                java.util.Map<String, C0GU<C0GY>> map = C04650Gf.LIZ;
                if (map != null) {
                    sb.append(" /---/ ");
                    sb.append(((ConcurrentHashMap) map).keySet().toString());
                }
                LIZ.LIZ(illegalStateException, sb.toString());
            }
        };
        this.lottieDrawable = new C04740Go();
        this.playAnimationWhenShown = false;
        this.playAnimationWhenDrawableNotThisLottie = false;
        this.resumeAnimationWhenDrawableNotThisLottie = false;
        this.wasAnimatingWhenNotShown = false;
        this.wasAnimatingWhenDetached = false;
        this.autoPlay = false;
        this.useHardwareLayer = false;
        this.hasSetUseHardwareLayer = false;
        this.disableRecycleBitmap = false;
        this.renderMode = EnumC04660Gg.AUTOMATIC;
        this.disableOptInit = false;
        this.buildDrawingCacheDepth = 0;
        this.lottieOnCompositionLoadedListeners = new HashSet();
        this.forceMarkViewShown = false;
        this.playAction = new IDRunnableS85S0100000(this, 37);
        init(attributeSet);
    }

    public <T> void addValueCallback(C263711t c263711t, T t, InterfaceC06820Oo<T> interfaceC06820Oo) {
        this.lottieDrawable.LIZ(c263711t, t, new C06800Om<T>() { // from class: X.1En
            @Override // X.C06800Om
            public final T LIZ(C06790Ol<T> c06790Ol) {
                throw null;
            }
        });
    }

    public <T> void addValueCallback(C263711t c263711t, T t, C06800Om<T> c06800Om) {
        this.lottieDrawable.LIZ(c263711t, t, c06800Om);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        C04740Go c04740Go;
        super.onSizeChanged(i, i2, i3, i4);
        if (C03970Dp.LIZ && C03970Dp.LIZLLL && (c04740Go = this.lottieDrawable) != null) {
            c04740Go.getClass();
            c04740Go.LLFZ = i;
            c04740Go.LLI = i2;
        }
    }
}
