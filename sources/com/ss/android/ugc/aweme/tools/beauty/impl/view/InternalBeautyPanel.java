package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import X.C1XY;
import X.C29S;
import X.C30461Hm;
import X.C50765Jw9;
import X.C68249QqT;
import X.C82527WaB;
import X.C83175Wkd;
import X.C83195Wkx;
import X.C83198Wl0;
import X.C83203Wl5;
import X.C83204Wl6;
import X.C83208WlA;
import X.C83209WlB;
import X.C83210WlC;
import X.C83212WlE;
import X.C83216WlI;
import X.C83231WlX;
import X.C83232WlY;
import X.C83238Wle;
import X.C83248Wlo;
import X.C83252Wls;
import X.C83260Wm0;
import X.C83261Wm1;
import X.C83262Wm2;
import X.C83263Wm3;
import X.C83265Wm5;
import X.EXU;
import X.InterfaceC82227WOx;
import X.InterfaceC83142Wk6;
import X.InterfaceC83144Wk8;
import X.InterfaceC83197Wkz;
import X.InterfaceC83233WlZ;
import X.InterfaceC83246Wlm;
import X.InterfaceC83247Wln;
import X.InterfaceC83256Wlw;
import X.InterfaceC83268Wm8;
import X.InterfaceC83283WmN;
import X.InterfaceC83293WmX;
import X.WM7;
import X.XKX;
import Y.ACListenerS34S0100000_14;
import Y.AObserverS82S0100000_14;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import java.util.HashMap;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class InternalBeautyPanel implements GenericLifecycleObserver, InterfaceC82227WOx {
    public ViewGroup LJLIL;
    public C83208WlA LJLILLLLZI;
    public C83216WlI LJLJI;
    public C83210WlC LJLJJI;
    public C83252Wls LJLJJL;
    public C83238Wle LJLJJLL;
    public C83195Wkx LJLJL;
    public C83198Wl0 LJLJLJ;
    public C83203Wl5 LJLJLLL;
    public C83204Wl6 LJLL;
    public C83248Wlo LJLLI;
    public C83231WlX LJLLILLLL;
    public InterfaceC83144Wk8 LJLLJ;
    public InterfaceC83233WlZ LJLLL;
    public final C68249QqT LJLLLL;
    public String LJLLLLLL;
    public boolean LJLZ;
    public final ViewGroup LJZ;
    public final InterfaceC83142Wk6 LJZI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC82227WOx
    public final void S5() {
        C83204Wl6 c83204Wl6 = this.LJLL;
        if (c83204Wl6 != null) {
            c83204Wl6.LJ();
        } else {
            o.LJIJI("beautyResetView");
            throw null;
        }
    }

    @Override // X.InterfaceC82227WOx
    public final void hide() {
        if (!this.LJLZ) {
            return;
        }
        this.LJLZ = false;
        C83175Wkd.LIZIZ("InternalBeautyPanel hide");
        C68249QqT c68249QqT = this.LJLLLL;
        Object obj = c68249QqT.LIZIZ;
        InterfaceC83246Wlm interfaceC83246Wlm = (InterfaceC83246Wlm) c68249QqT.LIZ;
        if (interfaceC83246Wlm != null) {
            interfaceC83246Wlm.LIZLLL((ComposerBeauty) obj);
        }
        c68249QqT.LIZIZ = obj;
        C83208WlA c83208WlA = this.LJLILLLLZI;
        if (c83208WlA != null) {
            C83209WlB c83209WlB = c83208WlA.LJLJJI;
            if (c83209WlB != null) {
                c83209WlB.LIZJ(new C30461Hm());
            }
            InterfaceC83144Wk8 interfaceC83144Wk8 = this.LJLLJ;
            if (interfaceC83144Wk8 != null) {
                interfaceC83144Wk8.onDismiss();
            }
            C82527WaB.LIZ(this.LJZI, true, true, new AqS180S0100000_14(this, 198), 2);
            return;
        }
        o.LJIJI("contentView");
        throw null;
    }

    @Override // X.InterfaceC82227WOx
    public final void show() {
        if (this.LJLZ) {
            return;
        }
        this.LJLZ = true;
        C83175Wkd.LIZIZ("InternalBeautyPanel show");
        C83210WlC c83210WlC = this.LJLJJI;
        if (c83210WlC != null) {
            if (c83210WlC.LJIJI.LIZ.LIZ()) {
                XKX.LIZLLL(c83210WlC.LIZ, EXU.LIZ, null, new C83212WlE(c83210WlC, null), 2);
            }
            C83208WlA c83208WlA = this.LJLILLLLZI;
            if (c83208WlA != null) {
                C83209WlB c83209WlB = c83208WlA.LJLJJI;
                if (c83209WlB != null) {
                    c83209WlB.LJLJJL = c83208WlA.LJLJLJ.LIZ;
                    c83209WlB.LIZIZ(new C30461Hm());
                }
                InterfaceC83144Wk8 interfaceC83144Wk8 = this.LJLLJ;
                if (interfaceC83144Wk8 != null) {
                    interfaceC83144Wk8.onShow();
                }
                this.LJLLLLLL = C82527WaB.LIZ(this.LJZI, false, false, null, 15).toString();
                return;
            }
            o.LJIJI("contentView");
            throw null;
        }
        o.LJIJI("beautyList");
        throw null;
    }

    @Override // X.InterfaceC82227WOx
    public final void setContainer(ViewGroup value) {
        o.LJIIIZ(value, "value");
        this.LJLIL = value;
        C83208WlA c83208WlA = this.LJLILLLLZI;
        if (c83208WlA != null) {
            c83208WlA.setContainer(value);
        } else {
            o.LJIJI("contentView");
            throw null;
        }
    }

    public InternalBeautyPanel(Context context, ViewGroup viewGroup, InterfaceC83142Wk6 interfaceC83142Wk6, C83232WlY c83232WlY) {
        Context context2 = context;
        this.LJZ = viewGroup;
        this.LJZI = interfaceC83142Wk6;
        this.LJLIL = viewGroup;
        this.LJLLL = c83232WlY.LJ;
        C68249QqT c68249QqT = new C68249QqT();
        this.LJLLLL = c68249QqT;
        C50765Jw9 c50765Jw9 = new C50765Jw9(3);
        c83232WlY.LJFF.LIZIZ.invoke(context2, viewGroup, c83232WlY);
        C83208WlA c83208WlA = new C83208WlA(context2, viewGroup, c83232WlY);
        this.LJLILLLLZI = c83208WlA;
        ((HashMap) c50765Jw9.LIZ).put(InterfaceC83283WmN.class, c83208WlA);
        C83208WlA c83208WlA2 = this.LJLILLLLZI;
        if (c83208WlA2 != null) {
            c83208WlA2.setDismissViewClickListener(new ACListenerS34S0100000_14(this, 74));
            C83208WlA c83208WlA3 = this.LJLILLLLZI;
            if (c83208WlA3 != null) {
                c83208WlA3.LIZ();
                this.LJLJI = new C83216WlI(c50765Jw9, c68249QqT, interfaceC83142Wk6, this.LJLLJ, this.LJLLL);
                C83260Wm0 c83260Wm0 = c83232WlY.LJI.LJJII;
                C83208WlA c83208WlA4 = this.LJLILLLLZI;
                if (c83208WlA4 != null) {
                    View root = c83208WlA4.getRoot();
                    C83216WlI c83216WlI = this.LJLJI;
                    if (c83216WlI != null) {
                        c83260Wm0.invoke(context2, root, c83232WlY, c83216WlI);
                        C83208WlA c83208WlA5 = this.LJLILLLLZI;
                        if (c83208WlA5 != null) {
                            View root2 = c83208WlA5.getRoot();
                            C83216WlI c83216WlI2 = this.LJLJI;
                            if (c83216WlI2 != null) {
                                o.LJIIIZ(root2, "root");
                                C83210WlC c83210WlC = new C83210WlC(context2, root2, c83232WlY, c83216WlI2);
                                this.LJLJJI = c83210WlC;
                                ((HashMap) c50765Jw9.LIZ).put(InterfaceC83247Wln.class, c83210WlC);
                                this.LJLJL = new C83195Wkx(c50765Jw9, c68249QqT, interfaceC83142Wk6, this.LJLLJ, this.LJLLL);
                                C83263Wm3 c83263Wm3 = c83232WlY.LJII.LJ;
                                C83208WlA c83208WlA6 = this.LJLILLLLZI;
                                if (c83208WlA6 != null) {
                                    View root3 = c83208WlA6.getRoot();
                                    C83195Wkx c83195Wkx = this.LJLJL;
                                    if (c83195Wkx != null) {
                                        c83263Wm3.invoke(context2, root3, c83232WlY, c83195Wkx);
                                        C83208WlA c83208WlA7 = this.LJLILLLLZI;
                                        if (c83208WlA7 != null) {
                                            View root4 = c83208WlA7.getRoot();
                                            C83195Wkx c83195Wkx2 = this.LJLJL;
                                            if (c83195Wkx2 != null) {
                                                C83198Wl0 c83198Wl0 = new C83198Wl0(context2, root4, c83232WlY, c83195Wkx2);
                                                this.LJLJLJ = c83198Wl0;
                                                ((HashMap) c50765Jw9.LIZ).put(InterfaceC83268Wm8.class, c83198Wl0);
                                                this.LJLJLLL = new C83203Wl5(interfaceC83142Wk6, this.LJLLJ, this.LJLLL, c68249QqT, c50765Jw9, c83232WlY);
                                                C83262Wm2 c83262Wm2 = c83232WlY.LJIIIZ.LIZ;
                                                C83208WlA c83208WlA8 = this.LJLILLLLZI;
                                                if (c83208WlA8 != null) {
                                                    View root5 = c83208WlA8.getRoot();
                                                    C83203Wl5 c83203Wl5 = this.LJLJLLL;
                                                    if (c83203Wl5 != null) {
                                                        c83262Wm2.invoke(context2, root5, c83232WlY, c83203Wl5);
                                                        C83208WlA c83208WlA9 = this.LJLILLLLZI;
                                                        if (c83208WlA9 != null) {
                                                            View root6 = c83208WlA9.getRoot();
                                                            C83203Wl5 c83203Wl52 = this.LJLJLLL;
                                                            if (c83203Wl52 != null) {
                                                                o.LJIIIZ(root6, "root");
                                                                C83204Wl6 c83204Wl6 = new C83204Wl6(context2, root6, c83232WlY, c83203Wl52);
                                                                this.LJLL = c83204Wl6;
                                                                ((HashMap) c50765Jw9.LIZ).put(InterfaceC83256Wlw.class, c83204Wl6);
                                                                InterfaceC83233WlZ interfaceC83233WlZ = this.LJLLL;
                                                                C83210WlC c83210WlC2 = this.LJLJJI;
                                                                if (c83210WlC2 != null) {
                                                                    this.LJLJJL = new C83252Wls(interfaceC83142Wk6, c68249QqT, interfaceC83233WlZ, c83210WlC2);
                                                                    C83265Wm5 c83265Wm5 = c83232WlY.LJIIIIZZ.LIZ;
                                                                    C83208WlA c83208WlA10 = this.LJLILLLLZI;
                                                                    if (c83208WlA10 != null) {
                                                                        View root7 = c83208WlA10.getRoot();
                                                                        C83252Wls c83252Wls = this.LJLJJL;
                                                                        if (c83252Wls != null) {
                                                                            c83265Wm5.invoke(context2, root7, c83232WlY, c83252Wls);
                                                                            C83208WlA c83208WlA11 = this.LJLILLLLZI;
                                                                            if (c83208WlA11 != null) {
                                                                                View root8 = c83208WlA11.getRoot();
                                                                                C83252Wls c83252Wls2 = this.LJLJJL;
                                                                                if (c83252Wls2 != null) {
                                                                                    C83238Wle c83238Wle = new C83238Wle(context2, root8, c83232WlY, c83252Wls2);
                                                                                    this.LJLJJLL = c83238Wle;
                                                                                    ((HashMap) c50765Jw9.LIZ).put(InterfaceC83293WmX.class, c83238Wle);
                                                                                    InterfaceC83144Wk8 interfaceC83144Wk8 = this.LJLLJ;
                                                                                    C83204Wl6 c83204Wl62 = this.LJLL;
                                                                                    if (c83204Wl62 != null) {
                                                                                        C83238Wle c83238Wle2 = this.LJLJJLL;
                                                                                        if (c83238Wle2 != null) {
                                                                                            this.LJLLI = new C83248Wlo(interfaceC83142Wk6, interfaceC83144Wk8, c68249QqT, c83204Wl62, c83238Wle2);
                                                                                            C83261Wm1 c83261Wm1 = c83232WlY.LJIIJ.LIZ;
                                                                                            C83208WlA c83208WlA12 = this.LJLILLLLZI;
                                                                                            if (c83208WlA12 != null) {
                                                                                                View root9 = c83208WlA12.getRoot();
                                                                                                C83248Wlo c83248Wlo = this.LJLLI;
                                                                                                if (c83248Wlo != null) {
                                                                                                    c83261Wm1.invoke(context2, root9, c83232WlY, c83248Wlo);
                                                                                                    C83208WlA c83208WlA13 = this.LJLILLLLZI;
                                                                                                    if (c83208WlA13 != null) {
                                                                                                        View root10 = c83208WlA13.getRoot();
                                                                                                        C83248Wlo c83248Wlo2 = this.LJLLI;
                                                                                                        if (c83248Wlo2 != null) {
                                                                                                            C83231WlX c83231WlX = new C83231WlX(context2, root10, c83232WlY, c83248Wlo2);
                                                                                                            this.LJLLILLLL = c83231WlX;
                                                                                                            ((HashMap) c50765Jw9.LIZ).put(InterfaceC83197Wkz.class, c83231WlX);
                                                                                                            if (context2 instanceof C29S) {
                                                                                                                WM7 LJIIJJI = C1XY.LJIIJJI(viewGroup);
                                                                                                                LifecycleOwner lifecycleOwner = (LifecycleOwner) (LJIIJJI != null ? LJIIJJI : context2);
                                                                                                                lifecycleOwner.getLifecycle().addObserver(this);
                                                                                                                interfaceC83142Wk6.B7().safeObserve(lifecycleOwner, new AObserverS82S0100000_14(this, 58));
                                                                                                                interfaceC83142Wk6.g8().observe(lifecycleOwner, new AObserverS82S0100000_14(this, 59));
                                                                                                                interfaceC83142Wk6.c8().safeObserve(lifecycleOwner, new AObserverS82S0100000_14(this, 60));
                                                                                                                return;
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                        o.LJIJI("enableViewBusiness");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    o.LJIJI("contentView");
                                                                                                    throw null;
                                                                                                }
                                                                                                o.LJIJI("enableViewBusiness");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("contentView");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("beautyTabView");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("beautyResetView");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("tabViewBusiness");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("contentView");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("tabViewBusiness");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("contentView");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("beautyList");
                                                                throw null;
                                                            }
                                                            o.LJIJI("beautyResetBusiness");
                                                            throw null;
                                                        }
                                                        o.LJIJI("contentView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("beautyResetBusiness");
                                                    throw null;
                                                }
                                                o.LJIJI("contentView");
                                                throw null;
                                            }
                                            o.LJIJI("seekBarBusiness");
                                            throw null;
                                        }
                                        o.LJIJI("contentView");
                                        throw null;
                                    }
                                    o.LJIJI("seekBarBusiness");
                                    throw null;
                                }
                                o.LJIJI("contentView");
                                throw null;
                            }
                            o.LJIJI("listBusiness");
                            throw null;
                        }
                        o.LJIJI("contentView");
                        throw null;
                    }
                    o.LJIJI("listBusiness");
                    throw null;
                }
                o.LJIJI("contentView");
                throw null;
            }
            o.LJIJI("contentView");
            throw null;
        }
        o.LJIJI("contentView");
        throw null;
    }
}
