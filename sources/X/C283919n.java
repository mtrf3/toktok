package X;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.19n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C283919n extends View implements C0DN {
    public static final C45341qE LJLLJ = C45341qE.LJLIL;
    public static final C015904l LJLLL = new ViewOutlineProvider() { // from class: X.04l
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            o.LJIIIZ(view, "view");
            o.LJIIIZ(outline, "outline");
            Outline LIZIZ = ((C283919n) view).LJLJJL.LIZIZ();
            o.LJI(LIZIZ);
            outline.set(LIZIZ);
        }
    };
    public static Method LJLLLL;
    public static Field LJLLLLLL;
    public static boolean LJLZ;
    public static boolean LJZ;
    public final C45211q1 LJLIL;
    public final C05N LJLILLLLZI;
    public InterfaceC88472Yns<? super InterfaceC11750d9, C76800UCe> LJLJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final C016504r LJLJJL;
    public boolean LJLJJLL;
    public Rect LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public final C11780dC LJLL;
    public final C015304f<View> LJLLI;
    public long LJLLILLLL;

    @Override // X.C0DN
    public final void destroy() {
        setInvalidated(false);
        C45211q1 c45211q1 = this.LJLIL;
        c45211q1.LLF = true;
        this.LJLJI = null;
        this.LJLJJI = null;
        boolean LJJIIJZLJL = c45211q1.LJJIIJZLJL(this);
        if (Build.VERSION.SDK_INT >= 23 || LJZ || !LJJIIJZLJL) {
            C05N c05n = this.LJLILLLLZI;
            if (C78996UzQ.LJJIIJZLJL(this)) {
                C78996UzQ.LJI();
            }
            c05n.removeViewInLayout(this);
            return;
        }
        setVisibility(8);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // X.C0DN
    public final void LJII() {
        if (this.LJLJLJ && !LJZ) {
            setInvalidated(false);
            C016004m.LIZ(this);
        }
    }

    public final void LJIIIZ() {
        Rect rect;
        if (this.LJLJJLL) {
            Rect rect2 = this.LJLJL;
            if (rect2 == null) {
                this.LJLJL = new Rect(0, 0, getWidth(), getHeight());
            } else {
                o.LJI(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.LJLJL;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C016104n.LIZ(this.LJLIL);
        }
        return -1L;
    }

    @Override // android.view.View, X.C0DN
    public final void invalidate() {
        if (!this.LJLJLJ) {
            setInvalidated(true);
            super.invalidate();
            this.LJLIL.invalidate();
        }
    }

    private final InterfaceC11610cv getManualClipPath() {
        if (getClipToOutline()) {
            C016504r c016504r = this.LJLJJL;
            if (!(!c016504r.LJIIIIZZ)) {
                c016504r.LJ();
                return c016504r.LJI;
            }
        }
        return null;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public long getLayerId() {
        return getId();
    }

    public final C05N getContainer() {
        return this.LJLILLLLZI;
    }

    public final C45211q1 getOwnerView() {
        return this.LJLIL;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.LJLJLJ) {
            this.LJLJLJ = z;
            this.LJLIL.LJJIII(this, z);
        }
    }

    @Override // X.C0DN
    public final boolean LJ(long j) {
        float LIZLLL = C10370av.LIZLLL(j);
        float LJ = C10370av.LJ(j);
        if (this.LJLJJLL) {
            if (0.0f <= LIZLLL && LIZLLL < getWidth() && 0.0f <= LJ && LJ < getHeight()) {
                return true;
            }
            return false;
        }
        if (!getClipToOutline()) {
            return true;
        }
        return this.LJLJJL.LIZJ(j);
    }

    @Override // X.C0DN
    public final void LJFF(InterfaceC11750d9 canvas) {
        boolean z;
        o.LJIIIZ(canvas, "canvas");
        if (getElevation() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJLLL = z;
        if (z) {
            canvas.LJIJI();
        }
        this.LJLILLLLZI.LIZ(canvas, this, getDrawingTime());
        if (this.LJLJLLL) {
            canvas.LJFF();
        }
    }

    @Override // X.C0DN
    public final void LJI(long j) {
        int i = (int) (j >> 32);
        if (i != getLeft()) {
            offsetLeftAndRight(i - getLeft());
            this.LJLLI.LIZJ();
        }
        int LIZJ = C23450w1.LIZJ(j);
        if (LIZJ != getTop()) {
            offsetTopAndBottom(LIZJ - getTop());
            this.LJLLI.LIZJ();
        }
    }

    @Override // X.C0DN
    public final void LJIIIIZZ(long j) {
        C015904l c015904l;
        int i = (int) (j >> 32);
        int LIZIZ = C23490w5.LIZIZ(j);
        if (i != getWidth() || LIZIZ != getHeight()) {
            float f = i;
            setPivotX(C12000dY.LIZ(this.LJLLILLLL) * f);
            float f2 = LIZIZ;
            setPivotY(C12000dY.LIZIZ(this.LJLLILLLL) * f2);
            C016504r c016504r = this.LJLJJL;
            long LIZIZ2 = C1DF.LIZIZ(f, f2);
            if (!C10430b1.LIZ(c016504r.LIZLLL, LIZIZ2)) {
                c016504r.LIZLLL = LIZIZ2;
                c016504r.LJII = true;
            }
            if (this.LJLJJL.LIZIZ() != null) {
                c015904l = LJLLL;
            } else {
                c015904l = null;
            }
            setOutlineProvider(c015904l);
            layout(getLeft(), getTop(), getLeft() + i, getTop() + LIZIZ);
            LJIIIZ();
            this.LJLLI.LIZJ();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        C11780dC c11780dC = this.LJLL;
        C1QR c1qr = c11780dC.LIZ;
        Canvas canvas2 = c1qr.LIZ;
        c1qr.LIZ = canvas;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            c1qr.LJIIL();
            this.LJLJJL.LIZ(c1qr);
            z = true;
        }
        InterfaceC88472Yns<? super InterfaceC11750d9, C76800UCe> interfaceC88472Yns = this.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c1qr);
        }
        if (z) {
            c1qr.LJIIJ();
        }
        C1QR c1qr2 = c11780dC.LIZ;
        c1qr2.getClass();
        o.LJIIIZ(canvas2, "<set-?>");
        c1qr2.LIZ = canvas2;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // X.C0DN
    public final void LIZIZ(C10350at c10350at, boolean z) {
        if (z) {
            float[] LIZ = this.LJLLI.LIZ(this);
            if (LIZ != null) {
                C11520cm.LIZJ(LIZ, c10350at);
                return;
            }
            c10350at.LIZ = 0.0f;
            c10350at.LIZIZ = 0.0f;
            c10350at.LIZJ = 0.0f;
            c10350at.LIZLLL = 0.0f;
            return;
        }
        C11520cm.LIZJ(this.LJLLI.LIZIZ(this), c10350at);
    }

    @Override // X.C0DN
    public final long LIZJ(long j, boolean z) {
        if (z) {
            float[] LIZ = this.LJLLI.LIZ(this);
            if (LIZ != null) {
                return C11520cm.LIZIZ(LIZ, j);
            }
            return C10370av.LIZJ;
        }
        return C11520cm.LIZIZ(this.LJLLI.LIZIZ(this), j);
    }

    @Override // X.C0DN
    public final void LIZLLL(IDqS420S0100000 invalidateParentLayer, InterfaceC88472Yns drawBlock) {
        o.LJIIIZ(drawBlock, "drawBlock");
        o.LJIIIZ(invalidateParentLayer, "invalidateParentLayer");
        if (Build.VERSION.SDK_INT >= 23 || LJZ) {
            this.LJLILLLLZI.addView(this);
        } else {
            setVisibility(0);
        }
        this.LJLJJLL = false;
        this.LJLJLLL = false;
        this.LJLLILLLL = C12000dY.LIZIZ;
        this.LJLJI = drawBlock;
        this.LJLJJI = invalidateParentLayer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C283919n(C45211q1 ownerView, C05N c05n, InterfaceC88472Yns drawBlock, IDqS420S0100000 invalidateParentLayer) {
        super(ownerView.getContext());
        o.LJIIIZ(ownerView, "ownerView");
        o.LJIIIZ(drawBlock, "drawBlock");
        o.LJIIIZ(invalidateParentLayer, "invalidateParentLayer");
        this.LJLIL = ownerView;
        this.LJLILLLLZI = c05n;
        this.LJLJI = drawBlock;
        this.LJLJJI = invalidateParentLayer;
        this.LJLJJL = new C016504r(ownerView.getDensity());
        this.LJLL = new C11780dC();
        this.LJLLI = new C015304f<>(LJLLJ);
        this.LJLLILLLL = C12000dY.LIZIZ;
        setWillNotDraw(false);
        setId(View.generateViewId());
        c05n.addView(this);
    }

    @Override // X.C0DN
    public final void LIZ(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC11790dD shape, boolean z, long j2, long j3, EnumC23500w6 layoutDirection, InterfaceC23370vt density) {
        boolean z2;
        boolean z3;
        boolean z4;
        C015904l c015904l;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        o.LJIIIZ(shape, "shape");
        o.LJIIIZ(layoutDirection, "layoutDirection");
        o.LJIIIZ(density, "density");
        this.LJLLILLLL = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        setPivotX(C12000dY.LIZ(this.LJLLILLLL) * getWidth());
        setPivotY(C12000dY.LIZIZ(this.LJLLILLLL) * getHeight());
        setCameraDistancePx(f10);
        boolean z5 = false;
        if (z && shape == C11710d5.LIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJJLL = z2;
        LJIIIZ();
        if (getManualClipPath() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && shape != C11710d5.LIZ) {
            z4 = true;
        } else {
            z4 = false;
        }
        setClipToOutline(z4);
        boolean LIZLLL = this.LJLJJL.LIZLLL(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        if (this.LJLJJL.LIZIZ() != null) {
            c015904l = LJLLL;
        } else {
            c015904l = null;
        }
        setOutlineProvider(c015904l);
        if (getManualClipPath() != null) {
            z5 = true;
        }
        if (z3 != z5 || (z5 && LIZLLL)) {
            invalidate();
        }
        if (!this.LJLJLLL && getElevation() > 0.0f && (interfaceC65784Pro = this.LJLJJI) != null) {
            interfaceC65784Pro.invoke();
        }
        this.LJLLI.LIZJ();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            C016304p.LIZ(this, C78897Uxp.LJJJZ(j2));
            C016304p.LIZIZ(this, C78897Uxp.LJJJZ(j3));
            if (i >= 31) {
                C016604s.LIZ(this, null);
            }
        }
    }
}
