package com.bytedance.android.live.effect.smallitem;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1UY;
import X.C29S;
import X.C30686C2o;
import X.C37301dG;
import X.C3C5;
import X.C44171oL;
import X.C44191oN;
import X.C55712Gp;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC261310v;
import X.InterfaceC31981Ni;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.XKX;
import Y.IDCListenerS135S0100000;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.live.effect.smallitem.LiveSmallSubItemBeautyFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveSmallSubItemBeautyFragment extends BaseFragment {
    public static final /* synthetic */ int LJLLI = 0;
    public InterfaceC65784Pro<C76800UCe> LJLJJL;
    public InterfaceC88472Yns<? super LiveEffect, C76800UCe> LJLJJLL;
    public LiveSmallItemBeautyViewModel LJLJL;
    public InterfaceC31981Ni LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C44191oN LJLIL = new C44191oN();
    public String LJLILLLLZI = "";
    public String LJLJI = "";
    public String LJLJJI = "";
    public String LJLJLJ = "";

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str3 = null;
        if (arguments != null) {
            str3 = arguments.getString("live_effect_panel_info");
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        this.LJLILLLLZI = str3;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("live_effect_panel_name")) == null) {
            str = "";
        }
        this.LJLJJI = str;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            arguments3.getString("live_effect_panel_key");
        }
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str2 = arguments4.getString("parent_effect_name")) == null) {
            str2 = "";
        }
        this.LJLJI = str2;
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string = arguments5.getString("live_effect_panel_name_enum")) != null) {
            str4 = string;
        }
        this.LJLJLJ = str4;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (mo49getActivity() != null) {
            this.LJLJL = (LiveSmallItemBeautyViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C37301dG(new C44171oL(0))).get(LiveSmallItemBeautyViewModel.class);
        }
        C44191oN c44191oN = this.LJLIL;
        InterfaceC261310v interfaceC261310v = new InterfaceC261310v() { // from class: X.1dJ
            @Override // X.InterfaceC261310v
            public final void LIZ(LiveEffect liveEffect) {
                o.LJIIIZ(liveEffect, "liveEffect");
                C0TX.LIZ.LIZJ("LiveSmallSubItemBeautyFragment");
                C0TX.LIZIZ(String.valueOf(liveEffect));
                LiveSmallSubItemBeautyFragment.this.getClass();
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(LiveSmallSubItemBeautyFragment.this);
                if (LJIILIIL != null) {
                    LJIILIIL.qv0(OnLiveEffectSelectedEvent.class, liveEffect);
                }
            }
        };
        c44191oN.getClass();
        c44191oN.LJLJI = interfaceC261310v;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.k5o);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        ((RecyclerView) _$_findCachedViewById(R.id.k5o)).setAdapter(this.LJLIL);
        ((RecyclerView) _$_findCachedViewById(R.id.k5o)).LJII(new C1UY(), -1);
        ((RecyclerView) _$_findCachedViewById(R.id.k5o)).setItemAnimator(null);
        ((TextView) _$_findCachedViewById(R.id.hib)).setText(this.LJLJI);
        C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.aej), new IDCListenerS135S0100000(this, 85));
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C55712Gp(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d2j, viewGroup, false);
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
