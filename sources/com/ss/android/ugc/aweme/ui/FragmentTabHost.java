package com.ss.android.ugc.aweme.ui;

import X.AbstractC025808g;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.JBR;
import X.LLC;
import X.LLG;
import X.LLH;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.q;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    public boolean LJLIL;
    public final ArrayList<LLC> LJLILLLLZI;
    public FrameLayout LJLJI;
    public Context LJLJJI;
    public FragmentManager LJLJJL;
    public int LJLJJLL;
    public TabHost.OnTabChangeListener LJLJL;
    public LLC LJLJLJ;
    public boolean LJLJLLL;
    public LLH LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;

    /* loaded from: classes15.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new IDCreatorS56S0000000_14(13);
        public String LJLIL;

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FragmentTabHost.SavedState{");
            LIZ.append(Integer.toHexString(System.identityHashCode(this)));
            LIZ.append(" curTab=");
            return JBR.LJFF(LIZ, this.LJLIL, "}", LIZ);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.LJLIL = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.LJLIL);
        }
    }

    public Fragment getCurrentFragment() {
        LLC llc = this.LJLJLJ;
        if (llc != null) {
            return llc.LIZLLL;
        }
        return null;
    }

    @Override // android.widget.TabHost
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public final void LIZIZ() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        C1B3 c1b3 = null;
        for (int i = 0; i < this.LJLILLLLZI.size(); i++) {
            LLC llc = (LLC) ListProtector.get(this.LJLILLLLZI, i);
            Fragment LJJJIL = this.LJLJJL.LJJJIL(llc.LIZ);
            llc.LIZLLL = LJJJIL;
            if (LJJJIL != null && !LJJJIL.isDetached()) {
                if (llc.LIZ.equals(currentTabTag)) {
                    this.LJLJLJ = llc;
                } else {
                    if (c1b3 == null) {
                        FragmentManager fragmentManager = this.LJLJJL;
                        c1b3 = C1B6.LIZ(fragmentManager, fragmentManager);
                    }
                    c1b3.LJIIZILJ(llc.LIZLLL);
                }
            }
        }
        this.LJLJLLL = true;
        AbstractC025808g LIZJ = LIZJ(c1b3, currentTabTag);
        if (LIZJ != null) {
            LIZJ.LJI();
            this.LJLJJL.LJJIL();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        try {
            LIZIZ();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLJLLL = false;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        if (context != null && findViewById(R.id.tabs) == null) {
            LinearLayout LIZ = q.LIZ(context, 1);
            addView(LIZ, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            LIZ.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            LIZ.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.LJLJI = frameLayout2;
            frameLayout2.setId(this.LJLJJLL);
            LIZ.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.LJLIL = getCurrentTabTag();
        return savedState;
    }

    public boolean getDispatchWindowFocusChangedToAllTab() {
        return this.LJLIL;
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        this.LJLILLLLZI = new ArrayList<>();
        this.LJLLI = false;
        this.LJLLILLLL = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.inflatedId}, 0, 0);
        this.LJLJJLL = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.widget.TabHost, android.view.ViewGroup, android.view.View
    public final void dispatchWindowFocusChanged(boolean z) {
        if (this.LJLIL) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchWindowFocusChanged(z);
            }
            return;
        }
        super.dispatchWindowFocusChanged(z);
    }

    @Override // android.view.ViewGroup
    public final View getChildAt(int i) {
        View childAt = super.getChildAt(i);
        if (childAt == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setVisibility(8);
            return frameLayout;
        }
        return childAt;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.LJLIL);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public final void onTabChanged(String str) {
        Fragment fragment;
        Fragment fragment2 = null;
        if (this.LJLJLLL) {
            LLC llc = this.LJLJLJ;
            if (llc != null) {
                fragment = llc.LIZLLL;
            } else {
                fragment = null;
            }
            AbstractC025808g LIZJ = LIZJ(null, str);
            if (LIZJ != null) {
                LIZJ.LJI();
                this.LJLJJL.LJJIL();
            }
        } else {
            fragment = null;
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.LJLJL;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
        LLH llh = this.LJLL;
        if (llh != null) {
            LLC llc2 = this.LJLJLJ;
            if (llc2 != null) {
                fragment2 = llc2.LIZLLL;
            }
            if (fragment2 != fragment) {
                llh.LLLLZLLIL(str, fragment2, fragment);
            }
        }
    }

    public void setDispatchWindowFocusChangedToAllTab(boolean z) {
        this.LJLIL = z;
    }

    public void setHideWhenTabChanged(boolean z) {
        if (!this.LJLLILLLL) {
            this.LJLLI = z;
        }
    }

    @Override // android.widget.TabHost
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.LJLJL = onTabChangeListener;
    }

    public void setOnTabSwitchListener(LLH llh) {
        this.LJLL = llh;
    }

    public void setSuperOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        super.setOnTabChangedListener(onTabChangeListener);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLILLLLZI = new ArrayList<>();
        this.LJLLI = false;
        this.LJLLILLLL = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.LJLJJLL = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public final AbstractC025808g LIZJ(C1B3 c1b3, String str) {
        Fragment fragment;
        this.LJLLILLLL = true;
        LLC llc = null;
        for (int i = 0; i < this.LJLILLLLZI.size(); i++) {
            LLC llc2 = (LLC) ListProtector.get(this.LJLILLLLZI, i);
            if (llc2.LIZ.equals(str)) {
                llc = llc2;
            }
        }
        if (llc == null) {
            return null;
        }
        if (this.LJLJLJ != llc) {
            if (c1b3 == null) {
                FragmentManager fragmentManager = this.LJLJJL;
                c1b3 = C1B6.LIZ(fragmentManager, fragmentManager);
            }
            LLC llc3 = this.LJLJLJ;
            if (llc3 != null && (fragment = llc3.LIZLLL) != null) {
                if (this.LJLLI) {
                    c1b3.LJIIIZ(fragment);
                } else {
                    c1b3.LJIIZILJ(fragment);
                }
            }
            Fragment fragment2 = llc.LIZLLL;
            if (fragment2 == null) {
                Fragment instantiate = Fragment.instantiate(this.LJLJJI, llc.LIZIZ.getName(), llc.LIZJ);
                llc.LIZLLL = instantiate;
                c1b3.LJIIIIZZ(this.LJLJJLL, 1, instantiate, llc.LIZ);
            } else if (this.LJLLI) {
                if (fragment2.isDetached()) {
                    c1b3.LJFF(llc.LIZLLL);
                }
                c1b3.LJIIL(llc.LIZLLL);
            } else {
                c1b3.LJFF(fragment2);
            }
            this.LJLJLJ = llc;
        }
        return c1b3;
    }

    public final void LIZLLL(ActivityC45651qj activityC45651qj, FragmentManager fragmentManager) {
        super.setup();
        this.LJLJJI = activityC45651qj;
        this.LJLJJL = fragmentManager;
        this.LJLJJLL = com.zhiliaoapp.musically.R.id.kye;
        if (this.LJLJI == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(com.zhiliaoapp.musically.R.id.kye);
            this.LJLJI = frameLayout;
            if (frameLayout == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("No tab content FrameLayout found for id ");
                LIZ.append(this.LJLJJLL);
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
        }
        this.LJLJI.setId(com.zhiliaoapp.musically.R.id.kye);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }

    public final void LIZ(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        tabSpec.setContent(new LLG(this.LJLJJI));
        String tag = tabSpec.getTag();
        LLC llc = new LLC(bundle, tag, cls);
        if (this.LJLJLLL) {
            Fragment LJJJIL = this.LJLJJL.LJJJIL(tag);
            llc.LIZLLL = LJJJIL;
            if (LJJJIL != null && !LJJJIL.isDetached()) {
                FragmentManager fragmentManager = this.LJLJJL;
                C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
                LIZ.LJIIZILJ(llc.LIZLLL);
                LIZ.LJI();
            }
        }
        this.LJLILLLLZI.add(llc);
        addTab(tabSpec);
    }
}
