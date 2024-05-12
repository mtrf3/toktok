package X;

import Y.ACListenerS34S0100000_14;
import Y.ALAdapterS2S0200000_3;
import Y.ARunnableS33S0200000_14;
import Y.AUListenerS0S0200002_1;
import Y.AUListenerS93S0200000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WXq */
/* loaded from: classes15.dex */
public final class C82454WXq extends AbstractC56012Ht<WXU, C82458WXu> {
    public SmartImageView LJLIL;
    public SmartImageView LJLILLLLZI;
    public SmartImageView LJLJI;
    public C1547165j LJLJJI;
    public TuxTextView LJLJJL;
    public ViewGroup LJLJJLL;
    public ViewGroup LJLJL;
    public TuxIconView LJLJLJ;
    public TuxTextView LJLJLLL;
    public ViewGroup LJLL;
    public ViewGroup LJLLI;
    public View LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public float LJLZ;
    public final float LJZ;
    public final int LJZI;
    public final boolean LJZL;
    public final boolean LL;
    public boolean LLD;
    public boolean LLF;
    public int LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C82456WXs LLFZ;

    public final boolean LLJILJIL() {
        return ((Boolean) this.LLFFF.getValue()).booleanValue();
    }

    public C82454WXq() {
        int LIZ = (int) C74275TDb.LIZ(16.0f);
        this.LJLLJ = LIZ;
        this.LJLLL = LIZ + ((int) C74275TDb.LIZ(2.0f));
        this.LJLLLL = -1;
        this.LJLLLLLL = -1;
        this.LJLZ = -1.0f;
        this.LJZ = C74275TDb.LIZ(18.0f);
        this.LJZI = (int) C74275TDb.LIZ(4.0f);
        boolean LIZ2 = HC1.LIZ();
        this.LJZL = LIZ2;
        boolean z = false;
        if (LIZ2 && e1.LIZ(31744, "now_enable_dual_camera_placeholder", true, false)) {
            z = true;
        }
        this.LL = z;
        this.LLD = true;
        this.LLFFF = C221108m2.LIZIZ(C53573L0v.LJLIL);
        this.LLFII = C221108m2.LIZIZ(C53572L0u.LJLIL);
        C74275TDb.LIZ(2.0f);
        this.LLFZ = new C82456WXs(this);
    }

    public static void LLJJIJI(C82454WXq c82454WXq) {
        if (c82454WXq.LJLLI != null) {
            LLJJIJIIJIL(c82454WXq, r0.getWidth(), 0, 0, null, 16);
        } else {
            o.LJIJI("surfaceGroupOuter");
            throw null;
        }
    }

