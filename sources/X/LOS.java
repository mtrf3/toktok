package X;

import Y.ARunnableS45S0100000_9;
import Y.AUListenerS97S0100000_9;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.SelectedTabBackToOriginAbility;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import o3.h0;

@C0C0
/* loaded from: classes10.dex */
public final class LOS extends HorizontalScrollView implements InterfaceC54184LOi {
    public static final C30901Je LLILII = new C30901Je();
    public static final C43051mX LLILIL = new C43051mX(16);
    public final ArrayList<LOP> LJLIL;
    public LOP LJLILLLLZI;
    public final LOU LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public final int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public final ArrayList<InterfaceC54179LOd> LJLLJ;
    public ValueAnimator LJLLL;
    public LOR LJLLLL;
    public boolean LJLLLLLL;
    public final float LJLZ;
    public final int LJZ;
    public LOO LJZI;
    public final C1UB LJZL;
    public int LL;
    public final boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public int LLFII;
    public InterfaceC88471Ynr<? super Integer, ? super Integer, C76800UCe> LLFZ;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LLI;
    public List<? extends TopTabProtocol> LLIFFJFJJ;
    public HomeTabAbility LLII;
    public int LLIIII;
    public SelectedTabBackToOriginAbility LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final int LLIIIL;
    public final int LLIIIZ;
    public java.util.Map<Integer, Integer> LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public final int LLIILII;
    public final C62822Ol8 LLIILZL;
    public final boolean LLIIZ;
    public boolean LLIL;

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View child) {
        o.LJIIIZ(child, "child");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View child, int i) {
        o.LJIIIZ(child, "child");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams params) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(params, "params");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View child, ViewGroup.LayoutParams params) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(params, "params");
    }

    public final void setOverBorderOffset(float f) {
    }

    private final int getDefaultHeight() {
        int i;
        int size = this.LJLIL.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(this.LJLIL, i2);
            o.LJIIIIZZ(obj, "mTabs[i]");
            View view = ((LOP) obj).LIZIZ;
            if (view != null) {
                i = view.getHeight();
                if (i > 58) {
                    return 58;
                }
            } else {
                i = 0;
            }
            if (((Boolean) C33704DKq.LIZJ.getValue()).booleanValue() && i == 0) {
                return 58;
            }
        }
        return 48;
    }

    private final HomeTabAbility getHomeTabAbility() {
        if (this.LLII == null && (getContext() instanceof ActivityC45651qj)) {
            Context context = getContext();
            o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LLII = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL((ActivityC45651qj) context, null), HomeTabAbility.class, null);
        }
        return this.LLII;
    }

    private final float getScrollPosition() {
        return this.LJLJI.getIndicatorPosition();
    }

    private final SelectedTabBackToOriginAbility getSelectedTabBackToOriginAbility() {
        if (this.LLIIIILZ == null && (getContext() instanceof ActivityC45651qj)) {
            Context context = getContext();
            o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LLIIIILZ = (SelectedTabBackToOriginAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL((ActivityC45651qj) context, null), SelectedTabBackToOriginAbility.class, null);
        }
        return this.LLIIIILZ;
    }

    private final int getTabMinWidth() {
        int i = this.LJLJL;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    private final int getTabScrollRange() {
        return Math.max(0, ((this.LJLJI.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void LIZJ() {
        float f;
        if (this.LL == 17.0f) {
            f = 8.0f;
        } else {
            f = 6.0f;
        }
        this.LLIIL = C278817o.LIZ(f);
        this.LLIIJI = new LinkedHashMap();
        Iterator<LOP> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            LIZLLL(it.next());
        }
    }

    public final void LJFF() {
        C16310kV.LJIIJ(this.LJLJI, 0, 0, 0, 0);
        int i = this.LJLL;
        if (i != 0) {
            if (i == 1) {
                this.LJLJI.setGravity(1);
            }
        } else {
            this.LJLJI.setGravity(8388611);
        }
        LJJ(true);
    }

    public final void LJIIIZ() {
        if (this.LJLLL == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LJLLL = valueAnimator;
            valueAnimator.setInterpolator(LLILII);
            ValueAnimator valueAnimator2 = this.LJLLL;
            o.LJI(valueAnimator2);
            valueAnimator2.setDuration(200L);
            ValueAnimator valueAnimator3 = this.LJLLL;
            o.LJI(valueAnimator3);
            valueAnimator3.addUpdateListener(new AUListenerS97S0100000_9(this, 71));
        }
    }

    public final int getSelectedTabPosition() {
        LOP lop = this.LJLILLLLZI;
        if (lop != null) {
            o.LJI(lop);
            return lop.LIZ;
        }
        return -1;
    }

    public final int getSelectedTuxFont() {
        boolean z;
        float f = this.LL;
        if (f == 17.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 33;
        }
        if (f == 16.0f) {
            return 103;
        }
        if (f != 15.0f) {
            return 33;
        }
        return 43;
    }

    public final LOW getTabAnimationHelper() {
        return (LOW) this.LLIIIJ.getValue();
    }

    public final int getTabCount() {
        return this.LJLIL.size();
    }

    public final int getTabLayoutScrollRange() {
        return this.LJLJI.getWidth() - getWidth();
    }

    public final int getTabStripLeftPadding() {
        return this.LJLJI.getPaddingLeft();
    }

    public final int getTabStripRightPadding() {
        return this.LJLJI.getPaddingRight();
    }

    public final List<TopTabProtocol> getTopTabProtocolList() {
        List<TopTabProtocol> list;
        if (this.LLIFFJFJJ == null) {
            HomeTabAbility homeTabAbility = getHomeTabAbility();
            if (homeTabAbility != null) {
                list = homeTabAbility.L2();
            } else {
                list = null;
            }
            this.LLIFFJFJJ = list;
        }
        return this.LLIFFJFJJ;
    }

    public final int getUnSelectedTuxFont() {
        boolean z;
        float f = this.LL;
        if (f == 17.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 32;
        }
        if (f == 16.0f) {
            return 102;
        }
        if (f != 15.0f) {
            return 32;
        }
        return 42;
    }

    public final void LIZIZ() {
        LOP lop;
        LOP lop2;
        LOP lop3;
        if (C26338AVi.LIZLLL(this) && (lop3 = this.LJLILLLLZI) != null && lop3.LIZ == 0) {
            LIZ(lop3.LIZ, null);
        } else {
            if (C26338AVi.LIZLLL(this) || (lop = this.LJLILLLLZI) == null || lop.LIZ != this.LJLIL.size() - 1 || (lop2 = this.LJLILLLLZI) == null) {
                return;
            }
            LIZ(lop2.LIZ, null);
        }
    }

    public final void LJ() {
        LOX lox;
        TuxTextView tuxTextView;
        LOX lox2;
        TextView mCustomTextView$homepage_common_release;
        TuxTextView tuxTextView2;
        if (C52309Kfx.LIZ()) {
            int childCount = this.LJLJI.getChildCount();
            if (childCount >= 0) {
                int i = 0;
                while (true) {
                    View childAt = this.LJLJI.getChildAt(i);
                    if ((childAt instanceof LOX) && (mCustomTextView$homepage_common_release = (lox2 = (LOX) childAt).getMCustomTextView$homepage_common_release()) != null && mCustomTextView$homepage_common_release.getVisibility() == 0) {
                        TextView mCustomTextView$homepage_common_release2 = lox2.getMCustomTextView$homepage_common_release();
                        if ((mCustomTextView$homepage_common_release2 instanceof TuxTextView) && (tuxTextView2 = (TuxTextView) mCustomTextView$homepage_common_release2) != null) {
                            if (this.LL == 17) {
                                tuxTextView2.LJJIZ(17.0f, 22, C2059886o.LIZ(), 0.02f);
                            } else {
                                tuxTextView2.setTuxFont(getUnSelectedTuxFont());
                            }
                        }
                    }
                    if (i == childCount) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            LOP lop = this.LJLILLLLZI;
            if (lop != null && (lox = lop.LIZLLL) != null) {
                TextView mCustomTextView$homepage_common_release3 = lox.getMCustomTextView$homepage_common_release();
                if (mCustomTextView$homepage_common_release3 != null) {
                    mCustomTextView$homepage_common_release3.setAlpha(1.0f);
                }
                if ((C52309Kfx.LIZ() || C52307Kfv.LIZ()) && (mCustomTextView$homepage_common_release3 instanceof TuxTextView) && (tuxTextView = (TuxTextView) mCustomTextView$homepage_common_release3) != null) {
                    if (this.LL == 17) {
                        T5S t5s = new T5S();
                        t5s.LIZ(23);
                        tuxTextView.LJJIZ(17.0f, 22, t5s.getTypeface(), 0.02f);
                    } else {
                        tuxTextView.setTuxFont(getSelectedTuxFont());
                    }
                }
                if (!this.LLFFF) {
                    C8HI.LIZJ().LIZIZ(mCustomTextView$homepage_common_release3, "bold");
                }
            }
        }
    }

    public final boolean LJIIL() {
        SelectedTabBackToOriginAbility selectedTabBackToOriginAbility = getSelectedTabBackToOriginAbility();
        if (selectedTabBackToOriginAbility != null) {
            return selectedTabBackToOriginAbility.YY();
        }
        return false;
    }

    public final boolean LJIILIIL() {
        if (C52309Kfx.LIZ()) {
            return this.LLD;
        }
        return C90193gN.LIZIZ(getContext());
    }

    public final void LJIILL() {
        List<TopTabProtocol> list;
        HomeTabAbility homeTabAbility = getHomeTabAbility();
        if (homeTabAbility != null) {
            list = homeTabAbility.L2();
        } else {
            list = null;
        }
        this.LLIFFJFJJ = list;
        this.LLIIJI = new LinkedHashMap();
        postDelayed(new ARunnableS45S0100000_9((Object) this, 253), 600L);
    }

    public final int getTabScrollX() {
        return getTabScrollRange();
    }

    public final int getTabStripScrollX() {
        return getScrollX();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public final boolean getEnableAnimation() {
        return this.LLFF;
    }

    public final int getGradientWidth() {
        return this.LLFII;
    }

    public final int getMCustomTabResId() {
        return this.LJLLI;
    }

    public final int getMMode() {
        return this.LJLL;
    }

    public final LOR getMPageChangeListener() {
        return this.LJLLLL;
    }

    public final int getMTabBackgroundResId() {
        return this.LJLJJL;
    }

    public final int getMTabGravity() {
        return this.LJLJLLL;
    }

    public final boolean getRepeatAnim() {
        return this.LLF;
    }

    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> getScrollChangedListener() {
        return this.LLFZ;
    }

    public final int getSelectedScrollX() {
        return this.LLIIII;
    }

    public final boolean getSwipeMode() {
        return this.LLFFF;
    }

    public final int getTabGravity() {
        return this.LJLJLLL;
    }

    public final int getTabMode() {
        return this.LJLL;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getTabVisibilityListener() {
        return this.LLI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LOS(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new ArrayList<>();
        this.LJLJJLL = Integer.MAX_VALUE;
        this.LJLLJ = new ArrayList<>();
        this.LJLZ = KL2.LIZJ(context, 12.0f);
        this.LJZL = new C1UB(12);
        this.LL = 17;
        this.LLD = C90193gN.LIZIZ(context);
        this.LLF = true;
        this.LLFF = true;
        this.LLI = new AqS175S0100000_9(this, 633);
        this.LLIIIJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1043));
        this.LLIIIL = C7MY.LIZIZ(12);
        this.LLIIIZ = C7MY.LIZIZ(24);
        this.LLIIJI = new LinkedHashMap();
        this.LLIIL = C278817o.LIZ(8.0f);
        this.LLIILII = C7MY.LIZIZ(16);
        this.LLIILZL = C221108m2.LIZIZ(LOH.LJLIL);
        boolean LIZ = C52308Kfw.LIZ();
        this.LLIIZ = LIZ;
        setHorizontalScrollBarEnabled(false);
        LOU lou = new LOU(this, context);
        this.LJLJI = lou;
        if (e1.LIZ(31744, "main_tab_accessibility_label_enable", true, false)) {
            lou.setImportantForAccessibility(1);
            lou.setFocusable(false);
        }
        super.addView(lou, 0, new FrameLayout.LayoutParams(-2, -1));
        lou.setSelectedIndicatorHeight(0);
        lou.setSelectedIndicatorColor(0);
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        this.LJLJJL = 0;
        this.LJLL = 1;
        this.LJLJLLL = 0;
        getResources();
        KL2.LIZJ(getContext(), 1.5f);
        KL2.LIZJ(getContext(), 1.5f);
        this.LJZ = getResources().getConfiguration().orientation;
        LJFF();
        if (((Boolean) C87787Ycp.LIZJ.getValue()).booleanValue()) {
            this.LLFF = false;
        }
        setOverScrollMode(2);
        if (LIZ) {
            setDescendantFocusability(393216);
        }
    }

    private final void setTabMinWidth(int i) {
        this.LJLJL = i;
    }

    public final void LIZLLL(LOP lop) {
        int tabCount;
        TextView mCustomTextView$homepage_common_release;
        TextView mCustomTextView$homepage_common_release2;
        TextView mCustomTextView$homepage_common_release3;
        TextView mCustomTextView$homepage_common_release4;
        TextView mCustomTextView$homepage_common_release5;
        TextView mCustomTextView$homepage_common_release6;
        View view;
        TextView mCustomTextView$homepage_common_release7;
        TextView mCustomTextView$homepage_common_release8;
        TextView mCustomTextView$homepage_common_release9;
        View findViewById;
        TextView mCustomTextView$homepage_common_release10;
        TextView mCustomTextView$homepage_common_release11;
        TextView mCustomTextView$homepage_common_release12;
        TextView mCustomTextView$homepage_common_release13;
        View findViewById2;
        if (C53302Kvy.LIZ()) {
            if (C52309Kfx.LIZ()) {
                View view2 = lop.LIZIZ;
                if (view2 != null && (findViewById2 = view2.findViewById(R.id.e6d)) != null) {
                    findViewById2.setVisibility(8);
                }
                LOX lox = lop.LIZLLL;
                if (lox != null && (mCustomTextView$homepage_common_release13 = lox.getMCustomTextView$homepage_common_release()) != null) {
                    mCustomTextView$homepage_common_release13.setTranslationX(0.0f);
                }
            }
            LOX lox2 = lop.LIZLLL;
            if (lox2 != null && (mCustomTextView$homepage_common_release12 = lox2.getMCustomTextView$homepage_common_release()) != null) {
                mCustomTextView$homepage_common_release12.setMinWidth(0);
            }
            if (o.LJ(lop.LJ, "MUSIC_DSP_XTAB")) {
                LOX lox3 = lop.LIZLLL;
                if (lox3 != null && (mCustomTextView$homepage_common_release11 = lox3.getMCustomTextView$homepage_common_release()) != null) {
                    mCustomTextView$homepage_common_release11.setPadding(0, 0, 0, 0);
                }
                View view3 = lop.LIZIZ;
                if (view3 != null) {
                    int i = this.LLIIL;
                    view3.setPadding(i, 0, i, 0);
                    return;
                }
                return;
            }
            LOX lox4 = lop.LIZLLL;
            if (lox4 == null || (mCustomTextView$homepage_common_release10 = lox4.getMCustomTextView$homepage_common_release()) == null) {
                return;
            }
            int i2 = this.LLIIL;
            mCustomTextView$homepage_common_release10.setPadding(i2, 0, i2, 0);
            return;
        }
        if (C52309Kfx.LIZ()) {
            View view4 = lop.LIZIZ;
            if (view4 != null && (findViewById = view4.findViewById(R.id.e6d)) != null) {
                findViewById.setVisibility(8);
            }
            LOX lox5 = lop.LIZLLL;
            if (lox5 != null && (mCustomTextView$homepage_common_release9 = lox5.getMCustomTextView$homepage_common_release()) != null) {
                mCustomTextView$homepage_common_release9.setTranslationX(0.0f);
            }
        }
        LOX lox6 = lop.LIZLLL;
        if (lox6 != null && (mCustomTextView$homepage_common_release8 = lox6.getMCustomTextView$homepage_common_release()) != null) {
            mCustomTextView$homepage_common_release8.setMinWidth(0);
        }
        List<TopTabProtocol> topTabProtocolList = getTopTabProtocolList();
        if (topTabProtocolList != null) {
            tabCount = topTabProtocolList.size();
        } else {
            tabCount = getTabCount();
        }
        if (o.LJ(lop.LJ, "MUSIC_DSP_XTAB")) {
            LOX lox7 = lop.LIZLLL;
            if (lox7 != null && (mCustomTextView$homepage_common_release7 = lox7.getMCustomTextView$homepage_common_release()) != null) {
                mCustomTextView$homepage_common_release7.setPadding(0, 0, 0, 0);
            }
            if (lop.LIZ == 0 && C53314KwA.LIZ()) {
                if (!LJIILIIL()) {
                    View view5 = lop.LIZIZ;
                    if (view5 != null) {
                        view5.setPadding(0, 0, this.LLIIL, 0);
                        return;
                    }
                    return;
                }
                View view6 = lop.LIZIZ;
                if (view6 == null) {
                    return;
                }
                view6.setPadding(this.LLIIL, 0, 0, 0);
                return;
            }
            if (lop.LIZ == 0 || (view = lop.LIZIZ) == null) {
                return;
            }
            int i3 = this.LLIIL;
            view.setPadding(i3, 0, i3, 0);
            return;
        }
        if (!C53314KwA.LIZ()) {
            LOX lox8 = lop.LIZLLL;
            if (lox8 == null || (mCustomTextView$homepage_common_release6 = lox8.getMCustomTextView$homepage_common_release()) == null) {
                return;
            }
            int i4 = this.LLIIL;
            mCustomTextView$homepage_common_release6.setPadding(i4, 0, i4, 0);
            return;
        }
        int i5 = lop.LIZ;
        if (i5 == tabCount - 1) {
            if (!LJIILIIL()) {
                LOX lox9 = lop.LIZLLL;
                if (lox9 != null && (mCustomTextView$homepage_common_release5 = lox9.getMCustomTextView$homepage_common_release()) != null) {
                    mCustomTextView$homepage_common_release5.setPadding(this.LLIIL, 0, 0, 0);
                }
            } else {
                LOX lox10 = lop.LIZLLL;
                if (lox10 != null && (mCustomTextView$homepage_common_release4 = lox10.getMCustomTextView$homepage_common_release()) != null) {
                    mCustomTextView$homepage_common_release4.setPadding(0, 0, this.LLIIL, 0);
                }
            }
            View view7 = lop.LIZIZ;
            if (view7 == null) {
                return;
            }
            view7.setPadding(0, 0, 0, 0);
            return;
        }
        if (i5 == 0) {
            if (!LJIILIIL()) {
                LOX lox11 = lop.LIZLLL;
                if (lox11 == null || (mCustomTextView$homepage_common_release3 = lox11.getMCustomTextView$homepage_common_release()) == null) {
                    return;
                }
                mCustomTextView$homepage_common_release3.setPadding(0, 0, this.LLIIL, 0);
                return;
            }
            LOX lox12 = lop.LIZLLL;
            if (lox12 == null || (mCustomTextView$homepage_common_release2 = lox12.getMCustomTextView$homepage_common_release()) == null) {
                return;
            }
            mCustomTextView$homepage_common_release2.setPadding(this.LLIIL, 0, 0, 0);
            return;
        }
        LOX lox13 = lop.LIZLLL;
        if (lox13 == null || (mCustomTextView$homepage_common_release = lox13.getMCustomTextView$homepage_common_release()) == null) {
            return;
        }
        int i6 = this.LLIIL;
        mCustomTextView$homepage_common_release.setPadding(i6, 0, i6, 0);
    }

    public final void LJII(int i) {
        if (C53302Kvy.LIZ() || C52308Kfw.LIZ()) {
            if (i == -1) {
                return;
            }
            if (getWindowToken() != null && C16330kX.LIZJ(this)) {
                LOU lou = this.LJLJI;
                int childCount = lou.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (lou.getChildAt(i2).getWidth() > 0) {
                    }
                }
                scrollTo(LJI(i, 0.0f), 0);
                this.LJLJI.LJFF(i, 0.0f);
                this.LLIIII = getScrollX();
                this.LJLJI.requestLayout();
                this.LJLJI.invalidate();
                return;
            }
            LJIIZILJ(i, 0.0f, true, true, false);
            return;
        }
        LIZ(i, null);
    }

    public final int LJIIIIZZ(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final LOP LJIIJ(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (LOP) ListProtector.get(this.LJLIL, i);
    }

    public final View LJIIJJI(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.LJLJI.getChildAt(i);
    }

    public final boolean LJIJJ(int i) {
        SelectedTabBackToOriginAbility selectedTabBackToOriginAbility = getSelectedTabBackToOriginAbility();
        if (selectedTabBackToOriginAbility != null) {
            return selectedTabBackToOriginAbility.nb0(i);
        }
        return false;
    }

    public final void LJIJJLI(InterfaceC88472Yns<? super LOX, C76800UCe> action) {
        o.LJIIIZ(action, "action");
        int size = this.LJLIL.size();
        for (int i = 0; i < size; i++) {
            LOP lop = (LOP) ListProtector.get(this.LJLIL, i);
            lop.getClass();
            LOX lox = lop.LIZLLL;
            if (lox != null) {
                action.invoke(lox);
            }
        }
    }

    public final void LJIL(LinearLayout.LayoutParams layoutParams) {
        if (this.LJLL == 1 && this.LJLJLLL == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i = this.LJLJJI;
        if (i != 0) {
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
        }
    }

    public final void LJJ(boolean z) {
        int childCount = this.LJLJI.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.LJLJI.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LJIL((LinearLayout.LayoutParams) layoutParams);
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        int computeHorizontalScrollOffset = computeHorizontalScrollOffset();
        int computeHorizontalScrollRange = computeHorizontalScrollRange() - computeHorizontalScrollExtent();
        if (computeHorizontalScrollRange == 0) {
            return false;
        }
        if (i < 0) {
            if (computeHorizontalScrollOffset <= 0) {
                return false;
            }
        } else if (computeHorizontalScrollOffset >= computeHorizontalScrollRange - 1) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
        o.LJIIIZ(attrs, "attrs");
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        o.LJIIIIZZ(generateDefaultLayoutParams, "generateDefaultLayoutParams()");
        return generateDefaultLayoutParams;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLLLLLL && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void setAutoFillWhenScrollable(boolean z) {
        this.LJLLILLLL = z;
    }

    public final void setCollectionInfoForTabs(int i) {
        h0.LJIJI(this.LJLJI, new C54187LOl(i));
    }

    public final void setCustomTabViewResId(int i) {
        this.LJLLI = i;
    }

    public final void setEnableAnimation(boolean z) {
        this.LLFF = z;
    }

    public final void setGradientWidth(int i) {
        this.LLFII = i;
    }

    public final void setMCustomTabResId(int i) {
        this.LJLLI = i;
    }

    public final void setMMode(int i) {
        this.LJLL = i;
    }

    public final void setMPageChangeListener(LOR lor) {
        this.LJLLLL = lor;
    }

    public final void setMTabBackgroundResId(int i) {
        this.LJLJJL = i;
    }

    public final void setMTabGravity(int i) {
        this.LJLJLLL = i;
    }

    public final void setOnTabClickListener(LOO loo) {
        this.LJZI = loo;
    }

    public final void setOverBorderTransparentWidth(float f) {
        this.LJLJI.setOverBorderWidth(f);
    }

    public final void setRepeatAnim(boolean z) {
        this.LLF = z;
    }

    public final void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJIIIZ();
        ValueAnimator valueAnimator = this.LJLLL;
        o.LJI(valueAnimator);
        valueAnimator.addListener(animatorListener);
    }

    public final void setScrollChangedListener(InterfaceC88471Ynr<? super Integer, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        this.LLFZ = interfaceC88471Ynr;
    }

    public final void setSelectedIndicatorCorner(float f) {
        this.LJLJI.setIndicatorLineCorner(f);
    }

    public final void setSelectedScrollX(int i) {
        this.LLIIII = i;
    }

    public final void setSelectedTabHorizontalPadding(int i) {
        this.LJLJI.setSelectedTabHorizontalPadding(i);
    }

    public final void setSelectedTabIndicatorColor(int i) {
        this.LJLJI.setSelectedIndicatorColor(i);
    }

    public final void setSelectedTabIndicatorHeight(int i) {
        this.LJLJI.setSelectedIndicatorHeight(i);
    }

    public final void setSwipeMode(boolean z) {
        this.LLFFF = z;
    }

    public final void setTabGravity(int i) {
        if (this.LJLJLLL != i) {
            this.LJLJLLL = i;
            LJFF();
        }
    }

    public final void setTabMargin(int i) {
        this.LJLJJI = LJIIIIZZ(i);
        int tabCount = getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            View childAt = this.LJLJI.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = LJIIIIZZ(i);
            marginLayoutParams.rightMargin = LJIIIIZZ(i);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setTabMode(String str) {
        if (o.LJ(str, "fixed")) {
            if (this.LJLL != 1) {
                this.LJLL = 1;
                LJFF();
                return;
            }
            return;
        }
        if (!o.LJ(str, "scrollable") || this.LJLL == 0) {
            return;
        }
        this.LJLL = 0;
        LJFF();
    }

    public final void setTabStripMargin(float f) {
        this.LJLJI.setTabStripMargin(f);
    }

    public final void setTabVisibilityListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LLI = interfaceC88472Yns;
    }

    public final void setTextSize(int i) {
        this.LL = i;
    }

    public final void setTouchable(boolean z) {
        this.LJLLLLLL = z;
    }

    public final void setTabMode(int i) {
        if (i != this.LJLL) {
            this.LJLL = i;
            LJFF();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x001a, code lost:
    
        if (r15 != null) goto L14;
     */
    @Override // X.InterfaceC54184LOi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r14, java.lang.Integer r15) {
        /*
            r13 = this;
            boolean r0 = X.C53302Kvy.LIZ()
            r7 = r13
            r8 = r14
            if (r0 == 0) goto L1a
            if (r15 != 0) goto L10
        La:
            r6 = 200(0xc8, float:2.8E-43)
        Lc:
            r0 = -1
            if (r8 != r0) goto L21
            return
        L10:
            int r0 = r15.intValue()
            if (r0 != 0) goto L1c
            r7.LJII(r8)
            return
        L1a:
            if (r15 == 0) goto La
        L1c:
            int r6 = r15.intValue()
            goto Lc
        L21:
            android.os.IBinder r0 = r7.getWindowToken()
            if (r0 == 0) goto L42
            boolean r0 = X.C16330kX.LIZJ(r7)
            if (r0 == 0) goto L42
            X.LOU r3 = r7.LJLJI
            int r2 = r3.getChildCount()
            r5 = 0
            r1 = 0
        L35:
            r4 = 1
            if (r1 >= r2) goto L4d
            android.view.View r0 = r3.getChildAt(r1)
            int r0 = r0.getWidth()
            if (r0 > 0) goto L4a
        L42:
            r9 = 0
            r10 = 1
            r12 = 0
            r11 = r10
            r7.LJIIZILJ(r8, r9, r10, r11, r12)
            return
        L4a:
            int r1 = r1 + 1
            goto L35
        L4d:
            int r3 = r7.getScrollX()
            r0 = 0
            int r2 = r7.LJI(r8, r0)
            if (r3 == r2) goto L72
            r7.LJIIIZ()
            android.animation.ValueAnimator r1 = r7.LJLLL
            kotlin.jvm.internal.o.LJI(r1)
            r0 = 2
            int[] r0 = new int[r0]
            r0[r5] = r3
            r0[r4] = r2
            r1.setIntValues(r0)
            android.animation.ValueAnimator r0 = r7.LJLLL
            kotlin.jvm.internal.o.LJI(r0)
            r0.start()
        L72:
            X.LOU r0 = r7.LJLJI
            r0.LIZ(r8, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LOS.LIZ(int, java.lang.Integer):void");
    }

    public final int LJI(int i, float f) {
        View childAt;
        View view;
        int i2 = 0;
        if (this.LJLL != 0 || (childAt = this.LJLJI.getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        if (i3 < this.LJLJI.getChildCount()) {
            view = this.LJLJI.getChildAt(i3);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i2 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) (((this.LJLJJI * 4) + width + i2) * 0.5f * f);
        if (C16310kV.LIZLLL(this) == 0) {
            return left + i4;
        }
        return left - i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LOP LJIILJJIL(View view, String tag) {
        LOX lox;
        o.LJIIIZ(tag, "tag");
        LOP lop = (LOP) LLILIL.LIZIZ();
        if (lop == null) {
            lop = new LOP();
        }
        lop.LIZJ = this;
        lop.LJ = tag;
        C1UB c1ub = this.LJZL;
        if (c1ub == null || (lox = (LOX) c1ub.LIZIZ()) == null) {
            lox = new LOX(this, getContext());
        }
        lox.setFocusable(true);
        lox.setMinimumWidth(getTabMinWidth());
        lop.LIZLLL = lox;
        if (!o.LJ(lop, lox.LJLIL)) {
            lox.LJLIL = lop;
        }
        lop.LIZIZ = view;
        LOX lox2 = lop.LIZLLL;
        if (lox2 != null) {
            lox2.LIZ();
        }
        return lop;
    }

    public final void LJIILLIIL(LOP lop, boolean z) {
        int i;
        int size;
        int size2;
        LOP lop2 = this.LJLILLLLZI;
        if (o.LJ(lop2, lop)) {
            if (lop2 != null) {
                o.LJI(lop);
                int size3 = this.LJLLJ.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i2 = size3 - 1;
                        ((InterfaceC54179LOd) ListProtector.get(this.LJLLJ, size3)).LIZ();
                        if (i2 < 0) {
                            break;
                        } else {
                            size3 = i2;
                        }
                    }
                }
                LJII(lop.LIZ);
                return;
            }
            return;
        }
        if (lop != null) {
            i = lop.LIZ;
        } else {
            i = -1;
        }
        if (z) {
            if ((lop2 == null || lop2.LIZ == -1) && i != -1) {
                LJIIZILJ(i, 0.0f, true, true, false);
            } else {
                LIZ(i, null);
            }
            if (i != -1) {
                LJIJ(i, true);
            }
        }
        if (lop2 != null && this.LJLLJ.size() - 1 >= 0) {
            while (true) {
                int i3 = size2 - 1;
                ((InterfaceC54179LOd) ListProtector.get(this.LJLLJ, size2)).LIZJ(lop2);
                if (i3 < 0) {
                    break;
                } else {
                    size2 = i3;
                }
            }
        }
        this.LJLILLLLZI = lop;
        if (lop == null || this.LJLLJ.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i4 = size - 1;
            ((InterfaceC54179LOd) ListProtector.get(this.LJLLJ, size)).LIZIZ(lop);
            if (i4 < 0) {
                return;
            } else {
                size = i4;
            }
        }
    }

    public final void LJIJ(int i, boolean z) {
        boolean z2;
        int childCount = this.LJLJI.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.LJLJI.getChildAt(i2);
                if (i2 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                childAt.setSelected(z2);
                if (z && (childAt instanceof LOX)) {
                    LOX lox = (LOX) childAt;
                    TextView mCustomTextView$homepage_common_release = lox.getMCustomTextView$homepage_common_release();
                    if (lox.isSelected()) {
                        if (mCustomTextView$homepage_common_release != null) {
                            mCustomTextView$homepage_common_release.setAlpha(1.0f);
                        }
                        View findViewById = childAt.findViewById(R.id.e6d);
                        if (findViewById != null) {
                            findViewById.setAlpha(1.0f);
                        }
                    } else {
                        if (mCustomTextView$homepage_common_release != null) {
                            mCustomTextView$homepage_common_release.setAlpha(this.LJLJI.LLFFF);
                        }
                        View findViewById2 = childAt.findViewById(R.id.e6d);
                        if (findViewById2 != null) {
                            findViewById2.setAlpha(this.LJLJI.LLFFF);
                        }
                    }
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom = getPaddingBottom() + getPaddingTop() + LJIIIIZZ(getDefaultHeight());
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i2)), 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.LJLJLJ;
            if (i3 <= 0) {
                i3 = size - LJIIIIZZ(56);
            }
            this.LJLJJLL = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.LJLL;
            if (i4 != 0) {
                if (i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    public final void LJIJI(float f, float f2, int i) {
        LOU lou = this.LJLJI;
        lou.getClass();
        if (f > 0.0f && f2 > 0.0f) {
            Paint paint = new Paint(1);
            paint.setColor(i);
            lou.LL = new OSJ<>(Float.valueOf(f), Float.valueOf(f2), paint);
            return;
        }
        lou.LL = null;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC88471Ynr<? super Integer, ? super Integer, C76800UCe> interfaceC88471Ynr = this.LLFZ;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Integer.valueOf(i), Integer.valueOf(i3));
        }
    }

    public final void LJIIZILJ(int i, float f, boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        int round = Math.round(i + f);
        if (round < 0 || round >= this.LJLJI.getChildCount()) {
            return;
        }
        if (z2 && z3) {
            this.LJLJI.LJFF(i, f);
        } else if (C52309Kfx.LIZ() || C52307Kfv.LIZ()) {
            if (f > 0.0f) {
                this.LJLJI.LJFF(i, f);
            }
        } else if (z2) {
            this.LJLJI.LJFF(i, f);
        }
        boolean z4 = true;
        if (z3 || !C52309Kfx.LIZ() || f != 0.0f) {
            ValueAnimator valueAnimator2 = this.LJLLL;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.LJLLL) != null) {
                valueAnimator.cancel();
            }
            int LJI = LJI(i, f);
            scrollTo(LJI, 0);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setScrollPosition: positionOffset: ");
            LIZ.append(f);
            LIZ.append(", ");
            LIZ.append(z2);
            String str = X1D.LIZIZ(LIZ);
            o.LJIIIZ(str, "str");
            InterfaceC88471Ynr<? super Integer, ? super Integer, C76800UCe> interfaceC88471Ynr = this.LLFZ;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(Integer.valueOf(LJI), Integer.valueOf((int) f));
            }
        }
        if (!z) {
            return;
        }
        if (getTabAnimationHelper() != null) {
            z4 = false;
        }
        LJIJ(round, z4);
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        LOU lou = this.LJLJI;
        if (lou.LLFF.LJLLLLLL && i3 > 0 && lou.LJLJJI > 0.0f) {
            C16300kU.LJIIJ(lou);
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, 10, i8, z);
    }
}
