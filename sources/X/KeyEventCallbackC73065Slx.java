package X;

import Y.ALAdapterS4S0000000_12;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Slx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class KeyEventCallbackC73065Slx implements KeyEvent.Callback {
    public static int LJLJI;
    public static int LJLJJI;
    public static C73067Slz LJLJJL;
    public static Window.Callback LJLJJLL;
    public static C73062Slu LJLJL;
    public static C73062Slu LJLJLJ;
    public static ViewGroup LJLJLLL;
    public static ViewGroup.LayoutParams LJLL;
    public static ViewGroup LJLLI;
    public static ImageView LJLLILLLL;
    public static float LJLLJ;
    public static float LJLLL;
    public static float LJLLLL;
    public static float LJLLLLLL;
    public static final KeyEventCallbackC73065Slx LJLIL = new KeyEventCallbackC73065Slx();
    public static final int[] LJLILLLLZI = new int[2];
    public static EnumC73069Sm1 LJLZ = EnumC73069Sm1.PREVIEW;

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        return i == 4;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    public static void LIZIZ() {
        Context context;
        Window window;
        Window window$player_release;
        Activity activity;
        Window window$player_release2;
        View LJ;
        C48843JEx c48843JEx;
        Bitmap videoFrame;
        C73062Slu c73062Slu = LJLJL;
        if (c73062Slu != null) {
            context = c73062Slu.getContext();
        } else {
            context = null;
        }
        C73062Slu c73062Slu2 = LJLJL;
        if (c73062Slu2 != null) {
            window = c73062Slu2.getWindow$player_release();
        } else {
            window = null;
        }
        Window.Callback callback = LJLJJLL;
        if (callback != null && window != null) {
            window.setCallback(callback);
        }
        if (LJLZ == EnumC73069Sm1.PORTRAIT) {
            LJLZ = EnumC73069Sm1.PREVIEW;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ImageView imageView = LJLLILLLL;
            C73062Slu c73062Slu3 = LJLJL;
            if (c73062Slu3 != null && (c48843JEx = (C48843JEx) c73062Slu3.LJ(R.id.n9f)) != null && (videoFrame = c48843JEx.getVideoFrame()) != null && imageView != null) {
                imageView.setImageBitmap(videoFrame);
            }
            LIZ(LJLLILLLL, LJLLI, null);
            LIZJ(LJLJL);
            C73062Slu c73062Slu4 = LJLJL;
            if (c73062Slu4 != null) {
                c73062Slu4.setLayoutParams(LJLL);
            }
            LIZ(LJLJL, LJLJLLL, null);
            C73062Slu c73062Slu5 = LJLJL;
            if (c73062Slu5 != null && (window$player_release2 = c73062Slu5.getWindow$player_release()) != null) {
                C73062Slu c73062Slu6 = LJLJL;
                if (c73062Slu6 != null && (LJ = c73062Slu6.LJ(R.id.kej)) != null) {
                    LJ.setVisibility(8);
                }
                o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                C61713OJx LJ2 = C61712OJw.LJ((ActivityC45651qj) context, window$player_release2);
                LJ2.LIZIZ(false, false);
                LJ2.LIZIZ.LJIIJ(true);
                LJ2.LIZIZ.LJIIL();
                LJ2.LJFF(-1);
                LJ2.LIZIZ.LJII(true);
                LJ2.LIZJ();
            }
            C73062Slu c73062Slu7 = LJLJLJ;
            if (c73062Slu7 != null) {
                c73062Slu7.LJIIIZ(LJLZ);
            }
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.Sly
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                    ImageView imageView2 = KeyEventCallbackC73065Slx.LJLLILLLL;
                    o.LJI(imageView2);
                    ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    float f = KeyEventCallbackC73065Slx.LJLLL;
                    float f2 = KeyEventCallbackC73065Slx.LJLLLLLL;
                    float f3 = 2;
                    float f4 = (f - f2) / f3;
                    int[] iArr = KeyEventCallbackC73065Slx.LJLILLLLZI;
                    marginLayoutParams.topMargin = (int) C06420Na.LIZIZ(iArr[1], f4, floatValue, f4);
                    float f5 = KeyEventCallbackC73065Slx.LJLLJ;
                    float f6 = KeyEventCallbackC73065Slx.LJLLLL;
                    float f7 = (f5 - f6) / f3;
                    marginLayoutParams.leftMargin = (int) C06420Na.LIZIZ(iArr[0], f7, floatValue, f7);
                    float f8 = KeyEventCallbackC73065Slx.LJLJJI;
                    float f9 = 1.0f - floatValue;
                    marginLayoutParams.width = (int) C06420Na.LIZIZ(f6, f8, f9, f8);
                    float f10 = KeyEventCallbackC73065Slx.LJLJI;
                    marginLayoutParams.height = (int) C06420Na.LIZIZ(f2, f10, f9, f10);
                    ImageView imageView3 = KeyEventCallbackC73065Slx.LJLLILLLL;
                    if (imageView3 == null) {
                        return;
                    }
                    imageView3.setLayoutParams(marginLayoutParams);
                }
            });
            ofFloat.addListener(new ALAdapterS4S0000000_12(0));
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.start();
            return;
        }
        if (LJLZ != EnumC73069Sm1.HORIZONTAL) {
            return;
        }
        LJLZ = EnumC73069Sm1.PREVIEW;
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            try {
                activity.setRequestedOrientation(1);
            } catch (Throwable unused) {
            }
        }
        LIZJ(LJLJL);
        C73062Slu c73062Slu8 = LJLJL;
        if (c73062Slu8 != null) {
            c73062Slu8.setLayoutParams(LJLL);
        }
        LIZ(LJLJL, LJLJLLL, null);
        C73062Slu c73062Slu9 = LJLJL;
        if (c73062Slu9 != null && (window$player_release = c73062Slu9.getWindow$player_release()) != null) {
            o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C61713OJx LJ3 = C61712OJw.LJ((ActivityC45651qj) context, window$player_release);
            LJ3.LIZIZ(false, false);
            LJ3.LIZIZ.LJIIJ(true);
            LJ3.LIZIZ.LJIIL();
            LJ3.LJFF(-1);
            LJ3.LIZIZ.LJII(true);
            LJ3.LIZJ();
        }
        C73062Slu c73062Slu10 = LJLJLJ;
        if (c73062Slu10 != null) {
            c73062Slu10.LJIIIZ(LJLZ);
        }
        LJLLI = null;
        LJLLILLLL = null;
        LJLJL = null;
        LJLJLLL = null;
        LJLL = null;
        LJLJLJ = null;
        LJLJJL = null;
        LJLJJLL = null;
    }

    public static void LIZJ(View view) {
        ViewGroup viewGroup;
        if (view == null || view.getParent() == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        try {
            C16880lQ.LJLLL(view, viewGroup);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        if ((LJLZ != EnumC73069Sm1.PORTRAIT && LJLZ != EnumC73069Sm1.HORIZONTAL) || i != 4 || event.isCanceled()) {
            return false;
        }
        LIZIZ();
        return true;
    }

    public static void LIZ(View view, ViewGroup viewGroup, Integer num) {
        int intValue;
        if (viewGroup != null) {
            try {
                if (num == null) {
                    intValue = viewGroup.getChildCount();
                } else {
                    intValue = num.intValue();
                }
                viewGroup.addView(view, intValue);
            } catch (Exception unused) {
            }
        }
    }
}
