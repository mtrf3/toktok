package X;

import Y.ACListenerS27S0100000_7;
import Y.AObjectS89S0100000_14;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.views.IDlS63S0100000_7;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WUs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82378WUs extends WM7 {
    public final C82366WUg LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public WV5 LJLJI;
    public TextView LJLJJI;
    public View LJLJJL;
    public ViewOnTouchListenerC82377WUr LJLJJLL;
    public View LJLJL;
    public ImageView LJLJLJ;
    public final int LJLJLLL;
    public FrameLayout LJLL;
    public FrameLayout LJLLI;
    public long LJLLILLLL;

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LJLJJLL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIIL();
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    public final void LLJILJIL(long j) {
        long j2 = j - this.LJLLILLLL;
        if (1 <= j2 && j2 < 1000 && j < this.LJLIL.LIZIZ().LJIILIIL()) {
            return;
        }
        this.LJLLILLLL = j;
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i - i2) / 60;
        TextView textView = this.LJLJJI;
        if (textView != null) {
            StringBuilder LIZ = X1D.LIZ();
            String LLLZ = C16880lQ.LLLZ("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            LIZ.append(LLLZ);
            LIZ.append(':');
            String LLLZ2 = C16880lQ.LLLZ("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            o.LJIIIIZZ(LLLZ2, "format(format, *args)");
            LIZ.append(LLLZ2);
            textView.setText(X1D.LIZIZ(LIZ));
            return;
        }
        o.LJIJI("progressTextView");
        throw null;
    }

    public final void LLJILLL(Animation animation) {
        o.LJIIIZ(animation, "animation");
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LJLJJLL;
        if (viewOnTouchListenerC82377WUr != null) {
            KL2.LIZ(viewOnTouchListenerC82377WUr);
            ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr2 = this.LJLJJLL;
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

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.iaz);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.progress_segment_view)");
        this.LJLJI = (WV5) requireViewById;
        View requireViewById2 = requireViewById(R.id.mfe);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.tv_progress)");
        this.LJLJJI = (TextView) requireViewById2;
        C0IB<Boolean> c0ib = this.LJLIL.LJIIJJI;
        if (c0ib != null) {
            c0ib.LIZIZ(this, new AObjectS89S0100000_14(this, 56));
        }
        C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> c0ib2 = this.LJLIL.LJ;
        if (c0ib2 != null) {
            c0ib2.LIZIZ(this, new AObjectS89S0100000_14(this, 57));
            C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c0ib3 = this.LJLIL.LJFF;
            if (c0ib3 != null) {
                c0ib3.LIZIZ(this, new AObjectS89S0100000_14(this, 58));
                C0IB<Long> c0ib4 = this.LJLIL.LIZLLL;
                if (c0ib4 != null) {
                    c0ib4.LIZIZ(this, new AObjectS89S0100000_14(this, 59));
                    C0IB<RetakeVideoContext> c0ib5 = this.LJLIL.LJII;
                    if (c0ib5 != null) {
                        c0ib5.LIZIZ(this, new AObjectS89S0100000_14(this, 60));
                        C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> c0ib6 = this.LJLIL.LJIIIIZZ;
                        if (c0ib6 != null) {
                            c0ib6.LIZIZ(this, new AObjectS89S0100000_14(this, 61));
                            C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c0ib7 = this.LJLIL.LJIIIZ;
                            if (c0ib7 != null) {
                                c0ib7.LIZIZ(this, new AObjectS89S0100000_14(this, 62));
                                C0IB<Integer> c0ib8 = this.LJLIL.LJI;
                                if (c0ib8 != null) {
                                    c0ib8.LIZIZ(this, new AObjectS89S0100000_14(this, 63));
                                    C0IB<Boolean> c0ib9 = this.LJLIL.LJIIJ;
                                    if (c0ib9 != null) {
                                        c0ib9.LIZIZ(this, new AObjectS89S0100000_14(this, 64));
                                        View requireViewById3 = requireViewById(R.id.ioq);
                                        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.rdl_record)");
                                        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = (ViewOnTouchListenerC82377WUr) requireViewById3;
                                        this.LJLJJLL = viewOnTouchListenerC82377WUr;
                                        viewOnTouchListenerC82377WUr.setObjectContainer(this.LJLILLLLZI);
                                        View requireViewById4 = requireViewById(R.id.bih);
                                        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.color_scheme_layout)");
                                        this.LJLL = (FrameLayout) requireViewById4;
                                        o.LJIIIIZZ(requireViewById(R.id.bii), "requireViewById(R.id.color_scheme_lottie)");
                                        View requireViewById5 = requireViewById(R.id.bif);
                                        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.color_scheme_background)");
                                        this.LJLLI = (FrameLayout) requireViewById5;
                                        o.LJIIIIZZ(requireViewById(R.id.big), "requireViewById(R.id.color_scheme_icon)");
                                        if (this.LJLIL.LIZIZ().isPhotoMvMode) {
                                            ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr2 = this.LJLJJLL;
                                            if (viewOnTouchListenerC82377WUr2 != null) {
                                                viewOnTouchListenerC82377WUr2.LJIILJJIL();
                                            } else {
                                                o.LJIJI("recordLayout");
                                                throw null;
                                            }
                                        }
                                        FrameLayout frameLayout = this.LJLL;
                                        if (frameLayout != null) {
                                            frameLayout.bringToFront();
                                            View requireViewById6 = requireViewById(R.id.h11);
                                            o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.next_group_container)");
                                            this.LJLJJL = requireViewById6;
                                            ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr3 = this.LJLJJLL;
                                            if (viewOnTouchListenerC82377WUr3 != null) {
                                                viewOnTouchListenerC82377WUr3.setActivity(this.mActivity);
                                                ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.mActivity;
                                                C82366WUg c82366WUg = this.LJLIL;
                                                InterfaceC82086WJm interfaceC82086WJm = c82366WUg.LIZ;
                                                if (interfaceC82086WJm != null) {
                                                    I3X LIZ = c82366WUg.LIZ();
                                                    ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr4 = this.LJLJJLL;
                                                    if (viewOnTouchListenerC82377WUr4 != null) {
                                                        new WV4(activityC45651qj, interfaceC82086WJm, LIZ, viewOnTouchListenerC82377WUr4, new ACListenerS27S0100000_7(this, 21));
                                                        C0IB<Boolean> c0ib10 = this.LJLIL.LJIIL;
                                                        if (c0ib10 != null) {
                                                            c0ib10.LIZIZ(this, new AObjectS89S0100000_14(this, 53));
                                                        }
                                                        C0IB<ScaleGestureDetector> c0ib11 = this.LJLIL.LJIILIIL;
                                                        if (c0ib11 != null) {
                                                            c0ib11.LIZIZ(this, new AObjectS89S0100000_14(this, 54));
                                                        }
                                                        C0IB<WXG> c0ib12 = this.LJLIL.LJIILJJIL;
                                                        if (c0ib12 != null) {
                                                            c0ib12.LIZIZ(this, new AObjectS89S0100000_14(this, 55));
                                                        }
                                                        View requireViewById7 = requireViewById(R.id.f1k);
                                                        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.iv_deleteLast)");
                                                        this.LJLJL = requireViewById7;
                                                        View requireViewById8 = requireViewById(R.id.axf);
                                                        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.btn_next)");
                                                        this.LJLJLJ = (ImageView) requireViewById8;
                                                        View view = this.LJLJL;
                                                        if (view != null) {
                                                            C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 22), view);
                                                            ImageView imageView = this.LJLJLJ;
                                                            if (imageView != null) {
                                                                C16880lQ.LJIILLIIL(imageView, new IDlS63S0100000_7(this, 0));
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
                                                o.LJIJI("cameraApiComponent");
                                                throw null;
                                            }
                                            o.LJIJI("recordLayout");
                                            throw null;
                                        }
                                        o.LJIJI("colorSchemeLayout");
                                        throw null;
                                    }
                                    o.LJIJI("progressSegmentVisible");
                                    throw null;
                                }
                                o.LJIJI("retakeState");
                                throw null;
                            }
                            o.LJIJI("retakeProgressClipWithStitch");
                            throw null;
                        }
                        o.LJIJI("retakeProgressClipAnchors");
                        throw null;
                    }
                    o.LJIJI("retakeVideoContext");
                    throw null;
                }
                o.LJIJI("progressMaxDuration");
                throw null;
            }
            o.LJIJI("progressClipWithStitch");
            throw null;
        }
        o.LJIJI("progressClipAnchors");
        throw null;
    }

    public C82378WUs(C82366WUg controlProgressEnv, C82622Wbi diContainer) {
        o.LJIIIZ(controlProgressEnv, "controlProgressEnv");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = controlProgressEnv;
        this.LJLILLLLZI = diContainer;
        this.LJLJLLL = SFS.LJII(40.0d, C60903NvH.LJ);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.az4, viewGroup, false, "inflater.inflate(R.layou…ogress, container, false)");
    }
}
