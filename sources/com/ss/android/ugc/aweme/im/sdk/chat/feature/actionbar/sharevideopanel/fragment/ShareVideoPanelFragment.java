package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1BC;
import X.C221108m2;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C61878OQg;
import X.C62822Ol8;
import X.C74053T4n;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.EnumC92073jP;
import X.InterfaceC219588ja;
import X.InterfaceC74055T4p;
import X.KEI;
import X.ORY;
import Y.AObserverS69S0100000_1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelPageFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.viewmodel.ShareVideoPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareVideoPanelFragment extends BaseFragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public List<Integer> LJLIL = C61878OQg.INSTANCE;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 68));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.b6q);
        o.LJIIIIZZ(string, "getString(R.string.actio…share_video_panel_header)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        return c235119Kp;
    }

    public final String vl(int i) {
        if (i == EnumC92073jP.LIKED.getType()) {
            return getString(R.string.b6p);
        }
        if (i == EnumC92073jP.FAVORITE.getType()) {
            return getString(R.string.b6o);
        }
        if (i == EnumC92073jP.YOURS.getType()) {
            return getString(R.string.b6r);
        }
        return null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int[] intArray;
        List<Integer> LJJZ;
        final String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (intArray = arguments.getIntArray("panel_type_list")) != null && (LJJZ = ORY.LJJZ(intArray)) != null) {
            this.LJLIL = LJJZ;
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (string = arguments2.getString("conversation_id")) != null) {
                C74053T4n initViews$lambda$2 = (C74053T4n) view.findViewById(R.id.jvg);
                final ViewPager viewPager = (ViewPager) view.findViewById(R.id.jvh);
                final List<Integer> list = this.LJLIL;
                final FragmentManager childFragmentManager = getChildFragmentManager();
                viewPager.setAdapter(new C1BC(childFragmentManager) { // from class: X.3jO
                    @Override // androidx.viewpager.widget.PagerAdapter
                    public final int getCount() {
                        return list.size();
                    }

                    @Override // androidx.viewpager.widget.PagerAdapter
                    public final CharSequence LJIILIIL(int i) {
                        return this.vl(((Number) ListProtector.get(list, i)).intValue());
                    }

                    @Override // X.C1BC
                    public final Fragment LJJIII(int i) {
                        int intValue = ((Number) ListProtector.get(list, i)).intValue();
                        String conversationId = string;
                        o.LJIIIZ(conversationId, "conversationId");
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("panel_type", intValue);
                        bundle2.putString("conversation_id", conversationId);
                        ShareVideoPanelPageFragment shareVideoPanelPageFragment = new ShareVideoPanelPageFragment();
                        shareVideoPanelPageFragment.setArguments(bundle2);
                        return shareVideoPanelPageFragment;
                    }
                });
                Iterator<Integer> it = this.LJLIL.iterator();
                while (it.hasNext()) {
                    String vl = vl(it.next().intValue());
                    if (vl != null) {
                        o.LJIIIIZZ(initViews$lambda$2, "tabBar");
                        KEI LJII = initViews$lambda$2.LJII();
                        LJII.LIZIZ(vl);
                        C74053T4n.LIZJ(initViews$lambda$2, LJII, 0, false, 6);
                    }
                }
                o.LJIIIIZZ(initViews$lambda$2, "initViews$lambda$2");
                C74053T4n.LJIILJJIL(initViews$lambda$2, viewPager);
                initViews$lambda$2.LIZ(new InterfaceC74055T4p() { // from class: X.3jN
                    @Override // X.InterfaceC74055T4p
                    public final void LIZIZ(KEI kei) {
                    }

                    @Override // X.InterfaceC74055T4p
                    public final void LIZJ(KEI tab) {
                        o.LJIIIZ(tab, "tab");
                    }

                    @Override // X.InterfaceC74055T4p
                    public final void LIZ(KEI tab) {
                        String str;
                        o.LJIIIZ(tab, "tab");
                        ViewPager.this.setCurrentItem(tab.LIZLLL, true);
                        int intValue = ((Number) ListProtector.get(this.LJLIL, tab.LIZLLL)).intValue();
                        if (intValue == EnumC92073jP.YOURS.getType()) {
                            str = "your";
                        } else if (intValue == EnumC92073jP.LIKED.getType()) {
                            str = "liked";
                        } else if (intValue == EnumC92073jP.FAVORITE.getType()) {
                            str = "favorite";
                        } else {
                            str = "";
                        }
                        C85323Wm onEventV3 = C772831o.LIZ();
                        o.LJIIIZ(onEventV3, "onEventV3");
                        C1HQ c1hq = new C1HQ();
                        c1hq.put("enter_from", "chat");
                        c1hq.put("tab_name", str);
                        onEventV3.LIZIZ("change_share_tab", c1hq);
                    }
                });
            }
        }
        ((ShareVideoPanelViewModel) this.LJLILLLLZI.getValue()).LJLIL.observe(this, new AObserverS69S0100000_1(this, 106));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b2_, viewGroup, false);
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
