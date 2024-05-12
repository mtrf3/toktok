package com.ss.android.ugc.aweme.kids.profile;

import X.AIU;
import X.AIX;
import X.AIY;
import X.AbstractC029409q;
import X.AbstractC030309z;
import X.AbstractC72372sj;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C0A2;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C198517qh;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26045AKb;
import X.C29S;
import X.C39398FdC;
import X.C3C5;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65777Prh;
import X.C67112kF;
import X.C6Z5;
import X.C72352sh;
import X.C72713SgH;
import X.C72714SgI;
import X.C76800UCe;
import X.C780334l;
import X.C90903hW;
import X.C9KF;
import X.QD3;
import X.XKX;
import Y.AObserverS72S0100000_4;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.kids.profile.base.BaseFragment;
import com.ss.android.ugc.aweme.kids.profile.utils.MyProfileReportWidget;
import com.ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import defpackage.s1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class MyProfileFragment extends BaseFragment {
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 377));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(AIY.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 379));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 378));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 677));

    @Override // com.ss.android.ugc.aweme.kids.profile.base.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.kids.profile.base.BaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final KidsProfileViewModel vl() {
        return (KidsProfileViewModel) this.LJLJL.getValue();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        KidsProfileViewModel vl = vl();
        vl.getClass();
        vl.LJLILLLLZI = XKX.LIZLLL(C780334l.LJLIL, null, null, new C67112kF(vl, null), 3);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDeleteDraftItemEvent(AIX event) {
        o.LJIIIZ(event, "event");
        List<AbstractC72372sj> value = vl().LJLJJI.getValue();
        o.LJII(value, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.kids.profile.ProfileVideoData>");
        List<AbstractC72372sj> LIZIZ = C65777Prh.LIZIZ(value);
        Iterator<AbstractC72372sj> it = LIZIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC72372sj next = it.next();
            if ((next instanceof C72352sh) && o.LJ(event.LJLIL.LIZ(), ((C72352sh) next).LIZ.LIZ())) {
                it.remove();
                break;
            }
        }
        vl().LJLJJI.setValue(LIZIZ);
        vl().LJLJJL.setValue(Integer.valueOf(LIZIZ.size() - 1));
        ((AbstractC029409q) this.LJLJJLL.getValue()).notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-5042547597322860788");
        if (c03880Dg.LIZJ(10501, "com/ss/android/ugc/aweme/kids/profile/MyProfileFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/kids/profile/MyProfileFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (_$_findCachedViewById(R.id.h2b).getVisibility() == 0 && !z) {
            C39398FdC c39398FdC = C39398FdC.LIZ;
            C198517qh c198517qh = new C198517qh();
            C39398FdC.LIZIZ("shoot_bubble_show", q.LIZJ(c198517qh.LIZ, "enter_from", "personal_homepage", c198517qh, c39398FdC));
        }
        c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/kids/profile/MyProfileFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onVideoCreatedOrSaved(C6Z5 event) {
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        if (i == 1) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LIZ(true);
            c26045AKb.LJIIIIZZ(R.string.ho1);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIJ();
            return;
        }
        if (i != 2) {
            return;
        }
        C26045AKb c26045AKb2 = new C26045AKb(this);
        c26045AKb2.LIZ(true);
        c26045AKb2.LJIIIIZZ(R.string.hnu);
        c26045AKb2.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb2.LJII(R.attr.e8);
        c26045AKb2.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j_7);
        recyclerView.setAdapter((AbstractC029409q) this.LJLJJLL.getValue());
        recyclerView.setLayoutManager((C0A2) this.LJLJI.getValue());
        final int i = (int) (2 * Resources.getSystem().getDisplayMetrics().density);
        recyclerView.LJII(new AbstractC030309z(i) { // from class: X.4gl
            public final int LJLIL;

            {
                this.LJLIL = i;
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view2, RecyclerView recyclerView2, C0AC c0ac) {
                AbstractC029409q adapter;
                T28.LJ(rect, "outRect", view2, "view", recyclerView2, "parent", c0ac, "state");
                super.LJ(rect, view2, recyclerView2, c0ac);
                rect.left = 0;
                rect.right = 0;
                rect.top = 0;
                rect.bottom = 0;
                int LJJJJJ = RecyclerView.LJJJJJ(view2);
                if (LJJJJJ == 0 || (adapter = recyclerView2.getAdapter()) == null || adapter.getItemCount() <= 1) {
                    return;
                }
                int i2 = LJJJJJ - 1;
                if (i2 / 3 > 0) {
                    rect.top = this.LJLIL;
                }
                int i3 = i2 % 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            return;
                        }
                        rect.left = this.LJLIL / 2;
                        return;
                    } else {
                        int i4 = this.LJLIL / 2;
                        rect.left = i4;
                        rect.right = i4;
                        return;
                    }
                }
                rect.right = this.LJLIL / 2;
            }
        }, -1);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.i7i);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        Context context = getContext();
        if (context == null || (str = context.getString(R.string.hnx)) == null) {
            str = "";
        }
        c9kf.LIZJ = str;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_ellipsis_horizontal;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 14));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        c252709vu.setNavActions(c235119Kp);
        LiveData map = Transformations.map(vl().LJLJI, AIU.LJLIL);
        o.LJIIIIZZ(map, "map(kidsUserLiveData) {\n…T\n            }\n        }");
        map.observe(getViewLifecycleOwner(), new AObserverS72S0100000_4(this, 1));
        vl().LJLJJL.observe(getViewLifecycleOwner(), new AObserverS72S0100000_4(this, 2));
        vl().LJLJJI.observe(getViewLifecycleOwner(), new AObserverS72S0100000_4(this, 3));
        if (this.LJLIL == null && getView() != null) {
            C72714SgI c72714SgI = C72713SgH.LJIIIIZZ;
            View view2 = getView();
            c72714SgI.getClass();
            this.LJLIL = C72714SgI.LIZ(view2, this);
        }
        C72713SgH c72713SgH = this.LJLIL;
        if (c72713SgH != null) {
            c72713SgH.LJ(new MyProfileReportWidget((ViewGroup) view));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        this.LJLIL = null;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bgn, viewGroup, false);
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
