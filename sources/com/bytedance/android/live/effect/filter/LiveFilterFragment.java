package com.bytedance.android.live.effect.filter;

import X.ActivityC45651qj;
import X.C10A;
import X.C11040c0;
import X.C141335gf;
import X.C15750jb;
import X.C16880lQ;
import X.C29S;
import X.C32044Chs;
import X.C3C5;
import X.C43191ml;
import X.C51029K0z;
import X.C73943T0h;
import X.C76800UCe;
import X.C88207Yjb;
import X.C90903hW;
import X.InterfaceC15730jZ;
import X.InterfaceC30442Bx8;
import X.RunnableC31065CHd;
import Y.IDRunnableS29S0200000;
import Y.IDfS124S0200000;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.effect.FilterPanelFetchSuccessChannel;
import com.bytedance.android.live.effect.OnFilterSelectedByClickEvent;
import com.bytedance.android.live.effect.api.OnFilterIndexChangeEvent;
import com.bytedance.android.live.effect.api.OnFilterSelectedEvent;
import com.bytedance.android.live.effect.filter.LiveFilterFragment;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveFilterFragment extends BaseFragment {
    public DataChannel LJLILLLLZI;
    public C43191ml LJLJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final List<FilterModel> LJLIL = new ArrayList();
    public Integer LJLJJI = InterfaceC30442Bx8.LJIJI.LIZJ();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Collection collection;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        this.LJLILLLLZI = LJIILIIL;
        List<FilterModel> list = this.LJLIL;
        if (LJIILIIL == null || (collection = (Collection) LJIILIIL.kv0(FilterPanelFetchSuccessChannel.class)) == null) {
            collection = C15750jb.LIZ.LIZ;
            o.LJIIIIZZ(collection, "inst().getAllFilter()");
        }
        ((ArrayList) list).addAll(collection);
        View findViewById = view.findViewById(R.id.iok);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.rcl_filter)");
        RunnableC31065CHd runnableC31065CHd = (RunnableC31065CHd) findViewById;
        getContext();
        runnableC31065CHd.setLayoutManager(new LinearLayoutManager(0, false));
        C43191ml c43191ml = new C43191ml(getContext(), new InterfaceC15730jZ() { // from class: X.1UV
            @Override // X.InterfaceC15730jZ
            public final void onItemClick(int i) {
                int i2;
                LiveFilterFragment liveFilterFragment = LiveFilterFragment.this;
                DataChannel dataChannel = liveFilterFragment.LJLILLLLZI;
                if (dataChannel != null) {
                    dataChannel.qv0(OnFilterSelectedEvent.class, ListProtector.get(liveFilterFragment.LJLIL, i));
                }
                DataChannel dataChannel2 = LiveFilterFragment.this.LJLILLLLZI;
                if (dataChannel2 != null) {
                    dataChannel2.qv0(OnFilterSelectedByClickEvent.class, Boolean.TRUE);
                }
                Integer currentIndex = LiveFilterFragment.this.LJLJJI;
                o.LJIIIIZZ(currentIndex, "currentIndex");
                if (currentIndex.intValue() > i) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                DataChannel dataChannel3 = LiveFilterFragment.this.LJLILLLLZI;
                if (dataChannel3 != null) {
                    dataChannel3.qv0(OnFilterIndexChangeEvent.class, Integer.valueOf(i2));
                }
                LiveFilterFragment.this.LJLJJI = Integer.valueOf(i);
            }
        });
        this.LJLJI = c43191ml;
        c43191ml.LLILIL(this.LJLIL);
        C88207Yjb.LIZLLL(runnableC31065CHd);
        runnableC31065CHd.setAdapter(this.LJLJI);
        runnableC31065CHd.post(new IDRunnableS29S0200000(this, runnableC31065CHd, 31));
        C73943T0h.LIZ().LIZLLL(this, C11040c0.class, C32044Chs.LJLILLLLZI).LIZIZ(new IDfS124S0200000(this, runnableC31065CHd, 10));
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.ov0(this, FilterPanelFetchSuccessChannel.class, new IDqS416S0100000(this, 52));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d3j, viewGroup, false);
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
