package com.ss.android.ugc.aweme.topic.movie.info;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C40342FsQ;
import X.C40343FsR;
import X.C41245GGr;
import X.C5H3;
import X.C76800UCe;
import X.C78496UrM;
import X.C79045V0n;
import X.C90903hW;
import X.C9KF;
import X.GK8;
import X.InterfaceC60761Nsz;
import X.InterfaceC61213O0r;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.topic.common.experiment.TopicInfoPageSettings;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import ql1.IDbS497S0100000_7;

@InterfaceC61213O0r
/* loaded from: classes8.dex */
public final class MovieInfoPage extends DetailBaseFragment {
    public InterfaceC60761Nsz LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLILLLLZI = RouteArgExtension.INSTANCE.requiredArg(this, GK8.LJLIL, "movie_id", String.class);

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String lr() {
        return "movie_info_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLJI;
        if (interfaceC60761Nsz != null) {
            interfaceC60761Nsz.LJI(true);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        fragmentConfiguration(C41245GGr.LJLIL);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        c252709vu.LJIILJJIL(false);
        Context context = c252709vu.getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.c9, context);
        if (LJI != null) {
            c252709vu.setNavBackground(LJI.intValue());
        }
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 330));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string = getString(R.string.i8x);
        o.LJIIIIZZ(string, "getString(R.string.movietok_detailpage_pageheader)");
        LIZLLL.LIZJ = string;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        SparkContext sparkContext = new SparkContext();
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        TopicInfoPageSettings.DiscoveryTopicCdnSettingModel discoveryTopicCdnSettingModel = TopicInfoPageSettings.LIZ;
        TopicInfoPageSettings.DiscoveryTopicCdnSettingModel discoveryTopicCdnSettingModel2 = (TopicInfoPageSettings.DiscoveryTopicCdnSettingModel) LIZLLL2.LJIIIIZZ("discovery_topic_cdn_setting", TopicInfoPageSettings.DiscoveryTopicCdnSettingModel.class, discoveryTopicCdnSettingModel);
        if (discoveryTopicCdnSettingModel2 != null) {
            discoveryTopicCdnSettingModel = discoveryTopicCdnSettingModel2;
        }
        String str = discoveryTopicCdnSettingModel.movieCdnUrl;
        if (str == null) {
            str = "aweme://lynxview/?hide_nav_bar=1&channel=discovery_topic_info&bundle=pages%2Ftopic_info%2Ftemplate.js&dynamic=1&group=discovery_topic_info";
        }
        sparkContext.LJJIJLIJ(str);
        sparkContext.LJJIIZ(this.LJLILLLLZI.getValue(), "topicId");
        sparkContext.LJJIIZ("movie", "topicType");
        sparkContext.LJJI(new IDbS497S0100000_7(this, 1));
        ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.spark_container);
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        c40342FsQ.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ = C40343FsR.LIZ(C40342FsQ.LIZ(requireContext, sparkContext));
        LIZ.LJIIJJI(sparkContext);
        LIZ.LIZIZ();
        viewGroup.addView(LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.csl, viewGroup, false, "inflater.inflate(R.layou…o_page, container, false)");
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
