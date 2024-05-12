package com.ss.android.ugc.aweme.compliance.privacy.sdk.ui;

import X.ActivityC45651qj;
import X.C188727au;
import X.C56642Ke;
import X.C5H3;
import X.C71909SKb;
import X.C71935SLb;
import X.C71936SLc;
import X.C72041SPd;
import X.C72043SPf;
import X.C72045SPh;
import X.C73969T1h;
import X.FMX;
import X.InterfaceC61213O0r;
import X.QD3;
import X.SKL;
import X.SL0;
import X.SLF;
import X.SLJ;
import X.SNL;
import X.T16;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

@InterfaceC61213O0r
/* loaded from: classes13.dex */
public final class BasePrivacySettingFragmentMain extends BasePrivacySettingFragment {
    public final C5H3 LJLJLJ;
    public final String LJLJLLL;
    public long LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragment, X.SKJ
    public final void Ra() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragment, com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragment
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

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragment, com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke event) {
        o.LJIIIZ(event, "event");
    }

    public BasePrivacySettingFragmentMain() {
        C5H3 optionalArg = RouteArgExtension.INSTANCE.optionalArg(this, C71936SLc.LJLIL, "enter_method", String.class);
        this.LJLJLJ = optionalArg;
        String str = (String) optionalArg.getValue();
        this.LJLJLLL = str == null ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment
    public final void finish() {
        super.finish();
        long currentTimeMillis = System.currentTimeMillis() - this.LJLL;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "privacy_and_safety_settings");
        c188727au.LJ(currentTimeMillis, "duration");
        FMX.LJIIL("stay_time", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragment
    public final List<SLJ> vl() {
        SKL skl;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            skl = new SKL(mo49getActivity);
        } else {
            skl = new SKL(this);
        }
        Object value = SNL.LIZLLL.getValue();
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 == null) {
            mo49getActivity2 = this;
        }
        TPSCPageBuildConfigs tPSCPageBuildConfigs = (TPSCPageBuildConfigs) this.LJLILLLLZI.getValue();
        value.getClass();
        List<SLJ> LIZIZ = C71909SKb.LIZIZ(requireContext, mo49getActivity2, this, tPSCPageBuildConfigs, skl);
        this.LJLJJLL = LIZIZ;
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragment, com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.LIZJ().LJIILJJIL(this);
        SLF.LIZ().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(SL0.LJLIL, C71935SLb.LJLIL);
        SNL.LIZIZ().getClass();
        C72045SPh.LIZ(true);
        SNL.LIZIZ().getClass();
        C72043SPf.LIZ();
        SNL.LIZIZ().getClass();
        C72041SPd.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BasePrivacySettingFragment, com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLL = System.currentTimeMillis();
    }
}
