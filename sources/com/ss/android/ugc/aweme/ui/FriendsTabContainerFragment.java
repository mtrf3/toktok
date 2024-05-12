package com.ss.android.ugc.aweme.ui;

import X.ActivityC45651qj;
import X.C0C3;
import X.C10K;
import X.C116694i1;
import X.C12460eI;
import X.C141335gf;
import X.C18000nE;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C32151Nz;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C53974LGg;
import X.C53976LGi;
import X.C54029LIj;
import X.C54081LKj;
import X.C54082LKk;
import X.C54840Lfg;
import X.C56412MCa;
import X.C76800UCe;
import X.C78856UxA;
import X.C80261Vej;
import X.C80267Vep;
import X.C8YZ;
import X.EF7;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC34471Wx;
import X.InterfaceC36571c5;
import X.InterfaceC53896LDg;
import X.InterfaceC54080LKi;
import X.InterfaceC56322M8o;
import X.InterfaceC81205Vtx;
import X.InterfaceC81207Vtz;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.LG2;
import X.LHM;
import X.LHN;
import X.LIF;
import X.LKF;
import X.LKH;
import X.O6R;
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS44S0200000_9;
import Y.ARunnableS40S0100000_4;
import Y.AgS112S0200000_9;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.main.InterceptHomeBackPressServiceImpl;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsTabContainerFragment extends BaseFragment implements LIF, InterfaceC53896LDg, C0C3, LKH, InterfaceC81205Vtx, InterfaceC34471Wx, InterfaceC56322M8o, KPL, InterfaceC81207Vtz {
    public LKF LJLIL;
    public HomePageDataViewModel LJLILLLLZI;
    public C53974LGg LJLJI;
    public List<? extends InterfaceC54080LKi> LJLJJI;
    public List<? extends ISocialTabProtocol> LJLJJL;
    public int LJLJL;
    public C80261Vej LJLJLJ;
    public int LJLJLLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public String LJLJJLL = "";
    public final String LJLL = "friends";

    @Override // X.InterfaceC81205Vtx
    public final void G6() {
    }

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC34471Wx, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b2863";
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "MainTabPage";
    }

    @Override // X.LKH
    public final boolean LJIIJ() {
        LKF lkf = this.LJLIL;
        if (lkf != null) {
            return lkf.LJIILIIL();
        }
        return false;
    }

    @Override // X.InterfaceC81207Vtz
    public final void Rh() {
        xl(this.LJLJLLL, false);
    }

    @Override // X.LIF
    public final void fc() {
        LHM.LIZIZ.LIZ().showFriendsIntroSheet();
    }

    @Override // X.InterfaceC81205Vtx
    public final void o() {
        MutableLiveData<Integer> gv0;
        HomePageDataViewModel homePageDataViewModel = this.LJLILLLLZI;
        if (homePageDataViewModel != null && (gv0 = homePageDataViewModel.gv0()) != null) {
            gv0.postValue(0);
        }
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return C18000nE.LIZ(this);
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        Context context = getContext();
        o.LJI(context);
        return C54081LKj.LIZ(context, this);
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        if (mo49getActivity() == null) {
            return false;
        }
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterceptHomeBackPressService LIZLLL = InterceptHomeBackPressServiceImpl.LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LIZIZ(this);
        }
        LKF lkf = this.LJLIL;
        if (lkf != null) {
            lkf.LJ(this);
        }
        LKF lkf2 = this.LJLIL;
        if (lkf2 != null) {
            lkf2.LJIIJ(this);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C80261Vej c80261Vej;
        super.onResume();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && C54029LIj.LIZIZ.LJJIJL() && o.LJ(C116694i1.LIZ(mo49getActivity()).nv0(), "FRIENDS_TAB") && (c80261Vej = this.LJLJLJ) != null) {
            c80261Vej.post(new ARunnableS40S0100000_4(mo49getActivity, 79));
        }
    }

    @Override // X.InterfaceC81207Vtz
    public final boolean uh() {
        ISocial2TabProtocolAbility LJ = C53976LGi.LJ(this);
        if ((LJ == null || !LJ.v60()) && !C54029LIj.LIZIZ.LJJI()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return this.LJLL;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        InterfaceC53896LDg js0;
        IFriendsTabLayoutAbility LIZIZ = C53976LGi.LIZIZ(this);
        if (LIZIZ != null && (js0 = LIZIZ.js0()) != null) {
            bundle.putBoolean("from_parent", true);
            js0.LLLLILI(bundle);
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        String str;
        ActivityC45651qj mo49getActivity;
        InterfaceC53896LDg interfaceC53896LDg;
        String TO;
        o.LJIIIZ(args, "args");
        C12460eI.LJIIIIZZ(this, null);
        IFriendsTabLayoutAbility LIZIZ = C53976LGi.LIZIZ(this);
        String str2 = "";
        if (LIZIZ == null || (str = LIZIZ.TO()) == null) {
            str = "";
        }
        Context context = getContext();
        if (context != null) {
            IFriendsTabLayoutAbility LIZ = C53976LGi.LIZ(context);
            if (LIZ != null && (TO = LIZ.TO()) != null) {
                str2 = TO;
            }
            LHN.LIZ(context, str2);
        }
        ISocial2TabProtocolAbility LJ = C53976LGi.LJ(this);
        if ((LJ == null || !LJ.v60()) && TextUtils.equals(str, "FRIENDS_FEED") && (mo49getActivity = mo49getActivity()) != null) {
            args.putString("enter_method", "duplicated");
            InterfaceC36571c5 Ja = Hox.LJLLI.LIZ(mo49getActivity).Ja("FRIENDS_FEED");
            if ((Ja instanceof InterfaceC53896LDg) && (interfaceC53896LDg = (InterfaceC53896LDg) Ja) != null) {
                interfaceC53896LDg.LLLLLLZ(args);
            }
        }
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLJL = i;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        String str;
        Fragment fragment;
        String str2;
        List<ISocialTabProtocol> L2;
        ISocialTabProtocol iSocialTabProtocol;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            ISocial2TabProtocolAbility LJFF = C53976LGi.LJFF(mo49getActivity);
            if (LJFF == null || (L2 = LJFF.L2()) == null || (iSocialTabProtocol = (ISocialTabProtocol) ORZ.LJLLLLLL(i, L2)) == null || (str = iSocialTabProtocol.getTag()) == null) {
                str = "";
            }
            IFriendsTabLayoutAbility LIZJ = C53976LGi.LIZJ(mo49getActivity);
            if (LIZJ != null) {
                fragment = LIZJ.pe(str);
            } else {
                fragment = null;
            }
            if (fragment == null && o.LJ(str, "FRIENDS_FEED")) {
                IBottomTabLayoutAbility LJII = C53976LGi.LJII(this);
                if (LJII != null && LJII.Ke()) {
                    IBottomTabLayoutAbility LJII2 = C53976LGi.LJII(this);
                    if (LJII2 != null) {
                        LJII2.iJ(false);
                    }
                    str2 = "publish_landing";
                } else if (!o.LJ(this.LJLJJLL, "")) {
                    str2 = "click_top_tab";
                } else {
                    str2 = "click_bottom";
                }
                C54029LIj.LIZIZ.LIZ.LJJIJIL(this.LJLJLLL, str2);
            }
            Hox LIZ = Hox.LJLLI.LIZ(mo49getActivity);
            Bundle bundle = new Bundle();
            if (!o.LJ(this.LJLJJLL, "")) {
                bundle.putBoolean("click_top_tab", true);
                bundle.putString("enter_method", "click_top");
                bundle.putInt("last_position", this.LJLJLLL);
            } else {
                bundle.putBoolean("slide", true);
                bundle.putString("enter_method", "slide");
                bundle.putInt("last_position", this.LJLJLLL);
            }
            this.LJLJJLL = "";
            LIZ.iv0(i, "FRIENDS_TAB", bundle);
            this.LJLJLLL = i;
            xl(i, true);
        }
    }

    @Override // X.InterfaceC81205Vtx
    public final void za(int i) {
        MutableLiveData<Integer> gv0;
        HomePageDataViewModel homePageDataViewModel = this.LJLILLLLZI;
        if (homePageDataViewModel != null && (gv0 = homePageDataViewModel.gv0()) != null) {
            gv0.postValue(Integer.valueOf(i));
        }
    }

    public static void wl(FriendsTabContainerFragment friendsTabContainerFragment, LKF lkf) {
        friendsTabContainerFragment.getClass();
        C54029LIj c54029LIj = C54029LIj.LIZIZ;
        if (c54029LIj.LJJI()) {
            if (lkf.LIZIZ() || lkf.LJI()) {
                c54029LIj.LJJJ();
                return;
            }
            return;
        }
        lkf.LJIILIIL();
    }

    @Override // X.InterfaceC81205Vtx
    public final void jk(float f, int i) {
        MutableLiveData<Integer> gv0;
        HomePageDataViewModel homePageDataViewModel = this.LJLILLLLZI;
        if (homePageDataViewModel != null && (gv0 = homePageDataViewModel.gv0()) != null) {
            gv0.postValue(Integer.valueOf((int) (f * i)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x042b, code lost:
    
        if (r5 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0452, code lost:
    
        r1 = r5.LLILIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0456, code lost:
    
        if (r1 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0458, code lost:
    
        r1.LIZIZ(r14.LJLIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x045d, code lost:
    
        r1 = r5.LLILIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0461, code lost:
    
        if (r1 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0463, code lost:
    
        r1.LIZ(r14.LJLILLLLZI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0450, code lost:
    
        if (r5 != null) goto L172;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.FriendsTabContainerFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void vl(C80261Vej c80261Vej, boolean z) {
        Object obj;
        LinearLayout linearLayout;
        Field declaredField;
        String str;
        int tabCount = c80261Vej.getTabCount();
        Object obj2 = null;
        if (tabCount >= 0) {
            int i = 0;
            while (true) {
                C78856UxA tabAt = c80261Vej.getTabAt(i);
                if (tabAt != null) {
                    C80267Vep c80267Vep = tabAt.LJIIIIZZ;
                    o.LJIIIIZZ(c80267Vep, "tab.view");
                    C54840Lfg.LJLIIL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), c80267Vep);
                    Context mo49getActivity = mo49getActivity();
                    if (mo49getActivity == null) {
                        mo49getActivity = EF7.LIZIZ();
                    }
                    List<? extends ISocialTabProtocol> list = this.LJLJJL;
                    if (list != null) {
                        String tag = ((ISocialTabProtocol) ListProtector.get(list, i)).getTag();
                        List<? extends ISocialTabProtocol> list2 = this.LJLJJL;
                        if (list2 != null) {
                            LG2 lg2 = new LG2(mo49getActivity, (ISocialTabProtocol) ListProtector.get(list2, i));
                            if (z) {
                                IFriendsTabLayoutAbility LIZIZ = C53976LGi.LIZIZ(this);
                                if (LIZIZ != null) {
                                    str = LIZIZ.TO();
                                } else {
                                    str = null;
                                }
                                if (o.LJ(tag, str)) {
                                    lg2.LLLILZ();
                                } else {
                                    lg2.LLLIIIIL();
                                }
                            }
                            tabAt.LIZLLL(lg2);
                            tabAt.LIZ = tag;
                            lg2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS44S0200000_9(tabAt, this, 21)));
                        } else {
                            o.LJIJI("topProtocolList");
                            throw null;
                        }
                    } else {
                        o.LJIJI("topProtocolList");
                        throw null;
                    }
                }
                if (i != tabCount) {
                    i++;
                }
            }
        }
        try {
            C80261Vej c80261Vej2 = this.LJLJLJ;
            if (c80261Vej2 == null || (declaredField = c80261Vej2.getClass().getDeclaredField("slidingTabIndicator")) == null) {
                obj = null;
            } else {
                declaredField.setAccessible(true);
                obj = declaredField.get(this.LJLJLJ);
            }
            if ((obj instanceof LinearLayout) && (linearLayout = (LinearLayout) obj) != null) {
                linearLayout.setGravity(17);
                linearLayout.getLayoutParams().width = -2;
            }
            C80261Vej c80261Vej3 = this.LJLJLJ;
            if (c80261Vej3 != null) {
                c80261Vej3.requestLayout();
                obj2 = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(obj2);
        } catch (Throwable th) {
            obj2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(obj2);
        }
        C3C5.m10exceptionOrNullimpl(obj2);
    }

    public final void xl(int i, boolean z) {
        LKF lkf = this.LJLIL;
        if (lkf != null && this.LJLJLLL == i) {
            if (this.LJLJL != 0) {
                C10K.LJII(600L).LJ(new AgS112S0200000_9(lkf, this, 0), C10K.LJIIIIZZ, null);
            } else {
                wl(this, lkf);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (r2 == null) goto L11;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            r11 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            long r5 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = X.LX1.LJIILIIL
            if (r0 != 0) goto L24
            X.LX1.LIZIZ = r5
            java.util.HashMap<java.lang.String, java.lang.String> r9 = X.LX1.LIZ
            java.lang.String r1 = "tab_position"
            java.lang.String r0 = "Bottom2Tab"
            r9.put(r1, r0)
            X.FAM r0 = X.C56662Kg.LIZ()
            long r7 = r0.LJIIJJI
            java.lang.String r10 = "start_time_from_open_app"
            X.C7MY.LJFF(r5, r7, r9, r10)
        L24:
            X.1qj r2 = r11.mo49getActivity()
            r3 = 0
            r4 = 0
            r1 = 2131562924(0x7f0d11ac, float:1.875129E38)
            if (r2 == 0) goto L3d
            com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2$FriendsTabPerfOptConfig r0 = com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2.LIZ()
            boolean r0 = r0.viewInflateOpt
            if (r0 == 0) goto L95
            android.view.View r2 = X.C16970lZ.LIZJ(r1, r2, r13, r4)
        L3b:
            if (r2 != 0) goto L41
        L3d:
            android.view.View r2 = X.C16880lQ.LLLLIILL(r12, r1, r13, r4)
        L41:
            boolean r0 = X.LX1.LJIILIIL
            if (r0 != 0) goto L4c
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r5
            X.LX1.LJ = r0
        L4c:
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            boolean r0 = X.C90193gN.LIZ()
            if (r0 == 0) goto L63
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            X.J8B r0 = new X.J8B
            r0.<init>(r2, r11)
            r1.addOnPreDrawListener(r0)
        L63:
            X.1qj r5 = r11.mo49getActivity()
            if (r5 == 0) goto L98
            X.LFH r0 = X.LFH.LIZIZ
            X.LEp r0 = r0.LIZLLL()
            r0.LJIILIIL()
            X.LAe r4 = X.C53816LAe.LIZ
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "FRIENDS_FEED_"
            r1.append(r0)
            int r0 = r5.hashCode()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.LKF r0 = r4.LIZIZ(r0, r11, r2)
            r11.LJLIL = r0
            android.view.View r0 = r0.LJIILJJIL()
            if (r0 != 0) goto L97
            goto L98
        L95:
            r2 = r3
            goto L3b
        L97:
            r2 = r0
        L98:
            androidx.lifecycle.LifecycleOwner r0 = r11.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> Lb9
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r2, r0)     // Catch: java.lang.Throwable -> Lb9
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r2, r11)     // Catch: java.lang.Throwable -> Lb9
            X.C10A.LIZIZ(r2, r11)     // Catch: java.lang.Throwable -> Lb9
            X.1qj r1 = r11.mo49getActivity()     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = r1 instanceof X.C29S     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto Lb0
            r3 = r1
            X.29S r3 = (X.C29S) r3     // Catch: java.lang.Throwable -> Lb9
        Lb0:
            X.C90903hW.LIZ(r3)     // Catch: java.lang.Throwable -> Lb9
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Lb9
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> Lb9
            goto Lc1
        Lb9:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.FriendsTabContainerFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
