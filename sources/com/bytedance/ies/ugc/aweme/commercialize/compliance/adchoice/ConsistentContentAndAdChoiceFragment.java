package com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice;

import X.C221108m2;
import X.C223338pd;
import X.C62822Ol8;
import X.C770830u;
import X.EFJ;
import X.GKF;
import X.GKG;
import X.KL2;
import Y.AObserverS74S0100000_6;
import Y.AObserverS75S0100000_7;
import Y.IDdS378S0100000_6;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.IAdChoiceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.JourneyConsistentContentAndAdChoicesStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ConsistentContentAndAdChoiceFragment extends BaseAdChoiceFragment {
    public static final /* synthetic */ int LJLLJ = 0;
    public JourneyConsistentContentAndAdChoicesStruct LJLJJLL;
    public C223338pd LJLJL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(GKG.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 35));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 36));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 37));

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.BaseAdChoiceFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLILLLL;
        Integer valueOf = Integer.valueOf(R.id.j71);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.j71)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.BaseAdChoiceFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.BaseAdChoiceFragment
    public final int vl() {
        return R.layout.ai1;
    }

    public final void Al() {
        if (this.LJLJL == null) {
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            this.LJLJL = new C223338pd(requireContext, null, 6);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.j71);
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.j71).getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            _$_findCachedViewById.setLayoutParams(layoutParams);
            ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.j71);
            C223338pd c223338pd = this.LJLJL;
            if (c223338pd != null) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) KL2.LIZJ(_$_findCachedViewById(R.id.j71).getContext(), 36.0f), (int) KL2.LIZJ(_$_findCachedViewById(R.id.j71).getContext(), 36.0f));
                layoutParams2.gravity = 17;
                viewGroup.addView(c223338pd, layoutParams2);
                C223338pd c223338pd2 = this.LJLJL;
                if (c223338pd2 != null) {
                    c223338pd2.LIZIZ();
                    return;
                } else {
                    o.LJIJI("loadingView");
                    throw null;
                }
            }
            o.LJIJI("loadingView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Al();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.BaseAdChoiceFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        JourneyConsistentContentAndAdChoicesStruct journeyConsistentContentAndAdChoicesStruct;
        GKF LJ;
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            journeyConsistentContentAndAdChoicesStruct = (JourneyConsistentContentAndAdChoicesStruct) arguments.getParcelable("keyAdChoiceData");
        } else {
            journeyConsistentContentAndAdChoicesStruct = null;
        }
        this.LJLJJLL = journeyConsistentContentAndAdChoicesStruct;
        if (journeyConsistentContentAndAdChoicesStruct == null) {
            IConsistentContentAndAdChoiceService wl = wl();
            if (wl != null && (LJ = wl.LJ()) != null) {
                LJ.onComplete();
                return;
            }
            return;
        }
        AdChoiceViewModel xl = xl();
        xl.getClass();
        IAdChoiceApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        ((IAdChoiceApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(IAdChoiceApi.class)).getDeviceUserAge().enqueue(new IDdS378S0100000_6(xl, 8));
        ((Handler) this.LJLJI.getValue()).postDelayed((Runnable) this.LJLLI.getValue(), 3000L);
        xl().LJLILLLLZI.observe(getViewLifecycleOwner(), new AObserverS75S0100000_7(this, 54));
        xl().LJLJI.observe(getViewLifecycleOwner(), new AObserverS74S0100000_6(this, 9));
        xl().LJLJJI.observe(getViewLifecycleOwner(), new AObserverS75S0100000_7(this, 55));
        xl().LJLJJL.observe(getViewLifecycleOwner(), new AObserverS75S0100000_7(this, 56));
    }
}
