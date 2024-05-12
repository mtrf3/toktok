package com.bytedance.android.live.effect.music;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C14320hI;
import X.C14410hR;
import X.C15380j0;
import X.C16880lQ;
import X.C29306Beo;
import X.C29S;
import X.C33481Tc;
import X.C33491Td;
import X.C33591Tn;
import X.C3C5;
import X.C47121t6;
import X.C54032Ad;
import X.C54042Ae;
import X.C55172En;
import X.C76104Tts;
import X.C76800UCe;
import X.C90903hW;
import X.EnumC31066CHe;
import X.RunnableC31065CHd;
import X.XKX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.ui.EnforceDarkModeFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class BGMListFragment extends EnforceDarkModeFragment {
    public static final /* synthetic */ int LJLLLL = 0;
    public DataChannel LJLILLLLZI;
    public BGMSongListViewModel LJLJI;
    public BGMPlaylistViewModel LJLJJI;
    public long LJLJJLL;
    public C33491Td LJLJL;
    public C76104Tts LJLJLLL;
    public View LJLL;
    public C47121t6 LJLLI;
    public RunnableC31065CHd LJLLILLLL;
    public View LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public String LJLJJL = "";
    public int LJLJLJ = -1;

    @Override // com.bytedance.android.livesdk.ui.EnforceDarkModeFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.EnforceDarkModeFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        super.onResume();
        C76104Tts c76104Tts = null;
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C54032Ad(this, null), 3);
        if (this.LJLJJLL == -1 && this.LJLJLJ == 0) {
            C29306Beo.LJI(this.LJLL);
            C29306Beo.LJI(this.LJLLILLLL);
            C29306Beo.LJJLJLI(this.LJLLJ);
        } else {
            C29306Beo.LJJLJLI(this.LJLL);
            C29306Beo.LJJLJLI(this.LJLLILLLL);
            C29306Beo.LJI(this.LJLLJ);
        }
        if (this.LJLJJLL == -1 && (i = this.LJLJLJ) != -1) {
            vl(i);
        }
        if (this.LJLJLLL == null) {
            RunnableC31065CHd runnableC31065CHd = this.LJLLILLLL;
            if (runnableC31065CHd != null) {
                c76104Tts = new C76104Tts(1, runnableC31065CHd, new IDqS443S0100000(this, 6));
            }
            this.LJLJLLL = c76104Tts;
        }
        C76104Tts c76104Tts2 = this.LJLJLLL;
        if (c76104Tts2 != null) {
            c76104Tts2.LIZJ(true);
        }
        C33491Td c33491Td = this.LJLJL;
        if (c33491Td != null) {
            c33491Td.notifyDataSetChanged();
        }
    }

    public final void vl(int i) {
        C47121t6 c47121t6 = this.LJLLI;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILL(R.string.ou5, Integer.valueOf(i)));
        }
        if (this.LJLJJLL == -1) {
            this.LJLJLJ = i;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C33491Td c33491Td;
        Boolean bool;
        RecyclerView.RecycledViewPool LJLJL;
        BGMSongListViewModel bGMSongListViewModel;
        Map<Long, Integer> map;
        Integer num;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLL = view.findViewById(R.id.hrh);
        this.LJLLI = (C47121t6) view.findViewById(R.id.hrj);
        this.LJLLILLLL = (RunnableC31065CHd) view.findViewById(R.id.isn);
        this.LJLLJ = view.findViewById(R.id.k6v);
        RunnableC31065CHd runnableC31065CHd = this.LJLLILLLL;
        if (runnableC31065CHd != null) {
            runnableC31065CHd.setItemAnimator(null);
        }
        RunnableC31065CHd runnableC31065CHd2 = this.LJLLILLLL;
        if (runnableC31065CHd2 != null) {
            runnableC31065CHd2.setHasFixedSize(true);
        }
        C47121t6 c47121t6 = this.LJLLI;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILL(R.string.ou5, 20));
        }
        RunnableC31065CHd runnableC31065CHd3 = this.LJLLILLLL;
        if (runnableC31065CHd3 != null) {
            c33491Td = new C33491Td(this.LJLJI, this.LJLJJI, runnableC31065CHd3, this.LJLILLLLZI, this, this.LJLJJL, this.LJLJJLL);
        } else {
            c33491Td = null;
        }
        this.LJLJL = c33491Td;
        RunnableC31065CHd runnableC31065CHd4 = this.LJLLILLLL;
        if (runnableC31065CHd4 != null) {
            runnableC31065CHd4.setAdapter(c33491Td);
        }
        BGMSongListViewModel bGMSongListViewModel2 = this.LJLJI;
        if (bGMSongListViewModel2 != null) {
            bool = Boolean.valueOf(bGMSongListViewModel2.LJLLJ);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && (bGMSongListViewModel = this.LJLJI) != null && (map = bGMSongListViewModel.LJLLI) != null && (num = (Integer) ((HashMap) map).get(Long.valueOf(this.LJLJJLL))) != null) {
            int intValue = num.intValue();
            RunnableC31065CHd runnableC31065CHd5 = this.LJLLILLLL;
            if (runnableC31065CHd5 != null) {
                runnableC31065CHd5.LJLI(intValue);
            }
        }
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C55172En(this, null), 3);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C54042Ae(this, null), 3);
        View view2 = this.LJLL;
        if (view2 != null) {
            C29306Beo.LJJJLL(view2, 500L, new IDqS416S0100000(this, 69));
        }
        RunnableC31065CHd runnableC31065CHd6 = this.LJLLILLLL;
        if (runnableC31065CHd6 != null && (LJLJL = runnableC31065CHd6.LJLJL(EnumC31066CHe.BGM, true)) != null) {
            LJLJL.setMaxRecycledViews(0, 5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        long j;
        BGMSongListViewModel bGMSongListViewModel;
        BGMPlaylistViewModel bGMPlaylistViewModel;
        o.LJIIIZ(inflater, "inflater");
        Bundle arguments = getArguments();
        C29S c29s = null;
        if (arguments != null) {
            str = arguments.getString("name");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.LJLJJL = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            j = arguments2.getLong("albumId");
        } else {
            j = 0;
        }
        this.LJLJJLL = j;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            bGMSongListViewModel = (BGMSongListViewModel) ViewModelProviders.of(mo49getActivity, new C33591Tn(new C14410hR(), this.LJLILLLLZI)).get(BGMSongListViewModel.class);
        } else {
            bGMSongListViewModel = null;
        }
        this.LJLJI = bGMSongListViewModel;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            bGMPlaylistViewModel = (BGMPlaylistViewModel) ViewModelProviders.of(mo49getActivity2, new C33481Tc(new C14320hI(), this.LJLILLLLZI)).get(BGMPlaylistViewModel.class);
        } else {
            bGMPlaylistViewModel = null;
        }
        this.LJLJJI = bGMPlaylistViewModel;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cuo, viewGroup, false);
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity3 = mo49getActivity();
                if (mo49getActivity3 instanceof C29S) {
                    c29s = (C29S) mo49getActivity3;
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
