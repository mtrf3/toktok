package X;

import Y.ARunnableS51S0100000_15;
import Y.IDCListenerS261S0100000_15;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.container.DMDefaultGuideFragment;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y91 implements InterfaceC97983sw, G27, Y9A {
    public final Fragment LJLIL;
    public final View LJLILLLLZI;
    public final Fragment LJLJI;
    public final DrawerLayout LJLJJI;
    public final FrameLayout LJLJJL;
    public final FrameLayout LJLJJLL;
    public String LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final Y94 LJLJLLL;

    @Override // X.InterfaceC97983sw
    public final void LIZ() {
        LFH.LIZIZ.LIZLLL().LIZIZ();
        LFE.LIZIZ("DM-BookMode", "BookmodeContainer tryHandleDefaultGuideSubPage");
        this.LJLJLLL.LIZ();
    }

    @Override // X.InterfaceC97983sw
    public final void LIZIZ() {
        this.LJLJJI.LIZJ(8388613, false);
        this.LJLJJI.LJIJ(1, 8388613);
        Fragment fragment = this.LJLJI;
        if (fragment != null) {
            LJFF(fragment, "sub_page_default_guide");
        }
    }

    @Override // X.InterfaceC97983sw
    public final boolean LIZLLL() {
        return this.LJLJJI.LJIIL(8388613);
    }

    @Override // X.InterfaceC97983sw
    public final void LJI() {
        this.LJLJLLL.LJIIIIZZ();
    }

    @Override // X.InterfaceC97983sw
    public final void LJII() {
        this.LJLJJI.LIZJ(8388613, true);
        this.LJLJJI.LJIJ(1, 8388613);
        Fragment fragment = this.LJLJI;
        if (fragment != null) {
            LJFF(fragment, "sub_page_default_guide");
        }
    }

    @Override // X.InterfaceC97983sw
    public final boolean LJIIIIZZ() {
        return o.LJ(this.LJLJL, "sub_page_default_guide");
    }

    @Override // X.InterfaceC97983sw
    public final View getRootView() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC97983sw
    public final boolean LIZJ(String str) {
        FragmentManager fragmentManager = (FragmentManager) this.LJLJLJ.getValue();
        if (fragmentManager != null && fragmentManager.LJJJIL(str) != null) {
            return true;
        }
        return false;
    }

    @Override // X.Y9A
    public final void LJ(boolean z) {
        InterfaceC98253tN interfaceC98253tN;
        InterfaceC36571c5 interfaceC36571c5 = this.LJLIL;
        if ((interfaceC36571c5 instanceof InterfaceC98253tN) && (interfaceC98253tN = (InterfaceC98253tN) interfaceC36571c5) != null) {
            interfaceC98253tN.zb(true, z);
        }
    }

    @Override // X.Y9A
    public final void LJIIIZ(boolean z) {
        InterfaceC36571c5 interfaceC36571c5;
        InterfaceC98253tN interfaceC98253tN;
        InterfaceC98253tN interfaceC98253tN2;
        FragmentManager fragmentManager = (FragmentManager) this.LJLJLJ.getValue();
        if (fragmentManager != null) {
            interfaceC36571c5 = fragmentManager.LJJJI(R.id.bsr);
        } else {
            interfaceC36571c5 = null;
        }
        if (interfaceC36571c5 instanceof InterfaceC98253tN) {
            interfaceC98253tN = (InterfaceC98253tN) interfaceC36571c5;
        } else {
            interfaceC98253tN = null;
        }
        if (interfaceC98253tN != null) {
            interfaceC98253tN.zb(false, z);
        }
        InterfaceC36571c5 interfaceC36571c52 = this.LJLIL;
        if ((interfaceC36571c52 instanceof InterfaceC98253tN) && (interfaceC98253tN2 = (InterfaceC98253tN) interfaceC36571c52) != null) {
            interfaceC98253tN2.zb(false, z);
        }
    }

    @Override // X.InterfaceC97983sw
    public final void LJFF(Fragment fragment, String str) {
        this.LJLJL = str;
        FragmentManager fragmentManager = (FragmentManager) this.LJLJLJ.getValue();
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJIIJ(fragment, str, R.id.bsr);
            c1b3.LJI();
        }
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        boolean z;
        o.LJIIIZ(newConfig, "newConfig");
        LFH.LIZIZ.LIZLLL().LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BookmodeContainer onConfigurationChanged islandscape: ");
        if (newConfig.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LFE.LIZIZ("DM-BookMode", X1D.LIZIZ(LIZ));
        this.LJLJLLL.LJ(LIZLLL(), newConfig);
        this.LJLJJI.addOnLayoutChangeListener(new IDCListenerS261S0100000_15(this, 3));
    }

    public Y91(Fragment fragment, View view, Y96 y96, DMDefaultGuideFragment dMDefaultGuideFragment) {
        Y94 y93;
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
        this.LJLILLLLZI = view;
        this.LJLJI = dMDefaultGuideFragment;
        this.LJLJL = "";
        this.LJLJLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 891));
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cps, C16880lQ.LLZIL(view.getContext()), null);
        o.LJII(LLLZIIL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout");
        DrawerLayout drawerLayout = (DrawerLayout) LLLZIIL;
        this.LJLJJI = drawerLayout;
        View findViewById = drawerLayout.findViewById(R.id.bsk);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.container_main)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.LJLJJL = frameLayout;
        View findViewById2 = drawerLayout.findViewById(R.id.bsr);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.container_sub)");
        FrameLayout frameLayout2 = (FrameLayout) findViewById2;
        this.LJLJJLL = frameLayout2;
        Y97 y97 = y96.LIZJ;
        if (o.LJ(y97, Y99.LIZ)) {
            y93 = new Y92(this, drawerLayout, frameLayout, frameLayout2, y96.LIZIZ, this);
        } else if (o.LJ(y97, Y98.LIZ)) {
            y93 = new Y93(this, drawerLayout, frameLayout, frameLayout2, y96.LIZIZ, this);
        } else {
            throw new C162476Zf();
        }
        this.LJLJLLL = y93;
        frameLayout.addView(view);
        int i = y96.LIZLLL;
        if (i != -1) {
            View view2 = new View(frameLayout.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AnonymousClass391.LIZ(0.5d), -1);
            layoutParams.gravity = 8388613;
            view2.setLayoutParams(layoutParams);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "mainView.context");
            Integer LJI = C79045V0n.LJI(i, context);
            if (LJI != null) {
                view2.setBackgroundColor(LJI.intValue());
            }
            frameLayout.addView(view2);
        }
        drawerLayout.LIZ(new Y95(this));
        drawerLayout.post(new ARunnableS51S0100000_15(this, 111));
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            C9XU.LIZ(mo49getActivity.hashCode(), this);
        }
    }
}
