package com.bytedance.android.live.effect.karaoke.fragments;

import X.C0K4;
import X.C29306Beo;
import X.C2AH;
import X.XKX;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeRequestSongListFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class KaraokeRequestSongListFragment extends KaraokeLibrarySongListFragment {
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void Ll() {
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final int Hl() {
        if (C29306Beo.LJIIJ(this.LJLJLLL)) {
            return R.layout.d_9;
        }
        return R.layout.d_8;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void vl() {
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2AH(this, null), 3);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Gl().setErrorClickListener(new C0K4() { // from class: X.1Gx
            @Override // X.C0K4
            public final void LIZIZ() {
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(KaraokeRequestSongListFragment.this), null, null, new C2AO(KaraokeRequestSongListFragment.this, null), 3);
            }
        });
    }
}
