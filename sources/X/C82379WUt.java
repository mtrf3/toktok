package X;

import Y.ACListenerS27S0100000_7;
import Y.AObjectS89S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.views.IDlS63S0100000_7;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.WUt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82379WUt extends WM7 implements WUW {
    public final InterfaceC82086WJm LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final I3X LJLJI;
    public final ShortVideoContext LJLJJI;
    public final C0IB<Long> LJLJJL;
    public final C0IB<Boolean> LJLJJLL;
    public final C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> LJLJL;
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
    public final C29901Fi<C76800UCe> LJZ;
    public final C29901Fi<C76800UCe> LJZI;
    public WV5 LJZL;
    public TextView LL;
    public View LLD;
    public ViewOnTouchListenerC82377WUr LLF;
    public View LLFF;
    public ImageView LLFFF;
    public final int LLFII;
    public C76800UCe LLFZ;
    public FrameLayout LLI;
    public FrameLayout LLIFFJFJJ;
    public long LLII;
    public final int LLIIII;
    public int LLIIIILZ;

    @Override // X.WUW
    public final String LJJLIIJ() {
        return "RecordControlProgressScene";
    }

    @Override // X.WUW
    public final WM7 getScene() {
        return this;
    }

    @Override // X.WUW
    public final void LJJLIIIJLJLI() {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr != null && viewOnTouchListenerC82377WUr.LJLJJI == 7) {
            viewOnTouchListenerC82377WUr.LJIIIIZZ(1);
        }
    }

    @Override // X.WUW
    public final void LLILIL() {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIIZILJ();
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WUW
    public final void LLLLII() {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIIJJI();
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WUW
    public final void LLLLIILL() {
        FrameLayout frameLayout = this.LLI;
        if (frameLayout == null) {
            return;
        }
        frameLayout.post(new ARunnableS50S0100000_14(this, 114));
    }

    @Override // X.WUW
    public final int q() {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr != null) {
            return viewOnTouchListenerC82377WUr.getCurrentScaleMode();
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIIL();
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        C76800UCe c76800UCe = this.LLFZ;
        if (c76800UCe != null && !o.LJ(c76800UCe, C76800UCe.LIZ)) {
            Object obj = this.LLFZ;
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

    @Override // X.WUW
    public final void F0(int i) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.setVisibility(i);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WUW
    public final void LJJIIZI(boolean z) {
        float f;
        boolean z2 = true;
        if (C00F.LIZ(31744, 0, "show_record_button_on_effect_panel", true) != 1) {
            z2 = false;
        }
        if (z) {
            Context requireSceneContext = requireSceneContext();
            if (z2) {
                f = 52.0f;
            } else {
                f = 58.0f;
            }
            float LIZJ = KL2.LIZJ(requireSceneContext, f) / this.LLIIII;
            ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
            if (viewOnTouchListenerC82377WUr != null) {
                ViewGroup.LayoutParams layoutParams = viewOnTouchListenerC82377WUr.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = 0;
                ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr2 = this.LLF;
                if (viewOnTouchListenerC82377WUr2 != null) {
                    viewOnTouchListenerC82377WUr2.setLayoutParams(layoutParams2);
                    ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr3 = this.LLF;
                    if (viewOnTouchListenerC82377WUr3 != null) {
                        viewOnTouchListenerC82377WUr3.setScaleX(LIZJ);
                        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr4 = this.LLF;
                        if (viewOnTouchListenerC82377WUr4 != null) {
                            viewOnTouchListenerC82377WUr4.setScaleY(LIZJ);
                            TextView textView = this.LL;
                            if (textView != null) {
                                textView.setVisibility(8);
                                ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr5 = this.LLF;
                                if (viewOnTouchListenerC82377WUr5 != null) {
                                    ViewGroup.LayoutParams layoutParams3 = viewOnTouchListenerC82377WUr5.getLayoutParams();
                                    o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                    layoutParams4.bottomMargin = 0;
                                    ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr6 = this.LLF;
                                    if (viewOnTouchListenerC82377WUr6 != null) {
                                        viewOnTouchListenerC82377WUr6.setLayoutParams(layoutParams4);
                                        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr7 = this.LLF;
                                        if (viewOnTouchListenerC82377WUr7 != null) {
                                            viewOnTouchListenerC82377WUr7.setScaleX(LIZJ);
                                            ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr8 = this.LLF;
                                            if (viewOnTouchListenerC82377WUr8 != null) {
                                                viewOnTouchListenerC82377WUr8.setScaleY(LIZJ);
                                                return;
                                            } else {
                                                o.LJIJI("recordLayout");
                                                throw null;
                                            }
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
                            o.LJIJI("progressTextView");
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
        int LIZ = C1549666i.LIZ(false) + this.LLFII;
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr9 = this.LLF;
        if (viewOnTouchListenerC82377WUr9 != null) {
            ViewGroup.LayoutParams layoutParams5 = viewOnTouchListenerC82377WUr9.getLayoutParams();
            o.LJII(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.bottomMargin = LIZ;
            ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr10 = this.LLF;
            if (viewOnTouchListenerC82377WUr10 != null) {
                viewOnTouchListenerC82377WUr10.setLayoutParams(layoutParams6);
                ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr11 = this.LLF;
                if (viewOnTouchListenerC82377WUr11 != null) {
                    viewOnTouchListenerC82377WUr11.setScaleX(1.0f);
                    ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr12 = this.LLF;
                    if (viewOnTouchListenerC82377WUr12 != null) {
                        viewOnTouchListenerC82377WUr12.setScaleY(1.0f);
                        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr13 = this.LLF;
                        if (viewOnTouchListenerC82377WUr13 != null) {
                            ViewGroup.LayoutParams layoutParams7 = viewOnTouchListenerC82377WUr13.getLayoutParams();
                            o.LJII(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                            layoutParams8.bottomMargin = C1549666i.LIZ(false) + this.LLFII;
                            ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr14 = this.LLF;
                            if (viewOnTouchListenerC82377WUr14 != null) {
                                viewOnTouchListenerC82377WUr14.setLayoutParams(layoutParams8);
                                ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr15 = this.LLF;
                                if (viewOnTouchListenerC82377WUr15 != null) {
                                    viewOnTouchListenerC82377WUr15.setScaleX(1.0f);
                                    ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr16 = this.LLF;
                                    if (viewOnTouchListenerC82377WUr16 != null) {
                                        viewOnTouchListenerC82377WUr16.setScaleY(1.0f);
                                        return;
                                    } else {
                                        o.LJIJI("recordLayout");
                                        throw null;
                                    }
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
                o.LJIJI("recordLayout");
                throw null;
            }
            o.LJIJI("recordLayout");
            throw null;
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    @Override // X.WUW
    public final void LJJLJ(float f) {
        View view = this.LLFF;
        if (view != null) {
            view.setAlpha(f);
        } else {
            o.LJIJI("deleteLast");
            throw null;
        }
    }

    @Override // X.WUW
    public final void LJJZ(boolean z) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.setEnabled(z);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WUW
    public final void LJLJJLL(int i) {
        TextView textView = this.LL;
        if (textView != null) {
            textView.setVisibility(i);
        } else {
            o.LJIJI("progressTextView");
            throw null;
        }
    }

    public final void LLJILJIL(long j) {
        long j2 = j - this.LLII;
        if (1 <= j2 && j2 < 1000 && j < this.LJLJJI.LJIILIIL()) {
            return;
        }
        this.LLII = j;
        int i = (int) (j / 1000);
        if (C52910Kpe.LIZ()) {
            if (i == this.LLIIIILZ) {
                return;
            } else {
                this.LLIIIILZ = i;
            }
        }
        int i2 = i % 60;
        int i3 = (i - i2) / 60;
        TextView textView = this.LL;
        if (textView != null) {
            StringBuilder LIZ = X1D.LIZ();
            Locale locale = Locale.ENGLISH;
            String LLLZI = C16880lQ.LLLZI(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
            LIZ.append(LLLZI);
            LIZ.append(':');
            String LLLZI2 = C16880lQ.LLLZI(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            o.LJIIIIZZ(LLLZI2, "format(locale, format, *args)");
            LIZ.append(LLLZI2);
            textView.setText(X1D.LIZIZ(LIZ));
            return;
        }
        o.LJIJI("progressTextView");
        throw null;
    }

    @Override // X.WUW
    public final void LLJILLL(Animation animation) {
        o.LJIIIZ(animation, "animation");
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr != null) {
            KL2.LIZ(viewOnTouchListenerC82377WUr);
            ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr2 = this.LLF;
            if (viewOnTouchListenerC82377WUr2 != null) {
                viewOnTouchListenerC82377WUr2.startAnimation(animation);
                return;
            } else {
                o.LJIJI("recordLayout");
                throw null;
            }
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    @Override // X.WUW
    public final void LLLLLLLLLL(boolean z) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LLILLIZIL = z;
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WUW
    public final void LLLLLLZZ(boolean z) {
        ImageView imageView = this.LLFFF;
        if (imageView != null) {
            imageView.setSelected(z);
        } else {
            o.LJIJI("goNextButton");
            throw null;
        }
    }

    @Override // X.WUW
    public final void LLLLLZ(int i) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.setCurrentScaleMode(i);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WUW
    public final void f(int i) {
        ImageView imageView = this.LLFFF;
        if (imageView != null) {
            imageView.setVisibility(i);
        } else {
            o.LJIJI("goNextButton");
            throw null;
        }
    }

    @Override // X.WUW
    public final void g7(Long l) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr != null && l != null) {
            viewOnTouchListenerC82377WUr.setActionDownTime(l.longValue());
        }
    }

    @Override // X.WUW
    public final void h(int i) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIIJ(i);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WUW
    public final void l(int i) {
        View view = this.LLFF;
        if (view != null) {
            view.setVisibility(i);
        } else {
            o.LJIJI("deleteLast");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.iaz);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.progress_segment_view)");
        this.LJZL = (WV5) requireViewById;
        View requireViewById2 = requireViewById(R.id.mfe);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.tv_progress)");
        this.LL = (TextView) requireViewById2;
        C0IB<Boolean> c0ib = this.LJLLL;
        if (c0ib != null) {
            c0ib.LIZIZ(this, new AObjectS89S0100000_14(this, 283));
        }
        this.LJLJL.LIZIZ(this, new AObjectS89S0100000_14(this, 284));
        this.LJLJLJ.LIZIZ(this, new AObjectS89S0100000_14(this, 285));
        this.LJLJJL.LIZIZ(this, new AObjectS89S0100000_14(this, 286));
        this.LJLJJLL.LIZIZ(this, new AObjectS89S0100000_14(this, 287));
        this.LJLL.LIZIZ(this, new AObjectS89S0100000_14(this, 289));
        this.LJLLI.LIZIZ(this, new AObjectS89S0100000_14(this, 291));
        this.LJLLILLLL.LIZIZ(this, new AObjectS89S0100000_14(this, 293));
        this.LJLJLLL.LIZIZ(this, new AObjectS89S0100000_14(this, 295));
        this.LJLLJ.LIZIZ(this, new AObjectS89S0100000_14(this, 275));
        this.LJLJI.Qr0().LIZLLL(this, new AObjectS89S0100000_14(this, 276));
        View requireViewById3 = requireViewById(R.id.ioq);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.rdl_record)");
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = (ViewOnTouchListenerC82377WUr) requireViewById3;
        this.LLF = viewOnTouchListenerC82377WUr;
        viewOnTouchListenerC82377WUr.setObjectContainer(this.LJLILLLLZI);
        View requireViewById4 = requireViewById(R.id.bih);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.color_scheme_layout)");
        this.LLI = (FrameLayout) requireViewById4;
        o.LJIIIIZZ(requireViewById(R.id.bii), "requireViewById(R.id.color_scheme_lottie)");
        View requireViewById5 = requireViewById(R.id.bif);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.color_scheme_background)");
        this.LLIFFJFJJ = (FrameLayout) requireViewById5;
        o.LJIIIIZZ(requireViewById(R.id.big), "requireViewById(R.id.color_scheme_icon)");
        if (this.LJLJJI.isPhotoMvMode) {
            ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr2 = this.LLF;
            if (viewOnTouchListenerC82377WUr2 != null) {
                viewOnTouchListenerC82377WUr2.LJIILJJIL();
            } else {
                o.LJIJI("recordLayout");
                throw null;
            }
        }
        FrameLayout frameLayout = this.LLI;
        if (frameLayout != null) {
            frameLayout.bringToFront();
            View requireViewById6 = requireViewById(R.id.h11);
            o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.next_group_container)");
            this.LLD = requireViewById6;
            ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr3 = this.LLF;
            if (viewOnTouchListenerC82377WUr3 != null) {
                viewOnTouchListenerC82377WUr3.setActivity(this.mActivity);
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.mActivity;
                InterfaceC82086WJm interfaceC82086WJm = this.LJLIL;
                I3X i3x = this.LJLJI;
                ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr4 = this.LLF;
                if (viewOnTouchListenerC82377WUr4 != null) {
                    new WV4(activityC45651qj, interfaceC82086WJm, i3x, viewOnTouchListenerC82377WUr4, new ACListenerS27S0100000_7(this, 74));
                    C0IB<Boolean> c0ib2 = this.LJLLLL;
                    if (c0ib2 != null) {
                        c0ib2.LIZIZ(this, new AObjectS89S0100000_14(this, 238));
                    }
                    C0IB<ScaleGestureDetector> c0ib3 = this.LJLLLLLL;
                    if (c0ib3 != null) {
                        c0ib3.LIZIZ(this, new AObjectS89S0100000_14(this, 239));
                    }
                    C0IB<WXG> c0ib4 = this.LJLZ;
                    if (c0ib4 != null) {
                        c0ib4.LIZIZ(this, new AObjectS89S0100000_14(this, 240));
                    }
                    View requireViewById7 = requireViewById(R.id.f1k);
                    o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.iv_deleteLast)");
                    this.LLFF = requireViewById7;
                    View requireViewById8 = requireViewById(R.id.axf);
                    o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.btn_next)");
                    this.LLFFF = (ImageView) requireViewById8;
                    View view = this.LLFF;
                    if (view != null) {
                        C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 75), view);
                        ImageView imageView = this.LLFFF;
                        if (imageView != null) {
                            C16880lQ.LJIILLIIL(imageView, new IDlS63S0100000_7(this, 14));
                            this.LJLIL.vV().LIZLLL(this, new AObjectS89S0100000_14(this, 241));
                            return;
                        } else {
                            o.LJIJI("goNextButton");
                            throw null;
                        }
                    }
                    o.LJIJI("deleteLast");
                    throw null;
                }
                o.LJIJI("recordLayout");
                throw null;
            }
            o.LJIJI("recordLayout");
            throw null;
        }
        o.LJIJI("colorSchemeLayout");
        throw null;
    }

    @Override // X.WUW
    public final void LLLIL(int i, boolean z) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIILIIL(i, z);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        ViewGroup viewGroup;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ce4, container, false);
        if (C52910Kpe.LIZ() && (LLLLIILL instanceof ViewGroup) && (viewGroup = (ViewGroup) LLLLIILL) != null) {
            viewGroup.setClipChildren(true);
        }
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…e\n            }\n        }");
        return LLLLIILL;
    }

    @Override // X.WUW
    public final void z0(MotionEvent motionEvent, float f, float f2) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLF;
        if (viewOnTouchListenerC82377WUr == null) {
            return;
        }
        viewOnTouchListenerC82377WUr.onTouchEvent(motionEvent);
    }

    public C82379WUt(InterfaceC82086WJm cameraApiComponent, C82622Wbi diContainer, I3X recordControlApi, ShortVideoContext shortVideoContext, C0IB<Long> progressMaxDuration, C0IB<Boolean> progressNeedDrawAnchor, C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> progressClipAnchors, C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> progressClipWithStitch, C0IB<Integer> retakeState, C0IB<RetakeVideoContext> retakeVideoContext, C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> retakeProgressClipAnchors, C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> retakeProgressClipWithStitch, C0IB<Boolean> progressSegmentVisible, C0IB<Boolean> c0ib, C0IB<Boolean> c0ib2, C0IB<ScaleGestureDetector> c0ib3, C0IB<WXG> c0ib4, C29901Fi<C76800UCe> goNextEvent, C29901Fi<C76800UCe> deleteLibraryClipEvent) {
        int i;
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(recordControlApi, "recordControlApi");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(progressMaxDuration, "progressMaxDuration");
        o.LJIIIZ(progressNeedDrawAnchor, "progressNeedDrawAnchor");
        o.LJIIIZ(progressClipAnchors, "progressClipAnchors");
        o.LJIIIZ(progressClipWithStitch, "progressClipWithStitch");
        o.LJIIIZ(retakeState, "retakeState");
        o.LJIIIZ(retakeVideoContext, "retakeVideoContext");
        o.LJIIIZ(retakeProgressClipAnchors, "retakeProgressClipAnchors");
        o.LJIIIZ(retakeProgressClipWithStitch, "retakeProgressClipWithStitch");
        o.LJIIIZ(progressSegmentVisible, "progressSegmentVisible");
        o.LJIIIZ(goNextEvent, "goNextEvent");
        o.LJIIIZ(deleteLibraryClipEvent, "deleteLibraryClipEvent");
        this.LJLIL = cameraApiComponent;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = recordControlApi;
        this.LJLJJI = shortVideoContext;
        this.LJLJJL = progressMaxDuration;
        this.LJLJJLL = progressNeedDrawAnchor;
        this.LJLJL = progressClipAnchors;
        this.LJLJLJ = progressClipWithStitch;
        this.LJLJLLL = retakeState;
        this.LJLL = retakeVideoContext;
        this.LJLLI = retakeProgressClipAnchors;
        this.LJLLILLLL = retakeProgressClipWithStitch;
        this.LJLLJ = progressSegmentVisible;
        this.LJLLL = c0ib;
        this.LJLLLL = c0ib2;
        this.LJLLLLLL = c0ib3;
        this.LJLZ = c0ib4;
        this.LJZ = goNextEvent;
        this.LJZI = deleteLibraryClipEvent;
        if (C44363Hb5.LIZ()) {
            i = 25;
        } else {
            i = 40;
        }
        this.LLFII = C7MY.LIZIZ(i);
        this.LLIIII = SFS.LJI(80.0d);
        SFS.LJI(36.0d);
        this.LLIIIILZ = -1;
    }
}
