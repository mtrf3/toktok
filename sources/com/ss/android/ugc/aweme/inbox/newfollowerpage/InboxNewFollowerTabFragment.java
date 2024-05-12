package com.ss.android.ugc.aweme.inbox.newfollowerpage;

import X.AX1;
import X.AX2;
import X.AX5;
import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C1BC;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26373AWr;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C40443Fu3;
import X.C53355Kwp;
import X.C54154LNe;
import X.C74053T4n;
import X.C76800UCe;
import X.C86V;
import X.C90903hW;
import X.C9KF;
import X.FMX;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.L03;
import X.LK2;
import X.OSZ;
import Y.IDiS268S0100000_4;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.fragment.NavigationUtils;
import com.ss.android.ugc.aweme.inbox.InboxFollowerFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class InboxNewFollowerTabFragment extends BaseFragment implements LK2, JBS {
    public boolean LJLJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final List<C26373AWr> LJLIL = new ArrayList();
    public final String LJLILLLLZI = C86V.LJFF(R.string.gnr);
    public String LJLJJI = "click";

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "new_follows";
    }

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    @Override // X.JBS
    public final void onBackPressed_Activity() {
        JBR.LIZIZ(this);
        FMX.LJIIL("enter_homepage_message_navi", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", C54154LNe.LIZIZ(requireActivity())), new OSZ("from_inbox_page", "new_follows")));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        AX5.LIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AX5.LIZ = "new_followers";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        activityConfiguration(AX1.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(AX2.LJLIL);
    }

    @Override // X.LK2
    public final void v0(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", enterFrom);
        linkedHashMap.put("to_page", "activity_page");
        FMX.LJIIL("enter_activity_page", linkedHashMap);
        if (C53355Kwp.LIZ() && NavigationUtils.findNavigationContainer(this) != null) {
            FMX.LJIIL("enter_homepage_message_navi", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", "click_button_icon"), new OSZ("from_inbox_page", "new_follows")));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 1244));
        C9KF c9kf = new C9KF();
        String string = getString(R.string.hdf);
        o.LJIIIIZZ(string, "getString(R.string.inbox_optimize_new_followers)");
        c9kf.LIZJ = string;
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL(LIZJ);
        c235119Kp.LIZJ = c9kf;
        c235119Kp.LIZLLL = false;
        c252709vu.setNavActions(c235119Kp);
        List<C26373AWr> list = this.LJLIL;
        InboxFollowerFragment inboxFollowerFragment = new InboxFollowerFragment();
        String string2 = getString(R.string.gkg);
        o.LJIIIIZZ(string2, "getString(R.string.follower)");
        ((ArrayList) list).add(new C26373AWr(inboxFollowerFragment, string2));
        _$_findCachedViewById(R.id.ky_).setVisibility(8);
        _$_findCachedViewById(R.id.ncx).setScrollContainer(false);
        List<C26373AWr> list2 = this.LJLIL;
        final ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        Iterator it = ((ArrayList) list2).iterator();
        while (it.hasNext()) {
            arrayList.add(((C26373AWr) it.next()).LIZ);
        }
        List<C26373AWr> list3 = this.LJLIL;
        final ArrayList arrayList2 = new ArrayList(C32I.LJJL(list3, 10));
        Iterator it2 = ((ArrayList) list3).iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C26373AWr) it2.next()).LIZIZ);
        }
        final FragmentManager requireFragmentManager = requireFragmentManager();
        o.LJIIIIZZ(requireFragmentManager, "requireFragmentManager()");
        final Lifecycle lifecycle = getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        ((ViewPager) _$_findCachedViewById(R.id.ncx)).setAdapter(new C1BC(arrayList, arrayList2, requireFragmentManager, lifecycle) { // from class: X.7Et
            public final List<Fragment> LJLJJLL;
            public final List<String> LJLJL;

            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return this.LJLJJLL.size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final CharSequence LJIILIIL(int i) {
                return (CharSequence) ListProtector.get(this.LJLJL, i);
            }

            @Override // X.C1BC
            public final Fragment LJJIII(int i) {
                return (Fragment) ListProtector.get(this.LJLJJLL, i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                super(requireFragmentManager, 0);
                this.LJLJJLL = arrayList;
                this.LJLJL = arrayList2;
            }
        });
        C74053T4n tab_bar = (C74053T4n) _$_findCachedViewById(R.id.ky_);
        o.LJIIIIZZ(tab_bar, "tab_bar");
        C74053T4n.LJIILJJIL(tab_bar, (ViewPager) _$_findCachedViewById(R.id.ncx));
        ((ViewPager) _$_findCachedViewById(R.id.ncx)).addOnPageChangeListener(new IDiS268S0100000_4(this, 3));
        if (L03.LIZ()) {
            C40443Fu3.LIZ("inbox_follower_tab_page").LJFF((ViewPager) _$_findCachedViewById(R.id.ncx));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.rl, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
