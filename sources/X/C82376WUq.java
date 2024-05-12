package X;

import Y.ACListenerS34S0100000_14;
import Y.AObjectS129S0200000_14;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WUq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82376WUq implements WV0 {
    public boolean LIZ = true;
    public final /* synthetic */ I3X LIZIZ;
    public final /* synthetic */ WM7 LIZJ;
    public final /* synthetic */ ActivityC45651qj LIZLLL;
    public final /* synthetic */ ShortVideoContext LJ;
    public final /* synthetic */ View.OnClickListener LJFF;
    public final /* synthetic */ ViewOnTouchListenerC82375WUp LJI;
    public final /* synthetic */ InterfaceC45999I3n LJII;
    public final /* synthetic */ I0N LJIIIIZZ;
    public final /* synthetic */ InterfaceC82086WJm LJIIIZ;
    public final /* synthetic */ C82385WUz LJIIJ;

    @Override // X.WV0
    public final boolean LJLLLLLL() {
        return false;
    }

    @Override // X.WV0
    public final void LLLLIILLL() {
    }

    @Override // X.WV0
    public final void LJJIJIIJIL() {
        this.LJI.setCurrentScaleMode(0);
        this.LJIIIZ.LJL();
    }

    @Override // X.WV0
    public final void LJJJJI() {
        I3Q.LIZ(I3P.LIGHTENING);
        if (C43150Gwc.LIZ) {
            C43150Gwc.LIZ = false;
            C43150Gwc.LIZLLL("record_start");
        }
        this.LIZIZ.Sk0(0);
        WV9 wv9 = this.LJIIJ.LIZ;
        if (wv9 != null) {
            ImageView imageView = wv9.LIZ.LLIIJLIL;
            if (imageView != null) {
                imageView.setVisibility(8);
                C82374WUo c82374WUo = wv9.LIZ;
                ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = c82374WUo.LLIIIL;
                if (viewOnTouchListenerC82375WUp != null) {
                    if (viewOnTouchListenerC82375WUp.LJLZ && !viewOnTouchListenerC82375WUp.LJZL && viewOnTouchListenerC82375WUp.LLJJLIIIJLLLLLLLZ) {
                        ((Handler) c82374WUo.LLJI.getValue()).postDelayed(wv9.LIZ.LLJ, 100L);
                        return;
                    }
                    return;
                }
                o.LJIJI("recordLayout");
                throw null;
            }
            o.LJIJI("recordButtonIcon");
            throw null;
        }
    }

    @Override // X.WV0
    public final void LJJJJIZL() {
        if (V16.LJJJJLI(this.LJ)) {
            new C61996OUu(this.LJI.getContext()).LIZ(0);
        }
        InterfaceC45999I3n interfaceC45999I3n = this.LJII;
        if (interfaceC45999I3n != null && interfaceC45999I3n.Kp0() && this.LJII.tF() != null) {
            this.LJII.tF().invoke(new AObjectS129S0200000_14(this.LJIIIIZZ, this.LIZIZ, 1));
            return;
        }
        this.LJIIIIZZ.W90(false, "");
        I3Q.LIZ(I3P.LIGHTENING);
        this.LIZIZ.JE(new C46156I9o("take photo"));
    }

    @Override // X.WV0
    public final boolean LLLLZ() {
        return C78598Ut0.LJIIL(this.LJIIIZ);
    }

    @Override // X.WV0
    public final void LLLZL() {
        I3Q.LIZ(I3P.LIGHTENING);
        this.LJFF.onClick(this.LJI);
    }

    @Override // X.WV0
    public final void LLLZLZ() {
        WV9 wv9 = this.LJIIJ.LIZ;
        if (wv9 != null) {
            wv9.LIZ.LLJJIII();
        }
    }

    @Override // X.WV0
    public final void LLLZZIL() {
        WV9 wv9 = this.LJIIJ.LIZ;
        if (wv9 != null) {
            wv9.LIZ.LLJILJILJ(-1L, "start_handsfree_drag", true);
            wv9.LIZ.LLIZ = System.currentTimeMillis();
        }
    }

    @Override // X.WV0
    public final void LLZ() {
        boolean z;
        int i;
        WV9 wv9 = this.LJIIJ.LIZ;
        if (wv9 != null) {
            ViewGroup viewGroup = wv9.LIZ.LLIIL;
            if (viewGroup != null) {
                if (viewGroup.getVisibility() == 0) {
                    wv9.LIZ.LLJJI();
                    TuxTextView tuxTextView = wv9.LIZ.LLIIZ;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(8);
                        if (wv9.LIZ.LJLJI.LIZIZ().size() == 0 && ((i = wv9.LIZ.LJLJI.shootMode) == 17 || i == 15)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            C82374WUo c82374WUo = wv9.LIZ;
                            ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = c82374WUo.LLIIIL;
                            if (viewOnTouchListenerC82375WUp != null) {
                                if (viewOnTouchListenerC82375WUp.LJZL) {
                                    c82374WUo.f(0);
                                }
                            } else {
                                o.LJIJI("recordLayout");
                                throw null;
                            }
                        }
                        C82374WUo c82374WUo2 = wv9.LIZ;
                        long currentTimeMillis = System.currentTimeMillis();
                        C82374WUo c82374WUo3 = wv9.LIZ;
                        long j = currentTimeMillis - c82374WUo3.LLIZ;
                        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp2 = c82374WUo3.LLIIIL;
                        if (viewOnTouchListenerC82375WUp2 != null) {
                            c82374WUo2.LLJILJILJ(j, "end_handsfree_drag", viewOnTouchListenerC82375WUp2.LJZL);
                            return;
                        } else {
                            o.LJIJI("recordLayout");
                            throw null;
                        }
                    }
                    o.LJIJI("tvHint");
                    throw null;
                }
                return;
            }
            o.LJIJI("handsFreeLayout");
            throw null;
        }
    }

    @Override // X.WV0
    public final void LLIL(int i) {
        if (((ShortVideoContextViewModel) C165706es.LJIIIIZZ(this.LIZJ, this.LIZLLL, null, 4).get(ShortVideoContextViewModel.class)).gv0()) {
            return;
        }
        this.LIZIZ.r10(new C44237HXt(i));
        WV9 wv9 = this.LJIIJ.LIZ;
        if (wv9 != null) {
            if (i == 2) {
                ViewGroup viewGroup = wv9.LIZ.LLIIL;
                if (viewGroup != null) {
                    if (viewGroup.getVisibility() == 8) {
                        wv9.LIZ.LLJJIJI();
                        return;
                    }
                    return;
                }
                o.LJIJI("handsFreeLayout");
                throw null;
            }
            wv9.LIZ.LLJJI();
        }
    }

    @Override // X.WV0
    public final void LLLLLZL(float f) {
        float f2;
        float y;
        if (!C52264KfE.LIZ) {
            f2 = 100.0f + f;
        } else {
            f2 = f;
        }
        if (this.LIZ && f2 >= 0.0f) {
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C165706es.LJFF(this.LIZJ).get(ShortVideoContextViewModel.class)).LJLIL;
            if (shortVideoContext != null) {
                G8U.LIZ(1, shortVideoContext.LJI(), shortVideoContext.shootWay, "press_record_button");
            }
            this.LIZ = false;
        }
        this.LJI.setHasBeenMoveScaled(true);
        InterfaceC82086WJm interfaceC82086WJm = this.LJIIIZ;
        if (C52910Kpe.LIZ()) {
            Object parent = this.LJI.getParent();
            if (parent instanceof View) {
                y = this.LJI.getY() + ((View) parent).getY();
                interfaceC82086WJm.LLILII(f, y);
            }
        }
        y = this.LJI.getY();
        interfaceC82086WJm.LLILII(f, y);
    }

    @Override // X.WV0
    public final void LLLZLL(long j) {
        WV9 wv9 = this.LJIIJ.LIZ;
        if (wv9 != null) {
            ViewGroup viewGroup = wv9.LIZ.LLIIL;
            if (viewGroup != null) {
                if (viewGroup.getVisibility() == 8) {
                    wv9.LIZ.LLJJIJI();
                }
                ViewGroup viewGroup2 = wv9.LIZ.LLIIL;
                if (viewGroup2 != null) {
                    if (viewGroup2.getVisibility() != 0) {
                        return;
                    }
                    C82374WUo c82374WUo = wv9.LIZ;
                    TuxIconView tuxIconView = c82374WUo.LLIILZL;
                    if (tuxIconView != null) {
                        tuxIconView.setSelected(true);
                        tuxIconView.setIconRes(R.raw.icon_lock_fill);
                        tuxIconView.setTintColor(C04330Ez.LIZIZ(c82374WUo.requireSceneContext(), R.color.bc));
                        C82374WUo c82374WUo2 = wv9.LIZ;
                        View view = c82374WUo2.LLIILII;
                        if (view != null) {
                            view.setBackgroundColor(C04330Ez.LIZIZ(c82374WUo2.requireSceneContext(), R.color.bc));
                            C82374WUo c82374WUo3 = wv9.LIZ;
                            TuxTextView tuxTextView = c82374WUo3.LLIIZ;
                            if (tuxTextView != null) {
                                tuxTextView.setText(c82374WUo3.requireSceneContext().getText(R.string.jli));
                                Context requireSceneContext = wv9.LIZ.requireSceneContext();
                                o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                                new C61996OUu(requireSceneContext).LIZ(0);
                                wv9.LIZ.LJLJI.creativeModel.commonMobModel.isHandsFreeUsed = true;
                                return;
                            }
                            o.LJIJI("tvHint");
                            throw null;
                        }
                        o.LJIJI("handsFreeLine");
                        throw null;
                    }
                    o.LJIJI("handsFreeIcon");
                    throw null;
                }
                o.LJIJI("handsFreeLayout");
                throw null;
            }
            o.LJIJI("handsFreeLayout");
            throw null;
        }
    }

    @Override // X.WV0
    public final void LLLZZ(boolean z) {
        I9L i9l = new I9L("record end");
        int i = this.LJ.shootMode;
        if ((i == 17 || i == 15 || i == 20) && !z) {
            this.LIZIZ.J0().LIZ();
            i9l.LIZ = 5;
            this.LIZIZ.Ec0(i9l);
            this.LJI.setVisibility(8);
            WV9 wv9 = this.LJIIJ.LIZ;
            if (wv9 != null) {
                WV6 wv6 = wv9.LIZ.LLI;
                if (wv6 != null) {
                    wv6.setVisibility(8);
                    TextView textView = wv9.LIZ.LLIFFJFJJ;
                    if (textView != null) {
                        textView.setVisibility(8);
                        C82374WUo c82374WUo = wv9.LIZ;
                        c82374WUo.LLILZLL = false;
                        ViewGroup viewGroup = c82374WUo.LLIIL;
                        if (viewGroup != null) {
                            if (viewGroup.getVisibility() == 0) {
                                C82374WUo c82374WUo2 = wv9.LIZ;
                                long currentTimeMillis = System.currentTimeMillis();
                                C82374WUo c82374WUo3 = wv9.LIZ;
                                long j = currentTimeMillis - c82374WUo3.LLIZ;
                                ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = c82374WUo3.LLIIIL;
                                if (viewOnTouchListenerC82375WUp != null) {
                                    c82374WUo2.LLJILJILJ(j, "end_handsfree_drag", viewOnTouchListenerC82375WUp.LJZL);
                                } else {
                                    o.LJIJI("recordLayout");
                                    throw null;
                                }
                            }
                            wv9.LIZ.LLJJI();
                            return;
                        }
                        o.LJIJI("handsFreeLayout");
                        throw null;
                    }
                    o.LJIJI("progressTextView");
                    throw null;
                }
                o.LJIJI("progressSegmentView");
                throw null;
            }
            return;
        }
        this.LIZIZ.Ec0(i9l);
    }

    public C82376WUq(C82385WUz c82385WUz, I3X i3x, WM7 wm7, ActivityC45651qj activityC45651qj, ShortVideoContext shortVideoContext, ACListenerS34S0100000_14 aCListenerS34S0100000_14, ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp, InterfaceC45999I3n interfaceC45999I3n, I0N i0n, InterfaceC82086WJm interfaceC82086WJm) {
        this.LJIIJ = c82385WUz;
        this.LIZIZ = i3x;
        this.LIZJ = wm7;
        this.LIZLLL = activityC45651qj;
        this.LJ = shortVideoContext;
        this.LJFF = aCListenerS34S0100000_14;
        this.LJI = viewOnTouchListenerC82375WUp;
        this.LJII = interfaceC45999I3n;
        this.LJIIIIZZ = i0n;
        this.LJIIIZ = interfaceC82086WJm;
    }
}
