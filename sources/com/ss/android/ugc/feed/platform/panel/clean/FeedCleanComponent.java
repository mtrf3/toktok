package com.ss.android.ugc.feed.platform.panel.clean;

import X.AbstractC48820JEa;
import X.C221108m2;
import X.C2K0;
import X.C53595L1r;
import X.C53880LCq;
import X.C62822Ol8;
import X.EnumC53596L1s;
import X.InterfaceC55102Lju;
import X.JBR;
import X.X1D;
import Y.ALAdapterS7S0100000_9;
import Y.AUListenerS97S0100000_9;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedCleanComponent extends BasePanelUIComponent implements IFeedCleanAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLJJI;
    public final CopyOnWriteArraySet<C53595L1r> LJLJJL;
    public Animator LJLJJLL;
    public boolean LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 2129690801) {
            return null;
        }
        return this;
    }

    public FeedCleanComponent() {
        new LinkedHashMap();
        this.LJLJJI = C221108m2.LIZIZ(C53880LCq.LJLIL);
        this.LJLJJL = new CopyOnWriteArraySet<>();
        this.LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 724));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 723));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility
    public final boolean Jr0() {
        return this.LJLJL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View view2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Object parent = view.getParent();
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            View findViewById = view2.findViewById(R.id.cg_);
            if (findViewById != null) {
                xT(findViewById);
            }
            View findViewById2 = view2.findViewById(R.id.aan);
            if (findViewById2 != null) {
                xT(findViewById2);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility
    public final void xT(View view) {
        v3(view, EnumC53596L1s.UNSPECIFIED);
    }

    public final void v3(View view, EnumC53596L1s category) {
        o.LJIIIZ(category, "category");
        if (view != null) {
            this.LJLJJL.add(new C53595L1r(category, new WeakReference(view)));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility
    public final void Wu0(boolean z, Animator animator, boolean z2) {
        boolean z3;
        float f;
        float f2;
        long j;
        TimeInterpolator linearInterpolator;
        long j2;
        AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) this.LJLJJI.getValue();
        StringBuilder LJI = JBR.LJI("toggleClean request: clean ", z, ", hasCustomAnimation: ");
        if (animator != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        LJI.append(z3);
        LJI.append(" immediately: ");
        LJI.append(z2);
        abstractC48820JEa.LJIIIIZZ(X1D.LIZIZ(LJI));
        Animator animator2 = this.LJLJJLL;
        if (animator2 != null) {
            animator2.end();
        }
        this.LJLJJLL = null;
        float f3 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z2) {
            Iterator<C53595L1r> it = this.LJLJJL.iterator();
            while (it.hasNext()) {
                View view = it.next().LIZIZ.get();
                if (view != null) {
                    view.setAlpha(f);
                }
            }
            IFriendsTabLayoutAbility iFriendsTabLayoutAbility = (IFriendsTabLayoutAbility) this.LJLJLLL.getValue();
            if (iFriendsTabLayoutAbility != null) {
                iFriendsTabLayoutAbility.g70(f);
            }
            MainPageBusinessAbility mainPageBusinessAbility = (MainPageBusinessAbility) this.LJLJLJ.getValue();
            if (mainPageBusinessAbility == null) {
                return;
            }
            mainPageBusinessAbility.Eb(z, true, true, true, animator, true);
            return;
        }
        float[] fArr = new float[2];
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[0] = f2;
        if (z) {
            f3 = 0.0f;
        }
        fArr[1] = f3;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (animator != null) {
            j = animator.getDuration();
        } else {
            j = 200;
        }
        ofFloat.setDuration(j);
        if (animator == null || (linearInterpolator = animator.getInterpolator()) == null) {
            linearInterpolator = new LinearInterpolator();
        }
        ofFloat.setInterpolator(linearInterpolator);
        if (animator != null) {
            j2 = animator.getStartDelay();
        } else {
            j2 = 0;
        }
        ofFloat.setStartDelay(j2);
        ofFloat.addUpdateListener(new AUListenerS97S0100000_9(this, 73));
        ofFloat.addListener(new ALAdapterS7S0100000_9(this, 22));
        ofFloat.start();
        this.LJLJL = true;
        MainPageBusinessAbility mainPageBusinessAbility2 = (MainPageBusinessAbility) this.LJLJLJ.getValue();
        if (mainPageBusinessAbility2 != null) {
            mainPageBusinessAbility2.Eb(z, true, true, true, animator, z2);
        }
        this.LJLJJLL = ofFloat;
    }
}
