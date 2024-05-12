package X;

import Y.ARunnableS50S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.keva.Keva;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WWd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC82415WWd extends AbstractC56012Ht<WVY, C82414WWc> implements View.OnClickListener {
    public View LJLIL;
    public TuxTextView LJLILLLLZI;
    public View LJLJI;
    public C5GC LJLJJI;
    public ViewGroup LJLJJL;
    public TuxIconView LJLJJLL;
    public TuxTextView LJLJL;
    public View LJLJLJ;
    public I45 LJLJLLL;
    public boolean LJLLI;
    public boolean LJLLL;
    public boolean LJLLLL;
    public int LJLLLLLL;
    public boolean LJLL = true;
    public final boolean LJLLILLLL = e1.LIZ(31744, "now_enable_dual_camera_placeholder", true, false);
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 112));
    public final boolean LJLZ = true;

    public final void LLJILJIL() {
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null) {
            if (viewGroup.getVisibility() == 0) {
                ViewGroup viewGroup2 = this.LJLJJL;
                if (viewGroup2 != null) {
                    C6IA.LIZIZ(viewGroup2, 200L, new AqS164S0100000_14(this, 110));
                    return;
                } else {
                    o.LJIJI("switchDualLayout");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("switchDualLayout");
        throw null;
    }

    public final void LLJJIJIIJIL() {
        int i;
        int i2;
        boolean z = !this.LJLL;
        this.LJLL = z;
        if (this.LJLLILLLL) {
            if (z) {
                LLJILJIL();
                LLJJI(true);
                return;
            }
            View view = this.LJLJLJ;
            if (view != null) {
                view.setVisibility(8);
                return;
            } else {
                o.LJIJI("placeholderX");
                throw null;
            }
        }
        TuxIconView tuxIconView = this.LJLJJLL;
        if (tuxIconView != null) {
            if (z) {
                i = R.raw.icon_now_dual_on;
            } else {
                i = R.raw.icon_now_dual;
            }
            tuxIconView.setIconRes(i);
            Activity requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            if (this.LJLL) {
                i2 = R.string.f00;
            } else {
                i2 = R.string.ezz;
            }
            creativeToastBuilder.messageRes(i2);
            C78915Uy7.LJJIIZI(requireActivity, 3004, creativeToastBuilder);
            return;
        }
        o.LJIJI("switchDualIcon");
        throw null;
    }

    public final void LLJJ() {
        View requireViewById = requireViewById(R.id.kun);
        o.LJIIIIZZ(requireViewById, "requireViewById<View>(R.id.surface_holoder)");
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        C6IA.LJII(requireSceneContext, requireViewById);
        View view = this.LJLIL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context requireSceneContext2 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
            int LIZLLL = C6IB.LIZLLL(requireSceneContext2) - ((int) C170576mj.LIZ(requireSceneContext(), 60.0f));
            int LJFF = C81184Vtc.LJFF(requireSceneContext());
            if (LIZLLL < LJFF) {
                LIZLLL = LJFF;
            }
            marginLayoutParams.topMargin = LIZLLL;
            View view2 = this.LJLIL;
            if (view2 != null) {
                view2.setLayoutParams(marginLayoutParams);
                return;
            } else {
                o.LJIJI("ivBack");
                throw null;
            }
        }
        o.LJIJI("ivBack");
        throw null;
    }

    public final void LLJILJILJ(boolean z) {
        if (this.LJLL) {
            if (this.LJLLILLLL) {
                LLJJI(false);
                if (z) {
                    HC6.LJFF("window_show", true);
                    return;
                }
                return;
            }
            LLJJIJI(false);
            TuxIconView tuxIconView = this.LJLJJLL;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_now_dual_on);
                if (!z) {
                    return;
                }
                HC6.LJFF("icon_show", true);
                return;
            }
            o.LJIJI("switchDualIcon");
            throw null;
        }
        LLJJIJI(false);
        TuxIconView tuxIconView2 = this.LJLJJLL;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_now_dual);
            if (this.LJLLILLLL) {
                View view = this.LJLJLJ;
                if (view != null) {
                    view.setVisibility(8);
                } else {
                    o.LJIJI("placeholderX");
                    throw null;
                }
            }
            if (!z) {
                return;
            }
            HC6.LJFF("icon_show", false);
            return;
        }
        o.LJIJI("switchDualIcon");
        throw null;
    }

    public final void LLJJI(boolean z) {
        int i;
        View view = this.LJLJLJ;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            int LIZJ = C6IA.LIZJ(requireSceneContext) - ((int) C170576mj.LIZ(requireSceneContext(), 15.0f));
            int LJ = (int) ((C81184Vtc.LJ(requireSceneContext()) * H7I.LIZ) - C170576mj.LIZ(requireSceneContext(), 4.0f));
            if (!C90193gN.LIZIZ(requireSceneContext())) {
                i = LJ;
            } else {
                i = 0;
            }
            if (!C90193gN.LIZIZ(requireSceneContext())) {
                LJ = 0;
            }
            marginLayoutParams.setMargins(i, LIZJ, LJ, 0);
            view.setLayoutParams(marginLayoutParams);
            if (z) {
                SceneExtensionsKt.LIZJ(this, new ARunnableS50S0100000_14(this, 75), 300L);
                return;
            }
            View view2 = this.LJLJLJ;
            if (view2 != null) {
                view2.setVisibility(0);
                return;
            } else {
                o.LJIJI("placeholderX");
                throw null;
            }
        }
        o.LJIJI("placeholderX");
        throw null;
    }

    public final void LLJJIII(boolean z) {
        int i;
        View view = this.LJLJI;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            return;
        }
        o.LJIJI("save2LocalLoading");
        throw null;
    }

    public final void LLJJIJI(boolean z) {
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            C62822Ol8 c62822Ol8 = C82419WWh.LIZ;
            int i = ((Keva) c62822Ol8.getValue()).getInt("show_dual_text_cnt", 0);
            if (i < 3) {
                ((Keva) c62822Ol8.getValue()).storeInt("show_dual_text_cnt", i + 1);
                TuxTextView tuxTextView = this.LJLJL;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                    SceneExtensionsKt.LIZJ(this, new ARunnableS50S0100000_14(this, 76), 5000L);
                } else {
                    o.LJIJI("switchDualText");
                    throw null;
                }
            }
            if (z) {
                ViewGroup viewGroup2 = this.LJLJJL;
                if (viewGroup2 != null) {
                    C6IA.LIZ(viewGroup2, 300L, null);
                    return;
                } else {
                    o.LJIJI("switchDualLayout");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("switchDualLayout");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b0  */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC82415WWd.onActivityCreated(android.os.Bundle):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View[] viewArr = new View[3];
        I45 i45 = this.LJLJLLL;
        if (i45 != null) {
            viewArr[0] = i45.getFlashView();
            TuxTextView tuxTextView = this.LJLILLLLZI;
            if (tuxTextView != null) {
                viewArr[1] = tuxTextView;
                I45 i452 = this.LJLJLLL;
                if (i452 != null) {
                    viewArr[2] = i452.getIvRetake();
                    if (!ORY.LJJIJIIJIL(view, viewArr)) {
                        Context requireSceneContext = requireSceneContext();
                        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                        new C61996OUu(requireSceneContext).LIZ(0);
                    }
                    I45 i453 = this.LJLJLLL;
                    if (i453 != null) {
                        if (o.LJ(view, i453.getFlashView())) {
                            getUiActions().LIZJ.invoke();
                            return;
                        }
                        I45 i454 = this.LJLJLLL;
                        if (i454 != null) {
                            if (o.LJ(view, i454.getFlipView())) {
                                getUiActions().LIZLLL.invoke();
                                return;
                            }
                            View view2 = this.LJLIL;
                            if (view2 != null) {
                                if (o.LJ(view, view2)) {
                                    LLJJIII(false);
                                    InterfaceC88472Yns<View, C76800UCe> interfaceC88472Yns = getUiActions().LJ;
                                    View view3 = this.LJLIL;
                                    if (view3 != null) {
                                        interfaceC88472Yns.invoke(view3);
                                        return;
                                    } else {
                                        o.LJIJI("ivBack");
                                        throw null;
                                    }
                                }
                                I45 i455 = this.LJLJLLL;
                                if (i455 != null) {
                                    if (o.LJ(view, i455.getPublishBtn())) {
                                        LLJJIII(false);
                                        getUiActions().LIZ.invoke();
                                        return;
                                    }
                                    I45 i456 = this.LJLJLLL;
                                    if (i456 != null) {
                                        if (o.LJ(view, i456.getBtnStoryPublish())) {
                                            LLJJIII(false);
                                            getUiActions().LIZIZ.invoke();
                                            return;
                                        }
                                        TuxTextView tuxTextView2 = this.LJLILLLLZI;
                                        if (tuxTextView2 != null) {
                                            if (!o.LJ(view, tuxTextView2)) {
                                                I45 i457 = this.LJLJLLL;
                                                if (i457 != null) {
                                                    if (!o.LJ(view, i457.getIvRetake())) {
                                                        I45 i458 = this.LJLJLLL;
                                                        if (i458 != null) {
                                                            if (o.LJ(view, i458.getIvDownload())) {
                                                                if (this.LJLLLL) {
                                                                    return;
                                                                }
                                                                Activity requireActivity = requireActivity();
                                                                o.LJIIIIZZ(requireActivity, "requireActivity()");
                                                                new C61995OUt(requireActivity).LIZIZ(12, LiveTryModeCountDownThresholdSetting.DEFAULT);
                                                                getUiActions().LJII.invoke();
                                                                return;
                                                            }
                                                            I45 i459 = this.LJLJLLL;
                                                            if (i459 != null) {
                                                                if (o.LJ(view, i459.getIvNextStep())) {
                                                                    getUiActions().LJIIIIZZ.invoke();
                                                                    return;
                                                                }
                                                                TuxIconView tuxIconView = this.LJLJJLL;
                                                                if (tuxIconView != null) {
                                                                    if (o.LJ(view, tuxIconView)) {
                                                                        LLJJIJIIJIL();
                                                                        getUiActions().LJIIJ.invoke(Boolean.valueOf(this.LJLL));
                                                                        HC6.LJFF("icon_click", this.LJLL);
                                                                        return;
                                                                    }
                                                                    View view4 = this.LJLJLJ;
                                                                    if (view4 != null) {
                                                                        if (!o.LJ(view, view4)) {
                                                                            return;
                                                                        }
                                                                        LLJJIJIIJIL();
                                                                        getUiActions().LJIIJ.invoke(Boolean.valueOf(this.LJLL));
                                                                        HC6.LJFF("window_close", this.LJLL);
                                                                        return;
                                                                    }
                                                                    o.LJIJI("placeholderX");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("switchDualIcon");
                                                                throw null;
                                                            }
                                                            o.LJIJI("uiProvider");
                                                            throw null;
                                                        }
                                                        o.LJIJI("uiProvider");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("uiProvider");
                                                    throw null;
                                                }
                                            }
                                            LLJJIII(false);
                                            getUiActions().LJFF.invoke();
                                            return;
                                        }
                                        o.LJIJI("tvRetake");
                                        throw null;
                                    }
                                    o.LJIJI("uiProvider");
                                    throw null;
                                }
                                o.LJIJI("uiProvider");
                                throw null;
                            }
                            o.LJIJI("ivBack");
                            throw null;
                        }
                        o.LJIJI("uiProvider");
                        throw null;
                    }
                    o.LJIJI("uiProvider");
                    throw null;
                }
                o.LJIJI("uiProvider");
                throw null;
            }
            o.LJIJI("tvRetake");
            throw null;
        }
        o.LJIJI("uiProvider");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cdp, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
