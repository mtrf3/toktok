package X;

import Y.ACListenerS22S0100000_2;
import Y.ALAdapterS1S0110000_2;
import Y.ARunnableS38S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5mL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144855mL extends AbstractC56012Ht<C144515ln, C144625ly> {
    public Video2StickerModel LJLJL;
    public boolean LJLJLLL;
    public ValueAnimator LJLL;
    public float LJLLI;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 303));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 302));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 298));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 299));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 301));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 300));
    public float LJLJLJ = 1.0f;
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(C144885mO.LJLIL);
    public int LJLLJ = 1;
    public final C144875mN LJLLL = new C6P6() { // from class: X.5mN
        @Override // X.C6P6, X.C6V2
        public final boolean LJJIIZI(MotionEvent motionEvent) {
            C144855mL.this.LLJJ();
            C144855mL.this.getUiActions().LJLLLL.invoke(Boolean.TRUE);
            return true;
        }

        @Override // X.C6P6, X.C6V2
        public final boolean LJLI(C82537WaL c82537WaL) {
            PointF pointF;
            if (c82537WaL != null && (pointF = c82537WaL.LJIIIZ) != null) {
                C144855mL.this.getUiActions().LJLJI.invoke(Float.valueOf(pointF.x), Float.valueOf(pointF.y), Boolean.TRUE);
                return true;
            }
            return true;
        }

        @Override // X.C6P6, X.C6V2
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (scaleGestureDetector == null) {
                return false;
            }
            C144855mL.this.getUiActions().LJLILLLLZI.invoke(Float.valueOf(scaleGestureDetector.getScaleFactor()));
            return true;
        }

        @Override // X.C6P6, X.C6V2
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C144855mL.this.getUiActions().LJLLLL.invoke(Boolean.FALSE);
            return true;
        }

        @Override // X.C6P6, X.C6V2
        public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
            C144855mL.this.getUiActions().LJLLLL.invoke(Boolean.FALSE);
            return true;
        }
    };

    public final float LLJILJIL() {
        return ((Number) this.LJLLILLLL.getValue()).floatValue();
    }

    public final C144865mM LLJILJILJ() {
        return (C144865mM) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJ() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144855mL.LLJJ():void");
    }

    @Override // X.AbstractC56012Ht
    public final void onHide() {
        super.onHide();
        LLJJIII(false);
    }

    @Override // X.AbstractC56012Ht
    public final void onShow() {
        super.onShow();
        VESize invoke = getUiActions().LJLJJL.invoke();
        this.LJLJL = getUiActions().LJLL.invoke();
        LLJILJILJ().LIZIZ(invoke.width, invoke.height);
        Video2StickerModel video2StickerModel = this.LJLJL;
        if (video2StickerModel != null) {
            LLJJIJIIJIL(video2StickerModel.videoCropData.cropRatioMode, false);
            this.LJLLI = C144035l1.LIZJ();
            this.LJLJLLL = false;
            if (LLJILJILJ().getMeasuredHeight() > 0) {
                LLJJIII(true);
                return;
            } else {
                LLJILJILJ().post(new ARunnableS38S0100000_2(this, 83));
                return;
            }
        }
        o.LJIJI("video2StickerModel");
        throw null;
    }

    public final void LLJJI(View view) {
        int id = view.getId();
        if (id == R.id.inw) {
            LLJJIJIIJIL(1, true);
            return;
        }
        if (id == R.id.io0) {
            LLJJIJIIJIL(4, true);
        } else if (id == R.id.iny) {
            LLJJIJIIJIL(2, true);
        } else {
            if (id != R.id.io2) {
                return;
            }
            LLJJIJIIJIL(3, true);
        }
    }

    public final void LLJJIII(final boolean z) {
        float floatValue;
        final float f;
        float cropAreaWidth;
        int i;
        final float f2;
        int i2;
        float f3;
        int i3;
        final float LLJILJIL;
        final float f4;
        VESize invoke = getUiActions().LJLJJL.invoke();
        if (this.LJLJLLL) {
            floatValue = getUiActions().LJLJL.invoke(Float.valueOf(C144025l0.LIZJ(getUiStates().LJ.LJFF))).floatValue();
        } else {
            int i4 = getUiStates().LJ.LJFF;
            Video2StickerModel video2StickerModel = this.LJLJL;
            if (video2StickerModel != null) {
                if (i4 == video2StickerModel.videoCropData.cropRatioMode) {
                    floatValue = video2StickerModel.editVideoInfo.initializeScale;
                } else {
                    InterfaceC88472Yns<Float, Float> interfaceC88472Yns = getUiActions().LJLJL;
                    Video2StickerModel video2StickerModel2 = this.LJLJL;
                    if (video2StickerModel2 != null) {
                        floatValue = interfaceC88472Yns.invoke(Float.valueOf(C144025l0.LIZJ(video2StickerModel2.videoCropData.cropRatioMode))).floatValue();
                    } else {
                        o.LJIJI("video2StickerModel");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("video2StickerModel");
                throw null;
            }
        }
        Video2StickerModel video2StickerModel3 = this.LJLJL;
        if (video2StickerModel3 != null) {
            video2StickerModel3.editVideoInfo.initializeScale = floatValue;
            Float f5 = video2StickerModel3.videoCropData.scaleAfterCrop;
            if (f5 != null) {
                f = f5.floatValue();
            } else {
                f = floatValue;
            }
            if (invoke.height / invoke.width > LLJILJILJ().getMeasuredHeight() / LLJILJILJ().getCropAreaWidth()) {
                cropAreaWidth = LLJILJILJ().getMeasuredHeight();
                i = invoke.height;
            } else {
                cropAreaWidth = LLJILJILJ().getCropAreaWidth();
                i = invoke.width;
            }
            float f6 = cropAreaWidth / i;
            this.LJLJLJ = f6;
            float f7 = (f6 / floatValue) * f;
            ValueAnimator valueAnimator = this.LJLL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LJLL = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            if (z) {
                f2 = f;
                f = f7;
            } else {
                f2 = f7;
            }
            OSZ<Float, Float> invoke2 = getUiActions().LJLJLLL.invoke();
            if (z) {
                f3 = C144035l1.LIZJ();
                i2 = C144035l1.LIZ;
                i3 = i2 / 2;
            } else {
                float LIZ = C74275TDb.LIZ(52.0f);
                float LIZ2 = C74275TDb.LIZ(158.0f);
                i2 = C144035l1.LIZ;
                float f8 = i2;
                f3 = f8 - ((((f8 - LIZ) - LIZ2) / 2) + LIZ2);
                i3 = i2 / 2;
            }
            final float floatValue2 = ((f / f2) - 1) * (invoke2.getSecond().floatValue() + ((-(f3 - i3)) / i2));
            if (z) {
                LLJILJIL = this.LJLLI;
            } else {
                LLJILJIL = LLJILJIL();
            }
            if (z) {
                f4 = LLJILJIL();
            } else {
                f4 = this.LJLLI;
            }
            final C56K c56k = new C56K();
            c56k.element = f2;
            final C56K c56k2 = new C56K();
            final C56K c56k3 = new C56K();
            ValueAnimator valueAnimator2 = this.LJLL;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.5mF
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        float floatValue3 = ((Float) C264612c.LIZ(valueAnimator3, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        float f9 = f2;
                        float LIZIZ = C06420Na.LIZIZ(f, f9, floatValue3, f9);
                        float f10 = LIZIZ / c56k.element;
                        this.getUiActions().LJLILLLLZI.invoke(Float.valueOf(f10));
                        float floatValue4 = (f10 - 1) * this.getUiActions().LJLJLLL.invoke().getFirst().floatValue();
                        float f11 = (f4 - LLJILJIL) * floatValue3;
                        float f12 = f11 - c56k2.element;
                        float f13 = floatValue2 * floatValue3;
                        this.getUiActions().LJLJI.invoke(Float.valueOf(floatValue4), Float.valueOf((f12 / C144035l1.LIZ) + (f13 - c56k3.element)), Boolean.FALSE);
                        c56k.element = LIZIZ;
                        c56k2.element = f11;
                        c56k3.element = f13;
                        this.getUiActions().LJLLJ.invoke(Boolean.valueOf(z), Float.valueOf(floatValue3));
                    }
                });
            }
            ValueAnimator valueAnimator3 = this.LJLL;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new ALAdapterS1S0110000_2(this, z, 0));
            }
            ValueAnimator valueAnimator4 = this.LJLL;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
                return;
            }
            return;
        }
        o.LJIJI("video2StickerModel");
        throw null;
    }

    public final View LLJJIJI(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return (View) this.LJLJI.getValue();
                    }
                    return (View) this.LJLJJLL.getValue();
                }
                return (View) this.LJLJJL.getValue();
            }
            return (View) this.LJLJJI.getValue();
        }
        return (View) this.LJLJI.getValue();
    }

    public final void LLJJIJIIJIL(int i, boolean z) {
        if (getUiStates().LJ.LJFF == i) {
            return;
        }
        getUiActions().LJLLLLLL.invoke(Integer.valueOf(i), Boolean.valueOf(z));
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ViewGroup.LayoutParams layoutParams = requireViewById(R.id.kej).getLayoutParams();
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        layoutParams.height = C63081OpJ.LJJJJLI(requireSceneContext);
        Context requireSceneContext2 = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
        Integer LJI = C79045V0n.LJI(R.attr.d4, requireSceneContext2);
        if (LJI != null) {
            ((C252709vu) this.LJLIL.getValue()).setNavBackground(LJI.intValue());
        }
        C252709vu c252709vu = (C252709vu) this.LJLIL.getValue();
        C235119Kp c235119Kp = new C235119Kp();
        C234509Ig c234509Ig = new C234509Ig();
        String string = requireSceneContext().getString(R.string.cg_);
        o.LJIIIIZZ(string, "requireSceneContext().getString(R.string.cancel)");
        c234509Ig.LIZJ = string;
        EnumC252729vw enumC252729vw = EnumC252729vw.SECONDARY;
        c234509Ig.LIZ(enumC252729vw);
        c234509Ig.LIZ = new C109824Ss(new AqS152S0100000_2(this, 295));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{c234509Ig});
        String string2 = requireSceneContext().getString(R.string.fl0);
        o.LJIIIIZZ(string2, "requireSceneContext().ge…t_screen_photo_mode_crop)");
        LIZLLL.LIZJ = string2;
        c235119Kp.LIZJ = LIZLLL;
        C234509Ig c234509Ig2 = new C234509Ig();
        String string3 = requireSceneContext().getString(R.string.q8h);
        o.LJIIIIZZ(string3, "requireSceneContext().getString(R.string.save)");
        c234509Ig2.LIZJ = string3;
        c234509Ig2.LIZLLL = enumC252729vw;
        c234509Ig2.LIZ = new C109824Ss(new AqS152S0100000_2(this, 296));
        c235119Kp.LIZIZ(c234509Ig2);
        c252709vu.setNavActions(c235119Kp);
        C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 46), (View) this.LJLJI.getValue());
        C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 43), (View) this.LJLJJI.getValue());
        C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 44), (View) this.LJLJJLL.getValue());
        C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 45), (View) this.LJLJJL.getValue());
        ((View) this.LJLJI.getValue()).setSelected(true);
        Context requireSceneContext3 = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext3, "requireSceneContext()");
        C78897Uxp.LJIILIIL(requireSceneContext3, (ViewGroup) requireViewById(R.id.drl)).LIZIZ(new C6V4(0, this.LJLLL));
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5mE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C144515ln) obj).LJFF);
            }
        }, null, new AqS168S0100000_2(this, 206), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.5lo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C144515ln) obj).LJI;
            }
        }, null, new AqS168S0100000_2(this, 207), 2, null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ix, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
