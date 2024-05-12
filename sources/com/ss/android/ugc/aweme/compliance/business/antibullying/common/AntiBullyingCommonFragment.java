package com.ss.android.ugc.aweme.compliance.business.antibullying.common;

import X.AI8;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C5H3;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.GIJ;
import X.GIK;
import X.GIM;
import X.InterfaceC61213O0r;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.compliance.business.antibullying.base.BaseAntiBullyingFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes8.dex */
public final class AntiBullyingCommonFragment extends BaseAntiBullyingFragment {
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C5H3 LJLILLLLZI = RouteArgExtension.INSTANCE.optionalArg(this, GIM.LJLIL, "enter_from", String.class);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 75));
    public final GIK LJLJJI = new GIK(this);

    @Override // com.ss.android.ugc.aweme.compliance.business.antibullying.base.BaseAntiBullyingFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.antibullying.base.BaseAntiBullyingFragment, com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.ss.android.ugc.aweme.compliance.business.antibullying.base.BaseAntiBullyingFragment
    public final String getEnterFrom() {
        return (String) this.LJLILLLLZI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.antibullying.base.BaseAntiBullyingFragment
    public final AntiBullyingCommonViewModel xl() {
        return (AntiBullyingCommonViewModel) this.LJLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.antibullying.base.BaseAntiBullyingFragment
    public final GIJ wl() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.antibullying.base.BaseAntiBullyingFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        AI8 switch_care_mode = (AI8) _$_findCachedViewById(R.id.kxa);
        o.LJIIIIZZ(switch_care_mode, "switch_care_mode");
        vl(switch_care_mode, xl().LJLIL, "comment_care_mode_click");
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.antibullying.base.BaseAntiBullyingFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        C16880lQ.LLLLIILL(inflater, R.layout.agq, (ViewGroup) onCreateView.findViewById(R.id.a6k), true);
        C16880lQ.LLLLIILL(inflater, R.layout.agp, (ViewGroup) onCreateView.findViewById(R.id.kxa).findViewById(R.id.b86), true);
        try {
            ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(onCreateView, this);
            C10A.LIZIZ(onCreateView, this);
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
        return onCreateView;
    }
}
