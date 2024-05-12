package com.bytedance.android.live.effect.filter.composerfilter;

import X.ActivityC45651qj;
import X.C0TY;
import X.C10A;
import X.C11040c0;
import X.C141335gf;
import X.C16880lQ;
import X.C1VF;
import X.C1VM;
import X.C29S;
import X.C2AE;
import X.C2FE;
import X.C30686C2o;
import X.C3C5;
import X.C43361n2;
import X.C43371n3;
import X.C51029K0z;
import X.C54841Lfh;
import X.C73943T0h;
import X.C76800UCe;
import X.C88207Yjb;
import X.C90903hW;
import X.InterfaceC17310m7;
import X.InterfaceC30442Bx8;
import X.RunnableC31065CHd;
import X.XKX;
import Y.IDRunnableS29S0200000;
import Y.IDfS124S0200000;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.effect.OnFilterSelectedByClickEvent;
import com.bytedance.android.live.effect.api.OnFilterSelectedEvent;
import com.bytedance.android.live.effect.filter.composerfilter.LiveComposerFilterFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveComposerFilterFragment extends BaseFragment {
    public ComposerFilterViewModel LJLIL;
    public DataChannel LJLILLLLZI;
    public C43371n3 LJLJI;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final List<LiveEffect> LJLJJI = new ArrayList();
    public final String LJLJJL = C0TY.LIZ();
    public Integer LJLJJLL = InterfaceC30442Bx8.LJIJI.LIZJ();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LifecycleCoroutineScope lifecycleScope;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLILLLLZI = C51029K0z.LJIILIIL(this);
        if (mo49getActivity() != null) {
            this.LJLIL = (ComposerFilterViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C1VM(new C1VF(), new C43361n2())).get(ComposerFilterViewModel.class);
        }
        Context context = getContext();
        if (context != null) {
            ComposerFilterViewModel composerFilterViewModel = this.LJLIL;
            if (composerFilterViewModel != null) {
                this.LJLJI = new C43371n3(context, composerFilterViewModel, new InterfaceC17310m7() { // from class: X.1VO
                    @Override // X.InterfaceC17310m7
                    public final void onItemClick(int i) {
                        int i2;
                        LiveComposerFilterFragment liveComposerFilterFragment = LiveComposerFilterFragment.this;
                        DataChannel dataChannel = liveComposerFilterFragment.LJLILLLLZI;
                        if (dataChannel != null) {
                            dataChannel.qv0(OnFilterSelectedEvent.class, ListProtector.get(liveComposerFilterFragment.LJLJJI, i));
                        }
                        DataChannel dataChannel2 = LiveComposerFilterFragment.this.LJLILLLLZI;
                        if (dataChannel2 != null) {
                            dataChannel2.qv0(OnFilterSelectedByClickEvent.class, Boolean.TRUE);
                        }
                        Integer num = LiveComposerFilterFragment.this.LJLJJLL;
                        if (num == null || i != num.intValue()) {
                            Integer currentIndex = LiveComposerFilterFragment.this.LJLJJLL;
                            o.LJIIIIZZ(currentIndex, "currentIndex");
                            if (i < currentIndex.intValue()) {
                                i2 = 1;
                            } else {
                                i2 = 2;
                            }
                            C73943T0h.LIZ().LIZIZ(new C11040c0(i2));
                            LiveComposerFilterFragment.this.LJLJJLL = Integer.valueOf(i);
                        }
                    }
                });
            } else {
                o.LJIJI("viewModel");
                throw null;
            }
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(parentFragment)) != null) {
            XKX.LIZLLL(lifecycleScope, null, null, new C2FE(this, null), 3);
        }
        View findViewById = view.findViewById(R.id.iok);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.rcl_filter)");
        RunnableC31065CHd runnableC31065CHd = (RunnableC31065CHd) findViewById;
        getContext();
        runnableC31065CHd.setLayoutManager(new LinearLayoutManager(0, false));
        C88207Yjb.LIZLLL(runnableC31065CHd);
        runnableC31065CHd.setAdapter(this.LJLJI);
        runnableC31065CHd.post(new IDRunnableS29S0200000(this, runnableC31065CHd, 33));
        C73943T0h.LIZ().LIZLLL(this, C11040c0.class, C54841Lfh.LJLIL).LIZIZ(new IDfS124S0200000(this, runnableC31065CHd, 11));
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2AE(this, null), 3);
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
