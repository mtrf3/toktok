package X;

import Y.IDCListenerS253S0100000_3;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DefaultInitialSectionFragment;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Vtu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81202Vtu implements LKF, G27 {
    public final ActivityC45651qj LJLIL;
    public final FragmentManager LJLILLLLZI;
    public final View LJLJI;
    public final boolean LJLJJI;
    public String LJLJJL = "";
    public String LJLJJLL = "";
    public final HashMap<String, C81203Vtv> LJLJL = new HashMap<>();
    public final HashSet<InterfaceC81205Vtx> LJLJLJ = new HashSet<>();
    public FrameLayout LJLJLLL;
    public DrawerLayout LJLL;
    public FrameLayout LJLLI;
    public FrameLayout LJLLILLLL;
    public float LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public InterfaceC81207Vtz LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public Configuration LJZL;
    public boolean LL;
    public C81201Vtt LLD;

    @Override // X.LKF
    public final boolean LIZIZ() {
        DrawerLayout drawerLayout = this.LJLL;
        if ((drawerLayout != null && drawerLayout.LJIIJJI()) || this.LJLLJ != 0.0f) {
            return true;
        }
        return false;
    }

    @Override // X.LKF
    public final boolean LJI() {
        InterfaceC81207Vtz interfaceC81207Vtz;
        if (!LEO.LIZIZ(this.LJLIL, null, this.LJLZ) || !this.LL || (interfaceC81207Vtz = this.LJLLLLLL) == null || !interfaceC81207Vtz.uh()) {
            return false;
        }
        DefaultInitialSectionFragment.LJLJJLL.getClass();
        GHW.LIZ(this);
        this.LJLZ = true;
        this.LL = false;
        return true;
    }

    @Override // X.LKF
    public final int LJIIIZ() {
        DrawerLayout drawerLayout = this.LJLL;
        if (drawerLayout == null || !drawerLayout.LJIIJJI()) {
            return 0;
        }
        return LJIILLIIL();
    }

    @Override // X.LKF
    public final View LJIILJJIL() {
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null) {
            return frameLayout;
        }
        return this.LJLJI;
    }

    public final int LJIILLIIL() {
        C81203Vtv c81203Vtv = this.LJLJL.get(this.LJLJJL);
        if (c81203Vtv != null) {
            return c81203Vtv.LIZJ;
        }
        return 0;
    }

    public final void LJIJI() {
        int i = 0;
        if ((this.LJLJJLL.length() > 0 && LF2.LIZIZ(this.LJLIL)) || LIZIZ()) {
            this.LJLJL.get(this.LJLJJLL);
            i = 2;
        }
        DrawerLayout drawerLayout = this.LJLL;
        if (drawerLayout != null) {
            drawerLayout.setSplitDragType(i);
        }
    }

    @Override // X.LKF
    public final boolean LJIILIIL() {
        C80723VmB c80723VmB;
        boolean z = false;
        if (LIZIZ()) {
            this.LJZI = false;
            DrawerLayout drawerLayout = this.LJLL;
            z = true;
            if (drawerLayout != null && (c80723VmB = drawerLayout.LLI) != null) {
                c80723VmB.LIZ.LIZJ(c80723VmB.LIZIZ, true);
            }
        }
        return z;
    }

    @Override // X.LKF
    public final String LJIIJJI() {
        return this.LJLJJL;
    }

    @Override // X.LKF
    public final void LIZ(InterfaceC81205Vtx listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJLJ.add(listener);
    }

    @Override // X.LKF
    public final void LIZJ(InterfaceC81204Vtw interfaceC81204Vtw) {
        C81208Vu0 c81208Vu0 = new C81208Vu0();
        String F6 = interfaceC81204Vtw.F6();
        LFE.LIZIZ("commentSplit", "addSection tag: " + F6);
        interfaceC81204Vtw.Q2();
        Fragment R4 = interfaceC81204Vtw.R4();
        if (this.LJLILLLLZI.LJJJIL(F6) != null) {
            return;
        }
        LFE.LIZIZ("commentSplit", "addSection begin add");
        FragmentManager fragmentManager = this.LJLILLLLZI;
        C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
        LIZ.LJIIIIZZ(R.id.bsq, 1, R4, F6);
        LIZ.LJI();
        this.LJLJJL = F6;
        this.LJLJL.put(F6, new C81203Vtv(interfaceC81204Vtw, c81208Vu0));
        interfaceC81204Vtw.O7(this.LJLLL, this.LJLLLL);
        LJIJI();
        LJIJ(this, true, false, 2);
    }

    @Override // X.LKF
    public final boolean LIZLLL(String str) {
        LFE.LIZIZ("commentSplit", "isSectionAvaiable");
        if (!LEO.LIZ(this.LJLIL, this.LJZL)) {
            LFE.LIZIZ("commentSplit", "isSectionAvaiable no");
            return false;
        }
        return true;
    }

    @Override // X.LKF
    public final void LJ(InterfaceC81205Vtx listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJLJ.remove(listener);
    }

    @Override // X.LKF
    public final C2J3 LJII(String tag) {
        o.LJIIIZ(tag, "tag");
        if (this.LJLILLLLZI.LJJJIL(tag) != null) {
            return this.LJLJL.get(tag);
        }
        return null;
    }

    @Override // X.LKF
    public final void LJIIJ(InterfaceC81207Vtz listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLLLLL = null;
    }

    @Override // X.LKF
    public final void LJIIL(InterfaceC81207Vtz listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLLLLL = listener;
        LJI();
    }

    public final void LJIILL(float f) {
        View childAt;
        int width;
        FrameLayout frameLayout = this.LJLLI;
        if (frameLayout != null && (childAt = frameLayout.getChildAt(0)) != null) {
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (f == 0.0f) {
                layoutParams.width = -1;
            } else {
                DrawerLayout drawerLayout = this.LJLL;
                if (drawerLayout != null && (width = drawerLayout.getWidth()) > 0) {
                    layoutParams.width = (int) (width - (LJIILLIIL() * f));
                }
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    public final boolean LJIIZILJ(String str) {
        FragmentManager fragmentManager = this.LJLILLLLZI;
        C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
        List<Fragment> LJJJJLI = fragmentManager.LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "it.fragments");
        boolean z = false;
        for (Fragment fragment : LJJJJLI) {
            java.util.Set<String> keySet = this.LJLJL.keySet();
            o.LJIIIIZZ(keySet, "sectionMap.keys");
            if (ORZ.LJLJJI(fragment.getTag(), keySet)) {
                if (o.LJ(fragment.getTag(), str)) {
                    if (fragment.isAdded()) {
                        LIZ.LJIIL(fragment);
                        z = true;
                    }
                } else if (fragment.isAdded()) {
                    LIZ.LJIIIZ(fragment);
                }
            }
        }
        LIZ.LJI();
        if (z) {
            this.LJLJJL = str;
        }
        return z;
    }

    @Override // X.LKF
    public final boolean LJFF(String str, boolean z) {
        boolean z2;
        DrawerLayout drawerLayout;
        C80723VmB c80723VmB;
        LFE.LIZIZ("commentSplit", "tryOpenSection");
        if (!LEO.LIZ(this.LJLIL, this.LJZL)) {
            LFE.LIZIZ("commentSplit", "tryOpenSection no");
            return false;
        }
        LFE.LIZIZ("commentSplit", "openSection");
        if (LIZLLL(str)) {
            DrawerLayout drawerLayout2 = this.LJLL;
            if (drawerLayout2 != null && drawerLayout2.LJIIJJI()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && o.LJ(this.LJLJJL, str)) {
                LFE.LIZIZ("commentSplit", "openSection no");
                if (z) {
                    FMX.LJIIL("comment_split_click_comment_icon", C78920UyC.LIZJ(1, "is_open").LIZ);
                }
            } else {
                if (z) {
                    FMX.LJIIL("comment_split_click_comment_icon", C78920UyC.LIZJ(0, "is_open").LIZ);
                }
                if (LJIIZILJ(str) && (drawerLayout = this.LJLL) != null && (c80723VmB = drawerLayout.LLI) != null) {
                    c80723VmB.LIZ.LJIILLIIL(c80723VmB.LIZIZ, true);
                }
            }
        }
        if (this.LJLL == null) {
            return false;
        }
        return true;
    }

    @Override // X.LKF
    public final void LJIIIIZZ(int i, int i2) {
        this.LJLLL = i;
        this.LJLLLL = i2;
        Iterator<Map.Entry<String, C81203Vtv>> it = this.LJLJL.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().LIZ.O7(i, i2);
        }
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        C80723VmB c80723VmB;
        C80723VmB c80723VmB2;
        boolean z;
        C80723VmB c80723VmB3;
        o.LJIIIZ(newConfig, "newConfig");
        if (!o.LJ(this.LJLIL, activity)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConfigurationChanged lastCloseManually: ");
        LIZ.append(this.LJZ);
        LFE.LIZIZ("commentSplit", X1D.LIZIZ(LIZ));
        this.LJZL = newConfig;
        LJIJI();
        if (LEO.LIZIZ(activity, newConfig, this.LJLZ) && !this.LJZ) {
            InterfaceC81207Vtz interfaceC81207Vtz = this.LJLLLLLL;
            if (interfaceC81207Vtz != null) {
                z = interfaceC81207Vtz.uh();
            } else {
                z = true;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onConfigurationChanged supportOpenDefault: ");
            LIZ2.append(z);
            LFE.LIZIZ("commentSplit", X1D.LIZIZ(LIZ2));
            if (z) {
                if (this.LJLJL.isEmpty()) {
                    DefaultInitialSectionFragment.LJLJJLL.getClass();
                    GHW.LIZ(this);
                } else {
                    DrawerLayout drawerLayout = this.LJLL;
                    if (drawerLayout != null && (c80723VmB3 = drawerLayout.LLI) != null) {
                        c80723VmB3.LIZ.LJIILLIIL(c80723VmB3.LIZIZ, false);
                    }
                    LJIJ(this, false, true, 1);
                }
                InterfaceC81207Vtz interfaceC81207Vtz2 = this.LJLLLLLL;
                if (interfaceC81207Vtz2 != null) {
                    interfaceC81207Vtz2.Rh();
                }
                this.LJLZ = true;
                return;
            }
            if (!this.LJLJJI) {
                return;
            }
            this.LL = true;
            return;
        }
        LEO.LIZ(this.LJLIL, newConfig);
        if (!LIZLLL("")) {
            this.LJZI = true;
            DrawerLayout drawerLayout2 = this.LJLL;
            if (drawerLayout2 != null && drawerLayout2.LJIIJJI()) {
                DrawerLayout drawerLayout3 = this.LJLL;
                if (drawerLayout3 != null && (c80723VmB2 = drawerLayout3.LLI) != null) {
                    c80723VmB2.LIZ.LIZJ(c80723VmB2.LIZIZ, false);
                }
            } else {
                DrawerLayout drawerLayout4 = this.LJLL;
                if (drawerLayout4 != null && (c80723VmB = drawerLayout4.LLI) != null) {
                    c80723VmB.LIZ.LIZJ(c80723VmB.LIZIZ, true);
                }
            }
        }
        LJIJ(this, false, false, 3);
    }

    public C81202Vtu(ActivityC45651qj activityC45651qj, FragmentManager fragmentManager, View view, boolean z) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = fragmentManager;
        this.LJLJI = view;
        this.LJLJJI = z;
        new HashMap();
        C9XU.LIZ(activityC45651qj.hashCode(), this);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cpv, C16880lQ.LLZIL(view.getContext()), null);
        o.LJII(LLLZIIL, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) LLLZIIL;
        this.LJLJLLL = frameLayout;
        this.LJLLI = (FrameLayout) frameLayout.findViewById(R.id.bse);
        FrameLayout frameLayout2 = this.LJLJLLL;
        o.LJI(frameLayout2);
        this.LJLLILLLL = (FrameLayout) frameLayout2.findViewById(R.id.bsq);
        FrameLayout frameLayout3 = this.LJLJLLL;
        o.LJI(frameLayout3);
        this.LJLL = (DrawerLayout) frameLayout3.findViewById(R.id.chi);
        FrameLayout frameLayout4 = this.LJLLI;
        if (frameLayout4 != null) {
            frameLayout4.addView(view);
        }
        C81201Vtt c81201Vtt = new C81201Vtt(this);
        this.LLD = c81201Vtt;
        DrawerLayout drawerLayout = this.LJLL;
        if (drawerLayout != null) {
            drawerLayout.LIZ(c81201Vtt);
        }
        if (LEO.LIZIZ(activityC45651qj, null, this.LJLZ)) {
            if (z) {
                this.LL = true;
                return;
            }
            DefaultInitialSectionFragment.LJLJJLL.getClass();
            GHW.LIZ(this);
            this.LJLZ = true;
        }
    }

    public static void LJIJ(C81202Vtu c81202Vtu, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        DrawerLayout drawerLayout = c81202Vtu.LJLL;
        if (drawerLayout != null) {
            drawerLayout.addOnLayoutChangeListener(new IDCListenerS253S0100000_3(new C81200Vts(c81202Vtu, z, z2), 5));
        }
    }
}
