package com.bytedance.android.live.effect.karaoke.fragments;

import X.AbstractC029609s;
import X.AbstractC07660Ru;
import X.C05700Kg;
import X.C0A2;
import X.C0K4;
import X.C0NB;
import X.C1L2;
import X.C279917z;
import X.C29306Beo;
import X.C2AF;
import X.C31261Ko;
import X.C5S0;
import X.EnumC07630Rr;
import X.EnumC07640Rs;
import X.RunnableC31065CHd;
import X.XKX;
import Y.IDrS40S0100000;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class KaraokeLibrarySongListFragment extends KaraokeSongListFragment {
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void Il(EnumC07630Rr actionType) {
        o.LJIIIZ(actionType, "actionType");
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public int Hl() {
        KaraokeViewModel karaokeViewModel = this.LJLJJL;
        if (karaokeViewModel != null) {
            if (karaokeViewModel.LJLIL.LJIIIZ == this.LJLJJLL) {
                return R.layout.d_d;
            }
            return R.layout.d_b;
        }
        return R.layout.d_b;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public void vl() {
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2AF(this, null), 3);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public void Kl(AbstractC07660Ru state) {
        o.LJIIIZ(state, "state");
        if ((state instanceof C1L2) && this.LJLJLJ == 1) {
            C1L2 c1l2 = (C1L2) state;
            Al().LJLLLLLL(c1l2.LIZIZ, c1l2.LIZ);
        }
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void Jl(EnumC07640Rs actionType, long j) {
        View view;
        C279917z c279917z;
        View view2;
        KaraokeViewModel karaokeViewModel;
        o.LJIIIZ(actionType, "actionType");
        if (C05700Kg.LIZ[actionType.ordinal()] == 1) {
            Al().LJLLLLLL(100, j);
            Iterator<C279917z> it = Al().getData().iterator();
            while (true) {
                view = null;
                if (it.hasNext()) {
                    c279917z = it.next();
                    if (c279917z.LIZ == j) {
                        break;
                    }
                } else {
                    c279917z = null;
                    break;
                }
            }
            C279917z c279917z2 = c279917z;
            Iterator<C279917z> it2 = Al().getData().iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().LIZ == j) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            C0A2 layoutManager = Dl().getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                view2 = layoutManager.LJJIJIL(i);
            } else {
                view2 = null;
            }
            if ((view2 instanceof ViewGroup) && view2 != null) {
                view = view2.findViewById(R.id.feq);
            }
            if (c279917z2 != null && view != null && (karaokeViewModel = this.LJLJJL) != null) {
                karaokeViewModel.yv0(new C31261Ko(view, c279917z2));
            }
        }
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        boolean z = false;
        if (this.LJLJLJ != 1) {
            C0NB.LIZIZ("KaraokeSongListFragment", "Audience Padding Btn");
            RunnableC31065CHd Dl = Dl();
            Dl.setPadding(0, 0, 0, C5S0.LIZ(92.0f));
            Dl.requestLayout();
        }
        Dl().LJIIJJI(new IDrS40S0100000(this, 1));
        Gl().setErrorClickListener(new C0K4() { // from class: X.1Gu
            @Override // X.C0K4
            public final void LIZIZ() {
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(KaraokeLibrarySongListFragment.this), null, null, new C2AM(KaraokeLibrarySongListFragment.this, null), 3);
            }
        });
        KaraokeViewModel karaokeViewModel = this.LJLJJL;
        if (karaokeViewModel != null) {
            if (karaokeViewModel.LJLIL.LJIIIZ == this.LJLJJLL) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            Al().registerAdapterDataObserver(new AbstractC029609s() { // from class: X.1Gv
                @Override // X.AbstractC029609s
                public final void LJFF(int i, int i2) {
                    KaraokeLibrarySongListFragment.this.Dl().LJLI(0);
                }
            });
        }
    }
}
