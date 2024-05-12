package com.bytedance.android.live.effect.smallitem;

import X.ActivityC45651qj;
import X.C0LK;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C30686C2o;
import X.C37301dG;
import X.C3C5;
import X.C44151oJ;
import X.C44171oL;
import X.C51029K0z;
import X.C55652Gj;
import X.C76800UCe;
import X.C88207Yjb;
import X.C90903hW;
import X.InterfaceC261110t;
import X.InterfaceC31981Ni;
import X.RunnableC31065CHd;
import X.XKX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.ForceRefreshSmallItemBeautyListPanel;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveSmallItemBeautyFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJLJ = 0;
    public String LJLIL;
    public LiveSmallItemBeautyViewModel LJLJJI;
    public InterfaceC31981Ni LJLJJL;
    public String LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C44151oJ LJLILLLLZI = new C44151oJ();
    public final Set<String> LJLJI = new LinkedHashSet();

    static {
        new C0LK();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJL;
        Integer valueOf = Integer.valueOf(R.id.k5o);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.k5o)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments == null || (str = arguments.getString("live_effect_panel_name")) == null) {
            str = "";
        }
        this.LJLIL = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.getString("live_effect_panel_key");
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("live_effect_panel_name_enum");
        }
        this.LJLJJLL = str2;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C44151oJ c44151oJ = this.LJLILLLLZI;
        c44151oJ.LJLJJLL = this.LJLJJL;
        c44151oJ.LJLJL = this.LJLJJLL;
        if (mo49getActivity() != null) {
            this.LJLJJI = (LiveSmallItemBeautyViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C37301dG(new C44171oL(0))).get(LiveSmallItemBeautyViewModel.class);
        }
        C44151oJ c44151oJ2 = this.LJLILLLLZI;
        InterfaceC261110t interfaceC261110t = new InterfaceC261110t() { // from class: X.1dC
            @Override // X.InterfaceC261110t
            public final void LIZ(LiveEffect liveEffect, int i) {
                o.LJIIIZ(liveEffect, "liveEffect");
                InterfaceC30442Bx8.LJJIIJZLJL.LIZ(Boolean.valueOf(C78880UxY.LJJL(liveEffect)));
                C0TX.LIZ.LIZJ("LiveSmallItemBeautyFragment");
                C0TX.LIZLLL = "onChange";
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("index: ");
                LIZ.append(i);
                LIZ.append(' ');
                LIZ.append(liveEffect);
                C0TX.LIZIZ(X1D.LIZIZ(LIZ));
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(LiveSmallItemBeautyFragment.this);
                if (LJIILIIL != null) {
                    LJIILIIL.qv0(OnLiveEffectSelectedEvent.class, liveEffect);
                }
            }
        };
        c44151oJ2.getClass();
        c44151oJ2.LJLJJI = interfaceC261110t;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.k5o);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        ((RecyclerView) _$_findCachedViewById(R.id.k5o)).setAdapter(this.LJLILLLLZI);
        ((RecyclerView) _$_findCachedViewById(R.id.k5o)).setItemAnimator(null);
        RunnableC31065CHd small_item_beauty_recycle_view = (RunnableC31065CHd) _$_findCachedViewById(R.id.k5o);
        o.LJIIIIZZ(small_item_beauty_recycle_view, "small_item_beauty_recycle_view");
        C88207Yjb.LIZJ(small_item_beauty_recycle_view);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C55652Gj(this, null), 3);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.lv0(this, ForceRefreshSmallItemBeautyListPanel.class, new IDqS416S0100000(this, 339));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d2i, viewGroup, false);
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
