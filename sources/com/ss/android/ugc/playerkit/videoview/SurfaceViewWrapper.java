package com.ss.android.ugc.playerkit.videoview;

import X.C25620zW;
import X.C47676InQ;
import X.C47677InR;
import X.C47691Inf;
import X.C77119UOl;
import X.IQH;
import X.IXB;
import X.IZ8;
import X.InterfaceC46937IbV;
import X.InterfaceC47247IgV;
import X.InterfaceC47667InH;
import X.InterfaceC47678InS;
import X.InterfaceC47679InT;
import X.JBR;
import X.SurfaceHolderCallbackC47668InI;
import X.X1D;
import Y.IDCListenerS245S0100000_8;
import android.content.Context;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class SurfaceViewWrapper implements InterfaceC47247IgV, InterfaceC46937IbV {
    public static final String LJLL;
    public static boolean LJLLI;
    public static int LJLLILLLL;
    public final SurfaceView LJLIL;
    public final Set<InterfaceC47667InH> LJLILLLLZI = new LinkedHashSet();
    public boolean LJLJI;
    public final InterfaceC47679InT LJLJJI;
    public final C47676InQ LJLJJL;
    public final SurfaceHolderCallbackC47668InI LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;

    @Override // X.InterfaceC46937IbV
    public final void LIZLLL(String str, boolean z) {
    }

    @Override // X.InterfaceC46937IbV
    public final void LJ() {
        this.LJLJLLL = true;
    }

    @Override // X.InterfaceC47247IgV
    public final /* synthetic */ void LLJJIII() {
    }

    @Override // X.InterfaceC47247IgV
    public final /* synthetic */ void LLLI() {
    }

    @Override // X.InterfaceC47247IgV
    public final void O7() {
    }

    @Override // X.InterfaceC47247IgV
    public final int P7() {
        return 1;
    }

    @Override // X.InterfaceC47247IgV
    public final void Q7() {
    }

    @Override // X.InterfaceC47247IgV
    public final void T7() {
        this.LJLJI = false;
    }

    @Override // X.InterfaceC47247IgV
    public final /* synthetic */ void release() {
    }

    @Override // X.InterfaceC47247IgV
    public final void resume() {
    }

    static {
        String str;
        if (((Boolean) IZ8.LJJJZ.getValue()).booleanValue()) {
            str = "SurfaceViewWrapper<init>";
        } else {
            str = "UNKNOWN";
        }
        LJLL = str;
        LJLLILLLL = 0;
    }

    @Override // X.InterfaceC46937IbV
    public final void LIZ() {
        if (IXB.LIZ) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("refreshSurfaceDirectly, reason = ", "EngineRefreshSurfaceHelper: NativeWindow", ", surface = ");
            LIZIZ.append(getSurface());
            IXB.LIZIZ("SurfaceView", X1D.LIZIZ(LIZIZ));
        }
        this.LJLIL.setVisibility(8);
        this.LJLIL.setVisibility(0);
    }

    @Override // X.InterfaceC47247IgV
    public final boolean d4() {
        return this.LJLIL.getHolder().getSurface().isValid();
    }

    @Override // X.InterfaceC47247IgV
    public final Surface getSurface() {
        return this.LJLIL.getHolder().getSurface();
    }

    @Override // X.InterfaceC47247IgV
    public final void onPagePause() {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPagePause, surface = ");
            LIZ.append(getSurface());
            IXB.LIZIZ("SurfaceView", X1D.LIZIZ(LIZ));
        }
        this.LJLJL = true;
        this.LJLJLJ = false;
        C47676InQ c47676InQ = this.LJLJJL;
        if (c47676InQ != null) {
            c47676InQ.LJII = true;
        }
    }

    @Override // X.InterfaceC47247IgV
    public final boolean S7() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC47247IgV
    public final View getView() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC47247IgV
    public final void N7(InterfaceC47667InH interfaceC47667InH) {
        this.LJLILLLLZI.add(interfaceC47667InH);
    }

    @Override // X.InterfaceC47247IgV
    public final void O(boolean z) {
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPageResume, surface = ");
            LIZ.append(getSurface());
            IXB.LIZIZ("SurfaceView", X1D.LIZIZ(LIZ));
        }
        if (z) {
            if (this.LJLJL && !this.LJLJLJ) {
                if (IXB.LIZ) {
                    IXB.LIZIZ("SurfaceView", "resetSurfaceViewIfNeed, found abnormal case");
                }
                Object value = IZ8.U0.getValue();
                o.LJIIIIZZ(value, "<get-isEnableRefreshSurf…eviewInAbnormalCase>(...)");
                if (((Boolean) value).booleanValue()) {
                    if (IXB.LIZ) {
                        IXB.LIZIZ("SurfaceView", "resetSurfaceViewIfNeed, abnormal case and call SurfaceView GONE/VISIBLE");
                    }
                    this.LJLIL.setVisibility(8);
                    this.LJLIL.setVisibility(0);
                }
            }
            this.LJLJL = false;
        }
        C47676InQ c47676InQ = this.LJLJJL;
        if (c47676InQ != null) {
            c47676InQ.LJII = false;
        }
    }

    @Override // X.InterfaceC47247IgV
    public final void R7(IQH iqh) {
        this.LJLILLLLZI.remove(iqh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC47247IgV
    public final void V3(boolean z) {
        if (IXB.LIZ) {
            StringBuilder LJI = JBR.LJI("onSelected, isSelected = ", z, ", surface = ");
            LJI.append(getSurface());
            IXB.LIZIZ("SurfaceView", X1D.LIZIZ(LJI));
        }
        if (z) {
            if (this.LJLJLLL) {
                if (IXB.LIZ) {
                    IXB.LIZIZ("SurfaceView", "onSelected, return this surfaceview, try refreshsurface");
                }
                this.LJLJLLL = false;
                this.LJLIL.setVisibility(8);
                this.LJLIL.setVisibility(0);
            }
            if (Build.VERSION.SDK_INT >= 33 && this.LJLIL.getVisibility() != 0) {
                if (IXB.LIZ) {
                    IXB.LIZIZ("SurfaceView", "onSelected, set selected surfaceview visible");
                }
                this.LJLIL.setVisibility(0);
            }
            SurfaceView surfaceView = this.LJLIL;
            if (surfaceView instanceof InterfaceC47678InS) {
                ((InterfaceC47678InS) surfaceView).LIZJ(0.0f, "SurfaceViewWrapper");
                return;
            } else {
                surfaceView.setTranslationX(0.0f);
                return;
            }
        }
        Context context = this.LJLIL.getContext();
        if (LJLLILLLL <= 0) {
            LJLLILLLL = C77119UOl.LJIILJJIL(context);
        }
        int i = LJLLILLLL * 4;
        SurfaceView surfaceView2 = this.LJLIL;
        if (surfaceView2 instanceof InterfaceC47678InS) {
            ((InterfaceC47678InS) surfaceView2).LIZJ(i, "SurfaceViewWrapper");
        } else {
            surfaceView2.setTranslationX(i);
        }
    }

    public SurfaceViewWrapper(int i, int i2, ViewGroup viewGroup) {
        int i3;
        int i4;
        SurfaceHolderCallbackC47668InI surfaceHolderCallbackC47668InI = new SurfaceHolderCallbackC47668InI(this);
        this.LJLJJLL = surfaceHolderCallbackC47668InI;
        this.LJLJL = false;
        this.LJLJLJ = false;
        this.LJLJLLL = false;
        View view = (View) viewGroup.getParent();
        if (view != null) {
            InterfaceC47679InT interfaceC47679InT = (InterfaceC47679InT) view.getTag(R.id.k0i);
            this.LJLJJI = interfaceC47679InT;
            if (interfaceC47679InT != null) {
                SurfaceView LIZ = interfaceC47679InT.LIZ();
                this.LJLIL = LIZ;
                LIZ.getHolder().addCallback(surfaceHolderCallbackC47668InI);
                return;
            }
        }
        Object value = IZ8.k1.getValue();
        o.LJIIIIZZ(value, "<get-fixSurfaceStretchIssue>(...)");
        if (((Boolean) value).booleanValue() && !LJLLI) {
            i4 = C77119UOl.LJIILJJIL(viewGroup.getContext());
            if (i > 0 && i2 > 0 && i4 > 0) {
                i3 = (i2 * i4) / i;
            } else {
                i3 = -1;
                i4 = -1;
            }
            LJLLI = true;
        } else {
            i3 = -1;
            i4 = -1;
        }
        C47691Inf c47691Inf = new C47691Inf(viewGroup.getContext());
        this.LJLIL = c47691Inf;
        Object value2 = IZ8.p1.getValue();
        o.LJIIIIZZ(value2, "<get-isProxyPositionChan…stenerOfSurfaceView>(...)");
        if (((Boolean) value2).booleanValue() && Build.VERSION.SDK_INT == 29) {
            C47676InQ c47676InQ = new C47676InQ();
            this.LJLJJL = c47676InQ;
            if (IXB.LIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("proxyPositionChangeListener， surface = ");
                LIZ2.append(c47691Inf.getHolder().getSurface());
                IXB.LIZIZ("SurfaceView", X1D.LIZIZ(LIZ2));
            }
            Object value3 = IZ8.q1.getValue();
            o.LJIIIIZZ(value3, "<get-isOptimizePositionChangeProxy>(...)");
            c47676InQ.LJ = Boolean.valueOf(((Boolean) value3).booleanValue());
            Object value4 = IZ8.r1.getValue();
            o.LJIIIIZZ(value4, "<get-isFurtherOptimizePositionChangeProxy>(...)");
            c47676InQ.LJFF = Boolean.valueOf(((Boolean) value4).booleanValue());
            Object value5 = IZ8.s1.getValue();
            o.LJIIIIZZ(value5, "<get-isProxyPositionChan…urfaceViewOtherPlan>(...)");
            c47676InQ.LJI = Boolean.valueOf(((Boolean) value5).booleanValue());
            try {
                if (C47676InQ.LJIIJ == null) {
                    Field declaredField = SurfaceView.class.getDeclaredField("mPositionListener");
                    C47676InQ.LJIIJ = declaredField;
                    declaredField.setAccessible(true);
                }
                if (c47676InQ.LIZ == null) {
                    c47676InQ.LIZ = C47676InQ.LJIIJ.get(c47691Inf);
                }
                if (C47676InQ.LJIIL == null) {
                    Field declaredField2 = View.class.getDeclaredField("mRenderNode");
                    C47676InQ.LJIIL = declaredField2;
                    declaredField2.setAccessible(true);
                }
                if (C47676InQ.LJIIJJI == null) {
                    C47676InQ.LJIIJJI = Class.forName("android.graphics.RenderNode");
                }
                if (C47676InQ.LJIILL == null) {
                    C47676InQ.LJIILL = Class.forName("android.graphics.RenderNode$PositionUpdateListener");
                }
                if (C47676InQ.LJIILJJIL == null) {
                    Method declaredMethod = C47676InQ.LJIIJJI.getDeclaredMethod("addPositionUpdateListener", C47676InQ.LJIILL);
                    C47676InQ.LJIILJJIL = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (C47676InQ.LJIILIIL == null) {
                    Method declaredMethod2 = C47676InQ.LJIIJJI.getDeclaredMethod("removePositionUpdateListener", C47676InQ.LJIILL);
                    C47676InQ.LJIILIIL = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                if (C47676InQ.LJIILLIIL == null) {
                    Class cls = C47676InQ.LJIILL;
                    Class<?> cls2 = Integer.TYPE;
                    Method declaredMethod3 = cls.getDeclaredMethod("positionChanged", Long.TYPE, cls2, cls2, cls2, cls2);
                    C47676InQ.LJIILLIIL = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                if (C47676InQ.LJIIZILJ == null) {
                    Method declaredMethod4 = C47676InQ.LJIILL.getDeclaredMethod("positionLost", Long.TYPE);
                    C47676InQ.LJIIZILJ = declaredMethod4;
                    declaredMethod4.setAccessible(true);
                }
                if (c47676InQ.LIZIZ == null) {
                    c47676InQ.LIZIZ = Proxy.newProxyInstance(C47676InQ.LJIILL.getClassLoader(), new Class[]{C47676InQ.LJIILL}, new C47677InR(c47676InQ, c47691Inf));
                }
                C47676InQ.LJIILIIL.invoke(C47676InQ.LJIIL.get(c47691Inf), c47676InQ.LIZ);
                if (c47676InQ.LJI.booleanValue()) {
                    C47676InQ.LJIILJJIL.invoke(C47676InQ.LJIIL.get(c47691Inf), null);
                } else {
                    C47676InQ.LJIILJJIL.invoke(C47676InQ.LJIIL.get(c47691Inf), c47676InQ.LIZIZ);
                }
            } catch (Exception unused) {
            }
        }
        if (viewGroup instanceof FrameLayout) {
            c47691Inf.LIZLLL(new FrameLayout.LayoutParams(i4, i3, 17), LJLL);
            viewGroup.addView(c47691Inf, 0);
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i4, i3);
            layoutParams.addRule(13, -1);
            c47691Inf.LIZLLL(layoutParams, LJLL);
            viewGroup.addView(c47691Inf, 0);
        } else {
            c47691Inf.LIZLLL(new ViewGroup.LayoutParams(i4, i3), LJLL);
            viewGroup.addView(c47691Inf, 0);
        }
        this.LJLIL.getHolder().addCallback(this.LJLJJLL);
        this.LJLIL.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 17));
    }
}
