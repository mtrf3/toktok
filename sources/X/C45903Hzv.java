package X;

import Y.ACListenerS27S0100000_7;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hzv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45903Hzv extends WM7 {
    public final boolean LJLIL;
    public final C0IB<Boolean> LJLILLLLZI;
    public final String LJLJI;
    public final HR3 LJLJJI;
    public final C44131HTr LJLJJL;
    public Surface LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public View LJLL;
    public SY4 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public TTVideoEngine LJLLJ;
    public boolean LJLLL;

    public final W5G LLJILJIL() {
        return (W5G) this.LJLJL.getValue();
    }

    public final C42883GsJ LLJILJILJ() {
        return (C42883GsJ) this.LJLJLLL.getValue();
    }

    public final TextureView LLJJ() {
        return (TextureView) this.LJLLILLLL.getValue();
    }

    public final W5G LLJJI() {
        return (W5G) this.LJLJLJ.getValue();
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        TTVideoEngine tTVideoEngine = this.LJLLJ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLIIIJILLIZJL();
            Surface surface = this.LJLJJLL;
            if (surface != null) {
                surface.release();
            }
        }
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        if (this.LJLIL && this.LJLLL) {
            TTVideoEngine tTVideoEngine = this.LJLLJ;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJJL();
            } else {
                o.LJIJI("videoEngine");
                throw null;
            }
        }
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        if (this.LJLIL) {
            if (!this.LJLLL) {
                LLJJI().setVisibility(0);
                LLJILJILJ().setVisibility(0);
                return;
            }
            LLJJI().setVisibility(8);
            LLJILJILJ().setVisibility(8);
            TTVideoEngine tTVideoEngine = this.LJLLJ;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJJLI();
            } else {
                o.LJIJI("videoEngine");
                throw null;
            }
        }
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewStub viewStub;
        View inflate;
        super.onActivityCreated(bundle);
        if (HR4.LIZ[this.LJLJJI.ordinal()] == 1) {
            View requireViewById = requireViewById(R.id.zq);
            if ((requireViewById instanceof ViewStub) && (viewStub = (ViewStub) requireViewById) != null && (inflate = viewStub.inflate()) != null) {
                this.LJLLI = (SY4) inflate.findViewById(R.id.kuh);
                this.LJLL = inflate.findViewById(R.id.i25);
                Activity activity = this.mActivity;
                if (activity != null) {
                    int LJ = (C81184Vtc.LJ(activity) - ((int) C170576mj.LIZ(activity, 40.0f))) / 2;
                    View view = this.LJLL;
                    if (view != null) {
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = LJ;
                        } else {
                            layoutParams2 = null;
                        }
                        view.setLayoutParams(layoutParams2);
                    }
                    View view2 = this.LJLL;
                    if (view2 != null) {
                        C110614Vt c110614Vt = new C110614Vt();
                        c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
                        view2.setBackground(c110614Vt.LIZ(activity));
                    }
                    View view3 = this.LJLL;
                    o.LJII(view3, "null cannot be cast to non-null type com.bytedance.tux.button.TuxButton");
                    ((TuxTextView) view3).setTextColorRes(R.attr.dj);
                    SY4 sy4 = this.LJLLI;
                    if (sy4 != null) {
                        ViewGroup.LayoutParams layoutParams3 = sy4.getLayoutParams();
                        if (layoutParams3 != null) {
                            layoutParams3.width = LJ;
                        } else {
                            layoutParams3 = null;
                        }
                        sy4.setLayoutParams(layoutParams3);
                    }
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            this.LJLLI = (SY4) requireViewById(R.id.h0v);
            this.LJLL = requireViewById(R.id.gv5);
            Boolean LIZ = this.LJLILLLLZI.LIZ();
            o.LJIIIIZZ(LIZ, "enableTopMarginEvent.value");
            if (LIZ.booleanValue()) {
                View view4 = this.LJLL;
                if (view4 != null) {
                    layoutParams = view4.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = getResources().getDimensionPixelSize(R.dimen.a6d) + C81184Vtc.LJFF(this.mActivity);
                View view5 = this.LJLL;
                if (view5 != null) {
                    view5.setLayoutParams(marginLayoutParams);
                }
            }
        }
        SY4 sy42 = this.LJLLI;
        if (sy42 != null) {
            sy42.setVisibility(0);
        }
        View view6 = this.LJLL;
        if (view6 != null) {
            view6.setVisibility(0);
        }
        LLJJI().setVisibility(8);
        LLJILJILJ().setVisibility(8);
        LLJILJIL().setVisibility(8);
        LLJJ().setVisibility(8);
        View view7 = this.LJLL;
        if (view7 != null) {
            C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 30), view7);
        }
        SY4 sy43 = this.LJLLI;
        if (sy43 != null) {
            C16880lQ.LJJIZ(sy43, new ACListenerS27S0100000_7(this, 31));
        }
        if (this.LJLIL) {
            LLJILJIL().setVisibility(8);
            LLJJ().setVisibility(0);
            TTVideoEngine tTVideoEngine = new TTVideoEngine(getApplicationContext(), 0);
            this.LJLLJ = tTVideoEngine;
            tTVideoEngine.LLILZ("preview");
            TTVideoEngine tTVideoEngine2 = this.LJLLJ;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.LLFII(true);
                TTVideoEngine tTVideoEngine3 = this.LJLLJ;
                if (tTVideoEngine3 != null) {
                    tTVideoEngine3.LL(this.LJLJI);
                    TTVideoEngine tTVideoEngine4 = this.LJLLJ;
                    if (tTVideoEngine4 != null) {
                        tTVideoEngine4.LLJJ(new C45904Hzw(this));
                        LLJJ().setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC45905Hzx(this));
                        return;
                    } else {
                        o.LJIJI("videoEngine");
                        throw null;
                    }
                }
                o.LJIJI("videoEngine");
                throw null;
            }
            o.LJIJI("videoEngine");
            throw null;
        }
        C78764Uvg.LJIIIZ(LLJILJIL(), C44694HgQ.LJIIIIZZ(this.LJLJI).toString(), -1, -1);
        LLJILJIL().setVisibility(0);
        LLJJI().setVisibility(8);
        LLJILJILJ().setVisibility(8);
        LLJJ().setVisibility(8);
        ShortVideoContext shortVideoContext = this.LJLJJL.LIZ;
        if (shortVideoContext != null) {
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            LLJJIII(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, LLJILJIL());
        } else {
            o.LJIJI("shortVideoContext");
            throw null;
        }
    }

    public final void LLJJIII(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        FrameLayout.LayoutParams LJ = ((BaseScreenAdaptScene) C86793Y4n.LJJIJIIJIL(this)).LLLFF().LJ(i, i2);
        int i3 = LJ.width;
        int i4 = LJ.height;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams.width != i3 || layoutParams.height != i4)) {
            if (i3 != -3) {
                layoutParams.width = i3;
            }
            if (i4 != -3) {
                layoutParams.height = i4;
            }
            view.setLayoutParams(layoutParams);
        }
        C26338AVi.LJI(view, null, Integer.valueOf(LJ.topMargin), null, null, false, 29);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.aup, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    public C45903Hzv(boolean z, C0IB<Boolean> enableTopMarginEvent, String localUrl, HR3 pageType, C44131HTr arguments) {
        o.LJIIIZ(enableTopMarginEvent, "enableTopMarginEvent");
        o.LJIIIZ(localUrl, "localUrl");
        o.LJIIIZ(pageType, "pageType");
        o.LJIIIZ(arguments, "arguments");
        this.LJLIL = z;
        this.LJLILLLLZI = enableTopMarginEvent;
        this.LJLJI = localUrl;
        this.LJLJJI = pageType;
        this.LJLJJL = arguments;
        C221108m2.LIZIZ(new AqS157S0100000_7(this, 227));
        this.LJLJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 225));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 229));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 226));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 228));
    }
}
