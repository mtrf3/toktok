package com.bytedance.android.live.effect.karaoke.fragments;

import X.AbstractC07660Ru;
import X.C0K4;
import X.C15380j0;
import X.C16880lQ;
import X.C1LR;
import X.C29306Beo;
import X.C2AI;
import X.C31331Kv;
import X.C31351Kx;
import X.C31371Kz;
import X.C31411Ld;
import X.C40689Fy1;
import X.C76104Tts;
import X.C77800Ug8;
import X.X1D;
import X.XKX;
import Y.IDRunnableS85S0100000;
import Y.IDTListenerS110S0100000;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSearchSongListFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class KaraokeSearchSongListFragment extends KaraokeLibrarySongListFragment {
    public TextView LJLLJ;
    public boolean LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public String LJLLL = "";

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void Ll() {
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void wl() {
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2AI(this, null), 3);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void Kl(AbstractC07660Ru state) {
        String str;
        C76104Tts c76104Tts;
        o.LJIIIZ(state, "state");
        if (state instanceof C1LR) {
            Gl().LIZLLL();
            C1LR c1lr = (C1LR) state;
            Al().LJLZ(c1lr.LIZIZ);
            if (!o.LJ(this.LJLLL, c1lr.LIZ)) {
                Dl().post(new IDRunnableS85S0100000(this, 60));
                this.LJLLL = c1lr.LIZ;
            }
            if (!this.LJLLLL && (c76104Tts = this.LJLL) != null) {
                c76104Tts.LIZJ(false);
            }
            this.LJLLLL = true;
            return;
        }
        if (state instanceof C31371Kz) {
            Gl().LJFF();
            C76104Tts c76104Tts2 = this.LJLL;
            if (c76104Tts2 != null) {
                c76104Tts2.LIZIZ();
            }
            this.LJLLLL = false;
            return;
        }
        if (state instanceof C31411Ld) {
            Gl().LIZJ("EMPTY");
            C31411Ld c31411Ld = (C31411Ld) state;
            if (c31411Ld.LIZ.length() > 10) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C40689Fy1.LLIIII(10, c31411Ld.LIZ));
                LIZ.append("...");
                str = X1D.LIZIZ(LIZ);
            } else {
                str = c31411Ld.LIZ;
            }
            TextView textView = this.LJLLJ;
            if (textView != null) {
                textView.setText(C15380j0.LJIILL(R.string.jw1, str));
                DataChannel dataChannel = this.LJLJLLL;
                if (C29306Beo.LJIIJ(dataChannel)) {
                    C77800Ug8.LJ("livesdk_live_karaoke_search_failed", dataChannel);
                }
                C76104Tts c76104Tts3 = this.LJLL;
                if (c76104Tts3 != null) {
                    c76104Tts3.LIZIZ();
                }
                this.LJLLLL = false;
                return;
            }
            o.LJIJI("hintTextView");
            throw null;
        }
        if (state instanceof C31331Kv) {
            Gl().LJ();
            C76104Tts c76104Tts4 = this.LJLL;
            if (c76104Tts4 != null) {
                c76104Tts4.LIZIZ();
            }
            this.LJLLLL = false;
            return;
        }
        if (state instanceof C31351Kx) {
            Gl().LJI();
            C76104Tts c76104Tts5 = this.LJLL;
            if (c76104Tts5 != null) {
                c76104Tts5.LIZIZ();
            }
            this.LJLLLL = false;
            return;
        }
        super.Kl(state);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View LLLLIILL = C16880lQ.LLLLIILL(getLayoutInflater(), R.layout.d_h, Gl(), false);
        View findViewById = LLLLIILL.findViewById(R.id.cvb);
        o.LJIIIIZZ(findViewById, "errorView.findViewById(R.id.empty_hint_primary)");
        this.LJLLJ = (TextView) findViewById;
        Dl().setItemAnimator(null);
        Gl().setEmptyView(LLLLIILL);
        Gl().setOfflineViewSrc(R.layout.d_i);
        Gl().LJI();
        Gl().setErrorClickListener(new C0K4() { // from class: X.1Gy
            @Override // X.C0K4
            public final void LIZIZ() {
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(KaraokeSearchSongListFragment.this), null, null, new C2AP(KaraokeSearchSongListFragment.this, null), 3);
            }
        });
        C29306Beo.LJJJLL(Gl(), 500L, new IDqS416S0100000(this, 53));
        Dl().setOnTouchListener(new IDTListenerS110S0100000(this, 5));
    }
}
