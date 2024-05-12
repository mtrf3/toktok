package X;

import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import Y.IDTListenerS114S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AKR extends AKV<C208158Ex> {
    public final Context LJ;
    public final View LJFF;
    public final C208158Ex LJI;
    public View LJII;
    public boolean LJIIIIZZ;
    public final float LJIIIZ;

    @Override // X.AKV
    public final View LIZJ() {
        View view = this.LJII;
        if (view != null) {
            return view;
        }
        o.LJIJI("root");
        throw null;
    }

    @Override // X.AKV
    public final void LIZ(boolean z) {
        if (z) {
            View view = this.LJII;
            if (view != null) {
                view.findViewById(R.id.lbl).setTranslationY(this.LJIIIZ);
                return;
            } else {
                o.LJIJI("root");
                throw null;
            }
        }
        View view2 = this.LJII;
        if (view2 != null) {
            view2.findViewById(R.id.lbl).setAlpha(1.0f);
            View view3 = this.LJII;
            if (view3 != null) {
                view3.findViewById(R.id.lbl).setTranslationY(0.0f);
                return;
            } else {
                o.LJIJI("root");
                throw null;
            }
        }
        o.LJIJI("root");
        throw null;
    }

    @Override // X.AKV
    public final void LIZIZ(boolean z) {
        float f;
        float f2;
        float f3;
        long j;
        View view = this.LJII;
        if (view != null) {
            View findViewById = view.findViewById(R.id.lbl);
            float f4 = 0.0f;
            if (z) {
                f2 = this.LJIIIZ;
                f = 0.0f;
            } else {
                f = this.LJIIIZ;
                f2 = 0.0f;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(findViewById, "translationY", f2, f).setDuration(348L);
            o.LJIIIIZZ(duration, "ofFloat(\n            toa…       ).setDuration(348)");
            duration.setInterpolator(new InterpolatorC227028va());
            float[] fArr = new float[2];
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = 1.0f;
            }
            fArr[0] = f3;
            if (z) {
                f4 = 1.0f;
            }
            fArr[1] = f4;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "alpha", fArr);
            if (z) {
                j = 150;
            } else {
                j = 100;
            }
            ObjectAnimator duration2 = ofFloat.setDuration(j);
            o.LJIIIIZZ(duration2, "ofFloat(\n            toa…n(if (isIn) 150 else 100)");
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(duration2, duration);
            animatorSet.start();
            return;
        }
        o.LJIJI("root");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKR(Context context, View view, C208158Ex bundle) {
        super(view, bundle);
        InterfaceC88472Yns<? super FrameLayout, C76800UCe> interfaceC88472Yns;
        o.LJIIIZ(bundle, "bundle");
        this.LJ = context;
        this.LJFF = view;
        this.LJI = bundle;
        this.LJIIIIZZ = true;
        this.LJIIIZ = C32151Nz.LJIIZILJ(20);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.mc, R.attr.md, R.attr.me, R.attr.mf, R.attr.mg, R.attr.mh, R.attr.mi, R.attr.mj, R.attr.mk, R.attr.ml, R.attr.p5}, R.attr.jn, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…r.TuxBottomToastStyle, 0)");
        int i = obtainStyledAttributes.getInt(10, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        int resourceId = obtainStyledAttributes.getResourceId(9, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(5, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(6, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(3, 0);
        int color = obtainStyledAttributes.getColor(4, 0);
        int i2 = obtainStyledAttributes.getInt(2, 0);
        int i3 = obtainStyledAttributes.getInt(1, 0);
        int i4 = obtainStyledAttributes.getInt(8, 0);
        int i5 = obtainStyledAttributes.getInt(7, 0);
        obtainStyledAttributes.recycle();
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bt, C16880lQ.LLZIL(context), null);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…ottom_toast_layout, null)");
        this.LJII = LLLZIIL;
        setContentView(LLLZIIL);
        View view2 = this.LJII;
        if (view2 != null) {
            ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.btt);
            viewGroup.setBackground(drawable);
            viewGroup.setLayoutMode(1);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type com.bytedance.tux.widget.FlexLayout.LayoutParams");
            Context context2 = viewGroup.getContext();
            o.LJIIIIZZ(context2, "context");
            layoutParams.width = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() + Math.min(C47135Ieh.LIZ(16, C63081OpJ.LJJJJL(context2)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(430)));
            viewGroup.setLayoutParams(layoutParams);
            View view3 = this.LJII;
            if (view3 != null) {
                View findViewById = view3.findViewById(R.id.lbl);
                o.LJIIIIZZ(findViewById, "root.toast_layout");
                C26338AVi.LJIIIZ(findViewById, null, null, null, Integer.valueOf(bundle.LJLJL), 23);
                View view4 = this.LJII;
                if (view4 != null) {
                    View initView$lambda$1 = view4.findViewById(R.id.i1j);
                    View.OnClickListener onClickListener = bundle.LJLJLJ;
                    if (onClickListener != null) {
                        o.LJIIIIZZ(initView$lambda$1, "initView$lambda$1");
                        C78897Uxp.LJJJJL(initView$lambda$1, C32151Nz.LJIIZILJ(12));
                        C16880lQ.LJIIJ(new ACListenerS39S0200000_4(onClickListener, this, 0), initView$lambda$1);
                    }
                    View view5 = this.LJII;
                    if (view5 != null) {
                        ViewGroup viewGroup2 = (ViewGroup) view5.findViewById(R.id.kdl);
                        int i6 = bundle.LJLILLLLZI;
                        if (i6 != 3) {
                            if (i6 != 4) {
                                if (i6 != 0) {
                                    if (i6 != 1) {
                                        if (i6 != 2) {
                                            resourceId3 = 0;
                                        }
                                    } else {
                                        resourceId3 = resourceId2;
                                    }
                                } else {
                                    resourceId3 = resourceId;
                                }
                                int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
                                Context context3 = viewGroup2.getContext();
                                o.LJIIIIZZ(context3, "this.context");
                                TuxIconView tuxIconView = new TuxIconView(context3, null, 0, 6, null);
                                C2068389v c2068389v = new C2068389v();
                                c2068389v.LIZ = resourceId3;
                                c2068389v.LIZLLL = Integer.valueOf(color);
                                tuxIconView.setTuxIcon(c2068389v);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(LJJIIZ, LJJIIZ);
                                layoutParams2.gravity = 17;
                                viewGroup2.addView(tuxIconView, layoutParams2);
                            } else {
                                InterfaceC88472Yns<? super FrameLayout, C76800UCe> interfaceC88472Yns2 = bundle.LJLJI;
                                if (interfaceC88472Yns2 != null) {
                                    o.LJIIIIZZ(viewGroup2, "this");
                                    interfaceC88472Yns2.invoke(viewGroup2);
                                }
                            }
                        } else {
                            viewGroup2.setVisibility(8);
                        }
                        View view6 = this.LJII;
                        if (view6 != null) {
                            TuxTextView tuxTextView = (TuxTextView) view6.findViewById(R.id.ghd);
                            tuxTextView.setTuxFont(i);
                            tuxTextView.setTextColor(color);
                            tuxTextView.setText(bundle.LJLIL.LIZIZ);
                            View view7 = this.LJII;
                            if (view7 != null) {
                                ViewGroup viewGroup3 = (ViewGroup) view7.findViewById(R.id.cwm);
                                int i7 = bundle.LJLJJI;
                                if (i7 != 0) {
                                    if (i7 != 1) {
                                        if (i7 != 2) {
                                            if (i7 == 3 && (interfaceC88472Yns = bundle.LJLJJL) != null) {
                                                o.LJIIIIZZ(viewGroup3, "this");
                                                interfaceC88472Yns.invoke(viewGroup3);
                                            }
                                        } else {
                                            Context context4 = viewGroup3.getContext();
                                            o.LJIIIIZZ(context4, "context");
                                            TuxTextView tuxTextView2 = new TuxTextView(context4, null, 6, 0);
                                            tuxTextView2.setTuxFont(i5);
                                            C72062SPy c72062SPy = new C72062SPy();
                                            String str = bundle.LJLJJLL;
                                            c72062SPy.LIZIZ = str == null ? "" : str;
                                            c72062SPy.LIZ = true;
                                            c72062SPy.LJ(i4);
                                            c72062SPy.LIZIZ(i5);
                                            Context context5 = viewGroup3.getContext();
                                            o.LJIIIIZZ(context5, "context");
                                            tuxTextView2.setText(c72062SPy.LIZ(context5));
                                            viewGroup3.addView(tuxTextView2);
                                        }
                                    } else {
                                        Context context6 = viewGroup3.getContext();
                                        o.LJIIIIZZ(context6, "context");
                                        SY4 sy4 = new SY4(context6, null, 6, 0);
                                        sy4.setText(bundle.LJLJJLL);
                                        sy4.setButtonSize(i3);
                                        sy4.setButtonVariant(i2);
                                        C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(this, 0));
                                        viewGroup3.addView(sy4);
                                    }
                                } else {
                                    Context context7 = viewGroup3.getContext();
                                    o.LJIIIIZZ(context7, "context");
                                    TuxIconView tuxIconView2 = new TuxIconView(context7, null, 0, 6, null);
                                    C2068389v c2068389v2 = new C2068389v();
                                    c2068389v2.LIZ = resourceId4;
                                    c2068389v2.LIZLLL = Integer.valueOf(color);
                                    c2068389v2.LIZIZ = C7MY.LIZIZ(14);
                                    c2068389v2.LIZJ = C7MY.LIZIZ(14);
                                    tuxIconView2.setTuxIcon(c2068389v2);
                                    viewGroup3.addView(tuxIconView2);
                                }
                                View view8 = this.LJII;
                                if (view8 != null) {
                                    BottomSheetBehavior from = BottomSheetBehavior.from(view8.findViewById(R.id.lbl));
                                    o.LJIIIIZZ(from, "from(root.toast_layout)");
                                    from.setBottomSheetCallback(new AKS(this));
                                    if (Build.VERSION.SDK_INT < 23) {
                                        setBackgroundDrawable(new ColorDrawable(0));
                                    }
                                    setTouchInterceptor(new IDTListenerS114S0100000_4(this, 1));
                                    return;
                                }
                                o.LJIJI("root");
                                throw null;
                            }
                            o.LJIJI("root");
                            throw null;
                        }
                        o.LJIJI("root");
                        throw null;
                    }
                    o.LJIJI("root");
                    throw null;
                }
                o.LJIJI("root");
                throw null;
            }
            o.LJIJI("root");
            throw null;
        }
        o.LJIJI("root");
        throw null;
    }
}
