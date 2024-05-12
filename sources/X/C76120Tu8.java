package X;

import Y.ARunnableS49S0100000_13;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLandscapeFeedPreviewSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostAddFeedComponentsSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS12S0202000_13;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS73S0201000_13;
import kotlin.jvm.internal.AqS9S0600000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tu8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76120Tu8 implements InterfaceC32187CkB, InterfaceC76112Tu0 {
    public InterfaceC76125TuD LJLIL;
    public C75794Tos LJLJJLL;
    public InterfaceC75579TlP LJLJL;
    public FrameLayout LJLJLJ;
    public B4L LJLJLLL;
    public ViewGroup.LayoutParams LJLL;
    public long LJLLI;
    public int LJLLILLLL;
    public InterfaceC88472Yns<? super Rect, C76800UCe> LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public InterfaceC32199CkN LL;
    public int LLD;
    public int LLF;
    public final AtomicBoolean LJLILLLLZI = new AtomicBoolean(false);
    public final AtomicBoolean LJLJI = new AtomicBoolean(false);
    public final C74994Tby LJLJJI = new C74994Tby(null);
    public final U34 LJLJJL = new U34(null);
    public Rect LJLLJ = new Rect();
    public OSZ<Integer, Integer> LJZL = new OSZ<>(0, 0);
    public final ViewTreeObserverOnGlobalLayoutListenerC75582TlS LLFF = new ViewTreeObserverOnGlobalLayoutListenerC75582TlS(this);
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(new AqS163S0100000_13(this, 758));

    @Override // X.InterfaceC32187CkB
    public final void LJ() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
    }

    @Override // X.InterfaceC32187CkB
    public final void LIZ() {
        C29306Beo.LJJJ(new AqS163S0100000_13(this, 757));
    }

    @Override // X.InterfaceC32187CkB
    public final void LJIIIIZZ() {
        InterfaceC75579TlP interfaceC75579TlP = this.LJLJL;
        if (interfaceC75579TlP != null) {
            interfaceC75579TlP.u1();
        }
    }

    public final void LJIIL() {
        InterfaceC75579TlP interfaceC75579TlP = this.LJLJL;
        if (interfaceC75579TlP != null) {
            interfaceC75579TlP.l1();
        }
        InterfaceC76125TuD interfaceC76125TuD = this.LJLIL;
        if (interfaceC76125TuD != null) {
            interfaceC76125TuD.release();
        }
        this.LJLIL = null;
        LJIILJJIL("no sei parsed, release window mask.");
        if (this.LJLL != null && (this.LJLJLLL instanceof View)) {
            if (LivesdkLandscapeFeedPreviewSwitchSetting.INSTANCE.isEnable() && this.LJLZ > this.LJZ) {
                Object obj = this.LJLJLLL;
                o.LJII(obj, "null cannot be cast to non-null type android.view.View");
                ((View) obj).postDelayed(new ARunnableS49S0100000_13(this, 271), 20L);
            } else {
                Object obj2 = this.LJLJLLL;
                o.LJII(obj2, "null cannot be cast to non-null type android.view.View");
                ((View) obj2).postDelayed(new ARunnableS49S0100000_13(this, 272), 20L);
            }
        }
    }

    public final int LJIILIIL() {
        InterfaceC76125TuD interfaceC76125TuD = this.LJLIL;
        if (interfaceC76125TuD == null) {
            return 0;
        }
        if (interfaceC76125TuD instanceof C75782Tog) {
            return 4;
        }
        if ((interfaceC76125TuD instanceof C75809Tp7) || (interfaceC76125TuD instanceof C76110Tty)) {
            return 2;
        }
        if (!(interfaceC76125TuD instanceof C75791Top)) {
            return 0;
        }
        return 4;
    }

    @Override // X.InterfaceC32187CkB
    public final C75794Tos LJIIJJI() {
        return this.LJLJJLL;
    }

    public static final void LJIILJJIL(String str) {
        C0NB.LIZIZ("CommonLinkMicFeedViewManager", str);
    }

    @Override // X.InterfaceC32187CkB
    public final void LIZLLL(C28272B7s sei) {
        o.LJIIIZ(sei, "sei");
        LJIILL(new AqS160S0200000_13(sei, this, 109));
    }

    @Override // X.InterfaceC32187CkB
    public final void LJFF(AqS171S0100000_5 aqS171S0100000_5) {
        this.LJLLL = aqS171S0100000_5;
    }

    @Override // X.InterfaceC32187CkB
    public final void LJI(C75794Tos c75794Tos) {
        C29306Beo.LJJJ(new AqS160S0200000_13(this, c75794Tos, 107));
    }

    @Override // X.InterfaceC32187CkB
    public final void LJII(C32191CkF c32191CkF) {
        this.LL = c32191CkF;
    }

    @Override // X.InterfaceC32187CkB
    public final void LJIIIZ(int i) {
        this.LJZI = i;
    }

    public final void LJIILL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (this.LJLILLLLZI.get() && this.LJLJI.get()) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJI(InterfaceC75787Tol layout) {
        o.LJIIIZ(layout, "layout");
        LJIILL(new AqS160S0200000_13(this, layout, 108));
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJJ(C76696U8e layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJ(SeiAppData seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLLL(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJIIJ(int i, List windows) {
        o.LJIIIZ(windows, "windows");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWindowStateChanged, ");
        LIZ.append(windows.size());
        LJIILJJIL(X1D.LIZIZ(LIZ));
        if (C30922CBq.LIZIZ) {
            Iterator it = windows.iterator();
            while (it.hasNext()) {
                InterfaceC75179Tex interfaceC75179Tex = (InterfaceC75179Tex) it.next();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(interfaceC75179Tex.LJJ());
                LIZ2.append(' ');
                LIZ2.append(interfaceC75179Tex.LJJIL());
                LIZ2.append(' ');
                LIZ2.append(interfaceC75179Tex.LJJIJIL().hashCode());
                LIZ2.append(' ');
                LIZ2.append(interfaceC75179Tex.LJZ());
                LJIILJJIL(X1D.LIZIZ(LIZ2));
            }
        }
        LJIILL(new AqS73S0201000_13(windows, (List<? extends InterfaceC75179Tex>) this, (C76120Tu8) i, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC76125TuD LJIILLIIL(int i, C74994Tby c74994Tby) {
        EnumC32197CkL enumC32197CkL;
        C76110Tty c76110Tty;
        C76110Tty c76110Tty2 = null;
        if (this.LJLIL != null && LJIILIIL() != i && i != 0) {
            InterfaceC76125TuD interfaceC76125TuD = this.LJLIL;
            if (interfaceC76125TuD != null) {
                interfaceC76125TuD.release();
            }
            this.LJLIL = null;
        }
        int i2 = this.LJLLLLLL;
        if (this.LJLIL != null && LJIILIIL() != i) {
            if (i != 0) {
                InterfaceC75579TlP interfaceC75579TlP = this.LJLJL;
                if (interfaceC75579TlP != null) {
                    interfaceC75579TlP.u1();
                }
                InterfaceC76125TuD interfaceC76125TuD2 = this.LJLIL;
                if (interfaceC76125TuD2 != null) {
                    interfaceC76125TuD2.release();
                }
                this.LJLIL = null;
            }
        } else if (i == 4) {
            if (i2 != 16) {
                InterfaceC75579TlP interfaceC75579TlP2 = this.LJLJL;
                if (interfaceC75579TlP2 != null) {
                    interfaceC75579TlP2.u1();
                }
                InterfaceC76125TuD interfaceC76125TuD3 = this.LJLIL;
                if (interfaceC76125TuD3 != null) {
                    interfaceC76125TuD3.release();
                }
                this.LJLIL = null;
            }
        }
        if (this.LJLIL == null) {
            C75794Tos c75794Tos = this.LJLJJLL;
            int i3 = this.LJLLLLLL;
            InterfaceC75579TlP interfaceC75579TlP3 = this.LJLJL;
            InterfaceC32199CkN interfaceC32199CkN = this.LL;
            if (i != 2) {
                if (i == 4) {
                    if (i3 == 16) {
                        C75791Top c75791Top = new C75791Top();
                        c75791Top.LIZIZ(c75794Tos, interfaceC75579TlP3, c74994Tby, null);
                        c76110Tty = c75791Top;
                    } else {
                        C75782Tog c75782Tog = new C75782Tog(0);
                        c75782Tog.LIZJ(c75794Tos, interfaceC75579TlP3, c74994Tby, null);
                        c76110Tty = c75782Tog;
                    }
                    c76110Tty2 = c76110Tty;
                }
                this.LJLIL = c76110Tty2;
            } else {
                if (LiveCoHostAddFeedComponentsSetting.INSTANCE.isEnable()) {
                    if (c75794Tos != null) {
                        enumC32197CkL = c75794Tos.LJI;
                    } else {
                        enumC32197CkL = null;
                    }
                    if (enumC32197CkL == EnumC32197CkL.FEED) {
                        c76110Tty2 = new C76110Tty(0);
                        c76110Tty2.LIZIZ(c75794Tos, interfaceC75579TlP3, c74994Tby, interfaceC32199CkN);
                        this.LJLIL = c76110Tty2;
                    }
                }
                C75809Tp7 c75809Tp7 = new C75809Tp7(0);
                c75809Tp7.LIZ(c75794Tos, interfaceC75579TlP3, c74994Tby, null);
                c76110Tty = c75809Tp7;
                c76110Tty2 = c76110Tty;
                this.LJLIL = c76110Tty2;
            }
        }
        return this.LJLIL;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJJIZ(InterfaceC75787Tol layout, int i) {
        o.LJIIIZ(layout, "layout");
        LJIILL(new AqS73S0201000_13(this, layout, i, 4));
    }

    @Override // X.InterfaceC32187CkB
    public final void LIZIZ(int i, int i2, View view) {
        if (view == null) {
            return;
        }
        LJIILL(new AqS12S0202000_13(view, this, i2, i, 1));
    }

    @Override // X.InterfaceC32187CkB
    public final void LIZJ(FrameLayout frameLayout, int i, int i2, int i3) {
        if (frameLayout == null) {
            return;
        }
        this.LJLJI.set(true);
        LJIILL(new C76122TuA(frameLayout, this, i3, i, i2));
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex window, EnumC75419Tip oldState, EnumC75419Tip newState, U9O actionType, C75786Tok c75786Tok) {
        boolean z;
        o.LJIIIZ(window, "window");
        o.LJIIIZ(oldState, "oldState");
        o.LJIIIZ(newState, "newState");
        o.LJIIIZ(actionType, "actionType");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWindowStateChanged ");
        if (this.LJLILLLLZI.get() && this.LJLJI.get()) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(' ');
        LIZ.append(window);
        LIZ.append(' ');
        LIZ.append(c75786Tok);
        LJIILJJIL(X1D.LIZIZ(LIZ));
        LJIILL(new AqS9S0600000_13(this, c75786Tok, window, oldState, newState, actionType, 1));
    }
}
