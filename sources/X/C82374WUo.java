package X;

import Y.ARunnableS50S0100000_14;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WUo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82374WUo extends WM7 {
    public final InterfaceC82086WJm LJLIL;
    public final I3X LJLILLLLZI;
    public final ShortVideoContext LJLJI;
    public final C0IB<Long> LJLJJI;
    public final C0IB<Boolean> LJLJJL;
    public final C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> LJLJJLL;
    public final C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LJLJL;
    public final C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LJLJLJ;
    public final C0IB<Integer> LJLJLLL;
    public final C0IB<RetakeVideoContext> LJLL;
    public final C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> LJLLI;
    public final C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LJLLILLLL;
    public final C0IB<Boolean> LJLLJ;
    public final C0IB<Boolean> LJLLL;
    public final C0IB<Boolean> LJLLLL;
    public final C0IB<ScaleGestureDetector> LJLLLLLL;
    public final C0IB<WXG> LJLZ;
    public final C0IB<Long> LJZ;
    public final C40871j1<Boolean> LJZI;
    public final C46611sH<Integer> LJZL;
    public final I8W LL;
    public final InterfaceC45999I3n LLD;
    public final C29901Fi<C76800UCe> LLF;
    public final C29901Fi<C76800UCe> LLFF;
    public final I0N LLFFF;
    public final C82622Wbi LLFII;
    public boolean LLFZ;
    public WV6 LLI;
    public TextView LLIFFJFJJ;
    public View LLII;
    public View LLIIII;
    public C82385WUz LLIIIILZ;
    public ViewGroup LLIIIJ;
    public ViewOnTouchListenerC82375WUp LLIIIL;
    public View LLIIIZ;
    public View LLIIJI;
    public ImageView LLIIJLIL;
    public ViewGroup LLIIL;
    public View LLIILII;
    public TuxIconView LLIILZL;
    public TuxTextView LLIIZ;
    public final int LLIL;
    public final int LLILII;
    public final int LLILIL;
    public final int LLILL;
    public C76800UCe LLILLIZIL;
    public boolean LLILLJJLI;
    public FrameLayout LLILLL;
    public FrameLayout LLILZ;
    public ImageView LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;
    public String LLIZLLLIL;
    public final ARunnableS50S0100000_14 LLJ;
    public final C62822Ol8 LLJI;
    public int LLJIJIL;

    public final int LLJILJIL() {
        boolean z;
        C0IB<Boolean> c0ib = this.LJLLLL;
        if (c0ib != null) {
            z = o.LJ(c0ib.LIZ(), Boolean.TRUE);
        } else {
            z = false;
        }
        return SFS.LJI(10.0d) + C1549666i.LIZ(z) + this.LLIL;
    }

    public final void LLJJ() {
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = this.LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            int i = viewOnTouchListenerC82375WUp.LJLLILLLL;
            if (i == 10 || i == 9 || i == 3) {
                if (viewOnTouchListenerC82375WUp.LJLLLLLL == 1) {
                    viewOnTouchListenerC82375WUp.LJIIIZ(1);
                    viewOnTouchListenerC82375WUp.LJIIIIZZ(0);
                } else {
                    viewOnTouchListenerC82375WUp.LJIIIZ(12);
                }
                viewOnTouchListenerC82375WUp.LLL = false;
                viewOnTouchListenerC82375WUp.invalidate();
                return;
            }
            return;
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    public final void LLJJI() {
        ((Handler) this.LLJI.getValue()).removeCallbacks(this.LLJ);
        ViewGroup viewGroup = this.LLIIL;
        if (viewGroup != null) {
            if (viewGroup.getVisibility() == 0) {
                ViewGroup viewGroup2 = this.LLIIL;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                    TuxTextView tuxTextView = this.LLIIZ;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(8);
                        LLJJIII();
                        return;
                    } else {
                        o.LJIJI("tvHint");
                        throw null;
                    }
                }
                o.LJIJI("handsFreeLayout");
                throw null;
            }
            return;
        }
        o.LJIJI("handsFreeLayout");
        throw null;
    }

    public final void LLJJIII() {
        TuxIconView tuxIconView = this.LLIILZL;
        if (tuxIconView != null) {
            tuxIconView.setSelected(false);
            tuxIconView.setIconRes(R.raw.icon_unlock_fill);
            tuxIconView.setTintColor(C04330Ez.LIZIZ(requireSceneContext(), R.color.be));
            View view = this.LLIILII;
            if (view != null) {
                view.setBackgroundColor(C04330Ez.LIZIZ(requireSceneContext(), R.color.be));
                TuxTextView tuxTextView = this.LLIIZ;
                if (tuxTextView != null) {
                    tuxTextView.setText(requireSceneContext().getText(R.string.jlj));
                    return;
                } else {
                    o.LJIJI("tvHint");
                    throw null;
                }
            }
            o.LJIJI("handsFreeLine");
            throw null;
        }
        o.LJIJI("handsFreeIcon");
        throw null;
    }

    public final void LLJJIJI() {
        ((Handler) this.LLJI.getValue()).removeCallbacks(this.LLJ);
        if (getSceneContext() != null) {
            ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = this.LLIIIL;
            if (viewOnTouchListenerC82375WUp != null) {
                if (viewOnTouchListenerC82375WUp.LJLZ && !viewOnTouchListenerC82375WUp.LJZL && viewOnTouchListenerC82375WUp.LLJJLIIIJLLLLLLLZ) {
                    ViewGroup viewGroup = this.LLIIL;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                        TuxTextView tuxTextView = this.LLIIZ;
                        if (tuxTextView != null) {
                            tuxTextView.setVisibility(0);
                            f(8);
                            return;
                        } else {
                            o.LJIJI("tvHint");
                            throw null;
                        }
                    }
                    o.LJIJI("handsFreeLayout");
                    throw null;
                }
                return;
            }
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = this.LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            if (viewOnTouchListenerC82375WUp.LJZL) {
                Boolean LIZ = this.LJLILLLLZI.isRecording().LIZ();
                o.LJIIIIZZ(LIZ, "recordControlApi.isRecording.value");
                if (LIZ.booleanValue()) {
                    ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp2 = this.LLIIIL;
                    if (viewOnTouchListenerC82375WUp2 != null) {
                        viewOnTouchListenerC82375WUp2.LLJLLL.LLLZZ(false);
                        viewOnTouchListenerC82375WUp2.LJIIIZ(9);
                        return;
                    } else {
                        o.LJIJI("recordLayout");
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = this.LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            int i = viewOnTouchListenerC82375WUp.LLILLL;
            if (i != -1) {
                viewOnTouchListenerC82375WUp.LJLLJ = i;
                viewOnTouchListenerC82375WUp.LLILLL = -1;
                viewOnTouchListenerC82375WUp.invalidate();
            }
            viewOnTouchListenerC82375WUp.LJZL = false;
            viewOnTouchListenerC82375WUp.setHasBeenMoveScaled(false);
            viewOnTouchListenerC82375WUp.LLJLLL.LJJIJIIJIL();
            int i2 = viewOnTouchListenerC82375WUp.LJLLILLLL;
            if (i2 == 3 || i2 == 2 || i2 == 11 || i2 == 13 || i2 == 14) {
                if (viewOnTouchListenerC82375WUp.LJLJI > 0 && i2 != 13 && i2 != 14) {
                    viewOnTouchListenerC82375WUp.LJIIIZ(9);
                } else {
                    viewOnTouchListenerC82375WUp.LJIIIZ(4);
                }
            }
            viewOnTouchListenerC82375WUp.LLJLLL.LLLZZ(true);
            viewOnTouchListenerC82375WUp.LLJILJIL = System.currentTimeMillis();
            viewOnTouchListenerC82375WUp.invalidate();
            ViewGroup viewGroup = this.LLIIL;
            if (viewGroup != null) {
                if (viewGroup.getVisibility() == 0) {
                    LLJJI();
                    return;
                }
                return;
            }
            o.LJIJI("handsFreeLayout");
            throw null;
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        C76800UCe c76800UCe = this.LLILLIZIL;
        if (c76800UCe != null && !o.LJ(c76800UCe, C76800UCe.LIZ)) {
            Object obj = this.LLILLIZIL;
            if (obj instanceof Dialog) {
                o.LJII(obj, "null cannot be cast to non-null type android.app.Dialog");
                Dialog dialog = (Dialog) obj;
                if (dialog.isShowing()) {
                    dialog.dismiss();
                    return;
                }
                return;
            }
            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.tux.dialog.TuxDialog");
            C26231ARf c26231ARf = (C26231ARf) obj;
            if (!c26231ARf.LJII()) {
                return;
            }
            c26231ARf.LIZIZ(null);
        }
    }

    public final void LJJIIZI(boolean z) {
        boolean z2;
        boolean z3;
        float f;
        int i = 0;
        if (C00F.LIZ(31744, 0, "show_record_button_on_effect_panel", true) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            Context requireSceneContext = requireSceneContext();
            if (z2) {
                f = 52.0f;
            } else {
                f = 58.0f;
            }
            float LIZJ = KL2.LIZJ(requireSceneContext, f) / this.LLILII;
            if (!C157226Fa.LIZ.LJIILIIL()) {
                i = 26;
            }
            ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = this.LLIIIL;
            if (viewOnTouchListenerC82375WUp != null) {
                ViewGroup.LayoutParams layoutParams = viewOnTouchListenerC82375WUp.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = SFS.LJI(10.0d) + i;
                ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp2 = this.LLIIIL;
                if (viewOnTouchListenerC82375WUp2 != null) {
                    viewOnTouchListenerC82375WUp2.setLayoutParams(layoutParams2);
                    ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp3 = this.LLIIIL;
                    if (viewOnTouchListenerC82375WUp3 != null) {
                        viewOnTouchListenerC82375WUp3.setScaleX(LIZJ);
                        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp4 = this.LLIIIL;
                        if (viewOnTouchListenerC82375WUp4 != null) {
                            viewOnTouchListenerC82375WUp4.setScaleY(LIZJ);
                            WV6 wv6 = this.LLI;
                            if (wv6 != null) {
                                ViewGroup.LayoutParams layoutParams3 = wv6.getLayoutParams();
                                o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                                marginLayoutParams.bottomMargin = SFS.LJI(12.0d) + 26;
                                WV6 wv62 = this.LLI;
                                if (wv62 != null) {
                                    wv62.setLayoutParams(marginLayoutParams);
                                    WV6 wv63 = this.LLI;
                                    if (wv63 != null) {
                                        wv63.setScaleX(LIZJ);
                                        WV6 wv64 = this.LLI;
                                        if (wv64 != null) {
                                            wv64.setScaleY(LIZJ);
                                            TextView textView = this.LLIFFJFJJ;
                                            if (textView != null) {
                                                textView.setVisibility(8);
                                                ImageView imageView = this.LLIIJLIL;
                                                if (imageView != null) {
                                                    ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                                                    o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                                                    layoutParams5.bottomMargin = SFS.LJI(18.0d) + AnonymousClass030.LIZJ(this.LLILII, this.LLILIL, 2, i);
                                                    ImageView imageView2 = this.LLIIJLIL;
                                                    if (imageView2 != null) {
                                                        imageView2.setLayoutParams(layoutParams5);
                                                        ImageView imageView3 = this.LLIIJLIL;
                                                        if (imageView3 != null) {
                                                            imageView3.setScaleX(LIZJ);
                                                            ImageView imageView4 = this.LLIIJLIL;
                                                            if (imageView4 != null) {
                                                                imageView4.setScaleY(LIZJ);
                                                                this.LLILLJJLI = true;
                                                                return;
                                                            } else {
                                                                o.LJIJI("recordButtonIcon");
                                                                throw null;
                                                            }
                                                        }
                                                        o.LJIJI("recordButtonIcon");
                                                        throw null;
                                                    }
                                                    o.LJIJI("recordButtonIcon");
                                                    throw null;
                                                }
                                                o.LJIJI("recordButtonIcon");
                                                throw null;
                                            }
                                            o.LJIJI("progressTextView");
                                            throw null;
                                        }
                                        o.LJIJI("progressSegmentView");
                                        throw null;
                                    }
                                    o.LJIJI("progressSegmentView");
                                    throw null;
                                }
                                o.LJIJI("progressSegmentView");
                                throw null;
                            }
                            o.LJIJI("progressSegmentView");
                            throw null;
                        }
                        o.LJIJI("recordLayout");
                        throw null;
                    }
                    o.LJIJI("recordLayout");
                    throw null;
                }
                o.LJIJI("recordLayout");
                throw null;
            }
            o.LJIJI("recordLayout");
            throw null;
        }
        C0IB<Boolean> c0ib = this.LJLLLL;
        if (c0ib != null) {
            z3 = o.LJ(c0ib.LIZ(), Boolean.TRUE);
        } else {
            z3 = false;
        }
        int LIZ = C1549666i.LIZ(z3) + this.LLIL;
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp5 = this.LLIIIL;
        if (viewOnTouchListenerC82375WUp5 != null) {
            ViewGroup.LayoutParams layoutParams6 = viewOnTouchListenerC82375WUp5.getLayoutParams();
            o.LJII(layoutParams6, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
            layoutParams7.bottomMargin = LIZ;
            ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp6 = this.LLIIIL;
            if (viewOnTouchListenerC82375WUp6 != null) {
                viewOnTouchListenerC82375WUp6.setLayoutParams(layoutParams7);
                ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp7 = this.LLIIIL;
                if (viewOnTouchListenerC82375WUp7 != null) {
                    viewOnTouchListenerC82375WUp7.setScaleX(1.0f);
                    ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp8 = this.LLIIIL;
                    if (viewOnTouchListenerC82375WUp8 != null) {
                        viewOnTouchListenerC82375WUp8.setScaleY(1.0f);
                        WV6 wv65 = this.LLI;
                        if (wv65 != null) {
                            ViewGroup.LayoutParams layoutParams8 = wv65.getLayoutParams();
                            o.LJII(layoutParams8, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams8;
                            marginLayoutParams2.bottomMargin = LLJILJIL();
                            WV6 wv66 = this.LLI;
                            if (wv66 != null) {
                                wv66.setLayoutParams(marginLayoutParams2);
                                WV6 wv67 = this.LLI;
                                if (wv67 != null) {
                                    wv67.setScaleX(1.0f);
                                    WV6 wv68 = this.LLI;
                                    if (wv68 != null) {
                                        wv68.setScaleY(1.0f);
                                        if (this.LLFZ) {
                                            TextView textView2 = this.LLIFFJFJJ;
                                            if (textView2 != null) {
                                                textView2.setVisibility(0);
                                            } else {
                                                o.LJIJI("progressTextView");
                                                throw null;
                                            }
                                        }
                                        ImageView imageView5 = this.LLIIJLIL;
                                        if (imageView5 != null) {
                                            ViewGroup.LayoutParams layoutParams9 = imageView5.getLayoutParams();
                                            o.LJII(layoutParams9, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams9;
                                            layoutParams10.bottomMargin = AnonymousClass030.LIZJ(this.LLILII, this.LLILIL, 2, LLJILJIL());
                                            ImageView imageView6 = this.LLIIJLIL;
                                            if (imageView6 != null) {
                                                imageView6.setLayoutParams(layoutParams10);
                                                ImageView imageView7 = this.LLIIJLIL;
                                                if (imageView7 != null) {
                                                    imageView7.setScaleX(1.0f);
                                                    ImageView imageView8 = this.LLIIJLIL;
                                                    if (imageView8 != null) {
                                                        imageView8.setScaleY(1.0f);
                                                        this.LLILLJJLI = false;
                                                        return;
                                                    } else {
                                                        o.LJIJI("recordButtonIcon");
                                                        throw null;
                                                    }
                                                }
                                                o.LJIJI("recordButtonIcon");
                                                throw null;
                                            }
                                            o.LJIJI("recordButtonIcon");
                                            throw null;
                                        }
                                        o.LJIJI("recordButtonIcon");
                                        throw null;
                                    }
                                    o.LJIJI("progressSegmentView");
                                    throw null;
                                }
                                o.LJIJI("progressSegmentView");
                                throw null;
                            }
                            o.LJIJI("progressSegmentView");
                            throw null;
                        }
                        o.LJIJI("progressSegmentView");
                        throw null;
                    }
                    o.LJIJI("recordLayout");
                    throw null;
                }
                o.LJIJI("recordLayout");
                throw null;
            }
            o.LJIJI("recordLayout");
            throw null;
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    public final void LLJILLL(Animation animation) {
        o.LJIIIZ(animation, "animation");
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = this.LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            KL2.LIZ(viewOnTouchListenerC82375WUp);
            ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp2 = this.LLIIIL;
            if (viewOnTouchListenerC82375WUp2 != null) {
                viewOnTouchListenerC82375WUp2.startAnimation(animation);
                return;
            } else {
                o.LJIJI("recordLayout");
                throw null;
            }
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    public final void LLJJIJIIJIL(boolean z) {
        int i;
        ImageView imageView = this.LLIIJLIL;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            ShortVideoContext shortVideoContext = this.LJLJI;
            if (shortVideoContext.creativeModel.initialModel.dmCameraModel.enterFromDM || shortVideoContext.LJJIJIIJIL()) {
                ImageView imageView2 = this.LLIIJLIL;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("recordButtonIcon");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("recordButtonIcon");
        throw null;
    }

    public final void f(int i) {
        if (i == 0) {
            ViewGroup viewGroup = this.LLIIL;
            if (viewGroup != null) {
                if (viewGroup.getVisibility() == 0) {
                    Boolean LIZ = this.LJLILLLLZI.Ue0().LIZ();
                    o.LJIIIIZZ(LIZ, "recordControlApi.hasStopped.value");
                    if (LIZ.booleanValue()) {
                        LLJJI();
                    } else {
                        return;
                    }
                }
            } else {
                o.LJIJI("handsFreeLayout");
                throw null;
            }
        }
        View view = this.LLIIJI;
        if (view != null) {
            view.setVisibility(i);
        } else {
            o.LJIJI("goNextButton");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x03e6, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r7.shootWay, "direct_shoot") != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03db, code lost:
    
        if (r3.LJIIIIZZ() > 0) goto L96;
     */
    @Override // X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82374WUo.onActivityCreated(android.os.Bundle):void");
    }

    public final void LLJJIJIL(long j, boolean z) {
        if (j <= 0) {
            this.LLFZ = false;
            if (this.LJLJI.LJJIJIIJIL()) {
                TextView textView = this.LLIFFJFJJ;
                if (textView != null) {
                    textView.setText(this.LLIZLLLIL);
                    if (!this.LLILLJJLI) {
                        TextView textView2 = this.LLIFFJFJJ;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                        } else {
                            o.LJIJI("progressTextView");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("progressTextView");
                    throw null;
                }
            } else {
                TextView textView3 = this.LLIFFJFJJ;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                } else {
                    o.LJIJI("progressTextView");
                    throw null;
                }
            }
            Boolean LIZ = this.LJZI.LIZ();
            Boolean bool = Boolean.FALSE;
            if (!o.LJ(LIZ, bool)) {
                this.LJZI.LJI(bool);
            }
            ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = this.LLIIIL;
            if (viewOnTouchListenerC82375WUp != null) {
                viewOnTouchListenerC82375WUp.setShouldDrawBorder(true);
                return;
            } else {
                o.LJIJI("recordLayout");
                throw null;
            }
        }
        int i = (int) (j / 1000);
        if (C52910Kpe.LIZ() && z) {
            if (i == this.LLJIJIL) {
                return;
            } else {
                this.LLJIJIL = i;
            }
        }
        int i2 = i % 60;
        int i3 = (i - i2) / 60;
        if (this.LLILZLL) {
            TextView textView4 = this.LLIFFJFJJ;
            if (textView4 != null) {
                textView4.setVisibility(0);
                Boolean LIZ2 = this.LJZI.LIZ();
                Boolean bool2 = Boolean.TRUE;
                if (!o.LJ(LIZ2, bool2)) {
                    this.LJZI.LJI(bool2);
                }
            } else {
                o.LJIJI("progressTextView");
                throw null;
            }
        }
        TextView textView5 = this.LLIFFJFJJ;
        if (textView5 != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            String LLLZ = C16880lQ.LLLZ("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            LIZ3.append(LLLZ);
            LIZ3.append(':');
            String LLLZ2 = C16880lQ.LLLZ("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            o.LJIIIIZZ(LLLZ2, "format(format, *args)");
            LIZ3.append(LLLZ2);
            textView5.setText(X1D.LIZIZ(LIZ3));
            ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp2 = this.LLIIIL;
            if (viewOnTouchListenerC82375WUp2 != null) {
                viewOnTouchListenerC82375WUp2.setShouldDrawBorder(false);
                return;
            } else {
                o.LJIJI("recordLayout");
                throw null;
            }
        }
        o.LJIJI("progressTextView");
        throw null;
    }

    public final void LLJILJILJ(long j, String str, boolean z) {
        String str2;
        String str3;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", this.LJLJI.shootWay);
        c145995oB.LJI("creation_id", this.LJLJI.LJI());
        c145995oB.LIZ(this.LJLJI.videoLength, "creation_duration");
        if (!TextUtils.isEmpty(this.LJLJI.newDraftId)) {
            c145995oB.LIZLLL("new_draft_id", this.LJLJI.newDraftId);
            if (this.LJLJI.draftToEditFrom == 0) {
                c145995oB.LIZLLL("enter_method", "click_back_button");
                str3 = "general_draft_list";
            } else {
                str3 = null;
            }
            c145995oB.LIZLLL("draft_way", str3);
        }
        if (o.LJ(str, "end_handsfree_drag")) {
            if (z) {
                str2 = "success";
            } else {
                str2 = "fail";
            }
            c145995oB.LIZLLL("handsfree_result", str2);
            c145995oB.LIZIZ(j, "handsfree_duration");
        }
        c145995oB.LJI("enter_from", this.LJLJI.enterFrom);
        c145995oB.LIZ(0, "is_multi_content");
        c145995oB.LJI("music_id", this.LJLJI.getMusicId());
        c145995oB.LJI("enter_method", this.LJLJI.enterMethod);
        c145995oB.LJ("is_draft", this.LJLJI.mIsFromDraft);
        c145995oB.LJI("shoot_tab_name", this.LJLJI.LJIJI());
        GXR.LIZ(str, c145995oB.LIZ);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View LLLLIILL;
        FrameLayout.LayoutParams layoutParams;
        ViewGroup viewGroup;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (L1D.LIZIZ() || L1D.LIZ()) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cdm, container, false);
            o.LJIIIIZZ(LLLLIILL, "{\n                inflat…          )\n            }");
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cdl, container, false);
            o.LJIIIIZZ(LLLLIILL, "{\n                inflat…          )\n            }");
        }
        if (C52910Kpe.LIZ()) {
            if ((LLLLIILL instanceof ViewGroup) && (viewGroup = (ViewGroup) LLLLIILL) != null) {
                viewGroup.setClipChildren(true);
            }
            View findViewById = LLLLIILL.findViewById(R.id.bv2);
            findViewById.setMinimumWidth((int) KL2.LIZJ(findViewById.getContext(), 116.0f));
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.width = -2;
                layoutParams.height = -2;
                layoutParams.gravity = 81;
            }
            LLLLIILL.requestLayout();
        }
        return LLLLIILL;
    }

    public C82374WUo(InterfaceC82086WJm cameraApiComponent, I3X recordControlApi, ShortVideoContext shortVideoContext, C0IB<Long> progressMaxDuration, C0IB<Boolean> progressNeedDrawAnchor, C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> progressClipAnchors, C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> progressClipWithStitch, C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> progressClipWithLibrary, C0IB<Integer> retakeState, C0IB<RetakeVideoContext> retakeVideoContext, C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> retakeProgressClipAnchors, C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> retakeProgressClipWithStitch, C0IB<Boolean> progressSegmentVisible, C0IB<Boolean> c0ib, C0IB<Boolean> c0ib2, C0IB<ScaleGestureDetector> c0ib3, C0IB<WXG> c0ib4, C0IB<Long> progressText, C40871j1<Boolean> progressTextShownEvent, C46611sH<Integer> progressTextTransitionY, I8W i8w, InterfaceC45999I3n interfaceC45999I3n, C29901Fi<C76800UCe> goNextEvent, C29901Fi<C76800UCe> deleteLibraryClipEvent, I0N i0n, C82622Wbi diContainer) {
        int i;
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        o.LJIIIZ(recordControlApi, "recordControlApi");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(progressMaxDuration, "progressMaxDuration");
        o.LJIIIZ(progressNeedDrawAnchor, "progressNeedDrawAnchor");
        o.LJIIIZ(progressClipAnchors, "progressClipAnchors");
        o.LJIIIZ(progressClipWithStitch, "progressClipWithStitch");
        o.LJIIIZ(progressClipWithLibrary, "progressClipWithLibrary");
        o.LJIIIZ(retakeState, "retakeState");
        o.LJIIIZ(retakeVideoContext, "retakeVideoContext");
        o.LJIIIZ(retakeProgressClipAnchors, "retakeProgressClipAnchors");
        o.LJIIIZ(retakeProgressClipWithStitch, "retakeProgressClipWithStitch");
        o.LJIIIZ(progressSegmentVisible, "progressSegmentVisible");
        o.LJIIIZ(progressText, "progressText");
        o.LJIIIZ(progressTextShownEvent, "progressTextShownEvent");
        o.LJIIIZ(progressTextTransitionY, "progressTextTransitionY");
        o.LJIIIZ(goNextEvent, "goNextEvent");
        o.LJIIIZ(deleteLibraryClipEvent, "deleteLibraryClipEvent");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = cameraApiComponent;
        this.LJLILLLLZI = recordControlApi;
        this.LJLJI = shortVideoContext;
        this.LJLJJI = progressMaxDuration;
        this.LJLJJL = progressNeedDrawAnchor;
        this.LJLJJLL = progressClipAnchors;
        this.LJLJL = progressClipWithStitch;
        this.LJLJLJ = progressClipWithLibrary;
        this.LJLJLLL = retakeState;
        this.LJLL = retakeVideoContext;
        this.LJLLI = retakeProgressClipAnchors;
        this.LJLLILLLL = retakeProgressClipWithStitch;
        this.LJLLJ = progressSegmentVisible;
        this.LJLLL = c0ib;
        this.LJLLLL = c0ib2;
        this.LJLLLLLL = c0ib3;
        this.LJLZ = c0ib4;
        this.LJZ = progressText;
        this.LJZI = progressTextShownEvent;
        this.LJZL = progressTextTransitionY;
        this.LL = i8w;
        this.LLD = interfaceC45999I3n;
        this.LLF = goNextEvent;
        this.LLFF = deleteLibraryClipEvent;
        this.LLFFF = i0n;
        this.LLFII = diContainer;
        this.LLFZ = true;
        if (C44363Hb5.LIZ()) {
            i = 25;
        } else {
            i = 40;
        }
        this.LLIL = C7MY.LIZIZ(i);
        this.LLILII = SFS.LJI(80.0d);
        this.LLILIL = SFS.LJI(36.0d);
        this.LLILL = SFS.LJI(28.0d);
        this.LLILZLL = true;
        this.LLIZ = -1L;
        this.LLIZLLLIL = "";
        this.LLJ = new ARunnableS50S0100000_14(this, 115);
        this.LLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 223));
        this.LLJIJIL = -1;
    }
}
