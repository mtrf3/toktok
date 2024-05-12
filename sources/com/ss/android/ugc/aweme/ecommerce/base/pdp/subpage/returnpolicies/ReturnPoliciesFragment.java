package com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C26867AgZ;
import X.C27531ArH;
import X.C29S;
import X.C3C5;
import X.C51029K0z;
import X.C70917RsP;
import X.C70921RsT;
import X.C76800UCe;
import X.C78946Uyc;
import X.C84654XKg;
import X.C90903hW;
import X.OSZ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BottomTip;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ReturnPoliciesFragment extends ECBaseFragment {
    public static C84654XKg LJLJJLL;
    public static String LJLJL;
    public int LJLIL;
    public IReturnPoliciesItemViewStyle LJLJI;
    public IPdpStarter.PdpEnterParam LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final List<String> LJLILLLLZI = new ArrayList();

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
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

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        return "return_policy";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C84654XKg c84654XKg = LJLJJLL;
        if (c84654XKg != null) {
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            c84654XKg.resumeWith(c76800UCe);
        }
        LJLJJLL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        super.onStop();
        if (LJLJL == null) {
            if (ActivityStack.isAppBackGround()) {
                str = "close";
            } else {
                str = "return";
            }
            LJLJL = str;
        }
        C78946Uyc.LJJII(this, new C70921RsT(), new AqS170S0100000_4(this, 307));
    }

    public final void vl(BottomTip bottomTip) {
        HashMap<String, Object> trackParams;
        C78946Uyc.LJJII(this, new C70917RsP(), new AqS170S0100000_4(bottomTip, 308));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LJLJJI;
        if (pdpEnterParam != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
            linkedHashMap.putAll(trackParams);
        }
        linkedHashMap.put("previous_page", "return_policy");
        linkedHashMap.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
        String str = bottomTip.link;
        if (str != null) {
            SmartRouter.buildRoute(getContext(), C26867AgZ.LIZ(str, C51029K0z.LJJIIZI(new OSZ("track_params", linkedHashMap)))).open();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x03f5, code lost:
    
        if (r12 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02d1, code lost:
    
        if (r11 != null) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020f  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.ReturnPoliciesFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        C29S c29s = null;
        if (context != null) {
            view = C27531ArH.LIZ(R.layout.a28, context, viewGroup, false);
        } else {
            view = null;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
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
        return view;
    }
}
