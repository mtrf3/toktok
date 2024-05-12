package com.ss.android.ugc.trill.language.view;

import X.AB6;
import X.AB8;
import X.ABA;
import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234509Ig;
import X.C235119Kp;
import X.C252709vu;
import X.C25810ABa;
import X.C25811ABb;
import X.C25814ABe;
import X.C29S;
import X.C3C5;
import X.C55230Lly;
import X.C55247LmF;
import X.C76800UCe;
import X.C79004UzY;
import X.C90903hW;
import X.C9KF;
import X.EnumC252729vw;
import X.FMX;
import X.G36;
import X.InterfaceC55251LmJ;
import X.InterfaceC88472Yns;
import Y.AObjectS15S0001000_14;
import Y.AObjectS42S0101000_5;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.fragment.FragmentRoute;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class AppLanguageListFragment extends BaseFragment implements Observer<ArrayList<ABA>>, AB6 {
    public static final /* synthetic */ int LJLJLJ = 0;
    public AppLanguageViewModel LJLIL;
    public C252709vu LJLILLLLZI;
    public RecyclerView LJLJI;
    public AB8 LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;

    public final void LIZ() {
        C25814ABe c25814ABe;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55230Lly.LIZJ(this, null), C25814ABe.class, null);
        if (LIZLLL != null && (c25814ABe = (C25814ABe) LIZLLL.getSource()) != null && c25814ABe.LJLIL) {
            FragmentRoute fragmentNavigation = SmartRouter.fragmentNavigation(this);
            fragmentNavigation.pop();
            fragmentNavigation.commit();
        } else {
            if (mo49getActivity() == null) {
                return;
            }
            mo49getActivity().finish();
        }
    }

    @Override // X.AB6
    public final void LJJIFFI(int i) {
        if (i == this.LJLJJL) {
            return;
        }
        final int i2 = 1;
        if (i == this.LJLJJLL) {
            C252709vu c252709vu = this.LJLILLLLZI;
            Objects.requireNonNull(c252709vu);
            this.LJLILLLLZI = c252709vu;
            c252709vu.LJIJ("end_text", new AObjectS15S0001000_14(1, 6));
        } else {
            C252709vu c252709vu2 = this.LJLILLLLZI;
            Objects.requireNonNull(c252709vu2);
            this.LJLILLLLZI = c252709vu2;
            c252709vu2.LJIJ("end_text", new InterfaceC88472Yns() { // from class: X.ABc
                @Override // X.InterfaceC88472Yns
                public final Object invoke(Object obj) {
                    switch (i2) {
                        case 0:
                            return SettingNewVersionFragment.lambda$initUnits$63((C2068389v) obj);
                        default:
                            ((C234509Ig) ((AbstractC234519Ih) obj)).LJ = true;
                            return null;
                    }
                }
            });
        }
        AppLanguageViewModel appLanguageViewModel = this.LJLIL;
        int i3 = this.LJLJJL;
        MutableLiveData<ArrayList<ABA>> mutableLiveData = appLanguageViewModel.LJLIL;
        if (!C79004UzY.LJJIFFI(mutableLiveData.getValue())) {
            if (i3 >= 0) {
                ((ABA) ListProtector.get(mutableLiveData.getValue(), i3)).LIZ = false;
            }
            ((ABA) ListProtector.get(mutableLiveData.getValue(), i)).LIZ = true;
        }
        this.LJLJJL = i;
        this.LJLJJI.notifyDataSetChanged();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        ActivityC45651qj mo49getActivity;
        Intent intent;
        super.onAttach(context);
        if (this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        Bundle arguments = getArguments();
        if (arguments == null && ((mo49getActivity = mo49getActivity()) == null || (intent = mo49getActivity.getIntent()) == null || (arguments = C16880lQ.LLJJIJI(intent)) == null)) {
            return;
        }
        int i = arguments.getInt("key_launch_mode");
        long j = arguments.getLong("key_launch_time");
        if (i <= 0 || j <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("launch_mode", String.valueOf(i));
        hashMap.put("cost_time", String.valueOf(System.currentTimeMillis() - j));
        hashMap.put("page", "language-setting");
        FMX.LJIIL("easy_navigation_performance_track", hashMap);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ArrayList<ABA> arrayList) {
        ArrayList<ABA> arrayList2 = arrayList;
        if (C79004UzY.LJJIFFI(arrayList2)) {
            return;
        }
        AB8 ab8 = this.LJLJJI;
        if (ab8 == null) {
            AB8 ab82 = new AB8(getContext(), this);
            this.LJLJJI = ab82;
            ab82.LJLJI = arrayList2;
            this.LJLJI.setAdapter(ab82);
            String LIZ = ((ABA) ListProtector.get(arrayList2, this.LJLJJLL)).LIZIZ.LIZ();
            try {
                JSONObject jSONObject = new JSONObject();
                if (LIZ == null) {
                    LIZ = "";
                }
                jSONObject.put("app_language", LIZ);
                AppLogNewUtils.onEventV3("enter_app_language_setting", jSONObject);
                return;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        ab8.LJLJI = arrayList2;
        ab8.notifyDataSetChanged();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(new AObjectS42S0101000_5(2, this, 17));
        super.onCreate(bundle);
        if (mo49getActivity() == null) {
            return;
        }
        AppLanguageViewModel appLanguageViewModel = (AppLanguageViewModel) ViewModelProviders.of(this).get(AppLanguageViewModel.class);
        this.LJLIL = appLanguageViewModel;
        if (appLanguageViewModel.LJLIL == null) {
            appLanguageViewModel.LJLIL = new MutableLiveData<>();
        }
        appLanguageViewModel.LJLIL.observe(this, this);
        AppLanguageViewModel appLanguageViewModel2 = this.LJLIL;
        Context context = getContext();
        appLanguageViewModel2.getClass();
        String LIZIZ = SettingServiceImpl.LIZ().getCurrentI18nItem(context).LIZIZ();
        ArrayList<ABA> arrayList = new ArrayList<>();
        int i = -1;
        for (G36 g36 : SettingServiceImpl.LIZ().getLocaleMap().values()) {
            if (TextUtils.equals(g36.LIZIZ(), LIZIZ)) {
                arrayList.add(new ABA(g36, true));
                i = arrayList.size() - 1;
            } else {
                arrayList.add(new ABA(g36, false));
            }
        }
        appLanguageViewModel2.LJLIL.postValue(arrayList);
        this.LJLJJLL = i;
        this.LJLJJL = i;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.LJLILLLLZI = (C252709vu) view.findViewById(R.id.l_2);
        this.LJLJI = (RecyclerView) view.findViewById(R.id.fu6);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.LJLJI;
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        C252709vu c252709vu = this.LJLILLLLZI;
        C235119Kp c235119Kp = new C235119Kp();
        C234509Ig c234509Ig = new C234509Ig();
        c234509Ig.LIZIZ = "start_text";
        c234509Ig.LJ = true;
        c234509Ig.LIZ(EnumC252729vw.SECONDARY);
        String content = getString(R.string.cel);
        o.LJIIIZ(content, "content");
        c234509Ig.LIZJ = content;
        c234509Ig.LIZ = new C25810ABa(this);
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{c234509Ig});
        CharSequence title = getText(R.string.brd);
        o.LJIIIZ(title, "title");
        LIZLLL.LIZJ = title;
        c235119Kp.LIZJ = LIZLLL;
        C234509Ig c234509Ig2 = new C234509Ig();
        c234509Ig2.LIZIZ = "end_text";
        String content2 = getString(R.string.gi1);
        o.LJIIIZ(content2, "content");
        c234509Ig2.LIZJ = content2;
        c234509Ig2.LJ = false;
        c234509Ig2.LIZ(EnumC252729vw.PRIMARY);
        c234509Ig2.LIZ = new C25811ABb(this);
        c235119Kp.LIZIZ(c234509Ig2);
        c252709vu.setNavActions(c235119Kp);
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(R.attr.c9, typedValue, true);
        view.setBackgroundColor(typedValue.data);
        this.LJLILLLLZI.setNavBackground(typedValue.data);
        this.LJLILLLLZI.LJIILJJIL(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cjx, viewGroup, false);
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
