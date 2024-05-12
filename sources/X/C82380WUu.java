package X;

import Y.ACListenerS27S0100000_7;
import Y.AObjectS89S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.views.IDlS63S0100000_7;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WUu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82380WUu extends WM7 implements WUW {
    public final C82622Wbi LJLIL;
    public final InterfaceC82086WJm LJLILLLLZI;
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
    public WV5 LJZ;
    public View LJZI;
    public ViewOnTouchListenerC82377WUr LJZL;
    public View LL;
    public ImageView LLD;
    public final int LLF;
    public Dialog LLFF;
    public FrameLayout LLFFF;
    public FrameLayout LLFII;
    public final C62822Ol8 LLFZ;

    @Override // X.WUW
    public final void F0(int i) {
    }

    @Override // X.WUW
    public final void LJJIIZI(boolean z) {
    }

    @Override // X.WUW
    public final void LJJLIIIJLJLI() {
    }

    @Override // X.WUW
    public final String LJJLIIJ() {
        return "TTEPRecordControlProgressScene";
    }

    @Override // X.WUW
    public final void LJJZ(boolean z) {
    }

    @Override // X.WUW
    public final void LJLJJLL(int i) {
    }

    @Override // X.WUW
    public final void g7(Long l) {
    }

    @Override // X.WUW
    public final WM7 getScene() {
        return this;
    }

    @Override // X.WUW
    public final void z0(MotionEvent motionEvent, float f, float f2) {
    }

    @Override // X.WUW
    public final void LLILIL() {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LJZL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIIZILJ();
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WUW
    public final void LLLLII() {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LJZL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIIJJI();
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WUW
    public final void LLLLIILL() {
        FrameLayout frameLayout = this.LLFFF;
        if (frameLayout == null) {
            return;
        }
        frameLayout.post(new ARunnableS50S0100000_14(this, 216));
    }

    @Override // X.WUW
    public final int q() {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LJZL;
        if (viewOnTouchListenerC82377WUr != null) {
            return viewOnTouchListenerC82377WUr.getCurrentScaleMode();
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LJZL;
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
        Dialog dialog = this.LLFF;
        if (dialog != null) {
            o.LJI(dialog);
            if (dialog.isShowing()) {
                Dialog dialog2 = this.LLFF;
                o.LJI(dialog2);
                dialog2.dismiss();
            }
        }
    }

    @Override // X.WUW
    public final void LJJLJ(float f) {
        View view = this.LL;
        if (view != null) {
            view.setAlpha(f);
        } else {
            o.LJIJI("deleteLast");
            throw null;
        }
    }

    @Override // X.WUW
    public final void LLJILLL(Animation animation) {
        o.LJIIIZ(animation, "animation");
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LJZL;
        if (viewOnTouchListenerC82377WUr != null) {
            KL2.LIZ(viewOnTouchListenerC82377WUr);
            ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr2 = this.LJZL;
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
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LJZL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LLILLIZIL = z;
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WUW
    public final void LLLLLLZZ(boolean z) {
        ImageView imageView = this.LLD;
        if (imageView != null) {
            imageView.setSelected(z);
        } else {
            o.LJIJI("goNextButton");
            throw null;
        }
    }

    @Override // X.WUW
    public final void LLLLLZ(int i) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LJZL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.setCurrentScaleMode(i);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WUW
    public final void f(int i) {
        ImageView imageView = this.LLD;
        if (imageView != null) {
            imageView.setVisibility(i);
        } else {
            o.LJIJI("goNextButton");
            throw null;
        }
    }

    @Override // X.WUW
    public final void h(int i) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LJZL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIIJ(i);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WUW
    public final void l(int i) {
        View view = this.LL;
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
        this.LJZ = (WV5) requireViewById;
        C0IB<Boolean> c0ib = this.LJLLL;
        if (c0ib != null) {
            c0ib.LIZIZ(this, new AObjectS89S0100000_14(this, 456));
        }
        this.LJLJL.LIZIZ(this, new AObjectS89S0100000_14(this, 457));
        this.LJLJLJ.LIZIZ(this, new AObjectS89S0100000_14(this, 458));
        this.LJLJJL.LIZIZ(this, new AObjectS89S0100000_14(this, 459));
        this.LJLJJLL.LIZIZ(this, new AObjectS89S0100000_14(this, 460));
        this.LJLL.LIZIZ(this, new AObjectS89S0100000_14(this, 461));
        this.LJLLI.LIZIZ(this, new AObjectS89S0100000_14(this, 462));
        this.LJLLILLLL.LIZIZ(this, new AObjectS89S0100000_14(this, 463));
        this.LJLJLLL.LIZIZ(this, new AObjectS89S0100000_14(this, 464));
        this.LJLLJ.LIZIZ(this, new AObjectS89S0100000_14(this, 455));
        View requireViewById2 = requireViewById(R.id.ioq);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.rdl_record)");
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = (ViewOnTouchListenerC82377WUr) requireViewById2;
        this.LJZL = viewOnTouchListenerC82377WUr;
        viewOnTouchListenerC82377WUr.setObjectContainer(this.LJLIL);
        View requireViewById3 = requireViewById(R.id.bih);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.color_scheme_layout)");
        this.LLFFF = (FrameLayout) requireViewById3;
        o.LJIIIIZZ(requireViewById(R.id.bii), "requireViewById(R.id.color_scheme_lottie)");
        View requireViewById4 = requireViewById(R.id.bif);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.color_scheme_background)");
        this.LLFII = (FrameLayout) requireViewById4;
        o.LJIIIIZZ(requireViewById(R.id.big), "requireViewById(R.id.color_scheme_icon)");
        if (this.LJLJJI.isPhotoMvMode) {
            ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr2 = this.LJZL;
            if (viewOnTouchListenerC82377WUr2 != null) {
                viewOnTouchListenerC82377WUr2.LJIILJJIL();
            } else {
                o.LJIJI("recordLayout");
                throw null;
            }
        }
        FrameLayout frameLayout = this.LLFFF;
        if (frameLayout != null) {
            frameLayout.bringToFront();
            View requireViewById5 = requireViewById(R.id.h11);
            o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.next_group_container)");
            this.LJZI = requireViewById5;
            ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr3 = this.LJZL;
            if (viewOnTouchListenerC82377WUr3 != null) {
                viewOnTouchListenerC82377WUr3.setActivity(this.mActivity);
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.mActivity;
                InterfaceC82086WJm interfaceC82086WJm = this.LJLILLLLZI;
                I3X i3x = this.LJLJI;
                ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr4 = this.LJZL;
                if (viewOnTouchListenerC82377WUr4 != null) {
                    new C79043V0l(new ACListenerS27S0100000_7(this, 162), activityC45651qj, interfaceC82086WJm, i3x, viewOnTouchListenerC82377WUr4, new AqS163S0100000_13(this, 438));
                    C0IB<Boolean> c0ib2 = this.LJLLLL;
                    if (c0ib2 != null) {
                        c0ib2.LIZIZ(this, new AObjectS89S0100000_14(this, 451));
                    }
                    C0IB<ScaleGestureDetector> c0ib3 = this.LJLLLLLL;
                    if (c0ib3 != null) {
                        c0ib3.LIZIZ(this, new AObjectS89S0100000_14(this, 452));
                    }
                    C0IB<WXG> c0ib4 = this.LJLZ;
                    if (c0ib4 != null) {
                        c0ib4.LIZIZ(this, new AObjectS89S0100000_14(this, 453));
                    }
                    View requireViewById6 = requireViewById(R.id.f1k);
                    o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.iv_deleteLast)");
                    this.LL = requireViewById6;
                    View requireViewById7 = requireViewById(R.id.axf);
                    o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.btn_next)");
                    this.LLD = (ImageView) requireViewById7;
                    View view = this.LL;
                    if (view != null) {
                        C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 163), view);
                        ImageView imageView = this.LLD;
                        if (imageView != null) {
                            C16880lQ.LJIILLIIL(imageView, new IDlS63S0100000_7(this, 18));
                            this.LJLILLLLZI.vV().LIZLLL(this, new AObjectS89S0100000_14(this, 454));
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
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LJZL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIILIIL(i, z);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ce4, viewGroup, false, "inflater.inflate(R.layou…ogress, container, false)");
    }

    public C82380WUu(C82622Wbi diContainer, InterfaceC82086WJm cameraApiComponent, I3X i3x, ShortVideoContext shortVideoContext, C0IB<Long> progressMaxDuration, C0IB<Boolean> progressNeedDrawAnchor, C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> progressClipAnchors, C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> progressClipWithStitch, C0IB<Integer> retakeState, C0IB<RetakeVideoContext> retakeVideoContext, C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> retakeProgressClipAnchors, C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> retakeProgressClipWithStitch, C0IB<Boolean> progressSegmentVisible, C0IB<Boolean> c0ib, C0IB<Boolean> c0ib2, C0IB<ScaleGestureDetector> c0ib3, C0IB<WXG> c0ib4) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
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
        this.LJLIL = diContainer;
        this.LJLILLLLZI = cameraApiComponent;
        this.LJLJI = i3x;
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
        this.LLF = SFS.LJI(40.0d);
        this.LLFZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, LiveChatShowDelayForHotLiveSetting.DEFAULT));
    }
}
