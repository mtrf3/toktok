package X;

import Y.ACListenerS29S0100000_9;
import Y.AUListenerS90S0100000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LM3 implements LMW {
    public final FrameLayout LIZ;
    public boolean LJ;
    public LM4 LJFF;
    public LM4 LJI;
    public List<? extends LM4> LJII;
    public LMX LJIIIIZZ;
    public View LJIIIZ;
    public ViewGroup LJIIJ;
    public ViewGroup LJIIJJI;
    public final int LIZIZ = C7MY.LIZIZ(56);
    public final int LIZJ = C7MY.LIZIZ(48);
    public final int LIZLLL = C7MY.LIZIZ(8);
    public final C8RO LJIIL = new C8RO("toolbar");
    public ArrayList<String> LJIILIIL = new ArrayList<>();
    public ArrayList<String> LJIILJJIL = new ArrayList<>();

    @Override // X.LMW
    public final boolean LLLIIIL() {
        View findViewById;
        ViewGroup LJI = LJI("USER");
        if (LJI == null || (findViewById = LJI.findViewById(R.id.e6l)) == null || findViewById.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.LMW
    public final void LIZJ() {
        if (C40471FuV.LIZ()) {
            LJIIL(this.LJII);
        } else {
            LJIIJJI(this.LJFF);
        }
    }

    @Override // X.LMW
    public final View LJFF() {
        if (C40471FuV.LIZ()) {
            return this.LJIIJJI;
        }
        return this.LJIIIZ;
    }

    @Override // X.LMW
    public final List<String> LIZLLL() {
        return this.LJIILJJIL;
    }

    @Override // X.LMW
    public final List<String> LJIIIZ() {
        return this.LJIILIIL;
    }

    public LM3(FrameLayout frameLayout) {
        this.LIZ = frameLayout;
    }

    @Override // X.LMW
    public final void A6(LL4 ll4) {
        if (C40471FuV.LIZ()) {
            if (ll4 != null) {
                LJIIL(C47261Igj.LJJIJIL(ll4));
                return;
            }
            return;
        }
        LJIIJJI(ll4);
    }

    @Override // X.LMW
    public final void LIZ(LM4 lm4) {
        if (this.LJ) {
            return;
        }
        this.LJFF = LJIIJJI(lm4);
    }

    @Override // X.LMW
    public final void LJ(List<? extends LM4> list) {
        this.LJII = list;
        LJIIL(list);
    }

    @Override // X.LMW
    public final ViewGroup LJI(String str) {
        Object obj;
        Object obj2;
        View view;
        View childAt;
        View childAt2;
        for (ViewGroup viewGroup : C47261Igj.LJJIJIIJI(this.LJIIJ, this.LJIIJJI)) {
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("getIconRootViewByTag: ");
                    if (viewGroup != null && (childAt2 = viewGroup.getChildAt(i)) != null) {
                        obj = childAt2.getTag();
                    } else {
                        obj = null;
                    }
                    LIZ.append(obj);
                    LIZ.append(", ");
                    LIZ.append(str);
                    LIZ.append(' ');
                    X1D.LIZIZ(LIZ);
                    if (viewGroup != null && (childAt = viewGroup.getChildAt(i)) != null) {
                        obj2 = childAt.getTag();
                    } else {
                        obj2 = null;
                    }
                    if (o.LJ(obj2, str)) {
                        if (viewGroup != null) {
                            view = viewGroup.getChildAt(i);
                        } else {
                            view = null;
                        }
                        if (!(view instanceof ViewGroup)) {
                            return null;
                        }
                        return (ViewGroup) view;
                    }
                }
            }
        }
        return null;
    }

    @Override // X.LMW
    public final void LJII(LM4 lm4) {
        View LJII;
        if (lm4 == null || (LJII = lm4.LJII()) == null) {
            return;
        }
        DTA.LJLIL.LJLIL(LJII);
        lm4.LJIIJ();
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(lm4, 163), LJII);
        if (LJII.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = LJII.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = lm4.LIZIZ();
            LJII.setLayoutParams(layoutParams2);
        }
        this.LIZ.addView(LJII);
        ArrayList<String> arrayList = this.LJIILJJIL;
        String tag = lm4.getTag();
        if (tag == null) {
            tag = "";
        }
        arrayList.add(tag);
    }

    @Override // X.LMW
    public final void LJIIIIZZ(List<? extends LM4> list) {
        if (this.LJIIJ == null) {
            LinearLayout linearLayout = new LinearLayout(this.LIZ.getContext());
            linearLayout.setOrientation(0);
            this.LJIIJ = linearLayout;
        }
        LJIIJ(list, this.LJIIJ, 8388611);
    }

    public final LM4 LJIIJJI(LM4 lm4) {
        View LJII;
        if (lm4 == this.LJI) {
            return lm4;
        }
        if (lm4 == null || !lm4.enabled() || (LJII = lm4.LJII()) == null) {
            return null;
        }
        DTE.LJLIL.LJLIL(LJII);
        this.LJ = true;
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(lm4, 164), LJII);
        if (LJII.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = LJII.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = lm4.LIZIZ();
            LJII.setLayoutParams(layoutParams2);
        }
        View view = this.LJIIIZ;
        if (view != null) {
            C16880lQ.LJLLLL(view, this.LIZ);
        }
        if (LJII.getParent() != null) {
            ViewParent parent = LJII.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(LJII, (ViewGroup) parent);
        }
        this.LIZ.addView(LJII);
        this.LJIIIZ = LJII;
        this.LJI = lm4;
        ArrayList<String> arrayList = this.LJIILIIL;
        String tag = lm4.getTag();
        if (tag == null) {
            tag = "";
        }
        arrayList.add(tag);
        return lm4;
    }

    public final void LJIIL(List<? extends LM4> list) {
        if (this.LJIIJJI == null) {
            LinearLayout linearLayout = new LinearLayout(this.LIZ.getContext());
            linearLayout.setOrientation(0);
            this.LJIIJJI = linearLayout;
        }
        LJIIJ(list, this.LJIIJJI, 8388613);
    }

    public final void LJIILIIL(LMX movingReminderManager) {
        o.LJIIIZ(movingReminderManager, "movingReminderManager");
        this.LJIIIIZZ = movingReminderManager;
    }

    @Override // X.LMW
    public final void LLIZ(String tag) {
        View findViewById;
        o.LJIIIZ(tag, "tag");
        ViewGroup LJI = LJI(tag);
        if (LJI == null || (findViewById = LJI.findViewById(R.id.e6k)) == null) {
            return;
        }
        findViewById.setVisibility(4);
    }

    @Override // X.LMW
    public final void LLJ(String tag) {
        View findViewById;
        o.LJIIIZ(tag, "tag");
        ViewGroup LJI = LJI(tag);
        if (LJI == null || (findViewById = LJI.findViewById(R.id.e6l)) == null) {
            return;
        }
        findViewById.setVisibility(4);
    }

    @Override // X.LMW
    public final void LLZLLIL(String tag) {
        View view;
        o.LJIIIZ(tag, "tag");
        ViewGroup LJI = LJI(tag);
        if (LJI == null || (view = LJI.findViewById(R.id.e6l)) == null) {
            view = new View(this.LIZ.getContext());
            view.setId(R.id.e6l);
            view.setBackgroundResource(R.drawable.avc);
            view.setVisibility(4);
            int i = this.LIZLLL;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 17;
            if (o.LJ(tag, LMF.MY_PROFILE.getTag())) {
                layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(-12)));
                layoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(-8));
            } else {
                layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(-9)));
                layoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(-9));
            }
            view.setLayoutParams(layoutParams);
            if (LJI != null) {
                LJI.addView(view);
            }
        }
        view.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, T, android.view.View] */
    @Override // X.LMW
    public final void LIZIZ(int i, String tag, boolean z) {
        T t;
        String valueOf;
        int i2;
        View findViewById;
        o.LJIIIZ(tag, "tag");
        ViewGroup LJI = LJI(tag);
        C68322mC c68322mC = new C68322mC();
        if (LJI != 0) {
            t = LJI.findViewById(R.id.e6k);
        } else {
            t = 0;
        }
        c68322mC.element = t;
        boolean z2 = true;
        if (t == 0) {
            Context context = this.LIZ.getContext();
            o.LJIIIIZZ(context, "mRlTabContainer.context");
            ?? tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setId(R.id.e6k);
            tuxTextView.setBackgroundResource(R.drawable.avd);
            tuxTextView.setGravity(17);
            tuxTextView.setMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)));
            tuxTextView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(5)), 0);
            tuxTextView.setTextColorRes(R.attr.dj);
            tuxTextView.setVisibility(4);
            tuxTextView.setTuxFont(71);
            tuxTextView.setLines(1);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)));
            if (o.LJ(tag, LMF.INBOX.getTag())) {
                layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(-11)));
            } else {
                layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(-10)));
            }
            layoutParams.topMargin = C7MY.LIZIZ(-8);
            layoutParams.gravity = 17;
            tuxTextView.setLayoutParams(layoutParams);
            c68322mC.element = tuxTextView;
            if (LJI != 0) {
                LJI.addView(tuxTextView);
            }
        }
        if (i <= 0) {
            if (LJI == 0 || (findViewById = LJI.findViewById(R.id.e6k)) == null) {
                return;
            }
            findViewById.setVisibility(4);
            return;
        }
        if (o.LJ(tag, LMF.MY_PROFILE.getTag())) {
            if (i > 9) {
                if (C90193gN.LIZ()) {
                    valueOf = "+9";
                } else {
                    valueOf = "9+";
                }
            } else {
                valueOf = String.valueOf(i);
            }
        } else if (i > 99) {
            if (C90193gN.LIZ()) {
                valueOf = "+99";
            } else {
                valueOf = "99+";
            }
        } else {
            valueOf = String.valueOf(i);
        }
        int length = valueOf.length();
        if (length >= 3) {
            TuxTextView tuxTextView2 = (TuxTextView) c68322mC.element;
            tuxTextView2.setTuxFont(81);
            tuxTextView2.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(3)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 0);
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) c68322mC.element;
            tuxTextView3.setTuxFont(71);
            if (length <= 1) {
                i2 = 4;
            } else {
                i2 = 5;
            }
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(i2));
            tuxTextView3.setPadding(LJJIIZ, 0, LJJIIZ, 0);
        }
        if (!z || ((View) c68322mC.element).getVisibility() == 0) {
            z2 = false;
        }
        ((TextView) c68322mC.element).setText(valueOf);
        ((View) c68322mC.element).setVisibility(0);
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(C55953Lxd.LJII());
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new AUListenerS90S0100000_1(c68322mC, 81));
            ofFloat.start();
        }
        View view = (View) c68322mC.element;
        if (view != null) {
            view.getWidth();
        }
    }

    public final void LJIIJ(List<? extends LM4> list, ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2;
        ViewGroup.LayoutParams layoutParams;
        View LJII;
        ViewGroup viewGroup3;
        if (list == null || viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        ArrayList<String> arrayList = new ArrayList<>();
        int i2 = 0;
        for (LM4 lm4 : list) {
            if (lm4 != null && lm4.enabled() && (LJII = lm4.LJII()) != null) {
                C16880lQ.LJIIJ(new ACListenerS29S0100000_9(lm4, 161), LJII);
                if (LJII.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                    ViewGroup.LayoutParams layoutParams2 = LJII.getLayoutParams();
                    o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                    layoutParams3.gravity = 17;
                    LJII.setLayoutParams(layoutParams3);
                }
                if (LJII.getParent() != null) {
                    ViewParent parent = LJII.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup3 = (ViewGroup) parent) != null) {
                        C16880lQ.LJLLL(LJII, viewGroup3);
                    }
                }
                FrameLayout frameLayout = new FrameLayout(this.LIZ.getContext());
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(this.LIZIZ, -1);
                layoutParams4.gravity = 16;
                frameLayout.setLayoutParams(layoutParams4);
                frameLayout.setTag(lm4.getTag());
                frameLayout.setClickable(true);
                C16880lQ.LJIILJJIL(frameLayout, new ACListenerS29S0100000_9(lm4, 162));
                frameLayout.addView(LJII);
                String tag = lm4.getTag();
                if (tag == null) {
                    tag = "";
                }
                arrayList.add(tag);
                viewGroup.addView(frameLayout);
                if (o.LJ(lm4.getTag(), LMF.MY_PROFILE.getTag()) || o.LJ(lm4.getTag(), LMF.INBOX.getTag())) {
                    lm4.onCreate();
                }
                if (lm4.LJIJ()) {
                    lm4.LJ(this.LJIIIIZZ, i);
                }
                i2++;
            }
        }
        this.LJIIL.LIZ(null, KMP.LJ("registerIcons, icon count:", i2));
        if (i == 8388613) {
            LEB.LJ = i2;
            Collections.reverse(arrayList);
            this.LJIILIIL = arrayList;
        } else {
            LEB.LIZLLL = i2;
            this.LJIILJJIL = arrayList;
        }
        int i3 = this.LIZIZ;
        if (i2 > 1) {
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt != null && (layoutParams = childAt.getLayoutParams()) != null) {
                    layoutParams.width = this.LIZJ;
                }
            }
            i3 = this.LIZJ * i2;
        }
        this.LJIIL.LIZ(null, C48263Iwt.LIZLLL("registerLeft, icon count:", i2, "，width ", i3));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(i3, -1);
        layoutParams5.gravity = i | 16;
        if (viewGroup.getParent() != null) {
            ViewParent parent2 = viewGroup.getParent();
            if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                C16880lQ.LJLLL(viewGroup, viewGroup2);
            }
        }
        viewGroup.setLayoutParams(layoutParams5);
        this.LIZ.addView(viewGroup);
    }
}
