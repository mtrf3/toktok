package com.ss.android.ugc.aweme.account.login.v2.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.G3P;
import X.G3Q;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AccountPrivateAccountTipsFragment extends BaseAccountFlowFragment {
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // X.InterfaceC69056R8i
    public final void ee(int i) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        G3P.LIZIZ.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        G3P.LIZIZ.onResume();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        G3P.LIZIZ.onStop();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        G3P.LIZIZ.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        G3P.LIZIZ.LIZIZ(view, new G3Q(this));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LIZ = G3P.LIZIZ.LIZ(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(LIZ instanceof View)) {
            LIZ = null;
        }
        if (LIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZ, this);
                C10A.LIZIZ(LIZ, this);
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
        return LIZ;
    }
}