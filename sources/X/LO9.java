package X;

import Y.ACListenerS29S0100000_9;
import Y.AUListenerS97S0100000_9;
import Y.IDAListenerS77S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.XTabAbility;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LO9 extends FrameLayout {
    public final TuxTextView LJLIL;
    public ValueAnimator LJLILLLLZI;
    public ValueAnimator LJLJI;
    public final FrameLayout LJLJJI;
    public final View LJLJJL;
    public final FrameLayout LJLJJLL;
    public int LJLJL;
    public final Integer LJLJLJ;
    public final Integer LJLJLLL;
    public int LJLL;
    public XTabAbility LJLLI;
    public TuxIconView LJLLILLLL;
    public InterfaceC88471Ynr<? super Integer, ? super View, C76800UCe> LJLLJ;
    public InterfaceC65784Pro<C76800UCe> LJLLL;
    public InterfaceC65784Pro<C76800UCe> LJLLLL;
    public final List<? extends TuxTextView> LJLLLLLL;
    public boolean LJLZ;
    public final int LJZ;
    public AnimatorSet LJZI;
    public AnimatorSet LJZL;
    public int LL;
    public Fragment LLD;
    public View LLF;

    public final void setFirstEnter(boolean z) {
    }

    private final FrameLayout getFragmentRootView() {
        View view;
        Fragment fragment = this.LLD;
        if (fragment != null) {
            view = fragment.getView();
        } else {
            view = null;
        }
        if (!(view instanceof FrameLayout)) {
            return null;
        }
        return (FrameLayout) view;
    }

    public final boolean LIZJ() {
        ValueAnimator valueAnimator = this.LJLILLLLZI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        ValueAnimator valueAnimator2 = this.LJLJI;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL() {
        FrameLayout frameLayout = this.LJLJJI;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final int getPanelHeight() {
        int LIZ;
        XTabAbility xTabAbility = this.LJLLI;
        if (xTabAbility != null) {
            LIZ = xTabAbility.F7();
        } else {
            LIZ = C34177DbB.LIZ();
        }
        if (LIZ <= 0) {
            return C34177DbB.LIZ();
        }
        return LIZ;
    }

    public final void LIZIZ() {
        AnimatorSet animatorSet;
        if (LIZJ() || this.LJLJL == 2) {
            return;
        }
        XTabAbility xTabAbility = this.LJLLI;
        if (xTabAbility != null) {
            animatorSet = xTabAbility.je();
        } else {
            animatorSet = null;
        }
        this.LJZL = animatorSet;
        if (animatorSet != null && this.LJLZ) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(this.LJZL).with(this.LJLJI);
            animatorSet2.setDuration(250L);
            animatorSet2.setInterpolator(new SJK());
            animatorSet2.start();
            return;
        }
        ValueAnimator valueAnimator = this.LJLJI;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.start();
    }

    public final boolean LJII() {
        if (LIZJ() || this.LJLJL == 1) {
            return false;
        }
        if (this.LJZI != null && this.LJLZ) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(this.LJZI).with(this.LJLILLLLZI);
            animatorSet.setDuration(250L);
            animatorSet.start();
        } else {
            ValueAnimator valueAnimator = this.LJLILLLLZI;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
        return true;
    }

    public final AnimatorSet getCloseAnimatorSet() {
        return this.LJZL;
    }

    public final InterfaceC65784Pro<C76800UCe> getClosePanelListener() {
        return this.LJLLL;
    }

    public final int getCurStatus() {
        return this.LJLJL;
    }

    public final Fragment getFragment() {
        return this.LLD;
    }

    public final boolean getHasMoveDown() {
        return this.LJLZ;
    }

    public final AnimatorSet getShowAnimatorSet() {
        return this.LJZI;
    }

    public final InterfaceC65784Pro<C76800UCe> getShowPanelListener() {
        return this.LJLLLL;
    }

    public final InterfaceC88471Ynr<Integer, View, C76800UCe> getSubTabClickListener() {
        return this.LJLLJ;
    }

    public final XTabAbility getTabAbility() {
        return this.LJLLI;
    }

    public final TuxIconView getTabIconView() {
        return this.LJLLILLLL;
    }

    public final int getTopTabPos() {
        return this.LL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LO9(ActivityC45651qj context) {
        super(context, null, 0);
        Integer num;
        Activity activity;
        View findViewById;
        View findViewById2;
        int height;
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        this.LJLJL = 2;
        this.LJLL = -1;
        ArrayList arrayList = new ArrayList();
        this.LJLLLLLL = arrayList;
        this.LJLZ = true;
        int LJJJJLI = C63081OpJ.LJJJJLI(context);
        this.LJZ = LJJJJLI;
        this.LL = -1;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.b08, this, true);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.kp);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS29S0100000_9(this, 204));
        List<? extends TuxTextView> LLIIJI = ORZ.LLIIJI(tuxTextView, arrayList);
        this.LJLLLLLL = LLIIJI;
        tuxTextView.setTuxFont(62);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.j1w);
        C16880lQ.LJJJJI(tuxTextView2, new ACListenerS29S0100000_9(this, 205));
        this.LJLLLLLL = ORZ.LLIIJI(tuxTextView2, LLIIJI);
        tuxTextView2.setTuxFont(62);
        this.LJLIL = tuxTextView2;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.dby);
        frameLayout.getLayoutParams().height = C34177DbB.LIZ();
        this.LJLJJI = frameLayout;
        this.LJLJJL = findViewById(R.id.au7);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.kyy);
        frameLayout2.getLayoutParams().height = LJJJJLI;
        this.LJLJJLL = frameLayout2;
        Resources resources = context.getResources();
        if (resources != null) {
            num = Integer.valueOf(resources.getColor(R.color.bg));
        } else {
            num = null;
        }
        this.LJLJLLL = num;
        Resources resources2 = context.getResources();
        this.LJLJLJ = resources2 != null ? Integer.valueOf(resources2.getColor(R.color.bc)) : null;
        Integer valueOf = Integer.valueOf(context.getResources().getColor(R.color.bg));
        this.LJLJLLL = valueOf;
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            tuxTextView2.setTextColor(intValue);
            tuxTextView.setTextColor(intValue);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJLILLLLZI = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(250L);
        }
        ValueAnimator valueAnimator = this.LJLILLLLZI;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new SJK());
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJLJI = ofFloat2;
        if (ofFloat2 != null) {
            ofFloat2.setDuration(250L);
        }
        ValueAnimator valueAnimator2 = this.LJLJI;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(new SJK());
        }
        ValueAnimator valueAnimator3 = this.LJLILLLLZI;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new AUListenerS97S0100000_9(this, 76));
        }
        ValueAnimator valueAnimator4 = this.LJLJI;
        if (valueAnimator4 != null) {
            valueAnimator4.addUpdateListener(new AUListenerS97S0100000_9(this, 77));
        }
        ValueAnimator valueAnimator5 = this.LJLILLLLZI;
        if (valueAnimator5 != null) {
            valueAnimator5.addListener(new IDAListenerS77S0100000_9(this, 38));
        }
        ValueAnimator valueAnimator6 = this.LJLJI;
        if (valueAnimator6 != null) {
            valueAnimator6.addListener(new IDAListenerS77S0100000_9(this, 39));
        }
        Context context2 = getContext();
        if ((context2 instanceof Activity) && (activity = (Activity) context2) != null && (findViewById = activity.findViewById(android.R.id.content)) != null && (findViewById2 = findViewById.findViewById(R.id.gc8)) != null && (height = findViewById2.getHeight()) > 0 && this.LLF == null) {
            View view = new View(getContext());
            view.setBackground(new ColorDrawable(view.getContext().getResources().getColor(R.color.b5)));
            this.LLF = view;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, height);
            layoutParams.gravity = 80;
            addView(this.LLF, layoutParams);
        }
    }

    public final void LJ(boolean z) {
        C8RO c8ro = MainTabStrip.LLD;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("moveDown:  isMoveDown:");
        LIZ.append(z);
        LIZ.append(' ');
        c8ro.LIZLLL(X1D.LIZIZ(LIZ));
        this.LJLZ = z;
    }

    public final void LJFF(float f) {
        FrameLayout fragmentRootView = getFragmentRootView();
        if (fragmentRootView != null && fragmentRootView.getChildCount() > 0) {
            int childCount = fragmentRootView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (!o.LJ(this, fragmentRootView.getChildAt(i))) {
                    fragmentRootView.getChildAt(i).setTranslationY(f);
                }
            }
        }
    }

    public final void LJI(int i) {
        LIZ((TuxTextView) ListProtector.get(this.LJLLLLLL, i), true);
        int i2 = 1 - i;
        LIZ((TuxTextView) ListProtector.get(this.LJLLLLLL, i2), false);
        TextView textView = (TextView) ListProtector.get(this.LJLLLLLL, i);
        Integer num = this.LJLJLJ;
        if (num != null) {
            textView.setTextColor(num.intValue());
            TextView textView2 = (TextView) ListProtector.get(this.LJLLLLLL, i2);
            Integer num2 = this.LJLJLLL;
            if (num2 != null) {
                textView2.setTextColor(num2.intValue());
            }
        }
    }

    public final void LJIIIIZZ(int i) {
        if (i < 0) {
            return;
        }
        if (this.LJLL != i) {
            LJI(i);
            this.LJLL = i;
        }
        InterfaceC88471Ynr<? super Integer, ? super View, C76800UCe> interfaceC88471Ynr = this.LJLLJ;
        if (interfaceC88471Ynr != null) {
            Integer valueOf = Integer.valueOf(i);
            TuxTextView tuxTextView = this.LJLIL;
            o.LJII(tuxTextView, "null cannot be cast to non-null type android.view.View");
            interfaceC88471Ynr.invoke(valueOf, tuxTextView);
        }
    }

    public final void LJIIIZ(List<C46420IJs> list) {
        if (list.size() < 2) {
            return;
        }
        int i = 0;
        do {
            ((TextView) ListProtector.get(this.LJLLLLLL, i)).setText(getContext().getResources().getText(((C46420IJs) ListProtector.get(list, i)).LJLIL));
            i++;
        } while (i < 2);
    }

    public final void setCloseAnimatorSet(AnimatorSet animatorSet) {
        this.LJZL = animatorSet;
    }

    public final void setClosePanelListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLLL = interfaceC65784Pro;
    }

    public final void setFragment(Fragment fragment) {
        this.LLD = fragment;
    }

    public final void setHasMoveDown(boolean z) {
        this.LJLZ = z;
    }

    public final void setShowAnimatorSet(AnimatorSet animatorSet) {
        this.LJZI = animatorSet;
    }

    public final void setShowPanelListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLLLL = interfaceC65784Pro;
    }

    public final void setSubTabClickListener(InterfaceC88471Ynr<? super Integer, ? super View, C76800UCe> interfaceC88471Ynr) {
        this.LJLLJ = interfaceC88471Ynr;
    }

    public final void setTabAbility(XTabAbility xTabAbility) {
        this.LJLLI = xTabAbility;
    }

    public final void setTabIconView(TuxIconView tuxIconView) {
        this.LJLLILLLL = tuxIconView;
    }

    public final void setTopTabPos(int i) {
        this.LL = i;
    }

    public static void LIZ(TuxTextView tuxTextView, boolean z) {
        if (tuxTextView != null) {
            if (z) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.d1);
                c110614Vt.LIZJ = C61328O5c.LIZJ(18);
                Context context = tuxTextView.getContext();
                o.LJIIIIZZ(context, "context");
                tuxTextView.setBackground(c110614Vt.LIZ(context));
                return;
            }
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZIZ = Integer.valueOf(R.attr.d2);
            c110614Vt2.LIZJ = C61328O5c.LIZJ(18);
            Context context2 = tuxTextView.getContext();
            o.LJIIIIZZ(context2, "context");
            tuxTextView.setBackground(c110614Vt2.LIZ(context2));
        }
    }

    public final void LJIIJ(float f, boolean z) {
        FrameLayout frameLayout = this.LJLJJI;
        if (frameLayout != null) {
            int height = frameLayout.getHeight();
            if (this.LJLZ) {
                LJFF(getPanelHeight() * f);
            }
            TuxIconView tuxIconView = this.LJLLILLLL;
            if (tuxIconView != null) {
                tuxIconView.setRotation((-180) * f);
            }
            float f2 = height;
            float f3 = (f - 1.0f) * f2;
            FrameLayout frameLayout2 = this.LJLJJI;
            if (frameLayout2 != null) {
                frameLayout2.setTranslationY(f3);
            }
            if (z && f2 - Math.abs(f3) > this.LJZ) {
                FrameLayout frameLayout3 = this.LJLJJLL;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(0);
                }
                View view = this.LJLJJL;
                if (view == null) {
                    return;
                }
                view.setVisibility(0);
                return;
            }
            if (f2 - Math.abs(f3) >= this.LJZ) {
                return;
            }
            FrameLayout frameLayout4 = this.LJLJJLL;
            if (frameLayout4 != null) {
                frameLayout4.setVisibility(8);
            }
            View view2 = this.LJLJJL;
            if (view2 == null) {
                return;
            }
            view2.setVisibility(8);
        }
    }
}
