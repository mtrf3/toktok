package X;

import Y.ALAdapterS9S0200000_12;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Slw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73064Slw implements InterfaceC73072Sm4 {
    public final /* synthetic */ C73062Slu LIZ;

    @Override // X.InterfaceC73072Sm4
    public final void LIZ() {
        if (IPZ.LIZ == IPX.PLAYER_START) {
            this.LIZ.LJIIL();
            return;
        }
        InterfaceC73050Sli playerLogListener$player_release = this.LIZ.getPlayerLogListener$player_release();
        if (playerLogListener$player_release != null) {
            playerLogListener$player_release.LIZ();
        }
        this.LIZ.LJIILIIL(0.0f);
    }

    @Override // X.InterfaceC73072Sm4
    public final void LIZLLL() {
        ((C1AH) ((C73063Slv) this.LIZ.LJ(R.id.hso)).LIZ(R.id.n7j)).setVisibility(8);
        C73062Slu c73062Slu = this.LIZ;
        InterfaceC73068Sm0 interfaceC73068Sm0 = c73062Slu.LJLJJLL;
        if (interfaceC73068Sm0 != null) {
            c73062Slu.LJLJJI = false;
            interfaceC73068Sm0.retry();
            c73062Slu.LJIIJJI();
        }
    }

    @Override // X.InterfaceC73072Sm4
    public final void LJ() {
        ((C73063Slv) this.LIZ.LJ(R.id.hso)).LJFF(1);
        this.LIZ.LJLILLLLZI = true;
    }

    @Override // X.InterfaceC73072Sm4
    public final void LJFF() {
        InterfaceC73068Sm0 player$player_release = this.LIZ.getPlayer$player_release();
        if (player$player_release != null) {
            C73062Slu c73062Slu = this.LIZ;
            if (player$player_release.isMute()) {
                player$player_release.LJIIIZ();
                ((SK0) c73062Slu.LJ(R.id.k4s)).LIZ();
            } else {
                player$player_release.LIZIZ();
                ((SK0) c73062Slu.LJ(R.id.k4s)).LIZIZ();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [T, android.view.Window$Callback] */
    @Override // X.InterfaceC73072Sm4
    public final void LJII() {
        boolean z;
        ViewGroup viewGroup;
        Activity activity;
        C48843JEx c48843JEx;
        Bitmap videoFrame;
        C73043Slb videoSize$player_release = this.LIZ.getVideoSize$player_release();
        if (videoSize$player_release != null) {
            C73062Slu c73062Slu = this.LIZ;
            int i = 1;
            if (videoSize$player_release.LIZ < videoSize$player_release.LIZIZ) {
                z = true;
            } else {
                z = false;
            }
            ViewGroup fullScreenContainerView$player_release = c73062Slu.getFullScreenContainerView$player_release();
            if (fullScreenContainerView$player_release != null) {
                KeyEventCallbackC73065Slx.LJLLI = fullScreenContainerView$player_release;
                KeyEventCallbackC73065Slx.LJLJL = c73062Slu;
                ViewParent parent = c73062Slu.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                KeyEventCallbackC73065Slx.LJLJLLL = viewGroup;
                ViewGroup.LayoutParams layoutParams = c73062Slu.getLayoutParams();
                o.LJIIIIZZ(layoutParams, "targetView.layoutParams");
                Class<?> cls = layoutParams.getClass();
                Object newInstance = Class.forName(cls.getName()).getConstructor(ViewGroup.LayoutParams.class).newInstance(layoutParams);
                o.LJII(newInstance, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) newInstance;
                Field[] declaredFields = cls.getDeclaredFields();
                o.LJIIIIZZ(declaredFields, "paramsClass.declaredFields");
                for (Field field : declaredFields) {
                    if (!TextUtils.equals(field.getName(), "widget")) {
                        field.setAccessible(true);
                        field.set(layoutParams2, field.get(layoutParams));
                    }
                }
                KeyEventCallbackC73065Slx.LJLL = layoutParams2;
                KeyEventCallbackC73065Slx.LJLJLJ = c73062Slu;
                Context context = c73062Slu.getContext();
                Window window$player_release = c73062Slu.getWindow$player_release();
                if (window$player_release != null) {
                    C68322mC c68322mC = new C68322mC();
                    ?? callback = window$player_release.getCallback();
                    c68322mC.element = callback;
                    if (KeyEventCallbackC73065Slx.LJLJJL == null) {
                        KeyEventCallbackC73065Slx.LJLJJLL = callback;
                        KeyEventCallbackC73065Slx.LJLJJL = new C73067Slz(c68322mC);
                    }
                    C73067Slz c73067Slz = KeyEventCallbackC73065Slx.LJLJJL;
                    if (c73067Slz != null) {
                        window$player_release.setCallback(c73067Slz);
                    }
                }
                if (z) {
                    Window window$player_release2 = c73062Slu.getWindow$player_release();
                    if (window$player_release2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = c73062Slu.LJ(R.id.kej).getLayoutParams();
                        o.LJIIIIZZ(context, "context");
                        layoutParams3.height = context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
                        c73062Slu.LJ(R.id.kej).setVisibility(0);
                        C61713OJx LJ = C61712OJw.LJ((ActivityC45651qj) context, window$player_release2);
                        LJ.LIZIZ.LJIIJ(false);
                        LJ.LJIIIIZZ(0);
                        LJ.LIZIZ(false, false);
                        LJ.LIZJ();
                    }
                    View LJ2 = c73062Slu.LJ(R.id.n9f);
                    o.LJIIIIZZ(LJ2, "targetView.video_view");
                    Rect LIZIZ = C243149gU.LIZIZ(LJ2);
                    Rect LIZIZ2 = C243149gU.LIZIZ(fullScreenContainerView$player_release);
                    int[] iArr = KeyEventCallbackC73065Slx.LJLILLLLZI;
                    iArr[0] = LIZIZ.left - LIZIZ2.left;
                    iArr[1] = LIZIZ.top - LIZIZ2.top;
                    KeyEventCallbackC73065Slx.LJLJJI = c73062Slu.LJ(R.id.n9f).getWidth();
                    KeyEventCallbackC73065Slx.LJLJI = c73062Slu.LJ(R.id.n9f).getHeight();
                    ImageView imageView = new ImageView(context);
                    KeyEventCallbackC73065Slx.LJLLILLLL = imageView;
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    ImageView imageView2 = KeyEventCallbackC73065Slx.LJLLILLLL;
                    C73062Slu c73062Slu2 = KeyEventCallbackC73065Slx.LJLJL;
                    if (c73062Slu2 != null && (c48843JEx = (C48843JEx) c73062Slu2.LJ(R.id.n9f)) != null && (videoFrame = c48843JEx.getVideoFrame()) != null && imageView2 != null) {
                        imageView2.setImageBitmap(videoFrame);
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(KeyEventCallbackC73065Slx.LJLJJI, KeyEventCallbackC73065Slx.LJLJI);
                    marginLayoutParams.topMargin = iArr[1];
                    marginLayoutParams.leftMargin = iArr[0];
                    ImageView imageView3 = KeyEventCallbackC73065Slx.LJLLILLLL;
                    if (imageView3 != null) {
                        imageView3.setLayoutParams(marginLayoutParams);
                    }
                    KeyEventCallbackC73065Slx.LIZ(KeyEventCallbackC73065Slx.LJLLILLLL, fullScreenContainerView$player_release, null);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new C005300j(i, LIZIZ2));
                    ofFloat.addListener(new ALAdapterS9S0200000_12(c73062Slu, fullScreenContainerView$player_release, 1));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(new AccelerateInterpolator());
                    ofFloat.start();
                } else {
                    if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                        try {
                            activity.setRequestedOrientation(0);
                        } catch (Throwable unused) {
                        }
                    }
                    KeyEventCallbackC73065Slx.LJLZ = EnumC73069Sm1.HORIZONTAL;
                    KeyEventCallbackC73065Slx.LIZJ(c73062Slu);
                    ViewGroup.LayoutParams layoutParams4 = c73062Slu.getLayoutParams();
                    o.LJII(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    marginLayoutParams2.width = -1;
                    marginLayoutParams2.height = -1;
                    marginLayoutParams2.topMargin = 0;
                    KeyEventCallbackC73065Slx.LIZ(c73062Slu, fullScreenContainerView$player_release, null);
                    Window window$player_release3 = c73062Slu.getWindow$player_release();
                    if (window$player_release3 != null) {
                        o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        C61713OJx LJ3 = C61712OJw.LJ((ActivityC45651qj) context, window$player_release3);
                        LJ3.LIZIZ(true, true);
                        LJ3.LIZJ();
                    }
                    C73062Slu c73062Slu3 = KeyEventCallbackC73065Slx.LJLJLJ;
                    if (c73062Slu3 != null) {
                        c73062Slu3.LJIIIZ(KeyEventCallbackC73065Slx.LJLZ);
                    }
                }
            }
            InterfaceC73068Sm0 player$player_release = c73062Slu.getPlayer$player_release();
            if (player$player_release != null) {
                player$player_release.LIZJ();
            }
        }
    }

    public C73064Slw(C73062Slu c73062Slu) {
        this.LIZ = c73062Slu;
    }

    @Override // X.InterfaceC73072Sm4
    public final void LIZIZ(float f) {
        String LIZIZ = C73074Sm6.LIZIZ(f, this.LIZ.getVideoLength$player_release());
        C2RN c2rn = (C2RN) this.LIZ.LJ(R.id.l7z);
        java.util.Map<Integer, View> map = c2rn.LJLIL;
        Integer valueOf = Integer.valueOf(R.id.c0t);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view == null) {
            view = c2rn.findViewById(R.id.c0t);
            if (view != null) {
                linkedHashMap.put(valueOf, view);
            } else {
                view = null;
            }
        }
        ((TextView) view).setText(LIZIZ);
        ((TextView) this.LIZ.LJ(R.id.hs6)).setText(LIZIZ);
    }

    @Override // X.InterfaceC73072Sm4
    public final void LIZJ(float f) {
        C73063Slv c73063Slv = (C73063Slv) this.LIZ.LJ(R.id.hso);
        c73063Slv.LIZ(R.id.l7z).setVisibility(8);
        if (c73063Slv.LJLJI) {
            c73063Slv.LJFF(2);
        } else if (IPZ.LIZIZ != EnumC73069Sm1.PREVIEW) {
            c73063Slv.LJFF(0);
        }
        this.LIZ.LJIILIIL(f);
        this.LIZ.LJLILLLLZI = false;
    }

    @Override // X.InterfaceC73072Sm4
    public final void LJI(float f, int i) {
        InterfaceC73068Sm0 player$player_release = this.LIZ.getPlayer$player_release();
        if (player$player_release != null) {
            player$player_release.LIZ();
        }
    }
}
