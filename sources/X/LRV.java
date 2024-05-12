package X;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.InboxBubbleInTabCorner;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LRV extends LR8 {
    public final Activity LIZJ;
    public final int[] LIZLLL;
    public final C62822Ol8 LJ;
    public final Integer[] LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public ViewGroup LJIIIIZZ;
    public LinearLayout LJIIIZ;
    public ImageView LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public final int LJIILIIL;
    public final StringBuilder LJIILJJIL;
    public final StringBuilder LJIILL;
    public AnimatorSet LJIILLIIL;
    public final ArrayList<PopupWindow.OnDismissListener> LJIIZILJ;
    public final View LJIJ;
    public final View LJIJI;
    public final C62822Ol8 LJIJJ;

    @Override // X.LR8
    public final void LIZ() {
        Activity activity;
        if (this.LJIILLIIL != null && (activity = this.LIZJ) != null && !activity.isFinishing() && isShowing()) {
            ViewGroup viewGroup = this.LJIIIIZZ;
            if (viewGroup != null) {
                viewGroup.clearAnimation();
                AnimatorSet animatorSet = this.LJIILLIIL;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                try {
                    dismiss();
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    C36922EeM.LJFF(e);
                    return;
                }
            }
            o.LJIJI("mRootView");
            throw null;
        }
    }

    public final void LIZJ() {
        boolean z;
        String LJJIIJ;
        if ((((Number) C52744Kmy.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LinearLayout linearLayout = this.LJIIIZ;
            if (linearLayout != null) {
                C26338AVi.LJIIIZ(linearLayout, C1FJ.LIZIZ(8), AnonymousClass391.LIZJ(10), C1FJ.LIZIZ(8), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))), 16);
            } else {
                o.LJIJI("mContent");
                throw null;
            }
        }
        Iterator it = ((List) this.LJ.getValue()).iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i + 1;
            int intValue = ((Number) it.next()).intValue();
            if (i2 >= this.LJIILIIL) {
                StringBuilder LJ = C7MY.LJ("bindData break iconSize = ", i2, ", maxSize = ");
                LJ.append(this.LJIILIIL);
                C221018lt.LJFF("MusNewNotificationCountView", X1D.LIZIZ(LJ));
                return;
            }
            if (this.LIZLLL[i] > 0) {
                TuxTextView tuxTextView = (TuxTextView) getContentView().findViewById(this.LJFF[i2].intValue());
                Integer num = (Integer) ((java.util.Map) this.LJI.getValue()).get(Integer.valueOf(intValue));
                if (num != null) {
                    int intValue2 = num.intValue();
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = intValue2;
                    c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                    c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    SY9 LIZ = c2068389v.LIZ(this.LIZJ);
                    if (C90193gN.LIZ()) {
                        if (tuxTextView != null) {
                            tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, LIZ, (Drawable) null);
                        }
                    } else if (tuxTextView != null) {
                        tuxTextView.setCompoundDrawablesWithIntrinsicBounds(LIZ, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
                C62822Ol8 c62822Ol8 = C52744Kmy.LIZ;
                if ((((Number) c62822Ol8.getValue()).intValue() & 2) == 2 && tuxTextView != null) {
                    C26338AVi.LJI(tuxTextView, AnonymousClass391.LIZJ(4), AnonymousClass391.LIZJ(0), AnonymousClass391.LIZJ(4), AnonymousClass391.LIZJ(0), false, 16);
                    tuxTextView.setTuxFont(52);
                    tuxTextView.setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
                }
                int i4 = this.LIZLLL[i];
                if (i4 <= 0) {
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(8);
                    }
                } else if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                    if ((((Number) c62822Ol8.getValue()).intValue() & 1) == 1) {
                        long j = i4;
                        if (j < 0) {
                            LJJIIJ = String.valueOf(0);
                        } else if (j < 10000) {
                            LJJIIJ = String.valueOf(j);
                        } else if (j < 1000000) {
                            LJJIIJ = C77123UOp.LJJIZ("K", "1000", j, true, 1000L, "1M");
                        } else if (j < 1000000000) {
                            LJJIIJ = C77123UOp.LJJIZ("M", "1000", j, true, 1000000L, "1B");
                        } else {
                            LJJIIJ = C77123UOp.LJJIL(j, 1000000000L, "B", true);
                        }
                    } else {
                        LJJIIJ = C77123UOp.LJJIIJ(i4);
                    }
                    tuxTextView.setText(LJJIIJ);
                }
                if (intValue == 99) {
                    this.LJIIJJI = this.LIZLLL[i];
                }
                i2++;
            }
            i = i3;
        }
    }

    public static boolean LJFF() {
        if (C40471FuV.LIZ() && C53297Kvt.LIZ()) {
            return true;
        }
        return false;
    }

    public LRV(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj);
        this.LIZJ = activityC45651qj;
        int[] iArr = new int[8];
        int i = 0;
        do {
            iArr[i] = 0;
            i++;
        } while (i < 8);
        this.LIZLLL = iArr;
        this.LJ = C221108m2.LIZIZ(C123044sG.LJLIL);
        this.LJFF = new Integer[]{Integer.valueOf(R.id.gq1), Integer.valueOf(R.id.gq2), Integer.valueOf(R.id.gq3), Integer.valueOf(R.id.gq4), Integer.valueOf(R.id.gq5), Integer.valueOf(R.id.gq6), Integer.valueOf(R.id.gq7), Integer.valueOf(R.id.gq8)};
        this.LJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1158));
        this.LJII = C221108m2.LIZIZ(C227828ws.LJLIL);
        this.LJIIL = true;
        InboxBubbleInTabCorner inboxBubbleInTabCorner = (InboxBubbleInTabCorner) LRA.LIZIZ.getValue();
        this.LJIILIIL = Math.min(inboxBubbleInTabCorner != null ? inboxBubbleInTabCorner.maxBubbleTypes : 7, ((Number) C52742Kmw.LIZ.getValue()).intValue());
        this.LJIILJJIL = new StringBuilder();
        this.LJIILL = new StringBuilder();
        this.LJIIZILJ = new ArrayList<>();
        this.LJIJJ = C221108m2.LIZIZ(C54191LOp.LJLIL);
        View LIZLLL = C16970lZ.LIZLLL(this.LIZJ, R.layout.tr);
        o.LJIIIIZZ(LIZLLL, "inflate(context, R.layou…new_popview_notification)");
        this.LJIJ = LIZLLL;
        View LIZLLL2 = C16970lZ.LIZLLL(this.LIZJ, R.layout.ts);
        o.LJIIIIZZ(LIZLLL2, "inflate(context, R.layou…opview_notification_side)");
        this.LJIJI = LIZLLL2;
        super.setOnDismissListener(new LRW(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
    
        if (((java.lang.Boolean) r1).booleanValue() == false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v40, types: [T, android.animation.ValueAnimator] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, android.animation.ValueAnimator] */
    @Override // X.LR8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(android.view.View r26) {
        /*
            Method dump skipped, instructions count: 1692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LRV.LIZIZ(android.view.View):boolean");
    }

    public final void LIZLLL(View view) {
        ImageView imageView;
        C16880lQ.LJIIJ(this.LIZIZ, view);
        View findViewById = view.findViewById(R.id.gq0);
        o.LJIIIIZZ(findViewById, "contentView.findViewById…opview_notification_root)");
        this.LJIIIIZZ = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.gpx);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById…iew_notification_content)");
        this.LJIIIZ = (LinearLayout) findViewById2;
        if ((((Number) C52744Kmy.LIZ.getValue()).intValue() & 2) == 2) {
            View findViewById3 = view.findViewById(R.id.gpz);
            o.LJIIIIZZ(findViewById3, "{\n            contentVie…n_iv_arrow_new)\n        }");
            imageView = (ImageView) findViewById3;
        } else {
            View findViewById4 = view.findViewById(R.id.gpy);
            o.LJIIIIZZ(findViewById4, "{\n            contentVie…ation_iv_arrow)\n        }");
            imageView = (ImageView) findViewById4;
        }
        this.LJIIJ = imageView;
        imageView.setVisibility(0);
    }

    public final void LJ(View view) {
        setContentView(view);
        setBackgroundDrawable(new ColorDrawable(C04330Ez.LIZIZ(this.LIZJ, R.color.cz)));
        setOutsideTouchable(false);
        setWidth(-2);
        setHeight(-2);
        update();
    }

    @Override // android.widget.PopupWindow
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            this.LJIIZILJ.add(onDismissListener);
        }
    }

    public final void LJI(int i, int i2, View view) {
        boolean z;
        boolean z2;
        int i3;
        int i4;
        float f;
        int LIZJ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        if (i2 >= KL2.LJIIIZ(this.LIZJ) / 2) {
            z = true;
        } else {
            z = false;
        }
        if (i >= KL2.LJIIJJI(this.LIZJ) / 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("anchorView x = ");
        LIZ.append(view.getX());
        LIZ.append(",y = ");
        LIZ.append(view.getY());
        LIZ.append(", anchorView = ");
        LIZ.append(view);
        C221018lt.LJFF("MusNewNotificationCountView", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("showAtLocation x = ");
        LIZ2.append(i);
        LIZ2.append(",y = ");
        LIZ2.append(i2);
        LIZ2.append(", isTopToAnchor = ");
        LIZ2.append(z);
        LIZ2.append(", isHorizontalEnd = ");
        HH1.LIZIZ(LIZ2, z2, LIZ2, "MusNewNotificationCountView");
        LinearLayout linearLayout = this.LJIIIZ;
        if (linearLayout != null) {
            linearLayout.measure(0, 0);
            ImageView imageView = this.LJIIJ;
            if (imageView != null) {
                if (this.LJIIIZ != null) {
                    C26338AVi.LJI(imageView, null, Integer.valueOf((int) (r3.getMeasuredHeight() - 0.2f)), null, null, false, 29);
                    int height = view.getHeight();
                    if (z) {
                        i3 = i2 - height;
                    } else {
                        i3 = i2 + height;
                    }
                    C16880lQ.LLLII(this, view, i, i3);
                    ViewGroup viewGroup = this.LJIIIIZZ;
                    if (viewGroup != null) {
                        viewGroup.measure(0, 0);
                        ViewGroup viewGroup2 = this.LJIIIIZZ;
                        if (viewGroup2 != null) {
                            int measuredWidth = viewGroup2.getMeasuredWidth();
                            ViewGroup viewGroup3 = this.LJIIIIZZ;
                            if (viewGroup3 != null) {
                                int measuredHeight = viewGroup3.getMeasuredHeight();
                                int LJIIJJI = KL2.LJIIJJI(this.LIZJ);
                                ImageView imageView2 = this.LJIIJ;
                                if (imageView2 != null) {
                                    int measuredWidth2 = imageView2.getMeasuredWidth();
                                    int measuredWidth3 = view.getMeasuredWidth();
                                    int measuredHeight2 = view.getMeasuredHeight();
                                    int[] iArr = new int[2];
                                    view.getLocationInWindow(iArr);
                                    float f2 = measuredWidth;
                                    float f3 = f2 / 2.0f;
                                    float f4 = measuredWidth3 / 2.0f;
                                    float f5 = iArr[0] + f4;
                                    float LIZJ2 = KL2.LIZJ(this.LIZJ, 6.0f);
                                    if ((((Number) C52744Kmy.LIZ.getValue()).intValue() & 4) == 4) {
                                        i4 = 0;
                                    } else {
                                        i4 = 10;
                                    }
                                    if (z2) {
                                        float f6 = LJIIJJI - LIZJ2;
                                        if ((measuredWidth / 2) + f5 >= f6) {
                                            f3 = f2 - (f6 - f5);
                                        }
                                    } else if (f5 - (measuredWidth / 2) <= LIZJ2) {
                                        f3 = f5 - LIZJ2;
                                    }
                                    if (measuredWidth > LJIIJJI) {
                                        f3 = iArr[0] + f4;
                                        this.LJIIL = false;
                                    }
                                    if (z) {
                                        f = measuredHeight;
                                    } else {
                                        f = 0.0f;
                                    }
                                    ImageView imageView3 = this.LJIIJ;
                                    if (imageView3 != null) {
                                        ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
                                        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                            if (C90193gN.LIZ()) {
                                                marginLayoutParams3.rightMargin = (int) ((f2 - f3) - (measuredWidth2 / 2));
                                            } else {
                                                marginLayoutParams3.leftMargin = (int) (f3 - (measuredWidth2 / 2.0f));
                                            }
                                        }
                                        if (!z) {
                                            ImageView imageView4 = this.LJIIJ;
                                            if (imageView4 != null) {
                                                imageView4.setRotation(180.0f);
                                                ImageView imageView5 = this.LJIIJ;
                                                if (imageView5 != null) {
                                                    ViewGroup.LayoutParams layoutParams2 = imageView5.getLayoutParams();
                                                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                                                        marginLayoutParams2.topMargin = 0;
                                                    }
                                                    LinearLayout linearLayout2 = this.LJIIIZ;
                                                    if (linearLayout2 != null) {
                                                        ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
                                                        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                                                            Activity activity = this.LIZJ;
                                                            if (this.LJIIJ != null) {
                                                                marginLayoutParams.topMargin = (int) KL2.LIZJ(activity, r0.getMeasuredHeight() - 0.2f);
                                                            } else {
                                                                o.LJIJI("mIvArrow");
                                                                throw null;
                                                            }
                                                        }
                                                    } else {
                                                        o.LJIJI("mContent");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("mIvArrow");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("mIvArrow");
                                                throw null;
                                            }
                                        }
                                        int LIZJ3 = (int) KL2.LIZJ(this.LIZJ, 0.0f);
                                        if (z) {
                                            LIZJ = ((iArr[1] - measuredHeight) - LIZJ3) - i4;
                                        } else {
                                            LIZJ = ((iArr[1] + measuredHeight2) + LIZJ3) - ((int) KL2.LIZJ(this.LIZJ, 15.0f));
                                        }
                                        update((int) (f5 - f3), LIZJ, measuredWidth, measuredHeight + i4);
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("pivotX = ");
                                        LIZ3.append(f3);
                                        LIZ3.append(", pivotY = ");
                                        LIZ3.append(f);
                                        C221018lt.LJFF("MusNewNotificationCountView", X1D.LIZIZ(LIZ3));
                                        ViewGroup viewGroup4 = this.LJIIIIZZ;
                                        if (viewGroup4 != null) {
                                            viewGroup4.setPivotX(f3);
                                            ViewGroup viewGroup5 = this.LJIIIIZZ;
                                            if (viewGroup5 != null) {
                                                viewGroup5.setPivotY(f);
                                                return;
                                            } else {
                                                o.LJIJI("mRootView");
                                                throw null;
                                            }
                                        }
                                        o.LJIJI("mRootView");
                                        throw null;
                                    }
                                    o.LJIJI("mIvArrow");
                                    throw null;
                                }
                                o.LJIJI("mIvArrow");
                                throw null;
                            }
                            o.LJIJI("mRootView");
                            throw null;
                        }
                        o.LJIJI("mRootView");
                        throw null;
                    }
                    o.LJIJI("mRootView");
                    throw null;
                }
                o.LJIJI("mContent");
                throw null;
            }
            o.LJIJI("mIvArrow");
            throw null;
        }
        o.LJIJI("mContent");
        throw null;
    }
}