    public final void LLJJ(boolean z) {
        int i;
        C1547165j c1547165j = this.LJLJJI;
        if (c1547165j != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            c1547165j.setVisibility(i);
            return;
        }
        o.LJIJI("innerBorder");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        SmartImageView smartImageView;
        ViewGroup LJJLIIIJL;
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.h85);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.nows_container)");
        this.LJLL = (ViewGroup) requireViewById;
        View requireViewById2 = requireViewById(R.id.f5f);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.iv_inner)");
        this.LJLILLLLZI = (SmartImageView) requireViewById2;
        View requireViewById3 = requireViewById(R.id.f2y);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.iv_fake_surface)");
        this.LJLJI = (SmartImageView) requireViewById3;
        View requireViewById4 = requireViewById(R.id.emo);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.inner_border)");
        this.LJLJJI = (C1547165j) requireViewById4;
        View requireViewById5 = requireViewById(R.id.jxq);
        o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.shoot_count_down)");
        TuxTextView tuxTextView = (TuxTextView) requireViewById5;
        this.LJLJJL = tuxTextView;
        tuxTextView.LJJJ(100.0f);
        View requireViewById6 = requireViewById(R.id.hei);
        o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.outer_surface_container)");
        this.LJLLI = (ViewGroup) requireViewById6;
        InterfaceC44086HRy LIZ = HRQ.LIZ(this);
        if (LIZ != null && (LJJLIIIJL = LIZ.LJJLIIIJL()) != null) {
            smartImageView = new SmartImageView(requireSceneContext());
            LJJLIIIJL.addView(smartImageView);
            smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            smartImageView.setVisibility(8);
            ViewGroup viewGroup = this.LJLLI;
            if (viewGroup != null) {
                viewGroup.post(new ARunnableS33S0200000_14(smartImageView, this, 37));
            } else {
                o.LJIJI("surfaceGroupOuter");
                throw null;
            }
        } else {
            View requireViewById7 = requireViewById(R.id.f87);
            o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.iv_outer)");
            smartImageView = (SmartImageView) requireViewById7;
        }
        this.LJLIL = smartImageView;
        View requireViewById8 = requireViewById(R.id.d3c);
        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.fake_flash)");
        this.LJLLILLLL = requireViewById8;
        View requireViewById9 = requireViewById(R.id.hr7);
        o.LJIIIIZZ(requireViewById9, "requireViewById(R.id.placeholder_layout)");
        this.LJLJJLL = (ViewGroup) requireViewById9;
        View requireViewById10 = requireViewById(R.id.hr5);
        o.LJIIIIZZ(requireViewById10, "requireViewById(R.id.placeholder_content)");
        this.LJLJL = (ViewGroup) requireViewById10;
        View requireViewById11 = requireViewById(R.id.hr6);
        o.LJIIIIZZ(requireViewById11, "requireViewById(R.id.placeholder_icon)");
        this.LJLJLJ = (TuxIconView) requireViewById11;
        View requireViewById12 = requireViewById(R.id.hr9);
        o.LJIIIIZZ(requireViewById12, "requireViewById(R.id.placeholder_title)");
        this.LJLJLLL = (TuxTextView) requireViewById12;
        if (e1.LIZ(31744, "now_make_selfie_taking_easier_optimize_downloading_and_editpage_enable_dragged", true, false)) {
            SmartImageView smartImageView2 = this.LJLILLLLZI;
            if (smartImageView2 != null) {
                ViewGroup viewGroup2 = this.LJLL;
                if (viewGroup2 != null) {
                    C1547165j c1547165j = this.LJLJJI;
                    if (c1547165j != null) {
                        C82456WXs listener = this.LLFZ;
                        o.LJIIIZ(listener, "listener");
                        smartImageView2.setOnTouchListener(new ViewOnTouchListenerC82457WXt(smartImageView2, viewGroup2, c1547165j, listener));
                    } else {
                        o.LJIJI("innerBorder");
                        throw null;
                    }
                } else {
                    o.LJIJI("nowsContainer");
                    throw null;
                }
            } else {
                o.LJIJI("ivInner");
                throw null;
            }
        } else {
            SmartImageView smartImageView3 = this.LJLILLLLZI;
            if (smartImageView3 != null) {
                C16880lQ.LJJIJLIJ(smartImageView3, new ACListenerS34S0100000_14(this, 18));
            } else {
                o.LJIJI("ivInner");
                throw null;
            }
        }
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        int LIZJ = C6IA.LIZJ(requireSceneContext);
        this.LJLLLL = LIZJ;
        this.LJLLLLLL = LIZJ + ((int) C74275TDb.LIZ(2.0f));
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WXm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WXU) obj).LIZ;
            }
        }, null, new AqS180S0100000_14(this, 72), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WXo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WXU) obj).LIZIZ;
            }
        }, null, new AqS180S0100000_14(this, 73), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WXp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WXU) obj).LIZJ;
            }
        }, null, new AqS180S0100000_14(this, 74), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WY2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WXU) obj).LJ;
            }
        }, null, new AqS180S0100000_14(this, 75), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WY3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WXU) obj).LJFF;
            }
        }, null, new AqS180S0100000_14(this, 76), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WY4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WXU) obj).LJI;
            }
        }, null, new AqS180S0100000_14(this, 77), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WY5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WXU) obj).LJII;
            }
        }, null, new AqS180S0100000_14(this, 78), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WY1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WXU) obj).LJIIIIZZ;
            }
        }, null, new AqS180S0100000_14(this, 79), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WWg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((WXU) obj).LJIIIZ);
            }
        }, null, new AqS180S0100000_14(this, 80), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WXl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WXU) obj).LJIIJ;
            }
        }, null, new AqS180S0100000_14(this, 61), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WXn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((WXU) obj).LJIIJJI;
            }
        }, null, new AqS175S0100000_9(this, 167), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WXk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((WXU) obj).LJIIL);
            }
        }, null, new AqS180S0100000_14(this, 70), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WFO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((WXU) obj).LJIILIIL);
            }
        }, null, new AqS180S0100000_14(this, 71), 2, null);
    }

    public static void LLJILJILJ(SmartImageView smartImageView, Bitmap bitmap, InterfaceC65784Pro interfaceC65784Pro) {
        smartImageView.setVisibility(0);
        smartImageView.setImageBitmap(bitmap);
        interfaceC65784Pro.invoke();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cdq, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    public static void LLJJIJIIJIL(C82454WXq c82454WXq, float f, int i, int i2, AqS164S0100000_14 aqS164S0100000_14, int i3) {
        float f2;
        AqS164S0100000_14 aqS164S0100000_142 = aqS164S0100000_14;
        if ((i3 & 16) != 0) {
            aqS164S0100000_142 = null;
        }
        if (((Boolean) c82454WXq.LLFII.getValue()).booleanValue() && c82454WXq.LLJILJIL()) {
            TuxTextView tuxTextView = c82454WXq.LJLJJL;
            if (tuxTextView != null) {
                tuxTextView.LJJJ(56.0f);
                TuxTextView tuxTextView2 = c82454WXq.LJLJJL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(36)));
                    TuxTextView tuxTextView3 = c82454WXq.LJLJJL;
                    if (tuxTextView3 != null) {
                        UC0.LJJJZ(tuxTextView3, c82454WXq.LJZ);
                        TuxTextView tuxTextView4 = c82454WXq.LJLJJL;
                        if (tuxTextView4 != null) {
                            ViewGroup.LayoutParams layoutParams = tuxTextView4.getLayoutParams();
                            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                            TuxTextView tuxTextView5 = c82454WXq.LJLJJL;
                            if (tuxTextView5 != null) {
                                layoutParams2.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                                layoutParams2.bottomMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
                                layoutParams2.addRule(12);
                                layoutParams2.addRule(21);
                                tuxTextView5.setLayoutParams(layoutParams2);
                            } else {
                                o.LJIJI("shootCountDownView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("shootCountDownView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("shootCountDownView");
                        throw null;
                    }
                } else {
                    o.LJIJI("shootCountDownView");
                    throw null;
                }
            } else {
                o.LJIJI("shootCountDownView");
                throw null;
            }
        } else {
            TuxTextView tuxTextView6 = c82454WXq.LJLJJL;
            if (tuxTextView6 != null) {
                LLJJIII(c82454WXq, tuxTextView6, f, i, i2, 0, 0.0f, 48);
            } else {
                o.LJIJI("shootCountDownView");
                throw null;
            }
        }
        if (e1.LIZ(31744, "now_make_selfie_taking_easier_countdown_longer", true, false)) {
            TuxTextView tuxTextView7 = c82454WXq.LJLJJL;
            if (tuxTextView7 != null) {
                boolean booleanValue = ((Boolean) c82454WXq.LLFII.getValue()).booleanValue();
                tuxTextView7.setAlpha(0.0f);
                tuxTextView7.setVisibility(0);
                C34K c34k = new C34K();
                if (booleanValue) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.7f;
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 4350);
                ofInt.setDuration(4350L);
                ofInt.addUpdateListener(new AUListenerS0S0200002_1(tuxTextView7, c34k, 490 / f2, f2, 1));
                ofInt.addListener(new ALAdapterS2S0200000_3(tuxTextView7, aqS164S0100000_142, 4));
                ofInt.start();
                C144825mI.LIZ = ofInt;
                return;
            }
            o.LJIJI("shootCountDownView");
            throw null;
        }
        TuxTextView tuxTextView8 = c82454WXq.LJLJJL;
        if (tuxTextView8 != null) {
            tuxTextView8.setAlpha(0.0f);
            tuxTextView8.setText("2");
            tuxTextView8.setVisibility(0);
            C34K c34k2 = new C34K();
            ValueAnimator ofInt2 = ValueAnimator.ofInt(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            ofInt2.setDuration(2000L);
            ofInt2.addUpdateListener(new AUListenerS93S0200000_1(tuxTextView8, c34k2, 5));
            ofInt2.addListener(new ALAdapterS2S0200000_3(tuxTextView8, aqS164S0100000_142, 5));
            ofInt2.start();
            C144825mI.LIZ = ofInt2;
            return;
        }
        o.LJIJI("shootCountDownView");
        throw null;
    }

    public final void LLJJI(View view, float f, int i, int i2, int i3, float f2) {
        if (getSceneContext() == null) {
            return;
        }
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        C6IA.LJIIIIZZ(requireSceneContext, view, f, i, i2, i3, f2);
    }

    public static /* synthetic */ void LLJJIII(C82454WXq c82454WXq, View view, float f, int i, int i2, int i3, float f2, int i4) {
        if ((i4 & 16) != 0) {
            i3 = 0;
        }
        if ((i4 & 32) != 0) {
            f2 = c82454WXq.LJZ;
        }
        c82454WXq.LLJJI(view, f, i, i2, i3, f2);
    }
}
