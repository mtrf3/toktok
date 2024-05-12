package X;

import X.InterfaceC81253Vuj;
import Y.ARunnableS16S0201000_13;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class VA9<DH extends InterfaceC81253Vuj> extends ImageView {
    public static boolean sGlobalLegacyVisibilityHandlingEnabled;
    public float mAspectRatio;
    public C81250Vug<DH> mDraweeHolder;
    public boolean mInitialised;
    public UHT mLazySizeAttach;
    public boolean mLegacyVisibilityHandlingEnabled;
    public final VAC mMeasureSpec;
    public VAA mSizeDeterminer;

    public void com_facebook_drawee_view_DraweeView__onDraw$___twin___(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_simpleDraweeViewOnDetachedFromWindow(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_DraweeViewLanect_onDraw(this, canvas);
    }

    public void cancelLazySizeAttach() {
        UHT uht = this.mLazySizeAttach;
        if (uht != null) {
            ((ArrayList) this.mSizeDeterminer.LIZIZ).remove(uht);
            this.mLazySizeAttach = null;
        }
    }

    public void doAttach() {
        this.mDraweeHolder.LJ();
    }

    public void doDetach() {
        this.mDraweeHolder.LJFF();
    }

    public InterfaceC81252Vui getController() {
        return this.mDraweeHolder.LJ;
    }

    public DH getHierarchy() {
        DH dh = this.mDraweeHolder.LIZLLL;
        dh.getClass();
        return dh;
    }

    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.LIZJ();
    }

    public boolean hasController() {
        if (this.mDraweeHolder.LJ != null) {
            return true;
        }
        return false;
    }

    public boolean hasHierarchy() {
        if (this.mDraweeHolder.LIZLLL != null) {
            return true;
        }
        return false;
    }

    public boolean hasLazySizeAttached() {
        if (this.mLazySizeAttach != null) {
            return true;
        }
        return false;
    }

    public void maybeOverrideVisibilityHandling() {
        Drawable drawable;
        boolean z;
        if (this.mLegacyVisibilityHandlingEnabled && (drawable = getDrawable()) != null) {
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    public void com_facebook_drawee_view_DraweeView__onDetachedFromWindow$___twin___() {
        super.onDetachedFromWindow();
        maybeOverrideVisibilityHandling();
        this.mSizeDeterminer.LIZ();
        onDetach();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    @Override // android.view.View
    public String toString() {
        String str;
        C81254Vuk LIZIZ = C81256Vum.LIZIZ(this);
        C81250Vug<DH> c81250Vug = this.mDraweeHolder;
        if (c81250Vug != null) {
            str = c81250Vug.toString();
        } else {
            str = "<no holder set>";
        }
        LIZIZ.LIZIZ(str, "holder");
        return LIZIZ.toString();
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    public void onAttach() {
        doAttach();
    }

    public void onDetach() {
        doDetach();
    }

    public VA9(Context context) {
        super(context);
        this.mMeasureSpec = new VAC();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    public static void com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_simpleDraweeViewOnDetachedFromWindow(VA9 va9) {
        va9.com_facebook_drawee_view_DraweeView__onDetachedFromWindow$___twin___();
        C54339LUh.LIZ(va9);
    }

    private void init(Context context) {
        try {
            C81939WDv.LIZIZ();
            if (this.mInitialised) {
                return;
            }
            boolean z = true;
            this.mInitialised = true;
            this.mDraweeHolder = new C81250Vug<>(null);
            this.mSizeDeterminer = new VAA(this);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.mLegacyVisibilityHandlingEnabled = z;
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        sGlobalLegacyVisibilityHandlingEnabled = z;
    }

    public void controllerAttachSizeDeterminer(InterfaceC81252Vui interfaceC81252Vui) {
        if (interfaceC81252Vui instanceof W4R) {
            W4R w4r = (W4R) interfaceC81252Vui;
            W5O w5o = w4r.LJIJI;
            if (w5o != null) {
                w5o.LJIJI = this.mSizeDeterminer;
            } else {
                w4r.LJIJJ = this.mSizeDeterminer;
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.LJI(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f) {
        if (f == this.mAspectRatio) {
            return;
        }
        this.mAspectRatio = f;
        requestLayout();
    }

    public void setController(InterfaceC81252Vui interfaceC81252Vui) {
        cancelLazySizeAttach();
        controllerAttachSizeDeterminer(interfaceC81252Vui);
        this.mDraweeHolder.LJII(interfaceC81252Vui);
        super.setImageDrawable(this.mDraweeHolder.LIZJ());
    }

    public void setHierarchy(DH dh) {
        this.mDraweeHolder.LJIIIIZZ(dh);
        super.setImageDrawable(this.mDraweeHolder.LIZJ());
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        init(getContext());
        cancelLazySizeAttach();
        this.mDraweeHolder.LJII(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        init(getContext());
        cancelLazySizeAttach();
        this.mDraweeHolder.LJII(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        init(getContext());
        cancelLazySizeAttach();
        this.mDraweeHolder.LJII(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        init(getContext());
        cancelLazySizeAttach();
        this.mDraweeHolder.LJII(null);
        super.setImageURI(uri);
    }

    public void setLazySizeAttach(UHT uht) {
        if (this.mLazySizeAttach != null) {
            cancelLazySizeAttach();
        }
        this.mLazySizeAttach = uht;
        VAA vaa = this.mSizeDeterminer;
        View LJ = vaa.LJ();
        if (LJ == null) {
            return;
        }
        int LIZLLL = VAA.LIZLLL(LJ);
        int LIZJ = VAA.LIZJ(LJ);
        if ((LIZLLL > 0 || LIZLLL == Integer.MIN_VALUE) && (LIZJ > 0 || LIZJ == Integer.MIN_VALUE)) {
            uht.LIZ(LIZLLL, LIZJ);
            return;
        }
        if (!((ArrayList) vaa.LIZIZ).contains(uht)) {
            ((ArrayList) vaa.LIZIZ).add(uht);
        }
        if (vaa.LIZJ != null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = LJ.getViewTreeObserver();
        VAB vab = new VAB(vaa);
        vaa.LIZJ = vab;
        viewTreeObserver.addOnPreDrawListener(vab);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.mLegacyVisibilityHandlingEnabled = z;
    }

    public VA9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMeasureSpec = new VAC();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    public static void com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_DraweeViewLanect_onDraw(VA9 va9, Canvas canvas) {
        if (C52275KfP.LIZ == null) {
            C52275KfP.LIZ = C03090Af.LIZIZ("catch_baseCanvasRecycleCrash", false);
        }
        Boolean bool = C52275KfP.LIZ;
        o.LJI(bool);
        if (!bool.booleanValue()) {
            va9.com_facebook_drawee_view_DraweeView__onDraw$___twin___(canvas);
            return;
        }
        try {
            va9.com_facebook_drawee_view_DraweeView__onDraw$___twin___(canvas);
        } catch (RuntimeException e) {
            try {
                C29192Bcy.LIZ(va9);
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
            throw e;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        VAC vac = this.mMeasureSpec;
        vac.LIZ = i;
        vac.LIZIZ = i2;
        float f = this.mAspectRatio;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (f > 0.0f && layoutParams != null) {
            int i3 = layoutParams.height;
            if (i3 == 0 || i3 == -2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vac.LIZIZ = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(vac.LIZ) - paddingRight) / f) + paddingBottom), vac.LIZIZ), 1073741824);
            } else {
                int i4 = layoutParams.width;
                if (i4 == 0 || i4 == -2) {
                    vac.LIZ = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(vac.LIZIZ) - paddingBottom) * f) + paddingRight), vac.LIZ), 1073741824);
                }
            }
        }
        VAC vac2 = this.mMeasureSpec;
        super.onMeasure(vac2.LIZ, vac2.LIZIZ);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        FT1.LIZ().execute(new ARunnableS16S0201000_13(i, view, this, 11));
    }

    public VA9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMeasureSpec = new VAC();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    public VA9(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mMeasureSpec = new VAC();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }
}
