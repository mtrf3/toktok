package com.ss.android.ugc.aweme.following.ui;

import X.ActivityC45651qj;
import X.C0C3;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C1DD;
import X.C202767xY;
import X.C211088Qe;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C77123UOp;
import X.C77266UUc;
import X.C77275UUl;
import X.C78685UuP;
import X.C78841Uwv;
import X.C80674VlO;
import X.C80675VlP;
import X.C90903hW;
import X.EF7;
import X.EnumC72483ScZ;
import X.FFL;
import X.FMX;
import X.InterfaceC80650Vl0;
import X.X1D;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FollowRelationTabFragment extends JediBaseFragment implements InterfaceC80650Vl0, C0C3, View.OnClickListener {
    public C202767xY LJLIL;
    public boolean LJLILLLLZI;
    public String LJLJI;
    public User LJLJJI;
    public String LJLJJL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public ArrayList<String> LJLLJ;
    public ArrayList<String> LJLLL;
    public String LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public final C62822Ol8 LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();
    public boolean LJLJJLL = true;
    public final List<Fragment> LJLL = new ArrayList();
    public final List<String> LJLLI = new ArrayList();
    public final List<String> LJLLILLLL = new ArrayList();

    public static boolean Hl() {
        Set LJIIIIZZ = C77275UUl.LJIIIIZZ(1, 2, 3, 4);
        FFL.LJIIIZ().getClass();
        return LJIIIIZZ.contains(Integer.valueOf(FFL.LJIIJ(31744, 0, "stable_friends_list_entrance", true)));
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
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

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
    }

    @Override // X.InterfaceC80650Vl0
    public final boolean onScrollEnd() {
        return false;
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
    }

    public FollowRelationTabFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(FollowRelationTabViewModel.class);
        this.LJZ = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, UserLevelGeckoUpdateSetting.DEFAULT));
    }

    public final FollowRelationTabViewModel Al() {
        return (FollowRelationTabViewModel) this.LJZ.getValue();
    }

    public final void Dl() {
        if (this.LJLILLLLZI && !C77266UUc.LIZIZ.LJJIZ()) {
            ((ImageView) _$_findCachedViewById(R.id.vm)).setVisibility(0);
        } else {
            ((ImageView) _$_findCachedViewById(R.id.vm)).setVisibility(8);
        }
    }

    public final void Il() {
        int i;
        View view;
        TextView textView;
        View view2;
        TextView textView2;
        TextView textView3;
        C80675VlP c80675VlP = (C80675VlP) _$_findCachedViewById(R.id.kyt);
        C202767xY c202767xY = this.LJLIL;
        View view3 = null;
        if (c202767xY != null) {
            Iterator<Fragment> it = c202767xY.LJLJJLL.iterator();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = -1;
                if (it.hasNext()) {
                    if (it.next() instanceof FollowingRelationFragment) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    i3 = -1;
                    break;
                }
            }
            C80674VlO LJIIJ = c80675VlP.LJIIJ(i3);
            if (LJIIJ != null) {
                view = LJIIJ.LJFF;
            } else {
                view = null;
            }
            if (view instanceof TextView) {
                textView = (TextView) view;
            } else {
                textView = null;
            }
            if (textView != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(EF7.LIZIZ().getString(R.string.gkk));
                LIZ.append(' ');
                LIZ.append(C77123UOp.LJJIIJ(this.LJLJL));
                textView.setText(X1D.LIZIZ(LIZ));
            }
            C80675VlP c80675VlP2 = (C80675VlP) _$_findCachedViewById(R.id.kyt);
            C202767xY c202767xY2 = this.LJLIL;
            if (c202767xY2 != null) {
                Iterator<Fragment> it2 = c202767xY2.LJLJJLL.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next() instanceof FollowerRelationFragment) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                C80674VlO LJIIJ2 = c80675VlP2.LJIIJ(i);
                if (LJIIJ2 != null) {
                    view2 = LJIIJ2.LJFF;
                } else {
                    view2 = null;
                }
                if ((view2 instanceof TextView) && (textView3 = (TextView) view2) != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(EF7.LIZIZ().getString(R.string.jdc));
                    LIZ2.append(' ');
                    LIZ2.append(C77123UOp.LJJIIJ(this.LJLJLJ));
                    textView3.setText(X1D.LIZIZ(LIZ2));
                }
                C80674VlO LJIIJ3 = ((C80675VlP) _$_findCachedViewById(R.id.kyt)).LJIIJ(((ArrayList) this.LJLLILLLL).indexOf("muf_user"));
                if (LJIIJ3 != null) {
                    view3 = LJIIJ3.LJFF;
                }
                if (!(view3 instanceof TextView) || (textView2 = (TextView) view3) == null) {
                    return;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(EF7.LIZIZ().getString(R.string.gnr));
                LIZ3.append(' ');
                LIZ3.append(C77123UOp.LJJIIJ(this.LJLJLLL));
                textView2.setText(X1D.LIZIZ(LIZ3));
                return;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int followerCount;
        super.onResume();
        User user = this.LJLJJI;
        if (user != null) {
            this.LJLJL = user.getFollowingCount();
            if (C78841Uwv.LJJJ(user)) {
                followerCount = user.getFansCount();
            } else {
                followerCount = user.getFollowerCount();
            }
            this.LJLJLJ = followerCount;
            this.LJLJLLL = user.getFriendCount();
        }
        C211088Qe.LIZ.getClass();
        if (!C211088Qe.LIZ() || !this.LJLLLLLL) {
            Il();
        }
    }

    public final void vl() {
        Fragment LJJJIL = getChildFragmentManager().LJJJIL(Gl(R.id.ncx, ((ArrayList) this.LJLL).size()));
        if (LJJJIL == null) {
            LJJJIL = new FollowerRelationFragment();
        }
        LJJJIL.setArguments(getArguments());
        ((ArrayList) this.LJLL).add(LJJJIL);
        C211088Qe.LIZ.getClass();
        if (C211088Qe.LIZ() && this.LJLLLLLL) {
            ((ArrayList) this.LJLLI).add(C1DD.LIZLLL(R.string.gkg, "AppContextManager.getApp…String(R.string.follower)"));
        } else {
            List<String> list = this.LJLLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(EF7.LIZIZ().getString(R.string.jdc));
            LIZ.append(' ');
            LIZ.append(C77123UOp.LJJIIJ(this.LJLJLJ));
            ((ArrayList) list).add(X1D.LIZIZ(LIZ));
        }
        ((ArrayList) this.LJLLILLLL).add("follower_relation");
    }

    public final void wl() {
        Fragment LJJJIL = getChildFragmentManager().LJJJIL(Gl(R.id.ncx, ((ArrayList) this.LJLL).size()));
        if (LJJJIL == null) {
            LJJJIL = new FollowingRelationFragment();
        }
        LJJJIL.setArguments(getArguments());
        ((ArrayList) this.LJLL).add(LJJJIL);
        C211088Qe.LIZ.getClass();
        if (C211088Qe.LIZ() && this.LJLLLLLL) {
            ((ArrayList) this.LJLLI).add(C1DD.LIZLLL(R.string.gkk, "AppContextManager.getApp…tring(R.string.following)"));
        } else {
            List<String> list = this.LJLLI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(EF7.LIZIZ().getString(R.string.gkk));
            LIZ.append(' ');
            LIZ.append(C77123UOp.LJJIIJ(this.LJLJL));
            ((ArrayList) list).add(X1D.LIZIZ(LIZ));
        }
        ((ArrayList) this.LJLLILLLL).add("following_relation");
    }

    public final void xl() {
        Resources resources;
        String str;
        Fragment LJJJIL = getChildFragmentManager().LJJJIL(Gl(R.id.ncx, ((ArrayList) this.LJLL).size()));
        String str2 = null;
        if (LJJJIL == null) {
            EnumC72483ScZ scene = EnumC72483ScZ.TT_RELATION_PAGE;
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("enter_from");
            } else {
                str = null;
            }
            if (!C78685UuP.LJJJZ(str)) {
                if (this.LJLILLLLZI) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
            }
            MufPageTrackInfo mufPageTrackInfo = new MufPageTrackInfo("relation_tab", str);
            o.LJIIIZ(scene, "scene");
            LJJJIL = FriendsServiceImpl.LJJJJ().LJJJ(scene, mufPageTrackInfo);
        }
        ((ArrayList) this.LJLL).add(LJJJIL);
        List<String> list = this.LJLLI;
        StringBuilder LIZ = X1D.LIZ();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (resources = mo49getActivity.getResources()) != null) {
            str2 = resources.getString(R.string.gnr);
        }
        LIZ.append(str2);
        LIZ.append(' ');
        LIZ.append(C77123UOp.LJJIIJ(this.LJLJLLL));
        ((ArrayList) list).add(X1D.LIZIZ(LIZ));
        ((ArrayList) this.LJLLILLLL).add("muf_user");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        if (view != null) {
            int id = view.getId();
            if (id == R.id.aej) {
                withState(Al(), new AqS170S0100000_4(this, 383));
                return;
            }
            if (id != R.id.vm) {
                return;
            }
            if (((ViewPager) _$_findCachedViewById(R.id.ncx)).getCurrentItem() == 0) {
                str = "following";
            } else {
                str = "fans";
            }
            FindFriendsPageArg findFriendsPageArg = new FindFriendsPageArg(false, 0, str, null, null, 0, false, 123, null);
            SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity(), "//friends/ffp");
            buildRoute.withNavArg(findFriendsPageArg);
            buildRoute.open();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str);
            FMX.LJIIL("click_add_friends", c188727au.LIZ);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0145, code lost:
    
        if (r8.equals("common_relation") == false) goto L16;
     */
    @Override // X.C0C3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r15) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment.onPageSelected(int):void");
    }

    public final String Gl(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("android:switcher:");
        LIZ.append(R.id.ncx);
        LIZ.append(':');
        LIZ.append(i2);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x016e, code lost:
    
        if (((X.RBX) X.HG3.LJIILL()).getCurUser().getFriendCount() <= 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04f3  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 1275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c4b, viewGroup, false);
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
