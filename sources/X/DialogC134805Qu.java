package X;

import Y.ARunnableS21S0200000_2;
import Y.IDAListenerS230S0100000_2;
import Y.IDLListenerS56S0200000_2;
import android.animation.Animator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.ArrayMap;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.ugc.android.editor.components.base.transition.DavinciViewPositionRect;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS62S0400000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class DialogC134805Qu extends Dialog implements C52Q {
    public final EditorProContext LJLIL;
    public final C134745Qo LJLILLLLZI;
    public ViewParent LJLJI;
    public SurfaceView LJLJJI;
    public ViewGroup.LayoutParams LJLJJL;
    public int[] LJLJJLL;
    public View LJLJL;
    public FrameLayout LJLJLJ;
    public ImageView LJLJLLL;
    public ImageView LJLL;
    public C87230YLi LJLLI;
    public DavinciViewPositionRect LJLLILLLL;
    public C134825Qw LJLLJ;
    public final ArrayMap<String, View> LJLLL;
    public InterfaceC134705Qk LJLLLL;
    public InterfaceC134705Qk LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public InterfaceC88477Ynx<? super NLEModel, ? super FrameLayout, ? super java.util.Map<String, View>, ? super Long, ? super Float, ? super Float, ? super Float, C76800UCe> LJZ;
    public InterfaceC88473Ynt<? super Long, ? super java.util.Map<String, ? extends View>, ? super NLEModel, C76800UCe> LJZI;
    public InterfaceC65784Pro<Bitmap> LJZL;
    public NLEModel LL;
    public long LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public C5R5 LLFZ;
    public final C134735Qn LLI;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.LLFFF = false;
        this.LLFF = false;
        C134825Qw c134825Qw = this.LJLLJ;
        if (c134825Qw != null) {
            c134825Qw.LIZ().setListener(null);
            c134825Qw.LIZ().cancel();
            c134825Qw.LIZ.clearAnimation();
        }
        ((Handler) this.LJLZ.getValue()).removeCallbacksAndMessages(null);
        InterfaceC134705Qk interfaceC134705Qk = this.LJLLLL;
        if (interfaceC134705Qk != null) {
            interfaceC134705Qk.onDestroy();
        }
        InterfaceC134705Qk interfaceC134705Qk2 = this.LJLLLLLL;
        if (interfaceC134705Qk2 != null) {
            interfaceC134705Qk2.onDestroy();
        }
        C134745Qo c134745Qo = this.LJLILLLLZI;
        Iterator<C5JL> it = c134745Qo.LIZIZ.iterator();
        while (it.hasNext()) {
            C5JL next = it.next();
            C5J1 V8 = c134745Qo.LIZ.V8();
            if (V8 != null) {
                V8.LJJJJJL(next);
            }
        }
        c134745Qo.LIZIZ.clear();
        super.dismiss();
    }

    @Override // X.C52Q
    public final void onDestroy() {
        this.LLFZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.5R3, android.view.ViewTreeObserver$OnDrawListener] */
    @Override // android.app.Dialog, X.C52Q
    public final void show() {
        long j;
        C134825Qw c134825Qw;
        Bitmap invoke;
        ImageView imageView;
        C133775Mv P8;
        Bitmap LJII;
        if (this.LLFFF) {
            return;
        }
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "6658301123837516882")).LIZ) {
            super.show();
        }
        final ImageView imageView2 = this.LJLJLLL;
        ViewParent viewParent = null;
        if (imageView2 != null && (P8 = this.LJLILLLLZI.LIZ.P8()) != null && (LJII = P8.LJII(-1)) != null) {
            imageView2.setImageBitmap(LJII);
            final AqS149S0200000_2 aqS149S0200000_2 = new AqS149S0200000_2(imageView2, this, 105);
            final C34K c34k = new C34K();
            final ?? r1 = new ViewTreeObserver.OnDrawListener() { // from class: X.5R3
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    if (C34K.this.element) {
                        return;
                    }
                    aqS149S0200000_2.invoke();
                    C34K.this.element = true;
                    View view = imageView2;
                    view.post(new ARunnableS21S0200000_2(this, view, 55));
                }
            };
            if (imageView2.getViewTreeObserver().isAlive() && imageView2.isAttachedToWindow()) {
                imageView2.getViewTreeObserver().addOnDrawListener(r1);
            } else {
                imageView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.5R2
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View v) {
                        o.LJIIIZ(v, "v");
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View v) {
                        o.LJIIIZ(v, "v");
                        if (imageView2.getViewTreeObserver().isAlive()) {
                            imageView2.getViewTreeObserver().addOnDrawListener(r1);
                        }
                        imageView2.removeOnAttachStateChangeListener(this);
                    }
                });
            }
        }
        InterfaceC65784Pro<Bitmap> interfaceC65784Pro = this.LJZL;
        if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null && (imageView = this.LJLL) != null) {
            imageView.setImageBitmap(invoke);
        }
        SurfaceView surfaceView = this.LJLJJI;
        if (surfaceView != null) {
            viewParent = surfaceView.getParent();
        }
        this.LJLJI = viewParent;
        this.LLFFF = true;
        C5J1 V8 = this.LJLILLLLZI.LIZ.V8();
        if (V8 != null) {
            j = V8.getCurrentPosition();
        } else {
            j = 0;
        }
        this.LLD = j;
        LJ();
        LIZLLL();
        boolean isPlaying = this.LJLIL.getPlayer().isPlaying();
        InterfaceC134705Qk interfaceC134705Qk = this.LJLLLL;
        if (interfaceC134705Qk != null) {
            interfaceC134705Qk.LLLLLZL(isPlaying, false);
        }
        InterfaceC134705Qk interfaceC134705Qk2 = this.LJLLLLLL;
        if (interfaceC134705Qk2 != null) {
            interfaceC134705Qk2.LLLLLZL(isPlaying, false);
        }
        final DavinciViewPositionRect davinciViewPositionRect = this.LJLLILLLL;
        if (davinciViewPositionRect != null && (c134825Qw = this.LJLLJ) != null) {
            c134825Qw.LJFF = true;
            c134825Qw.LJ = davinciViewPositionRect;
            c134825Qw.LIZJ.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS56S0200000_2(new C5R4() { // from class: X.5Qx
                @Override // X.C5R4
                public final void LIZJ(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                }

                @Override // X.C5R4
                public final void LIZ() {
                    C5R5 c5r5 = DialogC134805Qu.this.LLFZ;
                    if (c5r5 != null) {
                        c5r5.LIZJ();
                    }
                }

                @Override // X.C5R4
                public final void LIZIZ() {
                    ViewGroup.LayoutParams layoutParams;
                    View findViewById;
                    SurfaceView surfaceView2 = DialogC134805Qu.this.LJLJJI;
                    if (surfaceView2 != null) {
                        surfaceView2.setVisibility(8);
                    }
                    C76732zl c76732zl = new C76732zl();
                    int i = -1;
                    c76732zl.element = -1;
                    C76732zl c76732zl2 = new C76732zl();
                    c76732zl2.element = -1;
                    C56K c56k = new C56K();
                    c56k.element = -1.0f;
                    DavinciViewPositionRect davinciViewPositionRect2 = davinciViewPositionRect;
                    int i2 = davinciViewPositionRect2.right - davinciViewPositionRect2.left;
                    int i3 = davinciViewPositionRect2.bottom - davinciViewPositionRect2.top;
                    Context context = DialogC134805Qu.this.getContext();
                    o.LJIIIIZZ(context, "context");
                    int LIZIZ = C134855Qz.LIZIZ(context);
                    View view = DialogC134805Qu.this.LJLJL;
                    if (view != null && (findViewById = view.findViewById(R.id.dhw)) != null) {
                        i = findViewById.getMeasuredHeight();
                    }
                    if (i2 > 0 && i3 > 0 && LIZIZ > 0 && i > 0) {
                        float f = i2;
                        DialogC134805Qu.this.getClass();
                        OSZ LIZIZ2 = DialogC134805Qu.LIZIZ(f / i3, LIZIZ, i);
                        c76732zl.element = (int) ((Number) LIZIZ2.getFirst()).floatValue();
                        c76732zl2.element = (int) ((Number) LIZIZ2.getSecond()).floatValue();
                        c56k.element = c76732zl.element / f;
                        View findViewById2 = DialogC134805Qu.this.findViewById(R.id.dfv);
                        if (findViewById2 != null && (layoutParams = findViewById2.getLayoutParams()) != null) {
                            layoutParams.width = c76732zl.element;
                            layoutParams.height = c76732zl2.element;
                        }
                    }
                    C2ND.LIZ(new AqS62S0400000_2(DialogC134805Qu.this, c76732zl, c76732zl2, c56k, 4), 100L);
                }

                @Override // X.C5R4
                public final void LIZLLL(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    DialogC134805Qu.this.LLFFF = false;
                }
            }, c134825Qw, 3));
        }
        InterfaceC134705Qk interfaceC134705Qk3 = this.LJLLLLLL;
        if (interfaceC134705Qk3 != null) {
            interfaceC134705Qk3.LLLLLLZZ(((float) this.LLD) / 1000.0f, true);
        }
        InterfaceC134705Qk interfaceC134705Qk4 = this.LJLLLL;
        if (interfaceC134705Qk4 != null) {
            interfaceC134705Qk4.LLLLLLZZ(((float) this.LLD) / 1000.0f, true);
        }
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -1;
            attributes.windowAnimations = 0;
            window.setAttributes(attributes);
        }
    }

    public final boolean LIZJ() {
        Iterator<View> it = this.LJLLL.values().iterator();
        while (it.hasNext()) {
            if (it.next().getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void LJ() {
        if (this.LLFFF) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.2f, 1, 0.0f);
            translateAnimation.setDuration(200L);
            translateAnimation.setStartOffset(200L);
            translateAnimation.setFillAfter(true);
            translateAnimation.setInterpolator(new C58V());
            translateAnimation.setAnimationListener(new IDAListenerS230S0100000_2(this, 3));
            InterfaceC134705Qk interfaceC134705Qk = this.LJLLLLLL;
            if (interfaceC134705Qk != null) {
                interfaceC134705Qk.LLLLLZIL(translateAnimation, true);
                return;
            }
            return;
        }
        if (!this.LLFF) {
            return;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.2f);
        translateAnimation2.setDuration(200L);
        translateAnimation2.setFillAfter(true);
        translateAnimation2.setInterpolator(new C58V());
        translateAnimation2.setAnimationListener(new IDAListenerS230S0100000_2(this, 4));
        InterfaceC134705Qk interfaceC134705Qk2 = this.LJLLLL;
        if (interfaceC134705Qk2 != null) {
            interfaceC134705Qk2.LLLLLZIL(null, false);
        }
        InterfaceC134705Qk interfaceC134705Qk3 = this.LJLLLLLL;
        if (interfaceC134705Qk3 == null) {
            return;
        }
        interfaceC134705Qk3.LLLLLZIL(translateAnimation2, false);
    }

    @Override // X.C52Q
    public final float LLZZZZ() {
        long j;
        C5J1 V8 = this.LJLILLLLZI.LIZ.V8();
        if (V8 != null) {
            j = V8.getDuration();
        } else {
            j = 0;
        }
        return ((float) j) / 1000.0f;
    }

    @Override // X.C52Q
    public final float b() {
        long j;
        C5J1 V8 = this.LJLILLLLZI.LIZ.V8();
        if (V8 != null) {
            j = V8.getCurrentPosition();
        } else {
            j = 0;
        }
        return ((float) j) / 1000.0f;
    }

    @Override // X.C52Q
    public final void c() {
        if (!this.LJLILLLLZI.LIZ()) {
            this.LJLILLLLZI.LIZJ();
        } else {
            this.LJLILLLLZI.LIZIZ();
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        Bitmap LIZIZ;
        ImageView imageView;
        Bitmap LJII;
        ImageView imageView2;
        View decorView;
        WindowManager windowManager;
        int i;
        C134825Qw c134825Qw;
        if (this.LLFF || this.LLFFF) {
            return;
        }
        this.LLFF = true;
        this.LLF = this.LJLILLLLZI.LIZ();
        this.LJLILLLLZI.LIZIZ();
        FrameLayout frameLayout = this.LJLJLJ;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            C133775Mv P8 = this.LJLILLLLZI.LIZ.P8();
            if (P8 != null && (LJII = P8.LJII(-1)) != null && (imageView2 = this.LJLJLLL) != null) {
                imageView2.setImageBitmap(LJII);
            }
            if (LIZJ()) {
                View findViewById = findViewById(R.id.dfv);
                if (findViewById != null && (LIZIZ = C140545fO.LIZIZ(findViewById, null, null)) != null && (imageView = this.LJLL) != null) {
                    imageView.setImageBitmap(LIZIZ);
                }
            } else {
                ImageView imageView3 = this.LJLL;
                if (imageView3 != null) {
                    imageView3.setImageBitmap(null);
                }
            }
            FrameLayout frameLayout2 = this.LJLJLJ;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
        }
        LJ();
        LIZLLL();
        InterfaceC134705Qk interfaceC134705Qk = this.LJLLLL;
        if (interfaceC134705Qk != null) {
            interfaceC134705Qk.onHide();
        }
        InterfaceC134705Qk interfaceC134705Qk2 = this.LJLLLLLL;
        if (interfaceC134705Qk2 != null) {
            interfaceC134705Qk2.onHide();
        }
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            int measuredHeight = decorView.getMeasuredHeight();
            Context context = getContext();
            if (context != null) {
                if (context instanceof Activity) {
                    windowManager = ((Activity) context).getWindowManager();
                    o.LJIIIIZZ(windowManager, "{\n            context.windowManager\n        }");
                } else {
                    Object LLILL = C16880lQ.LLILL(context, "window");
                    o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
                    windowManager = (WindowManager) LLILL;
                }
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (defaultDisplay != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getRealMetrics(displayMetrics);
                    i = displayMetrics.heightPixels;
                    if (measuredHeight == i && (c134825Qw = this.LJLLJ) != null) {
                        c134825Qw.LJFF = false;
                    }
                }
            }
            i = 0;
            if (measuredHeight == i) {
                c134825Qw.LJFF = false;
            }
        }
        C134825Qw c134825Qw2 = this.LJLLJ;
        if (c134825Qw2 != null) {
            C5R4 c5r4 = new C5R4() { // from class: X.5Qv
                @Override // X.C5R4
                public final void LIZJ(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                }

                @Override // X.C5R4
                public final void LIZLLL(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                }

                @Override // X.C5R4
                public final void LIZ() {
                    C5R5 c5r5 = DialogC134805Qu.this.LLFZ;
                    if (c5r5 != null) {
                        c5r5.LIZ();
                    }
                    DialogC134805Qu.this.LIZ(true);
                }

                @Override // X.C5R4
                public final void LIZIZ() {
                    long j;
                    SurfaceView surfaceView;
                    ViewTreeObserver viewTreeObserver;
                    DialogC134805Qu dialogC134805Qu = DialogC134805Qu.this;
                    ViewParent viewParent = dialogC134805Qu.LJLJI;
                    if (viewParent != null) {
                        ((ViewGroup) viewParent).addView(dialogC134805Qu.LJLJJI, dialogC134805Qu.LJLJJL);
                        int[] iArr = dialogC134805Qu.LJLJJLL;
                        if (iArr != null && (surfaceView = dialogC134805Qu.LJLJJI) != null && (viewTreeObserver = surfaceView.getViewTreeObserver()) != null) {
                            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS56S0200000_2(iArr, dialogC134805Qu, 4));
                        }
                    }
                    C134745Qo c134745Qo = dialogC134805Qu.LJLILLLLZI;
                    EditorProContext editorProContext = dialogC134805Qu.LJLIL;
                    C5J1 V8 = c134745Qo.LIZ.V8();
                    if (V8 != null) {
                        j = V8.getCurrentPosition();
                    } else {
                        j = 0;
                    }
                    C79057V0z.LJJJJL(editorProContext, "move_track_to_position", Long.valueOf(j));
                    if (dialogC134805Qu.LLF) {
                        dialogC134805Qu.LJLIL.getPlayer().play();
                        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(1);
                    } else {
                        dialogC134805Qu.LJLIL.getPlayer().pause();
                        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(3);
                    }
                    DialogC134805Qu dialogC134805Qu2 = DialogC134805Qu.this;
                    C5R5 c5r5 = dialogC134805Qu2.LLFZ;
                    if (c5r5 != null) {
                        c5r5.LIZIZ(dialogC134805Qu2.LLF);
                    }
                    ((Handler) DialogC134805Qu.this.LJLZ.getValue()).sendEmptyMessageDelayed(600, 50L);
                }
            };
            DavinciViewPositionRect davinciViewPositionRect = c134825Qw2.LJ;
            if (davinciViewPositionRect != null) {
                if (davinciViewPositionRect.right - davinciViewPositionRect.left == 0 || davinciViewPositionRect.bottom - davinciViewPositionRect.top == 0 || Float.isNaN(davinciViewPositionRect.ratio) || Float.isInfinite(davinciViewPositionRect.ratio)) {
                    c5r4.LIZ();
                    c5r4.LIZIZ();
                } else {
                    c134825Qw2.LIZIZ(davinciViewPositionRect, false, new C5R1(c5r4));
                }
            }
        }
    }

    public final void LIZLLL() {
        View findViewById = findViewById(R.id.n1x);
        if (this.LLFFF) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setStartOffset(200L);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setAnimationListener(new IDAListenerS230S0100000_2(findViewById, 1));
            findViewById.startAnimation(alphaAnimation);
            return;
        }
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setFillAfter(true);
        alphaAnimation2.setDuration(200L);
        alphaAnimation2.setAnimationListener(new IDAListenerS230S0100000_2(findViewById, 2));
        findViewById.startAnimation(alphaAnimation2);
    }

    @Override // X.C52Q
    public final void a() {
        onBackPressed();
    }

    public final void LIZ(boolean z) {
        ViewParent viewParent;
        ViewGroup.LayoutParams layoutParams;
        SurfaceView surfaceView = this.LJLJJI;
        int[] iArr = null;
        if (surfaceView != null) {
            viewParent = surfaceView.getParent();
        } else {
            viewParent = null;
        }
        if (z) {
            findViewById(R.id.dfv).setVisibility(8);
            if (viewParent != null && (viewParent instanceof FrameLayout)) {
                C16880lQ.LJLLLL(this.LJLJJI, (FrameLayout) viewParent);
                return;
            }
            return;
        }
        if (viewParent != null && (viewParent instanceof FrameLayout)) {
            C16880lQ.LJLLLL(this.LJLJJI, (FrameLayout) viewParent);
        }
        SurfaceView surfaceView2 = this.LJLJJI;
        if (surfaceView2 != null) {
            layoutParams = surfaceView2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        this.LJLJJL = layoutParams;
        int[] t5 = this.LJLIL.getPlayer().t5();
        if (t5 != null) {
            this.LJLIL.getNleSession().P8().LJIJJLI(1.0f, 1.0f, 0.0f, 0, 0);
            iArr = t5;
        }
        this.LJLJJLL = iArr;
        ((ViewGroup) findViewById(R.id.dfv)).addView(this.LJLJJI, -1, -1);
        findViewById(R.id.dfv).setVisibility(0);
        C87230YLi c87230YLi = this.LJLLI;
        if (c87230YLi != null) {
            c87230YLi.setEnableTouchEvent(true);
        }
        C87230YLi c87230YLi2 = this.LJLLI;
        if (c87230YLi2 == null) {
            return;
        }
        c87230YLi2.setOnGestureListener(new InterfaceC87234YLm() { // from class: X.5Qt
            @Override // X.InterfaceC87234YLm
            public final void LJJIZ(float f) {
            }

            @Override // X.InterfaceC87234YLm
            public final boolean LJJJ(MotionEvent motionEvent) {
                return false;
            }

            @Override // X.InterfaceC87234YLm
            public final void LJJJI() {
            }

            @Override // X.InterfaceC87234YLm
            public final void LJJJIL() {
            }

            @Override // X.InterfaceC87234YLm
            public final void onScale(float f) {
            }

            @Override // X.InterfaceC87234YLm
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return false;
            }

            @Override // X.InterfaceC87234YLm
            public final void LJJIIZI(MotionEvent event) {
                o.LJIIIZ(event, "event");
                DialogC134805Qu dialogC134805Qu = DialogC134805Qu.this;
                if (dialogC134805Qu.LLFII) {
                    dialogC134805Qu.onBackPressed();
                }
            }

            @Override // X.InterfaceC87234YLm
            public final boolean LJJJJ(MotionEvent event) {
                o.LJIIIZ(event, "event");
                return false;
            }

            @Override // X.InterfaceC87234YLm
            public final void onDown(MotionEvent event) {
                o.LJIIIZ(event, "event");
            }

            @Override // X.InterfaceC87234YLm
            public final void onLongPress(MotionEvent e) {
                o.LJIIIZ(e, "e");
            }

            @Override // X.InterfaceC87234YLm
            public final void LJJJJI(float f, float f2, int i) {
                Bitmap bitmap;
                Bitmap LIZIZ;
                ImageView imageView;
                DialogC134805Qu dialogC134805Qu = DialogC134805Qu.this;
                if (dialogC134805Qu.LLFF || dialogC134805Qu.LLFFF || i > 1) {
                    return;
                }
                dialogC134805Qu.LJLILLLLZI.LIZIZ();
                DialogC134805Qu dialogC134805Qu2 = DialogC134805Qu.this;
                dialogC134805Qu2.LLFII = true;
                FrameLayout frameLayout = dialogC134805Qu2.LJLJLJ;
                if (frameLayout == null || frameLayout.getVisibility() != 0) {
                    C133775Mv P8 = DialogC134805Qu.this.LJLILLLLZI.LIZ.P8();
                    if (P8 != null) {
                        bitmap = P8.LJII(-1);
                    } else {
                        bitmap = null;
                    }
                    ImageView imageView2 = DialogC134805Qu.this.LJLJLLL;
                    if (imageView2 != null) {
                        imageView2.setImageBitmap(bitmap);
                    }
                    if (DialogC134805Qu.this.LIZJ()) {
                        View findViewById = DialogC134805Qu.this.findViewById(R.id.dfv);
                        if (findViewById != null && (LIZIZ = C140545fO.LIZIZ(findViewById, null, null)) != null && (imageView = DialogC134805Qu.this.LJLL) != null) {
                            imageView.setImageBitmap(LIZIZ);
                        }
                    } else {
                        ImageView imageView3 = DialogC134805Qu.this.LJLL;
                        if (imageView3 != null) {
                            imageView3.setImageBitmap(null);
                        }
                    }
                    FrameLayout frameLayout2 = DialogC134805Qu.this.LJLJLJ;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(0);
                    }
                    DialogC134805Qu.this.findViewById(R.id.dfv).setVisibility(4);
                }
                FrameLayout frameLayout3 = DialogC134805Qu.this.LJLJLJ;
                if (frameLayout3 == null) {
                    return;
                }
                frameLayout3.setTranslationX(frameLayout3.getTranslationX() + f);
                frameLayout3.setTranslationY(frameLayout3.getTranslationY() + f2);
            }
        });
    }

    @Override // X.C52Q
    public final void LJJLIIIIJ(int i) {
        View findViewById = findViewById(R.id.n1x);
        if (findViewById != null) {
            findViewById.setBackgroundColor(i);
        }
        FrameLayout frameLayout = this.LJLJLJ;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(i);
        }
        Window window = getWindow();
        if (window != null) {
            window.setNavigationBarColor(i);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(0);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
        }
    }

    @Override // X.C52Q
    public final void LLZZZIL(int i) {
        View findViewById = findViewById(R.id.buy);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            findViewById.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // X.C52Q
    public final void e(C52P c52p) {
        this.LLFZ = c52p;
    }

    @Override // X.C52Q
    public final void d(long j, final C5RC c5rc) {
        C134745Qo c134745Qo = this.LJLILLLLZI;
        c134745Qo.LIZLLL(1000 * j, c134745Qo.LIZ(), EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek, new AnonymousClass519() { // from class: X.5R6
            @Override // X.AnonymousClass519
            public final void LIZ(int i) {
                C5R8 c5r8 = c5rc;
                if (c5r8 != null) {
                    c5r8.LIZ();
                }
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.5Qn] */
    public DialogC134805Qu(Context context, InterfaceC126684y8 mediaSession, EditorProContext editorContext) {
        super(context, R.style.hz);
        o.LJIIIZ(mediaSession, "mediaSession");
        o.LJIIIZ(editorContext, "editorContext");
        this.LJLIL = editorContext;
        this.LJLILLLLZI = new C134745Qo(mediaSession);
        this.LJLLL = new ArrayMap<>();
        this.LJLZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1027));
        this.LLI = new C5JL() { // from class: X.5Qn
            @Override // X.C5JL
            public final void LIZ(int i, int i2, float f, String str) {
                C2ND.LIZIZ(new C134725Qm(DialogC134805Qu.this, i, i2, f), 0L);
            }
        };
    }

    public static OSZ LIZIZ(float f, float f2, float f3) {
        float f4 = f2 / f3;
        Float valueOf = Float.valueOf(1280.0f);
        Float valueOf2 = Float.valueOf(720.0f);
        if (f4 > f) {
            float f5 = f * f3;
            if (!Float.isInfinite(f5) && !Float.isNaN(f5) && !Float.isInfinite(f3) && !Float.isNaN(f3)) {
                return new OSZ(Float.valueOf(f5), Float.valueOf(f3));
            }
            return new OSZ(valueOf2, valueOf);
        }
        float f6 = f2 / f;
        if (!Float.isInfinite(f2) && !Float.isNaN(f2) && !Float.isInfinite(f6) && !Float.isNaN(f6)) {
            return new OSZ(Float.valueOf(f2), Float.valueOf(f6));
        }
        return new OSZ(valueOf2, valueOf);
    }
}
