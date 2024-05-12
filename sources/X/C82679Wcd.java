package X;

import Y.AUListenerS101S0100000_14;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Wcd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82679Wcd {
    public static final int LJIIL = ColorProtector.parseColor("#FF00C6E9");
    public final Context LIZ;
    public C82682Wcg LIZIZ;
    public final InterfaceC82683Wch LIZJ;
    public final View LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final C82687Wcl LJIIIZ;
    public final int LJIIJ;
    public int LJIIJJI;

    public final boolean LJIIIIZZ() {
        this.LIZLLL.measure(0, 0);
        this.LJII = this.LIZLLL.getMeasuredWidth();
        this.LJIIIIZZ = this.LIZLLL.getMeasuredHeight();
        C82682Wcg c82682Wcg = this.LIZIZ;
        View view = c82682Wcg.LIZIZ;
        if (view != null) {
            int width = view.getWidth();
            View view2 = this.LIZIZ.LIZIZ;
            o.LJI(view2);
            int height = view2.getHeight();
            int[] iArr = new int[2];
            View view3 = this.LIZIZ.LIZIZ;
            o.LJI(view3);
            view3.getLocationInWindow(iArr);
            return LJII(this.LIZIZ.LIZLLL, this.LJIIIZ, width, height, iArr[0], iArr[1]);
        }
        return LJII(c82682Wcg.LIZLLL, this.LJIIIZ, 0, 0, c82682Wcg.LJIILLIIL, c82682Wcg.LJIIZILJ);
    }

    public final int LIZ() {
        if (this.LJ) {
            return C63081OpJ.LJJJJLI(this.LIZ) + this.LJIIJJI;
        }
        return this.LJIIJJI;
    }

    public final int LIZIZ() {
        return C63081OpJ.LJJJJLI(this.LIZ) + C63081OpJ.LJJJJJL(this.LIZ);
    }

    public final void LJ() {
        if (C26338AVi.LIZJ(this.LIZ)) {
            C82682Wcg c82682Wcg = this.LIZIZ;
            WHL whl = c82682Wcg.LIZLLL;
            WHL whl2 = WHL.START;
            if (whl == whl2) {
                c82682Wcg.LIZ(WHL.END);
            } else if (whl == WHL.END) {
                c82682Wcg.LIZ(whl2);
            }
            C82682Wcg c82682Wcg2 = this.LIZIZ;
            WHL whl3 = c82682Wcg2.LIZLLL;
            if (whl3 == WHL.TOP || whl3 == WHL.BOTTOM) {
                c82682Wcg2.LJI = -c82682Wcg2.LJI;
            }
            c82682Wcg2.LJ = -c82682Wcg2.LJ;
            this.LIZLLL.findViewById(R.id.bst).setLayoutDirection(1);
        }
    }

    public final void LJFF() {
        this.LIZJ.LIZIZ(this.LIZIZ.LJJIFFI);
        this.LIZJ.LJ(this.LIZIZ.LJJII);
        C82682Wcg c82682Wcg = this.LIZIZ;
        int i = c82682Wcg.LJIIIIZZ;
        this.LJIIJJI = i;
        int i2 = this.LJIIJ;
        if (i2 > i) {
            this.LJIIJJI = i2;
        }
        this.LJIIJJI -= i2;
        long j = c82682Wcg.LJII;
        if (j < 0 && j != -1001) {
            c82682Wcg.LJII = 5000L;
        }
        if (c82682Wcg.LJIIJ < 0) {
            c82682Wcg.LJIIJ = 250L;
        }
        this.LIZJ.LIZ(c82682Wcg.LJIJJLI);
        InterfaceC82683Wch interfaceC82683Wch = this.LIZJ;
        C82682Wcg c82682Wcg2 = this.LIZIZ;
        interfaceC82683Wch.LIZJ(c82682Wcg2.LJJ, c82682Wcg2.LJJI);
    }

    public final void LJI() {
        Drawable drawable;
        int i;
        this.LIZIZ.getClass();
        if (this.LIZIZ.LJIJ != null) {
            ((ViewGroup) this.LIZLLL.findViewById(R.id.bst)).removeAllViews();
            ((ViewGroup) this.LIZLLL.findViewById(R.id.bst)).addView(this.LIZIZ.LJIJ);
        }
        C82682Wcg c82682Wcg = this.LIZIZ;
        if (c82682Wcg.LIZ == null) {
            Integer LJII = C79045V0n.LJII(this.LIZ, new int[]{R.attr.tf, R.attr.tg, R.attr.th, R.attr.ti, R.attr.tj, R.attr.tk, R.attr.tl, R.attr.tm, R.attr.tn, R.attr.to}, 0);
            if (LJII == null) {
                LJII = Integer.valueOf(LJIIL);
            }
            c82682Wcg.LIZ = LJII;
        }
        Integer num = this.LIZIZ.LIZ;
        if (num != null) {
            int intValue = num.intValue();
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = C61328O5c.LIZJ(12);
            c110614Vt.LIZ = Integer.valueOf(intValue);
            this.LIZLLL.findViewById(R.id.btt).setBackground(c110614Vt.LIZ(this.LIZ));
        }
        ImageView imageView = (ImageView) this.LIZLLL.findViewById(R.id.a86);
        ImageView imageView2 = (ImageView) this.LIZLLL.findViewById(R.id.a87);
        ImageView imageView3 = (ImageView) this.LIZLLL.findViewById(R.id.a7p);
        ImageView imageView4 = (ImageView) this.LIZLLL.findViewById(R.id.a7q);
        ImageView imageView5 = (ImageView) this.LIZLLL.findViewById(R.id.a83);
        ImageView imageView6 = (ImageView) this.LIZLLL.findViewById(R.id.a84);
        ImageView imageView7 = (ImageView) this.LIZLLL.findViewById(R.id.a7s);
        ImageView imageView8 = (ImageView) this.LIZLLL.findViewById(R.id.a7t);
        Iterator it = C47261Igj.LJJIJIIJI(imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8).iterator();
        while (it.hasNext()) {
            ((ImageView) it.next()).setVisibility(8);
        }
        C82682Wcg c82682Wcg2 = this.LIZIZ;
        if (c82682Wcg2.LJIIL) {
            Integer num2 = c82682Wcg2.LIZ;
            if (num2 != null) {
                WHL whl = c82682Wcg2.LIZLLL;
                if (whl == WHL.TOP || whl == WHL.BOTTOM) {
                    i = R.drawable.lb;
                } else {
                    i = R.drawable.lg;
                }
                Drawable LIZIZ = C04270Et.LIZIZ(this.LIZ, i);
                if (LIZIZ != null) {
                    drawable = C07840Sm.LJFF(LIZIZ);
                    C07820Sk.LJI(drawable, num2.intValue());
                }
            } else {
                drawable = null;
            }
            int i2 = WHN.LIZ[this.LIZIZ.LIZLLL.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            imageView.setVisibility(0);
                            imageView2.setVisibility(0);
                            if (drawable != null) {
                                imageView.setImageDrawable(drawable);
                            }
                        }
                    } else {
                        imageView5.setVisibility(0);
                        imageView6.setVisibility(0);
                        if (drawable != null) {
                            imageView5.setImageDrawable(drawable);
                        }
                    }
                } else {
                    imageView7.setVisibility(0);
                    imageView8.setVisibility(0);
                    if (drawable != null) {
                        imageView7.setImageDrawable(drawable);
                    }
                }
            } else {
                imageView3.setVisibility(0);
                imageView4.setVisibility(0);
                if (drawable != null) {
                    imageView3.setImageDrawable(drawable);
                }
            }
        }
        View view = this.LIZIZ.LJIJI;
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams != null) {
                Iterator it2 = C47261Igj.LJJIJIIJI(10, 5, 7, 3, 6, 8, 1).iterator();
                while (it2.hasNext()) {
                    layoutParams.addRule(((Number) it2.next()).intValue(), 0);
                }
                layoutParams.addRule(17, 0);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            }
            if (view.getId() == -1) {
                view.setId(R.id.lva);
            }
            ViewGroup viewGroup = (ViewGroup) this.LIZLLL.findViewById(R.id.bul);
            int i3 = WHN.LIZ[this.LIZIZ.LJIJJ.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            layoutParams.addRule(10, 0);
                            layoutParams.addRule(5, R.id.btt);
                            layoutParams.addRule(7, R.id.btt);
                            layoutParams.addRule(3, R.id.aod);
                        }
                    } else {
                        layoutParams.addRule(10, 0);
                        layoutParams.addRule(6, R.id.btt);
                        layoutParams.addRule(8, R.id.btt);
                        layoutParams.addRule(17, R.id.cw2);
                    }
                } else {
                    layoutParams.addRule(10, 0);
                    layoutParams.addRule(6, R.id.btt);
                    layoutParams.addRule(8, R.id.btt);
                    ViewGroup.LayoutParams layoutParams2 = this.LIZLLL.findViewById(R.id.kcg).getLayoutParams();
                    o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    ((RelativeLayout.LayoutParams) layoutParams2).addRule(17, view.getId());
                }
            } else {
                layoutParams.addRule(10);
                layoutParams.addRule(5, R.id.btt);
                layoutParams.addRule(7, R.id.btt);
                ViewGroup.LayoutParams layoutParams3 = this.LIZLLL.findViewById(R.id.ldu).getLayoutParams();
                o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams3).addRule(3, view.getId());
            }
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                C16880lQ.LJLLL(view, (ViewGroup) parent);
            }
            viewGroup.addView(view, layoutParams);
        }
        if (this.LIZIZ.LJJIII) {
            float LJIIZILJ = C32151Nz.LJIIZILJ(16);
            this.LIZLLL.findViewById(R.id.btt).setElevation(LJIIZILJ);
            this.LIZLLL.findViewById(R.id.ldu).setElevation(LJIIZILJ);
            this.LIZLLL.findViewById(R.id.aod).setElevation(LJIIZILJ);
            this.LIZLLL.findViewById(R.id.kcg).setElevation(LJIIZILJ);
            this.LIZLLL.findViewById(R.id.cw2).setElevation(LJIIZILJ);
            ViewGroup viewGroup2 = (ViewGroup) this.LIZLLL.findViewById(R.id.bul);
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public final void LIZJ(WHL whl, C82687Wcl c82687Wcl) {
        int i = WHN.LIZ[whl.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    return;
                }
            } else {
                float f = c82687Wcl.LIZLLL - (this.LJFF / 2.0f);
                int LIZ = LIZ();
                int i2 = this.LJIIJ;
                if (f < LIZ + i2) {
                    f = LIZ() + this.LJIIJ;
                } else if (this.LJFF + f + i2 > LIZIZ() - this.LJIIJJI) {
                    f = ((LIZIZ() - this.LJIIJJI) - this.LJFF) - this.LJIIJ;
                }
                int i3 = c82687Wcl.LIZIZ;
                int i4 = this.LJIIJ;
                if (f < i3 + i4) {
                    c82687Wcl.LIZIZ = ((int) f) - i4;
                } else {
                    int i5 = this.LJFF;
                    float f2 = i5 + f + i4;
                    int i6 = this.LJIIIIZZ;
                    if (f2 > i3 + i6) {
                        c82687Wcl.LIZIZ = ((((int) f) + i5) + i4) - i6;
                    }
                }
                c82687Wcl.LIZLLL = O6R.LJJIIZ((this.LJFF / 2.0f) + f);
                float f3 = (f - c82687Wcl.LIZIZ) - this.LJIIJ;
                if (whl == WHL.START) {
                    this.LIZLLL.findViewById(R.id.a7t).setY(f3);
                    this.LIZLLL.findViewById(R.id.a7s).setY(f3);
                    return;
                } else {
                    this.LIZLLL.findViewById(R.id.a84).setY(f3);
                    this.LIZLLL.findViewById(R.id.a83).setY(f3);
                    return;
                }
            }
        }
        float f4 = c82687Wcl.LIZJ;
        int i7 = this.LJFF;
        float f5 = f4 - (i7 / 2.0f);
        int i8 = this.LJIIJJI;
        int i9 = this.LJIIJ;
        if (f5 < i8 + i9) {
            f5 = i8 + i9;
        } else if (i7 + f5 + i9 > C63081OpJ.LJJJJL(this.LIZ) - this.LJIIJJI) {
            f5 = ((C63081OpJ.LJJJJL(this.LIZ) - this.LJIIJJI) - this.LJFF) - this.LJIIJ;
        }
        int i10 = c82687Wcl.LIZ;
        int i11 = this.LJIIJ;
        if (f5 < i10 + i11) {
            c82687Wcl.LIZ = O6R.LJJIIZ(f5) - this.LJIIJ;
        } else if (this.LJFF + f5 + i11 > i10 + this.LJII) {
            c82687Wcl.LIZ = ((O6R.LJJIIZ(f5) + this.LJFF) + this.LJIIJ) - this.LJII;
        }
        c82687Wcl.LIZJ = O6R.LJJIIZ((this.LJFF / 2.0f) + f5);
        float f6 = (f5 - c82687Wcl.LIZ) - this.LJIIJ;
        if (whl == WHL.TOP) {
            this.LIZLLL.findViewById(R.id.a7q).setX(f6);
            this.LIZLLL.findViewById(R.id.a7p).setX(f6);
        } else {
            this.LIZLLL.findViewById(R.id.a87).setX(f6);
            this.LIZLLL.findViewById(R.id.a86).setX(f6);
        }
    }

    public final void LJIIIZ(C82687Wcl locationData, boolean z) {
        o.LJIIIZ(locationData, "locationData");
        C82682Wcg c82682Wcg = this.LIZIZ;
        if (c82682Wcg.LJIIJJI) {
            c82682Wcg.getClass();
            float f = 1.0f;
            float f2 = 0.0f;
            if (z) {
                f = 0.0f;
                f2 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
            ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 21));
            ofFloat.setDuration(this.LIZIZ.LJIIJ);
            AnimatorSet animatorSet = new AnimatorSet();
            if (z) {
                animatorSet.setInterpolator(this.LIZIZ.LJIILIIL);
            } else {
                animatorSet.setInterpolator(this.LIZIZ.LJIILJJIL);
            }
            animatorSet.playTogether(ofFloat);
            animatorSet.setDuration(this.LIZIZ.LJIIJ);
            this.LIZLLL.setPivotX(locationData.LIZJ - locationData.LIZ);
            this.LIZLLL.setPivotY(locationData.LIZLLL - locationData.LIZIZ);
            animatorSet.start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r0 != 4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r0 != 4) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(X.WHL r8, X.C82687Wcl r9, int r10) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82679Wcd.LIZLLL(X.WHL, X.Wcl, int):boolean");
    }

    public C82679Wcd(Context context, C82682Wcg bundle, InterfaceC82683Wch tooltip, View view, boolean z) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(bundle, "bundle");
        o.LJIIIZ(tooltip, "tooltip");
        this.LIZ = context;
        this.LIZIZ = bundle;
        this.LIZJ = tooltip;
        this.LIZLLL = view;
        this.LJ = z;
        this.LJFF = C7MY.LIZIZ(36);
        this.LJI = C7MY.LIZIZ(1);
        this.LJIIIZ = new C82687Wcl();
        int LIZIZ = C7MY.LIZIZ(4);
        this.LJIIJ = LIZIZ;
        this.LJIIJJI = LIZIZ;
    }

    public final boolean LJII(WHL whl, C82687Wcl c82687Wcl, int i, int i2, int i3, int i4) {
        int i5 = WHN.LIZ[whl.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 == 4) {
                        int i6 = ((i3 + i3) + i) / 2;
                        int i7 = i6 - (this.LJII / 2);
                        C82682Wcg c82682Wcg = this.LIZIZ;
                        c82687Wcl.LIZ = i7 + c82682Wcg.LJ;
                        int i8 = i4 + i2;
                        c82687Wcl.LIZIZ = c82682Wcg.LJFF + i8 + this.LJI;
                        LIZLLL(whl, c82687Wcl, 1);
                        C82682Wcg c82682Wcg2 = this.LIZIZ;
                        c82687Wcl.LIZJ = i6 + c82682Wcg2.LJI;
                        c82687Wcl.LIZLLL = i8 + c82682Wcg2.LJFF + this.LJI;
                        LIZJ(whl, c82687Wcl);
                        return LIZLLL(this.LIZIZ.LIZLLL, c82687Wcl, 0);
                    }
                    throw new C162476Zf();
                }
                C82682Wcg c82682Wcg3 = this.LIZIZ;
                c82687Wcl.LIZ = i3 + i + c82682Wcg3.LJ + this.LJI;
                int i9 = ((i4 + i4) + i2) / 2;
                c82687Wcl.LIZIZ = (i9 - (this.LJIIIIZZ / 2)) + c82682Wcg3.LJFF;
                LIZLLL(whl, c82687Wcl, 0);
                int i10 = c82687Wcl.LIZ;
                C82682Wcg c82682Wcg4 = this.LIZIZ;
                c82687Wcl.LIZJ = i10 + c82682Wcg4.LJ;
                c82687Wcl.LIZLLL = i9 + c82682Wcg4.LJI;
                LIZJ(whl, c82687Wcl);
                return LIZLLL(whl, c82687Wcl, 1);
            }
            int i11 = i3 - this.LJII;
            C82682Wcg c82682Wcg5 = this.LIZIZ;
            c82687Wcl.LIZ = (i11 + c82682Wcg5.LJ) - this.LJI;
            int i12 = ((i4 + i4) + i2) / 2;
            c82687Wcl.LIZIZ = (i12 - (this.LJIIIIZZ / 2)) + c82682Wcg5.LJFF;
            LIZLLL(whl, c82687Wcl, 0);
            C82682Wcg c82682Wcg6 = this.LIZIZ;
            c82687Wcl.LIZJ = (i3 + c82682Wcg6.LJ) - this.LJI;
            c82687Wcl.LIZLLL = i12 + c82682Wcg6.LJI;
            LIZJ(whl, c82687Wcl);
            return LIZLLL(whl, c82687Wcl, 1);
        }
        int i13 = ((i3 + i3) + i) / 2;
        int i14 = i13 - (this.LJII / 2);
        C82682Wcg c82682Wcg7 = this.LIZIZ;
        c82687Wcl.LIZ = i14 + c82682Wcg7.LJ;
        c82687Wcl.LIZIZ = ((i4 - this.LJIIIIZZ) + c82682Wcg7.LJFF) - this.LJI;
        LIZLLL(whl, c82687Wcl, 1);
        C82682Wcg c82682Wcg8 = this.LIZIZ;
        c82687Wcl.LIZJ = i13 + c82682Wcg8.LJI;
        c82687Wcl.LIZLLL = (i4 + c82682Wcg8.LJFF) - this.LJI;
        LIZJ(whl, c82687Wcl);
        return LIZLLL(whl, c82687Wcl, 0);
    }
}
