package com.ss.android.ugc.aweme.kids.setting.items.language;

import X.ABU;
import X.ABV;
import X.ABW;
import X.ABY;
import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C109824Ss;
import X.C10A;
import X.C116644hw;
import X.C141335gf;
import X.C234509Ig;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C39394Fd8;
import X.C3C5;
import X.C76800UCe;
import X.C78496UrM;
import X.C79004UzY;
import X.C87094YGc;
import X.C90903hW;
import X.C9KF;
import X.EnumC252729vw;
import X.G36;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.kids.setting.items.language.viewmodel.AppLanguageViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class KidAppLanguageListFragment extends AmeBaseFragment implements Observer<ArrayList<ABW>>, ABV {
    public AppLanguageViewModel LJLIL;
    public ABU LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

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

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.ABV
    public final void LJJIFFI(int i) {
        if (i == this.LJLJI) {
            return;
        }
        ((C252709vu) _$_findCachedViewById(R.id.l_2)).LJIJ("done", new AqS94S0101000_4(i, this, 11));
        AppLanguageViewModel appLanguageViewModel = this.LJLIL;
        if (appLanguageViewModel != null) {
            int i2 = this.LJLJI;
            MutableLiveData<ArrayList<ABW>> mutableLiveData = appLanguageViewModel.LJLIL;
            o.LJI(mutableLiveData);
            if (!C79004UzY.LJJIFFI(mutableLiveData.getValue())) {
                if (i2 >= 0) {
                    ArrayList<ABW> value = mutableLiveData.getValue();
                    o.LJI(value);
                    ((ABW) ListProtector.get(value, i2)).LIZIZ = false;
                }
                ArrayList<ABW> value2 = mutableLiveData.getValue();
                o.LJI(value2);
                ((ABW) ListProtector.get(value2, i)).LIZIZ = true;
            }
        }
        this.LJLJI = i;
        ABU abu = this.LJLILLLLZI;
        if (abu != null) {
            abu.notifyDataSetChanged();
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ArrayList<ABW> arrayList) {
        ArrayList<ABW> arrayList2 = arrayList;
        if (C79004UzY.LJJIFFI(arrayList2)) {
            return;
        }
        ABU abu = this.LJLILLLLZI;
        if (abu == null) {
            Context context = getContext();
            o.LJI(context);
            ABU abu2 = new ABU(context, this);
            this.LJLILLLLZI = abu2;
            abu2.LJLILLLLZI = arrayList2;
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.fu6);
            if (recyclerView == null) {
                return;
            }
            recyclerView.setAdapter(this.LJLILLLLZI);
            return;
        }
        abu.LJLILLLLZI = arrayList2;
        abu.notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo49getActivity() == null) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        AppLanguageViewModel appLanguageViewModel = (AppLanguageViewModel) ViewModelProviders.of(mo49getActivity).get(AppLanguageViewModel.class);
        this.LJLIL = appLanguageViewModel;
        if (appLanguageViewModel != null) {
            if (appLanguageViewModel.LJLIL == null) {
                appLanguageViewModel.LJLIL = new MutableLiveData<>();
            }
            MutableLiveData<ArrayList<ABW>> mutableLiveData = appLanguageViewModel.LJLIL;
            o.LJI(mutableLiveData);
            mutableLiveData.observe(this, this);
        }
        AppLanguageViewModel appLanguageViewModel2 = this.LJLIL;
        o.LJI(appLanguageViewModel2);
        getContext();
        C87094YGc c87094YGc = ABY.LIZ;
        G36 LIZIZ = c87094YGc.LIZIZ();
        o.LJI(LIZIZ);
        String LIZIZ2 = LIZIZ.LIZIZ();
        o.LJIIIIZZ(LIZIZ2, "KidLangManager.get().get…nItem(context)!!.showName");
        ArrayList<ABW> arrayList = new ArrayList<>();
        int i = -1;
        for (G36 g36 : ((LinkedHashMap) c87094YGc.LIZ).values()) {
            if (TextUtils.equals(g36.LIZIZ(), LIZIZ2)) {
                arrayList.add(new ABW(g36, true));
                i = arrayList.size() - 1;
            } else {
                arrayList.add(new ABW(g36, false));
            }
        }
        MutableLiveData<ArrayList<ABW>> mutableLiveData2 = appLanguageViewModel2.LJLIL;
        if (mutableLiveData2 != null) {
            mutableLiveData2.postValue(arrayList);
        }
        this.LJLJJI = i;
        this.LJLJI = i;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.fu6);
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        }
        C116644hw LJII = C116644hw.LJII(getContext());
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.fu6);
        if (recyclerView2 != null) {
            recyclerView2.LJII(LJII, -1);
        }
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l_2);
        C235119Kp c235119Kp = new C235119Kp();
        C234509Ig c234509Ig = new C234509Ig();
        String string = getString(R.string.cel);
        o.LJIIIIZZ(string, "getString(R.string.button_cancel)");
        c234509Ig.LIZJ = string;
        c234509Ig.LIZ(EnumC252729vw.SECONDARY);
        c234509Ig.LIZ = new C109824Ss(new AqS154S0100000_4(this, 380));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{c234509Ig});
        String string2 = getString(R.string.brd);
        o.LJIIIIZZ(string2, "getString(R.string.app_language)");
        LIZLLL.LIZJ = string2;
        c235119Kp.LIZJ = LIZLLL;
        C234509Ig c234509Ig2 = new C234509Ig();
        String string3 = getString(R.string.gi1);
        o.LJIIIIZZ(string3, "getString(R.string.finish)");
        c234509Ig2.LIZJ = string3;
        c234509Ig2.LIZIZ = "done";
        c234509Ig2.LJ = false;
        c234509Ig2.LIZ = new C109824Ss(new C39394Fd8(this));
        c235119Kp.LIZIZ(c234509Ig2);
        c235119Kp.LIZLLL = true;
        c252709vu.setNavActions(c235119Kp);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.bgr, viewGroup, false, "inflater.inflate(R.layou…nguage, container, false)");
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }
}
