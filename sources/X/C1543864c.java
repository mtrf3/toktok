package X;

import Y.ALAdapterS1S0110000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.64c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1543864c extends FrameLayout implements C64U {
    public final Vibrator LJLIL;
    public final ConstraintLayout LJLILLLLZI;
    public final ImageView LJLJI;
    public final ImageView LJLJJI;
    public final View LJLJJL;
    public final View LJLJJLL;
    public final View LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public InterfaceC88472Yns<? super C64N, C76800UCe> LJLLLL;

    @Override // X.C64U
    public final boolean LIZIZ(C64N c64n, float f) {
        return false;
    }

    @Override // X.C64U
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.C64U
    public final boolean LJ(C64N c64n, float f) {
        return false;
    }

    @Override // X.C64U
    public final void LJFF() {
    }

    @Override // X.C64U
    public final void LJI(C64N c64n) {
    }

    private final Rect getDeleteViewRect() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    public final void LJIIIIZZ() {
        View view = this.LJLJL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = (int) C170576mj.LIZ(getContext(), 24.0f);
                marginLayoutParams.height = (int) C170576mj.LIZ(getContext(), 24.0f);
                marginLayoutParams.topMargin = (int) C170576mj.LIZ(getContext(), 14.0f);
                view.setLayoutParams(marginLayoutParams);
                ImageView imageView = this.LJLJI;
                if (imageView != null) {
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    if (layoutParams2 != null) {
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                        layoutParams3.width = (int) C170576mj.LIZ(getContext(), 16.0f);
                        layoutParams3.height = (int) C170576mj.LIZ(getContext(), 4.0f);
                        layoutParams3.topMargin = (int) C170576mj.LIZ(getContext(), 3.0f);
                        imageView.setLayoutParams(layoutParams3);
                        ImageView imageView2 = this.LJLJJI;
                        if (imageView2 != null) {
                            ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
                            if (layoutParams4 != null) {
                                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
                                layoutParams5.width = (int) C170576mj.LIZ(getContext(), 16.0f);
                                layoutParams5.height = (int) C170576mj.LIZ(getContext(), 14.0f);
                                layoutParams5.bottomMargin = (int) C170576mj.LIZ(getContext(), 3.0f);
                                imageView2.setLayoutParams(layoutParams5);
                                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                                anonymousClass064.LJII(this.LJLILLLLZI);
                                View view2 = this.LJLJL;
                                if (view2 != null) {
                                    anonymousClass064.LJIIIIZZ(view2.getId(), 6, 0, 6);
                                    View view3 = this.LJLJL;
                                    if (view3 != null) {
                                        anonymousClass064.LJIIIIZZ(view3.getId(), 7, 0, 7);
                                        View view4 = this.LJLJL;
                                        if (view4 != null) {
                                            anonymousClass064.LJIIIZ(view4.getId(), 3, 0, 3, (int) C170576mj.LIZ(getContext(), 14.0f));
                                            View view5 = this.LJLJL;
                                            if (view5 != null) {
                                                int id = view5.getId();
                                                View view6 = this.LJLJJL;
                                                if (view6 != null) {
                                                    anonymousClass064.LJIIIIZZ(id, 4, view6.getId(), 3);
                                                    View view7 = this.LJLJJL;
                                                    if (view7 != null) {
                                                        anonymousClass064.LJIIIIZZ(view7.getId(), 6, 0, 6);
                                                        View view8 = this.LJLJJL;
                                                        if (view8 != null) {
                                                            anonymousClass064.LJIIIIZZ(view8.getId(), 7, 0, 7);
                                                            View view9 = this.LJLJJL;
                                                            if (view9 != null) {
                                                                anonymousClass064.LJIIIZ(view9.getId(), 4, 0, 4, (int) C170576mj.LIZ(getContext(), 14.0f));
                                                                View view10 = this.LJLJJL;
                                                                if (view10 != null) {
                                                                    int id2 = view10.getId();
                                                                    View view11 = this.LJLJL;
                                                                    if (view11 != null) {
                                                                        anonymousClass064.LJIIIIZZ(id2, 3, view11.getId(), 4);
                                                                        ConstraintLayout constraintLayout = this.LJLILLLLZI;
                                                                        if (constraintLayout != null) {
                                                                            anonymousClass064.LIZIZ(constraintLayout);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    o.LJIJI("mParentView");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("mDeleteTextView");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mDeleteTextView");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mDeleteTextView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mDeleteTextView");
                                                    throw null;
                                                }
                                                o.LJIJI("mDeleteTextView");
                                                throw null;
                                            }
                                            o.LJIJI("mParentView");
                                            throw null;
                                        }
                                        o.LJIJI("mParentView");
                                        throw null;
                                    }
                                    o.LJIJI("mParentView");
                                    throw null;
                                }
                                o.LJIJI("mParentView");
                                throw null;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        }
                        o.LJIJI("deleteBottomImgView");
                        throw null;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }
                o.LJIJI("mDeleteTopImgView");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        o.LJIJI("mParentView");
        throw null;
    }

    public final void LJIILIIL() {
        if (this.LJLLI) {
            return;
        }
        this.LJLLI = true;
        View view = this.LJLJJL;
        if (view != null) {
            view.setVisibility(0);
            if (!C1544664k.LIZ()) {
                View view2 = this.LJLJJL;
                if (view2 != null) {
                    LJIIIZ(true, view2, false);
                    return;
                } else {
                    o.LJIJI("mDeleteTextView");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("mDeleteTextView");
        throw null;
    }

    public final void LJIIJJI() {
        if (C1544664k.LIZ()) {
            ConstraintLayout constraintLayout = this.LJLILLLLZI;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            View view = this.LJLJL;
            if (view != null) {
                view.setVisibility(8);
                return;
            } else {
                o.LJIJI("mParentView");
                throw null;
            }
        }
        View view2 = this.LJLJL;
        if (view2 != null) {
            if (view2.getVisibility() != 0) {
                return;
            }
            View view3 = this.LJLJL;
            if (view3 != null) {
                LJIIIZ(false, view3, true);
                return;
            } else {
                o.LJIJI("mParentView");
                throw null;
            }
        }
        o.LJIJI("mParentView");
        throw null;
    }

    public final InterfaceC88472Yns<C64N, C76800UCe> getStickerDeleteListener() {
        return this.LJLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1543864c(Context context) {
        super(context, null, 0);
        View LLLZIIL;
        int i;
        new LinkedHashMap();
        this.LJLLILLLL = 3;
        if (C1544664k.LIZ()) {
            LLLZIIL = C16880lQ.LLLZIIL(R.layout.au7, C16880lQ.LLZIL(context), this);
            o.LJIIIIZZ(LLLZIIL, "{\n            LayoutInfl…lete_new, this)\n        }");
        } else {
            LLLZIIL = C16880lQ.LLLZIIL(R.layout.cns, C16880lQ.LLZIL(context), this);
            o.LJIIIIZZ(LLLZIIL, "{\n            LayoutInfl…t_delete, this)\n        }");
        }
        View findViewById = LLLZIIL.findViewById(R.id.lf_);
        o.LJIIIIZZ(findViewById, "rootView.findViewById<ImageView>(R.id.top_img)");
        this.LJLJI = (ImageView) findViewById;
        View findViewById2 = LLLZIIL.findViewById(R.id.aq6);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.bottom_img)");
        this.LJLJJI = (ImageView) findViewById2;
        View findViewById3 = LLLZIIL.findViewById(R.id.c6m);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById<View>(R.id.delete_txt)");
        this.LJLJJL = findViewById3;
        View findViewById4 = LLLZIIL.findViewById(R.id.hif);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById<View>(R.id.parent_view)");
        this.LJLJL = findViewById4;
        if (C1544664k.LIZ()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) LLLZIIL.findViewById(R.id.j71);
            this.LJLILLLLZI = constraintLayout;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            this.LJLLI = true;
        }
        View findViewById5 = LLLZIIL.findViewById(R.id.ajr);
        o.LJIIIIZZ(findViewById5, "rootView.findViewById<View>(R.id.bg_view)");
        this.LJLJJLL = findViewById5;
        findViewById5.setVisibility(8);
        findViewById4.setVisibility(8);
        Object LLILL = C16880lQ.LLILL(context, "vibrator");
        o.LJII(LLILL, "null cannot be cast to non-null type android.os.Vibrator");
        this.LJLIL = (Vibrator) LLILL;
        int LIZ = (int) C170576mj.LIZ(context, 72.0f);
        if (C1544664k.LIZ()) {
            i = (int) C170576mj.LIZ(context, 104.0f);
        } else {
            i = LIZ;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, C1544664k.LIZ() ? (int) C170576mj.LIZ(context, 72.0f) : LIZ);
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
    }

    public final void LJIIJ(boolean z) {
        if (!this.LJLL) {
            return;
        }
        this.LJLL = false;
        ImageView imageView = this.LJLJI;
        if (imageView != null) {
            imageView.clearAnimation();
            if (C1544664k.LIZ()) {
                View view = this.LJLJJLL;
                if (view != null) {
                    view.setVisibility(8);
                    LJIIIIZZ();
                    if (z) {
                        LJIILIIL();
                        return;
                    }
                    return;
                }
                o.LJIJI("mCircleBgView");
                throw null;
            }
            View view2 = this.LJLJJLL;
            if (view2 != null) {
                LJIIIZ(false, view2, false);
                return;
            } else {
                o.LJIJI("mCircleBgView");
                throw null;
            }
        }
        o.LJIJI("mDeleteTopImgView");
        throw null;
    }

    public final void LJIILJJIL(C64N c64n) {
        int i = this.LJLLILLLL;
        if (i == 1) {
            if (!this.LJLJLLL) {
                try {
                    this.LJLIL.vibrate(20L);
                } catch (Throwable unused) {
                }
                this.LJLJLLL = true;
                c64n.LIZJ().LJ(0.3137255f);
                return;
            }
            return;
        }
        if (i == 2) {
            this.LJLJLJ = false;
            this.LJLJLLL = false;
            if (!C1544664k.LIZ()) {
                this.LJLLI = false;
            }
            this.LJLL = false;
            return;
        }
        if (i == 3) {
            try {
                this.LJLIL.vibrate(20L);
            } catch (Throwable unused2) {
            }
            c64n.LIZJ().LJ(1.0f);
        } else {
            c64n.LIZJ().LJ(1.0f);
            this.LJLJLLL = false;
        }
    }

    public final void setStickerDeleteListener(InterfaceC88472Yns<? super C64N, C76800UCe> interfaceC88472Yns) {
        this.LJLLLL = interfaceC88472Yns;
    }

    public static void LJIIIZ(boolean z, View view, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        float f6 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        o.LJIIIIZZ(ofFloat, "ofFloat(\n            vie…ow) 1f else 0f,\n        )");
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", fArr2);
        o.LJIIIIZZ(ofFloat2, "ofFloat(\n            vie…ow) 1f else 0f,\n        )");
        float[] fArr3 = new float[2];
        if (z) {
            f5 = 0.0f;
        } else {
            f5 = 1.0f;
        }
        fArr3[0] = f5;
        if (!z) {
            f6 = 0.0f;
        }
        fArr3[1] = f6;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", fArr3);
        o.LJIIIIZZ(ofFloat3, "ofFloat(\n            vie…ow) 1f else 0f,\n        )");
        animatorSet.setDuration(300L);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.addListener(new ALAdapterS1S0110000_2(view, z2, 5));
        animatorSet.start();
    }

    @Override // X.C64U
    public final void LIZ(C64N c64n, float f, float f2) {
        if (LJIIL((int) f, (int) f2, true) == 2) {
            InterfaceC88472Yns<? super C64N, C76800UCe> interfaceC88472Yns = this.LJLLLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(c64n);
            }
            c64n.LIZJ = true;
            LJIILJJIL(c64n);
        }
    }

    @Override // X.C64U
    public final boolean LIZJ(C64N c64n, float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return false;
        }
        float f3 = this.LJLLJ + f;
        float f4 = this.LJLLL + f2;
        this.LJLLILLLL = LJIIL((int) f3, (int) f4, false);
        LJIILJJIL(c64n);
        this.LJLLJ = f3;
        this.LJLLL = f4;
        return false;
    }

    @Override // X.C64U
    public final void LJII(C64N c64n, float f, float f2) {
        this.LJLLJ = f;
        this.LJLLL = f2;
    }

    public final int LJIIL(int i, int i2, boolean z) {
        if (z) {
            if (getDeleteViewRect().contains(i, i2)) {
                LJIIJJI();
                LJIIJ(false);
                if (C1544664k.LIZ() && !this.LJLL) {
                    LJIILIIL();
                    LJIIIIZZ();
                }
                if (this.LJLLILLLL == 1) {
                    return 2;
                }
                return -1;
            }
            LJIIJJI();
            LJIIJ(false);
            this.LJLJLJ = false;
            return -1;
        }
        if (getDeleteViewRect().contains(i, i2)) {
            if (this.LJLLI) {
                this.LJLLI = false;
                if (!C1544664k.LIZ()) {
                    View view = this.LJLJJL;
                    if (view != null) {
                        LJIIIZ(false, view, true);
                    } else {
                        o.LJIJI("mDeleteTextView");
                        throw null;
                    }
                } else {
                    View view2 = this.LJLJJL;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    } else {
                        o.LJIJI("mDeleteTextView");
                        throw null;
                    }
                }
            }
            if (!this.LJLL) {
                View view3 = this.LJLJJLL;
                if (view3 != null) {
                    view3.setVisibility(0);
                    this.LJLL = true;
                    if (C1544664k.LIZ()) {
                        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                        anonymousClass064.LJII(this.LJLILLLLZI);
                        View view4 = this.LJLJL;
                        if (view4 != null) {
                            anonymousClass064.LJIIIIZZ(view4.getId(), 6, 0, 6);
                            View view5 = this.LJLJL;
                            if (view5 != null) {
                                anonymousClass064.LJIIIIZZ(view5.getId(), 7, 0, 7);
                                View view6 = this.LJLJL;
                                if (view6 != null) {
                                    anonymousClass064.LJIIIIZZ(view6.getId(), 3, 0, 3);
                                    View view7 = this.LJLJL;
                                    if (view7 != null) {
                                        anonymousClass064.LJIIIIZZ(view7.getId(), 4, 0, 4);
                                        ConstraintLayout constraintLayout = this.LJLILLLLZI;
                                        if (constraintLayout != null) {
                                            anonymousClass064.LIZIZ(constraintLayout);
                                        }
                                        View view8 = this.LJLJL;
                                        if (view8 != null) {
                                            ViewGroup.LayoutParams layoutParams = view8.getLayoutParams();
                                            if (layoutParams != null) {
                                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                                marginLayoutParams.width = (int) C170576mj.LIZ(getContext(), 32.0f);
                                                marginLayoutParams.height = (int) C170576mj.LIZ(getContext(), 32.0f);
                                                marginLayoutParams.topMargin = 0;
                                                view8.setLayoutParams(marginLayoutParams);
                                                ImageView imageView = this.LJLJI;
                                                if (imageView != null) {
                                                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                                                    if (layoutParams2 != null) {
                                                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                                                        layoutParams3.width = (int) C170576mj.LIZ(getContext(), 24.0f);
                                                        layoutParams3.height = (int) C170576mj.LIZ(getContext(), 6.0f);
                                                        layoutParams3.topMargin = (int) C170576mj.LIZ(getContext(), 4.5f);
                                                        imageView.setLayoutParams(layoutParams3);
                                                        ImageView imageView2 = this.LJLJJI;
                                                        if (imageView2 != null) {
                                                            ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
                                                            if (layoutParams4 != null) {
                                                                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
                                                                layoutParams5.width = (int) C170576mj.LIZ(getContext(), 24.0f);
                                                                layoutParams5.height = (int) C170576mj.LIZ(getContext(), 21.0f);
                                                                layoutParams5.bottomMargin = (int) C170576mj.LIZ(getContext(), 4.5f);
                                                                imageView2.setLayoutParams(layoutParams5);
                                                            } else {
                                                                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                            }
                                                        } else {
                                                            o.LJIJI("deleteBottomImgView");
                                                            throw null;
                                                        }
                                                    } else {
                                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                    }
                                                } else {
                                                    o.LJIJI("mDeleteTopImgView");
                                                    throw null;
                                                }
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                            }
                                        } else {
                                            o.LJIJI("mParentView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("mParentView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mParentView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mParentView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mParentView");
                            throw null;
                        }
                    } else {
                        View view9 = this.LJLJJLL;
                        if (view9 != null) {
                            LJIIIZ(true, view9, false);
                        } else {
                            o.LJIJI("mCircleBgView");
                            throw null;
                        }
                    }
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -20.0f, 10.0f, 30.0f);
                    rotateAnimation.setDuration(300L);
                    rotateAnimation.setFillAfter(true);
                    ImageView imageView3 = this.LJLJI;
                    if (imageView3 != null) {
                        imageView3.startAnimation(rotateAnimation);
                    } else {
                        o.LJIJI("mDeleteTopImgView");
                        throw null;
                    }
                } else {
                    o.LJIJI("mCircleBgView");
                    throw null;
                }
            }
            this.LJLJLJ = true;
            return 1;
        }
        LJIIJ(true);
        if (C1544664k.LIZ()) {
            ConstraintLayout constraintLayout2 = this.LJLILLLLZI;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
            View view10 = this.LJLJL;
            if (view10 != null) {
                view10.setVisibility(0);
            } else {
                o.LJIJI("mParentView");
                throw null;
            }
        } else {
            View view11 = this.LJLJL;
            if (view11 != null) {
                if (view11.getVisibility() == 8) {
                    View view12 = this.LJLJL;
                    if (view12 != null) {
                        view12.setVisibility(0);
                        View view13 = this.LJLJL;
                        if (view13 != null) {
                            LJIIIZ(true, view13, false);
                        } else {
                            o.LJIJI("mParentView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mParentView");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("mParentView");
                throw null;
            }
        }
        if (!C1544664k.LIZ()) {
            LJIILIIL();
        }
        if (this.LJLJLJ) {
            this.LJLJLJ = false;
            return 3;
        }
        this.LJLJLJ = false;
        return -1;
    }
}
