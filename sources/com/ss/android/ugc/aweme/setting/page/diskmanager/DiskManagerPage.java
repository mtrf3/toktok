package com.ss.android.ugc.aweme.setting.page.diskmanager;

import X.ARN;
import X.ActivityC45651qj;
import X.C10K;
import X.C221108m2;
import X.C235119Kp;
import X.C23880wi;
import X.C23930wn;
import X.C252709vu;
import X.C25851ACp;
import X.C2YJ;
import X.C37292EkK;
import X.C62822Ol8;
import X.C67623QgN;
import X.C67624QgO;
import X.C67625QgP;
import X.C67627QgR;
import X.C67629QgT;
import X.C76800UCe;
import X.C78840Uwu;
import X.C79045V0n;
import X.C94603nU;
import X.DialogC254039y3;
import X.EE1;
import X.FMX;
import X.InterfaceC38412F5s;
import X.InterfaceC61213O0r;
import X.InterfaceC88472Yns;
import X.OSZ;
import Y.ACallableS109S0100000_6;
import Y.AObserverS65S0200000_1;
import Y.AObserverS69S0100000_1;
import Y.AObserverS79S0100000_11;
import Y.ARunnableS47S0100000_11;
import Y.AgS128S0100000_11;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;
import yq4.a;

@InterfaceC61213O0r
/* loaded from: classes12.dex */
public final class DiskManagerPage extends BasePage {
    public static final List<InterfaceC38412F5s> LJLL = new ArrayList();
    public DialogC254039y3 LJLJI;
    public ValueAnimator LJLJJI;
    public ValueAnimator LJLJJL;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public boolean LJLJJLL = true;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS161S0100000_11(this, 62));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 61));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.ck1;
    }

    public final C25851ACp Al() {
        return (C25851ACp) this.LJLJLJ.getValue();
    }

    public final DiskViewModel Dl() {
        return (DiskViewModel) this.LJLJL.getValue();
    }

    public final void Hl() {
        C10K LIZJ = C10K.LIZJ(new ACallableS109S0100000_6(this, 7));
        o.LJIIIIZZ(LIZJ, "private fun refreshStora…it.result\n        }\n    }");
        o.LJIIIIZZ(LIZJ.LJ(new AgS128S0100000_11(this, 2), C10K.LJIIIIZZ, null), "crossinline continuation… Task.UI_THREAD_EXECUTOR)");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final boolean xl() {
        DialogC254039y3 dialogC254039y3 = this.LJLJI;
        if (dialogC254039y3 == null || !dialogC254039y3.isShowing()) {
            vl();
        }
        return true;
    }

    public static final boolean Gl() {
        long j;
        long LIZ = C37292EkK.LIZ();
        if (!C67629QgT.LIZ().getBoolean("has_show_disk_manager_dot", true)) {
            return true;
        }
        try {
            Long showStorageDotSize = C2YJ.LIZIZ.LIZ.getShowStorageDotSize();
            o.LJIIIIZZ(showStorageDotSize, "{\n                Settin…rageDotSize\n            }");
            j = showStorageDotSize.longValue();
        } catch (Exception unused) {
            j = 1000000000;
        }
        if (LIZ >= j) {
            if (System.currentTimeMillis() - C67629QgT.LIZ().getLong("last_show_disk_manager_dot_time", 0L) >= 2592000000L) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator<InterfaceC38412F5s> it = LJLL.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ValueAnimator valueAnimator = this.LJLJJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LJLJJI = null;
        ValueAnimator valueAnimator2 = this.LJLJJL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LJLJJL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        MutableLiveData<Boolean> mutableLiveData;
        super.onResume();
        DiskViewModel Dl = Dl();
        if (Dl != null && (mutableLiveData = Dl.LJLIL) != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        }
        if (C23930wn.LIZIZ() && !this.LJLJJLL) {
            Hl();
        }
        this.LJLJJLL = false;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData<OSZ<Integer, InterfaceC88472Yns<ARN, C76800UCe>>> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        EE1 initTask;
        MutableLiveData<C94603nU> mutableLiveData3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C23930wn.LIZIZ()) {
            Hl();
            view.findViewById(R.id.g6l).setVisibility(0);
            view.findViewById(R.id.m10).setVisibility(0);
            ((TuxTextView) view.findViewById(R.id.mng)).LJJJ(40.0f);
            DiskViewModel Dl = Dl();
            if (Dl != null && (mutableLiveData3 = Dl.LJLJJI) != null) {
                mutableLiveData3.observe(getViewLifecycleOwner(), new AObserverS65S0200000_1(this, view, 8));
            }
        } else {
            view.findViewById(R.id.g6l).setVisibility(8);
        }
        if (e1.LIZ(31744, "studio_enable_register_av_storage", true, false) && (initTask = AVExternalServiceImpl.LIZ().initService().initTask(1)) != null) {
            initTask.run(requireContext());
        }
        if (a.LJIJJ().LJ(null)) {
            ITpcConsentService LJIJJ = a.LJIJJ();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            LJIJJ.LJIIJ(mo49getActivity, "shortcut");
        }
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.gmb);
        o.LJIIIIZZ(string, "getString(R.string.free_up_space)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS161S0100000_11(this, 60));
        c252709vu.setNavActions(c235119Kp);
        FMX.onEventV3("enter_storage_management");
        Al().LIZ(new C67624QgO(this));
        if (C23880wi.LIZ) {
            Al().LIZ(new C67625QgP(this));
        }
        Al().LIZ(new C67623QgN(this));
        Al().LIZ(new C67627QgR(this));
        DiskViewModel Dl2 = Dl();
        if (Dl2 != null && (mutableLiveData2 = Dl2.LJLILLLLZI) != null) {
            mutableLiveData2.observe(getViewLifecycleOwner(), new AObserverS79S0100000_11(this, 2));
        }
        DiskViewModel Dl3 = Dl();
        if (Dl3 != null && (mutableLiveData = Dl3.LJLJI) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS69S0100000_1(this, 60));
        }
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        Integer LJI = C79045V0n.LJI(R.attr.c9, requireContext);
        o.LJI(LJI);
        int intValue = LJI.intValue();
        C252709vu c252709vu2 = (C252709vu) view.findViewById(R.id.la4);
        c252709vu2.setNavBackground(intValue);
        c252709vu2.LJIILJJIL(false);
        view.setBackgroundColor(intValue);
        view.post(new ARunnableS47S0100000_11(this, 50));
    }
}
