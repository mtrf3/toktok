package com.ss.android.ugc.aweme.vision.loading;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17P;
import X.C29701Eo;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC81599W0t;
import X.KHS;
import X.KHV;
import Y.ACListenerS28S0100000_8;
import Y.AObserverS76S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.vision.PhotoSearchViewModel;
import com.ss.android.ugc.aweme.vision.repo.PhotoSearchResponse;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchLoadingFragment extends AmeBaseFragment {
    public C29701Eo LJLIL;
    public TextView LJLILLLLZI;
    public PhotoSearchViewModel LJLJI;
    public AObserverS76S0100000_8 LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        PhotoSearchViewModel photoSearchViewModel;
        MutableLiveData<InterfaceC81599W0t> mutableLiveData;
        super.onDestroy();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (photoSearchViewModel = this.LJLJI) != null && (mutableLiveData = photoSearchViewModel.LJLJI) != null) {
            mutableLiveData.removeObservers(mo49getActivity);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData<KHV<PhotoSearchResponse>> mutableLiveData;
        MutableLiveData<InterfaceC81599W0t> mutableLiveData2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C29701Eo c29701Eo = (C29701Eo) view.findViewById(R.id.ga5);
        this.LJLIL = c29701Eo;
        if (c29701Eo != null) {
            c29701Eo.setRepeatCount(-1);
        }
        C29701Eo c29701Eo2 = this.LJLIL;
        if (c29701Eo2 != null) {
            c29701Eo2.setRepeatMode(2);
        }
        C29701Eo c29701Eo3 = this.LJLIL;
        if (c29701Eo3 != null) {
            c29701Eo3.setVisibility(0);
        }
        C29701Eo c29701Eo4 = this.LJLIL;
        if (c29701Eo4 != null) {
            c29701Eo4.playAnimation();
        }
        TextView textView = (TextView) view.findViewById(R.id.m1g);
        this.LJLILLLLZI = textView;
        if (textView != null) {
            C16880lQ.LJIJI(textView, new ACListenerS28S0100000_8(this, 104));
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            PhotoSearchViewModel LIZ = KHS.LIZ(mo49getActivity);
            this.LJLJI = LIZ;
            if (LIZ != null && (mutableLiveData2 = LIZ.LJLJI) != null) {
                C17P.LIZIZ(mutableLiveData2, mo49getActivity, new AObserverS76S0100000_8(this, 141));
            }
        }
        AObserverS76S0100000_8 aObserverS76S0100000_8 = new AObserverS76S0100000_8(this, 142);
        this.LJLJJI = aObserverS76S0100000_8;
        PhotoSearchViewModel photoSearchViewModel = this.LJLJI;
        if (photoSearchViewModel != null && (mutableLiveData = photoSearchViewModel.LJLIL) != null) {
            C17P.LIZIZ(mutableLiveData, this, aObserverS76S0100000_8);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cfv, viewGroup, false);
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
