package com.ss.android.ugc.aweme.relation.recommend;

import X.ActivityC45651qj;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C58041MqD;
import X.C62822Ol8;
import X.C72931Sjn;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.InterfaceC18010nF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class NewVersionRecFriendsFragment extends AmeBaseFragment implements InterfaceC18010nF {
    public static final /* synthetic */ int LJLJL = 0;
    public C58041MqD LJLILLLLZI;
    public boolean LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C72931Sjn.LJLIL);
    public String LJLJI = "";
    public String LJLJJI = "";

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b1724";
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C12460eI.LJIIIIZZ(this, mo49getActivity());
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C58041MqD c58041MqD;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        String str = (String) this.LJLIL.getValue();
        if (str == null || str.length() == 0) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                ((SocialRecFlowModel) ViewModelProviders.of(mo49getActivity).get(SocialRecFlowModel.class)).LJLILLLLZI.postValue(new Bundle());
                return;
            }
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("recommendFriendsConfig");
            if (!(serializable instanceof C58041MqD) || (c58041MqD = (C58041MqD) serializable) == null) {
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 != null) {
                    ((SocialRecFlowModel) ViewModelProviders.of(mo49getActivity2).get(SocialRecFlowModel.class)).LJLILLLLZI.postValue(new Bundle());
                    return;
                }
                return;
            }
            this.LJLILLLLZI = c58041MqD;
            String string = arguments.getString("platforms");
            String str2 = "";
            if (string == null) {
                string = "";
            }
            this.LJLJI = string;
            String string2 = arguments.getString("skip_platforms");
            if (string2 != null) {
                str2 = string2;
            }
            this.LJLJJI = str2;
            this.LJLJJL = arguments.getBoolean("isAfterAuth");
        }
        C8VV.LIZ(this, false, new AqS178S0100000_12(this, 276));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ay3, viewGroup, false);
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
