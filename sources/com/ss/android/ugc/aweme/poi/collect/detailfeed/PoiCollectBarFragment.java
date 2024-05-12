package com.ss.android.ugc.aweme.poi.collect.detailfeed;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C190327dU;
import X.C190817eH;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiCollectBarFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJLJ = 0;
    public String LJLIL;
    public boolean LJLJI;
    public String LJLJJI;
    public C190817eH LJLJJL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public String LJLILLLLZI = "";
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C190327dU.LJLIL);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            String string = bundle.getString("poi_id");
            if (string != null) {
                this.LJLIL = string;
            }
            String string2 = bundle.getString("poi_name");
            if (string2 != null) {
                this.LJLILLLLZI = string2;
            }
            this.LJLJI = bundle.getBoolean("is_collected");
            String string3 = bundle.getString("poi_address");
            if (string3 != null) {
                this.LJLJJI = string3;
            }
            Serializable serializable = bundle.getSerializable("poi_collect_mo_data");
            if (serializable != null) {
                this.LJLJJL = (C190817eH) serializable;
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("poi_id", this.LJLIL);
        outState.putString("poi_name", this.LJLILLLLZI);
        outState.putBoolean("is_collected", this.LJLJI);
        outState.putString("poi_address", this.LJLJJI);
        outState.putSerializable("poi_collect_mo_data", this.LJLJJL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 373));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        C29S c29s = null;
        if (context != null) {
            frameLayout = new FrameLayout(context);
            frameLayout.setId(((Number) this.LJLJJLL.getValue()).intValue());
        } else {
            frameLayout = null;
        }
        if (!(frameLayout instanceof View)) {
            frameLayout = null;
        }
        if (frameLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(frameLayout, this);
                C10A.LIZIZ(frameLayout, this);
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
        return frameLayout;
    }
}
