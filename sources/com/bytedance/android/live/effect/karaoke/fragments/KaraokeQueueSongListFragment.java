package com.bytedance.android.live.effect.karaoke.fragments;

import X.AbstractC07660Ru;
import X.C0K4;
import X.C1L2;
import X.C26U;
import X.C29306Beo;
import X.C2AG;
import X.C2GE;
import X.QXX;
import X.XKX;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeQueueSongListFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class KaraokeQueueSongListFragment extends KaraokeSongListFragment {
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final C2GE LJLLILLLL = new C26U() { // from class: X.2GE
        @Override // X.C26U
        public final boolean LLLLZIL(C279917z c279917z, C279917z c279917z2) {
            if (c279917z.LIZ == c279917z2.LIZ) {
                return true;
            }
            return false;
        }

        @Override // X.C26U, X.QXX
        public final /* bridge */ /* synthetic */ boolean LJLI(int i, int i2, Object obj, Object obj2) {
            return LJLI((C279917z) obj, (C279917z) obj2, i, i2);
        }

        @Override // X.C26U, X.QXX
        public final /* bridge */ /* synthetic */ boolean LJLIIIL(int i, int i2, Object obj, Object obj2) {
            return LLLLZIL((C279917z) obj, (C279917z) obj2);
        }

        @Override // X.C26U, X.QXX
        public final /* bridge */ /* synthetic */ Object LLIIIL(int i, int i2, Object obj, Object obj2) {
            return LLIIIL((C279917z) obj, (C279917z) obj2, i, i2);
        }

        @Override // X.C26U
        /* renamed from: LLLLZ */
        public final boolean LJLI(C279917z c279917z, C279917z c279917z2, int i, int i2) {
            if (i2 == 0) {
                if (i != 0) {
                    return false;
                }
            } else if (i2 == 1) {
                if (i != 1) {
                    return false;
                }
            } else if (i2 == 2 && i != 2) {
                return false;
            }
            return super.LJLI(c279917z, c279917z2, i, i2);
        }

        @Override // X.C26U
        /* renamed from: LLLLZLLIL */
        public final Object LLIIIL(C279917z c279917z, C279917z c279917z2, int i, int i2) {
            List list;
            Object LLIIIL = super.LLIIIL(c279917z, c279917z2, i, i2);
            if (C65777Prh.LJI(LLIIIL)) {
                list = (List) LLIIIL;
            } else {
                list = null;
            }
            if (i2 == 0) {
                if (i != 0 && list != null) {
                    list.add(EnumC24230xH.PLAY_STATUS);
                }
            } else if (i2 == 1) {
                if (i != 1 && list != null) {
                    list.add(EnumC24230xH.HIDE_PIN);
                }
            } else if (i2 == 2 && i != 2 && list != null) {
                list.add(EnumC24230xH.SHOW_PIN);
            }
            return list;
        }
    };

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void Ll() {
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final int Hl() {
        if (C29306Beo.LJIIJ(this.LJLJLLL)) {
            return R.layout.d_7;
        }
        return R.layout.d_6;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void vl() {
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2AG(this, null), 3);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final QXX xl() {
        return this.LJLLILLLL;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void Kl(AbstractC07660Ru state) {
        o.LJIIIZ(state, "state");
        if (state instanceof C1L2) {
            C1L2 c1l2 = (C1L2) state;
            Al().LJLLLLLL(c1l2.LIZIZ, c1l2.LIZ);
        }
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Gl().setErrorClickListener(new C0K4() { // from class: X.1Gw
            @Override // X.C0K4
            public final void LIZIZ() {
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(KaraokeQueueSongListFragment.this), null, null, new C2AN(KaraokeQueueSongListFragment.this, null), 3);
            }
        });
    }
}
