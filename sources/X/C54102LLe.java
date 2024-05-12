package X;

import Y.ACListenerS35S0300000_9;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LLe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54102LLe extends C54105LLh {
    public View LJII;

    @Override // X.C54105LLh
    public final int LJJJIL() {
        return AnonymousClass636.LJIIIIZZ(R.attr.ca, this.LIZLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54102LLe(C54134LMk mainBottomTabView) {
        super(mainBottomTabView);
        o.LJIIIZ(mainBottomTabView, "mainBottomTabView");
    }

    @Override // X.C54105LLh, X.LLQ
    public final void LIZJ(ActivityC45651qj activityC45651qj) {
        super.LIZJ(activityC45651qj);
        LIZLLL(true);
    }

    @Override // X.C54105LLh, X.LLQ
    public final void LIZLLL(boolean z) {
        int i;
        super.LIZLLL(z);
        if (z) {
            i = R.color.yi;
        } else {
            i = R.color.bx;
        }
        View view = this.LJII;
        if (view != null) {
            view.setBackgroundColor(C04330Ez.LIZIZ(this.LIZLLL, i));
        }
    }

    @Override // X.C54105LLh, X.LLQ
    public final void LJJJ(List<? extends InterfaceC54080LKi> tabList) {
        C54113LLp c54113LLp;
        AbstractC54111LLn c54115LLr;
        o.LJIIIZ(tabList, "tabList");
        LFH lfh = LFH.LIZIZ;
        lfh.LIZLLL().LJIIZILJ();
        int LIZIZ = C7MY.LIZIZ(60);
        C54134LMk c54134LMk = this.LIZJ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LIZIZ, -1);
        layoutParams.gravity = 8388611;
        c54134LMk.setLayoutParams(layoutParams);
        this.LIZJ.setOrientation(0);
        if (this.LIZJ.getChildCount() > 0) {
            this.LIZJ.removeAllViews();
        }
        LinearLayout linearLayout = new LinearLayout(this.LIZJ.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
        layoutParams2.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setOrientation(1);
        lfh.LIZLLL().LJIIZILJ();
        LEZ.LJFF();
        linearLayout.setPadding(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(45)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(34)));
        FrameLayout frameLayout = new FrameLayout(this.LIZJ.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams3);
        View view = new View(this.LIZJ.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(AnonymousClass391.LIZ(0.5d), -1);
        layoutParams4.gravity = 8388613;
        view.setLayoutParams(layoutParams4);
        this.LJII = view;
        C54113LLp c54113LLp2 = null;
        int i = 0;
        for (InterfaceC54080LKi interfaceC54080LKi : tabList) {
            int i2 = i + 1;
            View LJFF = interfaceC54080LKi.LJFF(C54101LLd.LIZ);
            if (!(LJFF instanceof C54113LLp) || (c54113LLp = (C54113LLp) LJFF) == null) {
                i = i2;
            } else {
                if (o.LJ(interfaceC54080LKi.tag(), "PUBLISH")) {
                    c54115LLr = new C54104LLg(c54113LLp);
                    c54113LLp2 = c54113LLp;
                } else {
                    c54115LLr = new C54115LLr(c54113LLp);
                }
                this.LJFF.put(interfaceC54080LKi.tag(), c54115LLr);
                LH3 lh32 = HomeTabViewModel.LJLJLLL;
                Context context = this.LIZLLL;
                o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                HomeTabViewModel LIZ = lh32.LIZ((ActivityC45651qj) context);
                String tabName = interfaceC54080LKi.tag();
                LIZ.getClass();
                o.LJIIIZ(tabName, "tabName");
                LIZ.LJLILLLLZI.put(tabName, interfaceC54080LKi);
                Context context2 = this.LIZLLL;
                o.LJII(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                c54113LLp.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0300000_9(this, interfaceC54080LKi, C84193Sd.LIZ((ActivityC45651qj) context2), 8)));
                C54105LLh.LJJJJI(c54113LLp, i, interfaceC54080LKi.tag());
                if (o.LJ(interfaceC54080LKi.tag(), "PUBLISH")) {
                    LFH.LIZIZ.LIZLLL().LJIIZILJ();
                    LEZ.LJFF();
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams5.gravity = 80;
                    c54113LLp.setLayoutParams(layoutParams5);
                } else {
                    if (C54103LLf.LIZ < 0) {
                        int LIZ2 = C00F.LIZ(31744, 0, "bottom_tab_animation_optimization", true);
                        C54103LLf.LIZ = LIZ2;
                        if (LIZ2 < 0) {
                            C54103LLf.LIZ = 0;
                        }
                    }
                    int i3 = C54103LLf.LIZ;
                    if (i3 != 1) {
                        if (i3 < 0) {
                            int LIZ3 = C00F.LIZ(31744, 0, "bottom_tab_animation_optimization", true);
                            C54103LLf.LIZ = LIZ3;
                            if (LIZ3 < 0) {
                                C54103LLf.LIZ = 0;
                            }
                        }
                        if (C54103LLf.LIZ != 2) {
                            try {
                                Drawable LIZIZ2 = C04270Et.LIZIZ(this.LIZJ.getContext(), R.drawable.ava);
                                if (LIZIZ2 != null) {
                                    c54113LLp.setBackground(LIZIZ2);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams6.topMargin = C7MY.LIZIZ(9);
                    layoutParams6.bottomMargin = C7MY.LIZIZ(9);
                    c54113LLp.setLayoutParams(layoutParams6);
                    linearLayout.addView(c54113LLp);
                }
                i = i2;
            }
        }
        if (c54113LLp2 != null) {
            LFH.LIZIZ.LIZLLL().LJIIZILJ();
            LEZ.LJFF();
            frameLayout.addView(c54113LLp2);
        }
        linearLayout.addView(frameLayout);
        C54134LMk c54134LMk2 = this.LIZJ;
        c54134LMk2.addView(linearLayout);
        c54134LMk2.addView(this.LJII);
        LFQ.LIZ(LLZ.LJLIL);
    }

    @Override // X.C54105LLh, X.LLQ
    public final void LJJIJ(boolean z, boolean z2) {
        float f;
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.LIZJ.setAlpha(1.0f);
        View childAt = this.LIZJ.getChildAt(0);
        if (childAt != null) {
            if (z2) {
                float alpha = childAt.getAlpha();
                if (!z) {
                    f2 = 1.0f;
                }
                C178596zf.LIZ(alpha, f2, childAt);
                return;
            }
            childAt.setAlpha(f);
        }
    }
}
